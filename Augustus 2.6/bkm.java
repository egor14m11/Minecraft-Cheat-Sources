import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bkm extends bje<we>
{
    private static final jy j;
    private static final jy k;
    private final bbj l;
    private final bcj m;
    private final List<blb<we>> n;
    private final List<blb<we>> o;
    
    public bkm(final biu \u2603) {
        super(\u2603, new bcn(), 0.5f, 1.0f);
        final blb \u26032 = this.h.get(0);
        this.l = this.a;
        this.m = new bcj();
        ((bjl<pr>)this).a(new bky(this));
        final bkx bkx = new bkx(this) {
            @Override
            protected void a() {
                this.c = (T)new bcn(0.5f, true);
                this.d = (T)new bcn(1.0f, true);
            }
        };
        ((bjl<pr>)this).a(bkx);
        this.o = (List<blb<we>>)Lists.newArrayList((Iterable<?>)this.h);
        if (\u26032 instanceof bks) {
            ((bjl<pr>)this).b(\u26032);
            ((bjl<pr>)this).a(new bks(this.m.e));
        }
        ((bjl<pr>)this).b(bkx);
        ((bjl<pr>)this).a(new blg(this));
        this.n = (List<blb<we>>)Lists.newArrayList((Iterable<?>)this.h);
    }
    
    @Override
    public void a(final we \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.b(\u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final we \u2603) {
        if (\u2603.co()) {
            return bkm.k;
        }
        return bkm.j;
    }
    
    private void b(final we \u2603) {
        if (\u2603.co()) {
            this.f = this.m;
            this.h = (List<blb<T>>)this.n;
        }
        else {
            this.f = this.l;
            this.h = (List<blb<T>>)this.o;
        }
        this.a = (bbj)this.f;
    }
    
    @Override
    protected void a(final we \u2603, final float \u2603, float \u2603, final float \u2603) {
        if (\u2603.cp()) {
            \u2603 += (float)(Math.cos(\u2603.W * 3.25) * 3.141592653589793 * 0.25);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    static {
        j = new jy("textures/entity/zombie/zombie.png");
        k = new jy("textures/entity/zombie/zombie_villager.png");
    }
}
