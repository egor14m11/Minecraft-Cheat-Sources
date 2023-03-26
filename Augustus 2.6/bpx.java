import paulscode.sound.Source;
import paulscode.sound.SoundSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.MarkerManager;
import java.net.MalformedURLException;
import java.io.InputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URL;
import java.util.Random;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Iterator;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;
import com.google.common.collect.Lists;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.List;
import com.google.common.collect.Multimap;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpx
{
    private static final Marker a;
    private static final Logger b;
    private final bpz c;
    private final avh d;
    private a e;
    private boolean f;
    private int g;
    private final Map<String, bpj> h;
    private final Map<bpj, String> i;
    private Map<bpj, bpw> j;
    private final Multimap<bpg, String> k;
    private final List<bpk> l;
    private final Map<bpj, Integer> m;
    private final Map<String, Integer> n;
    
    public bpx(final bpz \u2603, final avh \u2603) {
        this.g = 0;
        this.h = (Map<String, bpj>)HashBiMap.create();
        this.i = (Map<bpj, String>)((BiMap)this.h).inverse();
        this.j = (Map<bpj, bpw>)Maps.newHashMap();
        this.k = (Multimap<bpg, String>)HashMultimap.create();
        this.l = (List<bpk>)Lists.newArrayList();
        this.m = (Map<bpj, Integer>)Maps.newHashMap();
        this.n = (Map<String, Integer>)Maps.newHashMap();
        this.c = \u2603;
        this.d = \u2603;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
        }
        catch (SoundSystemException throwable) {
            bpx.b.error(bpx.a, "Error linking with the LibraryJavaSound plug-in", throwable);
        }
    }
    
    public void a() {
        this.b();
        this.i();
    }
    
    private synchronized void i() {
        if (this.f) {
            return;
        }
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SoundSystemConfig.setLogger(new SoundSystemLogger() {
                        @Override
                        public void message(final String \u2603, final int \u2603) {
                            if (!\u2603.isEmpty()) {
                                bpx.b.info(\u2603);
                            }
                        }
                        
                        @Override
                        public void importantMessage(final String \u2603, final int \u2603) {
                            if (!\u2603.isEmpty()) {
                                bpx.b.warn(\u2603);
                            }
                        }
                        
                        @Override
                        public void errorMessage(final String \u2603, final String \u2603, final int \u2603) {
                            if (!\u2603.isEmpty()) {
                                bpx.b.error("Error in class '" + \u2603 + "'");
                                bpx.b.error(\u2603);
                            }
                        }
                    });
                    bpx.this.e = new a();
                    bpx.this.f = true;
                    bpx.this.e.setMasterVolume(bpx.this.d.a(bpg.a));
                    bpx.b.info(bpx.a, "Sound engine started");
                }
            }, "Sound Library Loader").start();
        }
        catch (RuntimeException throwable) {
            bpx.b.error(bpx.a, "Error starting SoundSystem. Turning off sounds & music", throwable);
            this.d.a(bpg.a, 0.0f);
            this.d.b();
        }
    }
    
    private float a(final bpg \u2603) {
        if (\u2603 == null || \u2603 == bpg.a) {
            return 1.0f;
        }
        return this.d.a(\u2603);
    }
    
    public void a(final bpg \u2603, final float \u2603) {
        if (!this.f) {
            return;
        }
        if (\u2603 == bpg.a) {
            this.e.setMasterVolume(\u2603);
            return;
        }
        for (final String sourcename : this.k.get(\u2603)) {
            final bpj bpj = this.h.get(sourcename);
            final float a = this.a(bpj, this.j.get(bpj), \u2603);
            if (a <= 0.0f) {
                this.b(bpj);
            }
            else {
                this.e.setVolume(sourcename, a);
            }
        }
    }
    
    public void b() {
        if (this.f) {
            this.c();
            this.e.cleanup();
            this.f = false;
        }
    }
    
    public void c() {
        if (this.f) {
            for (final String sourcename : this.h.keySet()) {
                this.e.stop(sourcename);
            }
            this.h.clear();
            this.m.clear();
            this.l.clear();
            this.k.clear();
            this.j.clear();
            this.n.clear();
        }
    }
    
    public void d() {
        ++this.g;
        for (final bpk \u2603 : this.l) {
            \u2603.c();
            if (\u2603.k()) {
                this.b(\u2603);
            }
            else {
                final String sourcename = this.i.get(\u2603);
                this.e.setVolume(sourcename, this.a(\u2603, this.j.get(\u2603), this.c.a(\u2603.a()).d()));
                this.e.setPitch(sourcename, this.a(\u2603, this.j.get(\u2603)));
                this.e.setPosition(sourcename, \u2603.g(), \u2603.h(), \u2603.i());
            }
        }
        final Iterator<Map.Entry<String, bpj>> iterator2 = this.h.entrySet().iterator();
        while (iterator2.hasNext()) {
            final Map.Entry<String, bpj> entry = iterator2.next();
            final String sourcename = entry.getKey();
            final bpj \u26032 = entry.getValue();
            if (!this.e.playing(sourcename)) {
                final int intValue = this.n.get(sourcename);
                if (intValue > this.g) {
                    continue;
                }
                final int d = \u26032.d();
                if (\u26032.b() && d > 0) {
                    this.m.put(\u26032, this.g + d);
                }
                iterator2.remove();
                bpx.b.debug(bpx.a, "Removed channel {} because it's not playing anymore", new Object[] { sourcename });
                this.e.removeSource(sourcename);
                this.n.remove(sourcename);
                this.j.remove(\u26032);
                try {
                    this.k.remove(this.c.a(\u26032.a()).d(), sourcename);
                }
                catch (RuntimeException ex) {}
                if (!(\u26032 instanceof bpk)) {
                    continue;
                }
                this.l.remove(\u26032);
            }
        }
        final Iterator<Map.Entry<bpj, Integer>> iterator3 = this.m.entrySet().iterator();
        while (iterator3.hasNext()) {
            final Map.Entry<bpj, Integer> entry2 = iterator3.next();
            if (this.g >= entry2.getValue()) {
                final bpj \u26032 = entry2.getKey();
                if (\u26032 instanceof bpk) {
                    ((bpk)\u26032).c();
                }
                this.c(\u26032);
                iterator3.remove();
            }
        }
    }
    
    public boolean a(final bpj \u2603) {
        if (!this.f) {
            return false;
        }
        final String \u26032 = this.i.get(\u2603);
        return \u26032 != null && (this.e.playing(\u26032) || (this.n.containsKey(\u26032) && this.n.get(\u26032) <= this.g));
    }
    
    public void b(final bpj \u2603) {
        if (!this.f) {
            return;
        }
        final String sourcename = this.i.get(\u2603);
        if (sourcename != null) {
            this.e.stop(sourcename);
        }
    }
    
    public void c(final bpj \u2603) {
        if (!this.f) {
            return;
        }
        if (this.e.getMasterVolume() <= 0.0f) {
            bpx.b.debug(bpx.a, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { \u2603.a() });
            return;
        }
        final bpy a = this.c.a(\u2603.a());
        if (a == null) {
            bpx.b.warn(bpx.a, "Unable to play unknown soundEvent: {}", new Object[] { \u2603.a() });
            return;
        }
        final bpw b = a.b();
        if (b == bpz.a) {
            bpx.b.warn(bpx.a, "Unable to play empty soundEvent: {}", new Object[] { a.c() });
            return;
        }
        final float e = \u2603.e();
        float n = 16.0f;
        if (e > 1.0f) {
            n *= e;
        }
        final bpg d = a.d();
        final float a2 = this.a(\u2603, b, d);
        final double n2 = this.a(\u2603, b);
        final jy a3 = b.a();
        if (a2 == 0.0f) {
            bpx.b.debug(bpx.a, "Skipped playing sound {}, volume was zero.", new Object[] { a3 });
            return;
        }
        final boolean b2 = \u2603.b() && \u2603.d() == 0;
        final String string = ns.a(ThreadLocalRandom.current()).toString();
        if (b.d()) {
            this.e.newStreamingSource(false, string, a(a3), a3.toString(), b2, \u2603.g(), \u2603.h(), \u2603.i(), \u2603.j().a(), n);
        }
        else {
            this.e.newSource(false, string, a(a3), a3.toString(), b2, \u2603.g(), \u2603.h(), \u2603.i(), \u2603.j().a(), n);
        }
        bpx.b.debug(bpx.a, "Playing sound {} for event {} as channel {}", new Object[] { b.a(), a.c(), string });
        this.e.setPitch(string, (float)n2);
        this.e.setVolume(string, a2);
        this.e.play(string);
        this.n.put(string, this.g + 20);
        this.h.put(string, \u2603);
        this.j.put(\u2603, b);
        if (d != bpg.a) {
            this.k.put(d, string);
        }
        if (\u2603 instanceof bpk) {
            this.l.add((bpk)\u2603);
        }
    }
    
    private float a(final bpj \u2603, final bpw \u2603) {
        return (float)ns.a(\u2603.f() * \u2603.b(), 0.5, 2.0);
    }
    
    private float a(final bpj \u2603, final bpw \u2603, final bpg \u2603) {
        return (float)ns.a(\u2603.e() * \u2603.c(), 0.0, 1.0) * this.a(\u2603);
    }
    
    public void e() {
        for (final String sourcename : this.h.keySet()) {
            bpx.b.debug(bpx.a, "Pausing channel {}", new Object[] { sourcename });
            this.e.pause(sourcename);
        }
    }
    
    public void f() {
        for (final String sourcename : this.h.keySet()) {
            bpx.b.debug(bpx.a, "Resuming channel {}", new Object[] { sourcename });
            this.e.play(sourcename);
        }
    }
    
    public void a(final bpj \u2603, final int \u2603) {
        this.m.put(\u2603, this.g + \u2603);
    }
    
    private static URL a(final jy \u2603) {
        final String format = String.format("%s:%s:%s", "mcsounddomain", \u2603.b(), \u2603.a());
        final URLStreamHandler handler = new URLStreamHandler() {
            @Override
            protected URLConnection openConnection(final URL \u2603) {
                return new URLConnection(\u2603) {
                    @Override
                    public void connect() throws IOException {
                    }
                    
                    @Override
                    public InputStream getInputStream() throws IOException {
                        return ave.A().Q().a(\u2603).b();
                    }
                };
            }
        };
        try {
            return new URL(null, format, handler);
        }
        catch (MalformedURLException ex) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }
    
    public void a(final wn \u2603, final float \u2603) {
        if (!this.f || \u2603 == null) {
            return;
        }
        final float n = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
        final float n2 = \u2603.A + (\u2603.y - \u2603.A) * \u2603;
        final double n3 = \u2603.p + (\u2603.s - \u2603.p) * \u2603;
        final double n4 = \u2603.q + (\u2603.t - \u2603.q) * \u2603 + \u2603.aS();
        final double n5 = \u2603.r + (\u2603.u - \u2603.r) * \u2603;
        final float b = ns.b((n2 + 90.0f) * 0.017453292f);
        final float a = ns.a((n2 + 90.0f) * 0.017453292f);
        final float b2 = ns.b(-n * 0.017453292f);
        final float a2 = ns.a(-n * 0.017453292f);
        final float b3 = ns.b((-n + 90.0f) * 0.017453292f);
        final float a3 = ns.a((-n + 90.0f) * 0.017453292f);
        final float lookX = b * b2;
        final float lookY = a2;
        final float lookZ = a * b2;
        final float upX = b * b3;
        final float upY = a3;
        final float upZ = a * b3;
        this.e.setListenerPosition((float)n3, (float)n4, (float)n5);
        this.e.setListenerOrientation(lookX, lookY, lookZ, upX, upY, upZ);
    }
    
    static {
        a = MarkerManager.getMarker("SOUNDS");
        b = LogManager.getLogger();
    }
    
    class a extends SoundSystem
    {
        private a() {
        }
        
        @Override
        public boolean playing(final String \u2603) {
            synchronized (SoundSystemConfig.THREAD_SYNC) {
                if (this.soundLibrary == null) {
                    return false;
                }
                final Source source = this.soundLibrary.getSources().get(\u2603);
                return source != null && (source.playing() || source.paused() || source.preLoad);
            }
        }
    }
}
