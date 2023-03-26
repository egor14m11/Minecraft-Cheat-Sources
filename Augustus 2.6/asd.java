// 
// Decompiled by Procyon v0.5.36
// 

public class asd extends ase
{
    public asd(final long \u2603) {
        super(\u2603);
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(\u2603 + j, (long)(\u2603 + i));
                a[j + i * \u2603] = ((this.a(10) == 0) ? 1 : 0);
            }
        }
        if (\u2603 > -\u2603 && \u2603 <= 0 && \u2603 > -\u2603 && \u2603 <= 0) {
            a[-\u2603 + -\u2603 * \u2603] = 1;
        }
        return a;
    }
}
