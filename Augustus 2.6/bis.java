import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bis extends bjo<vo>
{
    private static final jy a;
    private bbd e;
    private Random j;
    
    public bis(final biu \u2603) {
        super(\u2603, new bbd(0.0f), 0.5f);
        this.j = new Random();
        this.e = (bbd)super.f;
        ((bjl<pr>)this).a(new bkw(this));
        ((bjl<pr>)this).a(new bkq(this));
    }
    
    @Override
    public void a(final vo \u2603, double \u2603, final double \u2603, double \u2603, final float \u2603, final float \u2603) {
        this.e.a = (\u2603.cm().c().t() != arm.a);
        this.e.b = \u2603.co();
        if (\u2603.co()) {
            final double n = 0.02;
            \u2603 += this.j.nextGaussian() * n;
            \u2603 += this.j.nextGaussian() * n;
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final vo \u2603) {
        return bis.a;
    }
    
    static {
        a = new jy("textures/entity/enderman/enderman.png");
    }
}
