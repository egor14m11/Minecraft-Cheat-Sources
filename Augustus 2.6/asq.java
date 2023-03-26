// 
// Decompiled by Procyon v0.5.36
// 

public class asq extends ase
{
    public asq(final long \u2603, final ase \u2603) {
        super(\u2603);
        super.a = \u2603;
    }
    
    @Override
    public int[] a(int \u2603, int \u2603, final int \u2603, final int \u2603) {
        \u2603 -= 2;
        \u2603 -= 2;
        final int n = \u2603 >> 2;
        final int n2 = \u2603 >> 2;
        final int n3 = (\u2603 >> 2) + 2;
        final int n4 = (\u2603 >> 2) + 2;
        final int[] a = this.a.a(n, n2, n3, n4);
        final int n5 = n3 - 1 << 2;
        final int n6 = n4 - 1 << 2;
        final int[] a2 = asc.a(n5 * n6);
        for (int i = 0; i < n4 - 1; ++i) {
            int j = 0;
            int n7 = a[j + 0 + (i + 0) * n3];
            int n8 = a[j + 0 + (i + 1) * n3];
            while (j < n3 - 1) {
                final double n9 = 3.6;
                this.a(j + n << 2, (long)(i + n2 << 2));
                final double n10 = (this.a(1024) / 1024.0 - 0.5) * 3.6;
                final double n11 = (this.a(1024) / 1024.0 - 0.5) * 3.6;
                this.a(j + n + 1 << 2, (long)(i + n2 << 2));
                final double n12 = (this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double n13 = (this.a(1024) / 1024.0 - 0.5) * 3.6;
                this.a(j + n << 2, (long)(i + n2 + 1 << 2));
                final double n14 = (this.a(1024) / 1024.0 - 0.5) * 3.6;
                final double n15 = (this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                this.a(j + n + 1 << 2, (long)(i + n2 + 1 << 2));
                final double n16 = (this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double n17 = (this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final int n18 = a[j + 1 + (i + 0) * n3] & 0xFF;
                final int n19 = a[j + 1 + (i + 1) * n3] & 0xFF;
                for (int k = 0; k < 4; ++k) {
                    int n20 = ((i << 2) + k) * n5 + (j << 2);
                    for (int l = 0; l < 4; ++l) {
                        final double n21 = (k - n11) * (k - n11) + (l - n10) * (l - n10);
                        final double n22 = (k - n13) * (k - n13) + (l - n12) * (l - n12);
                        final double n23 = (k - n15) * (k - n15) + (l - n14) * (l - n14);
                        final double n24 = (k - n17) * (k - n17) + (l - n16) * (l - n16);
                        if (n21 < n22 && n21 < n23 && n21 < n24) {
                            a2[n20++] = n7;
                        }
                        else if (n22 < n21 && n22 < n23 && n22 < n24) {
                            a2[n20++] = n18;
                        }
                        else if (n23 < n21 && n23 < n22 && n23 < n24) {
                            a2[n20++] = n8;
                        }
                        else {
                            a2[n20++] = n19;
                        }
                    }
                }
                n7 = n18;
                n8 = n19;
                ++j;
            }
        }
        final int[] a3 = asc.a(\u2603 * \u2603);
        for (int j = 0; j < \u2603; ++j) {
            System.arraycopy(a2, (j + (\u2603 & 0x3)) * n5 + (\u2603 & 0x3), a3, j * \u2603, \u2603);
        }
        return a3;
    }
}
