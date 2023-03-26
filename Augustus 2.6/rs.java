// 
// Decompiled by Procyon v0.5.36
// 

public class rs extends ro
{
    private final ts c;
    
    public rs(final ts \u2603, final double \u2603) {
        super(\u2603, \u2603, 8);
        this.c = \u2603;
    }
    
    @Override
    public boolean a() {
        return this.c.cl() && !this.c.cn() && super.a();
    }
    
    @Override
    public boolean b() {
        return super.b();
    }
    
    @Override
    public void c() {
        super.c();
        this.c.cp().a(false);
    }
    
    @Override
    public void d() {
        super.d();
        this.c.n(false);
    }
    
    @Override
    public void e() {
        super.e();
        this.c.cp().a(false);
        if (!this.f()) {
            this.c.n(false);
        }
        else if (!this.c.cn()) {
            this.c.n(true);
        }
    }
    
    @Override
    protected boolean a(final adm \u2603, final cj \u2603) {
        if (!\u2603.d(\u2603.a())) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (c == afi.ae) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof aky && ((aky)s).l < 1) {
                return true;
            }
        }
        else {
            if (c == afi.am) {
                return true;
            }
            if (c == afi.C && p.b(afg.a) != afg.a.a) {
                return true;
            }
        }
        return false;
    }
}
