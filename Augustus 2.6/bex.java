import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bex extends bet
{
    private boolean a;
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    
    public bex(final adm \u2603, final GameProfile \u2603) {
        super(\u2603, \u2603);
        this.S = 0.0f;
        this.T = true;
        this.bZ = 0.25f;
        this.j = 10.0;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        return true;
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void t_() {
        this.bZ = 0.0f;
        super.t_();
        this.aA = this.aB;
        final double n = this.s - this.p;
        final double n2 = this.u - this.r;
        float n3 = ns.a(n * n + n2 * n2) * 4.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        this.aB += (n3 - this.aB) * 0.4f;
        this.aC += this.aB;
        if (!this.a && this.ay() && this.bi.a[this.bi.c] != null) {
            final zx \u2603 = this.bi.a[this.bi.c];
            this.a(this.bi.a[this.bi.c], \u2603.b().d(\u2603));
            this.a = true;
        }
        else if (this.a && !this.ay()) {
            this.bV();
            this.a = false;
        }
    }
    
    @Override
    public void m() {
        if (this.b > 0) {
            final double \u2603 = this.s + (this.c - this.s) / this.b;
            final double \u26032 = this.t + (this.d - this.t) / this.b;
            final double \u26033 = this.u + (this.e - this.u) / this.b;
            double n;
            for (n = this.f - this.y; n < -180.0; n += 360.0) {}
            while (n >= 180.0) {
                n -= 360.0;
            }
            this.y += (float)(n / this.b);
            this.z += (float)((this.g - this.z) / this.b);
            --this.b;
            this.b(\u2603, \u26032, \u26033);
            this.b(this.y, this.z);
        }
        this.bn = this.bo;
        this.bx();
        float a = ns.a(this.v * this.v + this.x * this.x);
        float n2 = (float)Math.atan(-this.w * 0.20000000298023224) * 15.0f;
        if (a > 0.1f) {
            a = 0.1f;
        }
        if (!this.C || this.bn() <= 0.0f) {
            a = 0.0f;
        }
        if (this.C || this.bn() <= 0.0f) {
            n2 = 0.0f;
        }
        this.bo += (a - this.bo) * 0.4f;
        this.aF += (n2 - this.aF) * 0.8f;
    }
    
    @Override
    public void c(final int \u2603, final zx \u2603) {
        if (\u2603 == 0) {
            this.bi.a[this.bi.c] = \u2603;
        }
        else {
            this.bi.b[\u2603 - 1] = \u2603;
        }
    }
    
    @Override
    public void a(final eu \u2603) {
        ave.A().q.d().a(\u2603);
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        return false;
    }
    
    @Override
    public cj c() {
        return new cj(this.s + 0.5, this.t + 0.5, this.u + 0.5);
    }
}
