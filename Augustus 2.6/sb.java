// 
// Decompiled by Procyon v0.5.36
// 

public class sb extends rd
{
    private py a;
    private te b;
    
    public sb(final py \u2603) {
        this.a = \u2603;
        if (!(\u2603.s() instanceof sv)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }
    
    @Override
    public boolean a() {
        if (this.a.o.w()) {
            return false;
        }
        final cj \u2603 = new cj(this.a);
        final tf a = this.a.o.ae().a(\u2603, 16);
        if (a == null) {
            return false;
        }
        this.b = a.b(\u2603);
        return this.b != null && this.b.b(\u2603) < 2.25;
    }
    
    @Override
    public boolean b() {
        return !this.a.o.w() && !this.b.i() && this.b.c(new cj(this.a));
    }
    
    @Override
    public void c() {
        ((sv)this.a.s()).b(false);
        ((sv)this.a.s()).c(false);
    }
    
    @Override
    public void d() {
        ((sv)this.a.s()).b(true);
        ((sv)this.a.s()).c(true);
        this.b = null;
    }
    
    @Override
    public void e() {
        this.b.b();
    }
}
