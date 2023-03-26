// 
// Decompiled by Procyon v0.5.36
// 

public class pp extends pk
{
    public int a;
    public int b;
    public int c;
    private int d;
    private int e;
    private wn f;
    private int g;
    
    public pp(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603) {
        super(\u2603);
        this.d = 5;
        this.a(0.5f, 0.5f);
        this.b(\u2603, \u2603, \u2603);
        this.y = (float)(Math.random() * 360.0);
        this.v = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.w = (float)(Math.random() * 0.2) * 2.0f;
        this.x = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.e = \u2603;
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    public pp(final adm \u2603) {
        super(\u2603);
        this.d = 5;
        this.a(0.25f, 0.25f);
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    public int b(final float \u2603) {
        float a = 0.5f;
        a = ns.a(a, 0.0f, 1.0f);
        final int b = super.b(\u2603);
        int n = b & 0xFF;
        final int n2 = b >> 16 & 0xFF;
        n += (int)(a * 15.0f * 16.0f);
        if (n > 240) {
            n = 240;
        }
        return n | n2 << 16;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.c > 0) {
            --this.c;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= 0.029999999329447746;
        if (this.o.p(new cj(this)).c().t() == arm.i) {
            this.w = 0.20000000298023224;
            this.v = (this.V.nextFloat() - this.V.nextFloat()) * 0.2f;
            this.x = (this.V.nextFloat() - this.V.nextFloat()) * 0.2f;
            this.a("random.fizz", 0.4f, 2.0f + this.V.nextFloat() * 0.4f);
        }
        this.j(this.s, (this.aR().b + this.aR().e) / 2.0, this.u);
        final double \u2603 = 8.0;
        if (this.g < this.a - 20 + this.F() % 100) {
            if (this.f == null || this.f.h(this) > \u2603 * \u2603) {
                this.f = this.o.a(this, \u2603);
            }
            this.g = this.a;
        }
        if (this.f != null && this.f.v()) {
            this.f = null;
        }
        if (this.f != null) {
            final double n = (this.f.s - this.s) / \u2603;
            final double n2 = (this.f.t + this.f.aS() - this.t) / \u2603;
            final double n3 = (this.f.u - this.u) / \u2603;
            final double sqrt = Math.sqrt(n * n + n2 * n2 + n3 * n3);
            double n4 = 1.0 - sqrt;
            if (n4 > 0.0) {
                n4 *= n4;
                this.v += n / sqrt * n4 * 0.1;
                this.w += n2 / sqrt * n4 * 0.1;
                this.x += n3 / sqrt * n4 * 0.1;
            }
        }
        this.d(this.v, this.w, this.x);
        float n5 = 0.98f;
        if (this.C) {
            n5 = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.98f;
        }
        this.v *= n5;
        this.w *= 0.9800000190734863;
        this.x *= n5;
        if (this.C) {
            this.w *= -0.8999999761581421;
        }
        ++this.a;
        ++this.b;
        if (this.b >= 6000) {
            this.J();
        }
    }
    
    @Override
    public boolean W() {
        return this.o.a(this.aR(), arm.h, this);
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
        this.ac();
        this.d -= (int)\u2603;
        if (this.d <= 0) {
            this.J();
        }
        return false;
    }
    
    public void b(final dn \u2603) {
        \u2603.a("Health", (short)(byte)this.d);
        \u2603.a("Age", (short)this.b);
        \u2603.a("Value", (short)this.e);
    }
    
    public void a(final dn \u2603) {
        this.d = (\u2603.e("Health") & 0xFF);
        this.b = \u2603.e("Age");
        this.e = \u2603.e("Value");
    }
    
    @Override
    public void d(final wn \u2603) {
        if (this.o.D) {
            return;
        }
        if (this.c == 0 && \u2603.bp == 0) {
            \u2603.bp = 2;
            this.o.a((pk)\u2603, "random.orb", 0.1f, 0.5f * ((this.V.nextFloat() - this.V.nextFloat()) * 0.7f + 1.8f));
            \u2603.a(this, 1);
            \u2603.u(this.e);
            this.J();
        }
    }
    
    public int j() {
        return this.e;
    }
    
    public int l() {
        if (this.e >= 2477) {
            return 10;
        }
        if (this.e >= 1237) {
            return 9;
        }
        if (this.e >= 617) {
            return 8;
        }
        if (this.e >= 307) {
            return 7;
        }
        if (this.e >= 149) {
            return 6;
        }
        if (this.e >= 73) {
            return 5;
        }
        if (this.e >= 37) {
            return 4;
        }
        if (this.e >= 17) {
            return 3;
        }
        if (this.e >= 7) {
            return 2;
        }
        if (this.e >= 3) {
            return 1;
        }
        return 0;
    }
    
    public static int a(final int \u2603) {
        if (\u2603 >= 2477) {
            return 2477;
        }
        if (\u2603 >= 1237) {
            return 1237;
        }
        if (\u2603 >= 617) {
            return 617;
        }
        if (\u2603 >= 307) {
            return 307;
        }
        if (\u2603 >= 149) {
            return 149;
        }
        if (\u2603 >= 73) {
            return 73;
        }
        if (\u2603 >= 37) {
            return 37;
        }
        if (\u2603 >= 17) {
            return 17;
        }
        if (\u2603 >= 7) {
            return 7;
        }
        if (\u2603 >= 3) {
            return 3;
        }
        return 1;
    }
    
    @Override
    public boolean aD() {
        return false;
    }
}
