// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.escape;

import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
final class Platform
{
    private static final ThreadLocal<char[]> DEST_TL;
    
    private Platform() {
    }
    
    static char[] charBufferFromThreadLocal() {
        return Platform.DEST_TL.get();
    }
    
    static {
        DEST_TL = new ThreadLocal<char[]>() {
            @Override
            protected char[] initialValue() {
                return new char[1024];
            }
        };
    }
}
