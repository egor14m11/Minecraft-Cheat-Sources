import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.io.Reader;
import java.util.Map;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgm
{
    static final Gson a;
    private final Map<String, d> b;
    
    public static bgm a(final Reader \u2603) {
        return bgm.a.fromJson(\u2603, bgm.class);
    }
    
    public bgm(final Collection<d> \u2603) {
        this.b = (Map<String, d>)Maps.newHashMap();
        for (final d \u26032 : \u2603) {
            this.b.put(\u26032.a, \u26032);
        }
    }
    
    public bgm(final List<bgm> \u2603) {
        this.b = (Map<String, d>)Maps.newHashMap();
        for (final bgm bgm : \u2603) {
            this.b.putAll(bgm.b);
        }
    }
    
    public d b(final String \u2603) {
        final d d = this.b.get(\u2603);
        if (d == null) {
            throw new b();
        }
        return d;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof bgm) {
            final bgm bgm = (bgm)\u2603;
            return this.b.equals(bgm.b);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    static {
        a = new GsonBuilder().registerTypeAdapter(bgm.class, new a()).registerTypeAdapter(c.class, new c.a()).create();
    }
    
    public static class d
    {
        private final String a;
        private final List<c> b;
        
        public d(final String \u2603, final List<c> \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public List<c> b() {
            return this.b;
        }
        
        @Override
        public boolean equals(final Object \u2603) {
            if (this == \u2603) {
                return true;
            }
            if (!(\u2603 instanceof d)) {
                return false;
            }
            final d d = (d)\u2603;
            return this.a.equals(d.a) && this.b.equals(d.b);
        }
        
        @Override
        public int hashCode() {
            int hashCode = this.a.hashCode();
            hashCode = 31 * hashCode + this.b.hashCode();
            return hashCode;
        }
    }
    
    public static class c
    {
        private final jy a;
        private final bor b;
        private final boolean c;
        private final int d;
        
        public c(final jy \u2603, final bor \u2603, final boolean \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public jy a() {
            return this.a;
        }
        
        public bor b() {
            return this.b;
        }
        
        public boolean c() {
            return this.c;
        }
        
        public int d() {
            return this.d;
        }
        
        @Override
        public boolean equals(final Object \u2603) {
            if (this == \u2603) {
                return true;
            }
            if (\u2603 instanceof c) {
                final c c = (c)\u2603;
                return this.a.equals(c.a) && this.b == c.b && this.c == c.c;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            int hashCode = this.a.hashCode();
            hashCode = 31 * hashCode + ((this.b != null) ? this.b.hashCode() : 0);
            hashCode = 31 * hashCode + (this.c ? 1 : 0);
            return hashCode;
        }
        
        public static class a implements JsonDeserializer<c>
        {
            public c a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
                final JsonObject asJsonObject = \u2603.getAsJsonObject();
                final String b = this.b(asJsonObject);
                final bor a = this.a(asJsonObject);
                final boolean d = this.d(asJsonObject);
                final int c = this.c(asJsonObject);
                return new c(this.a(b), a, d, c);
            }
            
            private jy a(final String \u2603) {
                jy jy = new jy(\u2603);
                jy = new jy(jy.b(), "block/" + jy.a());
                return jy;
            }
            
            private boolean d(final JsonObject \u2603) {
                return ni.a(\u2603, "uvlock", false);
            }
            
            protected bor a(final JsonObject \u2603) {
                final int a = ni.a(\u2603, "x", 0);
                final int a2 = ni.a(\u2603, "y", 0);
                final bor a3 = bor.a(a, a2);
                if (a3 == null) {
                    throw new JsonParseException("Invalid BlockModelRotation x: " + a + ", y: " + a2);
                }
                return a3;
            }
            
            protected String b(final JsonObject \u2603) {
                return ni.h(\u2603, "model");
            }
            
            protected int c(final JsonObject \u2603) {
                return ni.a(\u2603, "weight", 1);
            }
        }
    }
    
    public static class a implements JsonDeserializer<bgm>
    {
        public bgm a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final List<d> a = this.a(\u2603, asJsonObject);
            return new bgm(a);
        }
        
        protected List<d> a(final JsonDeserializationContext \u2603, final JsonObject \u2603) {
            final JsonObject s = ni.s(\u2603, "variants");
            final List<d> arrayList = (List<d>)Lists.newArrayList();
            for (final Map.Entry<String, JsonElement> \u26032 : s.entrySet()) {
                arrayList.add(this.a(\u2603, \u26032));
            }
            return arrayList;
        }
        
        protected d a(final JsonDeserializationContext \u2603, final Map.Entry<String, JsonElement> \u2603) {
            final String \u26032 = \u2603.getKey();
            final List<c> arrayList = (List<c>)Lists.newArrayList();
            final JsonElement jsonElement = \u2603.getValue();
            if (jsonElement.isJsonArray()) {
                for (final JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                    arrayList.add(\u2603.deserialize(jsonElement2, c.class));
                }
            }
            else {
                arrayList.add(\u2603.deserialize(jsonElement, c.class));
            }
            return new d(\u26032, arrayList);
        }
    }
    
    public class b extends RuntimeException
    {
        protected b() {
        }
    }
}
