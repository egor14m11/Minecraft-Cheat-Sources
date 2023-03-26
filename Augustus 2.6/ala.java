// 
// Decompiled by Procyon v0.5.36
// 

public class ala extends akw
{
    private int a;
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("OutputSignal", this.a);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.f("OutputSignal");
    }
    
    public int b() {
        return this.a;
    }
    
    public void a(final int \u2603) {
        this.a = \u2603;
    }
}
