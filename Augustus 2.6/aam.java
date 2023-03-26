// 
// Decompiled by Procyon v0.5.36
// 

public class aam extends zw
{
    public aam() {
        this.h = 1;
        this.a(yz.e);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final pr \u2603) {
        if (\u2603 instanceof tt) {
            final tt \u26032 = (tt)\u2603;
            if (!\u26032.cl() && !\u26032.j_()) {
                \u26032.l(true);
                \u26032.o.a(\u26032, "mob.horse.leather", 0.5f, 1.0f);
                --\u2603.b;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final zx \u2603, final pr \u2603, final pr \u2603) {
        this.a(\u2603, null, \u2603);
        return true;
    }
}
