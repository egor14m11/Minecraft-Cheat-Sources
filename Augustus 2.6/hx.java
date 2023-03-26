import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hx implements ff<fj>
{
    private eu a;
    private eu b;
    
    public hx() {
    }
    
    public hx(final eu \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.d();
        this.b = \u2603.d();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public eu a() {
        return this.a;
    }
    
    public eu b() {
        return this.b;
    }
}
