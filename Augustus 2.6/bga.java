// 
// Decompiled by Procyon v0.5.36
// 

public class bga
{
    protected final bfr a;
    protected final adm b;
    protected int c;
    protected int d;
    protected int e;
    public bht[] f;
    
    public bga(final adm \u2603, final int \u2603, final bfr \u2603, final bhu \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.a(\u2603);
        this.a(\u2603);
    }
    
    protected void a(final bhu \u2603) {
        final int n = this.d * this.c * this.e;
        this.f = new bht[n];
        int n2 = 0;
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.c; ++j) {
                for (int k = 0; k < this.e; ++k) {
                    final int n3 = (k * this.c + j) * this.d + i;
                    final cj cj = new cj(i * 16, j * 16, k * 16);
                    this.f[n3] = \u2603.a(this.b, this.a, cj, n2++);
                }
            }
        }
    }
    
    public void a() {
        for (final bht bht : this.f) {
            bht.a();
        }
    }
    
    protected void a(final int \u2603) {
        final int n = \u2603 * 2 + 1;
        this.d = n;
        this.c = 16;
        this.e = n;
    }
    
    public void a(final double \u2603, final double \u2603) {
        final int \u26032 = ns.c(\u2603) - 8;
        final int \u26033 = ns.c(\u2603) - 8;
        final int n = this.d * 16;
        for (int i = 0; i < this.d; ++i) {
            final int a = this.a(\u26032, n, i);
            for (int j = 0; j < this.e; ++j) {
                final int a2 = this.a(\u26033, n, j);
                for (int k = 0; k < this.c; ++k) {
                    final int \u26034 = k * 16;
                    final bht bht = this.f[(j * this.c + k) * this.d + i];
                    final cj \u26035 = new cj(a, \u26034, a2);
                    if (!\u26035.equals(bht.j())) {
                        bht.a(\u26035);
                    }
                }
            }
        }
    }
    
    private int a(final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 * 16;
        int n2 = n - \u2603 + \u2603 / 2;
        if (n2 < 0) {
            n2 -= \u2603 - 1;
        }
        return n - n2 / \u2603 * \u2603;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int a = ns.a(\u2603, 16);
        final int a2 = ns.a(\u2603, 16);
        final int a3 = ns.a(\u2603, 16);
        final int a4 = ns.a(\u2603, 16);
        final int a5 = ns.a(\u2603, 16);
        final int a6 = ns.a(\u2603, 16);
        for (int i = a; i <= a4; ++i) {
            int n = i % this.d;
            if (n < 0) {
                n += this.d;
            }
            for (int j = a2; j <= a5; ++j) {
                int n2 = j % this.c;
                if (n2 < 0) {
                    n2 += this.c;
                }
                for (int k = a3; k <= a6; ++k) {
                    int n3 = k % this.e;
                    if (n3 < 0) {
                        n3 += this.e;
                    }
                    final int n4 = (n3 * this.c + n2) * this.d + n;
                    final bht bht = this.f[n4];
                    bht.a(true);
                }
            }
        }
    }
    
    protected bht a(final cj \u2603) {
        int a = ns.a(\u2603.n(), 16);
        final int a2 = ns.a(\u2603.o(), 16);
        int a3 = ns.a(\u2603.p(), 16);
        if (a2 < 0 || a2 >= this.c) {
            return null;
        }
        a %= this.d;
        if (a < 0) {
            a += this.d;
        }
        a3 %= this.e;
        if (a3 < 0) {
            a3 += this.e;
        }
        final int n = (a3 * this.c + a2) * this.d + a;
        return this.f[n];
    }
}
