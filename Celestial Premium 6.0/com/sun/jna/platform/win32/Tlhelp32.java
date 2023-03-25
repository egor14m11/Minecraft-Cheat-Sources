/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.platform.win32;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

public interface Tlhelp32
extends StdCallLibrary {
    public static final WinDef.DWORD TH32CS_SNAPHEAPLIST = new WinDef.DWORD(1L);
    public static final WinDef.DWORD TH32CS_SNAPPROCESS = new WinDef.DWORD(2L);
    public static final WinDef.DWORD TH32CS_SNAPTHREAD = new WinDef.DWORD(4L);
    public static final WinDef.DWORD TH32CS_SNAPMODULE = new WinDef.DWORD(8L);
    public static final WinDef.DWORD TH32CS_SNAPMODULE32 = new WinDef.DWORD(16L);
    public static final WinDef.DWORD TH32CS_SNAPALL = new WinDef.DWORD((long)(TH32CS_SNAPHEAPLIST.intValue() | TH32CS_SNAPPROCESS.intValue() | TH32CS_SNAPTHREAD.intValue() | TH32CS_SNAPMODULE.intValue()));
    public static final WinDef.DWORD TH32CS_INHERIT = new WinDef.DWORD((long)Integer.MIN_VALUE);

    public static class PROCESSENTRY32
    extends Structure {
        public WinDef.DWORD dwSize;
        public WinDef.DWORD cntUsage;
        public WinDef.DWORD th32ProcessID;
        public BaseTSD.ULONG_PTR th32DefaultHeapID;
        public WinDef.DWORD th32ModuleID;
        public WinDef.DWORD cntThreads;
        public WinDef.DWORD th32ParentProcessID;
        public WinDef.LONG pcPriClassBase;
        public WinDef.DWORD dwFlags;
        public char[] szExeFile = new char[260];

        public PROCESSENTRY32() {
            this.dwSize = new WinDef.DWORD((long)this.size());
        }

        public PROCESSENTRY32(Pointer memory) {
            super(memory);
            this.read();
        }

        public static class ByReference
        extends PROCESSENTRY32
        implements Structure.ByReference {
            public ByReference() {
            }

            public ByReference(Pointer memory) {
                super(memory);
            }
        }
    }
}

