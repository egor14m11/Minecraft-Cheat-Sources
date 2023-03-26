import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class uz extends pk
{
    private static final Logger b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    public float a;
    
    public uz(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.e = 5;
        this.a = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.a(0.25f, 0.25f);
        this.b(\u2603, \u2603, \u2603);
        this.y = (float)(Math.random() * 360.0);
        this.v = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
        this.w = 0.20000000298023224;
        this.x = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
    }
    
    public uz(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zx \u2603) {
        this(\u2603, \u2603, \u2603, \u2603);
        this.a(\u2603);
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    public uz(final adm \u2603) {
        super(\u2603);
        this.e = 5;
        this.a = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.a(0.25f, 0.25f);
        this.a(new zx(afi.a, 0));
    }
    
    @Override
    protected void h() {
        this.H().a(10, 5);
    }
    
    @Override
    public void t_() {
        if (this.l() == null) {
            this.J();
            return;
        }
        super.t_();
        if (this.d > 0 && this.d != 32767) {
            --this.d;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= 0.03999999910593033;
        this.T = this.j(this.s, (this.aR().b + this.aR().e) / 2.0, this.u);
        this.d(this.v, this.w, this.x);
        final boolean b = (int)this.p != (int)this.s || (int)this.q != (int)this.t || (int)this.r != (int)this.u;
        if (b || this.W % 25 == 0) {
            if (this.o.p(new cj(this)).c().t() == arm.i) {
                this.w = 0.20000000298023224;
                this.v = (this.V.nextFloat() - this.V.nextFloat()) * 0.2f;
                this.x = (this.V.nextFloat() - this.V.nextFloat()) * 0.2f;
                this.a("random.fizz", 0.4f, 2.0f + this.V.nextFloat() * 0.4f);
            }
            if (!this.o.D) {
                this.w();
            }
        }
        float n = 0.98f;
        if (this.C) {
            n = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.98f;
        }
        this.v *= n;
        this.w *= 0.9800000190734863;
        this.x *= n;
        if (this.C) {
            this.w *= -0.5;
        }
        if (this.c != -32768) {
            ++this.c;
        }
        this.W();
        if (!this.o.D && this.c >= 6000) {
            this.J();
        }
    }
    
    private void w() {
        for (final uz \u2603 : this.o.a((Class<? extends pk>)uz.class, this.aR().b(0.5, 0.0, 0.5))) {
            this.a(\u2603);
        }
    }
    
    private boolean a(final uz \u2603) {
        if (\u2603 == this) {
            return false;
        }
        if (!\u2603.ai() || !this.ai()) {
            return false;
        }
        final zx l = this.l();
        final zx i = \u2603.l();
        if (this.d == 32767 || \u2603.d == 32767) {
            return false;
        }
        if (this.c == -32768 || \u2603.c == -32768) {
            return false;
        }
        if (i.b() != l.b()) {
            return false;
        }
        if (i.n() ^ l.n()) {
            return false;
        }
        if (i.n() && !i.o().equals(l.o())) {
            return false;
        }
        if (i.b() == null) {
            return false;
        }
        if (i.b().k() && i.i() != l.i()) {
            return false;
        }
        if (i.b < l.b) {
            return \u2603.a(this);
        }
        if (i.b + l.b > i.c()) {
            return false;
        }
        final zx zx = i;
        zx.b += l.b;
        \u2603.d = Math.max(\u2603.d, this.d);
        \u2603.c = Math.min(\u2603.c, this.c);
        \u2603.a(i);
        this.J();
        return true;
    }
    
    public void j() {
        this.c = 4800;
    }
    
    @Override
    public boolean W() {
        if (this.o.a(this.aR(), arm.h, this)) {
            if (!this.Y && !this.aa) {
                this.X();
            }
            this.Y = true;
        }
        else {
            this.Y = false;
        }
        return this.Y;
    }
    
    @Override
    protected void f(final int \u2603) {
        this.a(ow.a, (float)\u2603);
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (this.l() != null && this.l().b() == zy.bZ && \u2603.c()) {
            return false;
        }
        this.ac();
        this.e -= (int)\u2603;
        if (this.e <= 0) {
            this.J();
        }
        return false;
    }
    
    public void b(final dn \u2603) {
        \u2603.a("Health", (short)(byte)this.e);
        \u2603.a("Age", (short)this.c);
        \u2603.a("PickupDelay", (short)this.d);
        if (this.n() != null) {
            \u2603.a("Thrower", this.f);
        }
        if (this.m() != null) {
            \u2603.a("Owner", this.g);
        }
        if (this.l() != null) {
            \u2603.a("Item", this.l().b(new dn()));
        }
    }
    
    public void a(final dn \u2603) {
        this.e = (\u2603.e("Health") & 0xFF);
        this.c = \u2603.e("Age");
        if (\u2603.c("PickupDelay")) {
            this.d = \u2603.e("PickupDelay");
        }
        if (\u2603.c("Owner")) {
            this.g = \u2603.j("Owner");
        }
        if (\u2603.c("Thrower")) {
            this.f = \u2603.j("Thrower");
        }
        final dn m = \u2603.m("Item");
        this.a(zx.a(m));
        if (this.l() == null) {
            this.J();
        }
    }
    
    @Override
    public void d(final wn \u2603) {
        if (this.o.D) {
            return;
        }
        final zx l = this.l();
        final int b = l.b;
        if (this.d == 0 && (this.g == null || 6000 - this.c <= 200 || this.g.equals(\u2603.e_())) && \u2603.bi.a(l)) {
            if (l.b() == zw.a(afi.r)) {
                \u2603.b(mr.g);
            }
            if (l.b() == zw.a(afi.s)) {
                \u2603.b(mr.g);
            }
            if (l.b() == zy.aF) {
                \u2603.b(mr.t);
            }
            if (l.b() == zy.i) {
                \u2603.b(mr.w);
            }
            if (l.b() == zy.bv) {
                \u2603.b(mr.A);
            }
            if (l.b() == zy.i && this.n() != null) {
                final wn a = this.o.a(this.n());
                if (a != null && a != \u2603) {
                    a.b(mr.x);
                }
            }
            if (!this.R()) {
                this.o.a((pk)\u2603, "random.pop", 0.2f, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            \u2603.a(this, b);
            if (l.b <= 0) {
                this.J();
            }
        }
    }
    
    @Override
    public String e_() {
        if (this.l_()) {
            return this.aM();
        }
        return di.a("item." + this.l().a());
    }
    
    @Override
    public boolean aD() {
        return false;
    }
    
    @Override
    public void c(final int \u2603) {
        super.c(\u2603);
        if (!this.o.D) {
            this.w();
        }
    }
    
    public zx l() {
        final zx f = this.H().f(10);
        if (f == null) {
            if (this.o != null) {
                uz.b.error("Item entity " + this.F() + " has no item?!");
            }
            return new zx(afi.b);
        }
        return f;
    }
    
    public void a(final zx \u2603) {
        this.H().b(10, \u2603);
        this.H().i(10);
    }
    
    public String m() {
        return this.g;
    }
    
    public void b(final String \u2603) {
        this.g = \u2603;
    }
    
    public String n() {
        return this.f;
    }
    
    public void c(final String \u2603) {
        this.f = \u2603;
    }
    
    public int o() {
        return this.c;
    }
    
    public void p() {
        this.d = 10;
    }
    
    public void q() {
        this.d = 0;
    }
    
    public void r() {
        this.d = 32767;
    }
    
    public void a(final int \u2603) {
        this.d = \u2603;
    }
    
    public boolean s() {
        return this.d > 0;
    }
    
    public void u() {
        this.c = -6000;
    }
    
    public void v() {
        this.r();
        this.c = 5999;
    }
    
    static {
        b = LogManager.getLogger();
    }
}
