/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import org.apache.commons.compress.archivers.ArchiveException;

public class StreamingNotSupportedException
extends ArchiveException {
    private static final long serialVersionUID = 1L;
    private final String format;

    public StreamingNotSupportedException(String format) {
        super("The " + format + " doesn't support streaming.");
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }
}

