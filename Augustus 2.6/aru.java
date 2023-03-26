// 
// Decompiled by Procyon v0.5.36
// 

public class aru extends ase
{
    public aru(final long \u2603, final ase \u2603) {
        super(\u2603);
        this.a = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 - 1;
        final int n2 = \u2603 - 1;
        final int n3 = \u2603 + 2;
        final int n4 = \u2603 + 2;
        final int[] a = this.a.a(n, n2, n3, n4);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                final int n5 = a[j + 1 + (i + 1) * n3];
                this.a(j + \u2603, (long)(i + \u2603));
                if (n5 == 0) {
                    a2[j + i * \u2603] = 0;
                }
                else {
                    int a3 = this.a(6);
                    if (a3 == 0) {
                        a3 = 4;
                    }
                    else if (a3 <= 1) {
                        a3 = 3;
                    }
                    else {
                        a3 = 1;
                    }
                    a2[j + i * \u2603] = a3;
                }
            }
        }
        return a2;
    }
}
