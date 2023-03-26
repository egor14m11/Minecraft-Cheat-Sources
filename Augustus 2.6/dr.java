import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dr extends a
{
    private float b;
    
    dr() {
    }
    
    public dr(final float \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeFloat(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(96L);
        this.b = \u2603.readFloat();
    }
    
    @Override
    public byte a() {
        return 5;
    }
    
    @Override
    public String toString() {
        return "" + this.b + "f";
    }
    
    @Override
    public eb b() {
        return new dr(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dr dr = (dr)\u2603;
            return this.b == dr.b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.b);
    }
    
    @Override
    public long c() {
        return (long)this.b;
    }
    
    @Override
    public int d() {
        return ns.d(this.b);
    }
    
    @Override
    public short e() {
        return (short)(ns.d(this.b) & 0xFFFF);
    }
    
    @Override
    public byte f() {
        return (byte)(ns.d(this.b) & 0xFF);
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
