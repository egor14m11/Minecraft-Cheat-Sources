import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hw implements ff<fj>
{
    private adm a;
    private cj b;
    private eu[] c;
    
    public hw() {
    }
    
    public hw(final adm \u2603, final cj \u2603, final eu[] \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = new eu[] { \u2603[0], \u2603[1], \u2603[2], \u2603[3] };
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.b = \u2603.c();
        this.c = new eu[4];
        for (int i = 0; i < 4; ++i) {
            this.c[i] = \u2603.d();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.b);
        for (int i = 0; i < 4; ++i) {
            \u2603.a(this.c[i]);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public cj a() {
        return this.b;
    }
    
    public eu[] b() {
        return this.c;
    }
}
