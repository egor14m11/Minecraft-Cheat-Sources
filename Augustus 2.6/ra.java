// 
// Decompiled by Procyon v0.5.36
// 

public class ra extends rd
{
    private ps a;
    
    public ra(final ps \u2603) {
        this.a = \u2603;
        this.a(4);
        ((sv)\u2603.s()).d(true);
    }
    
    @Override
    public boolean a() {
        return this.a.V() || this.a.ab();
    }
    
    @Override
    public void e() {
        if (this.a.bc().nextFloat() < 0.8f) {
            this.a.r().a();
        }
    }
}
