import com.google.gson.JsonObject;
import org.apache.commons.lang3.Validate;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;

// 
// Decompiled by Procyon v0.5.36
// 

public class boe extends bnv<bod>
{
    public bod a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final JsonObject asJsonObject = \u2603.getAsJsonObject();
        final float[] \u26032 = new float[256];
        final float[] \u26033 = new float[256];
        final float[] \u26034 = new float[256];
        float a = 1.0f;
        float a2 = 0.0f;
        float a3 = 0.0f;
        if (asJsonObject.has("characters")) {
            if (!asJsonObject.get("characters").isJsonObject()) {
                throw new JsonParseException("Invalid font->characters: expected object, was " + asJsonObject.get("characters"));
            }
            final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("characters");
            if (asJsonObject2.has("default")) {
                if (!asJsonObject2.get("default").isJsonObject()) {
                    throw new JsonParseException("Invalid font->characters->default: expected object, was " + asJsonObject2.get("default"));
                }
                final JsonObject asJsonObject3 = asJsonObject2.getAsJsonObject("default");
                a = ni.a(asJsonObject3, "width", a);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a, "Invalid default width");
                a2 = ni.a(asJsonObject3, "spacing", a2);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a2, "Invalid default spacing");
                a3 = ni.a(asJsonObject3, "left", a2);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a3, "Invalid default left");
            }
            for (int i = 0; i < 256; ++i) {
                final JsonElement value = asJsonObject2.get(Integer.toString(i));
                float a4 = a;
                float a5 = a2;
                float a6 = a3;
                if (value != null) {
                    final JsonObject l = ni.l(value, "characters[" + i + "]");
                    a4 = ni.a(l, "width", a);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a4, "Invalid width");
                    a5 = ni.a(l, "spacing", a2);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a5, "Invalid spacing");
                    a6 = ni.a(l, "left", a3);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, a6, "Invalid left");
                }
                \u26032[i] = a4;
                \u26033[i] = a5;
                \u26034[i] = a6;
            }
        }
        return new bod(\u26032, \u26034, \u26033);
    }
    
    @Override
    public String a() {
        return "font";
    }
}
