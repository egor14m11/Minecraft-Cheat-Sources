// 
// Decompiled by Procyon v0.5.36
// 

public class beb extends pk
{
    protected int b;
    protected int c;
    protected float d;
    protected float e;
    protected int f;
    protected int g;
    protected float h;
    protected float i;
    protected float ar;
    protected float as;
    protected float at;
    protected float au;
    protected bmi av;
    public static double aw;
    public static double ax;
    public static double ay;
    
    protected beb(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.au = 1.0f;
        this.a(0.2f, 0.2f);
        this.b(\u2603, \u2603, \u2603);
        this.p = \u2603;
        this.P = \u2603;
        this.q = \u2603;
        this.Q = \u2603;
        this.r = \u2603;
        this.R = \u2603;
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.d = this.V.nextFloat() * 3.0f;
        this.e = this.V.nextFloat() * 3.0f;
        this.h = (this.V.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.g = (int)(4.0f / (this.V.nextFloat() * 0.9f + 0.1f));
        this.f = 0;
    }
    
    public beb(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603, \u2603, \u2603, \u2603);
        this.v = \u2603 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.w = \u2603 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.x = \u2603 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        final float n = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        final float a = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
        this.v = this.v / a * n * 0.4000000059604645;
        this.w = this.w / a * n * 0.4000000059604645 + 0.10000000149011612;
        this.x = this.x / a * n * 0.4000000059604645;
    }
    
    public beb a(final float \u2603) {
        this.v *= \u2603;
        this.w = (this.w - 0.10000000149011612) * \u2603 + 0.10000000149011612;
        this.x *= \u2603;
        return this;
    }
    
    public beb h(final float \u2603) {
        this.a(0.2f * \u2603, 0.2f * \u2603);
        this.h *= \u2603;
        return this;
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603) {
        this.ar = \u2603;
        this.as = \u2603;
        this.at = \u2603;
    }
    
    public void i(final float \u2603) {
        if (this.au == 1.0f && \u2603 < 1.0f) {
            ave.A().j.b(this);
        }
        else if (this.au < 1.0f && \u2603 == 1.0f) {
            ave.A().j.c(this);
        }
        this.au = \u2603;
    }
    
    public float b() {
        return this.ar;
    }
    
    public float g() {
        return this.as;
    }
    
    public float i() {
        return this.at;
    }
    
    public float j() {
        return this.au;
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        this.w -= 0.04 * this.i;
        this.d(this.v, this.w, this.x);
        this.v *= 0.9800000190734863;
        this.w *= 0.9800000190734863;
        this.x *= 0.9800000190734863;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float e = this.b / 16.0f;
        float f = e + 0.0624375f;
        float g = this.c / 16.0f;
        float h = g + 0.0624375f;
        final float n = 0.1f * this.h;
        if (this.av != null) {
            e = this.av.e();
            f = this.av.f();
            g = this.av.g();
            h = this.av.h();
        }
        final float n2 = (float)(this.p + (this.s - this.p) * \u2603 - beb.aw);
        final float n3 = (float)(this.q + (this.t - this.q) * \u2603 - beb.ax);
        final float n4 = (float)(this.r + (this.u - this.r) * \u2603 - beb.ay);
        final int b = this.b(\u2603);
        final int n5 = b >> 16 & 0xFFFF;
        final int n6 = b & 0xFFFF;
        \u2603.b(n2 - \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 - \u2603 * n - \u2603 * n)).a(f, h).a(this.ar, this.as, this.at, this.au).a(n5, n6).d();
        \u2603.b(n2 - \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 - \u2603 * n + \u2603 * n)).a(f, g).a(this.ar, this.as, this.at, this.au).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 + \u2603 * n + \u2603 * n)).a(e, g).a(this.ar, this.as, this.at, this.au).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 + \u2603 * n - \u2603 * n)).a(e, h).a(this.ar, this.as, this.at, this.au).a(n5, n6).d();
    }
    
    public int a() {
        return 0;
    }
    
    public void b(final dn \u2603) {
    }
    
    public void a(final dn \u2603) {
    }
    
    public void a(final bmi \u2603) {
        final int a = this.a();
        if (a == 1) {
            this.av = \u2603;
            return;
        }
        throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
    }
    
    public void k(final int \u2603) {
        if (this.a() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.b = \u2603 % 16;
        this.c = \u2603 / 16;
    }
    
    public void k() {
        ++this.b;
    }
    
    @Override
    public boolean aD() {
        return false;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.s + "," + this.t + "," + this.u + "), RGBA (" + this.ar + "," + this.as + "," + this.at + "," + this.au + "), Age " + this.f;
    }
}
