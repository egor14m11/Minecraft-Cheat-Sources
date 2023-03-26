// 
// Decompiled by Procyon v0.5.36
// 

public class amw
{
    private final byte[] a;
    
    public amw() {
        this.a = new byte[2048];
    }
    
    public amw(final byte[] \u2603) {
        this.a = \u2603;
        if (\u2603.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + \u2603.length);
        }
    }
    
    public int a(final int \u2603, final int \u2603, final int \u2603) {
        return this.a(this.b(\u2603, \u2603, \u2603));
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a(this.b(\u2603, \u2603, \u2603), \u2603);
    }
    
    private int b(final int \u2603, final int \u2603, final int \u2603) {
        return \u2603 << 8 | \u2603 << 4 | \u2603;
    }
    
    public int a(final int \u2603) {
        final int c = this.c(\u2603);
        if (this.b(\u2603)) {
            return this.a[c] & 0xF;
        }
        return this.a[c] >> 4 & 0xF;
    }
    
    public void a(final int \u2603, final int \u2603) {
        final int c = this.c(\u2603);
        if (this.b(\u2603)) {
            this.a[c] = (byte)((this.a[c] & 0xF0) | (\u2603 & 0xF));
        }
        else {
            this.a[c] = (byte)((this.a[c] & 0xF) | (\u2603 & 0xF) << 4);
        }
    }
    
    private boolean b(final int \u2603) {
        return (\u2603 & 0x1) == 0x0;
    }
    
    private int c(final int \u2603) {
        return \u2603 >> 1;
    }
    
    public byte[] a() {
        return this.a;
    }
}
