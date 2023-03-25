/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class TarArchiveInputStream
extends ArchiveInputStream {
    private static final int SMALL_BUFFER_SIZE = 256;
    private final byte[] SMALL_BUF = new byte[256];
    private final int recordSize;
    private final int blockSize;
    private boolean hasHitEOF;
    private long entrySize;
    private long entryOffset;
    private final InputStream is;
    private TarArchiveEntry currEntry;
    private final ZipEncoding encoding;

    public TarArchiveInputStream(InputStream is) {
        this(is, 10240, 512);
    }

    public TarArchiveInputStream(InputStream is, String encoding) {
        this(is, 10240, 512, encoding);
    }

    public TarArchiveInputStream(InputStream is, int blockSize) {
        this(is, blockSize, 512);
    }

    public TarArchiveInputStream(InputStream is, int blockSize, String encoding) {
        this(is, blockSize, 512, encoding);
    }

    public TarArchiveInputStream(InputStream is, int blockSize, int recordSize) {
        this(is, blockSize, recordSize, null);
    }

    public TarArchiveInputStream(InputStream is, int blockSize, int recordSize, String encoding) {
        this.is = is;
        this.hasHitEOF = false;
        this.encoding = ZipEncodingHelper.getZipEncoding(encoding);
        this.recordSize = recordSize;
        this.blockSize = blockSize;
    }

    @Override
    public void close() throws IOException {
        this.is.close();
    }

    public int getRecordSize() {
        return this.recordSize;
    }

    @Override
    public int available() throws IOException {
        if (this.entrySize - this.entryOffset > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.entrySize - this.entryOffset);
    }

    @Override
    public long skip(long n) throws IOException {
        if (n <= 0L) {
            return 0L;
        }
        long available = this.entrySize - this.entryOffset;
        long skipped = this.is.skip(Math.min(n, available));
        this.count(skipped);
        this.entryOffset += skipped;
        return skipped;
    }

    @Override
    public synchronized void reset() {
    }

    public TarArchiveEntry getNextTarEntry() throws IOException {
        byte[] headerBuf;
        if (this.hasHitEOF) {
            return null;
        }
        if (this.currEntry != null) {
            IOUtils.skip(this, Long.MAX_VALUE);
            this.skipRecordPadding();
        }
        if ((headerBuf = this.getRecord()) == null) {
            this.currEntry = null;
            return null;
        }
        try {
            this.currEntry = new TarArchiveEntry(headerBuf, this.encoding);
        }
        catch (IllegalArgumentException e) {
            IOException ioe = new IOException("Error detected parsing the header");
            ioe.initCause(e);
            throw ioe;
        }
        this.entryOffset = 0L;
        this.entrySize = this.currEntry.getSize();
        if (this.currEntry.isGNULongLinkEntry()) {
            byte[] longLinkData = this.getLongNameData();
            if (longLinkData == null) {
                return null;
            }
            this.currEntry.setLinkName(this.encoding.decode(longLinkData));
        }
        if (this.currEntry.isGNULongNameEntry()) {
            byte[] longNameData = this.getLongNameData();
            if (longNameData == null) {
                return null;
            }
            this.currEntry.setName(this.encoding.decode(longNameData));
        }
        if (this.currEntry.isPaxHeader()) {
            this.paxHeaders();
        }
        if (this.currEntry.isGNUSparse()) {
            this.readGNUSparse();
        }
        this.entrySize = this.currEntry.getSize();
        return this.currEntry;
    }

    private void skipRecordPadding() throws IOException {
        if (this.entrySize > 0L && this.entrySize % (long)this.recordSize != 0L) {
            long numRecords = this.entrySize / (long)this.recordSize + 1L;
            long padding = numRecords * (long)this.recordSize - this.entrySize;
            long skipped = IOUtils.skip(this.is, padding);
            this.count(skipped);
        }
    }

    protected byte[] getLongNameData() throws IOException {
        ByteArrayOutputStream longName = new ByteArrayOutputStream();
        int length = 0;
        while ((length = this.read(this.SMALL_BUF)) >= 0) {
            longName.write(this.SMALL_BUF, 0, length);
        }
        this.getNextEntry();
        if (this.currEntry == null) {
            return null;
        }
        byte[] longNameData = longName.toByteArray();
        for (length = longNameData.length; length > 0 && longNameData[length - 1] == 0; --length) {
        }
        if (length != longNameData.length) {
            byte[] l = new byte[length];
            System.arraycopy(longNameData, 0, l, 0, length);
            longNameData = l;
        }
        return longNameData;
    }

    private byte[] getRecord() throws IOException {
        byte[] headerBuf = this.readRecord();
        this.hasHitEOF = this.isEOFRecord(headerBuf);
        if (this.hasHitEOF && headerBuf != null) {
            this.tryToConsumeSecondEOFRecord();
            this.consumeRemainderOfLastBlock();
            headerBuf = null;
        }
        return headerBuf;
    }

    protected boolean isEOFRecord(byte[] record) {
        return record == null || ArchiveUtils.isArrayZero(record, this.recordSize);
    }

    protected byte[] readRecord() throws IOException {
        byte[] record = new byte[this.recordSize];
        int readNow = IOUtils.readFully(this.is, record);
        this.count(readNow);
        if (readNow != this.recordSize) {
            return null;
        }
        return record;
    }

    private void paxHeaders() throws IOException {
        Map<String, String> headers = this.parsePaxHeaders(this);
        this.getNextEntry();
        this.applyPaxHeadersToCurrentEntry(headers);
    }

    Map<String, String> parsePaxHeaders(InputStream i) throws IOException {
        int ch;
        HashMap<String, String> headers = new HashMap<String, String>();
        block0: do {
            int len = 0;
            int read = 0;
            while ((ch = i.read()) != -1) {
                ++read;
                if (ch == 32) {
                    ByteArrayOutputStream coll = new ByteArrayOutputStream();
                    while ((ch = i.read()) != -1) {
                        ++read;
                        if (ch == 61) {
                            String keyword = coll.toString("UTF-8");
                            byte[] rest = new byte[len - read];
                            int got = IOUtils.readFully(i, rest);
                            if (got != len - read) {
                                throw new IOException("Failed to read Paxheader. Expected " + (len - read) + " bytes, read " + got);
                            }
                            String value = new String(rest, 0, len - read - 1, "UTF-8");
                            headers.put(keyword, value);
                            continue block0;
                        }
                        coll.write((byte)ch);
                    }
                    continue block0;
                }
                len *= 10;
                len += ch - 48;
            }
        } while (ch != -1);
        return headers;
    }

    private void applyPaxHeadersToCurrentEntry(Map<String, String> headers) {
        for (Map.Entry<String, String> ent : headers.entrySet()) {
            String key = ent.getKey();
            String val = ent.getValue();
            if ("path".equals(key)) {
                this.currEntry.setName(val);
                continue;
            }
            if ("linkpath".equals(key)) {
                this.currEntry.setLinkName(val);
                continue;
            }
            if ("gid".equals(key)) {
                this.currEntry.setGroupId(Integer.parseInt(val));
                continue;
            }
            if ("gname".equals(key)) {
                this.currEntry.setGroupName(val);
                continue;
            }
            if ("uid".equals(key)) {
                this.currEntry.setUserId(Integer.parseInt(val));
                continue;
            }
            if ("uname".equals(key)) {
                this.currEntry.setUserName(val);
                continue;
            }
            if ("size".equals(key)) {
                this.currEntry.setSize(Long.parseLong(val));
                continue;
            }
            if ("mtime".equals(key)) {
                this.currEntry.setModTime((long)(Double.parseDouble(val) * 1000.0));
                continue;
            }
            if ("SCHILY.devminor".equals(key)) {
                this.currEntry.setDevMinor(Integer.parseInt(val));
                continue;
            }
            if (!"SCHILY.devmajor".equals(key)) continue;
            this.currEntry.setDevMajor(Integer.parseInt(val));
        }
    }

    private void readGNUSparse() throws IOException {
        if (this.currEntry.isExtended()) {
            byte[] headerBuf;
            TarArchiveSparseEntry entry;
            do {
                if ((headerBuf = this.getRecord()) != null) continue;
                this.currEntry = null;
                break;
            } while ((entry = new TarArchiveSparseEntry(headerBuf)).isExtended());
        }
    }

    @Override
    public ArchiveEntry getNextEntry() throws IOException {
        return this.getNextTarEntry();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tryToConsumeSecondEOFRecord() throws IOException {
        boolean shouldReset = true;
        boolean marked = this.is.markSupported();
        if (marked) {
            this.is.mark(this.recordSize);
        }
        try {
            shouldReset = !this.isEOFRecord(this.readRecord());
        }
        finally {
            if (shouldReset && marked) {
                this.pushedBackBytes(this.recordSize);
                this.is.reset();
            }
        }
    }

    @Override
    public int read(byte[] buf, int offset, int numToRead) throws IOException {
        int totalRead = 0;
        if (this.hasHitEOF || this.entryOffset >= this.entrySize) {
            return -1;
        }
        if (this.currEntry == null) {
            throw new IllegalStateException("No current tar entry");
        }
        totalRead = this.is.read(buf, offset, numToRead = Math.min(numToRead, this.available()));
        if (totalRead == -1) {
            if (numToRead > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.hasHitEOF = true;
        } else {
            this.count(totalRead);
            this.entryOffset += (long)totalRead;
        }
        return totalRead;
    }

    @Override
    public boolean canReadEntryData(ArchiveEntry ae) {
        if (ae instanceof TarArchiveEntry) {
            TarArchiveEntry te = (TarArchiveEntry)ae;
            return !te.isGNUSparse();
        }
        return false;
    }

    public TarArchiveEntry getCurrentEntry() {
        return this.currEntry;
    }

    protected final void setCurrentEntry(TarArchiveEntry e) {
        this.currEntry = e;
    }

    protected final boolean isAtEOF() {
        return this.hasHitEOF;
    }

    protected final void setAtEOF(boolean b) {
        this.hasHitEOF = b;
    }

    private void consumeRemainderOfLastBlock() throws IOException {
        long bytesReadOfLastBlock = this.getBytesRead() % (long)this.blockSize;
        if (bytesReadOfLastBlock > 0L) {
            long skipped = IOUtils.skip(this.is, (long)this.blockSize - bytesReadOfLastBlock);
            this.count(skipped);
        }
    }

    public static boolean matches(byte[] signature, int length) {
        if (length < 265) {
            return false;
        }
        if (ArchiveUtils.matchAsciiBuffer("ustar\u0000", signature, 257, 6) && ArchiveUtils.matchAsciiBuffer("00", signature, 263, 2)) {
            return true;
        }
        if (ArchiveUtils.matchAsciiBuffer("ustar ", signature, 257, 6) && (ArchiveUtils.matchAsciiBuffer(" \u0000", signature, 263, 2) || ArchiveUtils.matchAsciiBuffer("0\u0000", signature, 263, 2))) {
            return true;
        }
        return ArchiveUtils.matchAsciiBuffer("ustar\u0000", signature, 257, 6) && ArchiveUtils.matchAsciiBuffer("\u0000\u0000", signature, 263, 2);
    }
}

