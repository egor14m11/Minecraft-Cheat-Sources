import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.UUID;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class js
{
    private eu a;
    private a b;
    private c c;
    private String d;
    
    public eu a() {
        return this.a;
    }
    
    public void a(final eu \u2603) {
        this.a = \u2603;
    }
    
    public a b() {
        return this.b;
    }
    
    public void a(final a \u2603) {
        this.b = \u2603;
    }
    
    public c c() {
        return this.c;
    }
    
    public void a(final c \u2603) {
        this.c = \u2603;
    }
    
    public void a(final String \u2603) {
        this.d = \u2603;
    }
    
    public String d() {
        return this.d;
    }
    
    public static class a
    {
        private final int a;
        private final int b;
        private GameProfile[] c;
        
        public a(final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public int a() {
            return this.a;
        }
        
        public int b() {
            return this.b;
        }
        
        public GameProfile[] c() {
            return this.c;
        }
        
        public void a(final GameProfile[] \u2603) {
            this.c = \u2603;
        }
        
        public static class a implements JsonDeserializer<js.a>, JsonSerializer<js.a>
        {
            public js.a a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
                final JsonObject l = ni.l(\u2603, "players");
                final js.a a = new js.a(ni.m(l, "max"), ni.m(l, "online"));
                if (ni.d(l, "sample")) {
                    final JsonArray t = ni.t(l, "sample");
                    if (t.size() > 0) {
                        final GameProfile[] \u26032 = new GameProfile[t.size()];
                        for (int i = 0; i < \u26032.length; ++i) {
                            final JsonObject j = ni.l(t.get(i), "player[" + i + "]");
                            final String h = ni.h(j, "id");
                            \u26032[i] = new GameProfile(UUID.fromString(h), ni.h(j, "name"));
                        }
                        a.a(\u26032);
                    }
                }
                return a;
            }
            
            public JsonElement a(final js.a \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
                final JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("max", \u2603.a());
                jsonObject.addProperty("online", \u2603.b());
                if (\u2603.c() != null && \u2603.c().length > 0) {
                    final JsonArray value = new JsonArray();
                    for (int i = 0; i < \u2603.c().length; ++i) {
                        final JsonObject element = new JsonObject();
                        final UUID id = \u2603.c()[i].getId();
                        element.addProperty("id", (id == null) ? "" : id.toString());
                        element.addProperty("name", \u2603.c()[i].getName());
                        value.add(element);
                    }
                    jsonObject.add("sample", value);
                }
                return jsonObject;
            }
        }
    }
    
    public static class c
    {
        private final String a;
        private final int b;
        
        public c(final String \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public String a() {
            return this.a;
        }
        
        public int b() {
            return this.b;
        }
        
        public static class a implements JsonDeserializer<c>, JsonSerializer<c>
        {
            public c a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
                final JsonObject l = ni.l(\u2603, "version");
                return new c(ni.h(l, "name"), ni.m(l, "protocol"));
            }
            
            public JsonElement a(final c \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
                final JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("name", \u2603.a());
                jsonObject.addProperty("protocol", \u2603.b());
                return jsonObject;
            }
        }
    }
    
    public static class b implements JsonDeserializer<js>, JsonSerializer<js>
    {
        public js a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject l = ni.l(\u2603, "status");
            final js js = new js();
            if (l.has("description")) {
                js.a(\u2603.deserialize(l.get("description"), eu.class));
            }
            if (l.has("players")) {
                js.a(\u2603.deserialize(l.get("players"), a.class));
            }
            if (l.has("version")) {
                js.a(\u2603.deserialize(l.get("version"), c.class));
            }
            if (l.has("favicon")) {
                js.a(ni.h(l, "favicon"));
            }
            return js;
        }
        
        public JsonElement a(final js \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
            final JsonObject jsonObject = new JsonObject();
            if (\u2603.a() != null) {
                jsonObject.add("description", \u2603.serialize(\u2603.a()));
            }
            if (\u2603.b() != null) {
                jsonObject.add("players", \u2603.serialize(\u2603.b()));
            }
            if (\u2603.c() != null) {
                jsonObject.add("version", \u2603.serialize(\u2603.c()));
            }
            if (\u2603.d() != null) {
                jsonObject.addProperty("favicon", \u2603.d());
            }
            return jsonObject;
        }
    }
}
