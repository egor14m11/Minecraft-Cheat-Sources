// 
// Decompiled by Procyon v0.5.36
// 

public class ble implements blb<tw>
{
    private final bjz a;
    
    public ble(final bjz \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final tw \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.ax()) {
            return;
        }
        bfl.E();
        this.a.g().c.c(0.0625f);
        final float \u26032 = 0.625f;
        bfl.b(0.0f, -0.34375f, 0.0f);
        bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
        bfl.a(\u26032, -\u26032, -\u26032);
        ave.A().ah().a(\u2603, new zx(afi.aU, 1), bgr.b.d);
        bfl.F();
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
