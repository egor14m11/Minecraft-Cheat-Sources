// 
// Decompiled by Procyon v0.5.36
// 

public class big extends bjl<um>
{
    public static final jy a;
    
    public big(final biu \u2603) {
        super(\u2603, new bat(), 0.0f);
        final bkx \u26032 = new bkx(this) {
            @Override
            protected void a() {
                this.c = (T)new bas(0.5f);
                this.d = (T)new bas(1.0f);
            }
        };
        ((bjl<pr>)this).a(\u26032);
        ((bjl<pr>)this).a(new bky(this));
        ((bjl<pr>)this).a(new bks(this.a().e));
    }
    
    @Override
    protected jy a(final um \u2603) {
        return big.a;
    }
    
    public bat a() {
        return (bat)super.b();
    }
    
    @Override
    protected void a(final um \u2603, final float \u2603, final float \u2603, final float \u2603) {
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
    }
    
    @Override
    protected boolean b(final um \u2603) {
        return \u2603.aN();
    }
    
    static {
        a = new jy("textures/entity/armorstand/wood.png");
    }
}
