import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aga extends afc
{
    public static final amn a;
    private final boolean b;
    
    public aga(final boolean \u2603) {
        super(arm.d);
        this.b = \u2603;
        this.j(this.M.b().a((amo<Comparable>)aga.a, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.a(yz.d);
        this.c(0.2f);
        this.a(aga.f);
        this.c("daylightDetector");
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return \u2603.b((amo<Integer>)aga.a);
    }
    
    public void f(final adm \u2603, final cj \u2603) {
        if (\u2603.t.o()) {
            return;
        }
        final alz p = \u2603.p(\u2603);
        int n = \u2603.b(ads.a, \u2603) - \u2603.ab();
        float d = \u2603.d(1.0f);
        final float n2 = (d < 3.1415927f) ? 0.0f : 6.2831855f;
        d += (n2 - d) * 0.2f;
        n = Math.round(n * ns.b(d));
        n = ns.a(n, 0, 15);
        if (this.b) {
            n = 15 - n;
        }
        if (p.b((amo<Integer>)aga.a) != n) {
            \u2603.a(\u2603, p.a((amo<Comparable>)aga.a, n), 3);
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.cn()) {
            return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        if (\u2603.D) {
            return true;
        }
        if (this.b) {
            \u2603.a(\u2603, afi.cl.Q().a((amo<Comparable>)aga.a, (Comparable)\u2603.b((amo<V>)aga.a)), 4);
            afi.cl.f(\u2603, \u2603);
        }
        else {
            \u2603.a(\u2603, afi.cm.Q().a((amo<Comparable>)aga.a, (Comparable)\u2603.b((amo<V>)aga.a)), 4);
            afi.cm.f(\u2603, \u2603);
        }
        return true;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.cl);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.cl);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alb();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aga.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)aga.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aga.a });
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        if (!this.b) {
            super.a(\u2603, \u2603, \u2603);
        }
    }
    
    static {
        a = amn.a("power", 0, 15);
    }
}
