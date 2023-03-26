// 
// Decompiled by Procyon v0.5.36
// 

public class bkc<T extends pk> extends biv<T>
{
    protected final zw a;
    private final bjh e;
    
    public bkc(final biu \u2603, final zw \u2603, final bjh \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.e = \u2603;
    }
    
    @Override
    public void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        bfl.B();
        bfl.a(0.5f, 0.5f, 0.5f);
        bfl.b(-this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(this.b.f, 1.0f, 0.0f, 0.0f);
        this.a(bmh.g);
        this.e.a(this.d(\u2603), bgr.b.f);
        bfl.C();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public zx d(final T \u2603) {
        return new zx(this.a, 1, 0);
    }
    
    @Override
    protected jy a(final pk \u2603) {
        return bmh.g;
    }
}
