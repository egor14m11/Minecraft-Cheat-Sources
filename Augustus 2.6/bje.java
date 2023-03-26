// 
// Decompiled by Procyon v0.5.36
// 

public class bje<T extends ps> extends bjo<T>
{
    private static final jy j;
    protected bbj a;
    protected float e;
    
    public bje(final biu \u2603, final bbj \u2603, final float \u2603) {
        this(\u2603, \u2603, \u2603, 1.0f);
        this.a(new bky(this));
    }
    
    public bje(final biu \u2603, final bbj \u2603, final float \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
        this.a = \u2603;
        this.e = \u2603;
        this.a(new bks(\u2603.e));
    }
    
    @Override
    protected jy a(final T \u2603) {
        return bje.j;
    }
    
    @Override
    public void C_() {
        bfl.b(0.0f, 0.1875f, 0.0f);
    }
    
    static {
        j = new jy("textures/entity/steve.png");
    }
}
