import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ha implements ff<fj>
{
    private int a;
    private cj b;
    
    public ha() {
    }
    
    public ha(final wn \u2603, final cj \u2603) {
        this.a = \u2603.F();
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.c();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public wn a(final adm \u2603) {
        return (wn)\u2603.a(this.a);
    }
    
    public cj a() {
        return this.b;
    }
}
