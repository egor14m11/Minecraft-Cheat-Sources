// 
// Decompiled by Procyon v0.5.36
// 

public class ask extends ase
{
    private ase c;
    private ase d;
    
    public ask(final long \u2603, final ase \u2603, final ase \u2603) {
        super(\u2603);
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final long \u2603) {
        this.c.a(\u2603);
        this.d.a(\u2603);
        super.a(\u2603);
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.c.a(\u2603, \u2603, \u2603, \u2603);
        final int[] a2 = this.d.a(\u2603, \u2603, \u2603, \u2603);
        final int[] a3 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603 * \u2603; ++i) {
            if (a[i] == ady.p.az || a[i] == ady.N.az) {
                a3[i] = a[i];
            }
            else if (a2[i] == ady.w.az) {
                if (a[i] == ady.B.az) {
                    a3[i] = ady.A.az;
                }
                else if (a[i] == ady.D.az || a[i] == ady.E.az) {
                    a3[i] = ady.E.az;
                }
                else {
                    a3[i] = (a2[i] & 0xFF);
                }
            }
            else {
                a3[i] = a[i];
            }
        }
        return a3;
    }
}
