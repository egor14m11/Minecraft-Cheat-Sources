// 
// Decompiled by Procyon v0.5.36
// 

public class bjt extends bje<vw>
{
    private static final jy j;
    
    public bjt(final biu \u2603) {
        super(\u2603, new bcn(), 0.5f, 1.0f);
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
    protected jy a(final vw \u2603) {
        return bjt.j;
    }
    
    static {
        j = new jy("textures/entity/zombie_pigman.png");
    }
}
