import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import org.apache.commons.io.IOUtils;
import java.lang.reflect.Type;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpz implements bnj, km
{
    private static final Logger b;
    private static final Gson c;
    private static final ParameterizedType d;
    public static final bpw a;
    private final bqa e;
    private final bpx f;
    private final bni g;
    
    public bpz(final bni \u2603, final avh \u2603) {
        this.e = new bqa();
        this.g = \u2603;
        this.f = new bpx(this, \u2603);
    }
    
    @Override
    public void a(final bni \u2603) {
        this.f.a();
        this.e.a();
        for (final String s : \u2603.a()) {
            try {
                final List<bnh> b = \u2603.b(new jy(s, "sounds.json"));
                for (final bnh bnh : b) {
                    try {
                        final Map<String, bph> a = this.a(bnh.b());
                        for (final Map.Entry<String, bph> entry : a.entrySet()) {
                            this.a(new jy(s, entry.getKey()), entry.getValue());
                        }
                    }
                    catch (RuntimeException throwable) {
                        bpz.b.warn("Invalid sounds.json", throwable);
                    }
                }
            }
            catch (IOException ex) {}
        }
    }
    
    protected Map<String, bph> a(final InputStream \u2603) {
        try {
            return bpz.c.fromJson(new InputStreamReader(\u2603), bpz.d);
        }
        finally {
            IOUtils.closeQuietly(\u2603);
        }
    }
    
    private void a(final jy \u2603, final bph \u2603) {
        final boolean b = !((dd<jy, V>)this.e).d(\u2603);
        bpy \u26032;
        if (b || \u2603.b()) {
            if (!b) {
                bpz.b.debug("Replaced sound event location {}", new Object[] { \u2603 });
            }
            \u26032 = new bpy(\u2603, 1.0, 1.0, \u2603.c());
            this.e.a(\u26032);
        }
        else {
            \u26032 = this.e.a(\u2603);
        }
        for (final bph.a a : \u2603.a()) {
            final String a2 = a.a();
            final jy jy = new jy(a2);
            final String \u26033 = a2.contains(":") ? jy.b() : \u2603.b();
            bqb<bpw> \u26034 = null;
            switch (bpz$3.a[a.e().ordinal()]) {
                case 1: {
                    final jy jy2 = new jy(\u26033, "sounds/" + jy.a() + ".ogg");
                    InputStream b2 = null;
                    try {
                        b2 = this.g.a(jy2).b();
                    }
                    catch (FileNotFoundException ex) {
                        bpz.b.warn("File {} does not exist, cannot add it to event {}", new Object[] { jy2, \u2603 });
                    }
                    catch (IOException throwable) {
                        bpz.b.warn("Could not load sound file " + jy2 + ", cannot add it to event " + \u2603, throwable);
                    }
                    finally {
                        IOUtils.closeQuietly(b2);
                    }
                    \u26034 = new bqc(new bpw(jy2, a.c(), a.b(), a.f()), a.d());
                    break;
                }
                case 2: {
                    \u26034 = new bqb<bpw>() {
                        final jy a = new jy(\u26033, a.a());
                        
                        @Override
                        public int a() {
                            final bpy bpy = bpz.this.e.a(this.a);
                            return (bpy == null) ? 0 : bpy.a();
                        }
                        
                        public bpw b() {
                            final bpy bpy = bpz.this.e.a(this.a);
                            return (bpy == null) ? bpz.a : bpy.b();
                        }
                    };
                    break;
                }
                default: {
                    throw new IllegalStateException("IN YOU FACE");
                }
            }
            \u26032.a(\u26034);
        }
    }
    
    public bpy a(final jy \u2603) {
        return this.e.a(\u2603);
    }
    
    public void a(final bpj \u2603) {
        this.f.c(\u2603);
    }
    
    public void a(final bpj \u2603, final int \u2603) {
        this.f.a(\u2603, \u2603);
    }
    
    public void a(final wn \u2603, final float \u2603) {
        this.f.a(\u2603, \u2603);
    }
    
    public void a() {
        this.f.e();
    }
    
    public void b() {
        this.f.c();
    }
    
    public void d() {
        this.f.b();
    }
    
    @Override
    public void c() {
        this.f.d();
    }
    
    public void e() {
        this.f.f();
    }
    
    public void a(final bpg \u2603, final float \u2603) {
        if (\u2603 == bpg.a && \u2603 <= 0.0f) {
            this.b();
        }
        this.f.a(\u2603, \u2603);
    }
    
    public void b(final bpj \u2603) {
        this.f.b(\u2603);
    }
    
    public bpy a(final bpg... \u2603) {
        final List<bpy> arrayList = (List<bpy>)Lists.newArrayList();
        for (final jy \u26032 : ((dd<jy, V>)this.e).c()) {
            final bpy bpy = this.e.a(\u26032);
            if (ArrayUtils.contains(\u2603, bpy.d())) {
                arrayList.add(bpy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(new Random().nextInt(arrayList.size()));
    }
    
    public boolean c(final bpj \u2603) {
        return this.f.a(\u2603);
    }
    
    static {
        b = LogManager.getLogger();
        c = new GsonBuilder().registerTypeAdapter(bph.class, new bpi()).create();
        d = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[] { String.class, bph.class };
            }
            
            @Override
            public Type getRawType() {
                return Map.class;
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
        };
        a = new bpw(new jy("meta:missing_sound"), 0.0, 0.0, false);
    }
}
