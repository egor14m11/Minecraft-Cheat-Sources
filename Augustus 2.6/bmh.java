import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.awt.image.BufferedImage;
import java.io.IOException;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmh extends bly implements bmn
{
    private static final Logger h;
    public static final jy f;
    public static final jy g;
    private final List<bmi> i;
    private final Map<String, bmi> j;
    private final Map<String, bmi> k;
    private final String l;
    private final bmb m;
    private int n;
    private final bmi o;
    
    public bmh(final String \u2603) {
        this(\u2603, null);
    }
    
    public bmh(final String \u2603, final bmb \u2603) {
        this.i = (List<bmi>)Lists.newArrayList();
        this.j = (Map<String, bmi>)Maps.newHashMap();
        this.k = (Map<String, bmi>)Maps.newHashMap();
        this.o = new bmi("missingno");
        this.l = \u2603;
        this.m = \u2603;
    }
    
    private void g() {
        final int[] b = bml.b;
        this.o.b(16);
        this.o.c(16);
        final int[][] array = new int[this.n + 1][];
        array[0] = b;
        this.o.a(Lists.newArrayList(new int[][][] { array }));
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
        if (this.m != null) {
            this.a(\u2603, this.m);
        }
    }
    
    public void a(final bni \u2603, final bmb \u2603) {
        this.j.clear();
        \u2603.a(this);
        this.g();
        this.c();
        this.b(\u2603);
    }
    
    public void b(final bni \u2603) {
        final int c = ave.C();
        final bmf bmf = new bmf(c, c, true, 0, this.n);
        this.k.clear();
        this.i.clear();
        int min = Integer.MAX_VALUE;
        int n = 1 << this.n;
        for (final Map.Entry<String, bmi> entry : this.j.entrySet()) {
            final bmi \u26032 = entry.getValue();
            final jy jy = new jy(\u26032.i());
            final jy a = this.a(jy, 0);
            try {
                final bnh a2 = \u2603.a(a);
                final BufferedImage[] \u26033 = new BufferedImage[1 + this.n];
                \u26033[0] = bml.a(a2.b());
                final bon bon = a2.a("texture");
                if (bon != null) {
                    final List<Integer> c2 = bon.c();
                    if (!c2.isEmpty()) {
                        final int width = \u26033[0].getWidth();
                        final int i = \u26033[0].getHeight();
                        if (ns.b(width) != width || ns.b(i) != i) {
                            throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                        }
                    }
                    final Iterator iterator2 = c2.iterator();
                    while (iterator2.hasNext()) {
                        final int i = iterator2.next();
                        if (i > 0 && i < \u26033.length - 1 && \u26033[i] == null) {
                            final jy a3 = this.a(jy, i);
                            try {
                                \u26033[i] = bml.a(\u2603.a(a3).b());
                            }
                            catch (IOException ex) {
                                bmh.h.error("Unable to load miplevel {} from: {}", new Object[] { i, a3, ex });
                            }
                        }
                    }
                }
                final boa \u26034 = a2.a("animation");
                \u26032.a(\u26033, \u26034);
            }
            catch (RuntimeException throwable) {
                bmh.h.error("Unable to parse metadata from " + a, throwable);
                continue;
            }
            catch (IOException throwable2) {
                bmh.h.error("Using missing texture, unable to load " + a, throwable2);
                continue;
            }
            min = Math.min(min, Math.min(\u26032.c(), \u26032.d()));
            final int min2 = Math.min(Integer.lowestOneBit(\u26032.c()), Integer.lowestOneBit(\u26032.d()));
            if (min2 < n) {
                bmh.h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[] { a, \u26032.c(), \u26032.d(), ns.c(n), ns.c(min2) });
                n = min2;
            }
            bmf.a(\u26032);
        }
        final int min3 = Math.min(min, n);
        final int c3 = ns.c(min3);
        if (c3 < this.n) {
            bmh.h.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[] { this.l, this.n, c3, min3 });
            this.n = c3;
        }
        for (final bmi bmi : this.j.values()) {
            try {
                bmi.d(this.n);
            }
            catch (Throwable \u26035) {
                final b a4 = b.a(\u26035, "Applying mipmap");
                final c a5 = a4.a("Sprite being mipmapped");
                a5.a("Sprite name", new Callable<String>() {
                    public String a() throws Exception {
                        return bmi.i();
                    }
                });
                a5.a("Sprite size", new Callable<String>() {
                    public String a() throws Exception {
                        return bmi.c() + " x " + bmi.d();
                    }
                });
                a5.a("Sprite frames", new Callable<String>() {
                    public String a() throws Exception {
                        return bmi.k() + " frames";
                    }
                });
                a5.a("Mipmap levels", this.n);
                throw new e(a4);
            }
        }
        this.o.d(this.n);
        bmf.a(this.o);
        try {
            bmf.c();
        }
        catch (bmg bmg) {
            throw bmg;
        }
        bmh.h.info("Created: {}x{} {}-atlas", new Object[] { bmf.a(), bmf.b(), this.l });
        bml.a(this.b(), this.n, bmf.a(), bmf.b());
        final Map<String, bmi> hashMap = (Map<String, bmi>)Maps.newHashMap((Map<?, ?>)this.j);
        for (final bmi \u26036 : bmf.d()) {
            final String j = \u26036.i();
            hashMap.remove(j);
            this.k.put(j, \u26036);
            try {
                bml.a(\u26036.a(0), \u26036.c(), \u26036.d(), \u26036.a(), \u26036.b(), false, false);
            }
            catch (Throwable \u26037) {
                final b a6 = b.a(\u26037, "Stitching texture atlas");
                final c a7 = a6.a("Texture being stitched together");
                a7.a("Atlas path", this.l);
                a7.a("Sprite", \u26036);
                throw new e(a6);
            }
            if (\u26036.m()) {
                this.i.add(\u26036);
            }
        }
        for (final bmi \u26036 : hashMap.values()) {
            \u26036.a(this.o);
        }
    }
    
    private jy a(final jy \u2603, final int \u2603) {
        if (\u2603 == 0) {
            return new jy(\u2603.b(), String.format("%s/%s%s", this.l, \u2603.a(), ".png"));
        }
        return new jy(\u2603.b(), String.format("%s/mipmaps/%s.%d%s", this.l, \u2603.a(), \u2603, ".png"));
    }
    
    public bmi a(final String \u2603) {
        bmi o = this.k.get(\u2603);
        if (o == null) {
            o = this.o;
        }
        return o;
    }
    
    public void d() {
        bml.b(this.b());
        for (final bmi bmi : this.i) {
            bmi.j();
        }
    }
    
    public bmi a(final jy \u2603) {
        if (\u2603 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        bmi a = this.j.get(\u2603);
        if (a == null) {
            a = bmi.a(\u2603);
            this.j.put(\u2603.toString(), a);
        }
        return a;
    }
    
    @Override
    public void e() {
        this.d();
    }
    
    public void a(final int \u2603) {
        this.n = \u2603;
    }
    
    public bmi f() {
        return this.o;
    }
    
    static {
        h = LogManager.getLogger();
        f = new jy("missingno");
        g = new jy("textures/atlas/blocks.png");
    }
}
