// 
// Decompiled by Procyon v0.5.36
// 

public class xr extends xi
{
    private og a;
    
    public xr(final og \u2603, final og \u2603) {
        this.a = \u2603;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.a(new yg(\u2603, j + i * 3, 62 + j * 18, 17 + i * 18));
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 142));
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.a.a(\u2603);
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 < 9) {
                if (!this.a(d, 9, 45, true)) {
                    return null;
                }
            }
            else if (!this.a(d, 0, 9, false)) {
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
}
