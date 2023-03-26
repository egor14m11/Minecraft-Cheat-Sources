// 
// Decompiled by Procyon v0.5.36
// 

public class abv implements abs
{
    private final int a;
    private final int b;
    private final zx[] c;
    private final zx d;
    private boolean e;
    
    public abv(final int \u2603, final int \u2603, final zx[] \u2603, final zx \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public zx b() {
        return this.d;
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
        for (int i = 0; i <= 3 - this.a; ++i) {
            for (int j = 0; j <= 3 - this.b; ++j) {
                if (this.a(\u2603, i, j, true)) {
                    return true;
                }
                if (this.a(\u2603, i, j, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean a(final xp \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                final int n = i - \u2603;
                final int n2 = j - \u2603;
                zx zx = null;
                if (n >= 0 && n2 >= 0 && n < this.a && n2 < this.b) {
                    if (\u2603) {
                        zx = this.c[this.a - n - 1 + n2 * this.a];
                    }
                    else {
                        zx = this.c[n + n2 * this.a];
                    }
                }
                final zx c = \u2603.c(i, j);
                if (c != null || zx != null) {
                    if ((c == null && zx != null) || (c != null && zx == null)) {
                        return false;
                    }
                    if (zx.b() != c.b()) {
                        return false;
                    }
                    if (zx.i() != 32767 && zx.i() != c.i()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public zx a(final xp \u2603) {
        final zx k = this.b().k();
        if (this.e) {
            for (int i = 0; i < \u2603.o_(); ++i) {
                final zx a = \u2603.a(i);
                if (a != null && a.n()) {
                    k.d((dn)a.o().b());
                }
            }
        }
        return k;
    }
    
    @Override
    public int a() {
        return this.a * this.b;
    }
}
