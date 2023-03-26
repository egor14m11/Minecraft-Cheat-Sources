// 
// Decompiled by Procyon v0.5.36
// 

public class bli implements blb<wd>
{
    private final bki a;
    
    public bli(final bki \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final wd \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final zx ba = \u2603.bA();
        if (ba == null) {
            return;
        }
        bfl.c(1.0f, 1.0f, 1.0f);
        bfl.E();
        if (this.a.b().r) {
            bfl.b(0.0f, 0.625f, 0.0f);
            bfl.b(-20.0f, -1.0f, 0.0f, 0.0f);
            final float n = 0.5f;
            bfl.a(n, n, n);
        }
        ((bck)this.a.b()).f.c(0.0625f);
        bfl.b(-0.0625f, 0.53125f, 0.21875f);
        final zw b = ba.b();
        final ave a = ave.A();
        if (b instanceof yo && a.ae().a(afh.a(b), ba.i())) {
            bfl.b(0.0f, 0.0625f, -0.25f);
            bfl.b(30.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(-5.0f, 0.0f, 1.0f, 0.0f);
            final float n2 = 0.375f;
            bfl.a(n2, -n2, n2);
        }
        else if (b == zy.f) {
            bfl.b(0.0f, 0.125f, -0.125f);
            bfl.b(-45.0f, 0.0f, 1.0f, 0.0f);
            final float n2 = 0.625f;
            bfl.a(n2, -n2, n2);
            bfl.b(-100.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(-20.0f, 0.0f, 1.0f, 0.0f);
        }
        else if (b.w_()) {
            if (b.e()) {
                bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
                bfl.b(0.0f, -0.0625f, 0.0f);
            }
            this.a.C_();
            bfl.b(0.0625f, -0.125f, 0.0f);
            final float n2 = 0.625f;
            bfl.a(n2, -n2, n2);
            bfl.b(0.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(0.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            bfl.b(0.1875f, 0.1875f, 0.0f);
            final float n2 = 0.875f;
            bfl.a(n2, n2, n2);
            bfl.b(-20.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(-60.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(-30.0f, 0.0f, 0.0f, 1.0f);
        }
        bfl.b(-15.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(40.0f, 0.0f, 0.0f, 1.0f);
        a.ah().a(\u2603, ba, bgr.b.b);
        bfl.F();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
