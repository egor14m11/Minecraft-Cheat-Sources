import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class adi
{
    private final boolean a;
    private final boolean b;
    private final Random c;
    private final adm d;
    private final double e;
    private final double f;
    private final double g;
    private final pk h;
    private final float i;
    private final List<cj> j;
    private final Map<wn, aui> k;
    
    public adi(final adm \u2603, final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final List<cj> \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, false, true, \u2603);
    }
    
    public adi(final adm \u2603, final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boolean \u2603, final boolean \u2603, final List<cj> \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.j.addAll(\u2603);
    }
    
    public adi(final adm \u2603, final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boolean \u2603, final boolean \u2603) {
        this.c = new Random();
        this.j = (List<cj>)Lists.newArrayList();
        this.k = (Map<wn, aui>)Maps.newHashMap();
        this.d = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public void a() {
        final Set<cj> hashSet = (Set<cj>)Sets.newHashSet();
        final int n = 16;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        double n2 = i / 15.0f * 2.0f - 1.0f;
                        double n3 = j / 15.0f * 2.0f - 1.0f;
                        double n4 = k / 15.0f * 2.0f - 1.0f;
                        final double sqrt = Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
                        n2 /= sqrt;
                        n3 /= sqrt;
                        n4 /= sqrt;
                        float \u2603 = this.i * (0.7f + this.d.s.nextFloat() * 0.6f);
                        double e = this.e;
                        double f = this.f;
                        double g = this.g;
                        final float n5 = 0.3f;
                        while (\u2603 > 0.0f) {
                            final cj \u26032 = new cj(e, f, g);
                            final alz p = this.d.p(\u26032);
                            if (p.c().t() != arm.a) {
                                final float n6 = (this.h != null) ? this.h.a(this, this.d, \u26032, p) : p.c().a((pk)null);
                                \u2603 -= (n6 + 0.3f) * 0.3f;
                            }
                            if (\u2603 > 0.0f && (this.h == null || this.h.a(this, this.d, \u26032, p, \u2603))) {
                                hashSet.add(\u26032);
                            }
                            e += n2 * 0.30000001192092896;
                            f += n3 * 0.30000001192092896;
                            g += n4 * 0.30000001192092896;
                            \u2603 -= 0.22500001f;
                        }
                    }
                }
            }
        }
        this.j.addAll(hashSet);
        final float n7 = this.i * 2.0f;
        int j = ns.c(this.e - n7 - 1.0);
        int k = ns.c(this.e + n7 + 1.0);
        final int c = ns.c(this.f - n7 - 1.0);
        final int c2 = ns.c(this.f + n7 + 1.0);
        final int c3 = ns.c(this.g - n7 - 1.0);
        final int c4 = ns.c(this.g + n7 + 1.0);
        final List<pk> b = this.d.b(this.h, new aug(j, c, c3, k, c2, c4));
        final aui \u26033 = new aui(this.e, this.f, this.g);
        for (int l = 0; l < b.size(); ++l) {
            final pk \u26034 = b.get(l);
            if (!\u26034.aW()) {
                final double n8 = \u26034.f(this.e, this.f, this.g) / n7;
                if (n8 <= 1.0) {
                    double n9 = \u26034.s - this.e;
                    double n10 = \u26034.t + \u26034.aS() - this.f;
                    double n11 = \u26034.u - this.g;
                    final double n12 = ns.a(n9 * n9 + n10 * n10 + n11 * n11);
                    if (n12 != 0.0) {
                        n9 /= n12;
                        n10 /= n12;
                        n11 /= n12;
                        final double n13 = this.d.a(\u26033, \u26034.aR());
                        final double \u26035 = (1.0 - n8) * n13;
                        \u26034.a(ow.a(this), (float)(int)((\u26035 * \u26035 + \u26035) / 2.0 * 8.0 * n7 + 1.0));
                        final double a = acr.a(\u26034, \u26035);
                        final pk pk = \u26034;
                        pk.v += n9 * a;
                        final pk pk2 = \u26034;
                        pk2.w += n10 * a;
                        final pk pk3 = \u26034;
                        pk3.x += n11 * a;
                        if (\u26034 instanceof wn && !((wn)\u26034).bA.a) {
                            this.k.put((wn)\u26034, new aui(n9 * \u26035, n10 * \u26035, n11 * \u26035));
                        }
                    }
                }
            }
        }
    }
    
    public void a(final boolean \u2603) {
        this.d.a(this.e, this.f, this.g, "random.explode", 4.0f, (1.0f + (this.d.s.nextFloat() - this.d.s.nextFloat()) * 0.2f) * 0.7f);
        if (this.i < 2.0f || !this.b) {
            this.d.a(cy.b, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        }
        else {
            this.d.a(cy.c, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.b) {
            for (final cj \u26032 : this.j) {
                final afh c = this.d.p(\u26032).c();
                if (\u2603) {
                    final double \u26033 = \u26032.n() + this.d.s.nextFloat();
                    final double \u26034 = \u26032.o() + this.d.s.nextFloat();
                    final double \u26035 = \u26032.p() + this.d.s.nextFloat();
                    double n = \u26033 - this.e;
                    double n2 = \u26034 - this.f;
                    double n3 = \u26035 - this.g;
                    final double n4 = ns.a(n * n + n2 * n2 + n3 * n3);
                    n /= n4;
                    n2 /= n4;
                    n3 /= n4;
                    double n5 = 0.5 / (n4 / this.i + 0.1);
                    n5 *= this.d.s.nextFloat() * this.d.s.nextFloat() + 0.3f;
                    n *= n5;
                    n2 *= n5;
                    n3 *= n5;
                    this.d.a(cy.a, (\u26033 + this.e * 1.0) / 2.0, (\u26034 + this.f * 1.0) / 2.0, (\u26035 + this.g * 1.0) / 2.0, n, n2, n3, new int[0]);
                    this.d.a(cy.l, \u26033, \u26034, \u26035, n, n2, n3, new int[0]);
                }
                if (c.t() != arm.a) {
                    if (c.a(this)) {
                        c.a(this.d, \u26032, this.d.p(\u26032), 1.0f / this.i, 0);
                    }
                    this.d.a(\u26032, afi.a.Q(), 3);
                    c.a(this.d, \u26032, this);
                }
            }
        }
        if (this.a) {
            for (final cj \u26032 : this.j) {
                if (this.d.p(\u26032).c().t() == arm.a && this.d.p(\u26032.b()).c().o() && this.c.nextInt(3) == 0) {
                    this.d.a(\u26032, afi.ab.Q());
                }
            }
        }
    }
    
    public Map<wn, aui> b() {
        return this.k;
    }
    
    public pr c() {
        if (this.h == null) {
            return null;
        }
        if (this.h instanceof vj) {
            return ((vj)this.h).j();
        }
        if (this.h instanceof pr) {
            return (pr)this.h;
        }
        return null;
    }
    
    public void d() {
        this.j.clear();
    }
    
    public List<cj> e() {
        return this.j;
    }
}
