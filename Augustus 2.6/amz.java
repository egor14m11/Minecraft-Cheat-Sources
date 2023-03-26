// 
// Decompiled by Procyon v0.5.36
// 

public class amz
{
    private int a;
    private int b;
    private int c;
    private char[] d;
    private amw e;
    private amw f;
    
    public amz(final int \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.d = new char[4096];
        this.e = new amw();
        if (\u2603) {
            this.f = new amw();
        }
    }
    
    public alz a(final int \u2603, final int \u2603, final int \u2603) {
        final alz alz = afh.d.a(this.d[\u2603 << 8 | \u2603 << 4 | \u2603]);
        if (alz != null) {
            return alz;
        }
        return afi.a.Q();
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final alz \u2603) {
        final alz a = this.a(\u2603, \u2603, \u2603);
        final afh c = a.c();
        final afh c2 = \u2603.c();
        if (c != afi.a) {
            --this.b;
            if (c.y()) {
                --this.c;
            }
        }
        if (c2 != afi.a) {
            ++this.b;
            if (c2.y()) {
                ++this.c;
            }
        }
        this.d[\u2603 << 8 | \u2603 << 4 | \u2603] = (char)afh.d.b(\u2603);
    }
    
    public afh b(final int \u2603, final int \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, \u2603).c();
    }
    
    public int c(final int \u2603, final int \u2603, final int \u2603) {
        final alz a = this.a(\u2603, \u2603, \u2603);
        return a.c().c(a);
    }
    
    public boolean a() {
        return this.b == 0;
    }
    
    public boolean b() {
        return this.c > 0;
    }
    
    public int d() {
        return this.a;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.f.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    public int d(final int \u2603, final int \u2603, final int \u2603) {
        return this.f.a(\u2603, \u2603, \u2603);
    }
    
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.e.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    public int e(final int \u2603, final int \u2603, final int \u2603) {
        return this.e.a(\u2603, \u2603, \u2603);
    }
    
    public void e() {
        this.b = 0;
        this.c = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    final afh b = this.b(i, j, k);
                    if (b != afi.a) {
                        ++this.b;
                        if (b.y()) {
                            ++this.c;
                        }
                    }
                }
            }
        }
    }
    
    public char[] g() {
        return this.d;
    }
    
    public void a(final char[] \u2603) {
        this.d = \u2603;
    }
    
    public amw h() {
        return this.e;
    }
    
    public amw i() {
        return this.f;
    }
    
    public void a(final amw \u2603) {
        this.e = \u2603;
    }
    
    public void b(final amw \u2603) {
        this.f = \u2603;
    }
}
