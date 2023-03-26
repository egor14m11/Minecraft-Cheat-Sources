import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// 
// Decompiled by Procyon v0.5.36
// 

public class bny
{
    private final db<String, a<? extends bnw>> a;
    private final GsonBuilder b;
    private Gson c;
    
    public bny() {
        this.a = new dd<String, a<? extends bnw>>();
        (this.b = new GsonBuilder()).registerTypeHierarchyAdapter(eu.class, new eu.a());
        this.b.registerTypeHierarchyAdapter(ez.class, new ez.a());
        this.b.registerTypeAdapterFactory(new nr());
    }
    
    public <T extends bnw> void a(final bnx<T> \u2603, final Class<T> \u2603) {
        this.a.a(\u2603.a(), new a<bnw>((bnx)\u2603, (Class)\u2603));
        this.b.registerTypeAdapter(\u2603, \u2603);
        this.c = null;
    }
    
    public <T extends bnw> T a(final String \u2603, final JsonObject \u2603) {
        if (\u2603 == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!\u2603.has(\u2603)) {
            return null;
        }
        if (!\u2603.get(\u2603).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + \u2603 + "' - expected object, found " + \u2603.get(\u2603));
        }
        final a<?> a = this.a.a(\u2603);
        if (a == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + \u2603 + "'");
        }
        return this.a().fromJson(\u2603.getAsJsonObject(\u2603), (Type)a.b);
    }
    
    private Gson a() {
        if (this.c == null) {
            this.c = this.b.create();
        }
        return this.c;
    }
    
    class a<T extends bnw>
    {
        final bnx<T> a;
        final Class<T> b;
        
        private a(final bnx<T> \u2603, final Class<T> \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
