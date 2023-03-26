import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class is implements ff<ic>
{
    private int a;
    private a b;
    private int c;
    
    public is() {
    }
    
    public is(final pk \u2603, final a \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    public is(final pk \u2603, final a \u2603, final int \u2603) {
        this.a = \u2603.F();
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.a(a.class);
        this.c = \u2603.e();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
        \u2603.b(this.c);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public a b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f, 
        g;
    }
}
