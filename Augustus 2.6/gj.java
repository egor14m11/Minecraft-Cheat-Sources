import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gj implements ff<fj>
{
    private int a;
    private dn b;
    
    public gj() {
    }
    
    public gj(final int \u2603, final dn \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.h();
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
    
    public dn a() {
        return this.b;
    }
    
    public pk a(final adm \u2603) {
        return \u2603.a(this.a);
    }
}
