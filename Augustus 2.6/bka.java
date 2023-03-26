// 
// Decompiled by Procyon v0.5.36
// 

public class bka<T extends wc> extends bjo<T>
{
    private static final jy a;
    
    public bka(final biu \u2603) {
        super(\u2603, new bce(), 1.0f);
        this.a(new blf(this));
    }
    
    @Override
    protected float b(final T \u2603) {
        return 180.0f;
    }
    
    @Override
    protected jy a(final T \u2603) {
        return bka.a;
    }
    
    static {
        a = new jy("textures/entity/spider/spider.png");
    }
}
