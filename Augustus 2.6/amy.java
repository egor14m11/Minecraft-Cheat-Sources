import org.apache.logging.log4j.LogManager;
import java.util.Random;
import com.google.common.base.Predicate;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.Arrays;
import com.google.common.collect.Queues;
import com.google.common.collect.Maps;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class amy
{
    private static final Logger c;
    private final amz[] d;
    private final byte[] e;
    private final int[] f;
    private final boolean[] g;
    private boolean h;
    private final adm i;
    private final int[] j;
    public final int a;
    public final int b;
    private boolean k;
    private final Map<cj, akw> l;
    private final ne<pk>[] m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private ConcurrentLinkedQueue<cj> w;
    
    public amy(final adm \u2603, final int \u2603, final int \u2603) {
        this.d = new amz[16];
        this.e = new byte[256];
        this.f = new int[256];
        this.g = new boolean[256];
        this.l = (Map<cj, akw>)Maps.newHashMap();
        this.v = 4096;
        this.w = Queues.newConcurrentLinkedQueue();
        this.m = (ne<pk>[])new ne[16];
        this.i = \u2603;
        this.a = \u2603;
        this.b = \u2603;
        this.j = new int[256];
        for (int i = 0; i < this.m.length; ++i) {
            this.m[i] = new ne<pk>(pk.class);
        }
        Arrays.fill(this.f, -999);
        Arrays.fill(this.e, (byte)(-1));
    }
    
    public amy(final adm \u2603, final ans \u2603, final int \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603);
        final int n = 256;
        final boolean \u26032 = !\u2603.t.o();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < n; ++k) {
                    final int \u26033 = i * n * 16 | j * n | k;
                    final alz a = \u2603.a(\u26033);
                    if (a.c().t() != arm.a) {
                        final int n2 = k >> 4;
                        if (this.d[n2] == null) {
                            this.d[n2] = new amz(n2 << 4, \u26032);
                        }
                        this.d[n2].a(i, k & 0xF, j, a);
                    }
                }
            }
        }
    }
    
    public boolean a(final int \u2603, final int \u2603) {
        return \u2603 == this.a && \u2603 == this.b;
    }
    
    public int f(final cj \u2603) {
        return this.b(\u2603.n() & 0xF, \u2603.p() & 0xF);
    }
    
    public int b(final int \u2603, final int \u2603) {
        return this.j[\u2603 << 4 | \u2603];
    }
    
    public int g() {
        for (int i = this.d.length - 1; i >= 0; --i) {
            if (this.d[i] != null) {
                return this.d[i].d();
            }
        }
        return 0;
    }
    
    public amz[] h() {
        return this.d;
    }
    
    protected void a() {
        final int g = this.g();
        this.t = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.f[i + (j << 4)] = -999;
                int k = g + 16;
                while (k > 0) {
                    final afh f = this.f(i, k - 1, j);
                    if (f.p() != 0) {
                        if ((this.j[j << 4 | i] = k) < this.t) {
                            this.t = k;
                            break;
                        }
                        break;
                    }
                    else {
                        --k;
                    }
                }
            }
        }
        this.q = true;
    }
    
    public void b() {
        final int g = this.g();
        this.t = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.f[i + (j << 4)] = -999;
                int k = g + 16;
                while (k > 0) {
                    if (this.e(i, k - 1, j) != 0) {
                        if ((this.j[j << 4 | i] = k) < this.t) {
                            this.t = k;
                            break;
                        }
                        break;
                    }
                    else {
                        --k;
                    }
                }
                if (!this.i.t.o()) {
                    k = 15;
                    int n = g + 16 - 1;
                    do {
                        int e = this.e(i, n, j);
                        if (e == 0 && k != 15) {
                            e = 1;
                        }
                        k -= e;
                        if (k > 0) {
                            final amz amz = this.d[n >> 4];
                            if (amz == null) {
                                continue;
                            }
                            amz.a(i, n & 0xF, j, k);
                            this.i.n(new cj((this.a << 4) + i, n, (this.b << 4) + j));
                        }
                    } while (--n > 0 && k > 0);
                }
            }
        }
        this.q = true;
    }
    
    private void d(final int \u2603, final int \u2603) {
        this.g[\u2603 + \u2603 * 16] = true;
        this.k = true;
    }
    
    private void h(final boolean \u2603) {
        this.i.B.a("recheckGaps");
        if (this.i.a(new cj(this.a * 16 + 8, 0, this.b * 16 + 8), 16)) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    if (this.g[i + j * 16]) {
                        this.g[i + j * 16] = false;
                        final int b = this.b(i, j);
                        final int \u26032 = this.a * 16 + i;
                        final int \u26033 = this.b * 16 + j;
                        int min = Integer.MAX_VALUE;
                        for (final cq cq : cq.c.a) {
                            min = Math.min(min, this.i.b(\u26032 + cq.g(), \u26033 + cq.i()));
                        }
                        this.c(\u26032, \u26033, min);
                        for (final cq cq : cq.c.a) {
                            this.c(\u26032 + cq.g(), \u26033 + cq.i(), b);
                        }
                        if (\u2603) {
                            this.i.B.b();
                            return;
                        }
                    }
                }
            }
            this.k = false;
        }
        this.i.B.b();
    }
    
    private void c(final int \u2603, final int \u2603, final int \u2603) {
        final int o = this.i.m(new cj(\u2603, 0, \u2603)).o();
        if (o > \u2603) {
            this.a(\u2603, \u2603, \u2603, o + 1);
        }
        else if (o < \u2603) {
            this.a(\u2603, \u2603, o, \u2603 + 1);
        }
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 > \u2603 && this.i.a(new cj(\u2603, 0, \u2603), 16)) {
            for (int i = \u2603; i < \u2603; ++i) {
                this.i.c(ads.a, new cj(\u2603, i, \u2603));
            }
            this.q = true;
        }
    }
    
    private void d(final int \u2603, final int \u2603, final int \u2603) {
        int n;
        final int \u26032 = n = (this.j[\u2603 << 4 | \u2603] & 0xFF);
        if (\u2603 > \u26032) {
            n = \u2603;
        }
        while (n > 0 && this.e(\u2603, n - 1, \u2603) == 0) {
            --n;
        }
        if (n == \u26032) {
            return;
        }
        this.i.a(\u2603 + this.a * 16, \u2603 + this.b * 16, n, \u26032);
        this.j[\u2603 << 4 | \u2603] = n;
        final int \u26033 = this.a * 16 + \u2603;
        final int \u26034 = this.b * 16 + \u2603;
        if (!this.i.t.o()) {
            if (n < \u26032) {
                for (int i = n; i < \u26032; ++i) {
                    final amz amz = this.d[i >> 4];
                    if (amz != null) {
                        amz.a(\u2603, i & 0xF, \u2603, 15);
                        this.i.n(new cj((this.a << 4) + \u2603, i, (this.b << 4) + \u2603));
                    }
                }
            }
            else {
                for (int i = \u26032; i < n; ++i) {
                    final amz amz = this.d[i >> 4];
                    if (amz != null) {
                        amz.a(\u2603, i & 0xF, \u2603, 0);
                        this.i.n(new cj((this.a << 4) + \u2603, i, (this.b << 4) + \u2603));
                    }
                }
            }
            int i = 15;
            while (n > 0 && i > 0) {
                --n;
                int e = this.e(\u2603, n, \u2603);
                if (e == 0) {
                    e = 1;
                }
                i -= e;
                if (i < 0) {
                    i = 0;
                }
                final amz amz2 = this.d[n >> 4];
                if (amz2 != null) {
                    amz2.a(\u2603, n & 0xF, \u2603, i);
                }
            }
        }
        int i = this.j[\u2603 << 4 | \u2603];
        int e = \u26032;
        int n2 = i;
        if (n2 < e) {
            final int n3 = e;
            e = n2;
            n2 = n3;
        }
        if (i < this.t) {
            this.t = i;
        }
        if (!this.i.t.o()) {
            for (final cq cq : cq.c.a) {
                this.a(\u26033 + cq.g(), \u26034 + cq.i(), e, n2);
            }
            this.a(\u26033, \u26034, e, n2);
        }
        this.q = true;
    }
    
    public int b(final cj \u2603) {
        return this.a(\u2603).p();
    }
    
    private int e(final int \u2603, final int \u2603, final int \u2603) {
        return this.f(\u2603, \u2603, \u2603).p();
    }
    
    private afh f(final int \u2603, final int \u2603, final int \u2603) {
        afh afh = afi.a;
        if (\u2603 >= 0 && \u2603 >> 4 < this.d.length) {
            final amz amz = this.d[\u2603 >> 4];
            if (amz != null) {
                try {
                    afh = amz.b(\u2603, \u2603 & 0xF, \u2603);
                }
                catch (Throwable \u26032) {
                    final b a = b.a(\u26032, "Getting block");
                    throw new e(a);
                }
            }
        }
        return afh;
    }
    
    public afh a(final int \u2603, final int \u2603, final int \u2603) {
        try {
            return this.f(\u2603 & 0xF, \u2603, \u2603 & 0xF);
        }
        catch (e e) {
            final c a = e.a().a("Block being got");
            a.a("Location", new Callable<String>() {
                public String a() throws Exception {
                    return c.a(new cj(amy.this.a * 16 + \u2603, \u2603, amy.this.b * 16 + \u2603));
                }
            });
            throw e;
        }
    }
    
    public afh a(final cj \u2603) {
        try {
            return this.f(\u2603.n() & 0xF, \u2603.o(), \u2603.p() & 0xF);
        }
        catch (e e) {
            final c a = e.a().a("Block being got");
            a.a("Location", new Callable<String>() {
                public String a() throws Exception {
                    return c.a(\u2603);
                }
            });
            throw e;
        }
    }
    
    public alz g(final cj \u2603) {
        if (this.i.G() == adr.g) {
            alz alz = null;
            if (\u2603.o() == 60) {
                alz = afi.cv.Q();
            }
            if (\u2603.o() == 70) {
                alz = anu.b(\u2603.n(), \u2603.p());
            }
            return (alz == null) ? afi.a.Q() : alz;
        }
        try {
            if (\u2603.o() >= 0 && \u2603.o() >> 4 < this.d.length) {
                final amz amz = this.d[\u2603.o() >> 4];
                if (amz != null) {
                    final int \u26032 = \u2603.n() & 0xF;
                    final int \u26033 = \u2603.o() & 0xF;
                    final int \u26034 = \u2603.p() & 0xF;
                    return amz.a(\u26032, \u26033, \u26034);
                }
            }
            return afi.a.Q();
        }
        catch (Throwable \u26035) {
            final b a = b.a(\u26035, "Getting block state");
            final c a2 = a.a("Block being got");
            a2.a("Location", new Callable<String>() {
                public String a() throws Exception {
                    return c.a(\u2603);
                }
            });
            throw new e(a);
        }
    }
    
    private int g(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 >> 4 >= this.d.length) {
            return 0;
        }
        final amz amz = this.d[\u2603 >> 4];
        if (amz != null) {
            return amz.c(\u2603, \u2603 & 0xF, \u2603);
        }
        return 0;
    }
    
    public int c(final cj \u2603) {
        return this.g(\u2603.n() & 0xF, \u2603.o(), \u2603.p() & 0xF);
    }
    
    public alz a(final cj \u2603, final alz \u2603) {
        final int \u26032 = \u2603.n() & 0xF;
        final int o = \u2603.o();
        final int \u26033 = \u2603.p() & 0xF;
        final int n = \u26033 << 4 | \u26032;
        if (o >= this.f[n] - 1) {
            this.f[n] = -999;
        }
        final int n2 = this.j[n];
        final alz g = this.g(\u2603);
        if (g == \u2603) {
            return null;
        }
        final afh c = \u2603.c();
        final afh c2 = g.c();
        amz amz = this.d[o >> 4];
        boolean b = false;
        if (amz == null) {
            if (c == afi.a) {
                return null;
            }
            final amz[] d = this.d;
            final int n3 = o >> 4;
            final amz amz2 = new amz(o >> 4 << 4, !this.i.t.o());
            d[n3] = amz2;
            amz = amz2;
            b = (o >= n2);
        }
        amz.a(\u26032, o & 0xF, \u26033, \u2603);
        if (c2 != c) {
            if (!this.i.D) {
                c2.b(this.i, \u2603, g);
            }
            else if (c2 instanceof agq) {
                this.i.t(\u2603);
            }
        }
        if (amz.b(\u26032, o & 0xF, \u26033) != c) {
            return null;
        }
        if (b) {
            this.b();
        }
        else {
            final int p = c.p();
            final int p2 = c2.p();
            if (p > 0) {
                if (o >= n2) {
                    this.d(\u26032, o + 1, \u26033);
                }
            }
            else if (o == n2 - 1) {
                this.d(\u26032, o, \u26033);
            }
            if (p != p2 && (p < p2 || this.a(ads.a, \u2603) > 0 || this.a(ads.b, \u2603) > 0)) {
                this.d(\u26032, \u26033);
            }
        }
        if (c2 instanceof agq) {
            final akw \u26034 = this.a(\u2603, amy.a.c);
            if (\u26034 != null) {
                \u26034.E();
            }
        }
        if (!this.i.D && c2 != c) {
            c.c(this.i, \u2603, \u2603);
        }
        if (c instanceof agq) {
            akw \u26034 = this.a(\u2603, amy.a.c);
            if (\u26034 == null) {
                \u26034 = ((agq)c).a(this.i, c.c(\u2603));
                this.i.a(\u2603, \u26034);
            }
            if (\u26034 != null) {
                \u26034.E();
            }
        }
        this.q = true;
        return g;
    }
    
    public int a(final ads \u2603, final cj \u2603) {
        final int n = \u2603.n() & 0xF;
        final int o = \u2603.o();
        final int n2 = \u2603.p() & 0xF;
        final amz amz = this.d[o >> 4];
        if (amz == null) {
            if (this.d(\u2603)) {
                return \u2603.c;
            }
            return 0;
        }
        else if (\u2603 == ads.a) {
            if (this.i.t.o()) {
                return 0;
            }
            return amz.d(n, o & 0xF, n2);
        }
        else {
            if (\u2603 == ads.b) {
                return amz.e(n, o & 0xF, n2);
            }
            return \u2603.c;
        }
    }
    
    public void a(final ads \u2603, final cj \u2603, final int \u2603) {
        final int n = \u2603.n() & 0xF;
        final int o = \u2603.o();
        final int n2 = \u2603.p() & 0xF;
        amz amz = this.d[o >> 4];
        if (amz == null) {
            final amz[] d = this.d;
            final int n3 = o >> 4;
            final amz amz2 = new amz(o >> 4 << 4, !this.i.t.o());
            d[n3] = amz2;
            amz = amz2;
            this.b();
        }
        this.q = true;
        if (\u2603 == ads.a) {
            if (!this.i.t.o()) {
                amz.a(n, o & 0xF, n2, \u2603);
            }
        }
        else if (\u2603 == ads.b) {
            amz.b(n, o & 0xF, n2, \u2603);
        }
    }
    
    public int a(final cj \u2603, final int \u2603) {
        final int n = \u2603.n() & 0xF;
        final int o = \u2603.o();
        final int n2 = \u2603.p() & 0xF;
        final amz amz = this.d[o >> 4];
        if (amz != null) {
            int n3 = this.i.t.o() ? 0 : amz.d(n, o & 0xF, n2);
            n3 -= \u2603;
            final int e = amz.e(n, o & 0xF, n2);
            if (e > n3) {
                n3 = e;
            }
            return n3;
        }
        if (!this.i.t.o() && \u2603 < ads.a.c) {
            return ads.a.c - \u2603;
        }
        return 0;
    }
    
    public void a(final pk \u2603) {
        this.r = true;
        final int c = ns.c(\u2603.s / 16.0);
        final int c2 = ns.c(\u2603.u / 16.0);
        if (c != this.a || c2 != this.b) {
            amy.c.warn("Wrong location! (" + c + ", " + c2 + ") should be (" + this.a + ", " + this.b + "), " + \u2603, new Object[] { \u2603 });
            \u2603.J();
        }
        int c3 = ns.c(\u2603.t / 16.0);
        if (c3 < 0) {
            c3 = 0;
        }
        if (c3 >= this.m.length) {
            c3 = this.m.length - 1;
        }
        \u2603.ad = true;
        \u2603.ae = this.a;
        \u2603.af = c3;
        \u2603.ag = this.b;
        this.m[c3].add(\u2603);
    }
    
    public void b(final pk \u2603) {
        this.a(\u2603, \u2603.af);
    }
    
    public void a(final pk \u2603, int \u2603) {
        if (\u2603 < 0) {
            \u2603 = 0;
        }
        if (\u2603 >= this.m.length) {
            \u2603 = this.m.length - 1;
        }
        this.m[\u2603].remove(\u2603);
    }
    
    public boolean d(final cj \u2603) {
        final int n = \u2603.n() & 0xF;
        final int o = \u2603.o();
        final int n2 = \u2603.p() & 0xF;
        return o >= this.j[n2 << 4 | n];
    }
    
    private akw i(final cj \u2603) {
        final afh a = this.a(\u2603);
        if (!a.z()) {
            return null;
        }
        return ((agq)a).a(this.i, this.c(\u2603));
    }
    
    public akw a(final cj \u2603, final a \u2603) {
        akw i = this.l.get(\u2603);
        if (i == null) {
            if (\u2603 == amy.a.a) {
                i = this.i(\u2603);
                this.i.a(\u2603, i);
            }
            else if (\u2603 == amy.a.b) {
                this.w.add(\u2603);
            }
        }
        else if (i.x()) {
            this.l.remove(\u2603);
            return null;
        }
        return i;
    }
    
    public void a(final akw \u2603) {
        this.a(\u2603.v(), \u2603);
        if (this.h) {
            this.i.a(\u2603);
        }
    }
    
    public void a(final cj \u2603, final akw \u2603) {
        \u2603.a(this.i);
        \u2603.a(\u2603);
        if (!(this.a(\u2603) instanceof agq)) {
            return;
        }
        if (this.l.containsKey(\u2603)) {
            this.l.get(\u2603).y();
        }
        \u2603.D();
        this.l.put(\u2603, \u2603);
    }
    
    public void e(final cj \u2603) {
        if (this.h) {
            final akw akw = this.l.remove(\u2603);
            if (akw != null) {
                akw.y();
            }
        }
    }
    
    public void c() {
        this.h = true;
        this.i.a(this.l.values());
        for (int i = 0; i < this.m.length; ++i) {
            for (final pk pk : this.m[i]) {
                pk.ah();
            }
            this.i.b(this.m[i]);
        }
    }
    
    public void d() {
        this.h = false;
        for (final akw \u2603 : this.l.values()) {
            this.i.b(\u2603);
        }
        for (int i = 0; i < this.m.length; ++i) {
            this.i.c(this.m[i]);
        }
    }
    
    public void e() {
        this.q = true;
    }
    
    public void a(final pk \u2603, final aug \u2603, final List<pk> \u2603, final Predicate<? super pk> \u2603) {
        int \u26032 = ns.c((\u2603.b - 2.0) / 16.0);
        int \u26033 = ns.c((\u2603.e + 2.0) / 16.0);
        \u26032 = ns.a(\u26032, 0, this.m.length - 1);
        \u26033 = ns.a(\u26033, 0, this.m.length - 1);
        for (int i = \u26032; i <= \u26033; ++i) {
            if (!this.m[i].isEmpty()) {
                for (pk pk : this.m[i]) {
                    if (pk.aR().b(\u2603) && pk != \u2603) {
                        if (\u2603 == null || \u2603.apply(pk)) {
                            \u2603.add(pk);
                        }
                        final pk[] ab = pk.aB();
                        if (ab == null) {
                            continue;
                        }
                        for (int j = 0; j < ab.length; ++j) {
                            pk = ab[j];
                            if (pk != \u2603 && pk.aR().b(\u2603) && (\u2603 == null || \u2603.apply(pk))) {
                                \u2603.add(pk);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public <T extends pk> void a(final Class<? extends T> \u2603, final aug \u2603, final List<T> \u2603, final Predicate<? super T> \u2603) {
        int \u26032 = ns.c((\u2603.b - 2.0) / 16.0);
        int \u26033 = ns.c((\u2603.e + 2.0) / 16.0);
        \u26032 = ns.a(\u26032, 0, this.m.length - 1);
        \u26033 = ns.a(\u26033, 0, this.m.length - 1);
        for (int i = \u26032; i <= \u26033; ++i) {
            for (final T t : this.m[i].c(\u2603)) {
                if (t.aR().b(\u2603) && (\u2603 == null || \u2603.apply((Object)t))) {
                    \u2603.add(t);
                }
            }
        }
    }
    
    public boolean a(final boolean \u2603) {
        if (\u2603) {
            if ((this.r && this.i.K() != this.s) || this.q) {
                return true;
            }
        }
        else if (this.r && this.i.K() >= this.s + 600L) {
            return true;
        }
        return this.q;
    }
    
    public Random a(final long \u2603) {
        return new Random(this.i.J() + this.a * this.a * 4987142 + this.a * 5947611 + this.b * this.b * 4392871L + this.b * 389711 ^ \u2603);
    }
    
    public boolean f() {
        return false;
    }
    
    public void a(final amv \u2603, final amv \u2603, final int \u2603, final int \u2603) {
        final boolean a = \u2603.a(\u2603, \u2603 - 1);
        final boolean a2 = \u2603.a(\u2603 + 1, \u2603);
        final boolean a3 = \u2603.a(\u2603, \u2603 + 1);
        final boolean a4 = \u2603.a(\u2603 - 1, \u2603);
        final boolean a5 = \u2603.a(\u2603 - 1, \u2603 - 1);
        final boolean a6 = \u2603.a(\u2603 + 1, \u2603 + 1);
        final boolean a7 = \u2603.a(\u2603 - 1, \u2603 + 1);
        final boolean a8 = \u2603.a(\u2603 + 1, \u2603 - 1);
        if (a2 && a3 && a6) {
            if (!this.n) {
                \u2603.a(\u2603, \u2603, \u2603);
            }
            else {
                \u2603.a(\u2603, this, \u2603, \u2603);
            }
        }
        if (a4 && a3 && a7) {
            final amy amy = \u2603.d(\u2603 - 1, \u2603);
            if (!amy.n) {
                \u2603.a(\u2603, \u2603 - 1, \u2603);
            }
            else {
                \u2603.a(\u2603, amy, \u2603 - 1, \u2603);
            }
        }
        if (a && a2 && a8) {
            final amy amy = \u2603.d(\u2603, \u2603 - 1);
            if (!amy.n) {
                \u2603.a(\u2603, \u2603, \u2603 - 1);
            }
            else {
                \u2603.a(\u2603, amy, \u2603, \u2603 - 1);
            }
        }
        if (a5 && a && a4) {
            final amy amy = \u2603.d(\u2603 - 1, \u2603 - 1);
            if (!amy.n) {
                \u2603.a(\u2603, \u2603 - 1, \u2603 - 1);
            }
            else {
                \u2603.a(\u2603, amy, \u2603 - 1, \u2603 - 1);
            }
        }
    }
    
    public cj h(final cj \u2603) {
        final int n = \u2603.n() & 0xF;
        final int n2 = \u2603.p() & 0xF;
        final int n3 = n | n2 << 4;
        cj b = new cj(\u2603.n(), this.f[n3], \u2603.p());
        if (b.o() == -999) {
            final int \u26032 = this.g() + 15;
            b = new cj(\u2603.n(), \u26032, \u2603.p());
            int n4 = -1;
            while (b.o() > 0 && n4 == -1) {
                final afh a = this.a(b);
                final arm t = a.t();
                if (!t.c() && !t.d()) {
                    b = b.b();
                }
                else {
                    n4 = b.o() + 1;
                }
            }
            this.f[n3] = n4;
        }
        return new cj(\u2603.n(), this.f[n3], \u2603.p());
    }
    
    public void b(final boolean \u2603) {
        if (this.k && !this.i.t.o() && !\u2603) {
            this.h(this.i.D);
        }
        this.p = true;
        if (!this.o && this.n) {
            this.n();
        }
        while (!this.w.isEmpty()) {
            final cj cj = this.w.poll();
            if (this.a(cj, amy.a.c) == null && this.a(cj).z()) {
                final akw i = this.i(cj);
                this.i.a(cj, i);
                this.i.b(cj, cj);
            }
        }
    }
    
    public boolean i() {
        return this.p && this.n && this.o;
    }
    
    public adg j() {
        return new adg(this.a, this.b);
    }
    
    public boolean c(int \u2603, int \u2603) {
        if (\u2603 < 0) {
            \u2603 = 0;
        }
        if (\u2603 >= 256) {
            \u2603 = 255;
        }
        for (int i = \u2603; i <= \u2603; i += 16) {
            final amz amz = this.d[i >> 4];
            if (amz != null && !amz.a()) {
                return false;
            }
        }
        return true;
    }
    
    public void a(final amz[] \u2603) {
        if (this.d.length != \u2603.length) {
            amy.c.warn("Could not set level chunk sections, array length is " + \u2603.length + " instead of " + this.d.length);
            return;
        }
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i] = \u2603[i];
        }
    }
    
    public void a(final byte[] \u2603, final int \u2603, final boolean \u2603) {
        int n = 0;
        final boolean \u26032 = !this.i.t.o();
        for (int i = 0; i < this.d.length; ++i) {
            if ((\u2603 & 1 << i) != 0x0) {
                if (this.d[i] == null) {
                    this.d[i] = new amz(i << 4, \u26032);
                }
                final char[] g = this.d[i].g();
                for (int j = 0; j < g.length; ++j) {
                    g[j] = (char)((\u2603[n + 1] & 0xFF) << 8 | (\u2603[n] & 0xFF));
                    n += 2;
                }
            }
            else if (\u2603 && this.d[i] != null) {
                this.d[i] = null;
            }
        }
        for (int i = 0; i < this.d.length; ++i) {
            if ((\u2603 & 1 << i) != 0x0 && this.d[i] != null) {
                final amw amw = this.d[i].h();
                System.arraycopy(\u2603, n, amw.a(), 0, amw.a().length);
                n += amw.a().length;
            }
        }
        if (\u26032) {
            for (int i = 0; i < this.d.length; ++i) {
                if ((\u2603 & 1 << i) != 0x0 && this.d[i] != null) {
                    final amw amw = this.d[i].i();
                    System.arraycopy(\u2603, n, amw.a(), 0, amw.a().length);
                    n += amw.a().length;
                }
            }
        }
        if (\u2603) {
            System.arraycopy(\u2603, n, this.e, 0, this.e.length);
            n += this.e.length;
        }
        for (int i = 0; i < this.d.length; ++i) {
            if (this.d[i] != null && (\u2603 & 1 << i) != 0x0) {
                this.d[i].e();
            }
        }
        this.o = true;
        this.n = true;
        this.a();
        for (final akw akw : this.l.values()) {
            akw.E();
        }
    }
    
    public ady a(final cj \u2603, final aec \u2603) {
        final int n = \u2603.n() & 0xF;
        final int n2 = \u2603.p() & 0xF;
        int az = this.e[n2 << 4 | n] & 0xFF;
        if (az == 255) {
            final ady ady = \u2603.a(\u2603, ady.q);
            az = ady.az;
            this.e[n2 << 4 | n] = (byte)(az & 0xFF);
        }
        final ady ady = ady.e(az);
        if (ady == null) {
            return ady.q;
        }
        return ady;
    }
    
    public byte[] k() {
        return this.e;
    }
    
    public void a(final byte[] \u2603) {
        if (this.e.length != \u2603.length) {
            amy.c.warn("Could not set level chunk biomes, array length is " + \u2603.length + " instead of " + this.e.length);
            return;
        }
        for (int i = 0; i < this.e.length; ++i) {
            this.e[i] = \u2603[i];
        }
    }
    
    public void l() {
        this.v = 0;
    }
    
    public void m() {
        final cj cj = new cj(this.a << 4, 0, this.b << 4);
        for (int i = 0; i < 8; ++i) {
            if (this.v >= 4096) {
                return;
            }
            final int n = this.v % 16;
            final int n2 = this.v / 16 % 16;
            final int n3 = this.v / 256;
            ++this.v;
            for (int j = 0; j < 16; ++j) {
                final cj a = cj.a(n2, (n << 4) + j, n3);
                final boolean b = j == 0 || j == 15 || n2 == 0 || n2 == 15 || n3 == 0 || n3 == 15;
                if ((this.d[n] == null && b) || (this.d[n] != null && this.d[n].b(n2, j, n3).t() == arm.a)) {
                    for (final cq \u2603 : cq.values()) {
                        final cj a2 = a.a(\u2603);
                        if (this.i.p(a2).c().r() > 0) {
                            this.i.x(a2);
                        }
                    }
                    this.i.x(a);
                }
            }
        }
    }
    
    public void n() {
        this.n = true;
        this.o = true;
        final cj cj = new cj(this.a << 4, 0, this.b << 4);
        if (!this.i.t.o()) {
            if (this.i.a(cj.a(-1, 0, -1), cj.a(16, this.i.F(), 16))) {
            Label_0121:
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        if (!this.e(i, j)) {
                            this.o = false;
                            break Label_0121;
                        }
                    }
                }
                if (this.o) {
                    for (final cq \u2603 : cq.c.a) {
                        final int \u26032 = (\u2603.c() == cq.b.a) ? 16 : 1;
                        this.i.f(cj.a(\u2603, \u26032)).a(\u2603.d());
                    }
                    this.y();
                }
            }
            else {
                this.o = false;
            }
        }
    }
    
    private void y() {
        for (int i = 0; i < this.g.length; ++i) {
            this.g[i] = true;
        }
        this.h(false);
    }
    
    private void a(final cq \u2603) {
        if (!this.n) {
            return;
        }
        if (\u2603 == cq.f) {
            for (int i = 0; i < 16; ++i) {
                this.e(15, i);
            }
        }
        else if (\u2603 == cq.e) {
            for (int i = 0; i < 16; ++i) {
                this.e(0, i);
            }
        }
        else if (\u2603 == cq.d) {
            for (int i = 0; i < 16; ++i) {
                this.e(i, 15);
            }
        }
        else if (\u2603 == cq.c) {
            for (int i = 0; i < 16; ++i) {
                this.e(i, 0);
            }
        }
    }
    
    private boolean e(final int \u2603, final int \u2603) {
        final int g = this.g();
        boolean b = false;
        boolean b2 = false;
        final cj.a a = new cj.a((this.a << 4) + \u2603, 0, (this.b << 4) + \u2603);
        for (int i = g + 16 - 1; i > this.i.F() || (i > 0 && !b2); --i) {
            a.c(a.n(), i, a.p());
            final int b3 = this.b(a);
            if (b3 == 255 && a.o() < this.i.F()) {
                b2 = true;
            }
            if (!b && b3 > 0) {
                b = true;
            }
            else if (b && b3 == 0 && !this.i.x(a)) {
                return false;
            }
        }
        for (int i = a.o(); i > 0; --i) {
            a.c(a.n(), i, a.p());
            if (this.a(a).r() > 0) {
                this.i.x(a);
            }
        }
        return true;
    }
    
    public boolean o() {
        return this.h;
    }
    
    public void c(final boolean \u2603) {
        this.h = \u2603;
    }
    
    public adm p() {
        return this.i;
    }
    
    public int[] q() {
        return this.j;
    }
    
    public void a(final int[] \u2603) {
        if (this.j.length != \u2603.length) {
            amy.c.warn("Could not set level chunk heightmap, array length is " + \u2603.length + " instead of " + this.j.length);
            return;
        }
        for (int i = 0; i < this.j.length; ++i) {
            this.j[i] = \u2603[i];
        }
    }
    
    public Map<cj, akw> r() {
        return this.l;
    }
    
    public ne<pk>[] s() {
        return this.m;
    }
    
    public boolean t() {
        return this.n;
    }
    
    public void d(final boolean \u2603) {
        this.n = \u2603;
    }
    
    public boolean u() {
        return this.o;
    }
    
    public void e(final boolean \u2603) {
        this.o = \u2603;
    }
    
    public void f(final boolean \u2603) {
        this.q = \u2603;
    }
    
    public void g(final boolean \u2603) {
        this.r = \u2603;
    }
    
    public void b(final long \u2603) {
        this.s = \u2603;
    }
    
    public int v() {
        return this.t;
    }
    
    public long w() {
        return this.u;
    }
    
    public void c(final long \u2603) {
        this.u = \u2603;
    }
    
    static {
        c = LogManager.getLogger();
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
