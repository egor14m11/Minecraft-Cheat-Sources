/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.platform.win32;

import com.sun.jna.Memory;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;
import com.sun.jna.win32.StdCallLibrary;

public interface Sspi
extends StdCallLibrary {
    public static final int MAX_TOKEN_SIZE = 12288;
    public static final int SECPKG_CRED_INBOUND = 1;
    public static final int SECPKG_CRED_OUTBOUND = 2;
    public static final int SECURITY_NATIVE_DREP = 16;
    public static final int ISC_REQ_ALLOCATE_MEMORY = 256;
    public static final int ISC_REQ_CONFIDENTIALITY = 16;
    public static final int ISC_REQ_CONNECTION = 2048;
    public static final int ISC_REQ_DELEGATE = 1;
    public static final int ISC_REQ_EXTENDED_ERROR = 16384;
    public static final int ISC_REQ_INTEGRITY = 65536;
    public static final int ISC_REQ_MUTUAL_AUTH = 2;
    public static final int ISC_REQ_REPLAY_DETECT = 4;
    public static final int ISC_REQ_SEQUENCE_DETECT = 8;
    public static final int ISC_REQ_STREAM = 32768;
    public static final int SECBUFFER_VERSION = 0;
    public static final int SECBUFFER_EMPTY = 0;
    public static final int SECBUFFER_DATA = 1;
    public static final int SECBUFFER_TOKEN = 2;

    public static class SecPkgInfo
    extends Structure {
        public NativeLong fCapabilities = new NativeLong(0L);
        public short wVersion = 1;
        public short wRPCID = 0;
        public NativeLong cbMaxToken = new NativeLong(0L);
        public WString Name;
        public WString Comment;

        public static class ByReference
        extends SecPkgInfo
        implements Structure.ByReference {
        }
    }

    public static class PSecPkgInfo
    extends Structure {
        public SecPkgInfo.ByReference pPkgInfo;

        public SecPkgInfo.ByReference[] toArray(int size) {
            return (SecPkgInfo.ByReference[])this.pPkgInfo.toArray(size);
        }

        public static class ByReference
        extends PSecPkgInfo
        implements Structure.ByReference {
        }
    }

    public static class TimeStamp
    extends SECURITY_INTEGER {
    }

    public static class SECURITY_INTEGER
    extends Structure {
        public NativeLong dwLower = new NativeLong(0L);
        public NativeLong dwUpper = new NativeLong(0L);
    }

    public static class SecBufferDesc
    extends Structure {
        public NativeLong ulVersion = new NativeLong(0L);
        public NativeLong cBuffers = new NativeLong(1L);
        public SecBuffer.ByReference[] pBuffers;

        public SecBufferDesc() {
            SecBuffer.ByReference secBuffer = new SecBuffer.ByReference();
            this.pBuffers = (SecBuffer.ByReference[])secBuffer.toArray(1);
            this.allocateMemory();
        }

        public SecBufferDesc(int type, byte[] token) {
            SecBuffer.ByReference secBuffer = new SecBuffer.ByReference(type, token);
            this.pBuffers = (SecBuffer.ByReference[])secBuffer.toArray(1);
            this.allocateMemory();
        }

        public SecBufferDesc(int type, int tokenSize) {
            SecBuffer.ByReference secBuffer = new SecBuffer.ByReference(type, tokenSize);
            this.pBuffers = (SecBuffer.ByReference[])secBuffer.toArray(1);
            this.allocateMemory();
        }

        public byte[] getBytes() {
            if (this.pBuffers == null || this.cBuffers == null) {
                throw new RuntimeException("pBuffers | cBuffers");
            }
            if (this.cBuffers.intValue() == 1) {
                return this.pBuffers[0].getBytes();
            }
            throw new RuntimeException("cBuffers > 1");
        }
    }

    public static class SecBuffer
    extends Structure {
        public NativeLong cbBuffer;
        public NativeLong BufferType;
        public Pointer pvBuffer;

        public SecBuffer() {
            this.cbBuffer = new NativeLong(0L);
            this.pvBuffer = null;
            this.BufferType = new NativeLong(0L);
        }

        public SecBuffer(int type, int size) {
            this.cbBuffer = new NativeLong((long)size);
            this.pvBuffer = new Memory(size);
            this.BufferType = new NativeLong((long)type);
            this.allocateMemory();
        }

        public SecBuffer(int type, byte[] token) {
            this.cbBuffer = new NativeLong((long)token.length);
            this.pvBuffer = new Memory(token.length);
            this.pvBuffer.write(0L, token, 0, token.length);
            this.BufferType = new NativeLong((long)type);
            this.allocateMemory();
        }

        public byte[] getBytes() {
            return this.pvBuffer.getByteArray(0L, this.cbBuffer.intValue());
        }

        public static class ByReference
        extends SecBuffer
        implements Structure.ByReference {
            public ByReference() {
            }

            public ByReference(int type, int size) {
                super(type, size);
            }

            public ByReference(int type, byte[] token) {
                super(type, token);
            }

            public byte[] getBytes() {
                return super.getBytes();
            }
        }
    }

    public static class CtxtHandle
    extends SecHandle {
    }

    public static class CredHandle
    extends SecHandle {
    }

    public static class PSecHandle
    extends Structure {
        public SecHandle.ByReference secHandle;

        public PSecHandle() {
        }

        public PSecHandle(SecHandle h) {
            super(h.getPointer());
            this.read();
        }

        public static class ByReference
        extends PSecHandle
        implements Structure.ByReference {
        }
    }

    public static class SecHandle
    extends Structure {
        public Pointer dwLower = null;
        public Pointer dwUpper = null;

        public boolean isNull() {
            return this.dwLower == null && this.dwUpper == null;
        }

        public static class ByReference
        extends SecHandle
        implements Structure.ByReference {
        }
    }
}

