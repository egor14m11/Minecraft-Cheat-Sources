// 
// Decompiled by Procyon v0.5.36
// 

public class bkq implements blb<vo>
{
    private final bis a;
    
    public bkq(final bis \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final vo \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz cm = \u2603.cm();
        if (cm.c().t() == arm.a) {
            return;
        }
        final bgd ae = ave.A().ae();
        bfl.B();
        bfl.E();
        bfl.b(0.0f, 0.6875f, -0.75f);
        bfl.b(20.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(45.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(0.25f, 0.1875f, 0.25f);
        final float \u26032 = 0.5f;
        bfl.a(-\u26032, -\u26032, \u26032);
        final int b = \u2603.b(\u2603);
        final int n = b % 65536;
        final int n2 = b / 65536;
        bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(bmh.g);
        ae.a(cm, 1.0f);
        bfl.F();
        bfl.C();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
