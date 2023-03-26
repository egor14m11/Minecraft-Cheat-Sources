import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apq extends aot
{
    private afh a;
    
    public apq(final afh \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (!\u2603.d(\u2603) || \u2603.p(\u2603.b()).c() != this.a) {
            return false;
        }
        final int \u26032 = \u2603.nextInt(32) + 6;
        final int n = \u2603.nextInt(4) + 1;
        final cj.a a = new cj.a();
        for (int i = \u2603.n() - n; i <= \u2603.n() + n; ++i) {
            for (int j = \u2603.p() - n; j <= \u2603.p() + n; ++j) {
                final int k = i - \u2603.n();
                final int n2 = j - \u2603.p();
                if (k * k + n2 * n2 <= n * n + 1 && \u2603.p(a.c(i, \u2603.o() - 1, j)).c() != this.a) {
                    return false;
                }
            }
        }
        for (int i = \u2603.o(); i < \u2603.o() + \u26032 && i < 256; ++i) {
            for (int j = \u2603.n() - n; j <= \u2603.n() + n; ++j) {
                for (int k = \u2603.p() - n; k <= \u2603.p() + n; ++k) {
                    final int n2 = j - \u2603.n();
                    final int n3 = k - \u2603.p();
                    if (n2 * n2 + n3 * n3 <= n * n + 1) {
                        \u2603.a(new cj(j, i, k), afi.Z.Q(), 2);
                    }
                }
            }
        }
        final pk \u26033 = new uf(\u2603);
        \u26033.b(\u2603.n() + 0.5f, \u2603.o() + \u26032, \u2603.p() + 0.5f, \u2603.nextFloat() * 360.0f, 0.0f);
        \u2603.d(\u26033);
        \u2603.a(\u2603.b(\u26032), afi.h.Q(), 2);
        return true;
    }
}
