import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bjd extends bjo<tp>
{
    private static final Map<String, jy> a;
    private static final jy e;
    private static final jy j;
    private static final jy k;
    private static final jy l;
    private static final jy m;
    
    public bjd(final biu \u2603, final bbh \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final tp \u2603, final float \u2603) {
        float n = 1.0f;
        final int cl = \u2603.cl();
        if (cl == 1) {
            n *= 0.87f;
        }
        else if (cl == 2) {
            n *= 0.92f;
        }
        bfl.a(n, n, n);
        super.a(\u2603, \u2603);
    }
    
    @Override
    protected jy a(final tp \u2603) {
        if (\u2603.cJ()) {
            return this.b(\u2603);
        }
        switch (\u2603.cl()) {
            default: {
                return bjd.e;
            }
            case 2: {
                return bjd.j;
            }
            case 1: {
                return bjd.k;
            }
            case 3: {
                return bjd.l;
            }
            case 4: {
                return bjd.m;
            }
        }
    }
    
    private jy b(final tp \u2603) {
        final String cl = \u2603.cL();
        if (!\u2603.cK()) {
            return null;
        }
        jy \u26032 = bjd.a.get(cl);
        if (\u26032 == null) {
            \u26032 = new jy(cl);
            ave.A().P().a(\u26032, new bmd(\u2603.cM()));
            bjd.a.put(cl, \u26032);
        }
        return \u26032;
    }
    
    static {
        a = Maps.newHashMap();
        e = new jy("textures/entity/horse/horse_white.png");
        j = new jy("textures/entity/horse/mule.png");
        k = new jy("textures/entity/horse/donkey.png");
        l = new jy("textures/entity/horse/horse_zombie.png");
        m = new jy("textures/entity/horse/horse_skeleton.png");
    }
}
