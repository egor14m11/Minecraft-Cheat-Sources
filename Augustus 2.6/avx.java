// 
// Decompiled by Procyon v0.5.36
// 

public class avx extends avs
{
    private float p;
    public boolean o;
    private String q;
    private final float r;
    private final float s;
    private final awg.b t;
    private a u;
    
    public avx(final awg.b \u2603, final int \u2603, final int \u2603, final int \u2603, final String \u2603, final float \u2603, final float \u2603, final float \u2603, final a \u2603) {
        super(\u2603, \u2603, \u2603, 150, 20, "");
        this.p = 1.0f;
        this.q = \u2603;
        this.r = \u2603;
        this.s = \u2603;
        this.p = (\u2603 - \u2603) / (\u2603 - \u2603);
        this.u = \u2603;
        this.t = \u2603;
        this.j = this.e();
    }
    
    public float c() {
        return this.r + (this.s - this.r) * this.p;
    }
    
    public void a(final float \u2603, final boolean \u2603) {
        this.p = (\u2603 - this.r) / (this.s - this.r);
        this.j = this.e();
        if (\u2603) {
            this.t.a(this.k, this.c());
        }
    }
    
    public float d() {
        return this.p;
    }
    
    private String e() {
        if (this.u == null) {
            return bnq.a(this.q, new Object[0]) + ": " + this.c();
        }
        return this.u.a(this.k, bnq.a(this.q, new Object[0]), this.c());
    }
    
    @Override
    protected int a(final boolean \u2603) {
        return 0;
    }
    
    @Override
    protected void b(final ave \u2603, final int \u2603, final int \u2603) {
        if (!this.m) {
            return;
        }
        if (this.o) {
            this.p = (\u2603 - (this.h + 4)) / (float)(this.f - 8);
            if (this.p < 0.0f) {
                this.p = 0.0f;
            }
            if (this.p > 1.0f) {
                this.p = 1.0f;
            }
            this.j = this.e();
            this.t.a(this.k, this.c());
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
        this.b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
    }
    
    public void a(final float \u2603) {
        this.p = \u2603;
        this.j = this.e();
        this.t.a(this.k, this.c());
    }
    
    @Override
    public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
        if (super.c(\u2603, \u2603, \u2603)) {
            this.p = (\u2603 - (this.h + 4)) / (float)(this.f - 8);
            if (this.p < 0.0f) {
                this.p = 0.0f;
            }
            if (this.p > 1.0f) {
                this.p = 1.0f;
            }
            this.j = this.e();
            this.t.a(this.k, this.c());
            return this.o = true;
        }
        return false;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603) {
        this.o = false;
    }
    
    public interface a
    {
        String a(final int p0, final String p1, final float p2);
    }
}
