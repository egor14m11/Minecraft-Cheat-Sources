// 
// Decompiled by Procyon v0.5.36
// 

public class aew extends aeb
{
    protected aot M;
    
    public aew() {
        this.M = new apq(afi.bH);
    }
    
    @Override
    protected void a(final ady \u2603) {
        this.a();
        if (this.b.nextInt(5) == 0) {
            final int \u26032 = this.b.nextInt(16) + 8;
            final int \u26033 = this.b.nextInt(16) + 8;
            this.M.b(this.a, this.b, this.a.r(this.c.a(\u26032, 0, \u26033)));
        }
        if (this.c.n() == 0 && this.c.p() == 0) {
            final ug \u26034 = new ug(this.a);
            \u26034.b(0.0, 128.0, 0.0, this.b.nextFloat() * 360.0f, 0.0f);
            this.a.d(\u26034);
        }
    }
}
