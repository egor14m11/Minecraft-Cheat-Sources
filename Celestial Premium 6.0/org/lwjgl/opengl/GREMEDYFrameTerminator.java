/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.BufferChecks;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;

public final class GREMEDYFrameTerminator {
    private GREMEDYFrameTerminator() {
    }

    public static void glFrameTerminatorGREMEDY() {
        ContextCapabilities caps = GLContext.getCapabilities();
        long function_pointer = caps.glFrameTerminatorGREMEDY;
        BufferChecks.checkFunctionAddress(function_pointer);
        GREMEDYFrameTerminator.nglFrameTerminatorGREMEDY(function_pointer);
    }

    static native void nglFrameTerminatorGREMEDY(long var0);
}

