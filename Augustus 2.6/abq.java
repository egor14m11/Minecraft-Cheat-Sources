// 
// Decompiled by Procyon v0.5.36
// 

public class abq extends abv
{
    public abq() {
        super(3, 3, new zx[] { new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.bd, 0, 32767), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK) }, new zx(zy.bV, 0, 0));
    }
    
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        if (!super.a(\u2603, \u2603)) {
            return false;
        }
        zx \u26032 = null;
        for (int \u26033 = 0; \u26033 < \u2603.o_() && \u26032 == null; ++\u26033) {
            final zx a = \u2603.a(\u26033);
            if (a != null && a.b() == zy.bd) {
                \u26032 = a;
            }
        }
        if (\u26032 == null) {
            return false;
        }
        final atg a2 = zy.bd.a(\u26032, \u2603);
        return a2 != null && a2.e < 4;
    }
    
    @Override
    public zx a(final xp \u2603) {
        zx k = null;
        for (int \u26032 = 0; \u26032 < \u2603.o_() && k == null; ++\u26032) {
            final zx a = \u2603.a(\u26032);
            if (a != null && a.b() == zy.bd) {
                k = a;
            }
        }
        k = k.k();
        k.b = 1;
        if (k.o() == null) {
            k.d(new dn());
        }
        k.o().a("map_is_scaling", true);
        return k;
    }
}
