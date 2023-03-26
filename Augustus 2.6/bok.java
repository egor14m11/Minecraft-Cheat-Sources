import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bok extends bnv<boj> implements JsonSerializer<boj>
{
    public boj a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final JsonObject asJsonObject = \u2603.getAsJsonObject();
        final eu \u26032 = \u2603.deserialize(asJsonObject.get("description"), eu.class);
        if (\u26032 == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        final int m = ni.m(asJsonObject, "pack_format");
        return new boj(\u26032, m);
    }
    
    public JsonElement a(final boj \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", \u2603.b());
        jsonObject.add("description", \u2603.serialize(\u2603.a()));
        return jsonObject;
    }
    
    @Override
    public String a() {
        return "pack";
    }
}
