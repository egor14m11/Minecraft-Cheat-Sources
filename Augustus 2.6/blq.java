import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStream;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import com.google.gson.JsonParser;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class blq
{
    private static final Logger a;
    private static final blp b;
    private static blq c;
    private static int d;
    private static boolean e;
    private final Map<String, Object> f;
    private final List<String> g;
    private final List<Integer> h;
    private final List<blv> i;
    private final List<Integer> j;
    private final Map<String, blv> k;
    private final int l;
    private final String m;
    private final boolean n;
    private boolean o;
    private final blo p;
    private final List<Integer> q;
    private final List<String> r;
    private final blt s;
    private final blt t;
    
    public blq(final bni \u2603, final String \u2603) throws IOException {
        this.f = (Map<String, Object>)Maps.newHashMap();
        this.g = (List<String>)Lists.newArrayList();
        this.h = (List<Integer>)Lists.newArrayList();
        this.i = (List<blv>)Lists.newArrayList();
        this.j = (List<Integer>)Lists.newArrayList();
        this.k = (Map<String, blv>)Maps.newHashMap();
        final JsonParser jsonParser = new JsonParser();
        final jy jy = new jy("shaders/program/" + \u2603 + ".json");
        this.m = \u2603;
        InputStream b = null;
        try {
            b = \u2603.a(jy).b();
            final JsonObject asJsonObject = jsonParser.parse(IOUtils.toString(b, Charsets.UTF_8)).getAsJsonObject();
            final String h = ni.h(asJsonObject, "vertex");
            final String h2 = ni.h(asJsonObject, "fragment");
            final JsonArray a = ni.a(asJsonObject, "samplers", (JsonArray)null);
            if (a != null) {
                int i = 0;
                for (final JsonElement \u26032 : a) {
                    try {
                        this.a(\u26032);
                    }
                    catch (Exception \u26033) {
                        final kc a2 = kc.a(\u26033);
                        a2.a("samplers[" + i + "]");
                        throw a2;
                    }
                    ++i;
                }
            }
            final JsonArray a3 = ni.a(asJsonObject, "attributes", (JsonArray)null);
            if (a3 != null) {
                int j = 0;
                this.q = (List<Integer>)Lists.newArrayListWithCapacity(a3.size());
                this.r = (List<String>)Lists.newArrayListWithCapacity(a3.size());
                for (final JsonElement \u26034 : a3) {
                    try {
                        this.r.add(ni.a(\u26034, "attribute"));
                    }
                    catch (Exception \u26035) {
                        final kc a4 = kc.a(\u26035);
                        a4.a("attributes[" + j + "]");
                        throw a4;
                    }
                    ++j;
                }
            }
            else {
                this.q = null;
                this.r = null;
            }
            final JsonArray a5 = ni.a(asJsonObject, "uniforms", (JsonArray)null);
            if (a5 != null) {
                int k = 0;
                for (final JsonElement \u26036 : a5) {
                    try {
                        this.b(\u26036);
                    }
                    catch (Exception \u26037) {
                        final kc a6 = kc.a(\u26037);
                        a6.a("uniforms[" + k + "]");
                        throw a6;
                    }
                    ++k;
                }
            }
            this.p = blo.a(ni.a(asJsonObject, "blend", (JsonObject)null));
            this.n = ni.a(asJsonObject, "cull", true);
            this.s = blt.a(\u2603, blt.a.a, h);
            this.t = blt.a(\u2603, blt.a.b, h2);
            this.l = blu.b().c();
            blu.b().b(this);
            this.i();
            if (this.r != null) {
                for (final String \u26038 : this.r) {
                    final int b2 = bqs.b(this.l, \u26038);
                    this.q.add(b2);
                }
            }
        }
        catch (Exception \u26039) {
            final kc a7 = kc.a(\u26039);
            a7.b(jy.a());
            throw a7;
        }
        finally {
            IOUtils.closeQuietly(b);
        }
        this.d();
    }
    
    public void a() {
        blu.b().a(this);
    }
    
    public void b() {
        bqs.d(0);
        blq.d = -1;
        blq.c = null;
        blq.e = true;
        for (int i = 0; i < this.h.size(); ++i) {
            if (this.f.get(this.g.get(i)) != null) {
                bfl.g(bqs.q + i);
                bfl.i(0);
            }
        }
    }
    
    public void c() {
        this.o = false;
        blq.c = this;
        this.p.a();
        if (this.l != blq.d) {
            bqs.d(this.l);
            blq.d = this.l;
        }
        if (this.n) {
            bfl.o();
        }
        else {
            bfl.p();
        }
        for (int i = 0; i < this.h.size(); ++i) {
            if (this.f.get(this.g.get(i)) != null) {
                bfl.g(bqs.q + i);
                bfl.w();
                final Object value = this.f.get(this.g.get(i));
                int \u2603 = -1;
                if (value instanceof bfw) {
                    \u2603 = ((bfw)value).g;
                }
                else if (value instanceof bmk) {
                    \u2603 = ((bmk)value).b();
                }
                else if (value instanceof Integer) {
                    \u2603 = (int)value;
                }
                if (\u2603 != -1) {
                    bfl.i(\u2603);
                    bqs.f(bqs.a(this.l, this.g.get(i)), i);
                }
            }
        }
        for (final blv blv : this.i) {
            blv.b();
        }
    }
    
    public void d() {
        this.o = true;
    }
    
    public blv a(final String \u2603) {
        if (this.k.containsKey(\u2603)) {
            return this.k.get(\u2603);
        }
        return null;
    }
    
    public blv b(final String \u2603) {
        if (this.k.containsKey(\u2603)) {
            return this.k.get(\u2603);
        }
        return blq.b;
    }
    
    private void i() {
        for (int i = 0, n = 0; i < this.g.size(); ++i, ++n) {
            final String a = this.g.get(i);
            final int \u2603 = bqs.a(this.l, a);
            if (\u2603 == -1) {
                blq.a.warn("Shader " + this.m + "could not find sampler named " + a + " in the specified shader program.");
                this.f.remove(a);
                this.g.remove(n);
                --n;
            }
            else {
                this.h.add(\u2603);
            }
        }
        for (final blv blv : this.i) {
            final String a = blv.a();
            final int \u2603 = bqs.a(this.l, a);
            if (\u2603 == -1) {
                blq.a.warn("Could not find uniform named " + a + " in the specified" + " shader program.");
            }
            else {
                this.j.add(\u2603);
                blv.b(\u2603);
                this.k.put(a, blv);
            }
        }
    }
    
    private void a(final JsonElement \u2603) throws kc {
        final JsonObject l = ni.l(\u2603, "sampler");
        final String h = ni.h(l, "name");
        if (!ni.a(l, "file")) {
            this.f.put(h, null);
            this.g.add(h);
            return;
        }
        this.g.add(h);
    }
    
    public void a(final String \u2603, final Object \u2603) {
        if (this.f.containsKey(\u2603)) {
            this.f.remove(\u2603);
        }
        this.f.put(\u2603, \u2603);
        this.d();
    }
    
    private void b(final JsonElement \u2603) throws kc {
        final JsonObject l = ni.l(\u2603, "uniform");
        final String h = ni.h(l, "name");
        final int a = blv.a(ni.h(l, "type"));
        final int m = ni.m(l, "count");
        final float[] \u26032 = new float[Math.max(m, 16)];
        final JsonArray t = ni.t(l, "values");
        if (t.size() != m && t.size() > 1) {
            throw new kc("Invalid amount of values specified (expected " + m + ", found " + t.size() + ")");
        }
        int i = 0;
        for (final JsonElement \u26033 : t) {
            try {
                \u26032[i] = ni.d(\u26033, "value");
            }
            catch (Exception \u26034) {
                final kc a2 = kc.a(\u26034);
                a2.a("values[" + i + "]");
                throw a2;
            }
            ++i;
        }
        if (m > 1 && t.size() == 1) {
            while (i < m) {
                \u26032[i] = \u26032[0];
                ++i;
            }
        }
        final int n = (m > 1 && m <= 4 && a < 8) ? (m - 1) : 0;
        final blv blv = new blv(h, a + n, m, this);
        if (a <= 3) {
            blv.a((int)\u26032[0], (int)\u26032[1], (int)\u26032[2], (int)\u26032[3]);
        }
        else if (a <= 7) {
            blv.b(\u26032[0], \u26032[1], \u26032[2], \u26032[3]);
        }
        else {
            blv.a(\u26032);
        }
        this.i.add(blv);
    }
    
    public blt e() {
        return this.s;
    }
    
    public blt f() {
        return this.t;
    }
    
    public int h() {
        return this.l;
    }
    
    static {
        a = LogManager.getLogger();
        b = new blp();
        blq.c = null;
        blq.d = -1;
        blq.e = true;
    }
}
