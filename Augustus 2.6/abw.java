import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class abw implements abs
{
    private final zx a;
    private final List<zx> b;
    
    public abw(final zx \u2603, final List<zx> \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public zx b() {
        return this.a;
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
    
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        final List<zx> arrayList = (List<zx>)Lists.newArrayList((Iterable<?>)this.b);
        for (int i = 0; i < \u2603.h(); ++i) {
            for (int j = 0; j < \u2603.i(); ++j) {
                final zx c = \u2603.c(j, i);
                if (c != null) {
                    boolean b = false;
                    for (final zx zx : arrayList) {
                        if (c.b() == zx.b() && (zx.i() == 32767 || c.i() == zx.i())) {
                            b = true;
                            arrayList.remove(zx);
                            break;
                        }
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
        }
        return arrayList.isEmpty();
    }
    
    @Override
    public zx a(final xp \u2603) {
        return this.a.k();
    }
    
    @Override
    public int a() {
        return this.b.size();
    }
}
