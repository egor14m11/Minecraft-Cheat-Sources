// 
// Decompiled by Procyon v0.5.36
// 

public class bpw
{
    private final jy a;
    private final boolean b;
    private double c;
    private double d;
    
    public bpw(final jy \u2603, final double \u2603, final double \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.b = \u2603;
    }
    
    public bpw(final bpw \u2603) {
        this.a = \u2603.a;
        this.c = \u2603.c;
        this.d = \u2603.d;
        this.b = \u2603.b;
    }
    
    public jy a() {
        return this.a;
    }
    
    public double b() {
        return this.c;
    }
    
    public void a(final double \u2603) {
        this.c = \u2603;
    }
    
    public double c() {
        return this.d;
    }
    
    public void b(final double \u2603) {
        this.d = \u2603;
    }
    
    public boolean d() {
        return this.b;
    }
}
