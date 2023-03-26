// 
// Decompiled by Procyon v0.5.36
// 

public class bjb extends bjo<vs>
{
    private static final jy a;
    private float e;
    
    public bjb(final biu \u2603, final bbo \u2603, final float \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603 * \u2603);
        this.e = \u2603;
        ((bjl<pr>)this).a(new bky(this));
        ((bjl<pr>)this).a(new bkx(this) {
            @Override
            protected void a() {
                this.c = (T)new bcn(0.5f, true);
                this.d = (T)new bcn(1.0f, true);
            }
        });
    }
    
    @Override
    public void C_() {
        bfl.b(0.0f, 0.1875f, 0.0f);
    }
    
    @Override
    protected void a(final vs \u2603, final float \u2603) {
        bfl.a(this.e, this.e, this.e);
    }
    
    @Override
    protected jy a(final vs \u2603) {
        return bjb.a;
    }
    
    static {
        a = new jy("textures/entity/zombie/zombie.png");
    }
}
