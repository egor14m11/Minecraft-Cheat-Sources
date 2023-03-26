import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hn implements ff<fj>
{
    private int a;
    private int b;
    private zx c;
    
    public hn() {
    }
    
    public hn(final int \u2603, final int \u2603, final zx \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = ((\u2603 == null) ? null : \u2603.k());
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readShort();
        this.c = \u2603.i();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeShort(this.b);
        \u2603.a(this.c);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public zx a() {
        return this.c;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
}
