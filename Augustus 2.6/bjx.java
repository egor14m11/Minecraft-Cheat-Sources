// 
// Decompiled by Procyon v0.5.36
// 

public class bjx extends bje<wa>
{
    private static final jy j;
    private static final jy k;
    
    public bjx(final biu \u2603) {
        super(\u2603, new bca(), 0.5f);
        ((bjl<pr>)this).a(new bky(this));
        ((bjl<pr>)this).a(new bkx(this) {
            @Override
            protected void a() {
                this.c = (T)new bca(0.5f, true);
                this.d = (T)new bca(1.0f, true);
            }
        });
    }
    
    @Override
    protected void a(final wa \u2603, final float \u2603) {
        if (\u2603.cm() == 1) {
            bfl.a(1.2f, 1.2f, 1.2f);
        }
    }
    
    @Override
    public void C_() {
        bfl.b(0.09375f, 0.1875f, 0.0f);
    }
    
    @Override
    protected jy a(final wa \u2603) {
        if (\u2603.cm() == 1) {
            return bjx.k;
        }
        return bjx.j;
    }
    
    static {
        j = new jy("textures/entity/skeleton/skeleton.png");
        k = new jy("textures/entity/skeleton/wither_skeleton.png");
    }
}
