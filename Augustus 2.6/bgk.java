import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgk
{
    public float[] a;
    public final int b;
    
    public bgk(final float[] \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public float a(final int \u2603) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        final int d = this.d(\u2603);
        return (d == 0 || d == 1) ? this.a[0] : this.a[2];
    }
    
    public float b(final int \u2603) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        final int d = this.d(\u2603);
        return (d == 0 || d == 3) ? this.a[1] : this.a[3];
    }
    
    private int d(final int \u2603) {
        return (\u2603 + this.b / 90) % 4;
    }
    
    public int c(final int \u2603) {
        return (\u2603 + (4 - this.b / 90)) % 4;
    }
    
    public void a(final float[] \u2603) {
        if (this.a == null) {
            this.a = \u2603;
        }
    }
    
    static class a implements JsonDeserializer<bgk>
    {
        public bgk a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final float[] b = this.b(asJsonObject);
            final int a = this.a(asJsonObject);
            return new bgk(b, a);
        }
        
        protected int a(final JsonObject \u2603) {
            final int a = ni.a(\u2603, "rotation", 0);
            if (a < 0 || a % 90 != 0 || a / 90 > 3) {
                throw new JsonParseException("Invalid rotation " + a + " found, only 0/90/180/270 allowed");
            }
            return a;
        }
        
        private float[] b(final JsonObject \u2603) {
            if (!\u2603.has("uv")) {
                return null;
            }
            final JsonArray t = ni.t(\u2603, "uv");
            if (t.size() != 4) {
                throw new JsonParseException("Expected 4 uv values, found: " + t.size());
            }
            final float[] array = new float[4];
            for (int i = 0; i < array.length; ++i) {
                array[i] = ni.d(t.get(i), "uv[" + i + "]");
            }
            return array;
        }
    }
}
