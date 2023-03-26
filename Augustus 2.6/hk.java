import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class hk implements ff<fj>
{
    private int a;
    private List<pz.a> b;
    
    public hk() {
    }
    
    public hk(final int \u2603, final pz \u2603, final boolean \u2603) {
        this.a = \u2603;
        if (\u2603) {
            this.b = \u2603.c();
        }
        else {
            this.b = \u2603.b();
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = pz.b(\u2603);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        pz.a(this.b, \u2603);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public List<pz.a> a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
}
