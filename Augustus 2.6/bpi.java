import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.Validate;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpi implements JsonDeserializer<bph>
{
    public bph a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final JsonObject l = ni.l(\u2603, "entry");
        final bph bph = new bph();
        bph.a(ni.a(l, "replace", false));
        final bpg a = bpg.a(ni.a(l, "category", bpg.a.a()));
        bph.a(a);
        Validate.notNull(a, "Invalid category", new Object[0]);
        if (l.has("sounds")) {
            final JsonArray t = ni.t(l, "sounds");
            for (int i = 0; i < t.size(); ++i) {
                final JsonElement value = t.get(i);
                final bph.a a2 = new bph.a();
                if (ni.a(value)) {
                    a2.a(ni.a(value, "sound"));
                }
                else {
                    final JsonObject j = ni.l(value, "sound");
                    a2.a(ni.h(j, "name"));
                    if (j.has("type")) {
                        final bph.a.a a3 = bph.a.a.a(ni.h(j, "type"));
                        Validate.notNull(a3, "Invalid type", new Object[0]);
                        a2.a(a3);
                    }
                    if (j.has("volume")) {
                        final float n = ni.k(j, "volume");
                        Validate.isTrue(n > 0.0f, "Invalid volume", new Object[0]);
                        a2.a(n);
                    }
                    if (j.has("pitch")) {
                        final float n = ni.k(j, "pitch");
                        Validate.isTrue(n > 0.0f, "Invalid pitch", new Object[0]);
                        a2.b(n);
                    }
                    if (j.has("weight")) {
                        final int m = ni.m(j, "weight");
                        Validate.isTrue(m > 0, "Invalid weight", new Object[0]);
                        a2.a(m);
                    }
                    if (j.has("stream")) {
                        a2.a(ni.i(j, "stream"));
                    }
                }
                bph.a().add(a2);
            }
        }
        return bph;
    }
}
