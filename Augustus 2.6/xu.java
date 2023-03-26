// 
// Decompiled by Procyon v0.5.36
// 

public class xu extends xi
{
    private final og a;
    private int f;
    private int g;
    private int h;
    private int i;
    
    public xu(final wm \u2603, final og \u2603) {
        this.a = \u2603;
        this.a(new yg(\u2603, 0, 56, 17));
        this.a(new xt(\u2603, 1, 56, 53));
        this.a(new xv(\u2603.d, \u2603, 2, 116, 35));
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
    public void a(final xn \u2603) {
        super.a(\u2603);
        \u2603.a(this, this.a);
    }
    
    @Override
    public void b() {
        super.b();
        for (int i = 0; i < this.e.size(); ++i) {
            final xn xn = this.e.get(i);
            if (this.f != this.a.a_(2)) {
                xn.a(this, 2, this.a.a_(2));
            }
            if (this.h != this.a.a_(0)) {
                xn.a(this, 0, this.a.a_(0));
            }
            if (this.i != this.a.a_(1)) {
                xn.a(this, 1, this.a.a_(1));
            }
            if (this.g != this.a.a_(3)) {
                xn.a(this, 3, this.a.a_(3));
            }
        }
        this.f = this.a.a_(2);
        this.h = this.a.a_(0);
        this.i = this.a.a_(1);
        this.g = this.a.a_(3);
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        this.a.b(\u2603, \u2603);
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
            if (\u2603 == 2) {
                if (!this.a(d, 3, 39, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (\u2603 == 1 || \u2603 == 0) {
                if (!this.a(d, 3, 39, false)) {
                    return null;
                }
            }
            else if (abo.a().a(d) != null) {
                if (!this.a(d, 0, 1, false)) {
                    return null;
                }
            }
            else if (alh.c(d)) {
                if (!this.a(d, 1, 2, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 3 && \u2603 < 30) {
                if (!this.a(d, 30, 39, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 30 && \u2603 < 39 && !this.a(d, 3, 30, false)) {
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
