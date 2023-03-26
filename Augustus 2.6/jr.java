import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.5.36
// 

public class jr implements ff<jp>
{
    private static final Gson a;
    private js b;
    
    public jr() {
    }
    
    public jr(final js \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.b = jr.a.fromJson(\u2603.c(32767), js.class);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(jr.a.toJson(this.b));
    }
    
    @Override
    public void a(final jp \u2603) {
        \u2603.a(this);
    }
    
    public js a() {
        return this.b;
    }
    
    static {
        a = new GsonBuilder().registerTypeAdapter(js.c.class, new js.c.a()).registerTypeAdapter(js.a.class, new js.a.a()).registerTypeAdapter(js.class, new js.b()).registerTypeHierarchyAdapter(eu.class, new eu.a()).registerTypeHierarchyAdapter(ez.class, new ez.a()).registerTypeAdapterFactory(new nr()).create();
    }
}
