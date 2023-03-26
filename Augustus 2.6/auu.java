import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public interface auu
{
    public static final Map<String, auu> a = Maps.newHashMap();
    public static final auu b = new aus("dummy");
    public static final auu c = new aus("trigger");
    public static final auu d = new aus("deathCount");
    public static final auu e = new aus("playerKillCount");
    public static final auu f = new aus("totalKillCount");
    public static final auu g = new aut("health");
    public static final auu[] h = { new aur("teamkill.", a.a), new aur("teamkill.", a.b), new aur("teamkill.", a.c), new aur("teamkill.", a.d), new aur("teamkill.", a.e), new aur("teamkill.", a.f), new aur("teamkill.", a.g), new aur("teamkill.", a.h), new aur("teamkill.", a.i), new aur("teamkill.", a.j), new aur("teamkill.", a.k), new aur("teamkill.", a.l), new aur("teamkill.", a.m), new aur("teamkill.", a.n), new aur("teamkill.", a.o), new aur("teamkill.", a.p) };
    public static final auu[] i = { new aur("killedByTeam.", a.a), new aur("killedByTeam.", a.b), new aur("killedByTeam.", a.c), new aur("killedByTeam.", a.d), new aur("killedByTeam.", a.e), new aur("killedByTeam.", a.f), new aur("killedByTeam.", a.g), new aur("killedByTeam.", a.h), new aur("killedByTeam.", a.i), new aur("killedByTeam.", a.j), new aur("killedByTeam.", a.k), new aur("killedByTeam.", a.l), new aur("killedByTeam.", a.m), new aur("killedByTeam.", a.n), new aur("killedByTeam.", a.o), new aur("killedByTeam.", a.p) };
    
    String a();
    
    int a(final List<wn> p0);
    
    boolean b();
    
    a c();
    
    public enum a
    {
        a("integer"), 
        b("hearts");
        
        private static final Map<String, a> c;
        private final String d;
        
        private a(final String \u2603) {
            this.d = \u2603;
        }
        
        public String a() {
            return this.d;
        }
        
        public static a a(final String \u2603) {
            final a a = auu.a.c.get(\u2603);
            return (a == null) ? auu.a.a : a;
        }
        
        static {
            c = Maps.newHashMap();
            for (final a a2 : values()) {
                a.c.put(a2.a(), a2);
            }
        }
    }
}
