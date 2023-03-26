// 
// Decompiled by Procyon v0.5.36
// 

public class asj extends ase
{
    public asj(final long \u2603, final ase \u2603) {
        super(\u2603);
        super.a = \u2603;
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
                final int c = this.c(a[j + 0 + (i + 1) * n3]);
                final int c2 = this.c(a[j + 2 + (i + 1) * n3]);
                final int c3 = this.c(a[j + 1 + (i + 0) * n3]);
                final int c4 = this.c(a[j + 1 + (i + 2) * n3]);
                final int c5 = this.c(a[j + 1 + (i + 1) * n3]);
                if (c5 != c || c5 != c3 || c5 != c2 || c5 != c4) {
                    a2[j + i * \u2603] = ady.w.az;
                }
                else {
                    a2[j + i * \u2603] = -1;
                }
            }
        }
        return a2;
    }
    
    private int c(final int \u2603) {
        if (\u2603 >= 2) {
            return 2 + (\u2603 & 0x1);
        }
        return \u2603;
    }
}
