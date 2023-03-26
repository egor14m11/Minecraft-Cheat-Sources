import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class ew
{
    private final a a;
    private final eu b;
    
    public ew(final a \u2603, final eu \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public a a() {
        return this.a;
    }
    
    public eu b() {
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
        final ew ew = (ew)\u2603;
        if (this.a != ew.a) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(ew.b)) {
                return true;
            }
        }
        else if (ew.b == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "HoverEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.a.hashCode();
        hashCode = 31 * hashCode + ((this.b != null) ? this.b.hashCode() : 0);
        return hashCode;
    }
    
    public enum a
    {
        a("show_text", true), 
        b("show_achievement", true), 
        c("show_item", true), 
        d("show_entity", true);
        
        private static final Map<String, a> e;
        private final boolean f;
        private final String g;
        
        private a(final String \u2603, final boolean \u2603) {
            this.g = \u2603;
            this.f = \u2603;
        }
        
        public boolean a() {
            return this.f;
        }
        
        public String b() {
            return this.g;
        }
        
        public static a a(final String \u2603) {
            return a.e.get(\u2603);
        }
        
        static {
            e = Maps.newHashMap();
            for (final a a2 : values()) {
                a.e.put(a2.b(), a2);
            }
        }
    }
}
