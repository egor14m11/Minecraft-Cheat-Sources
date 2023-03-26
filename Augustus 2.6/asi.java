// 
// Decompiled by Procyon v0.5.36
// 

public class asi extends ase
{
    public asi(final long \u2603, final ase \u2603) {
        super(\u2603);
        this.a = \u2603;
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.a.a(\u2603, \u2603, \u2603, \u2603);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                a2[j + i * \u2603] = ((a[j + i * \u2603] > 0) ? (this.a(299999) + 2) : 0);
            }
        }
        return a2;
    }
}
