import com.google.common.collect.Maps;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public enum a
{
    a("BLACK", '0', 0), 
    b("DARK_BLUE", '1', 1), 
    c("DARK_GREEN", '2', 2), 
    d("DARK_AQUA", '3', 3), 
    e("DARK_RED", '4', 4), 
    f("DARK_PURPLE", '5', 5), 
    g("GOLD", '6', 6), 
    h("GRAY", '7', 7), 
    i("DARK_GRAY", '8', 8), 
    j("BLUE", '9', 9), 
    k("GREEN", 'a', 10), 
    l("AQUA", 'b', 11), 
    m("RED", 'c', 12), 
    n("LIGHT_PURPLE", 'd', 13), 
    o("YELLOW", 'e', 14), 
    p("WHITE", 'f', 15), 
    q("OBFUSCATED", 'k', true), 
    r("BOLD", 'l', true), 
    s("STRIKETHROUGH", 'm', true), 
    t("UNDERLINE", 'n', true), 
    u("ITALIC", 'o', true), 
    v("RESET", 'r', -1);
    
    private static final Map<String, a> w;
    private static final Pattern x;
    private final String y;
    private final char z;
    private final boolean A;
    private final String B;
    private final int C;
    
    private static String c(final String \u2603) {
        return \u2603.toLowerCase().replaceAll("[^a-z]", "");
    }
    
    private a(final String \u2603, final char \u2603, final int \u2603) {
        this(\u2603, \u2603, false, \u2603);
    }
    
    private a(final String \u2603, final char \u2603, final boolean \u2603) {
        this(\u2603, \u2603, \u2603, -1);
    }
    
    private a(final String \u2603, final char \u2603, final boolean \u2603, final int \u2603) {
        this.y = \u2603;
        this.z = \u2603;
        this.A = \u2603;
        this.C = \u2603;
        this.B = "§" + \u2603;
    }
    
    public int b() {
        return this.C;
    }
    
    public boolean c() {
        return this.A;
    }
    
    public boolean d() {
        return !this.A && this != a.v;
    }
    
    public String e() {
        return this.name().toLowerCase();
    }
    
    @Override
    public String toString() {
        return this.B;
    }
    
    public static String a(final String \u2603) {
        return (\u2603 == null) ? null : a.x.matcher(\u2603).replaceAll("");
    }
    
    public static a b(final String \u2603) {
        if (\u2603 == null) {
            return null;
        }
        return a.w.get(c(\u2603));
    }
    
    public static a a(final int \u2603) {
        if (\u2603 < 0) {
            return a.v;
        }
        for (final a a : values()) {
            if (a.b() == \u2603) {
                return a;
            }
        }
        return null;
    }
    
    public static Collection<String> a(final boolean \u2603, final boolean \u2603) {
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final a a : values()) {
            if (!a.d() || \u2603) {
                if (!a.c() || \u2603) {
                    arrayList.add(a.e());
                }
            }
        }
        return arrayList;
    }
    
    static {
        w = Maps.newHashMap();
        x = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
        for (final a a2 : values()) {
            a.w.put(c(a2.y), a2);
        }
    }
}
