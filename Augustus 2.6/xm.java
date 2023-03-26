// 
// Decompiled by Procyon v0.5.36
// 

public class xm extends xi
{
    private og a;
    private final yg f;
    private int g;
    
    public xm(final wm \u2603, final og \u2603) {
        this.a = \u2603;
        this.a(new b(\u2603.d, \u2603, 0, 56, 46));
        this.a(new b(\u2603.d, \u2603, 1, 79, 53));
        this.a(new b(\u2603.d, \u2603, 2, 102, 46));
        this.f = this.a(new a(\u2603, 3, 79, 17));
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
            if (this.g != this.a.a_(0)) {
                xn.a(this, 0, this.a.a_(0));
            }
        }
        this.g = this.a.a_(0);
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
            if ((\u2603 >= 0 && \u2603 <= 2) || \u2603 == 3) {
                if (!this.a(d, 4, 40, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (!this.f.e() && this.f.a(d)) {
                if (!this.a(d, 3, 4, false)) {
                    return null;
                }
            }
            else if (b.b_(k)) {
                if (!this.a(d, 0, 3, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 4 && \u2603 < 31) {
                if (!this.a(d, 31, 40, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 31 && \u2603 < 40) {
                if (!this.a(d, 4, 31, false)) {
                    return null;
                }
            }
            else if (!this.a(d, 4, 40, false)) {
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
    
    static class b extends yg
    {
        private wn a;
        
        public b(final wn \u2603, final og \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, \u2603);
            this.a = \u2603;
        }
        
        @Override
        public boolean a(final zx \u2603) {
            return b_(\u2603);
        }
        
        @Override
        public int a() {
            return 1;
        }
        
        @Override
        public void a(final wn \u2603, final zx \u2603) {
            if (\u2603.b() == zy.bz && \u2603.i() > 0) {
                this.a.b(mr.B);
            }
            super.a(\u2603, \u2603);
        }
        
        public static boolean b_(final zx \u2603) {
            return \u2603 != null && (\u2603.b() == zy.bz || \u2603.b() == zy.bA);
        }
    }
    
    class a extends yg
    {
        public a(final og \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        public boolean a(final zx \u2603) {
            return \u2603 != null && \u2603.b().l(\u2603);
        }
        
        @Override
        public int a() {
            return 64;
        }
    }
}
