// 
// Decompiled by Procyon v0.5.36
// 

public class arv extends ase
{
    public arv(final long \u2603, final ase \u2603) {
        super(\u2603);
        this.a = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.a.a(\u2603 - 1, \u2603 - 1, \u2603 + 2, \u2603 + 2);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                final int n = a[j + 1 + (i + 1) * (\u2603 + 2)];
                if (!this.a(a, a2, j, i, \u2603, n, ady.s.az, ady.J.az)) {
                    if (!this.b(a, a2, j, i, \u2603, n, ady.ab.az, ady.aa.az)) {
                        if (!this.b(a, a2, j, i, \u2603, n, ady.ac.az, ady.aa.az)) {
                            if (!this.b(a, a2, j, i, \u2603, n, ady.V.az, ady.u.az)) {
                                if (n == ady.r.az) {
                                    final int n2 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                                    final int n3 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                                    final int n4 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                                    final int n5 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                                    if (n2 == ady.B.az || n3 == ady.B.az || n4 == ady.B.az || n5 == ady.B.az) {
                                        a2[j + i * \u2603] = ady.X.az;
                                    }
                                    else {
                                        a2[j + i * \u2603] = n;
                                    }
                                }
                                else if (n == ady.v.az) {
                                    final int n2 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                                    final int n3 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                                    final int n4 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                                    final int n5 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                                    if (n2 == ady.r.az || n3 == ady.r.az || n4 == ady.r.az || n5 == ady.r.az || n2 == ady.T.az || n3 == ady.T.az || n4 == ady.T.az || n5 == ady.T.az || n2 == ady.B.az || n3 == ady.B.az || n4 == ady.B.az || n5 == ady.B.az) {
                                        a2[j + i * \u2603] = ady.q.az;
                                    }
                                    else if (n2 == ady.K.az || n5 == ady.K.az || n3 == ady.K.az || n4 == ady.K.az) {
                                        a2[j + i * \u2603] = ady.M.az;
                                    }
                                    else {
                                        a2[j + i * \u2603] = n;
                                    }
                                }
                                else {
                                    a2[j + i * \u2603] = n;
                                }
                            }
                        }
                    }
                }
            }
        }
        return a2;
    }
    
    private boolean a(final int[] \u2603, final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (ase.a(\u2603, \u2603)) {
            final int \u26032 = \u2603[\u2603 + 1 + (\u2603 + 1 - 1) * (\u2603 + 2)];
            final int \u26033 = \u2603[\u2603 + 1 + 1 + (\u2603 + 1) * (\u2603 + 2)];
            final int \u26034 = \u2603[\u2603 + 1 - 1 + (\u2603 + 1) * (\u2603 + 2)];
            final int \u26035 = \u2603[\u2603 + 1 + (\u2603 + 1 + 1) * (\u2603 + 2)];
            if (!this.b(\u26032, \u2603) || !this.b(\u26033, \u2603) || !this.b(\u26034, \u2603) || !this.b(\u26035, \u2603)) {
                \u2603[\u2603 + \u2603 * \u2603] = \u2603;
            }
            else {
                \u2603[\u2603 + \u2603 * \u2603] = \u2603;
            }
            return true;
        }
        return false;
    }
    
    private boolean b(final int[] \u2603, final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == \u2603) {
            final int \u26032 = \u2603[\u2603 + 1 + (\u2603 + 1 - 1) * (\u2603 + 2)];
            final int \u26033 = \u2603[\u2603 + 1 + 1 + (\u2603 + 1) * (\u2603 + 2)];
            final int \u26034 = \u2603[\u2603 + 1 - 1 + (\u2603 + 1) * (\u2603 + 2)];
            final int \u26035 = \u2603[\u2603 + 1 + (\u2603 + 1 + 1) * (\u2603 + 2)];
            if (!ase.a(\u26032, \u2603) || !ase.a(\u26033, \u2603) || !ase.a(\u26034, \u2603) || !ase.a(\u26035, \u2603)) {
                \u2603[\u2603 + \u2603 * \u2603] = \u2603;
            }
            else {
                \u2603[\u2603 + \u2603 * \u2603] = \u2603;
            }
            return true;
        }
        return false;
    }
    
    private boolean b(final int \u2603, final int \u2603) {
        if (ase.a(\u2603, \u2603)) {
            return true;
        }
        final ady e = ady.e(\u2603);
        final ady e2 = ady.e(\u2603);
        if (e != null && e2 != null) {
            final ady.b m = e.m();
            final ady.b i = e2.m();
            return m == i || m == ady.b.c || i == ady.b.c;
        }
        return false;
    }
}
