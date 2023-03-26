import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqr
{
    private static final Logger a;
    private static Map<String, Class<? extends aqu>> b;
    private static Map<Class<? extends aqu>, String> c;
    private static Map<String, Class<? extends aqt>> d;
    private static Map<Class<? extends aqt>, String> e;
    
    private static void b(final Class<? extends aqu> \u2603, final String \u2603) {
        aqr.b.put(\u2603, \u2603);
        aqr.c.put(\u2603, \u2603);
    }
    
    static void a(final Class<? extends aqt> \u2603, final String \u2603) {
        aqr.d.put(\u2603, \u2603);
        aqr.e.put(\u2603, \u2603);
    }
    
    public static String a(final aqu \u2603) {
        return aqr.c.get(\u2603.getClass());
    }
    
    public static String a(final aqt \u2603) {
        return aqr.e.get(\u2603.getClass());
    }
    
    public static aqu a(final dn \u2603, final adm \u2603) {
        aqu aqu = null;
        try {
            final Class<? extends aqu> clazz = aqr.b.get(\u2603.j("id"));
            if (clazz != null) {
                aqu = (aqu)clazz.newInstance();
            }
        }
        catch (Exception ex) {
            aqr.a.warn("Failed Start with id " + \u2603.j("id"));
            ex.printStackTrace();
        }
        if (aqu != null) {
            aqu.a(\u2603, \u2603);
        }
        else {
            aqr.a.warn("Skipping Structure with id " + \u2603.j("id"));
        }
        return aqu;
    }
    
    public static aqt b(final dn \u2603, final adm \u2603) {
        aqt aqt = null;
        try {
            final Class<? extends aqt> clazz = aqr.d.get(\u2603.j("id"));
            if (clazz != null) {
                aqt = (aqt)clazz.newInstance();
            }
        }
        catch (Exception ex) {
            aqr.a.warn("Failed Piece with id " + \u2603.j("id"));
            ex.printStackTrace();
        }
        if (aqt != null) {
            aqt.a(\u2603, \u2603);
        }
        else {
            aqr.a.warn("Skipping Piece with id " + \u2603.j("id"));
        }
        return aqt;
    }
    
    static {
        a = LogManager.getLogger();
        aqr.b = (Map<String, Class<? extends aqu>>)Maps.newHashMap();
        aqr.c = (Map<Class<? extends aqu>, String>)Maps.newHashMap();
        aqr.d = (Map<String, Class<? extends aqt>>)Maps.newHashMap();
        aqr.e = (Map<Class<? extends aqt>, String>)Maps.newHashMap();
        b(aqh.class, "Mineshaft");
        b(aqv.a.class, "Village");
        b(aqi.a.class, "Fortress");
        b(aqo.a.class, "Stronghold");
        b(aqm.a.class, "Temple");
        b(aqk.a.class, "Monument");
        aqg.a();
        aqw.a();
        aqj.a();
        aqp.a();
        aqn.a();
        aql.a();
    }
}
