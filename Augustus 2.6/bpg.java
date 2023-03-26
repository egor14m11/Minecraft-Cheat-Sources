import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public enum bpg
{
    a("master", 0), 
    b("music", 1), 
    c("record", 2), 
    d("weather", 3), 
    e("block", 4), 
    f("hostile", 5), 
    g("neutral", 6), 
    h("player", 7), 
    i("ambient", 8);
    
    private static final Map<String, bpg> j;
    private static final Map<Integer, bpg> k;
    private final String l;
    private final int m;
    
    private bpg(final String \u2603, final int \u2603) {
        this.l = \u2603;
        this.m = \u2603;
    }
    
    public String a() {
        return this.l;
    }
    
    public int b() {
        return this.m;
    }
    
    public static bpg a(final String \u2603) {
        return bpg.j.get(\u2603);
    }
    
    static {
        j = Maps.newHashMap();
        k = Maps.newHashMap();
        for (final bpg obj : values()) {
            if (bpg.j.containsKey(obj.a()) || bpg.k.containsKey(obj.b())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + obj);
            }
            bpg.j.put(obj.a(), obj);
            bpg.k.put(obj.b(), obj);
        }
    }
}
