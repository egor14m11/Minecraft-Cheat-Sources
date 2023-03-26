import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.StringUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Collections;
import java.io.StringReader;
import java.io.Reader;
import java.util.Map;
import java.util.List;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgl
{
    private static final Logger f;
    static final Gson a;
    private final List<bgh> g;
    private final boolean h;
    private final boolean i;
    private bgr j;
    public String b;
    protected final Map<String, String> c;
    protected bgl d;
    protected jy e;
    
    public static bgl a(final Reader \u2603) {
        return bgl.a.fromJson(\u2603, bgl.class);
    }
    
    public static bgl a(final String \u2603) {
        return a(new StringReader(\u2603));
    }
    
    protected bgl(final List<bgh> \u2603, final Map<String, String> \u2603, final boolean \u2603, final boolean \u2603, final bgr \u2603) {
        this(null, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    protected bgl(final jy \u2603, final Map<String, String> \u2603, final boolean \u2603, final boolean \u2603, final bgr \u2603) {
        this(\u2603, Collections.emptyList(), \u2603, \u2603, \u2603, \u2603);
    }
    
    private bgl(final jy \u2603, final List<bgh> \u2603, final Map<String, String> \u2603, final boolean \u2603, final boolean \u2603, final bgr \u2603) {
        this.b = "";
        this.g = \u2603;
        this.i = \u2603;
        this.h = \u2603;
        this.c = \u2603;
        this.e = \u2603;
        this.j = \u2603;
    }
    
    public List<bgh> a() {
        if (this.h()) {
            return this.d.a();
        }
        return this.g;
    }
    
    private boolean h() {
        return this.d != null;
    }
    
    public boolean b() {
        if (this.h()) {
            return this.d.b();
        }
        return this.i;
    }
    
    public boolean c() {
        return this.h;
    }
    
    public boolean d() {
        return this.e == null || (this.d != null && this.d.d());
    }
    
    public void a(final Map<jy, bgl> \u2603) {
        if (this.e != null) {
            this.d = \u2603.get(this.e);
        }
    }
    
    public boolean b(final String \u2603) {
        return !"missingno".equals(this.c(\u2603));
    }
    
    public String c(String \u2603) {
        if (!this.d(\u2603)) {
            \u2603 = '#' + \u2603;
        }
        return this.a(\u2603, new a(this));
    }
    
    private String a(final String \u2603, final a \u2603) {
        if (!this.d(\u2603)) {
            return \u2603;
        }
        if (this == \u2603.b) {
            bgl.f.warn("Unable to resolve texture due to upward reference: " + \u2603 + " in " + this.b);
            return "missingno";
        }
        String \u26032 = this.c.get(\u2603.substring(1));
        if (\u26032 == null && this.h()) {
            \u26032 = this.d.a(\u2603, \u2603);
        }
        \u2603.b = this;
        if (\u26032 != null && this.d(\u26032)) {
            \u26032 = \u2603.a.a(\u26032, \u2603);
        }
        if (\u26032 == null || this.d(\u26032)) {
            return "missingno";
        }
        return \u26032;
    }
    
    private boolean d(final String \u2603) {
        return \u2603.charAt(0) == '#';
    }
    
    public jy e() {
        return this.e;
    }
    
    public bgl f() {
        return this.h() ? this.d.f() : this;
    }
    
    public bgr g() {
        final bgq a = this.a(bgr.b.b);
        final bgq a2 = this.a(bgr.b.c);
        final bgq a3 = this.a(bgr.b.d);
        final bgq a4 = this.a(bgr.b.e);
        final bgq a5 = this.a(bgr.b.f);
        final bgq a6 = this.a(bgr.b.g);
        return new bgr(a, a2, a3, a4, a5, a6);
    }
    
    private bgq a(final bgr.b \u2603) {
        if (this.d != null && !this.j.c(\u2603)) {
            return this.d.a(\u2603);
        }
        return this.j.b(\u2603);
    }
    
    public static void b(final Map<jy, bgl> \u2603) {
        for (final bgl bgl : \u2603.values()) {
            try {
                for (bgl bgl2 = bgl.d, bgl3 = bgl2.d; bgl2 != bgl3; bgl2 = bgl2.d, bgl3 = bgl3.d.d) {}
                throw new c();
            }
            catch (NullPointerException ex) {
                continue;
            }
            break;
        }
    }
    
    static {
        f = LogManager.getLogger();
        a = new GsonBuilder().registerTypeAdapter(bgl.class, new b()).registerTypeAdapter(bgh.class, new bgh.a()).registerTypeAdapter(bgi.class, new bgi.a()).registerTypeAdapter(bgk.class, new bgk.a()).registerTypeAdapter(bgq.class, new bgq.a()).registerTypeAdapter(bgr.class, new bgr.a()).create();
    }
    
    static final class a
    {
        public final bgl a;
        public bgl b;
        
        private a(final bgl \u2603) {
            this.a = \u2603;
        }
    }
    
    public static class b implements JsonDeserializer<bgl>
    {
        public bgl a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            final List<bgh> a = this.a(\u2603, asJsonObject);
            final String c = this.c(asJsonObject);
            final boolean empty = StringUtils.isEmpty(c);
            final boolean empty2 = a.isEmpty();
            if (empty2 && empty) {
                throw new JsonParseException("BlockModel requires either elements or parent, found neither");
            }
            if (!empty && !empty2) {
                throw new JsonParseException("BlockModel requires either elements or parent, found both");
            }
            final Map<String, String> b = this.b(asJsonObject);
            final boolean a2 = this.a(asJsonObject);
            bgr a3 = bgr.a;
            if (asJsonObject.has("display")) {
                final JsonObject s = ni.s(asJsonObject, "display");
                a3 = \u2603.deserialize(s, bgr.class);
            }
            if (empty2) {
                return new bgl(new jy(c), b, a2, true, a3);
            }
            return new bgl(a, b, a2, true, a3);
        }
        
        private Map<String, String> b(final JsonObject \u2603) {
            final Map<String, String> hashMap = (Map<String, String>)Maps.newHashMap();
            if (\u2603.has("textures")) {
                final JsonObject asJsonObject = \u2603.getAsJsonObject("textures");
                for (final Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue().getAsString());
                }
            }
            return hashMap;
        }
        
        private String c(final JsonObject \u2603) {
            return ni.a(\u2603, "parent", "");
        }
        
        protected boolean a(final JsonObject \u2603) {
            return ni.a(\u2603, "ambientocclusion", true);
        }
        
        protected List<bgh> a(final JsonDeserializationContext \u2603, final JsonObject \u2603) {
            final List<bgh> arrayList = (List<bgh>)Lists.newArrayList();
            if (\u2603.has("elements")) {
                for (final JsonElement jsonElement : ni.t(\u2603, "elements")) {
                    arrayList.add(\u2603.deserialize(jsonElement, bgh.class));
                }
            }
            return arrayList;
        }
    }
    
    public static class c extends RuntimeException
    {
    }
}
