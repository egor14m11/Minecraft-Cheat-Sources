import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.lang.reflect.Type;
import org.apache.logging.log4j.LogManager;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.Writer;
import org.apache.commons.io.IOUtils;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import java.io.IOException;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Maps;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.io.File;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class mb<K, V extends ma<K>>
{
    protected static final Logger a;
    protected final Gson b;
    private final File c;
    private final Map<String, V> d;
    private boolean e;
    private static final ParameterizedType f;
    
    public mb(final File \u2603) {
        this.d = (Map<String, V>)Maps.newHashMap();
        this.e = true;
        this.c = \u2603;
        final GsonBuilder setPrettyPrinting = new GsonBuilder().setPrettyPrinting();
        setPrettyPrinting.registerTypeHierarchyAdapter(ma.class, new a());
        this.b = setPrettyPrinting.create();
    }
    
    public boolean b() {
        return this.e;
    }
    
    public void a(final boolean \u2603) {
        this.e = \u2603;
    }
    
    public void a(final V \u2603) {
        this.d.put(this.a(\u2603.f()), \u2603);
        try {
            this.f();
        }
        catch (IOException throwable) {
            mb.a.warn("Could not save the list after adding a user.", throwable);
        }
    }
    
    public V b(final K \u2603) {
        this.h();
        return this.d.get(this.a(\u2603));
    }
    
    public void c(final K \u2603) {
        this.d.remove(this.a(\u2603));
        try {
            this.f();
        }
        catch (IOException throwable) {
            mb.a.warn("Could not save the list after removing a user.", throwable);
        }
    }
    
    public String[] a() {
        return this.d.keySet().toArray(new String[this.d.size()]);
    }
    
    protected String a(final K \u2603) {
        return \u2603.toString();
    }
    
    protected boolean d(final K \u2603) {
        return this.d.containsKey(this.a(\u2603));
    }
    
    private void h() {
        final List<K> arrayList = (List<K>)Lists.newArrayList();
        for (final V v : this.d.values()) {
            if (v.e()) {
                arrayList.add(v.f());
            }
        }
        for (final K next : arrayList) {
            this.d.remove(next);
        }
    }
    
    protected ma<K> a(final JsonObject \u2603) {
        return new ma<K>(null, \u2603);
    }
    
    protected Map<String, V> e() {
        return this.d;
    }
    
    public void f() throws IOException {
        final Collection<V> values = this.d.values();
        final String json = this.b.toJson(values);
        BufferedWriter writer = null;
        try {
            writer = Files.newWriter(this.c, Charsets.UTF_8);
            writer.write(json);
        }
        finally {
            IOUtils.closeQuietly(writer);
        }
    }
    
    static {
        a = LogManager.getLogger();
        f = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[] { ma.class };
            }
            
            @Override
            public Type getRawType() {
                return List.class;
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }
    
    class a implements JsonDeserializer<ma<K>>, JsonSerializer<ma<K>>
    {
        private a() {
        }
        
        public JsonElement a(final ma<K> \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
            final JsonObject \u26032 = new JsonObject();
            \u2603.a(\u26032);
            return \u26032;
        }
        
        public ma<K> a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            if (\u2603.isJsonObject()) {
                final JsonObject asJsonObject = \u2603.getAsJsonObject();
                final ma<K> a = mb.this.a(asJsonObject);
                return a;
            }
            return null;
        }
    }
}
