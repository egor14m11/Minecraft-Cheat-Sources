// 
// Decompiled by Procyon v0.5.36
// 

public class xl extends xi
{
    private og a;
    private final a f;
    
    public xl(final og \u2603, final og \u2603) {
        this.a = \u2603;
        this.a(this.f = new a(\u2603, 0, 136, 110));
        final int n = 36;
        final int n2 = 137;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, n + j * 18, n2 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, n + i * 18, 58 + n2));
        }
    }
    
    @Override
    public void a(final xn \u2603) {
        super.a(\u2603);
        \u2603.a(this, this.a);
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        this.a.b(\u2603, \u2603);
    }
    
    public og e() {
        return this.a;
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        if (\u2603 == null || \u2603.o.D) {
            return;
        }
        final zx a = this.f.a(this.f.a());
        if (a != null) {
            \u2603.a(a, false);
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
            if (\u2603 == 0) {
                if (!this.a(d, 1, 37, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (!this.f.e() && this.f.a(d) && d.b == 1) {
                if (!this.a(d, 0, 1, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 1 && \u2603 < 28) {
                if (!this.a(d, 28, 37, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 28 && \u2603 < 37) {
                if (!this.a(d, 1, 28, false)) {
                    return null;
                }
            }
            else if (!this.a(d, 1, 37, false)) {
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
    
    class a extends yg
    {
        public a(final og \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        public boolean a(final zx \u2603) {
            return \u2603 != null && (\u2603.b() == zy.bO || \u2603.b() == zy.i || \u2603.b() == zy.k || \u2603.b() == zy.j);
        }
        
        @Override
        public int a() {
            return 1;
        }
    }
}
