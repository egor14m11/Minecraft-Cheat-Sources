import com.google.gson.JsonObject;
import java.util.Date;

// 
// Decompiled by Procyon v0.5.36
// 

public class lv extends ls<String>
{
    public lv(final String \u2603) {
        this(\u2603, null, null, null, null);
    }
    
    public lv(final String \u2603, final Date \u2603, final String \u2603, final Date \u2603, final String \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public lv(final JsonObject \u2603) {
        super(b(\u2603), \u2603);
    }
    
    private static String b(final JsonObject \u2603) {
        return \u2603.has("ip") ? \u2603.get("ip").getAsString() : null;
    }
    
    @Override
    protected void a(final JsonObject \u2603) {
        if (this.f() == null) {
            return;
        }
        \u2603.addProperty("ip", this.f());
        super.a(\u2603);
    }
}
