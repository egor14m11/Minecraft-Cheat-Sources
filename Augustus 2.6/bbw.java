// 
// Decompiled by Procyon v0.5.36
// 

public class bbw extends bbt
{
    private float i;
    
    public bbw() {
        super(12, 0.0f);
        (this.a = new bct(this, 0, 0)).a(-3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        this.a.a(0.0f, 6.0f, -8.0f);
        (this.b = new bct(this, 28, 8)).a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        this.b.a(0.0f, 5.0f, 2.0f);
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
