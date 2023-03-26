// 
// Decompiled by Procyon v0.5.36
// 

public class asr extends ase
{
    public asr(final long \u2603, final ase \u2603) {
        super(\u2603);
        super.a = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 >> 1;
        final int n2 = \u2603 >> 1;
        final int n3 = (\u2603 >> 1) + 2;
        final int n4 = (\u2603 >> 1) + 2;
        final int[] a = this.a.a(n, n2, n3, n4);
        final int n5 = n3 - 1 << 1;
        final int n6 = n4 - 1 << 1;
        final int[] a2 = asc.a(n5 * n6);
        for (int i = 0; i < n4 - 1; ++i) {
            int j = (i << 1) * n5;
            int k = 0;
            int \u26032 = a[k + 0 + (i + 0) * n3];
            int \u26033 = a[k + 0 + (i + 1) * n3];
            while (k < n3 - 1) {
                this.a(k + n << 1, (long)(i + n2 << 1));
                final int \u26034 = a[k + 1 + (i + 0) * n3];
                final int \u26035 = a[k + 1 + (i + 1) * n3];
                a2[j] = \u26032;
                a2[j++ + n5] = this.a(new int[] { \u26032, \u26033 });
                a2[j] = this.a(new int[] { \u26032, \u26034 });
                a2[j++ + n5] = this.b(\u26032, \u26034, \u26033, \u26035);
                \u26032 = \u26034;
                \u26033 = \u26035;
                ++k;
            }
        }
        final int[] a3 = asc.a(\u2603 * \u2603);
        for (int j = 0; j < \u2603; ++j) {
            System.arraycopy(a2, (j + (\u2603 & 0x1)) * n5 + (\u2603 & 0x1), a3, j * \u2603, \u2603);
        }
        return a3;
    }
    
    public static ase b(final long \u2603, final ase \u2603, final int \u2603) {
        ase \u26032 = \u2603;
        for (int i = 0; i < \u2603; ++i) {
            \u26032 = new asr(\u2603 + i, \u26032);
        }
        return \u26032;
    }
}
