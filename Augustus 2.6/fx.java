import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fx implements ff<fj>
{
    private String[] a;
    
    public fx() {
    }
    
    public fx(final String[] \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = new String[\u2603.e()];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = \u2603.c(32767);
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a.length);
        for (final String \u26032 : this.a) {
            \u2603.a(\u26032);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String[] a() {
        return this.a;
    }
}
