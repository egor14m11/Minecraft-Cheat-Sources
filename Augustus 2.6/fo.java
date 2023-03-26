import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fo implements ff<fj>
{
    private int a;
    private cj b;
    private cq c;
    private String d;
    
    public fo() {
    }
    
    public fo(final uq \u2603) {
        this.a = \u2603.F();
        this.b = \u2603.n();
        this.c = \u2603.b;
        this.d = \u2603.c.B;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.d = \u2603.c(uq.a.A);
        this.b = \u2603.c();
        this.c = cq.b(\u2603.readUnsignedByte());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.d);
        \u2603.a(this.b);
        \u2603.writeByte(this.c.b());
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public cj b() {
        return this.b;
    }
    
    public cq c() {
        return this.c;
    }
    
    public String d() {
        return this.d;
    }
}
