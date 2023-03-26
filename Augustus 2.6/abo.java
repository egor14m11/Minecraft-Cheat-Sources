import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class abo
{
    private static final abo a;
    private Map<zx, zx> b;
    private Map<zx, Float> c;
    
    public static abo a() {
        return abo.a;
    }
    
    private abo() {
        this.b = (Map<zx, zx>)Maps.newHashMap();
        this.c = (Map<zx, Float>)Maps.newHashMap();
        this.a(afi.p, new zx(zy.j), 0.7f);
        this.a(afi.o, new zx(zy.k), 1.0f);
        this.a(afi.ag, new zx(zy.i), 1.0f);
        this.a(afi.m, new zx(afi.w), 0.1f);
        this.a(zy.al, new zx(zy.am), 0.35f);
        this.a(zy.bi, new zx(zy.bj), 0.35f);
        this.a(zy.bk, new zx(zy.bl), 0.35f);
        this.a(zy.bo, new zx(zy.bp), 0.35f);
        this.a(zy.bm, new zx(zy.bn), 0.35f);
        this.a(afi.e, new zx(afi.b), 0.1f);
        this.a(new zx(afi.bf, 1, ajz.b), new zx(afi.bf, 1, ajz.O), 0.1f);
        this.a(zy.aI, new zx(zy.aH), 0.3f);
        this.a(afi.aL, new zx(afi.cz), 0.35f);
        this.a(afi.aK, new zx(zy.aW, 1, zd.n.b()), 0.2f);
        this.a(afi.r, new zx(zy.h, 1, 1), 0.15f);
        this.a(afi.s, new zx(zy.h, 1, 1), 0.15f);
        this.a(afi.bP, new zx(zy.bO), 1.0f);
        this.a(zy.bS, new zx(zy.bT), 0.35f);
        this.a(afi.aV, new zx(zy.cf), 0.1f);
        this.a(new zx(afi.v, 1, 1), new zx(afi.v, 1, 0), 0.15f);
        for (final zp.a a : zp.a.values()) {
            if (a.g()) {
                this.a(new zx(zy.aU, 1, a.a()), new zx(zy.aV, 1, a.a()), 0.35f);
            }
        }
        this.a(afi.q, new zx(zy.h), 0.1f);
        this.a(afi.aC, new zx(zy.aC), 0.7f);
        this.a(afi.x, new zx(zy.aW, 1, zd.l.b()), 0.2f);
        this.a(afi.co, new zx(zy.cg), 0.2f);
    }
    
    public void a(final afh \u2603, final zx \u2603, final float \u2603) {
        this.a(zw.a(\u2603), \u2603, \u2603);
    }
    
    public void a(final zw \u2603, final zx \u2603, final float \u2603) {
        this.a(new zx(\u2603, 1, 32767), \u2603, \u2603);
    }
    
    public void a(final zx \u2603, final zx \u2603, final float \u2603) {
        this.b.put(\u2603, \u2603);
        this.c.put(\u2603, \u2603);
    }
    
    public zx a(final zx \u2603) {
        for (final Map.Entry<zx, zx> entry : this.b.entrySet()) {
            if (this.a(\u2603, entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }
    
    private boolean a(final zx \u2603, final zx \u2603) {
        return \u2603.b() == \u2603.b() && (\u2603.i() == 32767 || \u2603.i() == \u2603.i());
    }
    
    public Map<zx, zx> b() {
        return this.b;
    }
    
    public float b(final zx \u2603) {
        for (final Map.Entry<zx, Float> entry : this.c.entrySet()) {
            if (this.a(\u2603, entry.getKey())) {
                return entry.getValue();
            }
        }
        return 0.0f;
    }
    
    static {
        a = new abo();
    }
}
