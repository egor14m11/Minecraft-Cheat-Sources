import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class xi
{
    public List<zx> b;
    public List<yg> c;
    public int d;
    private short a;
    private int f;
    private int g;
    private final Set<yg> h;
    protected List<xn> e;
    private Set<wn> i;
    
    public xi() {
        this.b = (List<zx>)Lists.newArrayList();
        this.c = (List<yg>)Lists.newArrayList();
        this.f = -1;
        this.h = (Set<yg>)Sets.newHashSet();
        this.e = (List<xn>)Lists.newArrayList();
        this.i = (Set<wn>)Sets.newHashSet();
    }
    
    protected yg a(final yg \u2603) {
        \u2603.e = this.c.size();
        this.c.add(\u2603);
        this.b.add(null);
        return \u2603;
    }
    
    public void a(final xn \u2603) {
        if (this.e.contains(\u2603)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.e.add(\u2603);
        \u2603.a(this, this.a());
        this.b();
    }
    
    public void b(final xn \u2603) {
        this.e.remove(\u2603);
    }
    
    public List<zx> a() {
        final List<zx> arrayList = (List<zx>)Lists.newArrayList();
        for (int i = 0; i < this.c.size(); ++i) {
            arrayList.add(this.c.get(i).d());
        }
        return arrayList;
    }
    
    public void b() {
        for (int i = 0; i < this.c.size(); ++i) {
            final zx d = this.c.get(i).d();
            zx \u2603 = this.b.get(i);
            if (!zx.b(\u2603, d)) {
                \u2603 = ((d == null) ? null : d.k());
                this.b.set(i, \u2603);
                for (int j = 0; j < this.e.size(); ++j) {
                    this.e.get(j).a(this, i, \u2603);
                }
            }
        }
    }
    
    public boolean a(final wn \u2603, final int \u2603) {
        return false;
    }
    
    public yg a(final og \u2603, final int \u2603) {
        for (int i = 0; i < this.c.size(); ++i) {
            final yg yg = this.c.get(i);
            if (yg.a(\u2603, \u2603)) {
                return yg;
            }
        }
        return null;
    }
    
    public yg a(final int \u2603) {
        return this.c.get(\u2603);
    }
    
    public zx b(final wn \u2603, final int \u2603) {
        final yg yg = this.c.get(\u2603);
        if (yg != null) {
            return yg.d();
        }
        return null;
    }
    
    public zx a(final int \u2603, final int \u2603, final int \u2603, final wn \u2603) {
        zx zx = null;
        final wm bi = \u2603.bi;
        if (\u2603 == 5) {
            final int g = this.g;
            this.g = c(\u2603);
            if ((g != 1 || this.g != 2) && g != this.g) {
                this.d();
            }
            else if (bi.p() == null) {
                this.d();
            }
            else if (this.g == 0) {
                this.f = b(\u2603);
                if (a(this.f, \u2603)) {
                    this.g = 1;
                    this.h.clear();
                }
                else {
                    this.d();
                }
            }
            else if (this.g == 1) {
                final yg yg = this.c.get(\u2603);
                if (yg != null && a(yg, bi.p(), true) && yg.a(bi.p()) && bi.p().b > this.h.size() && this.b(yg)) {
                    this.h.add(yg);
                }
            }
            else if (this.g == 2) {
                if (!this.h.isEmpty()) {
                    zx \u26032 = bi.p().k();
                    int b = bi.p().b;
                    for (final yg yg2 : this.h) {
                        if (yg2 != null && a(yg2, bi.p(), true) && yg2.a(bi.p()) && bi.p().b >= this.h.size() && this.b(yg2)) {
                            final zx k = \u26032.k();
                            final int \u26033 = yg2.e() ? yg2.d().b : 0;
                            a(this.h, this.f, k, \u26033);
                            if (k.b > k.c()) {
                                k.b = k.c();
                            }
                            if (k.b > yg2.b(k)) {
                                k.b = yg2.b(k);
                            }
                            b -= k.b - \u26033;
                            yg2.d(k);
                        }
                    }
                    \u26032.b = b;
                    if (\u26032.b <= 0) {
                        \u26032 = null;
                    }
                    bi.b(\u26032);
                }
                this.d();
            }
            else {
                this.d();
            }
        }
        else if (this.g != 0) {
            this.d();
        }
        else if ((\u2603 == 0 || \u2603 == 1) && (\u2603 == 0 || \u2603 == 1)) {
            if (\u2603 == -999) {
                if (bi.p() != null) {
                    if (\u2603 == 0) {
                        \u2603.a(bi.p(), true);
                        bi.b((zx)null);
                    }
                    if (\u2603 == 1) {
                        \u2603.a(bi.p().a(1), true);
                        if (bi.p().b == 0) {
                            bi.b((zx)null);
                        }
                    }
                }
            }
            else if (\u2603 == 1) {
                if (\u2603 < 0) {
                    return null;
                }
                final yg yg3 = this.c.get(\u2603);
                if (yg3 != null && yg3.a(\u2603)) {
                    final zx \u26032 = this.b(\u2603, \u2603);
                    if (\u26032 != null) {
                        final zw b2 = \u26032.b();
                        zx = \u26032.k();
                        if (yg3.d() != null && yg3.d().b() == b2) {
                            this.a(\u2603, \u2603, true, \u2603);
                        }
                    }
                }
            }
            else {
                if (\u2603 < 0) {
                    return null;
                }
                final yg yg3 = this.c.get(\u2603);
                if (yg3 != null) {
                    zx \u26032 = yg3.d();
                    final zx p = bi.p();
                    if (\u26032 != null) {
                        zx = \u26032.k();
                    }
                    if (\u26032 == null) {
                        if (p != null && yg3.a(p)) {
                            int n = (\u2603 == 0) ? p.b : 1;
                            if (n > yg3.b(p)) {
                                n = yg3.b(p);
                            }
                            if (p.b >= n) {
                                yg3.d(p.a(n));
                            }
                            if (p.b == 0) {
                                bi.b((zx)null);
                            }
                        }
                    }
                    else if (yg3.a(\u2603)) {
                        if (p == null) {
                            final int n = (\u2603 == 0) ? \u26032.b : ((\u26032.b + 1) / 2);
                            final zx \u26034 = yg3.a(n);
                            bi.b(\u26034);
                            if (\u26032.b == 0) {
                                yg3.d(null);
                            }
                            yg3.a(\u2603, bi.p());
                        }
                        else if (yg3.a(p)) {
                            if (\u26032.b() != p.b() || \u26032.i() != p.i() || !zx.a(\u26032, p)) {
                                if (p.b <= yg3.b(p)) {
                                    yg3.d(p);
                                    bi.b(\u26032);
                                }
                            }
                            else {
                                int n = (\u2603 == 0) ? p.b : 1;
                                if (n > yg3.b(p) - \u26032.b) {
                                    n = yg3.b(p) - \u26032.b;
                                }
                                if (n > p.c() - \u26032.b) {
                                    n = p.c() - \u26032.b;
                                }
                                p.a(n);
                                if (p.b == 0) {
                                    bi.b((zx)null);
                                }
                                final zx zx2 = \u26032;
                                zx2.b += n;
                            }
                        }
                        else if (\u26032.b() == p.b() && p.c() > 1 && (!\u26032.f() || \u26032.i() == p.i()) && zx.a(\u26032, p)) {
                            final int n = \u26032.b;
                            if (n > 0 && n + p.b <= p.c()) {
                                final zx zx3 = p;
                                zx3.b += n;
                                \u26032 = yg3.a(n);
                                if (\u26032.b == 0) {
                                    yg3.d(null);
                                }
                                yg3.a(\u2603, bi.p());
                            }
                        }
                    }
                    yg3.f();
                }
            }
        }
        else if (\u2603 == 2 && \u2603 >= 0 && \u2603 < 9) {
            final yg yg3 = this.c.get(\u2603);
            if (yg3.a(\u2603)) {
                final zx \u26032 = bi.a(\u2603);
                boolean b3 = \u26032 == null || (yg3.d == bi && yg3.a(\u26032));
                int n = -1;
                if (!b3) {
                    n = bi.j();
                    b3 |= (n > -1);
                }
                if (yg3.e() && b3) {
                    final zx \u26034 = yg3.d();
                    bi.a(\u2603, \u26034.k());
                    if ((yg3.d == bi && yg3.a(\u26032)) || \u26032 == null) {
                        yg3.a(\u26034.b);
                        yg3.d(\u26032);
                        yg3.a(\u2603, \u26034);
                    }
                    else if (n > -1) {
                        bi.a(\u26032);
                        yg3.a(\u26034.b);
                        yg3.d(null);
                        yg3.a(\u2603, \u26034);
                    }
                }
                else if (!yg3.e() && \u26032 != null && yg3.a(\u26032)) {
                    bi.a(\u2603, null);
                    yg3.d(\u26032);
                }
            }
        }
        else if (\u2603 == 3 && \u2603.bA.d && bi.p() == null && \u2603 >= 0) {
            final yg yg3 = this.c.get(\u2603);
            if (yg3 != null && yg3.e()) {
                final zx \u26032 = yg3.d().k();
                \u26032.b = \u26032.c();
                bi.b(\u26032);
            }
        }
        else if (\u2603 == 4 && bi.p() == null && \u2603 >= 0) {
            final yg yg3 = this.c.get(\u2603);
            if (yg3 != null && yg3.e() && yg3.a(\u2603)) {
                final zx \u26032 = yg3.a((\u2603 == 0) ? 1 : yg3.d().b);
                yg3.a(\u2603, \u26032);
                \u2603.a(\u26032, true);
            }
        }
        else if (\u2603 == 6 && \u2603 >= 0) {
            final yg yg3 = this.c.get(\u2603);
            final zx \u26032 = bi.p();
            if (\u26032 != null && (yg3 == null || !yg3.e() || !yg3.a(\u2603))) {
                final int b = (\u2603 == 0) ? 0 : (this.c.size() - 1);
                final int n = (\u2603 == 0) ? 1 : -1;
                for (int i = 0; i < 2; ++i) {
                    for (int n2 = b; n2 >= 0 && n2 < this.c.size() && \u26032.b < \u26032.c(); n2 += n) {
                        final yg yg4 = this.c.get(n2);
                        if (yg4.e() && a(yg4, \u26032, true) && yg4.a(\u2603) && this.a(\u26032, yg4)) {
                            if (i != 0 || yg4.d().b != yg4.d().c()) {
                                final int min = Math.min(\u26032.c() - \u26032.b, yg4.d().b);
                                final zx a = yg4.a(min);
                                final zx zx4 = \u26032;
                                zx4.b += min;
                                if (a.b <= 0) {
                                    yg4.d(null);
                                }
                                yg4.a(\u2603, a);
                            }
                        }
                    }
                }
            }
            this.b();
        }
        return zx;
    }
    
    public boolean a(final zx \u2603, final yg \u2603) {
        return true;
    }
    
    protected void a(final int \u2603, final int \u2603, final boolean \u2603, final wn \u2603) {
        this.a(\u2603, \u2603, 1, \u2603);
    }
    
    public void b(final wn \u2603) {
        final wm bi = \u2603.bi;
        if (bi.p() != null) {
            \u2603.a(bi.p(), false);
            bi.b((zx)null);
        }
    }
    
    public void a(final og \u2603) {
        this.b();
    }
    
    public void a(final int \u2603, final zx \u2603) {
        this.a(\u2603).d(\u2603);
    }
    
    public void a(final zx[] \u2603) {
        for (int i = 0; i < \u2603.length; ++i) {
            this.a(i).d(\u2603[i]);
        }
    }
    
    public void b(final int \u2603, final int \u2603) {
    }
    
    public short a(final wm \u2603) {
        return (short)(++this.a);
    }
    
    public boolean c(final wn \u2603) {
        return !this.i.contains(\u2603);
    }
    
    public void a(final wn \u2603, final boolean \u2603) {
        if (\u2603) {
            this.i.remove(\u2603);
        }
        else {
            this.i.add(\u2603);
        }
    }
    
    public abstract boolean a(final wn p0);
    
    protected boolean a(final zx \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        boolean b = false;
        int n = \u2603;
        if (\u2603) {
            n = \u2603 - 1;
        }
        if (\u2603.d()) {
            while (\u2603.b > 0 && ((!\u2603 && n < \u2603) || (\u2603 && n >= \u2603))) {
                final yg yg = this.c.get(n);
                final zx \u26032 = yg.d();
                if (\u26032 != null && \u26032.b() == \u2603.b() && (!\u2603.f() || \u2603.i() == \u26032.i()) && zx.a(\u2603, \u26032)) {
                    final int b2 = \u26032.b + \u2603.b;
                    if (b2 <= \u2603.c()) {
                        \u2603.b = 0;
                        \u26032.b = b2;
                        yg.f();
                        b = true;
                    }
                    else if (\u26032.b < \u2603.c()) {
                        \u2603.b -= \u2603.c() - \u26032.b;
                        \u26032.b = \u2603.c();
                        yg.f();
                        b = true;
                    }
                }
                if (\u2603) {
                    --n;
                }
                else {
                    ++n;
                }
            }
        }
        if (\u2603.b > 0) {
            if (\u2603) {
                n = \u2603 - 1;
            }
            else {
                n = \u2603;
            }
            while ((!\u2603 && n < \u2603) || (\u2603 && n >= \u2603)) {
                final yg yg = this.c.get(n);
                final zx \u26032 = yg.d();
                if (\u26032 == null) {
                    yg.d(\u2603.k());
                    yg.f();
                    \u2603.b = 0;
                    b = true;
                    break;
                }
                if (\u2603) {
                    --n;
                }
                else {
                    ++n;
                }
            }
        }
        return b;
    }
    
    public static int b(final int \u2603) {
        return \u2603 >> 2 & 0x3;
    }
    
    public static int c(final int \u2603) {
        return \u2603 & 0x3;
    }
    
    public static int d(final int \u2603, final int \u2603) {
        return (\u2603 & 0x3) | (\u2603 & 0x3) << 2;
    }
    
    public static boolean a(final int \u2603, final wn \u2603) {
        return \u2603 == 0 || \u2603 == 1 || (\u2603 == 2 && \u2603.bA.d);
    }
    
    protected void d() {
        this.g = 0;
        this.h.clear();
    }
    
    public static boolean a(final yg \u2603, final zx \u2603, final boolean \u2603) {
        boolean b = \u2603 == null || !\u2603.e();
        if (\u2603 != null && \u2603.e() && \u2603 != null && \u2603.a(\u2603.d()) && zx.a(\u2603.d(), \u2603)) {
            b |= (\u2603.d().b + (\u2603 ? 0 : \u2603.b) <= \u2603.c());
        }
        return b;
    }
    
    public static void a(final Set<yg> \u2603, final int \u2603, final zx \u2603, final int \u2603) {
        switch (\u2603) {
            case 0: {
                \u2603.b = ns.d(\u2603.b / (float)\u2603.size());
                break;
            }
            case 1: {
                \u2603.b = 1;
                break;
            }
            case 2: {
                \u2603.b = \u2603.b().j();
                break;
            }
        }
        \u2603.b += \u2603;
    }
    
    public boolean b(final yg \u2603) {
        return true;
    }
    
    public static int a(final akw \u2603) {
        if (\u2603 instanceof og) {
            return b((og)\u2603);
        }
        return 0;
    }
    
    public static int b(final og \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        int n = 0;
        float n2 = 0.0f;
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                n2 += a.b / (float)Math.min(\u2603.q_(), a.c());
                ++n;
            }
        }
        n2 /= \u2603.o_();
        return ns.d(n2 * 14.0f) + ((n > 0) ? 1 : 0);
    }
}
