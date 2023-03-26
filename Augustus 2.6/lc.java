import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lc
{
    private static final Logger a;
    private final le b;
    private final List<lf> c;
    private final nq<a> d;
    private final List<a> e;
    private final List<a> f;
    private int g;
    private long h;
    private final int[][] i;
    
    public lc(final le \u2603) {
        this.c = (List<lf>)Lists.newArrayList();
        this.d = new nq<a>();
        this.e = (List<a>)Lists.newArrayList();
        this.f = (List<a>)Lists.newArrayList();
        this.i = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        this.b = \u2603;
        this.a(\u2603.r().ap().s());
    }
    
    public le a() {
        return this.b;
    }
    
    public void b() {
        final long k = this.b.K();
        if (k - this.h > 8000L) {
            this.h = k;
            for (int i = 0; i < this.f.size(); ++i) {
                final a a = this.f.get(i);
                a.b();
                a.a();
            }
        }
        else {
            for (int i = 0; i < this.e.size(); ++i) {
                final a a = this.e.get(i);
                a.b();
            }
        }
        this.e.clear();
        if (this.c.isEmpty()) {
            final anm t = this.b.t;
            if (!t.e()) {
                this.b.b.b();
            }
        }
    }
    
    public boolean a(final int \u2603, final int \u2603) {
        final long \u26032 = \u2603 + 2147483647L | \u2603 + 2147483647L << 32;
        return this.d.a(\u26032) != null;
    }
    
    private a a(final int \u2603, final int \u2603, final boolean \u2603) {
        final long n = \u2603 + 2147483647L | \u2603 + 2147483647L << 32;
        a \u26032 = this.d.a(n);
        if (\u26032 == null && \u2603) {
            \u26032 = new a(\u2603, \u2603);
            this.d.a(n, \u26032);
            this.f.add(\u26032);
        }
        return \u26032;
    }
    
    public void a(final cj \u2603) {
        final int \u26032 = \u2603.n() >> 4;
        final int \u26033 = \u2603.p() >> 4;
        final a a = this.a(\u26032, \u26033, false);
        if (a != null) {
            a.a(\u2603.n() & 0xF, \u2603.o(), \u2603.p() & 0xF);
        }
    }
    
    public void a(final lf \u2603) {
        final int n = (int)\u2603.s >> 4;
        final int n2 = (int)\u2603.u >> 4;
        \u2603.d = \u2603.s;
        \u2603.e = \u2603.u;
        for (int i = n - this.g; i <= n + this.g; ++i) {
            for (int j = n2 - this.g; j <= n2 + this.g; ++j) {
                this.a(i, j, true).a(\u2603);
            }
        }
        this.c.add(\u2603);
        this.b(\u2603);
    }
    
    public void b(final lf \u2603) {
        final List<adg> arrayList = (List<adg>)Lists.newArrayList((Iterable<?>)\u2603.f);
        int n = 0;
        final int g = this.g;
        final int \u26032 = (int)\u2603.s >> 4;
        final int \u26033 = (int)\u2603.u >> 4;
        int n2 = 0;
        int n3 = 0;
        adg adg = this.a(\u26032, \u26033, true).c;
        \u2603.f.clear();
        if (arrayList.contains(adg)) {
            \u2603.f.add(adg);
        }
        for (int i = 1; i <= g * 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                final int[] array = this.i[n++ % 4];
                for (int k = 0; k < i; ++k) {
                    n2 += array[0];
                    n3 += array[1];
                    adg = this.a(\u26032 + n2, \u26033 + n3, true).c;
                    if (arrayList.contains(adg)) {
                        \u2603.f.add(adg);
                    }
                }
            }
        }
        n %= 4;
        for (int i = 0; i < g * 2; ++i) {
            n2 += this.i[n][0];
            n3 += this.i[n][1];
            adg = this.a(\u26032 + n2, \u26033 + n3, true).c;
            if (arrayList.contains(adg)) {
                \u2603.f.add(adg);
            }
        }
    }
    
    public void c(final lf \u2603) {
        final int n = (int)\u2603.d >> 4;
        final int n2 = (int)\u2603.e >> 4;
        for (int i = n - this.g; i <= n + this.g; ++i) {
            for (int j = n2 - this.g; j <= n2 + this.g; ++j) {
                final a a = this.a(i, j, false);
                if (a != null) {
                    a.b(\u2603);
                }
            }
        }
        this.c.remove(\u2603);
    }
    
    private boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 - \u2603;
        final int n2 = \u2603 - \u2603;
        return n >= -\u2603 && n <= \u2603 && n2 >= -\u2603 && n2 <= \u2603;
    }
    
    public void d(final lf \u2603) {
        final int \u26032 = (int)\u2603.s >> 4;
        final int \u26033 = (int)\u2603.u >> 4;
        final double n = \u2603.d - \u2603.s;
        final double n2 = \u2603.e - \u2603.u;
        final double n3 = n * n + n2 * n2;
        if (n3 < 64.0) {
            return;
        }
        final int \u26034 = (int)\u2603.d >> 4;
        final int \u26035 = (int)\u2603.e >> 4;
        final int g = this.g;
        final int n4 = \u26032 - \u26034;
        final int n5 = \u26033 - \u26035;
        if (n4 == 0 && n5 == 0) {
            return;
        }
        for (int i = \u26032 - g; i <= \u26032 + g; ++i) {
            for (int j = \u26033 - g; j <= \u26033 + g; ++j) {
                if (!this.a(i, j, \u26034, \u26035, g)) {
                    this.a(i, j, true).a(\u2603);
                }
                if (!this.a(i - n4, j - n5, \u26032, \u26033, g)) {
                    final a a = this.a(i - n4, j - n5, false);
                    if (a != null) {
                        a.b(\u2603);
                    }
                }
            }
        }
        this.b(\u2603);
        \u2603.d = \u2603.s;
        \u2603.e = \u2603.u;
    }
    
    public boolean a(final lf \u2603, final int \u2603, final int \u2603) {
        final a a = this.a(\u2603, \u2603, false);
        return a != null && a.b.contains(\u2603) && !\u2603.f.contains(a.c);
    }
    
    public void a(int \u2603) {
        \u2603 = ns.a(\u2603, 3, 32);
        if (\u2603 == this.g) {
            return;
        }
        final int n = \u2603 - this.g;
        final List<lf> arrayList = (List<lf>)Lists.newArrayList((Iterable<?>)this.c);
        for (final lf lf : arrayList) {
            final int \u26032 = (int)lf.s >> 4;
            final int \u26033 = (int)lf.u >> 4;
            if (n > 0) {
                for (int i = \u26032 - \u2603; i <= \u26032 + \u2603; ++i) {
                    for (int j = \u26033 - \u2603; j <= \u26033 + \u2603; ++j) {
                        final a a = this.a(i, j, true);
                        if (!a.b.contains(lf)) {
                            a.a(lf);
                        }
                    }
                }
            }
            else {
                for (int i = \u26032 - this.g; i <= \u26032 + this.g; ++i) {
                    for (int j = \u26033 - this.g; j <= \u26033 + this.g; ++j) {
                        if (!this.a(i, j, \u26032, \u26033, \u2603)) {
                            this.a(i, j, true).b(lf);
                        }
                    }
                }
            }
        }
        this.g = \u2603;
    }
    
    public static int b(final int \u2603) {
        return \u2603 * 16 - 16;
    }
    
    static {
        a = LogManager.getLogger();
    }
    
    class a
    {
        private final List<lf> b;
        private final adg c;
        private short[] d;
        private int e;
        private int f;
        private long g;
        
        public a(final int \u2603, final int \u2603) {
            this.b = (List<lf>)Lists.newArrayList();
            this.d = new short[64];
            this.c = new adg(\u2603, \u2603);
            lc.this.a().b.c(\u2603, \u2603);
        }
        
        public void a(final lf \u2603) {
            if (this.b.contains(\u2603)) {
                lc.a.debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { \u2603, this.c.a, this.c.b });
                return;
            }
            if (this.b.isEmpty()) {
                this.g = lc.this.b.K();
            }
            this.b.add(\u2603);
            \u2603.f.add(this.c);
        }
        
        public void b(final lf \u2603) {
            if (!this.b.contains(\u2603)) {
                return;
            }
            final amy a = lc.this.b.a(this.c.a, this.c.b);
            if (a.i()) {
                \u2603.a.a(new go(a, true, 0));
            }
            this.b.remove(\u2603);
            \u2603.f.remove(this.c);
            if (this.b.isEmpty()) {
                final long \u26032 = this.c.a + 2147483647L | this.c.b + 2147483647L << 32;
                this.a(a);
                lc.this.d.d(\u26032);
                lc.this.f.remove(this);
                if (this.e > 0) {
                    lc.this.e.remove(this);
                }
                lc.this.a().b.b(this.c.a, this.c.b);
            }
        }
        
        public void a() {
            this.a(lc.this.b.a(this.c.a, this.c.b));
        }
        
        private void a(final amy \u2603) {
            \u2603.c(\u2603.w() + lc.this.b.K() - this.g);
            this.g = lc.this.b.K();
        }
        
        public void a(final int \u2603, final int \u2603, final int \u2603) {
            if (this.e == 0) {
                lc.this.e.add(this);
            }
            this.f |= 1 << (\u2603 >> 4);
            if (this.e < 64) {
                final short n = (short)(\u2603 << 12 | \u2603 << 8 | \u2603);
                for (int i = 0; i < this.e; ++i) {
                    if (this.d[i] == n) {
                        return;
                    }
                }
                this.d[this.e++] = n;
            }
        }
        
        public void a(final ff \u2603) {
            for (int i = 0; i < this.b.size(); ++i) {
                final lf lf = this.b.get(i);
                if (!lf.f.contains(this.c)) {
                    lf.a.a(\u2603);
                }
            }
        }
        
        public void b() {
            if (this.e == 0) {
                return;
            }
            if (this.e == 1) {
                final int i = (this.d[0] >> 12 & 0xF) + this.c.a * 16;
                final int \u2603 = this.d[0] & 0xFF;
                final int j = (this.d[0] >> 8 & 0xF) + this.c.b * 16;
                final cj \u26032 = new cj(i, \u2603, j);
                this.a(new fv(lc.this.b, \u26032));
                if (lc.this.b.p(\u26032).c().z()) {
                    this.a(lc.this.b.s(\u26032));
                }
            }
            else if (this.e == 64) {
                final int i = this.c.a * 16;
                final int \u2603 = this.c.b * 16;
                this.a(new go(lc.this.b.a(this.c.a, this.c.b), false, this.f));
                for (int j = 0; j < 16; ++j) {
                    if ((this.f & 1 << j) != 0x0) {
                        final int n = j << 4;
                        final List<akw> a = lc.this.b.a(i, n, \u2603, i + 16, n + 16, \u2603 + 16);
                        for (int k = 0; k < a.size(); ++k) {
                            this.a(a.get(k));
                        }
                    }
                }
            }
            else {
                this.a(new fz(this.e, this.d, lc.this.b.a(this.c.a, this.c.b)));
                for (int i = 0; i < this.e; ++i) {
                    final int \u2603 = (this.d[i] >> 12 & 0xF) + this.c.a * 16;
                    final int j = this.d[i] & 0xFF;
                    final int n = (this.d[i] >> 8 & 0xF) + this.c.b * 16;
                    final cj cj = new cj(\u2603, j, n);
                    if (lc.this.b.p(cj).c().z()) {
                        this.a(lc.this.b.s(cj));
                    }
                }
            }
            this.e = 0;
            this.f = 0;
        }
        
        private void a(final akw \u2603) {
            if (\u2603 != null) {
                final ff y_ = \u2603.y_();
                if (y_ != null) {
                    this.a(y_);
                }
            }
        }
    }
}
