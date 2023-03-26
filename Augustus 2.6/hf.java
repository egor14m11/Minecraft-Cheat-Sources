import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hf implements ff<fj>
{
    private int a;
    private byte b;
    
    public hf() {
    }
    
    public hf(final pk \u2603, final byte \u2603) {
        this.a = \u2603.F();
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public pk a(final adm \u2603) {
        return \u2603.a(this.a);
    }
    
    public byte a() {
        return this.b;
    }
}
