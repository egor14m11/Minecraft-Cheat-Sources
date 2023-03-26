import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fv implements ff<fj>
{
    private cj a;
    private alz b;
    
    public fv() {
    }
    
    public fv(final adm \u2603, final cj \u2603) {
        this.a = \u2603;
        this.b = \u2603.p(\u2603);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c();
        this.b = afh.d.a(\u2603.e());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.b(afh.d.b(this.b));
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public alz a() {
        return this.b;
    }
    
    public cj b() {
        return this.a;
    }
}
