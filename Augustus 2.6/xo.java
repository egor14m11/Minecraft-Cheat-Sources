// 
// Decompiled by Procyon v0.5.36
// 

public class xo extends xi
{
    private og a;
    private int f;
    
    public xo(final og \u2603, final og \u2603, final wn \u2603) {
        this.a = \u2603;
        this.f = \u2603.o_() / 9;
        \u2603.b(\u2603);
        final int n = (this.f - 4) * 18;
        for (int i = 0; i < this.f; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 103 + i * 18 + n));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 161 + n));
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
            if (\u2603 < this.f * 9) {
                if (!this.a(d, this.f * 9, this.c.size(), true)) {
                    return null;
                }
            }
            else if (!this.a(d, 0, this.f * 9, false)) {
                return null;
            }
            if (d.b == 0) {
                yg.d(null);
            }
            else {
                yg.f();
            }
        }
        return k;
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        this.a.c(\u2603);
    }
    
    public og e() {
        return this.a;
    }
}
