// 
// Decompiled by Procyon v0.5.36
// 

public class bju extends bjo<tu>
{
    private static final jy a;
    private static final jy e;
    private static final jy j;
    private static final jy k;
    private static final jy l;
    private static final jy m;
    private static final jy n;
    private static final jy o;
    
    public bju(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final tu \u2603) {
        final String a = a.a(\u2603.e_());
        if (a != null && a.equals("Toast")) {
            return bju.n;
        }
        switch (\u2603.cn()) {
            default: {
                return bju.a;
            }
            case 1: {
                return bju.e;
            }
            case 2: {
                return bju.j;
            }
            case 4: {
                return bju.k;
            }
            case 5: {
                return bju.l;
            }
            case 3: {
                return bju.m;
            }
            case 99: {
                return bju.o;
            }
        }
    }
    
    static {
        a = new jy("textures/entity/rabbit/brown.png");
        e = new jy("textures/entity/rabbit/white.png");
        j = new jy("textures/entity/rabbit/black.png");
        k = new jy("textures/entity/rabbit/gold.png");
        l = new jy("textures/entity/rabbit/salt.png");
        m = new jy("textures/entity/rabbit/white_splotched.png");
        n = new jy("textures/entity/rabbit/toast.png");
        o = new jy("textures/entity/rabbit/caerbannog.png");
    }
}
