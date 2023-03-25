/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.tar;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveEntry
implements TarConstants,
ArchiveEntry {
    private String name = "";
    private int mode;
    private int userId = 0;
    private int groupId = 0;
    private long size = 0L;
    private long modTime;
    private boolean checkSumOK;
    private byte linkFlag;
    private String linkName = "";
    private String magic = "ustar\u0000";
    private String version = "00";
    private String userName;
    private String groupName = "";
    private int devMajor = 0;
    private int devMinor = 0;
    private boolean isExtended;
    private long realSize;
    private final File file;
    public static final int MAX_NAMELEN = 31;
    public static final int DEFAULT_DIR_MODE = 16877;
    public static final int DEFAULT_FILE_MODE = 33188;
    public static final int MILLIS_PER_SECOND = 1000;

    private TarArchiveEntry() {
        String user = System.getProperty("user.name", "");
        if (user.length() > 31) {
            user = user.substring(0, 31);
        }
        this.userName = user;
        this.file = null;
    }

    public TarArchiveEntry(String name) {
        this(name, false);
    }

    public TarArchiveEntry(String name, boolean preserveLeadingSlashes) {
        this();
        name = TarArchiveEntry.normalizeFileName(name, preserveLeadingSlashes);
        boolean isDir = name.endsWith("/");
        this.name = name;
        this.mode = isDir ? 16877 : 33188;
        this.linkFlag = (byte)(isDir ? 53 : 48);
        this.modTime = new Date().getTime() / 1000L;
        this.userName = "";
    }

    public TarArchiveEntry(String name, byte linkFlag) {
        this(name, linkFlag, false);
    }

    public TarArchiveEntry(String name, byte linkFlag, boolean preserveLeadingSlashes) {
        this(name, preserveLeadingSlashes);
        this.linkFlag = linkFlag;
        if (linkFlag == 76) {
            this.magic = "ustar ";
            this.version = " \u0000";
        }
    }

    public TarArchiveEntry(File file) {
        this(file, TarArchiveEntry.normalizeFileName(file.getPath(), false));
    }

    public TarArchiveEntry(File file, String fileName) {
        this.file = file;
        if (file.isDirectory()) {
            this.mode = 16877;
            this.linkFlag = (byte)53;
            int nameLength = fileName.length();
            this.name = nameLength == 0 || fileName.charAt(nameLength - 1) != '/' ? fileName + "/" : fileName;
        } else {
            this.mode = 33188;
            this.linkFlag = (byte)48;
            this.size = file.length();
            this.name = fileName;
        }
        this.modTime = file.lastModified() / 1000L;
        this.userName = "";
    }

    public TarArchiveEntry(byte[] headerBuf) {
        this();
        this.parseTarHeader(headerBuf);
    }

    public TarArchiveEntry(byte[] headerBuf, ZipEncoding encoding) throws IOException {
        this();
        this.parseTarHeader(headerBuf, encoding);
    }

    public boolean equals(TarArchiveEntry it) {
        return this.getName().equals(it.getName());
    }

    public boolean equals(Object it) {
        if (it == null || this.getClass() != it.getClass()) {
            return false;
        }
        return this.equals((TarArchiveEntry)it);
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public boolean isDescendent(TarArchiveEntry desc) {
        return desc.getName().startsWith(this.getName());
    }

    public String getName() {
        return this.name.toString();
    }

    public void setName(String name) {
        this.name = TarArchiveEntry.normalizeFileName(name, false);
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getLinkName() {
        return this.linkName.toString();
    }

    public void setLinkName(String link) {
        this.linkName = link;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getUserName() {
        return this.userName.toString();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGroupName() {
        return this.groupName.toString();
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setIds(int userId, int groupId) {
        this.setUserId(userId);
        this.setGroupId(groupId);
    }

    public void setNames(String userName, String groupName) {
        this.setUserName(userName);
        this.setGroupName(groupName);
    }

    public void setModTime(long time) {
        this.modTime = time / 1000L;
    }

    public void setModTime(Date time) {
        this.modTime = time.getTime() / 1000L;
    }

    public Date getModTime() {
        return new Date(this.modTime * 1000L);
    }

    public Date getLastModifiedDate() {
        return this.getModTime();
    }

    public boolean isCheckSumOK() {
        return this.checkSumOK;
    }

    public File getFile() {
        return this.file;
    }

    public int getMode() {
        return this.mode;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        if (size < 0L) {
            throw new IllegalArgumentException("Size is out of range: " + size);
        }
        this.size = size;
    }

    public int getDevMajor() {
        return this.devMajor;
    }

    public void setDevMajor(int devNo) {
        if (devNo < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + devNo);
        }
        this.devMajor = devNo;
    }

    public int getDevMinor() {
        return this.devMinor;
    }

    public void setDevMinor(int devNo) {
        if (devNo < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + devNo);
        }
        this.devMinor = devNo;
    }

    public boolean isExtended() {
        return this.isExtended;
    }

    public long getRealSize() {
        return this.realSize;
    }

    public boolean isGNUSparse() {
        return this.linkFlag == 83;
    }

    public boolean isGNULongLinkEntry() {
        return this.linkFlag == 75 && this.name.equals("././@LongLink");
    }

    public boolean isGNULongNameEntry() {
        return this.linkFlag == 76 && this.name.equals("././@LongLink");
    }

    public boolean isPaxHeader() {
        return this.linkFlag == 120 || this.linkFlag == 88;
    }

    public boolean isGlobalPaxHeader() {
        return this.linkFlag == 103;
    }

    public boolean isDirectory() {
        if (this.file != null) {
            return this.file.isDirectory();
        }
        if (this.linkFlag == 53) {
            return true;
        }
        return this.getName().endsWith("/");
    }

    public boolean isFile() {
        if (this.file != null) {
            return this.file.isFile();
        }
        if (this.linkFlag == 0 || this.linkFlag == 48) {
            return true;
        }
        return !this.getName().endsWith("/");
    }

    public boolean isSymbolicLink() {
        return this.linkFlag == 50;
    }

    public boolean isLink() {
        return this.linkFlag == 49;
    }

    public boolean isCharacterDevice() {
        return this.linkFlag == 51;
    }

    public boolean isBlockDevice() {
        return this.linkFlag == 52;
    }

    public boolean isFIFO() {
        return this.linkFlag == 54;
    }

    public TarArchiveEntry[] getDirectoryEntries() {
        if (this.file == null || !this.file.isDirectory()) {
            return new TarArchiveEntry[0];
        }
        String[] list = this.file.list();
        TarArchiveEntry[] result = new TarArchiveEntry[list.length];
        for (int i = 0; i < list.length; ++i) {
            result[i] = new TarArchiveEntry(new File(this.file, list[i]));
        }
        return result;
    }

    public void writeEntryHeader(byte[] outbuf) {
        try {
            this.writeEntryHeader(outbuf, TarUtils.DEFAULT_ENCODING, false);
        }
        catch (IOException ex) {
            try {
                this.writeEntryHeader(outbuf, TarUtils.FALLBACK_ENCODING, false);
            }
            catch (IOException ex2) {
                throw new RuntimeException(ex2);
            }
        }
    }

    public void writeEntryHeader(byte[] outbuf, ZipEncoding encoding, boolean starMode) throws IOException {
        int offset = 0;
        offset = TarUtils.formatNameBytes(this.name, outbuf, offset, 100, encoding);
        offset = this.writeEntryHeaderField(this.mode, outbuf, offset, 8, starMode);
        offset = this.writeEntryHeaderField(this.userId, outbuf, offset, 8, starMode);
        offset = this.writeEntryHeaderField(this.groupId, outbuf, offset, 8, starMode);
        offset = this.writeEntryHeaderField(this.size, outbuf, offset, 12, starMode);
        int csOffset = offset = this.writeEntryHeaderField(this.modTime, outbuf, offset, 12, starMode);
        for (int c = 0; c < 8; ++c) {
            outbuf[offset++] = 32;
        }
        outbuf[offset++] = this.linkFlag;
        offset = TarUtils.formatNameBytes(this.linkName, outbuf, offset, 100, encoding);
        offset = TarUtils.formatNameBytes(this.magic, outbuf, offset, 6);
        offset = TarUtils.formatNameBytes(this.version, outbuf, offset, 2);
        offset = TarUtils.formatNameBytes(this.userName, outbuf, offset, 32, encoding);
        offset = TarUtils.formatNameBytes(this.groupName, outbuf, offset, 32, encoding);
        offset = this.writeEntryHeaderField(this.devMajor, outbuf, offset, 8, starMode);
        offset = this.writeEntryHeaderField(this.devMinor, outbuf, offset, 8, starMode);
        while (offset < outbuf.length) {
            outbuf[offset++] = 0;
        }
        long chk = TarUtils.computeCheckSum(outbuf);
        TarUtils.formatCheckSumOctalBytes(chk, outbuf, csOffset, 8);
    }

    private int writeEntryHeaderField(long value, byte[] outbuf, int offset, int length, boolean starMode) {
        if (!(starMode || value >= 0L && value < 1L << 3 * (length - 1))) {
            return TarUtils.formatLongOctalBytes(0L, outbuf, offset, length);
        }
        return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
    }

    public void parseTarHeader(byte[] header) {
        try {
            this.parseTarHeader(header, TarUtils.DEFAULT_ENCODING);
        }
        catch (IOException ex) {
            try {
                this.parseTarHeader(header, TarUtils.DEFAULT_ENCODING, true);
            }
            catch (IOException ex2) {
                throw new RuntimeException(ex2);
            }
        }
    }

    public void parseTarHeader(byte[] header, ZipEncoding encoding) throws IOException {
        this.parseTarHeader(header, encoding, false);
    }

    private void parseTarHeader(byte[] header, ZipEncoding encoding, boolean oldStyle) throws IOException {
        int offset = 0;
        this.name = oldStyle ? TarUtils.parseName(header, offset, 100) : TarUtils.parseName(header, offset, 100, encoding);
        this.mode = (int)TarUtils.parseOctalOrBinary(header, offset += 100, 8);
        this.userId = (int)TarUtils.parseOctalOrBinary(header, offset += 8, 8);
        this.groupId = (int)TarUtils.parseOctalOrBinary(header, offset += 8, 8);
        this.size = TarUtils.parseOctalOrBinary(header, offset += 8, 12);
        this.modTime = TarUtils.parseOctalOrBinary(header, offset += 12, 12);
        offset += 12;
        this.checkSumOK = TarUtils.verifyCheckSum(header);
        offset += 8;
        this.linkFlag = header[offset++];
        this.linkName = oldStyle ? TarUtils.parseName(header, offset, 100) : TarUtils.parseName(header, offset, 100, encoding);
        this.magic = TarUtils.parseName(header, offset += 100, 6);
        this.version = TarUtils.parseName(header, offset += 6, 2);
        this.userName = oldStyle ? TarUtils.parseName(header, offset, 32) : TarUtils.parseName(header, offset += 2, 32, encoding);
        this.groupName = oldStyle ? TarUtils.parseName(header, offset, 32) : TarUtils.parseName(header, offset += 32, 32, encoding);
        this.devMajor = (int)TarUtils.parseOctalOrBinary(header, offset += 32, 8);
        this.devMinor = (int)TarUtils.parseOctalOrBinary(header, offset += 8, 8);
        offset += 8;
        int type = this.evaluateType(header);
        switch (type) {
            case 2: {
                offset += 12;
                offset += 12;
                offset += 12;
                offset += 4;
                ++offset;
                this.isExtended = TarUtils.parseBoolean(header, offset += 96);
                this.realSize = TarUtils.parseOctal(header, ++offset, 12);
                offset += 12;
                break;
            }
            default: {
                String prefix;
                String string = prefix = oldStyle ? TarUtils.parseName(header, offset, 155) : TarUtils.parseName(header, offset, 155, encoding);
                if (this.isDirectory() && !this.name.endsWith("/")) {
                    this.name = this.name + "/";
                }
                if (prefix.length() <= 0) break;
                this.name = prefix + "/" + this.name;
            }
        }
    }

    private static String normalizeFileName(String fileName, boolean preserveLeadingSlashes) {
        String osname = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (osname != null) {
            int colon;
            if (osname.startsWith("windows")) {
                if (fileName.length() > 2) {
                    char ch1 = fileName.charAt(0);
                    char ch2 = fileName.charAt(1);
                    if (ch2 == ':' && (ch1 >= 'a' && ch1 <= 'z' || ch1 >= 'A' && ch1 <= 'Z')) {
                        fileName = fileName.substring(2);
                    }
                }
            } else if (osname.indexOf("netware") > -1 && (colon = fileName.indexOf(58)) != -1) {
                fileName = fileName.substring(colon + 1);
            }
        }
        fileName = fileName.replace(File.separatorChar, '/');
        while (!preserveLeadingSlashes && fileName.startsWith("/")) {
            fileName = fileName.substring(1);
        }
        return fileName;
    }

    private int evaluateType(byte[] header) {
        if (ArchiveUtils.matchAsciiBuffer("ustar ", header, 257, 6)) {
            return 2;
        }
        if (ArchiveUtils.matchAsciiBuffer("ustar\u0000", header, 257, 6)) {
            return 3;
        }
        return 0;
    }
}

