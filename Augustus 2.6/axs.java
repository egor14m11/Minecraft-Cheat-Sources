// 
// Decompiled by Procyon v0.5.36
// 

public class axs extends axu
{
    private bcy a;
    private int f;
    
    public axs(final bcy \u2603) {
        this.a = \u2603;
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    public void b() {
        this.n.clear();
    }
    
    @Override
    public void e() {
        ++this.f;
        if (this.f % 20 == 0) {
            this.a.a(new io());
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c(0);
        this.a(this.q, bnq.a("multiplayer.downloadingTerrain", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean d() {
        return false;
    }
}
