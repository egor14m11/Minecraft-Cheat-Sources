// 
// Decompiled by Procyon v0.5.36
// 

public class bew extends bet
{
    public final bcy a;
    private final nb bJ;
    private double bK;
    private double bL;
    private double bM;
    private float bN;
    private float bO;
    private boolean bP;
    private boolean bQ;
    private int bR;
    private boolean bS;
    private String bT;
    public beu b;
    protected ave c;
    protected int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    private int bU;
    private float bV;
    public float bH;
    public float bI;
    
    public bew(final ave \u2603, final adm \u2603, final bcy \u2603, final nb \u2603) {
        super(\u2603, \u2603.e());
        this.a = \u2603;
        this.bJ = \u2603;
        this.c = \u2603;
        this.am = 0;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        return false;
    }
    
    @Override
    public void h(final float \u2603) {
    }
    
    @Override
    public void a(final pk \u2603) {
        super.a(\u2603);
        if (\u2603 instanceof va) {
            this.c.W().a(new bpe(this, (va)\u2603));
        }
    }
    
    @Override
    public void t_() {
        if (!this.o.e(new cj(this.s, 0.0, this.u))) {
            return;
        }
        super.t_();
        if (this.au()) {
            this.a.a(new ip.c(this.y, this.z, this.C));
            this.a.a(new it(this.aZ, this.ba, this.b.c, this.b.d));
        }
        else {
            this.p();
        }
    }
    
    public void p() {
        final boolean aw = this.aw();
        if (aw != this.bQ) {
            if (aw) {
                this.a.a(new is(this, is.a.d));
            }
            else {
                this.a.a(new is(this, is.a.e));
            }
            this.bQ = aw;
        }
        final boolean av = this.av();
        if (av != this.bP) {
            if (av) {
                this.a.a(new is(this, is.a.a));
            }
            else {
                this.a.a(new is(this, is.a.b));
            }
            this.bP = av;
        }
        if (this.A()) {
            final double n = this.s - this.bK;
            final double n2 = this.aR().b - this.bL;
            final double n3 = this.u - this.bM;
            final double n4 = this.y - this.bN;
            final double n5 = this.z - this.bO;
            boolean b = n * n + n2 * n2 + n3 * n3 > 9.0E-4 || this.bR >= 20;
            final boolean b2 = n4 != 0.0 || n5 != 0.0;
            if (this.m == null) {
                if (b && b2) {
                    this.a.a(new ip.b(this.s, this.aR().b, this.u, this.y, this.z, this.C));
                }
                else if (b) {
                    this.a.a(new ip.a(this.s, this.aR().b, this.u, this.C));
                }
                else if (b2) {
                    this.a.a(new ip.c(this.y, this.z, this.C));
                }
                else {
                    this.a.a(new ip(this.C));
                }
            }
            else {
                this.a.a(new ip.b(this.v, -999.0, this.x, this.y, this.z, this.C));
                b = false;
            }
            ++this.bR;
            if (b) {
                this.bK = this.s;
                this.bL = this.aR().b;
                this.bM = this.u;
                this.bR = 0;
            }
            if (b2) {
                this.bN = this.y;
                this.bO = this.z;
            }
        }
    }
    
    @Override
    public uz a(final boolean \u2603) {
        final ir.a \u26032 = \u2603 ? ir.a.d : ir.a.e;
        this.a.a(new ir(\u26032, cj.a, cq.a));
        return null;
    }
    
    @Override
    protected void a(final uz \u2603) {
    }
    
    public void e(final String \u2603) {
        this.a.a(new ie(\u2603));
    }
    
    @Override
    public void bw() {
        super.bw();
        this.a.a(new iy());
    }
    
    @Override
    public void cb() {
        this.a.a(new ig(ig.a.a));
    }
    
    @Override
    protected void d(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return;
        }
        this.i(this.bn() - \u2603);
    }
    
    public void n() {
        this.a.a(new il(this.bk.d));
        this.q();
    }
    
    public void q() {
        this.bi.b((zx)null);
        super.n();
        this.c.a((axu)null);
    }
    
    public void n(final float \u2603) {
        if (this.bS) {
            final float n = this.bn() - \u2603;
            if (n <= 0.0f) {
                this.i(\u2603);
                if (n < 0.0f) {
                    this.Z = this.aD / 2;
                }
            }
            else {
                this.aX = n;
                this.i(this.bn());
                this.Z = this.aD;
                this.d(ow.k, n);
                final int n2 = 10;
                this.av = n2;
                this.au = n2;
            }
        }
        else {
            this.i(\u2603);
            this.bS = true;
        }
    }
    
    @Override
    public void a(final mw \u2603, final int \u2603) {
        if (\u2603 == null) {
            return;
        }
        if (\u2603.f) {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    public void t() {
        this.a.a(new iq(this.bA));
    }
    
    @Override
    public boolean cc() {
        return true;
    }
    
    protected void r() {
        this.a.a(new is(this, is.a.f, (int)(this.z() * 100.0f)));
    }
    
    public void u() {
        this.a.a(new is(this, is.a.g));
    }
    
    public void f(final String \u2603) {
        this.bT = \u2603;
    }
    
    public String w() {
        return this.bT;
    }
    
    public nb x() {
        return this.bJ;
    }
    
    @Override
    public void b(final eu \u2603) {
        this.c.q.d().a(\u2603);
    }
    
    @Override
    protected boolean j(final double \u2603, final double \u2603, final double \u2603) {
        if (this.T) {
            return false;
        }
        final cj \u26032 = new cj(\u2603, \u2603, \u2603);
        final double n = \u2603 - \u26032.n();
        final double n2 = \u2603 - \u26032.p();
        if (!this.e(\u26032)) {
            int n3 = -1;
            double n4 = 9999.0;
            if (this.e(\u26032.e()) && n < n4) {
                n4 = n;
                n3 = 0;
            }
            if (this.e(\u26032.f()) && 1.0 - n < n4) {
                n4 = 1.0 - n;
                n3 = 1;
            }
            if (this.e(\u26032.c()) && n2 < n4) {
                n4 = n2;
                n3 = 4;
            }
            if (this.e(\u26032.d()) && 1.0 - n2 < n4) {
                n4 = 1.0 - n2;
                n3 = 5;
            }
            final float n5 = 0.1f;
            if (n3 == 0) {
                this.v = -n5;
            }
            if (n3 == 1) {
                this.v = n5;
            }
            if (n3 == 4) {
                this.x = -n5;
            }
            if (n3 == 5) {
                this.x = n5;
            }
        }
        return false;
    }
    
    private boolean e(final cj \u2603) {
        return !this.o.p(\u2603).c().v() && !this.o.p(\u2603.a()).c().v();
    }
    
    @Override
    public void d(final boolean \u2603) {
        super.d(\u2603);
        this.e = (\u2603 ? 600 : 0);
    }
    
    public void a(final float \u2603, final int \u2603, final int \u2603) {
        this.bD = \u2603;
        this.bC = \u2603;
        this.bB = \u2603;
    }
    
    @Override
    public void a(final eu \u2603) {
        this.c.q.d().a(\u2603);
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        return \u2603 <= 0;
    }
    
    @Override
    public cj c() {
        return new cj(this.s + 0.5, this.t + 0.5, this.u + 0.5);
    }
    
    @Override
    public void a(final String \u2603, final float \u2603, final float \u2603) {
        this.o.a(this.s, this.t, this.u, \u2603, \u2603, \u2603, false);
    }
    
    @Override
    public boolean bM() {
        return true;
    }
    
    public boolean y() {
        return this.m != null && this.m instanceof tp && ((tp)this.m).cG();
    }
    
    public float z() {
        return this.bV;
    }
    
    @Override
    public void a(final aln \u2603) {
        this.c.a(new aze(\u2603));
    }
    
    @Override
    public void a(final adc \u2603) {
        this.c.a(new ayq(\u2603));
    }
    
    @Override
    public void a(final zx \u2603) {
        final zw b = \u2603.b();
        if (b == zy.bM) {
            this.c.a(new ayo(this, \u2603, true));
        }
    }
    
    @Override
    public void a(final og \u2603) {
        final String anObject = (\u2603 instanceof ol) ? ((ol)\u2603).k() : "minecraft:container";
        if ("minecraft:chest".equals(anObject)) {
            this.c.a(new ayr(this.bi, \u2603));
        }
        else if ("minecraft:hopper".equals(anObject)) {
            this.c.a(new aza(this.bi, \u2603));
        }
        else if ("minecraft:furnace".equals(anObject)) {
            this.c.a(new ayz(this.bi, \u2603));
        }
        else if ("minecraft:brewing_stand".equals(anObject)) {
            this.c.a(new ayp(this.bi, \u2603));
        }
        else if ("minecraft:beacon".equals(anObject)) {
            this.c.a(new ayn(this.bi, \u2603));
        }
        else if ("minecraft:dispenser".equals(anObject) || "minecraft:dropper".equals(anObject)) {
            this.c.a(new ayv(this.bi, \u2603));
        }
        else {
            this.c.a(new ayr(this.bi, \u2603));
        }
    }
    
    @Override
    public void a(final tp \u2603, final og \u2603) {
        this.c.a(new azb(this.bi, \u2603, \u2603));
    }
    
    @Override
    public void a(final ol \u2603) {
        final String k = \u2603.k();
        if ("minecraft:crafting_table".equals(k)) {
            this.c.a(new ays(this.bi, this.o));
        }
        else if ("minecraft:enchanting_table".equals(k)) {
            this.c.a(new ayy(this.bi, this.o, \u2603));
        }
        else if ("minecraft:anvil".equals(k)) {
            this.c.a(new aym(this.bi, this.o));
        }
    }
    
    @Override
    public void a(final acy \u2603) {
        this.c.a(new azd(this.bi, \u2603, this.o));
    }
    
    @Override
    public void b(final pk \u2603) {
        this.c.j.a(\u2603, cy.j);
    }
    
    @Override
    public void c(final pk \u2603) {
        this.c.j.a(\u2603, cy.k);
    }
    
    @Override
    public boolean av() {
        final boolean b = this.b != null && this.b.d;
        return b && !this.bw;
    }
    
    public void bK() {
        super.bK();
        if (this.A()) {
            this.aZ = this.b.a;
            this.ba = this.b.b;
            this.aY = this.b.c;
            this.h = this.f;
            this.i = this.g;
            this.g += (float)((this.z - this.g) * 0.5);
            this.f += (float)((this.y - this.f) * 0.5);
        }
    }
    
    protected boolean A() {
        return this.c.ac() == this;
    }
    
    @Override
    public void m() {
        if (this.e > 0) {
            --this.e;
            if (this.e == 0) {
                this.d(false);
            }
        }
        if (this.d > 0) {
            --this.d;
        }
        this.bI = this.bH;
        if (this.ak) {
            if (this.c.m != null && !this.c.m.d()) {
                this.c.a((axu)null);
            }
            if (this.bH == 0.0f) {
                this.c.W().a(bpf.a(new jy("portal.trigger"), this.V.nextFloat() * 0.4f + 0.8f));
            }
            this.bH += 0.0125f;
            if (this.bH >= 1.0f) {
                this.bH = 1.0f;
            }
            this.ak = false;
        }
        else if (this.a(pe.k) && this.b(pe.k).b() > 60) {
            this.bH += 0.006666667f;
            if (this.bH > 1.0f) {
                this.bH = 1.0f;
            }
        }
        else {
            if (this.bH > 0.0f) {
                this.bH -= 0.05f;
            }
            if (this.bH < 0.0f) {
                this.bH = 0.0f;
            }
        }
        if (this.aj > 0) {
            --this.aj;
        }
        final boolean c = this.b.c;
        final boolean d = this.b.d;
        final float n = 0.8f;
        final boolean b = this.b.b >= n;
        this.b.a();
        if (this.bS() && !this.au()) {
            final beu b2 = this.b;
            b2.a *= 0.2f;
            final beu b3 = this.b;
            b3.b *= 0.2f;
            this.d = 0;
        }
        this.j(this.s - this.J * 0.35, this.aR().b + 0.5, this.u + this.J * 0.35);
        this.j(this.s - this.J * 0.35, this.aR().b + 0.5, this.u - this.J * 0.35);
        this.j(this.s + this.J * 0.35, this.aR().b + 0.5, this.u - this.J * 0.35);
        this.j(this.s + this.J * 0.35, this.aR().b + 0.5, this.u + this.J * 0.35);
        final boolean b4 = this.cl().a() > 6.0f || this.bA.c;
        if (this.C && !d && !b && this.b.b >= n && !this.aw() && b4 && !this.bS() && !this.a(pe.q)) {
            if (this.d > 0 || this.c.t.ad.d()) {
                this.d(true);
            }
            else {
                this.d = 7;
            }
        }
        if (!this.aw() && this.b.b >= n && b4 && !this.bS() && !this.a(pe.q) && this.c.t.ad.d()) {
            this.d(true);
        }
        if (this.aw() && (this.b.b < n || this.D || !b4)) {
            this.d(false);
        }
        if (this.bA.c) {
            if (this.c.c.k()) {
                if (!this.bA.b) {
                    this.bA.b = true;
                    this.t();
                }
            }
            else if (!c && this.b.c) {
                if (this.bm == 0) {
                    this.bm = 7;
                }
                else {
                    this.bA.b = !this.bA.b;
                    this.t();
                    this.bm = 0;
                }
            }
        }
        if (this.bA.b && this.A()) {
            if (this.b.d) {
                this.w -= this.bA.a() * 3.0f;
            }
            if (this.b.c) {
                this.w += this.bA.a() * 3.0f;
            }
        }
        if (this.y()) {
            if (this.bU < 0) {
                ++this.bU;
                if (this.bU == 0) {
                    this.bV = 0.0f;
                }
            }
            if (c && !this.b.c) {
                this.bU = -10;
                this.r();
            }
            else if (!c && this.b.c) {
                this.bU = 0;
                this.bV = 0.0f;
            }
            else if (c) {
                ++this.bU;
                if (this.bU < 10) {
                    this.bV = this.bU * 0.1f;
                }
                else {
                    this.bV = 0.8f + 2.0f / (this.bU - 9) * 0.1f;
                }
            }
        }
        else {
            this.bV = 0.0f;
        }
        super.m();
        if (this.C && this.bA.b && !this.c.c.k()) {
            this.bA.b = false;
            this.t();
        }
    }
}
