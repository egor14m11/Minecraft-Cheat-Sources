// 
// Decompiled by Procyon v0.5.36
// 

public class yb extends xi
{
    private acy a;
    private ya f;
    private final adm g;
    
    public yb(final wm \u2603, final acy \u2603, final adm \u2603) {
        this.a = \u2603;
        this.g = \u2603;
        this.f = new ya(\u2603.d, \u2603);
        this.a(new yg(this.f, 0, 36, 53));
        this.a(new yg(this.f, 1, 62, 53));
        this.a(new yc(\u2603.d, \u2603, this.f, 2, 120, 53));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 142));
        }
    }
    
    public ya e() {
        return this.f;
    }
    
    @Override
    public void a(final xn \u2603) {
        super.a(\u2603);
    }
    
    @Override
    public void b() {
        super.b();
    }
    
    @Override
    public void a(final og \u2603) {
        this.f.h();
        super.a(\u2603);
    }
    
    public void d(final int \u2603) {
        this.f.d(\u2603);
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.a.v_() == \u2603;
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
            else if (\u2603 == 0 || \u2603 == 1) {
                if (!this.a(d, 3, 39, false)) {
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
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        this.a.a_((wn)null);
        super.b(\u2603);
        if (this.g.D) {
            return;
        }
        zx zx = this.f.b(0);
        if (zx != null) {
            \u2603.a(zx, false);
        }
        zx = this.f.b(1);
        if (zx != null) {
            \u2603.a(zx, false);
        }
    }
}
