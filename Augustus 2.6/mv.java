import org.apache.logging.log4j.LogManager;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import com.google.gson.JsonParser;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.Sets;
import java.util.Set;
import java.io.File;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class mv extends nb
{
    private static final Logger b;
    private final MinecraftServer c;
    private final File d;
    private final Set<mw> e;
    private int f;
    private boolean g;
    
    public mv(final MinecraftServer \u2603, final File \u2603) {
        this.e = (Set<mw>)Sets.newHashSet();
        this.f = -300;
        this.g = false;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public void a() {
        if (this.d.isFile()) {
            try {
                this.a.clear();
                this.a.putAll(this.a(FileUtils.readFileToString(this.d)));
            }
            catch (IOException throwable) {
                mv.b.error("Couldn't read statistics file " + this.d, throwable);
            }
            catch (JsonParseException throwable2) {
                mv.b.error("Couldn't parse statistics file " + this.d, throwable2);
            }
        }
    }
    
    public void b() {
        try {
            FileUtils.writeStringToFile(this.d, a(this.a));
        }
        catch (IOException throwable) {
            mv.b.error("Couldn't save stats", throwable);
        }
    }
    
    @Override
    public void a(final wn \u2603, final mw \u2603, final int \u2603) {
        final int n = \u2603.d() ? this.a(\u2603) : 0;
        super.a(\u2603, \u2603, \u2603);
        this.e.add(\u2603);
        if (\u2603.d() && n == 0 && \u2603 > 0) {
            this.g = true;
            if (this.c.aB()) {
                this.c.ap().a(new fb("chat.type.achievement", new Object[] { \u2603.f_(), \u2603.j() }));
            }
        }
        if (\u2603.d() && n > 0 && \u2603 == 0) {
            this.g = true;
            if (this.c.aB()) {
                this.c.ap().a(new fb("chat.type.achievement.taken", new Object[] { \u2603.f_(), \u2603.j() }));
            }
        }
    }
    
    public Set<mw> c() {
        final Set<mw> hashSet = (Set<mw>)Sets.newHashSet((Iterable<?>)this.e);
        this.e.clear();
        this.g = false;
        return hashSet;
    }
    
    public Map<mw, my> a(final String \u2603) {
        final JsonElement parse = new JsonParser().parse(\u2603);
        if (!parse.isJsonObject()) {
            return (Map<mw, my>)Maps.newHashMap();
        }
        final JsonObject asJsonObject = parse.getAsJsonObject();
        final Map<mw, my> hashMap = (Map<mw, my>)Maps.newHashMap();
        for (final Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            final mw a = na.a(entry.getKey());
            if (a != null) {
                final my my = new my();
                if (entry.getValue().isJsonPrimitive() && entry.getValue().getAsJsonPrimitive().isNumber()) {
                    my.a(entry.getValue().getAsInt());
                }
                else if (entry.getValue().isJsonObject()) {
                    final JsonObject asJsonObject2 = entry.getValue().getAsJsonObject();
                    if (asJsonObject2.has("value") && asJsonObject2.get("value").isJsonPrimitive() && asJsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        my.a(asJsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (asJsonObject2.has("progress") && a.l() != null) {
                        try {
                            final Constructor<? extends mz> constructor = a.l().getConstructor((Class<?>[])new Class[0]);
                            final mz \u26032 = (mz)constructor.newInstance(new Object[0]);
                            \u26032.a(asJsonObject2.get("progress"));
                            my.a(\u26032);
                        }
                        catch (Throwable throwable) {
                            mv.b.warn("Invalid statistic progress in " + this.d, throwable);
                        }
                    }
                }
                hashMap.put(a, my);
            }
            else {
                mv.b.warn("Invalid statistic in " + this.d + ": Don't know what " + entry.getKey() + " is");
            }
        }
        return hashMap;
    }
    
    public static String a(final Map<mw, my> \u2603) {
        final JsonObject jsonObject = new JsonObject();
        for (final Map.Entry<mw, my> entry : \u2603.entrySet()) {
            if (entry.getValue().b() != null) {
                final JsonObject value = new JsonObject();
                value.addProperty("value", entry.getValue().a());
                try {
                    value.add("progress", entry.getValue().b().a());
                }
                catch (Throwable throwable) {
                    mv.b.warn("Couldn't save statistic " + entry.getKey().e() + ": error serializing progress", throwable);
                }
                jsonObject.add(entry.getKey().e, value);
            }
            else {
                jsonObject.addProperty(entry.getKey().e, entry.getValue().a());
            }
        }
        return jsonObject.toString();
    }
    
    public void d() {
        for (final mw mw : this.a.keySet()) {
            this.e.add(mw);
        }
    }
    
    public void a(final lf \u2603) {
        final int at = this.c.at();
        final Map<mw, Integer> hashMap = (Map<mw, Integer>)Maps.newHashMap();
        if (this.g || at - this.f > 300) {
            this.f = at;
            for (final mw \u26032 : this.c()) {
                hashMap.put(\u26032, this.a(\u26032));
            }
        }
        \u2603.a.a(new fr(hashMap));
    }
    
    public void b(final lf \u2603) {
        final Map<mw, Integer> hashMap = (Map<mw, Integer>)Maps.newHashMap();
        for (final mq mq : mr.e) {
            if (this.a(mq)) {
                hashMap.put(mq, this.a((mw)mq));
                this.e.remove(mq);
            }
        }
        \u2603.a.a(new fr(hashMap));
    }
    
    public boolean e() {
        return this.g;
    }
    
    static {
        b = LogManager.getLogger();
    }
}
