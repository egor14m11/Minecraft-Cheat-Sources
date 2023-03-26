import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class um extends pr
{
    private static final dc a;
    private static final dc b;
    private static final dc c;
    private static final dc d;
    private static final dc e;
    private static final dc f;
    private final zx[] g;
    private boolean h;
    private long i;
    private int bi;
    private boolean bj;
    private dc bk;
    private dc bl;
    private dc bm;
    private dc bn;
    private dc bo;
    private dc bp;
    
    public um(final adm \u2603) {
        super(\u2603);
        this.g = new zx[5];
        this.bk = um.a;
        this.bl = um.b;
        this.bm = um.c;
        this.bn = um.d;
        this.bo = um.e;
        this.bp = um.f;
        this.b(true);
        this.T = this.p();
        this.a(0.5f, 1.975f);
    }
    
    public um(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean bM() {
        return super.bM() && !this.p();
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(10, (Byte)0);
        this.ac.a(11, um.a);
        this.ac.a(12, um.b);
        this.ac.a(13, um.c);
        this.ac.a(14, um.d);
        this.ac.a(15, um.e);
        this.ac.a(16, um.f);
    }
    
    @Override
    public zx bA() {
        return this.g[0];
    }
    
    @Override
    public zx p(final int \u2603) {
        return this.g[\u2603];
    }
    
    @Override
    public zx q(final int \u2603) {
        return this.g[\u2603 + 1];
    }
    
    @Override
    public void c(final int \u2603, final zx \u2603) {
        this.g[\u2603] = \u2603;
    }
    
    @Override
    public zx[] as() {
        return this.g;
    }
    
    @Override
    public boolean d(final int \u2603, final zx \u2603) {
        int \u26032;
        if (\u2603 == 99) {
            \u26032 = 0;
        }
        else {
            \u26032 = \u2603 - 100 + 1;
            if (\u26032 < 0 || \u26032 >= this.g.length) {
                return false;
            }
        }
        if (\u2603 == null || ps.c(\u2603) == \u26032 || (\u26032 == 4 && \u2603.b() instanceof yo)) {
            this.c(\u26032, \u2603);
            return true;
        }
        return false;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final du \u26032 = new du();
        for (int i = 0; i < this.g.length; ++i) {
            final dn dn = new dn();
            if (this.g[i] != null) {
                this.g[i].b(dn);
            }
            \u26032.a(dn);
        }
        \u2603.a("Equipment", \u26032);
        if (this.aN() && (this.aM() == null || this.aM().length() == 0)) {
            \u2603.a("CustomNameVisible", this.aN());
        }
        \u2603.a("Invisible", this.ax());
        \u2603.a("Small", this.n());
        \u2603.a("ShowArms", this.q());
        \u2603.a("DisabledSlots", this.bi);
        \u2603.a("NoGravity", this.p());
        \u2603.a("NoBasePlate", this.r());
        if (this.s()) {
            \u2603.a("Marker", this.s());
        }
        \u2603.a("Pose", this.z());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("Equipment", 9)) {
            final du c = \u2603.c("Equipment", 10);
            for (int i = 0; i < this.g.length; ++i) {
                this.g[i] = zx.a(c.b(i));
            }
        }
        this.e(\u2603.n("Invisible"));
        this.j(\u2603.n("Small"));
        this.l(\u2603.n("ShowArms"));
        this.bi = \u2603.f("DisabledSlots");
        this.k(\u2603.n("NoGravity"));
        this.m(\u2603.n("NoBasePlate"));
        this.n(\u2603.n("Marker"));
        this.bj = !this.s();
        this.T = this.p();
        final dn m = \u2603.m("Pose");
        this.h(m);
    }
    
    private void h(final dn \u2603) {
        final du c = \u2603.c("Head", 5);
        if (c.c() > 0) {
            this.a(new dc(c));
        }
        else {
            this.a(um.a);
        }
        final du c2 = \u2603.c("Body", 5);
        if (c2.c() > 0) {
            this.b(new dc(c2));
        }
        else {
            this.b(um.b);
        }
        final du c3 = \u2603.c("LeftArm", 5);
        if (c3.c() > 0) {
            this.c(new dc(c3));
        }
        else {
            this.c(um.c);
        }
        final du c4 = \u2603.c("RightArm", 5);
        if (c4.c() > 0) {
            this.d(new dc(c4));
        }
        else {
            this.d(um.d);
        }
        final du c5 = \u2603.c("LeftLeg", 5);
        if (c5.c() > 0) {
            this.e(new dc(c5));
        }
        else {
            this.e(um.e);
        }
        final du c6 = \u2603.c("RightLeg", 5);
        if (c6.c() > 0) {
            this.f(new dc(c6));
        }
        else {
            this.f(um.f);
        }
    }
    
    private dn z() {
        final dn dn = new dn();
        if (!um.a.equals(this.bk)) {
            dn.a("Head", this.bk.a());
        }
        if (!um.b.equals(this.bl)) {
            dn.a("Body", this.bl.a());
        }
        if (!um.c.equals(this.bm)) {
            dn.a("LeftArm", this.bm.a());
        }
        if (!um.d.equals(this.bn)) {
            dn.a("RightArm", this.bn.a());
        }
        if (!um.e.equals(this.bo)) {
            dn.a("LeftLeg", this.bo.a());
        }
        if (!um.f.equals(this.bp)) {
            dn.a("RightLeg", this.bp.a());
        }
        return dn;
    }
    
    @Override
    public boolean ae() {
        return false;
    }
    
    @Override
    protected void s(final pk \u2603) {
    }
    
    @Override
    protected void bL() {
        final List<pk> b = this.o.b(this, this.aR());
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); ++i) {
                final pk \u2603 = b.get(i);
                if (\u2603 instanceof va && ((va)\u2603).s() == va.a.a && this.h(\u2603) <= 0.2) {
                    \u2603.i(this);
                }
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603, final aui \u2603) {
        if (this.s()) {
            return false;
        }
        if (this.o.D || \u2603.v()) {
            return true;
        }
        int \u26032 = 0;
        final zx bz = \u2603.bZ();
        final boolean b = bz != null;
        if (b && bz.b() instanceof yj) {
            final yj yj = (yj)bz.b();
            if (yj.b == 3) {
                \u26032 = 1;
            }
            else if (yj.b == 2) {
                \u26032 = 2;
            }
            else if (yj.b == 1) {
                \u26032 = 3;
            }
            else if (yj.b == 0) {
                \u26032 = 4;
            }
        }
        if (b && (bz.b() == zy.bX || bz.b() == zw.a(afi.aU))) {
            \u26032 = 4;
        }
        final double n = 0.1;
        final double n2 = 0.9;
        final double n3 = 0.4;
        final double n4 = 1.6;
        int \u26033 = 0;
        final boolean n5 = this.n();
        final double n6 = n5 ? (\u2603.b * 2.0) : \u2603.b;
        if (n6 >= 0.1 && n6 < 0.1 + (n5 ? 0.8 : 0.45) && this.g[1] != null) {
            \u26033 = 1;
        }
        else if (n6 >= 0.9 + (n5 ? 0.3 : 0.0) && n6 < 0.9 + (n5 ? 1.0 : 0.7) && this.g[3] != null) {
            \u26033 = 3;
        }
        else if (n6 >= 0.4 && n6 < 0.4 + (n5 ? 1.0 : 0.8) && this.g[2] != null) {
            \u26033 = 2;
        }
        else if (n6 >= 1.6 && this.g[4] != null) {
            \u26033 = 4;
        }
        final boolean b2 = this.g[\u26033] != null;
        if ((this.bi & 1 << \u26033) != 0x0 || (this.bi & 1 << \u26032) != 0x0) {
            \u26033 = \u26032;
            if ((this.bi & 1 << \u26033) != 0x0) {
                if ((this.bi & 0x1) != 0x0) {
                    return true;
                }
                \u26033 = 0;
            }
        }
        if (b && \u26032 == 0 && !this.q()) {
            return true;
        }
        if (b) {
            this.a(\u2603, \u26032);
        }
        else if (b2) {
            this.a(\u2603, \u26033);
        }
        return true;
    }
    
    private void a(final wn \u2603, final int \u2603) {
        final zx \u26032 = this.g[\u2603];
        if (\u26032 != null && (this.bi & 1 << \u2603 + 8) != 0x0) {
            return;
        }
        if (\u26032 == null && (this.bi & 1 << \u2603 + 16) != 0x0) {
            return;
        }
        final int c = \u2603.bi.c;
        final zx a = \u2603.bi.a(c);
        if (\u2603.bA.d && (\u26032 == null || \u26032.b() == zw.a(afi.a)) && a != null) {
            final zx zx = a.k();
            zx.b = 1;
            this.c(\u2603, zx);
            return;
        }
        if (a == null || a.b <= 1) {
            this.c(\u2603, a);
            \u2603.bi.a(c, \u26032);
            return;
        }
        if (\u26032 != null) {
            return;
        }
        final zx zx = a.k();
        zx.b = 1;
        this.c(\u2603, zx);
        final zx zx2 = a;
        --zx2.b;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.o.D) {
            return false;
        }
        if (ow.j.equals(\u2603)) {
            this.J();
            return false;
        }
        if (this.b(\u2603) || this.h || this.s()) {
            return false;
        }
        if (\u2603.c()) {
            this.D();
            this.J();
            return false;
        }
        if (ow.a.equals(\u2603)) {
            if (!this.at()) {
                this.e(5);
            }
            else {
                this.a(0.15f);
            }
            return false;
        }
        if (ow.c.equals(\u2603) && this.bn() > 0.5f) {
            this.a(4.0f);
            return false;
        }
        final boolean equals = "arrow".equals(\u2603.p());
        final boolean equals2 = "player".equals(\u2603.p());
        if (!equals2 && !equals) {
            return false;
        }
        if (\u2603.i() instanceof wq) {
            \u2603.i().J();
        }
        if (\u2603.j() instanceof wn && !((wn)\u2603.j()).bA.e) {
            return false;
        }
        if (\u2603.u()) {
            this.A();
            this.J();
            return false;
        }
        final long k = this.o.K();
        if (k - this.i <= 5L || equals) {
            this.C();
            this.A();
            this.J();
        }
        else {
            this.i = k;
        }
        return false;
    }
    
    @Override
    public boolean a(final double \u2603) {
        double v = this.aR().a() * 4.0;
        if (Double.isNaN(v) || v == 0.0) {
            v = 4.0;
        }
        v *= 64.0;
        return \u2603 < v * v;
    }
    
    private void A() {
        if (this.o instanceof le) {
            ((le)this.o).a(cy.M, this.s, this.t + this.K / 1.5, this.u, 10, this.J / 4.0f, this.K / 4.0f, this.J / 4.0f, 0.05, afh.f(afi.f.Q()));
        }
    }
    
    private void a(final float \u2603) {
        float bn = this.bn();
        bn -= \u2603;
        if (bn <= 0.5f) {
            this.D();
            this.J();
        }
        else {
            this.i(bn);
        }
    }
    
    private void C() {
        afh.a(this.o, new cj(this), new zx(zy.cj));
        this.D();
    }
    
    private void D() {
        for (int i = 0; i < this.g.length; ++i) {
            if (this.g[i] != null && this.g[i].b > 0) {
                if (this.g[i] != null) {
                    afh.a(this.o, new cj(this).a(), this.g[i]);
                }
                this.g[i] = null;
            }
        }
    }
    
    @Override
    protected float h(final float \u2603, final float \u2603) {
        this.aJ = this.A;
        this.aI = this.y;
        return 0.0f;
    }
    
    @Override
    public float aS() {
        return this.j_() ? (this.K * 0.5f) : (this.K * 0.9f);
    }
    
    @Override
    public void g(final float \u2603, final float \u2603) {
        if (this.p()) {
            return;
        }
        super.g(\u2603, \u2603);
    }
    
    @Override
    public void t_() {
        super.t_();
        final dc h = this.ac.h(11);
        if (!this.bk.equals(h)) {
            this.a(h);
        }
        final dc h2 = this.ac.h(12);
        if (!this.bl.equals(h2)) {
            this.b(h2);
        }
        final dc h3 = this.ac.h(13);
        if (!this.bm.equals(h3)) {
            this.c(h3);
        }
        final dc h4 = this.ac.h(14);
        if (!this.bn.equals(h4)) {
            this.d(h4);
        }
        final dc h5 = this.ac.h(15);
        if (!this.bo.equals(h5)) {
            this.e(h5);
        }
        final dc h6 = this.ac.h(16);
        if (!this.bp.equals(h6)) {
            this.f(h6);
        }
        final boolean s = this.s();
        if (!this.bj && s) {
            this.a(false);
        }
        else {
            if (!this.bj || s) {
                return;
            }
            this.a(true);
        }
        this.bj = s;
    }
    
    private void a(final boolean \u2603) {
        final double s = this.s;
        final double t = this.t;
        final double u = this.u;
        if (\u2603) {
            this.a(0.5f, 1.975f);
        }
        else {
            this.a(0.0f, 0.0f);
        }
        this.b(s, t, u);
    }
    
    @Override
    protected void B() {
        this.e(this.h);
    }
    
    @Override
    public void e(final boolean \u2603) {
        super.e(this.h = \u2603);
    }
    
    @Override
    public boolean j_() {
        return this.n();
    }
    
    @Override
    public void G() {
        this.J();
    }
    
    @Override
    public boolean aW() {
        return this.ax();
    }
    
    private void j(final boolean \u2603) {
        byte a = this.ac.a(10);
        if (\u2603) {
            a |= 0x1;
        }
        else {
            a &= 0xFFFFFFFE;
        }
        this.ac.b(10, a);
    }
    
    public boolean n() {
        return (this.ac.a(10) & 0x1) != 0x0;
    }
    
    private void k(final boolean \u2603) {
        byte a = this.ac.a(10);
        if (\u2603) {
            a |= 0x2;
        }
        else {
            a &= 0xFFFFFFFD;
        }
        this.ac.b(10, a);
    }
    
    public boolean p() {
        return (this.ac.a(10) & 0x2) != 0x0;
    }
    
    private void l(final boolean \u2603) {
        byte a = this.ac.a(10);
        if (\u2603) {
            a |= 0x4;
        }
        else {
            a &= 0xFFFFFFFB;
        }
        this.ac.b(10, a);
    }
    
    public boolean q() {
        return (this.ac.a(10) & 0x4) != 0x0;
    }
    
    private void m(final boolean \u2603) {
        byte a = this.ac.a(10);
        if (\u2603) {
            a |= 0x8;
        }
        else {
            a &= 0xFFFFFFF7;
        }
        this.ac.b(10, a);
    }
    
    public boolean r() {
        return (this.ac.a(10) & 0x8) != 0x0;
    }
    
    private void n(final boolean \u2603) {
        byte a = this.ac.a(10);
        if (\u2603) {
            a |= 0x10;
        }
        else {
            a &= 0xFFFFFFEF;
        }
        this.ac.b(10, a);
    }
    
    public boolean s() {
        return (this.ac.a(10) & 0x10) != 0x0;
    }
    
    public void a(final dc \u2603) {
        this.bk = \u2603;
        this.ac.b(11, \u2603);
    }
    
    public void b(final dc \u2603) {
        this.bl = \u2603;
        this.ac.b(12, \u2603);
    }
    
    public void c(final dc \u2603) {
        this.bm = \u2603;
        this.ac.b(13, \u2603);
    }
    
    public void d(final dc \u2603) {
        this.bn = \u2603;
        this.ac.b(14, \u2603);
    }
    
    public void e(final dc \u2603) {
        this.bo = \u2603;
        this.ac.b(15, \u2603);
    }
    
    public void f(final dc \u2603) {
        this.bp = \u2603;
        this.ac.b(16, \u2603);
    }
    
    public dc t() {
        return this.bk;
    }
    
    public dc u() {
        return this.bl;
    }
    
    public dc v() {
        return this.bm;
    }
    
    public dc w() {
        return this.bn;
    }
    
    public dc x() {
        return this.bo;
    }
    
    public dc y() {
        return this.bp;
    }
    
    @Override
    public boolean ad() {
        return super.ad() && !this.s();
    }
    
    static {
        a = new dc(0.0f, 0.0f, 0.0f);
        b = new dc(0.0f, 0.0f, 0.0f);
        c = new dc(-10.0f, 0.0f, -10.0f);
        d = new dc(-15.0f, 0.0f, 10.0f);
        e = new dc(-1.0f, 0.0f, -1.0f);
        f = new dc(1.0f, 0.0f, 1.0f);
    }
}
