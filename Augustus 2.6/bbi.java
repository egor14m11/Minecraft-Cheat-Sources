// 
// Decompiled by Procyon v0.5.36
// 

public class bbi extends bbz
{
    private final bct b;
    
    public bbi() {
        super(0, 0, 64, 64);
        (this.b = new bct(this, 32, 0)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.b.a(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.g = this.a.g;
        this.b.f = this.a.f;
    }
}
