import java.util.Calendar;

// 
// Decompiled by Procyon v0.5.36
// 

public class tk extends tj
{
    private cj a;
    
    public tk(final adm \u2603) {
        super(\u2603);
        this.a(0.5f, 0.9f);
        this.a(true);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Byte((byte)0));
    }
    
    @Override
    protected float bB() {
        return 0.1f;
    }
    
    @Override
    protected float bC() {
        return super.bC() * 0.95f;
    }
    
    @Override
    protected String z() {
        if (this.n() && this.V.nextInt(4) != 0) {
            return null;
        }
        return "mob.bat.idle";
    }
    
    @Override
    protected String bo() {
        return "mob.bat.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.bat.death";
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
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(6.0);
    }
    
    public boolean n() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void a(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x1));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFE));
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.n()) {
            final double v = 0.0;
            this.x = v;
            this.w = v;
            this.v = v;
            this.t = ns.c(this.t) + 1.0 - this.K;
        }
        else {
            this.w *= 0.6000000238418579;
        }
    }
    
    @Override
    protected void E() {
        super.E();
        final cj cj = new cj(this);
        final cj a = cj.a();
        if (this.n()) {
            if (!this.o.p(a).c().v()) {
                this.a(false);
                this.o.a(null, 1015, cj, 0);
            }
            else {
                if (this.V.nextInt(200) == 0) {
                    this.aK = (float)this.V.nextInt(360);
                }
                if (this.o.a(this, 4.0) != null) {
                    this.a(false);
                    this.o.a(null, 1015, cj, 0);
                }
            }
        }
        else {
            if (this.a != null && (!this.o.d(this.a) || this.a.o() < 1)) {
                this.a = null;
            }
            if (this.a == null || this.V.nextInt(30) == 0 || this.a.c((int)this.s, (int)this.t, (int)this.u) < 4.0) {
                this.a = new cj((int)this.s + this.V.nextInt(7) - this.V.nextInt(7), (int)this.t + this.V.nextInt(6) - 2, (int)this.u + this.V.nextInt(7) - this.V.nextInt(7));
            }
            final double d = this.a.n() + 0.5 - this.s;
            final double d2 = this.a.o() + 0.1 - this.t;
            final double d3 = this.a.p() + 0.5 - this.u;
            this.v += (Math.signum(d) * 0.5 - this.v) * 0.10000000149011612;
            this.w += (Math.signum(d2) * 0.699999988079071 - this.w) * 0.10000000149011612;
            this.x += (Math.signum(d3) * 0.5 - this.x) * 0.10000000149011612;
            final float n = (float)(ns.b(this.x, this.v) * 180.0 / 3.1415927410125732) - 90.0f;
            final float g = ns.g(n - this.y);
            this.ba = 0.5f;
            this.y += g;
            if (this.V.nextInt(100) == 0 && this.o.p(a).c().v()) {
                this.a(true);
            }
        }
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
    }
    
    @Override
    public boolean aI() {
        return true;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (!this.o.D && this.n()) {
            this.a(false);
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.ac.b(16, \u2603.d("BatFlags"));
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("BatFlags", this.ac.a(16));
    }
    
    @Override
    public boolean bR() {
        final cj \u2603 = new cj(this.s, this.aR().b, this.u);
        if (\u2603.o() >= this.o.F()) {
            return false;
        }
        final int l = this.o.l(\u2603);
        int bound = 4;
        if (this.a(this.o.Y())) {
            bound = 7;
        }
        else if (this.V.nextBoolean()) {
            return false;
        }
        return l <= this.V.nextInt(bound) && super.bR();
    }
    
    private boolean a(final Calendar \u2603) {
        return (\u2603.get(2) + 1 == 10 && \u2603.get(5) >= 20) || (\u2603.get(2) + 1 == 11 && \u2603.get(5) <= 3);
    }
    
    @Override
    public float aS() {
        return this.K / 2.0f;
    }
}
