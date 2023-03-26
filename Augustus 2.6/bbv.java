// 
// Decompiled by Procyon v0.5.36
// 

public class bbv extends bbt
{
    private float i;
    
    public bbv() {
        super(12, 0.0f);
        (this.a = new bct(this, 0, 0)).a(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
        this.a.a(0.0f, 6.0f, -8.0f);
        (this.b = new bct(this, 28, 8)).a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
        this.b.a(0.0f, 5.0f, 2.0f);
        final float n = 0.5f;
        (this.c = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.c.a(-3.0f, 12.0f, 7.0f);
        (this.d = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.d.a(3.0f, 12.0f, 7.0f);
        (this.e = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.e.a(-3.0f, 12.0f, -5.0f);
        (this.f = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.f.a(3.0f, 12.0f, -5.0f);
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        this.a.d = 6.0f + ((tv)\u2603).p(\u2603) * 9.0f;
        this.i = ((tv)\u2603).q(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.f = this.i;
    }
}
