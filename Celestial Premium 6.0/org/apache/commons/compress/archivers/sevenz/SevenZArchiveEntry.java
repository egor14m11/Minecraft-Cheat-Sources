/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class SevenZArchiveEntry
implements ArchiveEntry {
    private String name;
    private boolean hasStream;
    private boolean isDirectory;
    private boolean isAntiItem;
    private boolean hasCreationDate;
    private boolean hasLastModifiedDate;
    private boolean hasAccessDate;
    private long creationDate;
    private long lastModifiedDate;
    private long accessDate;
    private boolean hasWindowsAttributes;
    private int windowsAttributes;
    private boolean hasCrc;
    private long crc;
    private long compressedCrc;
    private long size;
    private long compressedSize;
    private Iterable<? extends SevenZMethodConfiguration> contentMethods;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasStream() {
        return this.hasStream;
    }

    public void setHasStream(boolean hasStream) {
        this.hasStream = hasStream;
    }

    @Override
    public boolean isDirectory() {
        return this.isDirectory;
    }

    public void setDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public boolean isAntiItem() {
        return this.isAntiItem;
    }

    public void setAntiItem(boolean isAntiItem) {
        this.isAntiItem = isAntiItem;
    }

    public boolean getHasCreationDate() {
        return this.hasCreationDate;
    }

    public void setHasCreationDate(boolean hasCreationDate) {
        this.hasCreationDate = hasCreationDate;
    }

    public Date getCreationDate() {
        if (this.hasCreationDate) {
            return SevenZArchiveEntry.ntfsTimeToJavaTime(this.creationDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setCreationDate(long ntfsCreationDate) {
        this.creationDate = ntfsCreationDate;
    }

    public void setCreationDate(Date creationDate) {
        boolean bl = this.hasCreationDate = creationDate != null;
        if (this.hasCreationDate) {
            this.creationDate = SevenZArchiveEntry.javaTimeToNtfsTime(creationDate);
        }
    }

    public boolean getHasLastModifiedDate() {
        return this.hasLastModifiedDate;
    }

    public void setHasLastModifiedDate(boolean hasLastModifiedDate) {
        this.hasLastModifiedDate = hasLastModifiedDate;
    }

    @Override
    public Date getLastModifiedDate() {
        if (this.hasLastModifiedDate) {
            return SevenZArchiveEntry.ntfsTimeToJavaTime(this.lastModifiedDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setLastModifiedDate(long ntfsLastModifiedDate) {
        this.lastModifiedDate = ntfsLastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        boolean bl = this.hasLastModifiedDate = lastModifiedDate != null;
        if (this.hasLastModifiedDate) {
            this.lastModifiedDate = SevenZArchiveEntry.javaTimeToNtfsTime(lastModifiedDate);
        }
    }

    public boolean getHasAccessDate() {
        return this.hasAccessDate;
    }

    public void setHasAccessDate(boolean hasAcessDate) {
        this.hasAccessDate = hasAcessDate;
    }

    public Date getAccessDate() {
        if (this.hasAccessDate) {
            return SevenZArchiveEntry.ntfsTimeToJavaTime(this.accessDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setAccessDate(long ntfsAccessDate) {
        this.accessDate = ntfsAccessDate;
    }

    public void setAccessDate(Date accessDate) {
        boolean bl = this.hasAccessDate = accessDate != null;
        if (this.hasAccessDate) {
            this.accessDate = SevenZArchiveEntry.javaTimeToNtfsTime(accessDate);
        }
    }

    public boolean getHasWindowsAttributes() {
        return this.hasWindowsAttributes;
    }

    public void setHasWindowsAttributes(boolean hasWindowsAttributes) {
        this.hasWindowsAttributes = hasWindowsAttributes;
    }

    public int getWindowsAttributes() {
        return this.windowsAttributes;
    }

    public void setWindowsAttributes(int windowsAttributes) {
        this.windowsAttributes = windowsAttributes;
    }

    public boolean getHasCrc() {
        return this.hasCrc;
    }

    public void setHasCrc(boolean hasCrc) {
        this.hasCrc = hasCrc;
    }

    @Deprecated
    public int getCrc() {
        return (int)this.crc;
    }

    @Deprecated
    public void setCrc(int crc) {
        this.crc = crc;
    }

    public long getCrcValue() {
        return this.crc;
    }

    public void setCrcValue(long crc) {
        this.crc = crc;
    }

    @Deprecated
    int getCompressedCrc() {
        return (int)this.compressedCrc;
    }

    @Deprecated
    void setCompressedCrc(int crc) {
        this.compressedCrc = crc;
    }

    long getCompressedCrcValue() {
        return this.compressedCrc;
    }

    void setCompressedCrcValue(long crc) {
        this.compressedCrc = crc;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    long getCompressedSize() {
        return this.compressedSize;
    }

    void setCompressedSize(long size) {
        this.compressedSize = size;
    }

    public void setContentMethods(Iterable<? extends SevenZMethodConfiguration> methods) {
        if (methods != null) {
            LinkedList<SevenZMethodConfiguration> l = new LinkedList<SevenZMethodConfiguration>();
            for (SevenZMethodConfiguration sevenZMethodConfiguration : methods) {
                l.addLast(sevenZMethodConfiguration);
            }
            this.contentMethods = Collections.unmodifiableList(l);
        } else {
            this.contentMethods = null;
        }
    }

    public Iterable<? extends SevenZMethodConfiguration> getContentMethods() {
        return this.contentMethods;
    }

    public static Date ntfsTimeToJavaTime(long ntfsTime) {
        Calendar ntfsEpoch = Calendar.getInstance();
        ntfsEpoch.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        ntfsEpoch.set(1601, 0, 1, 0, 0, 0);
        ntfsEpoch.set(14, 0);
        long realTime = ntfsEpoch.getTimeInMillis() + ntfsTime / 10000L;
        return new Date(realTime);
    }

    public static long javaTimeToNtfsTime(Date date) {
        Calendar ntfsEpoch = Calendar.getInstance();
        ntfsEpoch.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        ntfsEpoch.set(1601, 0, 1, 0, 0, 0);
        ntfsEpoch.set(14, 0);
        return (date.getTime() - ntfsEpoch.getTimeInMillis()) * 1000L * 10L;
    }
}

