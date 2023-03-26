import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ape extends apg
{
    public ape(final boolean \u2603, final int \u2603, final int \u2603, final alz \u2603, final alz \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int a = this.a(\u2603);
        if (!this.a(\u2603, \u2603, \u2603, a)) {
            return false;
        }
        this.c(\u2603, \u2603.b(a), 2);
        for (int i = \u2603.o() + a - 2 - \u2603.nextInt(4); i > \u2603.o() + a / 2; i -= 2 + \u2603.nextInt(4)) {
            final float n = \u2603.nextFloat() * 3.1415927f * 2.0f;
            int n2 = \u2603.n() + (int)(0.5f + ns.b(n) * 4.0f);
            int n3 = \u2603.p() + (int)(0.5f + ns.a(n) * 4.0f);
            for (int j = 0; j < 5; ++j) {
                n2 = \u2603.n() + (int)(1.5f + ns.b(n) * j);
                n3 = \u2603.p() + (int)(1.5f + ns.a(n) * j);
                this.a(\u2603, new cj(n2, i - 3 + j / 2, n3), this.b);
            }
            int j = 1 + \u2603.nextInt(2);
            for (int n4 = i, k = n4 - j; k <= n4; ++k) {
                final int n5 = k - n4;
                this.b(\u2603, new cj(n2, k, n3), 1 - n5);
            }
        }
        for (int l = 0; l < a; ++l) {
            final cj b = \u2603.b(l);
            if (this.a(\u2603.p(b).c())) {
                this.a(\u2603, b, this.b);
                if (l > 0) {
                    this.a(\u2603, \u2603, b.e(), akk.N);
                    this.a(\u2603, \u2603, b.c(), akk.O);
                }
            }
            if (l < a - 1) {
                final cj f = b.f();
                if (this.a(\u2603.p(f).c())) {
                    this.a(\u2603, f, this.b);
                    if (l > 0) {
                        this.a(\u2603, \u2603, f.f(), akk.P);
                        this.a(\u2603, \u2603, f.c(), akk.O);
                    }
                }
                final cj f2 = b.d().f();
                if (this.a(\u2603.p(f2).c())) {
                    this.a(\u2603, f2, this.b);
                    if (l > 0) {
                        this.a(\u2603, \u2603, f2.f(), akk.P);
                        this.a(\u2603, \u2603, f2.d(), akk.b);
                    }
                }
                final cj d = b.d();
                if (this.a(\u2603.p(d).c())) {
                    this.a(\u2603, d, this.b);
                    if (l > 0) {
                        this.a(\u2603, \u2603, d.e(), akk.N);
                        this.a(\u2603, \u2603, d.d(), akk.b);
                    }
                }
            }
        }
        return true;
    }
    
    private void a(final adm \u2603, final Random \u2603, final cj \u2603, final amk \u2603) {
        if (\u2603.nextInt(3) > 0 && \u2603.d(\u2603)) {
            this.a(\u2603, \u2603, afi.bn.Q().a((amo<Comparable>)\u2603, true));
        }
    }
    
    private void c(final adm \u2603, final cj \u2603, final int \u2603) {
        final int n = 2;
        for (int i = -n; i <= 0; ++i) {
            this.a(\u2603, \u2603.b(i), \u2603 + 1 - i);
        }
    }
}
