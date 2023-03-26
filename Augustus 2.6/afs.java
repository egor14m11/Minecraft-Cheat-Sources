import com.google.common.base.Predicate;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class afs extends afc
{
    public static final aml a;
    public final int b;
    
    protected afs(final int \u2603) {
        super(arm.d);
        this.j(this.M.b().a((amo<Comparable>)afs.a, cq.c));
        this.b = \u2603;
        this.a(yz.c);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
    public int b() {
        return 2;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        if (\u2603.p(\u2603.c()).c() == this) {
            this.a(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        }
        else if (\u2603.p(\u2603.d()).c() == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        }
        else if (\u2603.p(\u2603.e()).c() == this) {
            this.a(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
        else if (\u2603.p(\u2603.f()).c() == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        }
        else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
        for (final cq \u26032 : cq.c.a) {
            final cj a = \u2603.a(\u26032);
            final alz p = \u2603.p(a);
            if (p.c() == this) {
                this.e(\u2603, a, p);
            }
        }
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)afs.a, \u2603.aP());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, alz \u2603, final pr \u2603, final zx \u2603) {
        final cq d = cq.b(ns.c(\u2603.y * 4.0f / 360.0f + 0.5) & 0x3).d();
        \u2603 = \u2603.a((amo<Comparable>)afs.a, d);
        final cj c = \u2603.c();
        final cj d2 = \u2603.d();
        final cj e = \u2603.e();
        final cj f = \u2603.f();
        final boolean b = this == \u2603.p(c).c();
        final boolean b2 = this == \u2603.p(d2).c();
        final boolean b3 = this == \u2603.p(e).c();
        final boolean b4 = this == \u2603.p(f).c();
        if (b || b2 || b3 || b4) {
            if (d.k() == cq.a.a && (b || b2)) {
                if (b) {
                    \u2603.a(c, \u2603, 3);
                }
                else {
                    \u2603.a(d2, \u2603, 3);
                }
                \u2603.a(\u2603, \u2603, 3);
            }
            else if (d.k() == cq.a.c && (b3 || b4)) {
                if (b3) {
                    \u2603.a(e, \u2603, 3);
                }
                else {
                    \u2603.a(f, \u2603, 3);
                }
                \u2603.a(\u2603, \u2603, 3);
            }
        }
        else {
            \u2603.a(\u2603, \u2603, 3);
        }
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof aky) {
                ((aky)s).a(\u2603.q());
            }
        }
    }
    
    public alz e(final adm \u2603, final cj \u2603, alz \u2603) {
        if (\u2603.D) {
            return \u2603;
        }
        final alz p = \u2603.p(\u2603.c());
        final alz p2 = \u2603.p(\u2603.d());
        final alz p3 = \u2603.p(\u2603.e());
        final alz p4 = \u2603.p(\u2603.f());
        cq cq = \u2603.b((amo<cq>)afs.a);
        final afh c = p.c();
        final afh c2 = p2.c();
        final afh c3 = p3.c();
        final afh c4 = p4.c();
        if (c == this || c2 == this) {
            final cj cj = (c == this) ? \u2603.c() : \u2603.d();
            final alz p5 = \u2603.p(cj.e());
            final alz p6 = \u2603.p(cj.f());
            cq = cq.f;
            cq cq2;
            if (c == this) {
                cq2 = p.b((amo<cq>)afs.a);
            }
            else {
                cq2 = p2.b((amo<cq>)afs.a);
            }
            if (cq2 == cq.e) {
                cq = cq.e;
            }
            final afh c5 = p5.c();
            final afh c6 = p6.c();
            if ((c3.o() || c5.o()) && !c4.o() && !c6.o()) {
                cq = cq.f;
            }
            if ((c4.o() || c6.o()) && !c3.o() && !c5.o()) {
                cq = cq.e;
            }
        }
        else {
            final boolean o = c.o();
            final boolean o2 = c2.o();
            if (c3 == this || c4 == this) {
                final cj cj2 = (c3 == this) ? \u2603.e() : \u2603.f();
                final alz p7 = \u2603.p(cj2.c());
                final alz p8 = \u2603.p(cj2.d());
                cq = cq.d;
                cq cq3;
                if (c3 == this) {
                    cq3 = p3.b((amo<cq>)afs.a);
                }
                else {
                    cq3 = p4.b((amo<cq>)afs.a);
                }
                if (cq3 == cq.c) {
                    cq = cq.c;
                }
                final afh c7 = p7.c();
                final afh c8 = p8.c();
                if ((o || c7.o()) && !o2 && !c8.o()) {
                    cq = cq.d;
                }
                if ((o2 || c8.o()) && !o && !c7.o()) {
                    cq = cq.c;
                }
            }
        }
        \u2603 = \u2603.a((amo<Comparable>)afs.a, cq);
        \u2603.a(\u2603, \u2603, 3);
        return \u2603;
    }
    
    public alz f(final adm \u2603, final cj \u2603, final alz \u2603) {
        cq cq = null;
        for (final cq \u26032 : cq.c.a) {
            final alz p = \u2603.p(\u2603.a(\u26032));
            if (p.c() == this) {
                return \u2603;
            }
            if (!p.c().o()) {
                continue;
            }
            if (cq != null) {
                cq = null;
                break;
            }
            cq = \u26032;
        }
        if (cq != null) {
            return \u2603.a((amo<Comparable>)afs.a, cq.d());
        }
        cq \u26033 = \u2603.b((amo<cq>)afs.a);
        if (\u2603.p(\u2603.a(\u26033)).c().o()) {
            \u26033 = \u26033.d();
        }
        if (\u2603.p(\u2603.a(\u26033)).c().o()) {
            \u26033 = \u26033.e();
        }
        if (\u2603.p(\u2603.a(\u26033)).c().o()) {
            \u26033 = \u26033.d();
        }
        return \u2603.a((amo<Comparable>)afs.a, \u26033);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        int n = 0;
        final cj e = \u2603.e();
        final cj f = \u2603.f();
        final cj c = \u2603.c();
        final cj d = \u2603.d();
        if (\u2603.p(e).c() == this) {
            if (this.m(\u2603, e)) {
                return false;
            }
            ++n;
        }
        if (\u2603.p(f).c() == this) {
            if (this.m(\u2603, f)) {
                return false;
            }
            ++n;
        }
        if (\u2603.p(c).c() == this) {
            if (this.m(\u2603, c)) {
                return false;
            }
            ++n;
        }
        if (\u2603.p(d).c() == this) {
            if (this.m(\u2603, d)) {
                return false;
            }
            ++n;
        }
        return n <= 1;
    }
    
    private boolean m(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).c() != this) {
            return false;
        }
        for (final cq \u26032 : cq.c.a) {
            if (\u2603.p(\u2603.a(\u26032)).c() == this) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        final akw s = \u2603.s(\u2603);
        if (s instanceof aky) {
            s.E();
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof og) {
            oi.a(\u2603, \u2603, (og)s);
            \u2603.e(\u2603, this);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final oo f = this.f(\u2603, \u2603);
        if (f != null) {
            \u2603.a((og)f);
            if (this.b == 0) {
                \u2603.b(na.aa);
            }
            else if (this.b == 1) {
                \u2603.b(na.U);
            }
        }
        return true;
    }
    
    public oo f(final adm \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (!(s instanceof aky)) {
            return null;
        }
        oo oo = (aky)s;
        if (this.n(\u2603, \u2603)) {
            return null;
        }
        for (final cq \u26032 : cq.c.a) {
            final cj a = \u2603.a(\u26032);
            final afh c = \u2603.p(a).c();
            if (c == this) {
                if (this.n(\u2603, a)) {
                    return null;
                }
                final akw s2 = \u2603.s(a);
                if (!(s2 instanceof aky)) {
                    continue;
                }
                if (\u26032 == cq.e || \u26032 == cq.c) {
                    oo = new of("container.chestDouble", (oo)s2, oo);
                }
                else {
                    oo = new of("container.chestDouble", oo, (oo)s2);
                }
            }
        }
        return oo;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new aky();
    }
    
    @Override
    public boolean i() {
        return this.b == 1;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!this.i()) {
            return 0;
        }
        int l = 0;
        final akw s = \u2603.s(\u2603);
        if (s instanceof aky) {
            l = ((aky)s).l;
        }
        return ns.a(l, 0, 15);
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (\u2603 == cq.b) {
            return this.a(\u2603, \u2603, \u2603, \u2603);
        }
        return 0;
    }
    
    private boolean n(final adm \u2603, final cj \u2603) {
        return this.o(\u2603, \u2603) || this.p(\u2603, \u2603);
    }
    
    private boolean o(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603.a()).c().v();
    }
    
    private boolean p(final adm \u2603, final cj \u2603) {
        for (final pk pk : \u2603.a((Class<? extends pk>)ts.class, new aug(\u2603.n(), \u2603.o() + 1, \u2603.p(), \u2603.n() + 1, \u2603.o() + 2, \u2603.p() + 1))) {
            final ts ts = (ts)pk;
            if (ts.cn()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return xi.b(this.f(\u2603, \u2603));
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = cq.a(\u2603);
        if (cq.k() == cq.a.b) {
            cq = cq.c;
        }
        return this.Q().a((amo<Comparable>)afs.a, cq);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)afs.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afs.a });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
    }
}
