// 
// Decompiled by Procyon v0.5.36
// 

public class bky implements blb<pr>
{
    private final bjl<?> a;
    
    public bky(final bjl<?> \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        zx ba = \u2603.bA();
        if (ba == null) {
            return;
        }
        bfl.E();
        if (this.a.b().r) {
            final float n = 0.5f;
            bfl.b(0.0f, 0.625f, 0.0f);
            bfl.b(-20.0f, -1.0f, 0.0f, 0.0f);
            bfl.a(n, n, n);
        }
        ((bbj)this.a.b()).a(0.0625f);
        bfl.b(-0.0625f, 0.4375f, 0.0625f);
        if (\u2603 instanceof wn && ((wn)\u2603).bG != null) {
            ba = new zx(zy.aR, 0);
        }
        final zw b = ba.b();
        final ave a = ave.A();
        if (b instanceof yo && afh.a(b).b() == 2) {
            bfl.b(0.0f, 0.1875f, -0.3125f);
            bfl.b(20.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(45.0f, 0.0f, 1.0f, 0.0f);
            final float \u26032 = 0.375f;
            bfl.a(-\u26032, -\u26032, \u26032);
        }
        if (\u2603.av()) {
            bfl.b(0.0f, 0.203125f, 0.0f);
        }
        a.ah().a(\u2603, ba, bgr.b.b);
        bfl.F();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
