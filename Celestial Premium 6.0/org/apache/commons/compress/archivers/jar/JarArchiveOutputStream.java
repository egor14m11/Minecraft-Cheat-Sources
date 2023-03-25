/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.jar;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

public class JarArchiveOutputStream
extends ZipArchiveOutputStream {
    private boolean jarMarkerAdded = false;

    public JarArchiveOutputStream(OutputStream out) {
        super(out);
    }

    public void putArchiveEntry(ArchiveEntry ze) throws IOException {
        if (!this.jarMarkerAdded) {
            ((ZipArchiveEntry)ze).addAsFirstExtraField(JarMarker.getInstance());
            this.jarMarkerAdded = true;
        }
        super.putArchiveEntry(ze);
    }
}

