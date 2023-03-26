// 
// Decompiled by Procyon v0.5.36
// 

public class bkh extends bjo<wi>
{
    private static final jy a;
    private static final jy e;
    private static final jy j;
    private static final jy k;
    private static final jy l;
    private static final jy m;
    
    public bkh(final biu \u2603) {
        super(\u2603, new bci(0.0f), 0.5f);
        ((bjl<pr>)this).a(new bks(this.g().a));
    }
    
    public bci g() {
        return (bci)super.b();
    }
    
    @Override
    protected jy a(final wi \u2603) {
        switch (\u2603.cl()) {
            case 0: {
                return bkh.e;
            }
            case 1: {
                return bkh.j;
            }
            case 2: {
                return bkh.k;
            }
            case 3: {
                return bkh.l;
            }
            case 4: {
                return bkh.m;
            }
            default: {
                return bkh.a;
            }
        }
    }
    
    @Override
    protected void a(final wi \u2603, final float \u2603) {
        float n = 0.9375f;
        if (\u2603.l() < 0) {
            n *= 0.5;
            this.c = 0.25f;
        }
        else {
            this.c = 0.5f;
        }
        bfl.a(n, n, n);
    }
    
    static {
        a = new jy("textures/entity/villager/villager.png");
        e = new jy("textures/entity/villager/farmer.png");
        j = new jy("textures/entity/villager/librarian.png");
        k = new jy("textures/entity/villager/priest.png");
        l = new jy("textures/entity/villager/smith.png");
        m = new jy("textures/entity/villager/butcher.png");
    }
}
