import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class tc
{
    private static aui a;
    
    public static aui a(final py \u2603, final int \u2603, final int \u2603) {
        return c(\u2603, \u2603, \u2603, null);
    }
    
    public static aui a(final py \u2603, final int \u2603, final int \u2603, final aui \u2603) {
        tc.a = \u2603.a(\u2603.s, \u2603.t, \u2603.u);
        return c(\u2603, \u2603, \u2603, tc.a);
    }
    
    public static aui b(final py \u2603, final int \u2603, final int \u2603, final aui \u2603) {
        tc.a = new aui(\u2603.s, \u2603.t, \u2603.u).d(\u2603);
        return c(\u2603, \u2603, \u2603, tc.a);
    }
    
    private static aui c(final py \u2603, final int \u2603, final int \u2603, final aui \u2603) {
        final Random bc = \u2603.bc();
        boolean b = false;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        float n4 = -99999.0f;
        boolean b2;
        if (\u2603.ck()) {
            final double n5 = \u2603.ch().c(ns.c(\u2603.s), ns.c(\u2603.t), ns.c(\u2603.u)) + 4.0;
            final double n6 = \u2603.ci() + \u2603;
            b2 = (n5 < n6 * n6);
        }
        else {
            b2 = false;
        }
        for (int i = 0; i < 10; ++i) {
            int \u26032 = bc.nextInt(2 * \u2603 + 1) - \u2603;
            int \u26033 = bc.nextInt(2 * \u2603 + 1) - \u2603;
            int \u26034 = bc.nextInt(2 * \u2603 + 1) - \u2603;
            if (\u2603 == null || \u26032 * \u2603.a + \u26034 * \u2603.c >= 0.0) {
                if (\u2603.ck() && \u2603 > 1) {
                    final cj ch = \u2603.ch();
                    if (\u2603.s > ch.n()) {
                        \u26032 -= bc.nextInt(\u2603 / 2);
                    }
                    else {
                        \u26032 += bc.nextInt(\u2603 / 2);
                    }
                    if (\u2603.u > ch.p()) {
                        \u26034 -= bc.nextInt(\u2603 / 2);
                    }
                    else {
                        \u26034 += bc.nextInt(\u2603 / 2);
                    }
                }
                \u26032 += ns.c(\u2603.s);
                \u26033 += ns.c(\u2603.t);
                \u26034 += ns.c(\u2603.u);
                final cj ch = new cj(\u26032, \u26033, \u26034);
                if (!b2 || \u2603.e(ch)) {
                    final float a = \u2603.a(ch);
                    if (a > n4) {
                        n4 = a;
                        n = \u26032;
                        n2 = \u26033;
                        n3 = \u26034;
                        b = true;
                    }
                }
            }
        }
        if (b) {
            return new aui(n, n2, n3);
        }
        return null;
    }
    
    static {
        tc.a = new aui(0.0, 0.0, 0.0);
    }
}
