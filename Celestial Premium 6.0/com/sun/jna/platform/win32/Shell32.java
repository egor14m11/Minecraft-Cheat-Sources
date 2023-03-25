/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.platform.win32;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.ShellAPI;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

public interface Shell32
extends ShellAPI,
StdCallLibrary {
    public static final Shell32 INSTANCE = Native.loadLibrary("shell32", Shell32.class, W32APIOptions.UNICODE_OPTIONS);

    public int SHFileOperation(ShellAPI.SHFILEOPSTRUCT var1);

    public WinNT.HRESULT SHGetFolderPath(WinDef.HWND var1, int var2, WinNT.HANDLE var3, WinDef.DWORD var4, char[] var5);

    public WinNT.HRESULT SHGetDesktopFolder(PointerByReference var1);

    public WinDef.HINSTANCE ShellExecute(WinDef.HWND var1, String var2, String var3, String var4, String var5, int var6);
}

