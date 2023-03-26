import com.google.gson.JsonArray;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgh
{
    public final Vector3f a;
    public final Vector3f b;
    public final Map<cq, bgi> c;
    public final bgj d;
    public final boolean e;
    
    public bgh(final Vector3f \u2603, final Vector3f \u2603, final Map<cq, bgi> \u2603, final bgj \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.a();
    }
    
    private void a() {
        for (final Map.Entry<cq, bgi> entry : this.c.entrySet()) {
            final float[] a = this.a(entry.getKey());
            entry.getValue().e.a(a);
        }
    }
    
    private float[] a(final cq \u2603) {
        float[] array = null;
        switch (bgh$1.a[\u2603.ordinal()]) {
            case 1:
            case 2: {
                array = new float[] { this.a.x, this.a.z, this.b.x, this.b.z };
                break;
            }
            case 3:
            case 4: {
                array = new float[] { this.a.x, 16.0f - this.b.y, this.b.x, 16.0f - this.a.y };
                break;
            }
            case 5:
            case 6: {
                array = new float[] { this.a.z, 16.0f - this.b.y, this.b.z, 16.0f - this.a.y };
                break;
            }
            default: {
                throw new NullPointerException();
            }
        }
        return array;
    }
    
    static class a implements JsonDeserializer<bgh>
    {
        public bgh a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final Vector3f e = this.e(asJsonObject);
            final Vector3f d = this.d(asJsonObject);
            final bgj a = this.a(asJsonObject);
            final Map<cq, bgi> a2 = this.a(\u2603, asJsonObject);
            if (asJsonObject.has("shade") && !ni.c(asJsonObject, "shade")) {
                throw new JsonParseException("Expected shade to be a Boolean");
            }
            final boolean a3 = ni.a(asJsonObject, "shade", true);
            return new bgh(e, d, a2, a, a3);
        }
        
        private bgj a(final JsonObject \u2603) {
            bgj bgj = null;
            if (\u2603.has("rotation")) {
                final JsonObject s = ni.s(\u2603, "rotation");
                final Vector3f a = this.a(s, "origin");
                a.scale(0.0625f);
                final cq.a c = this.c(s);
                final float b = this.b(s);
                final boolean a2 = ni.a(s, "rescale", false);
                bgj = new bgj(a, c, b, a2);
            }
            return bgj;
        }
        
        private float b(final JsonObject \u2603) {
            final float k = ni.k(\u2603, "angle");
            if (k != 0.0f && ns.e(k) != 22.5f && ns.e(k) != 45.0f) {
                throw new JsonParseException("Invalid rotation " + k + " found, only -45/-22.5/0/22.5/45 allowed");
            }
            return k;
        }
        
        private cq.a c(final JsonObject \u2603) {
            final String h = ni.h(\u2603, "axis");
            final cq.a a = cq.a.a(h.toLowerCase());
            if (a == null) {
                throw new JsonParseException("Invalid rotation axis: " + h);
            }
            return a;
        }
        
        private Map<cq, bgi> a(final JsonDeserializationContext \u2603, final JsonObject \u2603) {
            final Map<cq, bgi> b = this.b(\u2603, \u2603);
            if (b.isEmpty()) {
                throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
            }
            return b;
        }
        
        private Map<cq, bgi> b(final JsonDeserializationContext \u2603, final JsonObject \u2603) {
            final Map<cq, bgi> enumMap = (Map<cq, bgi>)Maps.newEnumMap(cq.class);
            final JsonObject s = ni.s(\u2603, "faces");
            for (final Map.Entry<String, JsonElement> entry : s.entrySet()) {
                final cq a = this.a(entry.getKey());
                enumMap.put(a, \u2603.deserialize(entry.getValue(), bgi.class));
            }
            return enumMap;
        }
        
        private cq a(final String \u2603) {
            final cq a = cq.a(\u2603);
            if (a == null) {
                throw new JsonParseException("Unknown facing: " + \u2603);
            }
            return a;
        }
        
        private Vector3f d(final JsonObject \u2603) {
            final Vector3f a = this.a(\u2603, "to");
            if (a.x < -16.0f || a.y < -16.0f || a.z < -16.0f || a.x > 32.0f || a.y > 32.0f || a.z > 32.0f) {
                throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + a);
            }
            return a;
        }
        
        private Vector3f e(final JsonObject \u2603) {
            final Vector3f a = this.a(\u2603, "from");
            if (a.x < -16.0f || a.y < -16.0f || a.z < -16.0f || a.x > 32.0f || a.y > 32.0f || a.z > 32.0f) {
                throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + a);
            }
            return a;
        }
        
        private Vector3f a(final JsonObject \u2603, final String \u2603) {
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
    }
}
