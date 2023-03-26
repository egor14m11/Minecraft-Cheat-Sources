// 
// Decompiled by Procyon v0.5.36
// 

public class arr extends ase
{
    private final a c;
    
    public arr(final long \u2603, final ase \u2603, final a \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        switch (arr$1.a[this.c.ordinal()]) {
            default: {
                return this.c(\u2603, \u2603, \u2603, \u2603);
            }
            case 2: {
                return this.d(\u2603, \u2603, \u2603, \u2603);
            }
            case 3: {
                return this.e(\u2603, \u2603, \u2603, \u2603);
            }
        }
    }
    
    private int[] c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 - 1;
        final int n2 = \u2603 - 1;
        final int n3 = 1 + \u2603 + 1;
        final int n4 = 1 + \u2603 + 1;
        final int[] a = this.a.a(n, n2, n3, n4);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                int n5 = a[j + 1 + (i + 1) * n3];
                if (n5 == 1) {
                    final int n6 = a[j + 1 + (i + 1 - 1) * n3];
                    final int n7 = a[j + 1 + 1 + (i + 1) * n3];
                    final int n8 = a[j + 1 - 1 + (i + 1) * n3];
                    final int n9 = a[j + 1 + (i + 1 + 1) * n3];
                    final boolean b = n6 == 3 || n7 == 3 || n8 == 3 || n9 == 3;
                    final boolean b2 = n6 == 4 || n7 == 4 || n8 == 4 || n9 == 4;
                    if (b || b2) {
                        n5 = 2;
                    }
                }
                a2[j + i * \u2603] = n5;
            }
        }
        return a2;
    }
    
    private int[] d(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 - 1;
        final int n2 = \u2603 - 1;
        final int n3 = 1 + \u2603 + 1;
        final int n4 = 1 + \u2603 + 1;
        final int[] a = this.a.a(n, n2, n3, n4);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                int n5 = a[j + 1 + (i + 1) * n3];
                if (n5 == 4) {
                    final int n6 = a[j + 1 + (i + 1 - 1) * n3];
                    final int n7 = a[j + 1 + 1 + (i + 1) * n3];
                    final int n8 = a[j + 1 - 1 + (i + 1) * n3];
                    final int n9 = a[j + 1 + (i + 1 + 1) * n3];
                    final boolean b = n6 == 2 || n7 == 2 || n8 == 2 || n9 == 2;
                    final boolean b2 = n6 == 1 || n7 == 1 || n8 == 1 || n9 == 1;
                    if (b2 || b) {
                        n5 = 3;
                    }
                }
                a2[j + i * \u2603] = n5;
            }
        }
        return a2;
    }
    
    private int[] e(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.a.a(\u2603, \u2603, \u2603, \u2603);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                int n = a[j + i * \u2603];
                if (n != 0 && this.a(13) == 0) {
                    n |= (1 + this.a(15) << 8 & 0xF00);
                }
                a2[j + i * \u2603] = n;
            }
        }
        return a2;
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
