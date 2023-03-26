import java.util.Iterator;
import java.util.Set;
import com.google.gson.JsonObject;
import java.util.Collection;
import com.google.gson.JsonParseException;
import java.util.Map;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;

// 
// Decompiled by Procyon v0.5.36
// 

public class boh extends bnv<bog>
{
    public bog a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
        final JsonObject asJsonObject = \u2603.getAsJsonObject();
        final Set<bnr> hashSet = (Set<bnr>)Sets.newHashSet();
        for (final Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            final String s = entry.getKey();
            final JsonObject l = ni.l(entry.getValue(), "language");
            final String h = ni.h(l, "region");
            final String h2 = ni.h(l, "name");
            final boolean a = ni.a(l, "bidirectional", false);
            if (h.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->region: empty value");
            }
            if (h2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->name: empty value");
            }
            if (!hashSet.add(new bnr(s, h, h2, a))) {
                throw new JsonParseException("Duplicate language->'" + s + "' defined");
            }
        }
        return new bog(hashSet);
    }
    
    @Override
    public String a() {
        return "language";
    }
}
