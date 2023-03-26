// 
// Decompiled by Procyon v0.5.36
// 

public class xy extends xi
{
    public xp a;
    public og f;
    public boolean g;
    private final wn h;
    
    public xy(final wm \u2603, final boolean \u2603, final wn \u2603) {
        this.a = new xp(this, 2, 2);
        this.f = new ye();
        this.g = \u2603;
        this.h = \u2603;
        this.a(new yf(\u2603.d, this.a, this.f, 0, 144, 36));
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.a(new yg(this.a, j + i * 2, 88 + j * 18, 26 + i * 18));
            }
        }
        for (int i = 0; i < 4; ++i) {
            final int j = i;
            this.a(new yg(\u2603, \u2603.o_() - 1 - i, 8, 8 + i * 18) {
                @Override
                public int a() {
                    return 1;
                }
                
                @Override
                public boolean a(final zx \u2603) {
                    if (\u2603 == null) {
                        return false;
                    }
                    if (\u2603.b() instanceof yj) {
                        return ((yj)\u2603.b()).b == j;
                    }
                    return (\u2603.b() == zw.a(afi.aU) || \u2603.b() == zy.bX) && j == 0;
                }
                
                @Override
                public String c() {
                    return yj.a[j];
                }
            });
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 142));
        }
        this.a(this.a);
    }
    
    @Override
    public void a(final og \u2603) {
        this.f.a(0, abt.a().a(this.a, this.h.o));
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        for (int i = 0; i < 4; ++i) {
            final zx b = this.a.b(i);
            if (b != null) {
                \u2603.a(b, false);
            }
        }
        this.f.a(0, null);
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return true;
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 == 0) {
                if (!this.a(d, 9, 45, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (\u2603 >= 1 && \u2603 < 5) {
                if (!this.a(d, 9, 45, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 5 && \u2603 < 9) {
                if (!this.a(d, 9, 45, false)) {
                    return null;
                }
            }
            else if (k.b() instanceof yj && !this.c.get(5 + ((yj)k.b()).b).e()) {
                final int \u26032 = 5 + ((yj)k.b()).b;
                if (!this.a(d, \u26032, \u26032 + 1, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 9 && \u2603 < 36) {
                if (!this.a(d, 36, 45, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 36 && \u2603 < 45) {
                if (!this.a(d, 9, 36, false)) {
                    return null;
                }
            }
            else if (!this.a(d, 9, 45, false)) {
                return null;
            }
            if (d.b == 0) {
                yg.d(null);
            }
            else {
                yg.f();
            }
            if (d.b == k.b) {
                return null;
            }
            yg.a(\u2603, d);
        }
        return k;
    }
    
    @Override
    public boolean a(final zx \u2603, final yg \u2603) {
        return \u2603.d != this.f && super.a(\u2603, \u2603);
    }
}
