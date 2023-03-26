import java.util.List;
import com.google.common.collect.Multiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import com.google.common.collect.HashMultiset;

// 
// Decompiled by Procyon v0.5.36
// 

public class aab extends yy
{
    protected aab() {
        this.a(true);
    }
    
    public static atg a(final int \u2603, final adm \u2603) {
        final String string = "map_" + \u2603;
        atg \u26032 = (atg)\u2603.a(atg.class, string);
        if (\u26032 == null) {
            \u26032 = new atg(string);
            \u2603.a(string, \u26032);
        }
        return \u26032;
    }
    
    public atg a(final zx \u2603, final adm \u2603) {
        String \u26032 = "map_" + \u2603.i();
        atg \u26033 = (atg)\u2603.a(atg.class, \u26032);
        if (\u26033 == null && !\u2603.D) {
            \u2603.b(\u2603.b("map"));
            \u26032 = "map_" + \u2603.i();
            \u26033 = new atg(\u26032);
            \u26033.e = 3;
            \u26033.a(\u2603.P().c(), \u2603.P().e(), \u26033.e);
            \u26033.d = (byte)\u2603.t.q();
            \u26033.c();
            \u2603.a(\u26032, \u26033);
        }
        return \u26033;
    }
    
    public void a(final adm \u2603, final pk \u2603, final atg \u2603) {
        if (\u2603.t.q() != \u2603.d || !(\u2603 instanceof wn)) {
            return;
        }
        final int n = 1 << \u2603.e;
        final int b = \u2603.b;
        final int c = \u2603.c;
        final int n2 = ns.c(\u2603.s - b) / n + 64;
        final int n3 = ns.c(\u2603.u - c) / n + 64;
        int n4 = 128 / n;
        if (\u2603.t.o()) {
            n4 /= 2;
        }
        final atg.a a2;
        final atg.a a = a2 = \u2603.a((wn)\u2603);
        ++a2.b;
        boolean b2 = false;
        for (int i = n2 - n4 + 1; i < n2 + n4; ++i) {
            if ((i & 0xF) == (a.b & 0xF) || b2) {
                b2 = false;
                double n5 = 0.0;
                for (int j = n3 - n4 - 1; j < n3 + n4; ++j) {
                    if (i >= 0 && j >= -1 && i < 128) {
                        if (j < 128) {
                            final int n6 = i - n2;
                            final int n7 = j - n3;
                            final boolean b3 = n6 * n6 + n7 * n7 > (n4 - 2) * (n4 - 2);
                            final int \u26032 = (b / n + i - 64) * n;
                            final int \u26033 = (c / n + j - 64) * n;
                            final Multiset<arn> create = (Multiset<arn>)HashMultiset.create();
                            final amy f = \u2603.f(new cj(\u26032, 0, \u26033));
                            if (!f.f()) {
                                final int n8 = \u26032 & 0xF;
                                final int n9 = \u26033 & 0xF;
                                int n10 = 0;
                                double n11 = 0.0;
                                if (\u2603.t.o()) {
                                    int n12 = \u26032 + \u26033 * 231871;
                                    n12 = n12 * n12 * 31287121 + n12 * 11;
                                    if ((n12 >> 20 & 0x1) == 0x0) {
                                        create.add(afi.d.g(afi.d.Q().a(agf.a, agf.a.a)), 10);
                                    }
                                    else {
                                        create.add(afi.b.g(afi.b.Q().a(ajy.a, ajy.a.a)), 100);
                                    }
                                    n11 = 100.0;
                                }
                                else {
                                    final cj.a a3 = new cj.a();
                                    for (int k = 0; k < n; ++k) {
                                        for (int l = 0; l < n; ++l) {
                                            int \u26034 = f.b(k + n8, l + n9) + 1;
                                            alz alz = afi.a.Q();
                                            if (\u26034 > 1) {
                                                do {
                                                    --\u26034;
                                                    alz = f.g(a3.c(k + n8, \u26034, l + n9));
                                                } while (alz.c().g(alz) == arn.b && \u26034 > 0);
                                                if (\u26034 > 0 && alz.c().t().d()) {
                                                    int n13 = \u26034 - 1;
                                                    afh a4;
                                                    do {
                                                        a4 = f.a(k + n8, n13--, l + n9);
                                                        ++n10;
                                                    } while (n13 > 0 && a4.t().d());
                                                }
                                            }
                                            n11 += \u26034 / (double)(n * n);
                                            create.add(alz.c().g(alz));
                                        }
                                    }
                                }
                                n10 /= n * n;
                                double n14 = (n11 - n5) * 4.0 / (n + 4) + ((i + j & 0x1) - 0.5) * 0.4;
                                int l = 1;
                                if (n14 > 0.6) {
                                    l = 2;
                                }
                                if (n14 < -0.6) {
                                    l = 0;
                                }
                                final arn arn = Iterables.getFirst(Multisets.copyHighestCountFirst(create), arn.b);
                                if (arn == arn.n) {
                                    n14 = n10 * 0.1 + (i + j & 0x1) * 0.2;
                                    l = 1;
                                    if (n14 < 0.5) {
                                        l = 2;
                                    }
                                    if (n14 > 0.9) {
                                        l = 0;
                                    }
                                }
                                n5 = n11;
                                if (j >= 0) {
                                    if (n6 * n6 + n7 * n7 < n4 * n4) {
                                        if (!b3 || (i + j & 0x1) != 0x0) {
                                            final byte b4 = \u2603.f[i + j * 128];
                                            final byte b5 = (byte)(arn.M * 4 + l);
                                            if (b4 != b5) {
                                                \u2603.f[i + j * 128] = b5;
                                                \u2603.a(i, j);
                                                b2 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void a(final zx \u2603, final adm \u2603, final pk \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603.D) {
            return;
        }
        final atg a = this.a(\u2603, \u2603);
        if (\u2603 instanceof wn) {
            final wn \u26032 = (wn)\u2603;
            a.a(\u26032, \u2603);
        }
        if (\u2603) {
            this.a(\u2603, \u2603, a);
        }
    }
    
    @Override
    public ff c(final zx \u2603, final adm \u2603, final wn \u2603) {
        return this.a(\u2603, \u2603).a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void d(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.n() && \u2603.o().n("map_is_scaling")) {
            final atg a = zy.bd.a(\u2603, \u2603);
            \u2603.b(\u2603.b("map"));
            final atg \u26032 = new atg("map_" + \u2603.i());
            \u26032.e = (byte)(a.e + 1);
            if (\u26032.e > 4) {
                \u26032.e = 4;
            }
            \u26032.a(a.b, a.c, \u26032.e);
            \u26032.d = a.d;
            \u26032.c();
            \u2603.a("map_" + \u2603.i(), \u26032);
        }
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        final atg a = this.a(\u2603, \u2603.o);
        if (\u2603) {
            if (a == null) {
                \u2603.add("Unknown map");
            }
            else {
                \u2603.add("Scaling at 1:" + (1 << a.e));
                \u2603.add("(Level " + a.e + "/" + 4 + ")");
            }
        }
    }
}
