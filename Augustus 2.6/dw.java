// 
// Decompiled by Procyon v0.5.36
// 

public class dw
{
    public static final dw a;
    private final long b;
    private long c;
    
    public dw(final long \u2603) {
        this.b = \u2603;
    }
    
    public void a(final long \u2603) {
        this.c += \u2603 / 8L;
        if (this.c > this.b) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
        }
    }
    
    static {
        a = new dw(0L) {
            @Override
            public void a(final long \u2603) {
            }
        };
    }
}
