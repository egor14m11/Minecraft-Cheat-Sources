import com.google.gson.JsonArray;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;

// 
// Decompiled by Procyon v0.5.36
// 

public class boo extends bnv<bon>
{
    public bon a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final JsonObject asJsonObject = \u2603.getAsJsonObject();
        final boolean a = ni.a(asJsonObject, "blur", false);
        final boolean a2 = ni.a(asJsonObject, "clamp", false);
        final List<Integer> arrayList = (List<Integer>)Lists.newArrayList();
        if (asJsonObject.has("mipmaps")) {
            try {
                final JsonArray asJsonArray = asJsonObject.getAsJsonArray("mipmaps");
                for (int i = 0; i < asJsonArray.size(); ++i) {
                    final JsonElement value = asJsonArray.get(i);
                    if (value.isJsonPrimitive()) {
                        try {
                            arrayList.add(value.getAsInt());
                            continue;
                        }
                        catch (NumberFormatException cause) {
                            throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + value, cause);
                        }
                    }
                    if (value.isJsonObject()) {
                        throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + value);
                    }
                }
            }
            catch (ClassCastException cause2) {
                throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + asJsonObject.get("mipmaps"), cause2);
            }
        }
        return new bon(a, a2, arrayList);
    }
    
    @Override
    public String a() {
        return "texture";
    }
}
