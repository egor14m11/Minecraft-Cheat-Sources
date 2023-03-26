import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import com.google.common.collect.BiMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public enum el
{
    a(-1) {
        {
            this.a(fg.a, jc.class);
        }
    }, 
    b(0) {
        {
            this.a(fg.b, gn.class);
            this.a(fg.b, gt.class);
            this.a(fg.b, fy.class);
            this.a(fg.b, hu.class);
            this.a(fg.b, hn.class);
            this.a(fg.b, ht.class);
            this.a(fg.b, hp.class);
            this.a(fg.b, he.class);
            this.a(fg.b, fi.class);
            this.a(fg.b, hi.class);
            this.a(fg.b, ha.class);
            this.a(fg.b, fq.class);
            this.a(fg.b, fp.class);
            this.a(fg.b, hy.class);
            this.a(fg.b, fk.class);
            this.a(fg.b, fn.class);
            this.a(fg.b, fo.class);
            this.a(fg.b, fl.class);
            this.a(fg.b, hm.class);
            this.a(fg.b, hb.class);
            this.a(fg.b, gv.class);
            this.a(fg.b, gv.a.class);
            this.a(fg.b, gv.c.class);
            this.a(fg.b, gv.b.class);
            this.a(fg.b, hz.class);
            this.a(fg.b, hf.class);
            this.a(fg.b, gi.class);
            this.a(fg.b, hl.class);
            this.a(fg.b, hk.class);
            this.a(fg.b, ib.class);
            this.a(fg.b, hc.class);
            this.a(fg.b, ho.class);
            this.a(fg.b, ia.class);
            this.a(fg.b, go.class);
            this.a(fg.b, fz.class);
            this.a(fg.b, fv.class);
            this.a(fg.b, fu.class);
            this.a(fg.b, fs.class);
            this.a(fg.b, gp.class);
            this.a(fg.b, gk.class);
            this.a(fg.b, gq.class);
            this.a(fg.b, gs.class);
            this.a(fg.b, gr.class);
            this.a(fg.b, gm.class);
            this.a(fg.b, fm.class);
            this.a(fg.b, gc.class);
            this.a(fg.b, gb.class);
            this.a(fg.b, gf.class);
            this.a(fg.b, gd.class);
            this.a(fg.b, ge.class);
            this.a(fg.b, ga.class);
            this.a(fg.b, hw.class);
            this.a(fg.b, gu.class);
            this.a(fg.b, ft.class);
            this.a(fg.b, gw.class);
            this.a(fg.b, fr.class);
            this.a(fg.b, gz.class);
            this.a(fg.b, gx.class);
            this.a(fg.b, fx.class);
            this.a(fg.b, hq.class);
            this.a(fg.b, hs.class);
            this.a(fg.b, hj.class);
            this.a(fg.b, hr.class);
            this.a(fg.b, gg.class);
            this.a(fg.b, gh.class);
            this.a(fg.b, fw.class);
            this.a(fg.b, gy.class);
            this.a(fg.b, hh.class);
            this.a(fg.b, hg.class);
            this.a(fg.b, hv.class);
            this.a(fg.b, gl.class);
            this.a(fg.b, hx.class);
            this.a(fg.b, hd.class);
            this.a(fg.b, gj.class);
            this.a(fg.a, io.class);
            this.a(fg.a, ie.class);
            this.a(fg.a, in.class);
            this.a(fg.a, ip.class);
            this.a(fg.a, ip.a.class);
            this.a(fg.a, ip.c.class);
            this.a(fg.a, ip.b.class);
            this.a(fg.a, ir.class);
            this.a(fg.a, ja.class);
            this.a(fg.a, iv.class);
            this.a(fg.a, iy.class);
            this.a(fg.a, is.class);
            this.a(fg.a, it.class);
            this.a(fg.a, il.class);
            this.a(fg.a, ik.class);
            this.a(fg.a, ii.class);
            this.a(fg.a, iw.class);
            this.a(fg.a, ij.class);
            this.a(fg.a, ix.class);
            this.a(fg.a, iq.class);
            this.a(fg.a, id.class);
            this.a(fg.a, ih.class);
            this.a(fg.a, ig.class);
            this.a(fg.a, im.class);
            this.a(fg.a, iz.class);
            this.a(fg.a, iu.class);
        }
    }, 
    c(1) {
        {
            this.a(fg.a, jv.class);
            this.a(fg.b, jr.class);
            this.a(fg.a, ju.class);
            this.a(fg.b, jq.class);
        }
    }, 
    d(2) {
        {
            this.a(fg.b, jj.class);
            this.a(fg.b, jh.class);
            this.a(fg.b, jg.class);
            this.a(fg.b, ji.class);
            this.a(fg.a, jl.class);
            this.a(fg.a, jm.class);
        }
    };
    
    private static int e;
    private static int f;
    private static final el[] g;
    private static final Map<Class<? extends ff>, el> h;
    private final int i;
    private final Map<fg, BiMap<Integer, Class<? extends ff>>> j;
    
    private el(final int \u2603) {
        this.j = (Map<fg, BiMap<Integer, Class<? extends ff>>>)Maps.newEnumMap(fg.class);
        this.i = \u2603;
    }
    
    protected el a(final fg \u2603, final Class<? extends ff> \u2603) {
        BiMap<Integer, Class<? extends ff>> create = this.j.get(\u2603);
        if (create == null) {
            create = (BiMap<Integer, Class<? extends ff>>)HashBiMap.create();
            this.j.put(\u2603, create);
        }
        if (create.containsValue(\u2603)) {
            final String string = \u2603 + " packet " + \u2603 + " is already known to ID " + create.inverse().get(\u2603);
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        create.put(create.size(), \u2603);
        return this;
    }
    
    public Integer a(final fg \u2603, final ff \u2603) {
        return this.j.get(\u2603).inverse().get(\u2603.getClass());
    }
    
    public ff a(final fg \u2603, final int \u2603) throws IllegalAccessException, InstantiationException {
        final Class<? extends ff> clazz = this.j.get(\u2603).get(\u2603);
        if (clazz == null) {
            return null;
        }
        return (ff)clazz.newInstance();
    }
    
    public int a() {
        return this.i;
    }
    
    public static el a(final int \u2603) {
        if (\u2603 < el.e || \u2603 > el.f) {
            return null;
        }
        return el.g[\u2603 - el.e];
    }
    
    public static el a(final ff \u2603) {
        return el.h.get(\u2603.getClass());
    }
    
    static {
        el.e = -1;
        el.f = 2;
        g = new el[el.f - el.e + 1];
        h = Maps.newHashMap();
        for (final el obj : values()) {
            final int a2 = obj.a();
            if (a2 < el.e || a2 > el.f) {
                throw new Error("Invalid protocol ID " + Integer.toString(a2));
            }
            el.g[a2 - el.e] = obj;
            for (final fg fg : obj.j.keySet()) {
                for (final Class<? extends ff> obj2 : obj.j.get(fg).values()) {
                    if (el.h.containsKey(obj2) && el.h.get(obj2) != obj) {
                        throw new Error("Packet " + obj2 + " is already assigned to protocol " + el.h.get(obj2) + " - can't reassign to " + obj);
                    }
                    try {
                        obj2.newInstance();
                    }
                    catch (Throwable t) {
                        throw new Error("Packet " + obj2 + " fails instantiation checks! " + obj2);
                    }
                    el.h.put(obj2, obj);
                }
            }
        }
    }
}
