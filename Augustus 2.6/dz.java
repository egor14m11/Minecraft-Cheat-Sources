import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dz extends a
{
    private short b;
    
    public dz() {
    }
    
    public dz(final short \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeShort(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(80L);
        this.b = \u2603.readShort();
    }
    
    @Override
    public byte a() {
        return 2;
    }
    
    @Override
    public String toString() {
        return "" + this.b + "s";
    }
    
    @Override
    public eb b() {
        return new dz(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dz dz = (dz)\u2603;
            return this.b == dz.b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public int d() {
        return this.b;
    }
    
    @Override
    public short e() {
        return this.b;
    }
    
    @Override
    public byte f() {
        return (byte)(this.b & 0xFF);
    }
    
    @Override
    public double g() {
        return this.b;
    }
    
    @Override
    public float h() {
        return this.b;
    }
}
