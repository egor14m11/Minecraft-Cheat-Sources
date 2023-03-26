import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hq implements ff<fj>
{
    private String a;
    private String b;
    private auu.a c;
    private int d;
    
    public hq() {
    }
    
    public hq(final auk \u2603, final int \u2603) {
        this.a = \u2603.b();
        this.b = \u2603.d();
        this.c = \u2603.c().c();
        this.d = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(16);
        this.d = \u2603.readByte();
        if (this.d == 0 || this.d == 2) {
            this.b = \u2603.c(32);
            this.c = auu.a.a(\u2603.c(16));
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte(this.d);
        if (this.d == 0 || this.d == 2) {
            \u2603.a(this.b);
            \u2603.a(this.c.a());
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public int c() {
        return this.d;
    }
    
    public auu.a d() {
        return this.c;
    }
}
