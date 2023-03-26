import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class avm
{
    private final String a;
    private final String b;
    private final String c;
    private final a d;
    
    public avm(final String \u2603, final String \u2603, final String \u2603, final String \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = avm.a.a(\u2603);
    }
    
    public String a() {
        return "token:" + this.c + ":" + this.b;
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.a;
    }
    
    public String d() {
        return this.c;
    }
    
    public GameProfile e() {
        try {
            final UUID fromString = UUIDTypeAdapter.fromString(this.b());
            return new GameProfile(fromString, this.c());
        }
        catch (IllegalArgumentException ex) {
            return new GameProfile(null, this.c());
        }
    }
    
    public a f() {
        return this.d;
    }
    
    public enum a
    {
        a("legacy"), 
        b("mojang");
        
        private static final Map<String, a> c;
        private final String d;
        
        private a(final String \u2603) {
            this.d = \u2603;
        }
        
        public static a a(final String \u2603) {
            return a.c.get(\u2603.toLowerCase());
        }
        
        static {
            c = Maps.newHashMap();
            for (final a a2 : values()) {
                a.c.put(a2.d, a2);
            }
        }
    }
}
