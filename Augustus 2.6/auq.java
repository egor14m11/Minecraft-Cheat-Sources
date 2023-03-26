import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class auq
{
    public boolean a(final auq \u2603) {
        return \u2603 != null && this == \u2603;
    }
    
    public abstract String b();
    
    public abstract String d(final String p0);
    
    public abstract boolean h();
    
    public abstract boolean g();
    
    public abstract a i();
    
    public abstract Collection<String> d();
    
    public abstract a j();
    
    public enum a
    {
        a("always", 0), 
        b("never", 1), 
        c("hideForOtherTeams", 2), 
        d("hideForOwnTeam", 3);
        
        private static Map<String, a> g;
        public final String e;
        public final int f;
        
        public static String[] a() {
            return a.g.keySet().toArray(new String[a.g.size()]);
        }
        
        public static a a(final String \u2603) {
            return a.g.get(\u2603);
        }
        
        private a(final String \u2603, final int \u2603) {
            this.e = \u2603;
            this.f = \u2603;
        }
        
        static {
            a.g = (Map<String, a>)Maps.newHashMap();
            for (final a a2 : values()) {
                a.g.put(a2.e, a2);
            }
        }
    }
}
