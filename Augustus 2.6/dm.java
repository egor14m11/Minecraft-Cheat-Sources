import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dm extends a
{
    private byte b;
    
    dm() {
    }
    
    public dm(final byte \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeByte(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(72L);
        this.b = \u2603.readByte();
    }
    
    @Override
    public byte a() {
        return 1;
    }
    
    @Override
    public String toString() {
        return "" + this.b + "b";
    }
    
    @Override
    public eb b() {
        return new dm(this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dm dm = (dm)\u2603;
            return this.b == dm.b;
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
        return this.b;
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
