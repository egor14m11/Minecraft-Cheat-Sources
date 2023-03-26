import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class asg extends ase
{
    private static final Logger c;
    private ase d;
    
    public asg(final long \u2603, final ase \u2603, final ase \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.a.a(\u2603 - 1, \u2603 - 1, \u2603 + 2, \u2603 + 2);
        final int[] a2 = this.d.a(\u2603 - 1, \u2603 - 1, \u2603 + 2, \u2603 + 2);
        final int[] a3 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                final int n = a[j + 1 + (i + 1) * (\u2603 + 2)];
                final int n2 = a2[j + 1 + (i + 1) * (\u2603 + 2)];
                final boolean b = (n2 - 2) % 29 == 0;
                if (n > 255) {
                    asg.c.debug("old! " + n);
                }
                if (n != 0 && n2 >= 2 && (n2 - 2) % 29 == 1 && n < 128) {
                    if (ady.e(n + 128) != null) {
                        a3[j + i * \u2603] = n + 128;
                    }
                    else {
                        a3[j + i * \u2603] = n;
                    }
                }
                else if (this.a(3) == 0 || b) {
                    int n3;
                    if ((n3 = n) == ady.r.az) {
                        n3 = ady.G.az;
                    }
                    else if (n == ady.t.az) {
                        n3 = ady.H.az;
                    }
                    else if (n == ady.Q.az) {
                        n3 = ady.R.az;
                    }
                    else if (n == ady.S.az) {
                        n3 = ady.q.az;
                    }
                    else if (n == ady.u.az) {
                        n3 = ady.I.az;
                    }
                    else if (n == ady.V.az) {
                        n3 = ady.W.az;
                    }
                    else if (n == ady.T.az) {
                        n3 = ady.U.az;
                    }
                    else if (n == ady.q.az) {
                        if (this.a(3) == 0) {
                            n3 = ady.H.az;
                        }
                        else {
                            n3 = ady.t.az;
                        }
                    }
                    else if (n == ady.B.az) {
                        n3 = ady.C.az;
                    }
                    else if (n == ady.K.az) {
                        n3 = ady.L.az;
                    }
                    else if (n == ady.p.az) {
                        n3 = ady.N.az;
                    }
                    else if (n == ady.s.az) {
                        n3 = ady.X.az;
                    }
                    else if (n == ady.Y.az) {
                        n3 = ady.Z.az;
                    }
                    else if (ase.a(n, ady.ab.az)) {
                        n3 = ady.aa.az;
                    }
                    else if (n == ady.N.az && this.a(3) == 0) {
                        final int a4 = this.a(2);
                        if (a4 == 0) {
                            n3 = ady.q.az;
                        }
                        else {
                            n3 = ady.t.az;
                        }
                    }
                    if (b && n3 != n) {
                        if (ady.e(n3 + 128) != null) {
                            n3 += 128;
                        }
                        else {
                            n3 = n;
                        }
                    }
                    if (n3 == n) {
                        a3[j + i * \u2603] = n;
                    }
                    else {
                        final int a4 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                        final int \u26032 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                        final int \u26033 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                        final int \u26034 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                        int n4 = 0;
                        if (ase.a(a4, n)) {
                            ++n4;
                        }
                        if (ase.a(\u26032, n)) {
                            ++n4;
                        }
                        if (ase.a(\u26033, n)) {
                            ++n4;
                        }
                        if (ase.a(\u26034, n)) {
                            ++n4;
                        }
                        if (n4 >= 3) {
                            a3[j + i * \u2603] = n3;
                        }
                        else {
                            a3[j + i * \u2603] = n;
                        }
                    }
                }
                else {
                    a3[j + i * \u2603] = n;
                }
            }
        }
        return a3;
    }
    
    static {
        c = LogManager.getLogger();
    }
}
