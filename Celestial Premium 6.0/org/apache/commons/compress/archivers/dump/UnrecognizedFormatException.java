/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.dump.DumpArchiveException;

public class UnrecognizedFormatException
extends DumpArchiveException {
    private static final long serialVersionUID = 1L;

    public UnrecognizedFormatException() {
        super("this is not a recognized format.");
    }
}

