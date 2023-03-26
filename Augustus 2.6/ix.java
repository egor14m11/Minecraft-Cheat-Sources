import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ix implements ff<ic>
{
    private cj a;
    private eu[] b;
    
    public ix() {
    }
    
    public ix(final cj \u2603, final eu[] \u2603) {
        this.a = \u2603;
        this.b = new eu[] { \u2603[0], \u2603[1], \u2603[2], \u2603[3] };
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c();
        this.b = new eu[4];
        for (int i = 0; i < 4; ++i) {
            final String c = \u2603.c(384);
            final eu a = eu.a.a(c);
            this.b[i] = a;
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        for (int i = 0; i < 4; ++i) {
            final eu \u26032 = this.b[i];
            final String a = eu.a.a(\u26032);
            \u2603.a(a);
        }
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public cj a() {
        return this.a;
    }
    
    public eu[] b() {
        return this.b;
    }
}
