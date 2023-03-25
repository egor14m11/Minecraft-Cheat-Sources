/*
 * Decompiled with CFR 0.152.
 */
package com.github.steveice10.packetlib.io.buffer;

import com.github.steveice10.packetlib.io.NetInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

public class ByteBufferNetInput
implements NetInput {
    private ByteBuffer buffer;

    public ByteBufferNetInput(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    @Override
    public boolean readBoolean() throws IOException {
        return this.buffer.get() == 1;
    }

    @Override
    public byte readByte() throws IOException {
        return this.buffer.get();
    }

    @Override
    public int readUnsignedByte() throws IOException {
        return this.buffer.get() & 0xFF;
    }

    @Override
    public short readShort() throws IOException {
        return this.buffer.getShort();
    }

    @Override
    public int readUnsignedShort() throws IOException {
        return this.buffer.getShort() & 0xFFFF;
    }

    @Override
    public char readChar() throws IOException {
        return this.buffer.getChar();
    }

    @Override
    public int readInt() throws IOException {
        return this.buffer.getInt();
    }

    @Override
    public int readVarInt() throws IOException {
        byte b;
        int value = 0;
        int size = 0;
        while (((b = this.readByte()) & 0x80) == 128) {
            value |= (b & 0x7F) << size++ * 7;
            if (size <= 5) continue;
            throw new IOException("VarInt too long (length must be <= 5)");
        }
        return value | (b & 0x7F) << size * 7;
    }

    @Override
    public long readLong() throws IOException {
        return this.buffer.getLong();
    }

    @Override
    public long readVarLong() throws IOException {
        byte b;
        long value = 0L;
        int size = 0;
        while (((b = this.readByte()) & 0x80) == 128) {
            value |= (long)(b & 0x7F) << size++ * 7;
            if (size <= 10) continue;
            throw new IOException("VarLong too long (length must be <= 10)");
        }
        return value | (long)(b & 0x7F) << size * 7;
    }

    @Override
    public float readFloat() throws IOException {
        return this.buffer.getFloat();
    }

    @Override
    public double readDouble() throws IOException {
        return this.buffer.getDouble();
    }

    @Override
    public byte[] readBytes(int length) throws IOException {
        if (length < 0) {
            throw new IllegalArgumentException("Array cannot have length less than 0.");
        }
        byte[] b = new byte[length];
        this.buffer.get(b);
        return b;
    }

    @Override
    public int readBytes(byte[] b) throws IOException {
        return this.readBytes(b, 0, b.length);
    }

    @Override
    public int readBytes(byte[] b, int offset, int length) throws IOException {
        int readable = this.buffer.remaining();
        if (readable <= 0) {
            return -1;
        }
        if (readable < length) {
            length = readable;
        }
        this.buffer.get(b, offset, length);
        return length;
    }

    @Override
    public short[] readShorts(int length) throws IOException {
        if (length < 0) {
            throw new IllegalArgumentException("Array cannot have length less than 0.");
        }
        short[] s = new short[length];
        int index = 0;
        while (index < length) {
            s[index] = this.readShort();
            ++index;
        }
        return s;
    }

    @Override
    public int readShorts(short[] s) throws IOException {
        return this.readShorts(s, 0, s.length);
    }

    @Override
    public int readShorts(short[] s, int offset, int length) throws IOException {
        int readable = this.buffer.remaining();
        if (readable <= 0) {
            return -1;
        }
        if (readable < length * 2) {
            length = readable / 2;
        }
        int index = offset;
        while (index < offset + length) {
            s[index] = this.readShort();
            ++index;
        }
        return length;
    }

    @Override
    public int[] readInts(int length) throws IOException {
        if (length < 0) {
            throw new IllegalArgumentException("Array cannot have length less than 0.");
        }
        int[] i = new int[length];
        int index = 0;
        while (index < length) {
            i[index] = this.readInt();
            ++index;
        }
        return i;
    }

    @Override
    public int readInts(int[] i) throws IOException {
        return this.readInts(i, 0, i.length);
    }

    @Override
    public int readInts(int[] i, int offset, int length) throws IOException {
        int readable = this.buffer.remaining();
        if (readable <= 0) {
            return -1;
        }
        if (readable < length * 4) {
            length = readable / 4;
        }
        int index = offset;
        while (index < offset + length) {
            i[index] = this.readInt();
            ++index;
        }
        return length;
    }

    @Override
    public long[] readLongs(int length) throws IOException {
        if (length < 0) {
            throw new IllegalArgumentException("Array cannot have length less than 0.");
        }
        long[] l = new long[length];
        int index = 0;
        while (index < length) {
            l[index] = this.readLong();
            ++index;
        }
        return l;
    }

    @Override
    public int readLongs(long[] l) throws IOException {
        return this.readLongs(l, 0, l.length);
    }

    @Override
    public int readLongs(long[] l, int offset, int length) throws IOException {
        int readable = this.buffer.remaining();
        if (readable <= 0) {
            return -1;
        }
        if (readable < length * 2) {
            length = readable / 2;
        }
        int index = offset;
        while (index < offset + length) {
            l[index] = this.readLong();
            ++index;
        }
        return length;
    }

    @Override
    public String readString() throws IOException {
        int length = this.readVarInt();
        byte[] bytes = this.readBytes(length);
        return new String(bytes, "UTF-8");
    }

    @Override
    public UUID readUUID() throws IOException {
        return new UUID(this.readLong(), this.readLong());
    }

    @Override
    public int available() throws IOException {
        return this.buffer.remaining();
    }
}

