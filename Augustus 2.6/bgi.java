import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgi
{
    public static final cq a;
    public final cq b;
    public final int c;
    public final String d;
    public final bgk e;
    
    public bgi(final cq \u2603, final int \u2603, final String \u2603, final bgk \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    static {
        a = null;
    }
    
    static class a implements JsonDeserializer<bgi>
    {
        public bgi a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final cq c = this.c(asJsonObject);
            final int a = this.a(asJsonObject);
            final String b = this.b(asJsonObject);
            final bgk \u26032 = \u2603.deserialize(asJsonObject, bgk.class);
            return new bgi(c, a, b, \u26032);
        }
        
        protected int a(final JsonObject \u2603) {
            return ni.a(\u2603, "tintindex", -1);
        }
        
        private String b(final JsonObject \u2603) {
            return ni.h(\u2603, "texture");
        }
        
        private cq c(final JsonObject \u2603) {
            final String a = ni.a(\u2603, "cullface", "");
            return cq.a(a);
        }
    }
}
