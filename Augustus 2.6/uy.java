import java.util.List;
import com.google.common.collect.Lists;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class uy extends pk
{
    private alz d;
    public int a;
    public boolean b;
    private boolean e;
    private boolean f;
    private int g;
    private float h;
    public dn c;
    
    public uy(final adm \u2603) {
        super(\u2603);
        this.b = true;
        this.g = 40;
        this.h = 2.0f;
    }
    
    public uy(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final alz \u2603) {
        super(\u2603);
        this.b = true;
        this.g = 40;
        this.h = 2.0f;
        this.d = \u2603;
        this.k = true;
        this.a(0.98f, 0.98f);
        this.b(\u2603, \u2603, \u2603);
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = \u2603;
        this.q = \u2603;
        this.r = \u2603;
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    public boolean ad() {
        return !this.I;
    }
    
    @Override
    public void t_() {
        final afh c = this.d.c();
        if (c.t() == arm.a) {
            this.J();
            return;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.a++ == 0) {
            final cj \u2603 = new cj(this);
            if (this.o.p(\u2603).c() == c) {
                this.o.g(\u2603);
            }
            else if (!this.o.D) {
                this.J();
                return;
            }
        }
        this.w -= 0.03999999910593033;
        this.d(this.v, this.w, this.x);
        this.v *= 0.9800000190734863;
        this.w *= 0.9800000190734863;
        this.x *= 0.9800000190734863;
        if (!this.o.D) {
            final cj \u2603 = new cj(this);
            if (this.C) {
                this.v *= 0.699999988079071;
                this.x *= 0.699999988079071;
                this.w *= -0.5;
                if (this.o.p(\u2603).c() != afi.M) {
                    this.J();
                    if (!this.e) {
                        if (this.o.a(c, \u2603, true, cq.b, null, null) && !agr.e(this.o, \u2603.b()) && this.o.a(\u2603, this.d, 3)) {
                            if (c instanceof agr) {
                                ((agr)c).a_(this.o, \u2603);
                            }
                            if (this.c != null && c instanceof agq) {
                                final akw s = this.o.s(\u2603);
                                if (s != null) {
                                    final dn dn = new dn();
                                    s.b(dn);
                                    for (final String s2 : this.c.c()) {
                                        final eb a = this.c.a(s2);
                                        if (!s2.equals("x") && !s2.equals("y")) {
                                            if (s2.equals("z")) {
                                                continue;
                                            }
                                            dn.a(s2, a.b());
                                        }
                                    }
                                    s.a(dn);
                                    s.p_();
                                }
                            }
                        }
                        else if (this.b && this.o.Q().b("doEntityDrops")) {
                            this.a(new zx(c, 1, c.a(this.d)), 0.0f);
                        }
                    }
                }
            }
            else if ((this.a > 100 && !this.o.D && (\u2603.o() < 1 || \u2603.o() > 256)) || this.a > 600) {
                if (this.b && this.o.Q().b("doEntityDrops")) {
                    this.a(new zx(c, 1, c.a(this.d)), 0.0f);
                }
                this.J();
            }
        }
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        final afh c = this.d.c();
        if (this.f) {
            final int f = ns.f(\u2603 - 1.0f);
            if (f > 0) {
                final List<pk> arrayList = (List<pk>)Lists.newArrayList((Iterable<?>)this.o.b(this, this.aR()));
                final boolean b = c == afi.cf;
                final ow \u26032 = b ? ow.n : ow.o;
                for (final pk pk : arrayList) {
                    pk.a(\u26032, (float)Math.min(ns.d(f * this.h), this.g));
                }
                if (b && this.V.nextFloat() < 0.05000000074505806 + f * 0.05) {
                    int intValue = this.d.b((amo<Integer>)aez.b);
                    if (++intValue > 2) {
                        this.e = true;
                    }
                    else {
                        this.d = this.d.a((amo<Comparable>)aez.b, intValue);
                    }
                }
            }
        }
    }
    
    @Override
    protected void b(final dn \u2603) {
        final afh \u26032 = (this.d != null) ? this.d.c() : afi.a;
        final jy jy = afh.c.c(\u26032);
        \u2603.a("Block", (jy == null) ? "" : jy.toString());
        \u2603.a("Data", (byte)\u26032.c(this.d));
        \u2603.a("Time", (byte)this.a);
        \u2603.a("DropItem", this.b);
        \u2603.a("HurtEntities", this.f);
        \u2603.a("FallHurtAmount", this.h);
        \u2603.a("FallHurtMax", this.g);
        if (this.c != null) {
            \u2603.a("TileEntityData", this.c);
        }
    }
    
    @Override
    protected void a(final dn \u2603) {
        final int \u26032 = \u2603.d("Data") & 0xFF;
        if (\u2603.b("Block", 8)) {
            this.d = afh.b(\u2603.j("Block")).a(\u26032);
        }
        else if (\u2603.b("TileID", 99)) {
            this.d = afh.c(\u2603.f("TileID")).a(\u26032);
        }
        else {
            this.d = afh.c(\u2603.d("Tile") & 0xFF).a(\u26032);
        }
        this.a = (\u2603.d("Time") & 0xFF);
        final afh c = this.d.c();
        if (\u2603.b("HurtEntities", 99)) {
            this.f = \u2603.n("HurtEntities");
            this.h = \u2603.h("FallHurtAmount");
            this.g = \u2603.f("FallHurtMax");
        }
        else if (c == afi.cf) {
            this.f = true;
        }
        if (\u2603.b("DropItem", 99)) {
            this.b = \u2603.n("DropItem");
        }
        if (\u2603.b("TileEntityData", 10)) {
            this.c = \u2603.m("TileEntityData");
        }
        if (c == null || c.t() == arm.a) {
            this.d = afi.m.Q();
        }
    }
    
    public adm j() {
        return this.o;
    }
    
    public void a(final boolean \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public boolean aJ() {
        return false;
    }
    
    @Override
    public void a(final c \u2603) {
        super.a(\u2603);
        if (this.d != null) {
            final afh c = this.d.c();
            \u2603.a("Immitating block ID", afh.a(c));
            \u2603.a("Immitating block data", c.c(this.d));
        }
    }
    
    public alz l() {
        return this.d;
    }
}
