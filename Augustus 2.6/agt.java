import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class agt extends afh
{
    public static final amk a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    
    public agt(final arm \u2603) {
        this(\u2603, \u2603.r());
    }
    
    public agt(final arm \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.j(this.M.b().a((amo<Comparable>)agt.a, false).a((amo<Comparable>)agt.b, false).a((amo<Comparable>)agt.N, false).a((amo<Comparable>)agt.O, false));
        this.a(yz.c);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        final boolean e = this.e(\u2603, \u2603.c());
        final boolean e2 = this.e(\u2603, \u2603.d());
        final boolean e3 = this.e(\u2603, \u2603.e());
        final boolean e4 = this.e(\u2603, \u2603.f());
        float \u26032 = 0.375f;
        float \u26033 = 0.625f;
        float \u26034 = 0.375f;
        float \u26035 = 0.625f;
        if (e) {
            \u26034 = 0.0f;
        }
        if (e2) {
            \u26035 = 1.0f;
        }
        if (e || e2) {
            this.a(\u26032, 0.0f, \u26034, \u26033, 1.5f, \u26035);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        \u26034 = 0.375f;
        \u26035 = 0.625f;
        if (e3) {
            \u26032 = 0.0f;
        }
        if (e4) {
            \u26033 = 1.0f;
        }
        if (e3 || e4 || (!e && !e2)) {
            this.a(\u26032, 0.0f, \u26034, \u26033, 1.5f, \u26035);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        if (e) {
            \u26034 = 0.0f;
        }
        if (e2) {
            \u26035 = 1.0f;
        }
        this.a(\u26032, 0.0f, \u26034, \u26033, 1.0f, \u26035);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final boolean e = this.e(\u2603, \u2603.c());
        final boolean e2 = this.e(\u2603, \u2603.d());
        final boolean e3 = this.e(\u2603, \u2603.e());
        final boolean e4 = this.e(\u2603, \u2603.f());
        float \u26032 = 0.375f;
        float \u26033 = 0.625f;
        float \u26034 = 0.375f;
        float \u26035 = 0.625f;
        if (e) {
            \u26034 = 0.0f;
        }
        if (e2) {
            \u26035 = 1.0f;
        }
        if (e3) {
            \u26032 = 0.0f;
        }
        if (e4) {
            \u26033 = 1.0f;
        }
        this.a(\u26032, 0.0f, \u26034, \u26033, 1.0f, \u26035);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return false;
    }
    
    public boolean e(final adq \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603).c();
        return c != afi.cv && ((c instanceof agt && c.J == this.J) || c instanceof agu || (c.J.k() && c.d() && c.J != arm.C));
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        return \u2603.D || zz.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return 0;
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)agt.a, this.e(\u2603, \u2603.c())).a((amo<Comparable>)agt.b, this.e(\u2603, \u2603.f())).a((amo<Comparable>)agt.N, this.e(\u2603, \u2603.d())).a((amo<Comparable>)agt.O, this.e(\u2603, \u2603.e()));
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agt.a, agt.b, agt.O, agt.N });
    }
    
    static {
        a = amk.a("north");
        b = amk.a("east");
        N = amk.a("south");
        O = amk.a("west");
    }
}
