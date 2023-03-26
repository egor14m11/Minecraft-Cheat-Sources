import com.google.common.base.Predicate;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class alj extends alk implements ali, km
{
    private zx[] a;
    private String f;
    private int g;
    
    public alj() {
        this.a = new zx[5];
        this.g = -1;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.a = new zx[this.o_()];
        if (\u2603.b("CustomName", 8)) {
            this.f = \u2603.j("CustomName");
        }
        this.g = \u2603.f("TransferCooldown");
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int d = b.d("Slot");
            if (d >= 0 && d < this.a.length) {
                this.a[d] = zx.a(b);
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final du \u26032 = new du();
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.a[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
        \u2603.a("TransferCooldown", this.g);
        if (this.l_()) {
            \u2603.a("CustomName", this.f);
        }
    }
    
    @Override
    public void p_() {
        super.p_();
    }
    
    @Override
    public int o_() {
        return this.a.length;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.a[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.a[\u2603] == null) {
            return null;
        }
        if (this.a[\u2603].b <= \u2603) {
            final zx a = this.a[\u2603];
            this.a[\u2603] = null;
            return a;
        }
        final zx a = this.a[\u2603].a(\u2603);
        if (this.a[\u2603].b == 0) {
            this.a[\u2603] = null;
        }
        return a;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.a[\u2603] != null) {
            final zx zx = this.a[\u2603];
            this.a[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.a[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.f : "container.hopper";
    }
    
    @Override
    public boolean l_() {
        return this.f != null && this.f.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.b.s(this.c) == this && \u2603.e(this.c.n() + 0.5, this.c.o() + 0.5, this.c.p() + 0.5) <= 64.0;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return true;
    }
    
    @Override
    public void c() {
        if (this.b == null || this.b.D) {
            return;
        }
        --this.g;
        if (!this.n()) {
            this.d(0);
            this.m();
        }
    }
    
    public boolean m() {
        if (this.b == null || this.b.D) {
            return false;
        }
        if (!this.n() && ahn.f(this.u())) {
            boolean r = false;
            if (!this.p()) {
                r = this.r();
            }
            if (!this.q()) {
                r = (a(this) || r);
            }
            if (r) {
                this.d(8);
                this.p_();
                return true;
            }
        }
        return false;
    }
    
    private boolean p() {
        for (final zx zx : this.a) {
            if (zx != null) {
                return false;
            }
        }
        return true;
    }
    
    private boolean q() {
        for (final zx zx : this.a) {
            if (zx == null || zx.b != zx.c()) {
                return false;
            }
        }
        return true;
    }
    
    private boolean r() {
        final og h = this.H();
        if (h == null) {
            return false;
        }
        final cq d = ahn.b(this.u()).d();
        if (this.a(h, d)) {
            return false;
        }
        for (int i = 0; i < this.o_(); ++i) {
            if (this.a(i) != null) {
                final zx k = this.a(i).k();
                final zx a = a(h, this.a(i, 1), d);
                if (a == null || a.b == 0) {
                    h.p_();
                    return true;
                }
                this.a(i, k);
            }
        }
        return false;
    }
    
    private boolean a(final og \u2603, final cq \u2603) {
        if (\u2603 instanceof ot) {
            final ot ot = (ot)\u2603;
            final int[] a = ot.a(\u2603);
            for (int i = 0; i < a.length; ++i) {
                final zx a2 = ot.a(a[i]);
                if (a2 == null || a2.b != a2.c()) {
                    return false;
                }
            }
        }
        else {
            for (int o_ = \u2603.o_(), j = 0; j < o_; ++j) {
                final zx a3 = \u2603.a(j);
                if (a3 == null || a3.b != a3.c()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean b(final og \u2603, final cq \u2603) {
        if (\u2603 instanceof ot) {
            final ot ot = (ot)\u2603;
            final int[] a = ot.a(\u2603);
            for (int i = 0; i < a.length; ++i) {
                if (ot.a(a[i]) != null) {
                    return false;
                }
            }
        }
        else {
            for (int o_ = \u2603.o_(), j = 0; j < o_; ++j) {
                if (\u2603.a(j) != null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean a(final ali \u2603) {
        final og b = b(\u2603);
        if (b != null) {
            final cq a = cq.a;
            if (b(b, a)) {
                return false;
            }
            if (b instanceof ot) {
                final ot ot = (ot)b;
                final int[] a2 = ot.a(a);
                for (int i = 0; i < a2.length; ++i) {
                    if (a(\u2603, b, a2[i], a)) {
                        return true;
                    }
                }
            }
            else {
                for (int o_ = b.o_(), j = 0; j < o_; ++j) {
                    if (a(\u2603, b, j, a)) {
                        return true;
                    }
                }
            }
        }
        else {
            for (final uz \u26032 : a(\u2603.z(), \u2603.A(), \u2603.B() + 1.0, \u2603.C())) {
                if (a(\u2603, \u26032)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean a(final ali \u2603, final og \u2603, final int \u2603, final cq \u2603) {
        final zx a = \u2603.a(\u2603);
        if (a != null && b(\u2603, a, \u2603, \u2603)) {
            final zx k = a.k();
            final zx a2 = a(\u2603, \u2603.a(\u2603, 1), null);
            if (a2 == null || a2.b == 0) {
                \u2603.p_();
                return true;
            }
            \u2603.a(\u2603, k);
        }
        return false;
    }
    
    public static boolean a(final og \u2603, final uz \u2603) {
        boolean b = false;
        if (\u2603 == null) {
            return false;
        }
        final zx k = \u2603.l().k();
        final zx a = a(\u2603, k, null);
        if (a == null || a.b == 0) {
            b = true;
            \u2603.J();
        }
        else {
            \u2603.a(a);
        }
        return b;
    }
    
    public static zx a(final og \u2603, zx \u2603, final cq \u2603) {
        if (\u2603 instanceof ot && \u2603 != null) {
            final ot ot = (ot)\u2603;
            final int[] a = ot.a(\u2603);
            for (int n = 0; n < a.length && \u2603 != null && \u2603.b > 0; \u2603 = c(\u2603, \u2603, a[n], \u2603), ++n) {}
        }
        else {
            for (int o_ = \u2603.o_(), \u26032 = 0; \u26032 < o_ && \u2603 != null && \u2603.b > 0; \u2603 = c(\u2603, \u2603, \u26032, \u2603), ++\u26032) {}
        }
        if (\u2603 != null && \u2603.b == 0) {
            \u2603 = null;
        }
        return \u2603;
    }
    
    private static boolean a(final og \u2603, final zx \u2603, final int \u2603, final cq \u2603) {
        return \u2603.b(\u2603, \u2603) && (!(\u2603 instanceof ot) || ((ot)\u2603).a(\u2603, \u2603, \u2603));
    }
    
    private static boolean b(final og \u2603, final zx \u2603, final int \u2603, final cq \u2603) {
        return !(\u2603 instanceof ot) || ((ot)\u2603).b(\u2603, \u2603, \u2603);
    }
    
    private static zx c(final og \u2603, zx \u2603, final int \u2603, final cq \u2603) {
        final zx a = \u2603.a(\u2603);
        if (a(\u2603, \u2603, \u2603, \u2603)) {
            boolean b = false;
            if (a == null) {
                \u2603.a(\u2603, \u2603);
                \u2603 = null;
                b = true;
            }
            else if (a(a, \u2603)) {
                final int b2 = \u2603.c() - a.b;
                final int min = Math.min(\u2603.b, b2);
                final zx zx = \u2603;
                zx.b -= min;
                final zx zx2 = a;
                zx2.b += min;
                b = (min > 0);
            }
            if (b) {
                if (\u2603 instanceof alj) {
                    final alj alj = (alj)\u2603;
                    if (alj.o()) {
                        alj.d(8);
                    }
                    \u2603.p_();
                }
                \u2603.p_();
            }
        }
        return \u2603;
    }
    
    private og H() {
        final cq b = ahn.b(this.u());
        return b(this.z(), this.c.n() + b.g(), this.c.o() + b.h(), this.c.p() + b.i());
    }
    
    public static og b(final ali \u2603) {
        return b(\u2603.z(), \u2603.A(), \u2603.B() + 1.0, \u2603.C());
    }
    
    public static List<uz> a(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return \u2603.a((Class<? extends uz>)uz.class, new aug(\u2603 - 0.5, \u2603 - 0.5, \u2603 - 0.5, \u2603 + 0.5, \u2603 + 0.5, \u2603 + 0.5), (Predicate<? super uz>)po.a);
    }
    
    public static og b(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        og f = null;
        final int c = ns.c(\u2603);
        final int c2 = ns.c(\u2603);
        final int c3 = ns.c(\u2603);
        final cj \u26032 = new cj(c, c2, c3);
        final afh c4 = \u2603.p(\u26032).c();
        if (c4.z()) {
            final akw s = \u2603.s(\u26032);
            if (s instanceof og) {
                f = (og)s;
                if (f instanceof aky && c4 instanceof afs) {
                    f = ((afs)c4).f(\u2603, \u26032);
                }
            }
        }
        if (f == null) {
            final List<pk> a = \u2603.a((pk)null, new aug(\u2603 - 0.5, \u2603 - 0.5, \u2603 - 0.5, \u2603 + 0.5, \u2603 + 0.5, \u2603 + 0.5), po.c);
            if (a.size() > 0) {
                f = (og)a.get(\u2603.s.nextInt(a.size()));
            }
        }
        return f;
    }
    
    private static boolean a(final zx \u2603, final zx \u2603) {
        return \u2603.b() == \u2603.b() && \u2603.i() == \u2603.i() && \u2603.b <= \u2603.c() && zx.a(\u2603, \u2603);
    }
    
    @Override
    public double A() {
        return this.c.n() + 0.5;
    }
    
    @Override
    public double B() {
        return this.c.o() + 0.5;
    }
    
    @Override
    public double C() {
        return this.c.p() + 0.5;
    }
    
    public void d(final int \u2603) {
        this.g = \u2603;
    }
    
    public boolean n() {
        return this.g > 0;
    }
    
    public boolean o() {
        return this.g <= 1;
    }
    
    @Override
    public String k() {
        return "minecraft:hopper";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xw(\u2603, this, \u2603);
    }
    
    @Override
    public int a_(final int \u2603) {
        return 0;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
    }
}
