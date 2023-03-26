import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gw implements ff<fj>
{
    private cj a;
    
    public gw() {
    }
    
    public gw(final cj \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
    }
    
    public cj a() {
        return this.a;
    }
}
