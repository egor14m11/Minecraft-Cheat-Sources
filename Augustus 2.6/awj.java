// 
// Decompiled by Procyon v0.5.36
// 

public class awj extends avs
{
    private float p;
    public boolean o;
    private avh.a q;
    private final float r;
    private final float s;
    
    public awj(final int \u2603, final int \u2603, final int \u2603, final avh.a \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, 0.0f, 1.0f);
    }
    
    public awj(final int \u2603, final int \u2603, final int \u2603, final avh.a \u2603, final float \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603, 150, 20, "");
        this.p = 1.0f;
        this.q = \u2603;
        this.r = \u2603;
        this.s = \u2603;
        final ave a = ave.A();
        this.p = \u2603.c(a.t.a(\u2603));
        this.j = a.t.c(\u2603);
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
            this.p = ns.a(this.p, 0.0f, 1.0f);
            final float d = this.q.d(this.p);
            \u2603.t.a(this.q, d);
            this.p = this.q.c(d);
            this.j = \u2603.t.c(this.q);
        }
        \u2603.P().a(awj.a);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
        this.b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
    }
    
    @Override
    public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
        if (super.c(\u2603, \u2603, \u2603)) {
            this.p = (\u2603 - (this.h + 4)) / (float)(this.f - 8);
            this.p = ns.a(this.p, 0.0f, 1.0f);
            \u2603.t.a(this.q, this.q.d(this.p));
            this.j = \u2603.t.c(this.q);
            return this.o = true;
        }
        return false;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603) {
        this.o = false;
    }
}
