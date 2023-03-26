// 
// Decompiled by Procyon v0.5.36
// 

public class sa extends rd
{
    private final ps a;
    private final vx b;
    private pr c;
    private int d;
    private double e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    
    public sa(final vx \u2603, final double \u2603, final int \u2603, final float \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public sa(final vx \u2603, final double \u2603, final int \u2603, final int \u2603, final float \u2603) {
        this.d = -1;
        if (!(\u2603 instanceof pr)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = \u2603;
        this.a = (ps)\u2603;
        this.e = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        this.j = \u2603 * \u2603;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        final pr u = this.a.u();
        if (u == null) {
            return false;
        }
        this.c = u;
        return true;
    }
    
    @Override
    public boolean b() {
        return this.a() || !this.a.s().m();
    }
    
    @Override
    public void d() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }
    
    @Override
    public void e() {
        final double e = this.a.e(this.c.s, this.c.aR().b, this.c.u);
        final boolean a = this.a.t().a(this.c);
        if (a) {
            ++this.f;
        }
        else {
            this.f = 0;
        }
        if (e > this.j || this.f < 20) {
            this.a.s().a(this.c, this.e);
        }
        else {
            this.a.s().n();
        }
        this.a.p().a(this.c, 30.0f, 30.0f);
        final int d = this.d - 1;
        this.d = d;
        if (d == 0) {
            if (e > this.j || !a) {
                return;
            }
            float a2;
            final float n = a2 = ns.a(e) / this.i;
            a2 = ns.a(a2, 0.1f, 1.0f);
            this.b.a(this.c, a2);
            this.d = ns.d(n * (this.h - this.g) + this.g);
        }
        else if (this.d < 0) {
            final float n = ns.a(e) / this.i;
            this.d = ns.d(n * (this.h - this.g) + this.g);
        }
    }
}
