// 
// Decompiled by Procyon v0.5.36
// 

public class bla implements blb<tt>
{
    private static final jy a;
    private final bjs b;
    private final bbq c;
    
    public bla(final bjs \u2603) {
        this.c = new bbq(0.5f);
        this.b = \u2603;
    }
    
    @Override
    public void a(final tt \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.cl()) {
            return;
        }
        this.b.a(bla.a);
        this.c.a(this.b.b());
        this.c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/pig/pig_saddle.png");
    }
}
