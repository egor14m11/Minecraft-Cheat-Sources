// 
// Decompiled by Procyon v0.5.36
// 

public class abk implements abs
{
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        int n = 0;
        zx zx = null;
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                if (a.b() == zy.bN) {
                    if (zx != null) {
                        return false;
                    }
                    zx = a;
                }
                else {
                    if (a.b() != zy.bM) {
                        return false;
                    }
                    ++n;
                }
            }
        }
        return zx != null && n > 0;
    }
    
    @Override
    public zx a(final xp \u2603) {
        int \u26032 = 0;
        zx zx = null;
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                if (a.b() == zy.bN) {
                    if (zx != null) {
                        return null;
                    }
                    zx = a;
                }
                else {
                    if (a.b() != zy.bM) {
                        return null;
                    }
                    ++\u26032;
                }
            }
        }
        if (zx == null || \u26032 < 1 || abd.h(zx) >= 2) {
            return null;
        }
        final zx zx2 = new zx(zy.bN, \u26032);
        zx2.d((dn)zx.o().b());
        zx2.o().a("generation", abd.h(zx) + 1);
        if (zx.s()) {
            zx2.c(zx.q());
        }
        return zx2;
    }
    
    @Override
    public int a() {
        return 9;
    }
    
    @Override
    public zx b() {
        return null;
    }
    
    @Override
    public zx[] b(final xp \u2603) {
        final zx[] array = new zx[\u2603.o_()];
        for (int i = 0; i < array.length; ++i) {
            final zx a = \u2603.a(i);
            if (a != null && a.b() instanceof abd) {
                array[i] = a;
                break;
            }
        }
        return array;
    }
}
