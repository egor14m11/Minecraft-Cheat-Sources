// 
// Decompiled by Procyon v0.5.36
// 

public class bfx
{
    private bfd a;
    private bfe b;
    private static final bfx c;
    
    public static bfx a() {
        return bfx.c;
    }
    
    public bfx(final int \u2603) {
        this.b = new bfe();
        this.a = new bfd(\u2603);
    }
    
    public void b() {
        this.a.e();
        this.b.a(this.a);
    }
    
    public bfd c() {
        return this.a;
    }
    
    static {
        c = new bfx(2097152);
    }
}
