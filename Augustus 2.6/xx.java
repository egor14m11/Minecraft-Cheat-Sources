// 
// Decompiled by Procyon v0.5.36
// 

public class xx extends xi
{
    private og a;
    private tp f;
    
    public xx(final og \u2603, final og \u2603, final tp \u2603, final wn \u2603) {
        this.a = \u2603;
        this.f = \u2603;
        final int n = 3;
        \u2603.b(\u2603);
        final int n2 = (n - 4) * 18;
        this.a(new yg(\u2603, 0, 8, 18) {
            @Override
            public boolean a(final zx \u2603) {
                return super.a(\u2603) && \u2603.b() == zy.aA && !this.e();
            }
        });
        this.a(new yg(\u2603, 1, 8, 36) {
            @Override
            public boolean a(final zx \u2603) {
                return super.a(\u2603) && \u2603.cO() && tp.a(\u2603.b());
            }
            
            @Override
            public boolean b() {
                return \u2603.cO();
            }
        });
        if (\u2603.cw()) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 5; ++j) {
                    this.a(new yg(\u2603, 2 + j + i * 5, 80 + j * 18, 18 + i * 18));
                }
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 102 + i * 18 + n2));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 160 + n2));
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.a.a(\u2603) && this.f.ai() && this.f.g(\u2603) < 8.0f;
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 < this.a.o_()) {
                if (!this.a(d, this.a.o_(), this.c.size(), true)) {
                    return null;
                }
            }
            else if (this.a(1).a(d) && !this.a(1).e()) {
                if (!this.a(d, 1, 2, false)) {
                    return null;
                }
            }
            else if (this.a(0).a(d)) {
                if (!this.a(d, 0, 1, false)) {
                    return null;
                }
            }
            else if (this.a.o_() <= 2 || !this.a(d, 2, this.a.o_(), false)) {
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
}
