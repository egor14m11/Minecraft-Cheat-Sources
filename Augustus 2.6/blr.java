import org.lwjgl.opengl.GL11;
import java.io.FileNotFoundException;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.InputStream;
import com.google.gson.JsonElement;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import org.lwjgl.util.vector.Matrix4f;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class blr
{
    private bfw a;
    private bni b;
    private String c;
    private final List<bls> d;
    private final Map<String, bfw> e;
    private final List<bfw> f;
    private Matrix4f g;
    private int h;
    private int i;
    private float j;
    private float k;
    
    public blr(final bmj \u2603, final bni \u2603, final bfw \u2603, final jy \u2603) throws IOException, JsonSyntaxException {
        this.d = (List<bls>)Lists.newArrayList();
        this.e = (Map<String, bfw>)Maps.newHashMap();
        this.f = (List<bfw>)Lists.newArrayList();
        this.b = \u2603;
        this.a = \u2603;
        this.j = 0.0f;
        this.k = 0.0f;
        this.h = \u2603.c;
        this.i = \u2603.d;
        this.c = \u2603.toString();
        this.c();
        this.a(\u2603, \u2603);
    }
    
    public void a(final bmj \u2603, final jy \u2603) throws IOException, JsonSyntaxException {
        final JsonParser jsonParser = new JsonParser();
        InputStream b = null;
        try {
            final bnh a = this.b.a(\u2603);
            b = a.b();
            final JsonObject asJsonObject = jsonParser.parse(IOUtils.toString(b, Charsets.UTF_8)).getAsJsonObject();
            if (ni.d(asJsonObject, "targets")) {
                final JsonArray jsonArray = asJsonObject.getAsJsonArray("targets");
                int n = 0;
                for (final JsonElement jsonElement : jsonArray) {
                    try {
                        this.a(jsonElement);
                    }
                    catch (Exception ex) {
                        final kc kc = kc.a(ex);
                        kc.a("targets[" + n + "]");
                        throw kc;
                    }
                    ++n;
                }
            }
            if (ni.d(asJsonObject, "passes")) {
                final JsonArray jsonArray = asJsonObject.getAsJsonArray("passes");
                int n = 0;
                for (final JsonElement jsonElement : jsonArray) {
                    try {
                        this.a(\u2603, jsonElement);
                    }
                    catch (Exception ex) {
                        final kc kc = kc.a(ex);
                        kc.a("passes[" + n + "]");
                        throw kc;
                    }
                    ++n;
                }
            }
        }
        catch (Exception \u26032) {
            final kc a2 = kc.a(\u26032);
            a2.b(\u2603.a());
            throw a2;
        }
        finally {
            IOUtils.closeQuietly(b);
        }
    }
    
    private void a(final JsonElement \u2603) throws kc {
        if (ni.a(\u2603)) {
            this.a(\u2603.getAsString(), this.h, this.i);
        }
        else {
            final JsonObject l = ni.l(\u2603, "target");
            final String h = ni.h(l, "name");
            final int a = ni.a(l, "width", this.h);
            final int a2 = ni.a(l, "height", this.i);
            if (this.e.containsKey(h)) {
                throw new kc(h + " is already defined");
            }
            this.a(h, a, a2);
        }
    }
    
    private void a(final bmj \u2603, final JsonElement \u2603) throws IOException {
        final JsonObject l = ni.l(\u2603, "pass");
        final String h = ni.h(l, "name");
        final String h2 = ni.h(l, "intarget");
        final String h3 = ni.h(l, "outtarget");
        final bfw b = this.b(h2);
        final bfw b2 = this.b(h3);
        if (b == null) {
            throw new kc("Input target '" + h2 + "' does not exist");
        }
        if (b2 == null) {
            throw new kc("Output target '" + h3 + "' does not exist");
        }
        final bls a = this.a(h, b, b2);
        final JsonArray a2 = ni.a(l, "auxtargets", (JsonArray)null);
        if (a2 != null) {
            int i = 0;
            for (final JsonElement \u26032 : a2) {
                try {
                    final JsonObject j = ni.l(\u26032, "auxtarget");
                    final String h4 = ni.h(j, "name");
                    final String h5 = ni.h(j, "id");
                    final bfw b3 = this.b(h5);
                    if (b3 == null) {
                        final jy jy = new jy("textures/effect/" + h5 + ".png");
                        try {
                            this.b.a(jy);
                        }
                        catch (FileNotFoundException ex) {
                            throw new kc("Render target or texture '" + h5 + "' does not exist");
                        }
                        \u2603.a(jy);
                        final bmk b4 = \u2603.b(jy);
                        final int m = ni.m(j, "width");
                        final int k = ni.m(j, "height");
                        final boolean i2 = ni.i(j, "bilinear");
                        if (i2) {
                            GL11.glTexParameteri(3553, 10241, 9729);
                            GL11.glTexParameteri(3553, 10240, 9729);
                        }
                        else {
                            GL11.glTexParameteri(3553, 10241, 9728);
                            GL11.glTexParameteri(3553, 10240, 9728);
                        }
                        a.a(h4, b4.b(), m, k);
                    }
                    else {
                        a.a(h4, b3, b3.a, b3.b);
                    }
                }
                catch (Exception \u26033) {
                    final kc a3 = kc.a(\u26033);
                    a3.a("auxtargets[" + i + "]");
                    throw a3;
                }
                ++i;
            }
        }
        final JsonArray a4 = ni.a(l, "uniforms", (JsonArray)null);
        if (a4 != null) {
            int i3 = 0;
            for (final JsonElement \u26034 : a4) {
                try {
                    this.b(\u26034);
                }
                catch (Exception \u26035) {
                    final kc a5 = kc.a(\u26035);
                    a5.a("uniforms[" + i3 + "]");
                    throw a5;
                }
                ++i3;
            }
        }
    }
    
    private void b(final JsonElement \u2603) throws kc {
        final JsonObject l = ni.l(\u2603, "uniform");
        final String h = ni.h(l, "name");
        final blv a = this.d.get(this.d.size() - 1).c().a(h);
        if (a == null) {
            throw new kc("Uniform '" + h + "' does not exist");
        }
        final float[] array = new float[4];
        int i = 0;
        final JsonArray t = ni.t(l, "values");
        for (final JsonElement \u26032 : t) {
            try {
                array[i] = ni.d(\u26032, "value");
            }
            catch (Exception \u26033) {
                final kc a2 = kc.a(\u26033);
                a2.a("values[" + i + "]");
                throw a2;
            }
            ++i;
        }
        switch (i) {
            case 1: {
                a.a(array[0]);
                break;
            }
            case 2: {
                a.a(array[0], array[1]);
                break;
            }
            case 3: {
                a.a(array[0], array[1], array[2]);
                break;
            }
            case 4: {
                a.a(array[0], array[1], array[2], array[3]);
                break;
            }
        }
    }
    
    public bfw a(final String \u2603) {
        return this.e.get(\u2603);
    }
    
    public void a(final String \u2603, final int \u2603, final int \u2603) {
        final bfw bfw = new bfw(\u2603, \u2603, true);
        bfw.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.e.put(\u2603, bfw);
        if (\u2603 == this.h && \u2603 == this.i) {
            this.f.add(bfw);
        }
    }
    
    public void a() {
        for (final bfw bfw : this.e.values()) {
            bfw.a();
        }
        for (final bls bls : this.d) {
            bls.b();
        }
        this.d.clear();
    }
    
    public bls a(final String \u2603, final bfw \u2603, final bfw \u2603) throws IOException {
        final bls bls = new bls(this.b, \u2603, \u2603, \u2603);
        this.d.add(this.d.size(), bls);
        return bls;
    }
    
    private void c() {
        (this.g = new Matrix4f()).setIdentity();
        this.g.m00 = 2.0f / this.a.a;
        this.g.m11 = 2.0f / -this.a.b;
        this.g.m22 = -0.0020001999f;
        this.g.m33 = 1.0f;
        this.g.m03 = -1.0f;
        this.g.m13 = 1.0f;
        this.g.m23 = -1.0001999f;
    }
    
    public void a(final int \u2603, final int \u2603) {
        this.h = this.a.a;
        this.i = this.a.b;
        this.c();
        for (final bls bls : this.d) {
            bls.a(this.g);
        }
        for (final bfw bfw : this.f) {
            bfw.a(\u2603, \u2603);
        }
    }
    
    public void a(final float \u2603) {
        if (\u2603 < this.k) {
            this.j += 1.0f - this.k;
            this.j += \u2603;
        }
        else {
            this.j += \u2603 - this.k;
        }
        this.k = \u2603;
        while (this.j > 20.0f) {
            this.j -= 20.0f;
        }
        for (final bls bls : this.d) {
            bls.a(this.j / 20.0f);
        }
    }
    
    public final String b() {
        return this.c;
    }
    
    private bfw b(final String \u2603) {
        if (\u2603 == null) {
            return null;
        }
        if (\u2603.equals("minecraft:main")) {
            return this.a;
        }
        return this.e.get(\u2603);
    }
}
