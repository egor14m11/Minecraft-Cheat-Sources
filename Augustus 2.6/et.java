import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class et
{
    private final a a;
    private final String b;
    
    public et(final a \u2603, final String \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public a a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final et et = (et)\u2603;
        if (this.a != et.a) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(et.b)) {
                return true;
            }
        }
        else if (et.b == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ClickEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.a.hashCode();
        hashCode = 31 * hashCode + ((this.b != null) ? this.b.hashCode() : 0);
        return hashCode;
    }
    
    public enum a
    {
        a("open_url", true), 
        b("open_file", false), 
        c("run_command", true), 
        d("twitch_user_info", false), 
        e("suggest_command", true), 
        f("change_page", true);
        
        private static final Map<String, a> g;
        private final boolean h;
        private final String i;
        
        private a(final String \u2603, final boolean \u2603) {
            this.i = \u2603;
            this.h = \u2603;
        }
        
        public boolean a() {
            return this.h;
        }
        
        public String b() {
            return this.i;
        }
        
        public static a a(final String \u2603) {
            return a.g.get(\u2603);
        }
        
        static {
            g = Maps.newHashMap();
            for (final a a2 : values()) {
                a.g.put(a2.b(), a2);
            }
        }
    }
}
