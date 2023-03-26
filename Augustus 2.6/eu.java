import com.google.gson.TypeAdapterFactory;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import com.google.gson.JsonSerializationContext;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public interface eu extends Iterable<eu>
{
    eu a(final ez p0);
    
    ez b();
    
    eu a(final String p0);
    
    eu a(final eu p0);
    
    String e();
    
    String c();
    
    String d();
    
    List<eu> a();
    
    eu f();
    
    public static class a implements JsonDeserializer<eu>, JsonSerializer<eu>
    {
        private static final Gson a;
        
        public eu a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            if (\u2603.isJsonPrimitive()) {
                return new fa(\u2603.getAsString());
            }
            if (\u2603.isJsonObject()) {
                final JsonObject asJsonObject = \u2603.getAsJsonObject();
                eu eu;
                if (asJsonObject.has("text")) {
                    eu = new fa(asJsonObject.get("text").getAsString());
                }
                else if (asJsonObject.has("translate")) {
                    final String asString = asJsonObject.get("translate").getAsString();
                    if (asJsonObject.has("with")) {
                        final JsonArray asJsonArray = asJsonObject.getAsJsonArray("with");
                        final Object[] \u26032 = new Object[asJsonArray.size()];
                        for (int i = 0; i < \u26032.length; ++i) {
                            \u26032[i] = this.a(asJsonArray.get(i), \u2603, \u2603);
                            if (\u26032[i] instanceof fa) {
                                final fa fa = (fa)\u26032[i];
                                if (fa.b().g() && fa.a().isEmpty()) {
                                    \u26032[i] = fa.g();
                                }
                            }
                        }
                        eu = new fb(asString, \u26032);
                    }
                    else {
                        eu = new fb(asString, new Object[0]);
                    }
                }
                else if (asJsonObject.has("score")) {
                    final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("score");
                    if (!asJsonObject2.has("name") || !asJsonObject2.has("objective")) {
                        throw new JsonParseException("A score component needs a least a name and an objective");
                    }
                    eu = new ex(ni.h(asJsonObject2, "name"), ni.h(asJsonObject2, "objective"));
                    if (asJsonObject2.has("value")) {
                        ((ex)eu).b(ni.h(asJsonObject2, "value"));
                    }
                }
                else {
                    if (!asJsonObject.has("selector")) {
                        throw new JsonParseException("Don't know how to turn " + \u2603.toString() + " into a Component");
                    }
                    eu = new ey(ni.h(asJsonObject, "selector"));
                }
                if (asJsonObject.has("extra")) {
                    final JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("extra");
                    if (asJsonArray2.size() <= 0) {
                        throw new JsonParseException("Unexpected empty array of components");
                    }
                    for (int j = 0; j < asJsonArray2.size(); ++j) {
                        eu.a(this.a(asJsonArray2.get(j), \u2603, \u2603));
                    }
                }
                eu.a(\u2603.deserialize(\u2603, ez.class));
                return eu;
            }
            if (\u2603.isJsonArray()) {
                final JsonArray asJsonArray3 = \u2603.getAsJsonArray();
                eu eu = null;
                for (final JsonElement \u26033 : asJsonArray3) {
                    final eu a = this.a(\u26033, \u26033.getClass(), \u2603);
                    if (eu == null) {
                        eu = a;
                    }
                    else {
                        eu.a(a);
                    }
                }
                return eu;
            }
            throw new JsonParseException("Don't know how to turn " + \u2603.toString() + " into a Component");
        }
        
        private void a(final ez \u2603, final JsonObject \u2603, final JsonSerializationContext \u2603) {
            final JsonElement serialize = \u2603.serialize(\u2603);
            if (serialize.isJsonObject()) {
                final JsonObject jsonObject = (JsonObject)serialize;
                for (final Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    \u2603.add(entry.getKey(), entry.getValue());
                }
            }
        }
        
        public JsonElement a(final eu \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
            if (\u2603 instanceof fa && \u2603.b().g() && \u2603.a().isEmpty()) {
                return new JsonPrimitive(((fa)\u2603).g());
            }
            final JsonObject \u26032 = new JsonObject();
            if (!\u2603.b().g()) {
                this.a(\u2603.b(), \u26032, \u2603);
            }
            if (!\u2603.a().isEmpty()) {
                final JsonArray value = new JsonArray();
                for (final eu \u26033 : \u2603.a()) {
                    value.add(this.a(\u26033, \u26033.getClass(), \u2603));
                }
                \u26032.add("extra", value);
            }
            if (\u2603 instanceof fa) {
                \u26032.addProperty("text", ((fa)\u2603).g());
            }
            else if (\u2603 instanceof fb) {
                final fb fb = (fb)\u2603;
                \u26032.addProperty("translate", fb.i());
                if (fb.j() != null && fb.j().length > 0) {
                    final JsonArray value2 = new JsonArray();
                    for (final Object obj : fb.j()) {
                        if (obj instanceof eu) {
                            value2.add(this.a((eu)obj, obj.getClass(), \u2603));
                        }
                        else {
                            value2.add(new JsonPrimitive(String.valueOf(obj)));
                        }
                    }
                    \u26032.add("with", value2);
                }
            }
            else if (\u2603 instanceof ex) {
                final ex ex = (ex)\u2603;
                final JsonObject value3 = new JsonObject();
                value3.addProperty("name", ex.g());
                value3.addProperty("objective", ex.h());
                value3.addProperty("value", ex.e());
                \u26032.add("score", value3);
            }
            else {
                if (!(\u2603 instanceof ey)) {
                    throw new IllegalArgumentException("Don't know how to serialize " + \u2603 + " as a Component");
                }
                final ey ey = (ey)\u2603;
                \u26032.addProperty("selector", ey.g());
            }
            return \u26032;
        }
        
        public static String a(final eu \u2603) {
            return eu.a.a.toJson(\u2603);
        }
        
        public static eu a(final String \u2603) {
            return eu.a.a.fromJson(\u2603, eu.class);
        }
        
        static {
            final GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeHierarchyAdapter(eu.class, new a());
            gsonBuilder.registerTypeHierarchyAdapter(ez.class, new ez.a());
            gsonBuilder.registerTypeAdapterFactory(new nr());
            a = gsonBuilder.create();
        }
    }
}
