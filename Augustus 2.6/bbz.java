// 
// Decompiled by Procyon v0.5.36
// 

public class bbz extends bbo
{
    public bct a;
    
    public bbz() {
        this(0, 35, 64, 64);
    }
    
    public bbz(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.t = \u2603;
        this.u = \u2603;
        (this.a = new bct(this, \u2603, \u2603)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.a.a(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
    }
}
