// 
// Decompiled by Procyon v0.5.36
// 

public class xq extends xi
{
    public xp a;
    public og f;
    private adm g;
    private cj h;
    
    public xq(final wm \u2603, final adm \u2603, final cj \u2603) {
        this.a = new xp(this, 3, 3);
        this.f = new ye();
        this.g = \u2603;
        this.h = \u2603;
        this.a(new yf(\u2603.d, this.a, this.f, 0, 124, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.a(new yg(this.a, j + i * 3, 30 + j * 18, 17 + i * 18));
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
        this.a(this.a);
    }
    
    @Override
    public void a(final og \u2603) {
        this.f.a(0, abt.a().a(this.a, this.g));
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        if (this.g.D) {
            return;
        }
        for (int i = 0; i < 9; ++i) {
            final zx b = this.a.b(i);
            if (b != null) {
                \u2603.a(b, false);
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.g.p(this.h).c() == afi.ai && \u2603.e(this.h.n() + 0.5, this.h.o() + 0.5, this.h.p() + 0.5) <= 64.0;
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 == 0) {
                if (!this.a(d, 10, 46, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (\u2603 >= 10 && \u2603 < 37) {
                if (!this.a(d, 37, 46, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 37 && \u2603 < 46) {
                if (!this.a(d, 10, 37, false)) {
                    return null;
                }
            }
            else if (!this.a(d, 10, 46, false)) {
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
