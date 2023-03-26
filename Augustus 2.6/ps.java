import java.util.UUID;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ps extends pr
{
    public int a_;
    protected int b_;
    private qp a;
    protected qq f;
    protected qo g;
    private qm b;
    protected sw h;
    protected final re i;
    protected final re bi;
    private pr c;
    private ta bk;
    private zx[] bl;
    protected float[] bj;
    private boolean bm;
    private boolean bn;
    private boolean bo;
    private pk bp;
    private dn bq;
    
    public ps(final adm \u2603) {
        super(\u2603);
        this.bl = new zx[5];
        this.bj = new float[5];
        this.i = new re((\u2603 == null || \u2603.B == null) ? null : \u2603.B);
        this.bi = new re((\u2603 == null || \u2603.B == null) ? null : \u2603.B);
        this.a = new qp(this);
        this.f = new qq(this);
        this.g = new qo(this);
        this.b = new qm(this);
        this.h = this.b(\u2603);
        this.bk = new ta(this);
        for (int i = 0; i < this.bj.length; ++i) {
            this.bj[i] = 0.085f;
        }
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.by().b(vy.b).a(16.0);
    }
    
    protected sw b(final adm \u2603) {
        return new sv(this, \u2603);
    }
    
    public qp p() {
        return this.a;
    }
    
    public qq q() {
        return this.f;
    }
    
    public qo r() {
        return this.g;
    }
    
    public sw s() {
        return this.h;
    }
    
    public ta t() {
        return this.bk;
    }
    
    public pr u() {
        return this.c;
    }
    
    public void d(final pr \u2603) {
        this.c = \u2603;
    }
    
    public boolean a(final Class<? extends pr> \u2603) {
        return \u2603 != vr.class;
    }
    
    public void v() {
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(15, (Byte)0);
    }
    
    public int w() {
        return 80;
    }
    
    public void x() {
        final String z = this.z();
        if (z != null) {
            this.a(z, this.bB(), this.bC());
        }
    }
    
    @Override
    public void K() {
        super.K();
        this.o.B.a("mobBaseTick");
        if (this.ai() && this.V.nextInt(1000) < this.a_++) {
            this.a_ = -this.w();
            this.x();
        }
        this.o.B.b();
    }
    
    @Override
    protected int b(final wn \u2603) {
        if (this.b_ > 0) {
            int b_ = this.b_;
            final zx[] as = this.as();
            for (int i = 0; i < as.length; ++i) {
                if (as[i] != null && this.bj[i] <= 1.0f) {
                    b_ += 1 + this.V.nextInt(3);
                }
            }
            return b_;
        }
        return this.b_;
    }
    
    public void y() {
        if (this.o.D) {
            for (int i = 0; i < 20; ++i) {
                final double \u2603 = this.V.nextGaussian() * 0.02;
                final double \u26032 = this.V.nextGaussian() * 0.02;
                final double \u26033 = this.V.nextGaussian() * 0.02;
                final double n = 10.0;
                this.o.a(cy.a, this.s + this.V.nextFloat() * this.J * 2.0f - this.J - \u2603 * n, this.t + this.V.nextFloat() * this.K - \u26032 * n, this.u + this.V.nextFloat() * this.J * 2.0f - this.J - \u26033 * n, \u2603, \u26032, \u26033, new int[0]);
            }
        }
        else {
            this.o.a(this, (byte)20);
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 20) {
            this.y();
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D) {
            this.ca();
        }
    }
    
    @Override
    protected float h(final float \u2603, final float \u2603) {
        this.b.a();
        return \u2603;
    }
    
    protected String z() {
        return null;
    }
    
    protected zw A() {
        return null;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        final zw a = this.A();
        if (a != null) {
            int nextInt = this.V.nextInt(3);
            if (\u2603 > 0) {
                nextInt += this.V.nextInt(\u2603 + 1);
            }
            for (int i = 0; i < nextInt; ++i) {
                this.a(a, 1);
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("CanPickUpLoot", this.bY());
        \u2603.a("PersistenceRequired", this.bn);
        final du \u26032 = new du();
        for (int i = 0; i < this.bl.length; ++i) {
            final dn \u26033 = new dn();
            if (this.bl[i] != null) {
                this.bl[i].b(\u26033);
            }
            \u26032.a(\u26033);
        }
        \u2603.a("Equipment", \u26032);
        final du \u26034 = new du();
        for (int j = 0; j < this.bj.length; ++j) {
            \u26034.a(new dr(this.bj[j]));
        }
        \u2603.a("DropChances", \u26034);
        \u2603.a("Leashed", this.bo);
        if (this.bp != null) {
            final dn \u26033 = new dn();
            if (this.bp instanceof pr) {
                \u26033.a("UUIDMost", this.bp.aK().getMostSignificantBits());
                \u26033.a("UUIDLeast", this.bp.aK().getLeastSignificantBits());
            }
            else if (this.bp instanceof un) {
                final cj n = ((un)this.bp).n();
                \u26033.a("X", n.n());
                \u26033.a("Y", n.o());
                \u26033.a("Z", n.p());
            }
            \u2603.a("Leash", \u26033);
        }
        if (this.ce()) {
            \u2603.a("NoAI", this.ce());
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("CanPickUpLoot", 1)) {
            this.j(\u2603.n("CanPickUpLoot"));
        }
        this.bn = \u2603.n("PersistenceRequired");
        if (\u2603.b("Equipment", 9)) {
            final du du = \u2603.c("Equipment", 10);
            for (int i = 0; i < this.bl.length; ++i) {
                this.bl[i] = zx.a(du.b(i));
            }
        }
        if (\u2603.b("DropChances", 9)) {
            final du du = \u2603.c("DropChances", 5);
            for (int i = 0; i < du.c(); ++i) {
                this.bj[i] = du.e(i);
            }
        }
        this.bo = \u2603.n("Leashed");
        if (this.bo && \u2603.b("Leash", 10)) {
            this.bq = \u2603.m("Leash");
        }
        this.k(\u2603.n("NoAI"));
    }
    
    public void n(final float \u2603) {
        this.ba = \u2603;
    }
    
    @Override
    public void k(final float \u2603) {
        super.k(\u2603);
        this.n(\u2603);
    }
    
    @Override
    public void m() {
        super.m();
        this.o.B.a("looting");
        if (!this.o.D && this.bY() && !this.aP && this.o.Q().b("mobGriefing")) {
            final List<uz> a = this.o.a((Class<? extends uz>)uz.class, this.aR().b(1.0, 0.0, 1.0));
            for (final uz \u2603 : a) {
                if (!\u2603.I && \u2603.l() != null) {
                    if (\u2603.s()) {
                        continue;
                    }
                    this.a(\u2603);
                }
            }
        }
        this.o.B.b();
    }
    
    protected void a(final uz \u2603) {
        final zx l = \u2603.l();
        final int c = c(l);
        if (c > -1) {
            boolean b = true;
            final zx p = this.p(c);
            if (p != null) {
                if (c == 0) {
                    if (l.b() instanceof aay && !(p.b() instanceof aay)) {
                        b = true;
                    }
                    else if (l.b() instanceof aay && p.b() instanceof aay) {
                        final aay aay = (aay)l.b();
                        final aay aay2 = (aay)p.b();
                        if (aay.g() == aay2.g()) {
                            b = (l.i() > p.i() || (l.n() && !p.n()));
                        }
                        else {
                            b = (aay.g() > aay2.g());
                        }
                    }
                    else {
                        b = (l.b() instanceof yt && p.b() instanceof yt && l.n() && !p.n());
                    }
                }
                else if (l.b() instanceof yj && !(p.b() instanceof yj)) {
                    b = true;
                }
                else if (l.b() instanceof yj && p.b() instanceof yj) {
                    final yj yj = (yj)l.b();
                    final yj yj2 = (yj)p.b();
                    if (yj.c == yj2.c) {
                        b = (l.i() > p.i() || (l.n() && !p.n()));
                    }
                    else {
                        b = (yj.c > yj2.c);
                    }
                }
                else {
                    b = false;
                }
            }
            if (b && this.a(l)) {
                if (p != null && this.V.nextFloat() - 0.1f < this.bj[c]) {
                    this.a(p, 0.0f);
                }
                if (l.b() == zy.i && \u2603.n() != null) {
                    final wn a = this.o.a(\u2603.n());
                    if (a != null) {
                        a.b(mr.x);
                    }
                }
                this.c(c, l);
                this.bj[c] = 2.0f;
                this.bn = true;
                this.a(\u2603, 1);
                \u2603.J();
            }
        }
    }
    
    protected boolean a(final zx \u2603) {
        return true;
    }
    
    protected boolean C() {
        return true;
    }
    
    protected void D() {
        if (this.bn) {
            this.aQ = 0;
            return;
        }
        final pk a = this.o.a(this, -1.0);
        if (a != null) {
            final double n = a.s - this.s;
            final double n2 = a.t - this.t;
            final double n3 = a.u - this.u;
            final double n4 = n * n + n2 * n2 + n3 * n3;
            if (this.C() && n4 > 16384.0) {
                this.J();
            }
            if (this.aQ > 600 && this.V.nextInt(800) == 0 && n4 > 1024.0 && this.C()) {
                this.J();
            }
            else if (n4 < 1024.0) {
                this.aQ = 0;
            }
        }
    }
    
    @Override
    protected final void bK() {
        ++this.aQ;
        this.o.B.a("checkDespawn");
        this.D();
        this.o.B.b();
        this.o.B.a("sensing");
        this.bk.a();
        this.o.B.b();
        this.o.B.a("targetSelector");
        this.bi.a();
        this.o.B.b();
        this.o.B.a("goalSelector");
        this.i.a();
        this.o.B.b();
        this.o.B.a("navigation");
        this.h.k();
        this.o.B.b();
        this.o.B.a("mob tick");
        this.E();
        this.o.B.b();
        this.o.B.a("controls");
        this.o.B.a("move");
        this.f.c();
        this.o.B.c("look");
        this.a.a();
        this.o.B.c("jump");
        this.g.b();
        this.o.B.b();
        this.o.B.b();
    }
    
    protected void E() {
    }
    
    public int bQ() {
        return 40;
    }
    
    public void a(final pk \u2603, final float \u2603, final float \u2603) {
        final double \u26032 = \u2603.s - this.s;
        final double \u26033 = \u2603.u - this.u;
        double \u26034;
        if (\u2603 instanceof pr) {
            final pr pr = (pr)\u2603;
            \u26034 = pr.t + pr.aS() - (this.t + this.aS());
        }
        else {
            \u26034 = (\u2603.aR().b + \u2603.aR().e) / 2.0 - (this.t + this.aS());
        }
        final double \u26035 = ns.a(\u26032 * \u26032 + \u26033 * \u26033);
        final float \u26036 = (float)(ns.b(\u26033, \u26032) * 180.0 / 3.1415927410125732) - 90.0f;
        final float \u26037 = (float)(-(ns.b(\u26034, \u26035) * 180.0 / 3.1415927410125732));
        this.z = this.b(this.z, \u26037, \u2603);
        this.y = this.b(this.y, \u26036, \u2603);
    }
    
    private float b(final float \u2603, final float \u2603, final float \u2603) {
        float g = ns.g(\u2603 - \u2603);
        if (g > \u2603) {
            g = \u2603;
        }
        if (g < -\u2603) {
            g = -\u2603;
        }
        return \u2603 + g;
    }
    
    public boolean bR() {
        return true;
    }
    
    public boolean bS() {
        return this.o.a(this.aR(), this) && this.o.a(this, this.aR()).isEmpty() && !this.o.d(this.aR());
    }
    
    public float bT() {
        return 1.0f;
    }
    
    public int bV() {
        return 4;
    }
    
    @Override
    public int aE() {
        if (this.u() == null) {
            return 3;
        }
        int n = (int)(this.bn() - this.bu() * 0.33f);
        n -= (3 - this.o.aa().a()) * 4;
        if (n < 0) {
            n = 0;
        }
        return n + 3;
    }
    
    @Override
    public zx bA() {
        return this.bl[0];
    }
    
    @Override
    public zx p(final int \u2603) {
        return this.bl[\u2603];
    }
    
    @Override
    public zx q(final int \u2603) {
        return this.bl[\u2603 + 1];
    }
    
    @Override
    public void c(final int \u2603, final zx \u2603) {
        this.bl[\u2603] = \u2603;
    }
    
    @Override
    public zx[] as() {
        return this.bl;
    }
    
    @Override
    protected void a(final boolean \u2603, final int \u2603) {
        for (int i = 0; i < this.as().length; ++i) {
            final zx p = this.p(i);
            final boolean b = this.bj[i] > 1.0f;
            if (p != null && (\u2603 || b) && this.V.nextFloat() - \u2603 * 0.01f < this.bj[i]) {
                if (!b && p.e()) {
                    final int max = Math.max(p.j() - 25, 1);
                    int \u26032 = p.j() - this.V.nextInt(this.V.nextInt(max) + 1);
                    if (\u26032 > max) {
                        \u26032 = max;
                    }
                    if (\u26032 < 1) {
                        \u26032 = 1;
                    }
                    p.b(\u26032);
                }
                this.a(p, 0.0f);
            }
        }
    }
    
    protected void a(final ok \u2603) {
        if (this.V.nextFloat() < 0.15f * \u2603.c()) {
            int nextInt = this.V.nextInt(2);
            final float n = (this.o.aa() == oj.d) ? 0.1f : 0.25f;
            if (this.V.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.V.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.V.nextFloat() < 0.095f) {
                ++nextInt;
            }
            for (int i = 3; i >= 0; --i) {
                final zx q = this.q(i);
                if (i < 3 && this.V.nextFloat() < n) {
                    break;
                }
                if (q == null) {
                    final zw a = a(i + 1, nextInt);
                    if (a != null) {
                        this.c(i + 1, new zx(a));
                    }
                }
            }
        }
    }
    
    public static int c(final zx \u2603) {
        if (\u2603.b() == zw.a(afi.aU) || \u2603.b() == zy.bX) {
            return 4;
        }
        if (\u2603.b() instanceof yj) {
            switch (((yj)\u2603.b()).b) {
                case 3: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 1: {
                    return 3;
                }
                case 0: {
                    return 4;
                }
            }
        }
        return 0;
    }
    
    public static zw a(final int \u2603, final int \u2603) {
        switch (\u2603) {
            case 4: {
                if (\u2603 == 0) {
                    return zy.Q;
                }
                if (\u2603 == 1) {
                    return zy.ag;
                }
                if (\u2603 == 2) {
                    return zy.U;
                }
                if (\u2603 == 3) {
                    return zy.Y;
                }
                if (\u2603 == 4) {
                    return zy.ac;
                }
            }
            case 3: {
                if (\u2603 == 0) {
                    return zy.R;
                }
                if (\u2603 == 1) {
                    return zy.ah;
                }
                if (\u2603 == 2) {
                    return zy.V;
                }
                if (\u2603 == 3) {
                    return zy.Z;
                }
                if (\u2603 == 4) {
                    return zy.ad;
                }
            }
            case 2: {
                if (\u2603 == 0) {
                    return zy.S;
                }
                if (\u2603 == 1) {
                    return zy.ai;
                }
                if (\u2603 == 2) {
                    return zy.W;
                }
                if (\u2603 == 3) {
                    return zy.aa;
                }
                if (\u2603 == 4) {
                    return zy.ae;
                }
            }
            case 1: {
                if (\u2603 == 0) {
                    return zy.T;
                }
                if (\u2603 == 1) {
                    return zy.aj;
                }
                if (\u2603 == 2) {
                    return zy.X;
                }
                if (\u2603 == 3) {
                    return zy.ab;
                }
                if (\u2603 == 4) {
                    return zy.af;
                }
                break;
            }
        }
        return null;
    }
    
    protected void b(final ok \u2603) {
        final float c = \u2603.c();
        if (this.bA() != null && this.V.nextFloat() < 0.25f * c) {
            ack.a(this.V, this.bA(), (int)(5.0f + c * this.V.nextInt(18)));
        }
        for (int i = 0; i < 4; ++i) {
            final zx q = this.q(i);
            if (q != null && this.V.nextFloat() < 0.5f * c) {
                ack.a(this.V, q, (int)(5.0f + c * this.V.nextInt(18)));
            }
        }
    }
    
    public pu a(final ok \u2603, final pu \u2603) {
        this.a(vy.b).b(new qd("Random spawn bonus", this.V.nextGaussian() * 0.05, 1));
        return \u2603;
    }
    
    public boolean bW() {
        return false;
    }
    
    public void bX() {
        this.bn = true;
    }
    
    public void a(final int \u2603, final float \u2603) {
        this.bj[\u2603] = \u2603;
    }
    
    public boolean bY() {
        return this.bm;
    }
    
    public void j(final boolean \u2603) {
        this.bm = \u2603;
    }
    
    public boolean bZ() {
        return this.bn;
    }
    
    @Override
    public final boolean e(final wn \u2603) {
        if (this.cc() && this.cd() == \u2603) {
            this.a(true, !\u2603.bA.d);
            return true;
        }
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.cn && this.cb()) {
            if (!(this instanceof qa) || !((qa)this).cl()) {
                this.a(\u2603, true);
                final zx zx = h;
                --zx.b;
                return true;
            }
            if (((qa)this).e((pr)\u2603)) {
                this.a(\u2603, true);
                final zx zx2 = h;
                --zx2.b;
                return true;
            }
        }
        return this.a(\u2603) || super.e(\u2603);
    }
    
    protected boolean a(final wn \u2603) {
        return false;
    }
    
    protected void ca() {
        if (this.bq != null) {
            this.n();
        }
        if (!this.bo) {
            return;
        }
        if (!this.ai()) {
            this.a(true, true);
        }
        if (this.bp == null || this.bp.I) {
            this.a(true, true);
        }
    }
    
    public void a(final boolean \u2603, final boolean \u2603) {
        if (this.bo) {
            this.bo = false;
            this.bp = null;
            if (!this.o.D && \u2603) {
                this.a(zy.cn, 1);
            }
            if (!this.o.D && \u2603 && this.o instanceof le) {
                ((le)this.o).s().a(this, new hl(1, this, null));
            }
        }
    }
    
    public boolean cb() {
        return !this.cc() && !(this instanceof vq);
    }
    
    public boolean cc() {
        return this.bo;
    }
    
    public pk cd() {
        return this.bp;
    }
    
    public void a(final pk \u2603, final boolean \u2603) {
        this.bo = true;
        this.bp = \u2603;
        if (!this.o.D && \u2603 && this.o instanceof le) {
            ((le)this.o).s().a(this, new hl(1, this, this.bp));
        }
    }
    
    private void n() {
        if (this.bo && this.bq != null) {
            if (this.bq.b("UUIDMost", 4) && this.bq.b("UUIDLeast", 4)) {
                final UUID obj = new UUID(this.bq.g("UUIDMost"), this.bq.g("UUIDLeast"));
                final List<pr> a = this.o.a((Class<? extends pr>)pr.class, this.aR().b(10.0, 10.0, 10.0));
                for (final pr bp : a) {
                    if (bp.aK().equals(obj)) {
                        this.bp = bp;
                        break;
                    }
                }
            }
            else if (this.bq.b("X", 99) && this.bq.b("Y", 99) && this.bq.b("Z", 99)) {
                final cj cj = new cj(this.bq.f("X"), this.bq.f("Y"), this.bq.f("Z"));
                up bp2 = up.b(this.o, cj);
                if (bp2 == null) {
                    bp2 = up.a(this.o, cj);
                }
                this.bp = bp2;
            }
            else {
                this.a(false, true);
            }
        }
        this.bq = null;
    }
    
    @Override
    public boolean d(final int \u2603, final zx \u2603) {
        int \u26032;
        if (\u2603 == 99) {
            \u26032 = 0;
        }
        else {
            \u26032 = \u2603 - 100 + 1;
            if (\u26032 < 0 || \u26032 >= this.bl.length) {
                return false;
            }
        }
        if (\u2603 == null || c(\u2603) == \u26032 || (\u26032 == 4 && \u2603.b() instanceof yo)) {
            this.c(\u26032, \u2603);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean bM() {
        return super.bM() && !this.ce();
    }
    
    public void k(final boolean \u2603) {
        this.ac.b(15, (byte)(\u2603 ? 1 : 0));
    }
    
    public boolean ce() {
        return this.ac.a(15) != 0;
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
