import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agg extends afc
{
    public static final aml a;
    public static final amk b;
    public static final cp<zw, cr> N;
    protected Random O;
    
    protected agg() {
        super(arm.e);
        this.O = new Random();
        this.j(this.M.b().a((amo<Comparable>)agg.a, cq.c).a((amo<Comparable>)agg.b, false));
        this.a(yz.d);
    }
    
    @Override
    public int a(final adm \u2603) {
        return 4;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.c(\u2603, \u2603, \u2603);
        this.e(\u2603, \u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        cq cq = \u2603.b((amo<cq>)agg.a);
        final boolean o = \u2603.p(\u2603.c()).c().o();
        final boolean o2 = \u2603.p(\u2603.d()).c().o();
        if (cq == cq.c && o && !o2) {
            cq = cq.d;
        }
        else if (cq == cq.d && o2 && !o) {
            cq = cq.c;
        }
        else {
            final boolean o3 = \u2603.p(\u2603.e()).c().o();
            final boolean o4 = \u2603.p(\u2603.f()).c().o();
            if (cq == cq.e && o3 && !o4) {
                cq = cq.f;
            }
            else if (cq == cq.f && o4 && !o3) {
                cq = cq.e;
            }
        }
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)agg.a, cq).a((amo<Comparable>)agg.b, false), 2);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof alc) {
            \u2603.a((og)s);
            if (s instanceof ald) {
                \u2603.b(na.O);
            }
            else {
                \u2603.b(na.Q);
            }
        }
        return true;
    }
    
    protected void f(final adm \u2603, final cj \u2603) {
        final cl cl = new cl(\u2603, \u2603);
        final alc alc = cl.h();
        if (alc == null) {
            return;
        }
        final int m = alc.m();
        if (m < 0) {
            \u2603.b(1001, \u2603, 0);
            return;
        }
        final zx a = alc.a(m);
        final cr a2 = this.a(a);
        if (a2 != cr.a) {
            final zx a3 = a2.a(cl, a);
            alc.a(m, (a3.b <= 0) ? null : a3);
        }
    }
    
    protected cr a(final zx \u2603) {
        return agg.N.a((\u2603 == null) ? null : \u2603.b());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final boolean b = \u2603.z(\u2603) || \u2603.z(\u2603.a());
        final boolean booleanValue = \u2603.b((amo<Boolean>)agg.b);
        if (b && !booleanValue) {
            \u2603.a(\u2603, this, this.a(\u2603));
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)agg.b, true), 4);
        }
        else if (!b && booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)agg.b, false), 4);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!\u2603.D) {
            this.f(\u2603, \u2603);
        }
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alc();
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)agg.a, als.a(\u2603, \u2603, \u2603)).a((amo<Comparable>)agg.b, false);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)agg.a, als.a(\u2603, \u2603, \u2603)), 2);
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof alc) {
                ((alc)s).a(\u2603.q());
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alc) {
            oi.a(\u2603, \u2603, (og)s);
            \u2603.e(\u2603, this);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    public static cz a(final ck \u2603) {
        final cq b = b(\u2603.f());
        final double \u26032 = \u2603.a() + 0.7 * b.g();
        final double \u26033 = \u2603.b() + 0.7 * b.h();
        final double \u26034 = \u2603.c() + 0.7 * b.i();
        return new da(\u26032, \u26033, \u26034);
    }
    
    public static cq b(final int \u2603) {
        return cq.a(\u2603 & 0x7);
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return xi.a(\u2603.s(\u2603));
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public alz b(final alz \u2603) {
        return this.Q().a((amo<Comparable>)agg.a, cq.d);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)agg.a, b(\u2603)).a((amo<Comparable>)agg.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)agg.a).a();
        if (\u2603.b((amo<Boolean>)agg.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agg.a, agg.b });
    }
    
    static {
        a = aml.a("facing");
        b = amk.a("triggered");
        N = new cp<zw, cr>(new cn());
    }
}
