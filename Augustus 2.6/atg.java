import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class atg extends ate
{
    public int b;
    public int c;
    public byte d;
    public byte e;
    public byte[] f;
    public List<a> g;
    private Map<wn, a> i;
    public Map<String, atf> h;
    
    public atg(final String \u2603) {
        super(\u2603);
        this.f = new byte[16384];
        this.g = (List<a>)Lists.newArrayList();
        this.i = (Map<wn, a>)Maps.newHashMap();
        this.h = (Map<String, atf>)Maps.newLinkedHashMap();
    }
    
    public void a(final double \u2603, final double \u2603, final int \u2603) {
        final int n = 128 * (1 << \u2603);
        final int c = ns.c((\u2603 + 64.0) / n);
        final int c2 = ns.c((\u2603 + 64.0) / n);
        this.b = c * n + n / 2 - 64;
        this.c = c2 * n + n / 2 - 64;
    }
    
    @Override
    public void a(final dn \u2603) {
        this.d = \u2603.d("dimension");
        this.b = \u2603.f("xCenter");
        this.c = \u2603.f("zCenter");
        this.e = \u2603.d("scale");
        this.e = (byte)ns.a(this.e, 0, 4);
        final int e = \u2603.e("width");
        final int e2 = \u2603.e("height");
        if (e == 128 && e2 == 128) {
            this.f = \u2603.k("colors");
        }
        else {
            final byte[] k = \u2603.k("colors");
            this.f = new byte[16384];
            final int n = (128 - e) / 2;
            final int n2 = (128 - e2) / 2;
            for (int i = 0; i < e2; ++i) {
                final int n3 = i + n2;
                if (n3 >= 0 || n3 < 128) {
                    for (int j = 0; j < e; ++j) {
                        final int n4 = j + n;
                        if (n4 >= 0 || n4 < 128) {
                            this.f[n4 + n3 * 128] = k[j + i * e];
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        \u2603.a("dimension", this.d);
        \u2603.a("xCenter", this.b);
        \u2603.a("zCenter", this.c);
        \u2603.a("scale", this.e);
        \u2603.a("width", (short)128);
        \u2603.a("height", (short)128);
        \u2603.a("colors", this.f);
    }
    
    public void a(final wn \u2603, final zx \u2603) {
        if (!this.i.containsKey(\u2603)) {
            final a a = new a(\u2603);
            this.i.put(\u2603, a);
            this.g.add(a);
        }
        if (!\u2603.bi.c(\u2603)) {
            this.h.remove(\u2603.e_());
        }
        for (int i = 0; i < this.g.size(); ++i) {
            final a a2 = this.g.get(i);
            if (a2.a.I || (!a2.a.bi.c(\u2603) && !\u2603.y())) {
                this.i.remove(a2.a);
                this.g.remove(a2);
            }
            else if (!\u2603.y() && a2.a.am == this.d) {
                this.a(0, a2.a.o, a2.a.e_(), a2.a.s, a2.a.u, a2.a.y);
            }
        }
        if (\u2603.y()) {
            final uo z = \u2603.z();
            final cj n = z.n();
            this.a(1, \u2603.o, "frame-" + z.F(), n.n(), n.p(), z.b.b() * 90);
        }
        if (\u2603.n() && \u2603.o().b("Decorations", 9)) {
            final du c = \u2603.o().c("Decorations", 10);
            for (int j = 0; j < c.c(); ++j) {
                final dn b = c.b(j);
                if (!this.h.containsKey(b.j("id"))) {
                    this.a(b.d("type"), \u2603.o, b.j("id"), b.i("x"), b.i("z"), b.i("rot"));
                }
            }
        }
    }
    
    private void a(int \u2603, final adm \u2603, final String \u2603, final double \u2603, final double \u2603, double \u2603) {
        final int n = 1 << this.e;
        final float a = (float)(\u2603 - this.b) / n;
        final float a2 = (float)(\u2603 - this.c) / n;
        byte \u26032 = (byte)(a * 2.0f + 0.5);
        byte \u26033 = (byte)(a2 * 2.0f + 0.5);
        final int n2 = 63;
        byte \u26034;
        if (a >= -n2 && a2 >= -n2 && a <= n2 && a2 <= n2) {
            \u2603 += ((\u2603 < 0.0) ? -8.0 : 8.0);
            \u26034 = (byte)(\u2603 * 16.0 / 360.0);
            if (this.d < 0) {
                final int n3 = (int)(\u2603.P().g() / 10L);
                \u26034 = (byte)(n3 * n3 * 34187121 + n3 * 121 >> 15 & 0xF);
            }
        }
        else {
            if (Math.abs(a) >= 320.0f || Math.abs(a2) >= 320.0f) {
                this.h.remove(\u2603);
                return;
            }
            \u2603 = 6;
            \u26034 = 0;
            if (a <= -n2) {
                \u26032 = (byte)(n2 * 2 + 2.5);
            }
            if (a2 <= -n2) {
                \u26033 = (byte)(n2 * 2 + 2.5);
            }
            if (a >= n2) {
                \u26032 = (byte)(n2 * 2 + 1);
            }
            if (a2 >= n2) {
                \u26033 = (byte)(n2 * 2 + 1);
            }
        }
        this.h.put(\u2603, new atf((byte)\u2603, \u26032, \u26033, \u26034));
    }
    
    public ff a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final a a = this.i.get(\u2603);
        if (a == null) {
            return null;
        }
        return a.a(\u2603);
    }
    
    public void a(final int \u2603, final int \u2603) {
        super.c();
        for (final a a : this.g) {
            a.a(\u2603, \u2603);
        }
    }
    
    public a a(final wn \u2603) {
        a a = this.i.get(\u2603);
        if (a == null) {
            a = new a(\u2603);
            this.i.put(\u2603, a);
            this.g.add(a);
        }
        return a;
    }
    
    public class a
    {
        public final wn a;
        private boolean d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        public int b;
        
        public a(final wn \u2603) {
            this.d = true;
            this.e = 0;
            this.f = 0;
            this.g = 127;
            this.h = 127;
            this.a = \u2603;
        }
        
        public ff a(final zx \u2603) {
            if (this.d) {
                this.d = false;
                return new gu(\u2603.i(), atg.this.e, atg.this.h.values(), atg.this.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
            }
            if (this.i++ % 5 == 0) {
                return new gu(\u2603.i(), atg.this.e, atg.this.h.values(), atg.this.f, 0, 0, 0, 0);
            }
            return null;
        }
        
        public void a(final int \u2603, final int \u2603) {
            if (this.d) {
                this.e = Math.min(this.e, \u2603);
                this.f = Math.min(this.f, \u2603);
                this.g = Math.max(this.g, \u2603);
                this.h = Math.max(this.h, \u2603);
            }
            else {
                this.d = true;
                this.e = \u2603;
                this.f = \u2603;
                this.g = \u2603;
                this.h = \u2603;
            }
        }
    }
}
