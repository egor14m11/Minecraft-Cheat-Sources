import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgq
{
    public static final bgq a;
    public final Vector3f b;
    public final Vector3f c;
    public final Vector3f d;
    
    public bgq(final Vector3f \u2603, final Vector3f \u2603, final Vector3f \u2603) {
        this.b = new Vector3f(\u2603);
        this.c = new Vector3f(\u2603);
        this.d = new Vector3f(\u2603);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (this.getClass() != \u2603.getClass()) {
            return false;
        }
        final bgq bgq = (bgq)\u2603;
        return this.b.equals(bgq.b) && this.d.equals(bgq.d) && this.c.equals(bgq.c);
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.b.hashCode();
        hashCode = 31 * hashCode + this.c.hashCode();
        hashCode = 31 * hashCode + this.d.hashCode();
        return hashCode;
    }
    
    static {
        a = new bgq(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    }
    
    static class a implements JsonDeserializer<bgq>
    {
        private static final Vector3f a;
        private static final Vector3f b;
        private static final Vector3f c;
        
        public bgq a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final Vector3f a = this.a(asJsonObject, "rotation", bgq.a.a);
            final Vector3f a2 = this.a(asJsonObject, "translation", bgq.a.b);
            a2.scale(0.0625f);
            a2.x = ns.a(a2.x, -1.5f, 1.5f);
            a2.y = ns.a(a2.y, -1.5f, 1.5f);
            a2.z = ns.a(a2.z, -1.5f, 1.5f);
            final Vector3f a3 = this.a(asJsonObject, "scale", bgq.a.c);
            a3.x = ns.a(a3.x, -4.0f, 4.0f);
            a3.y = ns.a(a3.y, -4.0f, 4.0f);
            a3.z = ns.a(a3.z, -4.0f, 4.0f);
            return new bgq(a, a2, a3);
        }
        
        private Vector3f a(final JsonObject \u2603, final String \u2603, final Vector3f \u2603) {
            if (!\u2603.has(\u2603)) {
                return \u2603;
            }
            final JsonArray t = ni.t(\u2603, \u2603);
            if (t.size() != 3) {
                throw new JsonParseException("Expected 3 " + \u2603 + " values, found: " + t.size());
            }
            final float[] array = new float[3];
            for (int i = 0; i < array.length; ++i) {
                array[i] = ni.d(t.get(i), \u2603 + "[" + i + "]");
            }
            return new Vector3f(array[0], array[1], array[2]);
        }
        
        static {
            a = new Vector3f(0.0f, 0.0f, 0.0f);
            b = new Vector3f(0.0f, 0.0f, 0.0f);
            c = new Vector3f(1.0f, 1.0f, 1.0f);
        }
    }
}
