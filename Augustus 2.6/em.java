import io.netty.util.ReferenceCounted;
import java.nio.charset.Charset;
import io.netty.buffer.ByteBufProcessor;
import java.nio.channels.ScatteringByteChannel;
import java.io.InputStream;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import io.netty.buffer.ByteBufAllocator;
import com.google.common.base.Charsets;
import io.netty.handler.codec.DecoderException;
import java.io.DataInput;
import io.netty.buffer.ByteBufInputStream;
import io.netty.handler.codec.EncoderException;
import java.io.DataOutput;
import io.netty.buffer.ByteBufOutputStream;
import java.util.UUID;
import java.io.IOException;
import io.netty.buffer.ByteBuf;

// 
// Decompiled by Procyon v0.5.36
// 

public class em extends ByteBuf
{
    private final ByteBuf a;
    
    public em(final ByteBuf \u2603) {
        this.a = \u2603;
    }
    
    public static int a(final int \u2603) {
        for (int i = 1; i < 5; ++i) {
            if ((\u2603 & -1 << i * 7) == 0x0) {
                return i;
            }
        }
        return 5;
    }
    
    public void a(final byte[] \u2603) {
        this.b(\u2603.length);
        this.writeBytes(\u2603);
    }
    
    public byte[] a() {
        final byte[] \u2603 = new byte[this.e()];
        this.readBytes(\u2603);
        return \u2603;
    }
    
    public cj c() {
        return cj.a(this.readLong());
    }
    
    public void a(final cj \u2603) {
        this.writeLong(\u2603.g());
    }
    
    public eu d() throws IOException {
        return eu.a.a(this.c(32767));
    }
    
    public void a(final eu \u2603) throws IOException {
        this.a(eu.a.a(\u2603));
    }
    
    public <T extends Enum<T>> T a(final Class<T> \u2603) {
        return \u2603.getEnumConstants()[this.e()];
    }
    
    public void a(final Enum<?> \u2603) {
        this.b(\u2603.ordinal());
    }
    
    public int e() {
        int n = 0;
        int n2 = 0;
        byte byte1;
        do {
            byte1 = this.readByte();
            n |= (byte1 & 0x7F) << n2++ * 7;
            if (n2 > 5) {
                throw new RuntimeException("VarInt too big");
            }
        } while ((byte1 & 0x80) == 0x80);
        return n;
    }
    
    public long f() {
        long n = 0L;
        int n2 = 0;
        byte byte1;
        do {
            byte1 = this.readByte();
            n |= (long)(byte1 & 0x7F) << n2++ * 7;
            if (n2 > 10) {
                throw new RuntimeException("VarLong too big");
            }
        } while ((byte1 & 0x80) == 0x80);
        return n;
    }
    
    public void a(final UUID \u2603) {
        this.writeLong(\u2603.getMostSignificantBits());
        this.writeLong(\u2603.getLeastSignificantBits());
    }
    
    public UUID g() {
        return new UUID(this.readLong(), this.readLong());
    }
    
    public void b(int \u2603) {
        while ((\u2603 & 0xFFFFFF80) != 0x0) {
            this.writeByte((\u2603 & 0x7F) | 0x80);
            \u2603 >>>= 7;
        }
        this.writeByte(\u2603);
    }
    
    public void b(long \u2603) {
        while ((\u2603 & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
            this.writeByte((int)(\u2603 & 0x7FL) | 0x80);
            \u2603 >>>= 7;
        }
        this.writeByte((int)\u2603);
    }
    
    public void a(final dn \u2603) {
        if (\u2603 == null) {
            this.writeByte(0);
        }
        else {
            try {
                dx.a(\u2603, (DataOutput)new ByteBufOutputStream(this));
            }
            catch (IOException cause) {
                throw new EncoderException(cause);
            }
        }
    }
    
    public dn h() throws IOException {
        final int readerIndex = this.readerIndex();
        final byte byte1 = this.readByte();
        if (byte1 == 0) {
            return null;
        }
        this.readerIndex(readerIndex);
        return dx.a(new ByteBufInputStream(this), new dw(2097152L));
    }
    
    public void a(final zx \u2603) {
        if (\u2603 == null) {
            this.writeShort(-1);
        }
        else {
            this.writeShort(zw.b(\u2603.b()));
            this.writeByte(\u2603.b);
            this.writeShort(\u2603.i());
            dn o = null;
            if (\u2603.b().m() || \u2603.b().p()) {
                o = \u2603.o();
            }
            this.a(o);
        }
    }
    
    public zx i() throws IOException {
        zx zx = null;
        final int short1 = this.readShort();
        if (short1 >= 0) {
            final int byte1 = this.readByte();
            final int short2 = this.readShort();
            zx = new zx(zw.b(short1), byte1, short2);
            zx.d(this.h());
        }
        return zx;
    }
    
    public String c(final int \u2603) {
        final int e = this.e();
        if (e > \u2603 * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + e + " > " + \u2603 * 4 + ")");
        }
        if (e < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        final String s = new String(this.readBytes(e).array(), Charsets.UTF_8);
        if (s.length() > \u2603) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + e + " > " + \u2603 + ")");
        }
        return s;
    }
    
    public em a(final String \u2603) {
        final byte[] bytes = \u2603.getBytes(Charsets.UTF_8);
        if (bytes.length > 32767) {
            throw new EncoderException("String too big (was " + \u2603.length() + " bytes encoded, max " + 32767 + ")");
        }
        this.b(bytes.length);
        this.writeBytes(bytes);
        return this;
    }
    
    @Override
    public int capacity() {
        return this.a.capacity();
    }
    
    @Override
    public ByteBuf capacity(final int \u2603) {
        return this.a.capacity(\u2603);
    }
    
    @Override
    public int maxCapacity() {
        return this.a.maxCapacity();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.a.alloc();
    }
    
    @Override
    public ByteOrder order() {
        return this.a.order();
    }
    
    @Override
    public ByteBuf order(final ByteOrder \u2603) {
        return this.a.order(\u2603);
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.a.unwrap();
    }
    
    @Override
    public boolean isDirect() {
        return this.a.isDirect();
    }
    
    @Override
    public int readerIndex() {
        return this.a.readerIndex();
    }
    
    @Override
    public ByteBuf readerIndex(final int \u2603) {
        return this.a.readerIndex(\u2603);
    }
    
    @Override
    public int writerIndex() {
        return this.a.writerIndex();
    }
    
    @Override
    public ByteBuf writerIndex(final int \u2603) {
        return this.a.writerIndex(\u2603);
    }
    
    @Override
    public ByteBuf setIndex(final int \u2603, final int \u2603) {
        return this.a.setIndex(\u2603, \u2603);
    }
    
    @Override
    public int readableBytes() {
        return this.a.readableBytes();
    }
    
    @Override
    public int writableBytes() {
        return this.a.writableBytes();
    }
    
    @Override
    public int maxWritableBytes() {
        return this.a.maxWritableBytes();
    }
    
    @Override
    public boolean isReadable() {
        return this.a.isReadable();
    }
    
    @Override
    public boolean isReadable(final int \u2603) {
        return this.a.isReadable(\u2603);
    }
    
    @Override
    public boolean isWritable() {
        return this.a.isWritable();
    }
    
    @Override
    public boolean isWritable(final int \u2603) {
        return this.a.isWritable(\u2603);
    }
    
    @Override
    public ByteBuf clear() {
        return this.a.clear();
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        return this.a.markReaderIndex();
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        return this.a.resetReaderIndex();
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        return this.a.markWriterIndex();
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        return this.a.resetWriterIndex();
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        return this.a.discardReadBytes();
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        return this.a.discardSomeReadBytes();
    }
    
    @Override
    public ByteBuf ensureWritable(final int \u2603) {
        return this.a.ensureWritable(\u2603);
    }
    
    @Override
    public int ensureWritable(final int \u2603, final boolean \u2603) {
        return this.a.ensureWritable(\u2603, \u2603);
    }
    
    @Override
    public boolean getBoolean(final int \u2603) {
        return this.a.getBoolean(\u2603);
    }
    
    @Override
    public byte getByte(final int \u2603) {
        return this.a.getByte(\u2603);
    }
    
    @Override
    public short getUnsignedByte(final int \u2603) {
        return this.a.getUnsignedByte(\u2603);
    }
    
    @Override
    public short getShort(final int \u2603) {
        return this.a.getShort(\u2603);
    }
    
    @Override
    public int getUnsignedShort(final int \u2603) {
        return this.a.getUnsignedShort(\u2603);
    }
    
    @Override
    public int getMedium(final int \u2603) {
        return this.a.getMedium(\u2603);
    }
    
    @Override
    public int getUnsignedMedium(final int \u2603) {
        return this.a.getUnsignedMedium(\u2603);
    }
    
    @Override
    public int getInt(final int \u2603) {
        return this.a.getInt(\u2603);
    }
    
    @Override
    public long getUnsignedInt(final int \u2603) {
        return this.a.getUnsignedInt(\u2603);
    }
    
    @Override
    public long getLong(final int \u2603) {
        return this.a.getLong(\u2603);
    }
    
    @Override
    public char getChar(final int \u2603) {
        return this.a.getChar(\u2603);
    }
    
    @Override
    public float getFloat(final int \u2603) {
        return this.a.getFloat(\u2603);
    }
    
    @Override
    public double getDouble(final int \u2603) {
        return this.a.getDouble(\u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final ByteBuf \u2603) {
        return this.a.getBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final ByteBuf \u2603, final int \u2603) {
        return this.a.getBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final ByteBuf \u2603, final int \u2603, final int \u2603) {
        return this.a.getBytes(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final byte[] \u2603) {
        return this.a.getBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final byte[] \u2603, final int \u2603, final int \u2603) {
        return this.a.getBytes(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final ByteBuffer \u2603) {
        return this.a.getBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf getBytes(final int \u2603, final OutputStream \u2603, final int \u2603) throws IOException {
        return this.a.getBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int getBytes(final int \u2603, final GatheringByteChannel \u2603, final int \u2603) throws IOException {
        return this.a.getBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBoolean(final int \u2603, final boolean \u2603) {
        return this.a.setBoolean(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setByte(final int \u2603, final int \u2603) {
        return this.a.setByte(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setShort(final int \u2603, final int \u2603) {
        return this.a.setShort(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setMedium(final int \u2603, final int \u2603) {
        return this.a.setMedium(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setInt(final int \u2603, final int \u2603) {
        return this.a.setInt(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setLong(final int \u2603, final long \u2603) {
        return this.a.setLong(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setChar(final int \u2603, final int \u2603) {
        return this.a.setChar(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setFloat(final int \u2603, final float \u2603) {
        return this.a.setFloat(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setDouble(final int \u2603, final double \u2603) {
        return this.a.setDouble(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final ByteBuf \u2603) {
        return this.a.setBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final ByteBuf \u2603, final int \u2603) {
        return this.a.setBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final ByteBuf \u2603, final int \u2603, final int \u2603) {
        return this.a.setBytes(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final byte[] \u2603) {
        return this.a.setBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final byte[] \u2603, final int \u2603, final int \u2603) {
        return this.a.setBytes(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf setBytes(final int \u2603, final ByteBuffer \u2603) {
        return this.a.setBytes(\u2603, \u2603);
    }
    
    @Override
    public int setBytes(final int \u2603, final InputStream \u2603, final int \u2603) throws IOException {
        return this.a.setBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int setBytes(final int \u2603, final ScatteringByteChannel \u2603, final int \u2603) throws IOException {
        return this.a.setBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf setZero(final int \u2603, final int \u2603) {
        return this.a.setZero(\u2603, \u2603);
    }
    
    @Override
    public boolean readBoolean() {
        return this.a.readBoolean();
    }
    
    @Override
    public byte readByte() {
        return this.a.readByte();
    }
    
    @Override
    public short readUnsignedByte() {
        return this.a.readUnsignedByte();
    }
    
    @Override
    public short readShort() {
        return this.a.readShort();
    }
    
    @Override
    public int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }
    
    @Override
    public int readMedium() {
        return this.a.readMedium();
    }
    
    @Override
    public int readUnsignedMedium() {
        return this.a.readUnsignedMedium();
    }
    
    @Override
    public int readInt() {
        return this.a.readInt();
    }
    
    @Override
    public long readUnsignedInt() {
        return this.a.readUnsignedInt();
    }
    
    @Override
    public long readLong() {
        return this.a.readLong();
    }
    
    @Override
    public char readChar() {
        return this.a.readChar();
    }
    
    @Override
    public float readFloat() {
        return this.a.readFloat();
    }
    
    @Override
    public double readDouble() {
        return this.a.readDouble();
    }
    
    @Override
    public ByteBuf readBytes(final int \u2603) {
        return this.a.readBytes(\u2603);
    }
    
    @Override
    public ByteBuf readSlice(final int \u2603) {
        return this.a.readSlice(\u2603);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf \u2603) {
        return this.a.readBytes(\u2603);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf \u2603, final int \u2603) {
        return this.a.readBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf \u2603, final int \u2603, final int \u2603) {
        return this.a.readBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] \u2603) {
        return this.a.readBytes(\u2603);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] \u2603, final int \u2603, final int \u2603) {
        return this.a.readBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer \u2603) {
        return this.a.readBytes(\u2603);
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream \u2603, final int \u2603) throws IOException {
        return this.a.readBytes(\u2603, \u2603);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel \u2603, final int \u2603) throws IOException {
        return this.a.readBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf skipBytes(final int \u2603) {
        return this.a.skipBytes(\u2603);
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean \u2603) {
        return this.a.writeBoolean(\u2603);
    }
    
    @Override
    public ByteBuf writeByte(final int \u2603) {
        return this.a.writeByte(\u2603);
    }
    
    @Override
    public ByteBuf writeShort(final int \u2603) {
        return this.a.writeShort(\u2603);
    }
    
    @Override
    public ByteBuf writeMedium(final int \u2603) {
        return this.a.writeMedium(\u2603);
    }
    
    @Override
    public ByteBuf writeInt(final int \u2603) {
        return this.a.writeInt(\u2603);
    }
    
    @Override
    public ByteBuf writeLong(final long \u2603) {
        return this.a.writeLong(\u2603);
    }
    
    @Override
    public ByteBuf writeChar(final int \u2603) {
        return this.a.writeChar(\u2603);
    }
    
    @Override
    public ByteBuf writeFloat(final float \u2603) {
        return this.a.writeFloat(\u2603);
    }
    
    @Override
    public ByteBuf writeDouble(final double \u2603) {
        return this.a.writeDouble(\u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf \u2603) {
        return this.a.writeBytes(\u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf \u2603, final int \u2603) {
        return this.a.writeBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf \u2603, final int \u2603, final int \u2603) {
        return this.a.writeBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] \u2603) {
        return this.a.writeBytes(\u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] \u2603, final int \u2603, final int \u2603) {
        return this.a.writeBytes(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer \u2603) {
        return this.a.writeBytes(\u2603);
    }
    
    @Override
    public int writeBytes(final InputStream \u2603, final int \u2603) throws IOException {
        return this.a.writeBytes(\u2603, \u2603);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel \u2603, final int \u2603) throws IOException {
        return this.a.writeBytes(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf writeZero(final int \u2603) {
        return this.a.writeZero(\u2603);
    }
    
    @Override
    public int indexOf(final int \u2603, final int \u2603, final byte \u2603) {
        return this.a.indexOf(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int bytesBefore(final byte \u2603) {
        return this.a.bytesBefore(\u2603);
    }
    
    @Override
    public int bytesBefore(final int \u2603, final byte \u2603) {
        return this.a.bytesBefore(\u2603, \u2603);
    }
    
    @Override
    public int bytesBefore(final int \u2603, final int \u2603, final byte \u2603) {
        return this.a.bytesBefore(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor \u2603) {
        return this.a.forEachByte(\u2603);
    }
    
    @Override
    public int forEachByte(final int \u2603, final int \u2603, final ByteBufProcessor \u2603) {
        return this.a.forEachByte(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor \u2603) {
        return this.a.forEachByteDesc(\u2603);
    }
    
    @Override
    public int forEachByteDesc(final int \u2603, final int \u2603, final ByteBufProcessor \u2603) {
        return this.a.forEachByteDesc(\u2603, \u2603, \u2603);
    }
    
    @Override
    public ByteBuf copy() {
        return this.a.copy();
    }
    
    @Override
    public ByteBuf copy(final int \u2603, final int \u2603) {
        return this.a.copy(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf slice() {
        return this.a.slice();
    }
    
    @Override
    public ByteBuf slice(final int \u2603, final int \u2603) {
        return this.a.slice(\u2603, \u2603);
    }
    
    @Override
    public ByteBuf duplicate() {
        return this.a.duplicate();
    }
    
    @Override
    public int nioBufferCount() {
        return this.a.nioBufferCount();
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.a.nioBuffer();
    }
    
    @Override
    public ByteBuffer nioBuffer(final int \u2603, final int \u2603) {
        return this.a.nioBuffer(\u2603, \u2603);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int \u2603, final int \u2603) {
        return this.a.internalNioBuffer(\u2603, \u2603);
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.a.nioBuffers();
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int \u2603, final int \u2603) {
        return this.a.nioBuffers(\u2603, \u2603);
    }
    
    @Override
    public boolean hasArray() {
        return this.a.hasArray();
    }
    
    @Override
    public byte[] array() {
        return this.a.array();
    }
    
    @Override
    public int arrayOffset() {
        return this.a.arrayOffset();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.a.hasMemoryAddress();
    }
    
    @Override
    public long memoryAddress() {
        return this.a.memoryAddress();
    }
    
    @Override
    public String toString(final Charset \u2603) {
        return this.a.toString(\u2603);
    }
    
    @Override
    public String toString(final int \u2603, final int \u2603, final Charset \u2603) {
        return this.a.toString(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return this.a.equals(\u2603);
    }
    
    @Override
    public int compareTo(final ByteBuf \u2603) {
        return this.a.compareTo(\u2603);
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    @Override
    public ByteBuf retain(final int \u2603) {
        return this.a.retain(\u2603);
    }
    
    @Override
    public ByteBuf retain() {
        return this.a.retain();
    }
    
    @Override
    public int refCnt() {
        return this.a.refCnt();
    }
    
    @Override
    public boolean release() {
        return this.a.release();
    }
    
    @Override
    public boolean release(final int \u2603) {
        return this.a.release(\u2603);
    }
}
