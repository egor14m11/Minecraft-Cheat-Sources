import java.text.ParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.util.ArrayList;
import com.google.common.collect.Iterators;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.IOException;
import java.util.Iterator;
import java.io.BufferedReader;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParseException;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.io.Reader;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import java.util.List;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import com.mojang.authlib.Agent;
import com.mojang.authlib.ProfileLookupCallback;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.ParameterizedType;
import java.io.File;
import com.google.gson.Gson;
import net.minecraft.server.MinecraftServer;
import com.mojang.authlib.GameProfile;
import java.util.LinkedList;
import java.util.UUID;
import java.util.Map;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public class lt
{
    public static final SimpleDateFormat a;
    private final Map<String, a> c;
    private final Map<UUID, a> d;
    private final LinkedList<GameProfile> e;
    private final MinecraftServer f;
    protected final Gson b;
    private final File g;
    private static final ParameterizedType h;
    
    public lt(final MinecraftServer \u2603, final File \u2603) {
        this.c = (Map<String, a>)Maps.newHashMap();
        this.d = (Map<UUID, a>)Maps.newHashMap();
        this.e = Lists.newLinkedList();
        this.f = \u2603;
        this.g = \u2603;
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(a.class, new b());
        this.b = gsonBuilder.create();
        this.b();
    }
    
    private static GameProfile a(final MinecraftServer \u2603, final String \u2603) {
        final GameProfile[] array = { null };
        final ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback() {
            @Override
            public void onProfileLookupSucceeded(final GameProfile \u2603) {
                array[0] = \u2603;
            }
            
            @Override
            public void onProfileLookupFailed(final GameProfile \u2603, final Exception \u2603) {
                array[0] = null;
            }
        };
        \u2603.aE().findProfilesByNames(new String[] { \u2603 }, Agent.MINECRAFT, profileLookupCallback);
        if (!\u2603.af() && array[0] == null) {
            final UUID a = wn.a(new GameProfile(null, \u2603));
            final GameProfile gameProfile = new GameProfile(a, \u2603);
            profileLookupCallback.onProfileLookupSucceeded(gameProfile);
        }
        return array[0];
    }
    
    public void a(final GameProfile \u2603) {
        this.a(\u2603, null);
    }
    
    private void a(final GameProfile \u2603, Date \u2603) {
        final UUID id = \u2603.getId();
        if (\u2603 == null) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            instance.add(2, 1);
            \u2603 = instance.getTime();
        }
        final String lowerCase = \u2603.getName().toLowerCase(Locale.ROOT);
        final a a = new a(\u2603, \u2603);
        if (this.d.containsKey(id)) {
            final a a2 = this.d.get(id);
            this.c.remove(a2.a().getName().toLowerCase(Locale.ROOT));
            this.e.remove(\u2603);
        }
        this.c.put(\u2603.getName().toLowerCase(Locale.ROOT), a);
        this.d.put(id, a);
        this.e.addFirst(\u2603);
        this.c();
    }
    
    public GameProfile a(final String \u2603) {
        final String lowerCase = \u2603.toLowerCase(Locale.ROOT);
        a \u26032 = this.c.get(lowerCase);
        if (\u26032 != null && new Date().getTime() >= \u26032.c.getTime()) {
            this.d.remove(\u26032.a().getId());
            this.c.remove(\u26032.a().getName().toLowerCase(Locale.ROOT));
            this.e.remove(\u26032.a());
            \u26032 = null;
        }
        if (\u26032 != null) {
            final GameProfile \u26033 = \u26032.a();
            this.e.remove(\u26033);
            this.e.addFirst(\u26033);
        }
        else {
            final GameProfile \u26033 = a(this.f, lowerCase);
            if (\u26033 != null) {
                this.a(\u26033);
                \u26032 = this.c.get(lowerCase);
            }
        }
        this.c();
        return (\u26032 == null) ? null : \u26032.a();
    }
    
    public String[] a() {
        final List<String> arrayList = (List<String>)Lists.newArrayList((Iterable<?>)this.c.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }
    
    public GameProfile a(final UUID \u2603) {
        final a a = this.d.get(\u2603);
        return (a == null) ? null : a.a();
    }
    
    private a b(final UUID \u2603) {
        final a a = this.d.get(\u2603);
        if (a != null) {
            final GameProfile a2 = a.a();
            this.e.remove(a2);
            this.e.addFirst(a2);
        }
        return a;
    }
    
    public void b() {
        BufferedReader reader = null;
        try {
            reader = Files.newReader(this.g, Charsets.UTF_8);
            final List<a> list = this.b.fromJson(reader, lt.h);
            this.c.clear();
            this.d.clear();
            this.e.clear();
            for (final a a : Lists.reverse(list)) {
                if (a != null) {
                    this.a(a.a(), a.b());
                }
            }
        }
        catch (FileNotFoundException ex) {}
        catch (JsonParseException ex2) {}
        finally {
            IOUtils.closeQuietly(reader);
        }
    }
    
    public void c() {
        final String json = this.b.toJson(this.a(1000));
        BufferedWriter writer = null;
        try {
            writer = Files.newWriter(this.g, Charsets.UTF_8);
            writer.write(json);
        }
        catch (FileNotFoundException ex) {}
        catch (IOException ex2) {}
        finally {
            IOUtils.closeQuietly(writer);
        }
    }
    
    private List<a> a(final int \u2603) {
        final ArrayList<a> arrayList = Lists.newArrayList();
        final List<GameProfile> arrayList2 = (List<GameProfile>)Lists.newArrayList((Iterator<?>)Iterators.limit(this.e.iterator(), \u2603));
        for (final GameProfile gameProfile : arrayList2) {
            final a b = this.b(gameProfile.getId());
            if (b == null) {
                continue;
            }
            arrayList.add(b);
        }
        return arrayList;
    }
    
    static {
        a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        h = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[] { a.class };
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
    
    class b implements JsonDeserializer<a>, JsonSerializer<a>
    {
        private b() {
        }
        
        public JsonElement a(final a \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("name", \u2603.a().getName());
            final UUID id = \u2603.a().getId();
            jsonObject.addProperty("uuid", (id == null) ? "" : id.toString());
            jsonObject.addProperty("expiresOn", lt.a.format(\u2603.b()));
            return jsonObject;
        }
        
        public a a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            if (!\u2603.isJsonObject()) {
                return null;
            }
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final JsonElement value = asJsonObject.get("name");
            final JsonElement value2 = asJsonObject.get("uuid");
            final JsonElement value3 = asJsonObject.get("expiresOn");
            if (value == null || value2 == null) {
                return null;
            }
            final String asString = value2.getAsString();
            final String asString2 = value.getAsString();
            Date parse = null;
            if (value3 != null) {
                try {
                    parse = lt.a.parse(value3.getAsString());
                }
                catch (ParseException ex) {
                    parse = null;
                }
            }
            if (asString2 == null || asString == null) {
                return null;
            }
            UUID fromString;
            try {
                fromString = UUID.fromString(asString);
            }
            catch (Throwable t) {
                return null;
            }
            final a a = new a(new GameProfile(fromString, asString2), parse);
            return a;
        }
    }
    
    class a
    {
        private final GameProfile b;
        private final Date c;
        
        private a(final GameProfile \u2603, final Date \u2603) {
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public GameProfile a() {
            return this.b;
        }
        
        public Date b() {
            return this.c;
        }
    }
}
