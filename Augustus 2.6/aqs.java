// 
// Decompiled by Procyon v0.5.36
// 

public class aqs extends ate
{
    private dn b;
    
    public aqs(final String \u2603) {
        super(\u2603);
        this.b = new dn();
    }
    
    @Override
    public void a(final dn \u2603) {
        this.b = \u2603.m("Features");
    }
    
    @Override
    public void b(final dn \u2603) {
        \u2603.a("Features", this.b);
    }
    
    public void a(final dn \u2603, final int \u2603, final int \u2603) {
        this.b.a(b(\u2603, \u2603), \u2603);
    }
    
    public static String b(final int \u2603, final int \u2603) {
        return "[" + \u2603 + "," + \u2603 + "]";
    }
    
    public dn a() {
        return this.b;
    }
}
