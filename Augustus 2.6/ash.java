// 
// Decompiled by Procyon v0.5.36
// 

public class ash extends ase
{
    public ash(final long \u2603, final ase \u2603) {
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
                final int n5 = a[j + 1 + (i + 1 - 1) * (\u2603 + 2)];
                final int n6 = a[j + 1 + 1 + (i + 1) * (\u2603 + 2)];
                final int n7 = a[j + 1 - 1 + (i + 1) * (\u2603 + 2)];
                final int n8 = a[j + 1 + (i + 1 + 1) * (\u2603 + 2)];
                final int n9 = a[j + 1 + (i + 1) * n3];
                a2[j + i * \u2603] = n9;
                this.a(j + \u2603, (long)(i + \u2603));
                if (n9 == 0 && n5 == 0 && n6 == 0 && n7 == 0 && n8 == 0 && this.a(2) == 0) {
                    a2[j + i * \u2603] = 1;
                }
            }
        }
        return a2;
    }
}
