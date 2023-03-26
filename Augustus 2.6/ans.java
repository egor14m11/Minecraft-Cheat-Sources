// 
// Decompiled by Procyon v0.5.36
// 

public class ans
{
    private final short[] a;
    private final alz b;
    
    public ans() {
        this.a = new short[65536];
        this.b = afi.a.Q();
    }
    
    public alz a(final int \u2603, final int \u2603, final int \u2603) {
        final int \u26032 = \u2603 << 12 | \u2603 << 8 | \u2603;
        return this.a(\u26032);
    }
    
    public alz a(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.a.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        final alz alz = afh.d.a(this.a[\u2603]);
        if (alz != null) {
            return alz;
        }
        return this.b;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final alz \u2603) {
        final int \u26032 = \u2603 << 12 | \u2603 << 8 | \u2603;
        this.a(\u26032, \u2603);
    }
    
    public void a(final int \u2603, final alz \u2603) {
        if (\u2603 < 0 || \u2603 >= this.a.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        this.a[\u2603] = (short)afh.d.b(\u2603);
    }
}
