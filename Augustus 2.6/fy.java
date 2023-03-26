import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fy implements ff<fj>
{
    private eu a;
    private byte b;
    
    public fy() {
    }
    
    public fy(final eu \u2603) {
        this(\u2603, (byte)1);
    }
    
    public fy(final eu \u2603, final byte \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.d();
        this.b = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public eu a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b == 1 || this.b == 2;
    }
    
    public byte c() {
        return this.b;
    }
}
