// 
// Decompiled by Procyon v0.5.36
// 

public class bkt implements blb<bet>
{
    private final bln a;
    
    public bkt(final bln \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final bet \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.e_().equals("deadmau5") || !\u2603.g() || \u2603.ax()) {
            return;
        }
        this.a.a(\u2603.i());
        for (int i = 0; i < 2; ++i) {
            final float \u26032 = \u2603.A + (\u2603.y - \u2603.A) * \u2603 - (\u2603.aJ + (\u2603.aI - \u2603.aJ) * \u2603);
            final float \u26033 = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
            bfl.E();
            bfl.b(\u26032, 0.0f, 1.0f, 0.0f);
            bfl.b(\u26033, 1.0f, 0.0f, 0.0f);
            bfl.b(0.375f * (i * 2 - 1), 0.0f, 0.0f);
            bfl.b(0.0f, -0.375f, 0.0f);
            bfl.b(-\u26033, 1.0f, 0.0f, 0.0f);
            bfl.b(-\u26032, 0.0f, 1.0f, 0.0f);
            final float n = 1.3333334f;
            bfl.a(n, n, n);
            this.a.g().b(0.0625f);
            bfl.F();
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
