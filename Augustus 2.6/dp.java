import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dp extends a
{
    private double b;
    
    dp() {
    }
    
    public dp(final double \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeDouble(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(128L);
        this.b = \u2603.readDouble();
    }
    
    @Override
    public byte a() {
        return 6;
    }
    
    @Override
    public String toString() {
        return "" + this.b + "d";
    }
    
    @Override
    public eb b() {
        return new dp(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dp dp = (dp)\u2603;
            return this.b == dp.b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.b);
        return super.hashCode() ^ (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public long c() {
        return (long)Math.floor(this.b);
    }
    
    @Override
    public int d() {
        return ns.c(this.b);
    }
    
    @Override
    public short e() {
        return (short)(ns.c(this.b) & 0xFFFF);
    }
    
    @Override
    public byte f() {
        return (byte)(ns.c(this.b) & 0xFF);
    }
    
    @Override
    public double g() {
        return this.b;
    }
    
    @Override
    public float h() {
        return (float)this.b;
    }
}
