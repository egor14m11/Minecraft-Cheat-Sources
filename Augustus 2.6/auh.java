// 
// Decompiled by Procyon v0.5.36
// 

public class auh
{
    private cj e;
    public a a;
    public cq b;
    public aui c;
    public pk d;
    
    public auh(final aui \u2603, final cq \u2603, final cj \u2603) {
        this(auh.a.b, \u2603, \u2603, \u2603);
    }
    
    public auh(final aui \u2603, final cq \u2603) {
        this(auh.a.b, \u2603, \u2603, cj.a);
    }
    
    public auh(final pk \u2603) {
        this(\u2603, new aui(\u2603.s, \u2603.t, \u2603.u));
    }
    
    public auh(final a \u2603, final aui \u2603, final cq \u2603, final cj \u2603) {
        this.a = \u2603;
        this.e = \u2603;
        this.b = \u2603;
        this.c = new aui(\u2603.a, \u2603.b, \u2603.c);
    }
    
    public auh(final pk \u2603, final aui \u2603) {
        this.a = auh.a.c;
        this.d = \u2603;
        this.c = \u2603;
    }
    
    public cj a() {
        return this.e;
    }
    
    @Override
    public String toString() {
        return "HitResult{type=" + this.a + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
