import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gf implements ff<fj>
{
    private int a;
    private int b;
    private zx c;
    
    public gf() {
    }
    
    public gf(final int \u2603, final int \u2603, final zx \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = ((\u2603 == null) ? null : \u2603.k());
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
        this.b = \u2603.readShort();
        this.c = \u2603.i();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeShort(this.b);
        \u2603.a(this.c);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public zx c() {
        return this.c;
    }
}
