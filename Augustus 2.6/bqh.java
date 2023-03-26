import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqh
{
    private static final Gson a;
    private final String b;
    private String c;
    private Map<String, String> d;
    
    public bqh(final String \u2603, final String \u2603) {
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public bqh(final String \u2603) {
        this(\u2603, null);
    }
    
    public void a(final String \u2603) {
        this.c = \u2603;
    }
    
    public String a() {
        return (this.c == null) ? this.b : this.c;
    }
    
    public void a(final String \u2603, final String \u2603) {
        if (this.d == null) {
            this.d = (Map<String, String>)Maps.newHashMap();
        }
        if (this.d.size() > 50) {
            throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
        }
        if (\u2603 == null) {
            throw new IllegalArgumentException("Metadata payload key cannot be null!");
        }
        if (\u2603.length() > 255) {
            throw new IllegalArgumentException("Metadata payload key is too long!");
        }
        if (\u2603 == null) {
            throw new IllegalArgumentException("Metadata payload value cannot be null!");
        }
        if (\u2603.length() > 255) {
            throw new IllegalArgumentException("Metadata payload value is too long!");
        }
        this.d.put(\u2603, \u2603);
    }
    
    public String b() {
        if (this.d == null || this.d.isEmpty()) {
            return null;
        }
        return bqh.a.toJson(this.d);
    }
    
    public String c() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.b).add("description", (Object)this.c).add("data", (Object)this.b()).toString();
    }
    
    static {
        a = new Gson();
    }
}
