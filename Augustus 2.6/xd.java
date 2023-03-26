// 
// Decompiled by Procyon v0.5.36
// 

public class xd extends ws
{
    public xd(final adm \u2603) {
        super(\u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    public xd(final adm \u2603, final pr \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    @Override
    protected float j() {
        return this.l() ? 0.73f : super.j();
    }
    
    public xd(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    @Override
    public boolean at() {
        return false;
    }
    
    @Override
    public float a(final adi \u2603, final adm \u2603, final cj \u2603, final alz \u2603) {
        float b = super.a(\u2603, \u2603, \u2603, \u2603);
        final afh c = \u2603.c();
        if (this.l() && uk.a(c)) {
            b = Math.min(0.8f, b);
        }
        return b;
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (!this.o.D) {
            if (\u2603.d != null) {
                if (this.a != null) {
                    if (\u2603.d.a(ow.a(this.a), 8.0f)) {
                        if (!\u2603.d.ai()) {
                            this.a.h(5.0f);
                        }
                        else {
                            this.a(this.a, \u2603.d);
                        }
                    }
                }
                else {
                    \u2603.d.a(ow.l, 5.0f);
                }
                if (\u2603.d instanceof pr) {
                    int n = 0;
                    if (this.o.aa() == oj.c) {
                        n = 10;
                    }
                    else if (this.o.aa() == oj.d) {
                        n = 40;
                    }
                    if (n > 0) {
                        ((pr)\u2603.d).c(new pf(pe.v.H, 20 * n, 1));
                    }
                }
            }
            this.o.a(this, this.s, this.t, this.u, 1.0f, false, this.o.Q().b("mobGriefing"));
            this.J();
        }
    }
    
    @Override
    public boolean ad() {
        return false;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        return false;
    }
    
    @Override
    protected void h() {
        this.ac.a(10, (Byte)0);
    }
    
    public boolean l() {
        return this.ac.a(10) == 1;
    }
    
    public void a(final boolean \u2603) {
        this.ac.b(10, (byte)(\u2603 ? 1 : 0));
    }
}
