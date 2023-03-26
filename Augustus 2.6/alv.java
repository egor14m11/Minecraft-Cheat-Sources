import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class alv extends afc
{
    public static final aml a;
    public static final amm<alt.a> b;
    
    public alv() {
        super(arm.H);
        this.j(this.M.b().a((amo<Comparable>)alv.a, cq.c).a(alv.b, alt.a.a));
        this.c(-1.0f);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return null;
    }
    
    public static akw a(final alz \u2603, final cq \u2603, final boolean \u2603, final boolean \u2603) {
        return new alu(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alu) {
            ((alu)s).h();
        }
        else {
            super.b(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return false;
    }
    
    @Override
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return false;
    }
    
    @Override
    public void d(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cj a = \u2603.a(\u2603.b((amo<cq>)alv.a).d());
        final alz p = \u2603.p(a);
        if (p.c() instanceof als && p.b((amo<Boolean>)als.b)) {
            \u2603.g(a);
        }
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
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.D && \u2603.s(\u2603) == null) {
            \u2603.g(\u2603);
            return true;
        }
        return false;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (\u2603.D) {
            return;
        }
        final alu e = this.e((adq)\u2603, \u2603);
        if (e == null) {
            return;
        }
        final alz b = e.b();
        b.c().b(\u2603, \u2603, b, 0);
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        return null;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!\u2603.D) {
            \u2603.s(\u2603);
        }
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        final alu e = this.e((adq)\u2603, \u2603);
        if (e == null) {
            return null;
        }
        float a = e.a(0.0f);
        if (e.d()) {
            a = 1.0f - a;
        }
        return this.a(\u2603, \u2603, e.b(), a, e.e());
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alu e = this.e(\u2603, \u2603);
        if (e != null) {
            final alz b = e.b();
            final afh c = b.c();
            if (c == this || c.t() == arm.a) {
                return;
            }
            float a = e.a(0.0f);
            if (e.d()) {
                a = 1.0f - a;
            }
            c.a(\u2603, \u2603);
            if (c == afi.J || c == afi.F) {
                a = 0.0f;
            }
            final cq e2 = e.e();
            this.B = c.B() - e2.g() * a;
            this.C = c.D() - e2.h() * a;
            this.D = c.F() - e2.i() * a;
            this.E = c.C() - e2.g() * a;
            this.F = c.E() - e2.h() * a;
            this.G = c.G() - e2.i() * a;
        }
    }
    
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final cq \u2603) {
        if (\u2603.c() == this || \u2603.c().t() == arm.a) {
            return null;
        }
        final aug a = \u2603.c().a(\u2603, \u2603, \u2603);
        if (a == null) {
            return null;
        }
        double a2 = a.a;
        double b = a.b;
        double c = a.c;
        double d = a.d;
        double e = a.e;
        double f = a.f;
        if (\u2603.g() < 0) {
            a2 -= \u2603.g() * \u2603;
        }
        else {
            d -= \u2603.g() * \u2603;
        }
        if (\u2603.h() < 0) {
            b -= \u2603.h() * \u2603;
        }
        else {
            e -= \u2603.h() * \u2603;
        }
        if (\u2603.i() < 0) {
            c -= \u2603.i() * \u2603;
        }
        else {
            f -= \u2603.i() * \u2603;
        }
        return new aug(a2, b, c, d, e, f);
    }
    
    private alu e(final adq \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alu) {
            return (alu)s;
        }
        return null;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)alv.a, alt.b(\u2603)).a(alv.b, ((\u2603 & 0x8) > 0) ? alt.a.b : alt.a.a);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)alv.a).a();
        if (\u2603.b(alv.b) == alt.a.b) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { alv.a, alv.b });
    }
    
    static {
        a = alt.a;
        b = alt.b;
    }
}
