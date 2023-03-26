// 
// Decompiled by Procyon v0.5.36
// 

public class asf extends ase
{
    public asf(final long \u2603, final ase \u2603) {
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
                if (this.a(57) == 0) {
                    if (n == ady.q.az) {
                        a2[j + i * \u2603] = ady.q.az + 128;
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
        return a2;
    }
}
