// 
// Decompiled by Procyon v0.5.36
// 

package com.sun.jna.platform.win32;

import java.util.Map;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.Structure;
import com.sun.jna.win32.StdCallLibrary;

public interface NtDll extends StdCallLibrary
{
    public static final NtDll INSTANCE = Native.load("NtDll", NtDll.class, W32APIOptions.DEFAULT_OPTIONS);
    
    int ZwQueryKey(final WinNT.HANDLE p0, final int p1, final Structure p2, final int p3, final IntByReference p4);
    
    int NtSetSecurityObject(final WinNT.HANDLE p0, final int p1, final Pointer p2);
    
    int NtQuerySecurityObject(final WinNT.HANDLE p0, final int p1, final Pointer p2, final int p3, final IntByReference p4);
    
    int RtlNtStatusToDosError(final int p0);
}
