import java.util.Collection;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.common.collect.Sets;
import java.util.Set;
import com.google.common.collect.ForwardingSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class nc extends ForwardingSet<String> implements mz
{
    private final Set<String> a;
    
    public nc() {
        this.a = (Set<String>)Sets.newHashSet();
    }
    
    @Override
    public void a(final JsonElement \u2603) {
        if (\u2603.isJsonArray()) {
            for (final JsonElement jsonElement : \u2603.getAsJsonArray()) {
                this.add(jsonElement.getAsString());
            }
        }
    }
    
    @Override
    public JsonElement a() {
        final JsonArray jsonArray = new JsonArray();
        for (final String string : this) {
            jsonArray.add(new JsonPrimitive(string));
        }
        return jsonArray;
    }
    
    @Override
    protected Set<String> delegate() {
        return this.a;
    }
}
