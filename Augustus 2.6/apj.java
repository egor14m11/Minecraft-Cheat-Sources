import java.util.Random;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class apj extends aot
{
    private final alz a;
    private final int b;
    private final Predicate<alz> c;
    
    public apj(final alz \u2603, final int \u2603) {
        this(\u2603, \u2603, amg.a(afi.b));
    }
    
    public apj(final alz \u2603, final int \u2603, final Predicate<alz> \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final float n = \u2603.nextFloat() * 3.1415927f;
        final double n2 = \u2603.n() + 8 + ns.a(n) * this.b / 8.0f;
        final double n3 = \u2603.n() + 8 - ns.a(n) * this.b / 8.0f;
        final double n4 = \u2603.p() + 8 + ns.b(n) * this.b / 8.0f;
        final double n5 = \u2603.p() + 8 - ns.b(n) * this.b / 8.0f;
        final double n6 = \u2603.o() + \u2603.nextInt(3) - 2;
        final double n7 = \u2603.o() + \u2603.nextInt(3) - 2;
        for (int i = 0; i < this.b; ++i) {
            final float n8 = i / (float)this.b;
            final double n9 = n2 + (n3 - n2) * n8;
            final double n10 = n6 + (n7 - n6) * n8;
            final double n11 = n4 + (n5 - n4) * n8;
            final double n12 = \u2603.nextDouble() * this.b / 16.0;
            final double n13 = (ns.a(3.1415927f * n8) + 1.0f) * n12 + 1.0;
            final double n14 = (ns.a(3.1415927f * n8) + 1.0f) * n12 + 1.0;
            final int c = ns.c(n9 - n13 / 2.0);
            final int c2 = ns.c(n10 - n14 / 2.0);
            final int c3 = ns.c(n11 - n13 / 2.0);
            final int c4 = ns.c(n9 + n13 / 2.0);
            final int c5 = ns.c(n10 + n14 / 2.0);
            final int c6 = ns.c(n11 + n13 / 2.0);
            for (int j = c; j <= c4; ++j) {
                final double n15 = (j + 0.5 - n9) / (n13 / 2.0);
                if (n15 * n15 < 1.0) {
                    for (int k = c2; k <= c5; ++k) {
                        final double n16 = (k + 0.5 - n10) / (n14 / 2.0);
                        if (n15 * n15 + n16 * n16 < 1.0) {
                            for (int l = c3; l <= c6; ++l) {
                                final double n17 = (l + 0.5 - n11) / (n13 / 2.0);
                                if (n15 * n15 + n16 * n16 + n17 * n17 < 1.0) {
                                    final cj cj = new cj(j, k, l);
                                    if (this.c.apply(\u2603.p(cj))) {
                                        \u2603.a(cj, this.a, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
