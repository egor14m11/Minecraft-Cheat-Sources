// 
// Decompiled by Procyon v0.5.36
// 

public class alg extends akw
{
    private zw a;
    private int f;
    
    public alg() {
    }
    
    public alg(final zw \u2603, final int \u2603) {
        this.a = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final jy jy = zw.e.c(this.a);
        \u2603.a("Item", (jy == null) ? "" : jy.toString());
        \u2603.a("Data", this.f);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("Item", 8)) {
            this.a = zw.d(\u2603.j("Item"));
        }
        else {
            this.a = zw.b(\u2603.f("Item"));
        }
        this.f = \u2603.f("Data");
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        dn.o("Item");
        dn.a("Item", zw.b(this.a));
        return new ft(this.c, 5, dn);
    }
    
    public void a(final zw \u2603, final int \u2603) {
        this.a = \u2603;
        this.f = \u2603;
    }
    
    public zw b() {
        return this.a;
    }
    
    public int c() {
        return this.f;
    }
}
