import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.Validate;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bob extends bnv<boa> implements JsonSerializer<boa>
{
    public boa a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final List<bnz> arrayList = (List<bnz>)Lists.newArrayList();
        final JsonObject l = ni.l(\u2603, "metadata section");
        final int a = ni.a(l, "frametime", 1);
        if (a != 1) {
            Validate.inclusiveBetween(1L, 2147483647L, a, "Invalid default frame time");
        }
        if (l.has("frames")) {
            try {
                final JsonArray t = ni.t(l, "frames");
                for (int i = 0; i < t.size(); ++i) {
                    final JsonElement value = t.get(i);
                    final bnz a2 = this.a(i, value);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            catch (ClassCastException cause) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + l.get("frames"), cause);
            }
        }
        final int a3 = ni.a(l, "width", -1);
        int i = ni.a(l, "height", -1);
        if (a3 != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, a3, "Invalid width");
        }
        if (i != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, i, "Invalid height");
        }
        final boolean a4 = ni.a(l, "interpolate", false);
        return new boa(arrayList, a3, i, a, a4);
    }
    
    private bnz a(final int \u2603, final JsonElement \u2603) {
        if (\u2603.isJsonPrimitive()) {
            return new bnz(ni.f(\u2603, "frames[" + \u2603 + "]"));
        }
        if (\u2603.isJsonObject()) {
            final JsonObject l = ni.l(\u2603, "frames[" + \u2603 + "]");
            final int a = ni.a(l, "time", -1);
            if (l.has("time")) {
                Validate.inclusiveBetween(1L, 2147483647L, a, "Invalid frame time");
            }
            final int m = ni.m(l, "index");
            Validate.inclusiveBetween(0L, 2147483647L, m, "Invalid frame index");
            return new bnz(m, a);
        }
        return null;
    }
    
    public JsonElement a(final boa \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", \u2603.d());
        if (\u2603.b() != -1) {
            jsonObject.addProperty("width", \u2603.b());
        }
        if (\u2603.a() != -1) {
            jsonObject.addProperty("height", \u2603.a());
        }
        if (\u2603.c() > 0) {
            final JsonArray value = new JsonArray();
            for (int i = 0; i < \u2603.c(); ++i) {
                if (\u2603.b(i)) {
                    final JsonObject element = new JsonObject();
                    element.addProperty("index", \u2603.c(i));
                    element.addProperty("time", \u2603.a(i));
                    value.add(element);
                }
                else {
                    value.add(new JsonPrimitive(\u2603.c(i)));
                }
            }
            jsonObject.add("frames", value);
        }
        return jsonObject;
    }
    
    @Override
    public String a() {
        return "animation";
    }
}
