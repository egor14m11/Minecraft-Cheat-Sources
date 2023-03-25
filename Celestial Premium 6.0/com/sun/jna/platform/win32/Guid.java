/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.platform.win32;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public interface Guid {

    public static class GUID
    extends Structure {
        public int Data1;
        public short Data2;
        public short Data3;
        public byte[] Data4 = new byte[8];

        public GUID() {
        }

        public GUID(Pointer memory) {
            super(memory);
            this.read();
        }

        public GUID(byte[] data) {
            if (data.length != 16) {
                throw new IllegalArgumentException("Invalid data length: " + data.length);
            }
            long data1Temp = data[3] & 0xFF;
            data1Temp <<= 8;
            data1Temp |= (long)(data[2] & 0xFF);
            data1Temp <<= 8;
            data1Temp |= (long)(data[1] & 0xFF);
            data1Temp <<= 8;
            this.Data1 = (int)(data1Temp |= (long)(data[0] & 0xFF));
            int data2Temp = data[5] & 0xFF;
            data2Temp <<= 8;
            this.Data2 = (short)(data2Temp |= data[4] & 0xFF);
            int data3Temp = data[7] & 0xFF;
            data3Temp <<= 8;
            this.Data3 = (short)(data3Temp |= data[6] & 0xFF);
            this.Data4[0] = data[8];
            this.Data4[1] = data[9];
            this.Data4[2] = data[10];
            this.Data4[3] = data[11];
            this.Data4[4] = data[12];
            this.Data4[5] = data[13];
            this.Data4[6] = data[14];
            this.Data4[7] = data[15];
        }

        public static class ByReference
        extends GUID
        implements Structure.ByReference {
            public ByReference() {
            }

            public ByReference(GUID guid) {
                super(guid.getPointer());
                this.Data1 = guid.Data1;
                this.Data2 = guid.Data2;
                this.Data3 = guid.Data3;
                this.Data4 = guid.Data4;
            }

            public ByReference(Pointer memory) {
                super(memory);
            }
        }
    }
}

