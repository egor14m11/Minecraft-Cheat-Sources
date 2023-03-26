import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgr
{
    public static final bgr a;
    public static float b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static float h;
    public static float i;
    public static float j;
    public final bgq k;
    public final bgq l;
    public final bgq m;
    public final bgq n;
    public final bgq o;
    public final bgq p;
    
    private bgr() {
        this(bgq.a, bgq.a, bgq.a, bgq.a, bgq.a, bgq.a);
    }
    
    public bgr(final bgr \u2603) {
        this.k = \u2603.k;
        this.l = \u2603.l;
        this.m = \u2603.m;
        this.n = \u2603.n;
        this.o = \u2603.o;
        this.p = \u2603.p;
    }
    
    public bgr(final bgq \u2603, final bgq \u2603, final bgq \u2603, final bgq \u2603, final bgq \u2603, final bgq \u2603) {
        this.k = \u2603;
        this.l = \u2603;
        this.m = \u2603;
        this.n = \u2603;
        this.o = \u2603;
        this.p = \u2603;
    }
    
    public void a(final b \u2603) {
        final bgq b = this.b(\u2603);
        if (b != bgq.a) {
            bfl.b(b.c.x + bgr.b, b.c.y + bgr.c, b.c.z + bgr.d);
            bfl.b(b.b.y + bgr.f, 0.0f, 1.0f, 0.0f);
            bfl.b(b.b.x + bgr.e, 1.0f, 0.0f, 0.0f);
            bfl.b(b.b.z + bgr.g, 0.0f, 0.0f, 1.0f);
            bfl.a(b.d.x + bgr.h, b.d.y + bgr.i, b.d.z + bgr.j);
        }
    }
    
    public bgq b(final b \u2603) {
        switch (bgr$1.a[\u2603.ordinal()]) {
            case 1: {
                return this.k;
            }
            case 2: {
                return this.l;
            }
            case 3: {
                return this.m;
            }
            case 4: {
                return this.n;
            }
            case 5: {
                return this.o;
            }
            case 6: {
                return this.p;
            }
            default: {
                return bgq.a;
            }
        }
    }
    
    public boolean c(final b \u2603) {
        return !this.b(\u2603).equals(bgq.a);
    }
    
    static {
        a = new bgr();
        bgr.b = 0.0f;
        bgr.c = 0.0f;
        bgr.d = 0.0f;
        bgr.e = 0.0f;
        bgr.f = 0.0f;
        bgr.g = 0.0f;
        bgr.h = 0.0f;
        bgr.i = 0.0f;
        bgr.j = 0.0f;
    }
    
    public enum b
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f, 
        g;
    }
    
    static class a implements JsonDeserializer<bgr>
    {
        public bgr a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final bgq a = this.a(\u2603, asJsonObject, "thirdperson");
            final bgq a2 = this.a(\u2603, asJsonObject, "firstperson");
            final bgq a3 = this.a(\u2603, asJsonObject, "head");
            final bgq a4 = this.a(\u2603, asJsonObject, "gui");
            final bgq a5 = this.a(\u2603, asJsonObject, "ground");
            final bgq a6 = this.a(\u2603, asJsonObject, "fixed");
            return new bgr(a, a2, a3, a4, a5, a6);
        }
        
        private bgq a(final JsonDeserializationContext \u2603, final JsonObject \u2603, final String \u2603) {
            if (\u2603.has(\u2603)) {
                return \u2603.deserialize(\u2603.get(\u2603), bgq.class);
            }
            return bgq.a;
        }
    }
}
