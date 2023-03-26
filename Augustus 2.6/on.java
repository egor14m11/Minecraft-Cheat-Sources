// 
// Decompiled by Procyon v0.5.36
// 

public class on
{
    public static final on a;
    private final String b;
    
    public on(final String \u2603) {
        this.b = \u2603;
    }
    
    public boolean a() {
        return this.b == null || this.b.isEmpty();
    }
    
    public String b() {
        return this.b;
    }
    
    public void a(final dn \u2603) {
        \u2603.a("Lock", this.b);
    }
    
    public static on b(final dn \u2603) {
        if (\u2603.b("Lock", 8)) {
            final String j = \u2603.j("Lock");
            return new on(j);
        }
        return on.a;
    }
    
    static {
        a = new on("");
    }
}
