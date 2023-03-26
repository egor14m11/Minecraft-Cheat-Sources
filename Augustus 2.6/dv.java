import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dv extends a
{
    private long b;
    
    dv() {
    }
    
    public dv(final long \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeLong(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(128L);
        this.b = \u2603.readLong();
    }
    
    @Override
    public byte a() {
        return 4;
    }
    
    @Override
    public String toString() {
        return "" + this.b + "L";
    }
    
    @Override
    public eb b() {
        return new dv(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dv dv = (dv)\u2603;
            return this.b == dv.b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public int d() {
        return (int)(this.b & -1L);
    }
    
    @Override
    public short e() {
        return (short)(this.b & 0xFFFFL);
    }
    
    @Override
    public byte f() {
        return (byte)(this.b & 0xFFL);
    }
    
    @Override
    public double g() {
        return (double)this.b;
    }
    
    @Override
    public float h() {
        return (float)this.b;
    }
}
