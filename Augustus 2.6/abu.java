import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class abu implements abs
{
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        final List<zx> arrayList = (List<zx>)Lists.newArrayList();
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                arrayList.add(a);
                if (arrayList.size() > 1) {
                    final zx zx = arrayList.get(0);
                    if (a.b() != zx.b() || zx.b != 1 || a.b != 1 || !zx.b().m()) {
                        return false;
                    }
                }
            }
        }
        return arrayList.size() == 2;
    }
    
    @Override
    public zx a(final xp \u2603) {
        final List<zx> arrayList = (List<zx>)Lists.newArrayList();
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                arrayList.add(a);
                if (arrayList.size() > 1) {
                    final zx zx = arrayList.get(0);
                    if (a.b() != zx.b() || zx.b != 1 || a.b != 1 || !zx.b().m()) {
                        return null;
                    }
                }
            }
        }
        if (arrayList.size() == 2) {
            final zx zx2 = arrayList.get(0);
            final zx a = arrayList.get(1);
            if (zx2.b() == a.b() && zx2.b == 1 && a.b == 1 && zx2.b().m()) {
                final zw b = zx2.b();
                final int n = b.l() - zx2.h();
                final int n2 = b.l() - a.h();
                final int n3 = n + n2 + b.l() * 5 / 100;
                int \u26032 = b.l() - n3;
                if (\u26032 < 0) {
                    \u26032 = 0;
                }
                return new zx(zx2.b(), 1, \u26032);
            }
        }
        return null;
    }
    
    @Override
    public int a() {
        return 4;
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
            if (a != null && a.b().r()) {
                array[i] = new zx(a.b().q());
            }
        }
        return array;
    }
}
