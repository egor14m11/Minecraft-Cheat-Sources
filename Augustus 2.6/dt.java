import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dt extends a
{
    private int b;
    
    dt() {
    }
    
    public dt(final int \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeInt(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(96L);
        this.b = \u2603.readInt();
    }
    
    @Override
    public byte a() {
        return 3;
    }
    
    @Override
    public String toString() {
        return "" + this.b;
    }
    
    @Override
    public eb b() {
        return new dt(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dt dt = (dt)\u2603;
            return this.b == dt.b;
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
        return (short)(this.b & 0xFFFF);
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
        return (float)this.b;
    }
}
