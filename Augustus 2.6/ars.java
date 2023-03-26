// 
// Decompiled by Procyon v0.5.36
// 

public class ars extends ase
{
    public ars(final long \u2603, final ase \u2603) {
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
                final int n5 = a[j + 0 + (i + 0) * n3];
                final int n6 = a[j + 2 + (i + 0) * n3];
                final int n7 = a[j + 0 + (i + 2) * n3];
                final int n8 = a[j + 2 + (i + 2) * n3];
                final int n9 = a[j + 1 + (i + 1) * n3];
                this.a(j + \u2603, (long)(i + \u2603));
                if (n9 == 0 && (n5 != 0 || n6 != 0 || n7 != 0 || n8 != 0)) {
                    int n10 = 1;
                    int n11 = 1;
                    if (n5 != 0 && this.a(n10++) == 0) {
                        n11 = n5;
                    }
                    if (n6 != 0 && this.a(n10++) == 0) {
                        n11 = n6;
                    }
                    if (n7 != 0 && this.a(n10++) == 0) {
                        n11 = n7;
                    }
                    if (n8 != 0 && this.a(n10++) == 0) {
                        n11 = n8;
                    }
                    if (this.a(3) == 0) {
                        a2[j + i * \u2603] = n11;
                    }
                    else if (n11 == 4) {
                        a2[j + i * \u2603] = 4;
                    }
                    else {
                        a2[j + i * \u2603] = 0;
                    }
                }
                else if (n9 > 0 && (n5 == 0 || n6 == 0 || n7 == 0 || n8 == 0)) {
                    if (this.a(5) == 0) {
                        if (n9 == 4) {
                            a2[j + i * \u2603] = 4;
                        }
                        else {
                            a2[j + i * \u2603] = 0;
                        }
                    }
                    else {
                        a2[j + i * \u2603] = n9;
                    }
                }
                else {
                    a2[j + i * \u2603] = n9;
                }
            }
        }
        return a2;
    }
}
