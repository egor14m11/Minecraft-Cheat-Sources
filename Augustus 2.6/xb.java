// 
// Decompiled by Procyon v0.5.36
// 

public class xb extends wy
{
    public xb(final adm \u2603) {
        super(\u2603);
    }
    
    public xb(final adm \u2603, final pr \u2603) {
        super(\u2603, \u2603);
    }
    
    public xb(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected float m() {
        return 0.07f;
    }
    
    @Override
    protected float j() {
        return 0.7f;
    }
    
    @Override
    protected float l() {
        return -20.0f;
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (!this.o.D) {
            this.o.b(2002, new cj(this), 0);
            int i = 3 + this.o.s.nextInt(5) + this.o.s.nextInt(5);
            while (i > 0) {
                final int a = pp.a(i);
                i -= a;
                this.o.d(new pp(this.o, this.s, this.t, this.u, a));
            }
            this.J();
        }
    }
}
