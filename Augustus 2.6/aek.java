import java.util.Arrays;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aek extends ady
{
    private alz[] aD;
    private long aE;
    private ard aF;
    private ard aG;
    private ard aH;
    private boolean aI;
    private boolean aJ;
    
    public aek(final int \u2603, final boolean \u2603, final boolean \u2603) {
        super(\u2603);
        this.aI = \u2603;
        this.aJ = \u2603;
        this.b();
        this.a(2.0f, 0.0f);
        this.au.clear();
        this.ak = afi.m.Q().a(ajh.a, ajh.a.b);
        this.al = afi.cu.Q();
        this.as.A = -999;
        this.as.D = 20;
        this.as.F = 3;
        this.as.G = 5;
        this.as.B = 0;
        this.au.clear();
        if (\u2603) {
            this.as.A = 5;
        }
    }
    
    @Override
    public aoh a(final Random \u2603) {
        return this.aA;
    }
    
    @Override
    public int c(final cj \u2603) {
        return 10387789;
    }
    
    @Override
    public int b(final cj \u2603) {
        return 9470285;
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        if (this.aD == null || this.aE != \u2603.J()) {
            this.a(\u2603.J());
        }
        if (this.aF == null || this.aG == null || this.aE != \u2603.J()) {
            final Random random = new Random(this.aE);
            this.aF = new ard(random, 4);
            this.aG = new ard(random, 1);
        }
        this.aE = \u2603.J();
        double n = 0.0;
        if (this.aI) {
            final int n2 = (\u2603 & 0xFFFFFFF0) + (\u2603 & 0xF);
            final int n3 = (\u2603 & 0xFFFFFFF0) + (\u2603 & 0xF);
            final double min = Math.min(Math.abs(\u2603), this.aF.a(n2 * 0.25, n3 * 0.25));
            if (min > 0.0) {
                final double n4 = 0.001953125;
                final double abs = Math.abs(this.aG.a(n2 * n4, n3 * n4));
                n = min * min * 2.5;
                final double n5 = Math.ceil(abs * 50.0) + 14.0;
                if (n > n5) {
                    n = n5;
                }
                n += 64.0;
            }
        }
        final int n2 = \u2603 & 0xF;
        final int n3 = \u2603 & 0xF;
        final int f = \u2603.F();
        alz alz = afi.cu.Q();
        alz \u26032 = this.al;
        final int n6 = (int)(\u2603 / 3.0 + 3.0 + \u2603.nextDouble() * 0.25);
        final boolean b = Math.cos(\u2603 / 3.0 * 3.141592653589793) > 0.0;
        int n7 = -1;
        boolean b2 = false;
        for (int i = 255; i >= 0; --i) {
            if (\u2603.a(n3, i, n2).c().t() == arm.a && i < (int)n) {
                \u2603.a(n3, i, n2, afi.b.Q());
            }
            if (i <= \u2603.nextInt(5)) {
                \u2603.a(n3, i, n2, afi.h.Q());
            }
            else {
                final alz a = \u2603.a(n3, i, n2);
                if (a.c().t() == arm.a) {
                    n7 = -1;
                }
                else if (a.c() == afi.b) {
                    if (n7 == -1) {
                        b2 = false;
                        if (n6 <= 0) {
                            alz = null;
                            \u26032 = afi.b.Q();
                        }
                        else if (i >= f - 4 && i <= f + 1) {
                            alz = afi.cu.Q();
                            \u26032 = this.al;
                        }
                        if (i < f && (alz == null || alz.c().t() == arm.a)) {
                            alz = afi.j.Q();
                        }
                        n7 = n6 + Math.max(0, i - f);
                        if (i >= f - 1) {
                            if (this.aJ && i > 86 + n6 * 2) {
                                if (b) {
                                    \u2603.a(n3, i, n2, afi.d.Q().a(agf.a, agf.a.b));
                                }
                                else {
                                    \u2603.a(n3, i, n2, afi.c.Q());
                                }
                            }
                            else if (i > f + 3 + n6) {
                                alz alz2;
                                if (i < 64 || i > 127) {
                                    alz2 = afi.cu.Q().a(afv.a, zd.b);
                                }
                                else if (b) {
                                    alz2 = afi.cz.Q();
                                }
                                else {
                                    alz2 = this.a(\u2603, i, \u2603);
                                }
                                \u2603.a(n3, i, n2, alz2);
                            }
                            else {
                                \u2603.a(n3, i, n2, this.ak);
                                b2 = true;
                            }
                        }
                        else {
                            \u2603.a(n3, i, n2, \u26032);
                            if (\u26032.c() == afi.cu) {
                                \u2603.a(n3, i, n2, \u26032.c().Q().a(afv.a, zd.b));
                            }
                        }
                    }
                    else if (n7 > 0) {
                        --n7;
                        if (b2) {
                            \u2603.a(n3, i, n2, afi.cu.Q().a(afv.a, zd.b));
                        }
                        else {
                            final alz alz2 = this.a(\u2603, i, \u2603);
                            \u2603.a(n3, i, n2, alz2);
                        }
                    }
                }
            }
        }
    }
    
    private void a(final long \u2603) {
        Arrays.fill(this.aD = new alz[64], afi.cz.Q());
        final Random \u26032 = new Random(\u2603);
        this.aH = new ard(\u26032, 1);
        for (int i = 0; i < 64; ++i) {
            i += \u26032.nextInt(5) + 1;
            if (i < 64) {
                this.aD[i] = afi.cu.Q().a(afv.a, zd.b);
            }
        }
        for (int i = \u26032.nextInt(4) + 2, j = 0; j < i; ++j) {
            for (int k = \u26032.nextInt(3) + 1, l = \u26032.nextInt(64), nextInt = 0; l + nextInt < 64 && nextInt < k; ++nextInt) {
                this.aD[l + nextInt] = afi.cu.Q().a(afv.a, zd.e);
            }
        }
        for (int j = \u26032.nextInt(4) + 2, k = 0; k < j; ++k) {
            for (int l = \u26032.nextInt(3) + 2, nextInt = \u26032.nextInt(64), nextInt2 = 0; nextInt + nextInt2 < 64 && nextInt2 < l; ++nextInt2) {
                this.aD[nextInt + nextInt2] = afi.cu.Q().a(afv.a, zd.m);
            }
        }
        for (int k = \u26032.nextInt(4) + 2, l = 0; l < k; ++l) {
            for (int nextInt = \u26032.nextInt(3) + 1, nextInt2 = \u26032.nextInt(64), n = 0; nextInt2 + n < 64 && n < nextInt; ++n) {
                this.aD[nextInt2 + n] = afi.cu.Q().a(afv.a, zd.o);
            }
        }
        int l = \u26032.nextInt(3) + 3;
        int nextInt = 0;
        for (int nextInt2 = 0; nextInt2 < l; ++nextInt2) {
            final int n = 1;
            nextInt += \u26032.nextInt(16) + 4;
            for (int n2 = 0; nextInt + n2 < 64 && n2 < n; ++n2) {
                this.aD[nextInt + n2] = afi.cu.Q().a(afv.a, zd.a);
                if (nextInt + n2 > 1 && \u26032.nextBoolean()) {
                    this.aD[nextInt + n2 - 1] = afi.cu.Q().a(afv.a, zd.i);
                }
                if (nextInt + n2 < 63 && \u26032.nextBoolean()) {
                    this.aD[nextInt + n2 + 1] = afi.cu.Q().a(afv.a, zd.i);
                }
            }
        }
    }
    
    private alz a(final int \u2603, final int \u2603, final int \u2603) {
        final int n = (int)Math.round(this.aH.a(\u2603 * 1.0 / 512.0, \u2603 * 1.0 / 512.0) * 2.0);
        return this.aD[(\u2603 + n + 64) % 64];
    }
    
    @Override
    protected ady d(final int \u2603) {
        final boolean \u26032 = this.az == ady.aa.az;
        final aek aek = new aek(\u2603, \u26032, this.aJ);
        if (!\u26032) {
            aek.a(aek.g);
            aek.a(this.ah + " M");
        }
        else {
            aek.a(this.ah + " (Bryce)");
        }
        aek.a(this.ai, true);
        return aek;
    }
}
