import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class biu
{
    private Map<Class<? extends pk>, biv<? extends pk>> k;
    private Map<String, bln> l;
    private bln m;
    private avn n;
    private double o;
    private double p;
    private double q;
    public bmj a;
    public adm b;
    public pk c;
    public pk d;
    public float e;
    public float f;
    public avh g;
    public double h;
    public double i;
    public double j;
    private boolean r;
    private boolean s;
    private boolean t;
    
    public biu(final bmj \u2603, final bjh \u2603) {
        this.k = (Map<Class<? extends pk>, biv<? extends pk>>)Maps.newHashMap();
        this.l = (Map<String, bln>)Maps.newHashMap();
        this.r = false;
        this.s = true;
        this.t = false;
        this.a = \u2603;
        this.k.put(vm.class, new bil(this));
        this.k.put(wc.class, new bka<pk>(this));
        this.k.put(tt.class, new bjs(this, new bbq(), 0.7f));
        this.k.put(tv.class, new bjv(this, new bbw(), 0.7f));
        this.k.put(to.class, new bin(this, new bbb(), 0.7f));
        this.k.put(tr.class, new bjp(this, new bbb(), 0.7f));
        this.k.put(ua.class, new bkl(this, new bcm(), 0.5f));
        this.k.put(tn.class, new bim(this, new bba(), 0.3f));
        this.k.put(ts.class, new bjq(this, new bbp(), 0.4f));
        this.k.put(tu.class, new bju(this, new bbu(), 0.3f));
        this.k.put(vz.class, new bjw(this));
        this.k.put(vp.class, new bit(this));
        this.k.put(vn.class, new bio(this));
        this.k.put(vo.class, new bis(this));
        this.k.put(tw.class, new bjz(this));
        this.k.put(wa.class, new bjx(this));
        this.k.put(wd.class, new bki(this));
        this.k.put(vl.class, new bij(this));
        this.k.put(vw.class, new bjt(this));
        this.k.put(we.class, new bkm(this));
        this.k.put(wb.class, new bjy(this, new bcc(16), 0.25f));
        this.k.put(vu.class, new bji(this));
        this.k.put(vs.class, new bjb(this, new bcn(), 0.5f, 6.0f));
        this.k.put(vr.class, new bja(this));
        this.k.put(tx.class, new bkb(this, new bcf(), 0.7f));
        this.k.put(wi.class, new bkh(this));
        this.k.put(ty.class, new bkg(this));
        this.k.put(tk.class, new bii(this));
        this.k.put(vt.class, new bjc(this));
        this.k.put(ug.class, new bir(this));
        this.k.put(uf.class, new biq(this));
        this.k.put(uk.class, new bkj(this));
        this.k.put(pk.class, new bip(this));
        this.k.put(uq.class, new bjr(this));
        this.k.put(uo.class, new bjg(this, \u2603));
        this.k.put(up.class, new bjj(this));
        this.k.put(wq.class, new bih(this));
        this.k.put(wx.class, new bkc<pk>(this, zy.aD, \u2603));
        this.k.put(xa.class, new bkc<pk>(this, zy.bu, \u2603));
        this.k.put(wr.class, new bkc<pk>(this, zy.bH, \u2603));
        this.k.put(wz.class, new bkc<pk>(this, zy.aP, \u2603));
        this.k.put(xc.class, new bkd(this, \u2603));
        this.k.put(xb.class, new bkc<pk>(this, zy.bK, \u2603));
        this.k.put(wt.class, new bkc<pk>(this, zy.cb, \u2603));
        this.k.put(wu.class, new biy(this, 2.0f));
        this.k.put(ww.class, new biy(this, 0.5f));
        this.k.put(xd.class, new bkk(this));
        this.k.put(uz.class, new bjf(this, \u2603));
        this.k.put(pp.class, new biw(this));
        this.k.put(vj.class, new bkf(this));
        this.k.put(uy.class, new bix(this));
        this.k.put(um.class, new big(this));
        this.k.put(vi.class, new bke(this));
        this.k.put(vh.class, new bjn(this));
        this.k.put(va.class, new bjm<pk>(this));
        this.k.put(ux.class, new bik(this));
        this.k.put(ur.class, new biz(this));
        this.k.put(tp.class, new bjd(this, new bbh(), 0.75f));
        this.k.put(uv.class, new bjk(this));
        this.m = new bln(this);
        this.l.put("default", this.m);
        this.l.put("slim", new bln(this, true));
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603) {
        this.o = \u2603;
        this.p = \u2603;
        this.q = \u2603;
    }
    
    public <T extends pk> biv<T> a(final Class<? extends pk> \u2603) {
        biv<? extends pk> a = this.k.get(\u2603);
        if (a == null && \u2603 != pk.class) {
            a = this.a((Class<? extends pk>)\u2603.getSuperclass());
            this.k.put(\u2603, a);
        }
        return (biv<T>)a;
    }
    
    public <T extends pk> biv<T> a(final pk \u2603) {
        if (!(\u2603 instanceof bet)) {
            return this.a(\u2603.getClass());
        }
        final String l = ((bet)\u2603).l();
        final bln bln = this.l.get(l);
        if (bln != null) {
            return (biv<T>)bln;
        }
        return (biv<T>)this.m;
    }
    
    public void a(final adm \u2603, final avn \u2603, final pk \u2603, final pk \u2603, final avh \u2603, final float \u2603) {
        this.b = \u2603;
        this.g = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.n = \u2603;
        if (\u2603 instanceof pr && ((pr)\u2603).bJ()) {
            final alz p = \u2603.p(new cj(\u2603));
            final afh c = p.c();
            if (c == afi.C) {
                final int b = p.b((amo<cq>)afg.O).b();
                this.e = (float)(b * 90 + 180);
                this.f = 0.0f;
            }
        }
        else {
            this.e = \u2603.A + (\u2603.y - \u2603.A) * \u2603;
            this.f = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
        }
        if (\u2603.aA == 2) {
            this.e += 180.0f;
        }
        this.h = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        this.i = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        this.j = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
    }
    
    public void a(final float \u2603) {
        this.e = \u2603;
    }
    
    public boolean a() {
        return this.s;
    }
    
    public void a(final boolean \u2603) {
        this.s = \u2603;
    }
    
    public void b(final boolean \u2603) {
        this.t = \u2603;
    }
    
    public boolean b() {
        return this.t;
    }
    
    public boolean a(final pk \u2603, final float \u2603) {
        return this.a(\u2603, \u2603, false);
    }
    
    public boolean a(final pk \u2603, final bia \u2603, final double \u2603, final double \u2603, final double \u2603) {
        final biv<pk> a = this.a(\u2603);
        return a != null && a.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public boolean a(final pk \u2603, final float \u2603, final boolean \u2603) {
        if (\u2603.W == 0) {
            \u2603.P = \u2603.s;
            \u2603.Q = \u2603.t;
            \u2603.R = \u2603.u;
        }
        final double n = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double n2 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double n3 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        final float \u26032 = \u2603.A + (\u2603.y - \u2603.A) * \u2603;
        int b = \u2603.b(\u2603);
        if (\u2603.at()) {
            b = 15728880;
        }
        final int n4 = b % 65536;
        final int n5 = b / 65536;
        bqs.a(bqs.r, n4 / 1.0f, n5 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        return this.a(\u2603, n - this.o, n2 - this.p, n3 - this.q, \u26032, \u2603, \u2603);
    }
    
    public void b(final pk \u2603, final float \u2603) {
        final double n = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double n2 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double n3 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        final biv<pk> a = this.a(\u2603);
        if (a != null && this.a != null) {
            final int b = \u2603.b(\u2603);
            final int n4 = b % 65536;
            final int n5 = b / 65536;
            bqs.a(bqs.r, n4 / 1.0f, n5 / 1.0f);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            a.a(\u2603, n - this.o, n2 - this.p, n3 - this.q);
        }
    }
    
    public boolean a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, false);
    }
    
    public boolean a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final boolean \u2603) {
        biv<pk> a = null;
        try {
            a = this.a(\u2603);
            if (a != null && this.a != null) {
                try {
                    if (a instanceof bjl) {
                        ((bjl)a).a(this.r);
                    }
                    a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                }
                catch (Throwable t) {
                    throw new e(b.a(t, "Rendering entity in world"));
                }
                try {
                    if (!this.r) {
                        a.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                    }
                }
                catch (Throwable t) {
                    throw new e(b.a(t, "Post-rendering entity in world"));
                }
                if (!this.t || \u2603.ax() || \u2603) {
                    return true;
                }
                try {
                    this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                    return true;
                }
                catch (Throwable t) {
                    throw new e(b.a(t, "Rendering entity hitbox in world"));
                }
            }
            if (this.a != null) {
                return false;
            }
        }
        catch (Throwable t) {
            final b a2 = b.a(t, "Rendering entity in world");
            final c a3 = a2.a("Entity being rendered");
            \u2603.a(a3);
            final c a4 = a2.a("Renderer details");
            a4.a("Assigned renderer", a);
            a4.a("Location", c.a(\u2603, \u2603, \u2603));
            a4.a("Rotation", \u2603);
            a4.a("Delta", \u2603);
            throw new e(a2);
        }
        return true;
    }
    
    private void b(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.a(false);
        bfl.x();
        bfl.f();
        bfl.p();
        bfl.k();
        final float n = \u2603.J / 2.0f;
        final aug ar = \u2603.aR();
        final aug \u26032 = new aug(ar.a - \u2603.s + \u2603, ar.b - \u2603.t + \u2603, ar.c - \u2603.u + \u2603, ar.d - \u2603.s + \u2603, ar.e - \u2603.t + \u2603, ar.f - \u2603.u + \u2603);
        bfr.a(\u26032, 255, 255, 255, 255);
        if (\u2603 instanceof pr) {
            final float n2 = 0.01f;
            bfr.a(new aug(\u2603 - n, \u2603 + \u2603.aS() - 0.009999999776482582, \u2603 - n, \u2603 + n, \u2603 + \u2603.aS() + 0.009999999776482582, \u2603 + n), 255, 0, 0, 255);
        }
        final bfx a = bfx.a();
        final bfd c = a.c();
        final aui d = \u2603.d(\u2603);
        c.a(3, bms.f);
        c.b(\u2603, \u2603 + \u2603.aS(), \u2603).b(0, 0, 255, 255).d();
        c.b(\u2603 + d.a * 2.0, \u2603 + \u2603.aS() + d.b * 2.0, \u2603 + d.c * 2.0).b(0, 0, 255, 255).d();
        a.b();
        bfl.w();
        bfl.e();
        bfl.o();
        bfl.k();
        bfl.a(true);
    }
    
    public void a(final adm \u2603) {
        this.b = \u2603;
    }
    
    public double b(final double \u2603, final double \u2603, final double \u2603) {
        final double n = \u2603 - this.h;
        final double n2 = \u2603 - this.i;
        final double n3 = \u2603 - this.j;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public avn c() {
        return this.n;
    }
    
    public void c(final boolean \u2603) {
        this.r = \u2603;
    }
}
