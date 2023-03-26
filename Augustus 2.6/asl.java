// 
// Decompiled by Procyon v0.5.36
// 

public class asl extends ase
{
    public asl(final long \u2603, final ase \u2603) {
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
                final int \u26032 = a[j + 1 + (i + 1) * (\u2603 + 2)];
                final ady e = ady.e(\u26032);
                if (\u26032 == ady.D.az) {
                    final int \u26033 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                    final int \u26034 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26035 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26036 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                    if (\u26033 == ady.p.az || \u26034 == ady.p.az || \u26035 == ady.p.az || \u26036 == ady.p.az) {
                        a2[j + i * \u2603] = ady.E.az;
                    }
                    else {
                        a2[j + i * \u2603] = \u26032;
                    }
                }
                else if (e != null && e.l() == aej.class) {
                    final int \u26033 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                    final int \u26034 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26035 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26036 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                    if (!this.c(\u26033) || !this.c(\u26034) || !this.c(\u26035) || !this.c(\u26036)) {
                        a2[j + i * \u2603] = ady.M.az;
                    }
                    else if (ase.b(\u26033) || ase.b(\u26034) || ase.b(\u26035) || ase.b(\u26036)) {
                        a2[j + i * \u2603] = ady.F.az;
                    }
                    else {
                        a2[j + i * \u2603] = \u26032;
                    }
                }
                else if (\u26032 == ady.s.az || \u26032 == ady.X.az || \u26032 == ady.J.az) {
                    this.a(a, a2, j, i, \u2603, \u26032, ady.O.az);
                }
                else if (e != null && e.j()) {
                    this.a(a, a2, j, i, \u2603, \u26032, ady.P.az);
                }
                else if (\u26032 == ady.aa.az || \u26032 == ady.ab.az) {
                    final int \u26033 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                    final int \u26034 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26035 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26036 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                    if (ase.b(\u26033) || ase.b(\u26034) || ase.b(\u26035) || ase.b(\u26036)) {
                        a2[j + i * \u2603] = \u26032;
                    }
                    else if (!this.d(\u26033) || !this.d(\u26034) || !this.d(\u26035) || !this.d(\u26036)) {
                        a2[j + i * \u2603] = ady.r.az;
                    }
                    else {
                        a2[j + i * \u2603] = \u26032;
                    }
                }
                else if (\u26032 != ady.p.az && \u26032 != ady.N.az && \u26032 != ady.w.az && \u26032 != ady.v.az) {
                    final int \u26033 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                    final int \u26034 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26035 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                    final int \u26036 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                    if (ase.b(\u26033) || ase.b(\u26034) || ase.b(\u26035) || ase.b(\u26036)) {
                        a2[j + i * \u2603] = ady.F.az;
                    }
                    else {
                        a2[j + i * \u2603] = \u26032;
                    }
                }
                else {
                    a2[j + i * \u2603] = \u26032;
                }
            }
        }
        return a2;
    }
    
    private void a(final int[] \u2603, final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (ase.b(\u2603)) {
            \u2603[\u2603 + \u2603 * \u2603] = \u2603;
            return;
        }
        final int \u26032 = \u2603[\u2603 + 1 + (\u2603 + 1 - 1) * (\u2603 + 2)];
        final int \u26033 = \u2603[\u2603 + 1 + 1 + (\u2603 + 1) * (\u2603 + 2)];
        final int \u26034 = \u2603[\u2603 + 1 - 1 + (\u2603 + 1) * (\u2603 + 2)];
        final int \u26035 = \u2603[\u2603 + 1 + (\u2603 + 1 + 1) * (\u2603 + 2)];
        if (ase.b(\u26032) || ase.b(\u26033) || ase.b(\u26034) || ase.b(\u26035)) {
            \u2603[\u2603 + \u2603 * \u2603] = \u2603;
        }
        else {
            \u2603[\u2603 + \u2603 * \u2603] = \u2603;
        }
    }
    
    private boolean c(final int \u2603) {
        return (ady.e(\u2603) != null && ady.e(\u2603).l() == aej.class) || \u2603 == ady.M.az || \u2603 == ady.K.az || \u2603 == ady.L.az || \u2603 == ady.t.az || \u2603 == ady.u.az || ase.b(\u2603);
    }
    
    private boolean d(final int \u2603) {
        return ady.e(\u2603) instanceof aek;
    }
}
