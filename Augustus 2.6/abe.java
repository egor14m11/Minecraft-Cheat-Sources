import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class abe
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    private static final Map<Integer, String> o;
    private static final Map<Integer, String> p;
    private static final Map<Integer, Integer> q;
    private static final String[] r;
    
    public static boolean a(final int \u2603, final int \u2603) {
        return (\u2603 & 1 << \u2603) != 0x0;
    }
    
    private static int c(final int \u2603, final int \u2603) {
        return a(\u2603, \u2603) ? 1 : 0;
    }
    
    private static int d(final int \u2603, final int \u2603) {
        return a(\u2603, \u2603) ? 0 : 1;
    }
    
    public static int a(final int \u2603) {
        return a(\u2603, 5, 4, 3, 2, 1);
    }
    
    public static int a(final Collection<pf> \u2603) {
        final int n = 3694022;
        if (\u2603 == null || \u2603.isEmpty()) {
            return n;
        }
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        for (final pf pf : \u2603) {
            if (!pf.f()) {
                continue;
            }
            final int k = pe.a[pf.a()].k();
            for (int i = 0; i <= pf.c(); ++i) {
                n2 += (k >> 16 & 0xFF) / 255.0f;
                n3 += (k >> 8 & 0xFF) / 255.0f;
                n4 += (k >> 0 & 0xFF) / 255.0f;
                ++n5;
            }
        }
        if (n5 == 0.0f) {
            return 0;
        }
        n2 = n2 / n5 * 255.0f;
        n3 = n3 / n5 * 255.0f;
        n4 = n4 / n5 * 255.0f;
        return (int)n2 << 16 | (int)n3 << 8 | (int)n4;
    }
    
    public static boolean b(final Collection<pf> \u2603) {
        for (final pf pf : \u2603) {
            if (!pf.e()) {
                return false;
            }
        }
        return true;
    }
    
    public static int a(final int \u2603, final boolean \u2603) {
        final Integer a = nl.a(\u2603);
        if (\u2603) {
            return a(b(a, true));
        }
        if (abe.q.containsKey(a)) {
            return abe.q.get(a);
        }
        final int a2 = a(b(a, false));
        abe.q.put(a, a2);
        return a2;
    }
    
    public static String c(final int \u2603) {
        final int a = a(\u2603);
        return abe.r[a];
    }
    
    private static int a(final boolean \u2603, final boolean \u2603, final boolean \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        int n = 0;
        if (\u2603) {
            n = d(\u2603, \u2603);
        }
        else if (\u2603 != -1) {
            if (\u2603 == 0 && h(\u2603) == \u2603) {
                n = 1;
            }
            else if (\u2603 == 1 && h(\u2603) > \u2603) {
                n = 1;
            }
            else if (\u2603 == 2 && h(\u2603) < \u2603) {
                n = 1;
            }
        }
        else {
            n = c(\u2603, \u2603);
        }
        if (\u2603) {
            n *= \u2603;
        }
        if (\u2603) {
            n *= -1;
        }
        return n;
    }
    
    private static int h(int \u2603) {
        int n;
        for (n = 0; \u2603 > 0; \u2603 &= \u2603 - 1, ++n) {}
        return n;
    }
    
    private static int a(final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 >= \u2603.length() || \u2603 < 0 || \u2603 >= \u2603) {
            return 0;
        }
        final int index = \u2603.indexOf(124, \u2603);
        if (index >= 0 && index < \u2603) {
            final int n = a(\u2603, \u2603, index - 1, \u2603);
            if (n > 0) {
                return n;
            }
            final int n2 = a(\u2603, index + 1, \u2603, \u2603);
            if (n2 > 0) {
                return n2;
            }
            return 0;
        }
        else {
            final int n = \u2603.indexOf(38, \u2603);
            if (n < 0 || n >= \u2603) {
                boolean b = false;
                boolean \u26032 = false;
                boolean b2 = false;
                boolean \u26033 = false;
                boolean \u26034 = false;
                int \u26035 = -1;
                int \u26036 = 0;
                int \u26037 = 0;
                int n3 = 0;
                for (int i = \u2603; i < \u2603; ++i) {
                    final char char1 = \u2603.charAt(i);
                    if (char1 >= '0' && char1 <= '9') {
                        if (b) {
                            \u26037 = char1 - '0';
                            \u26032 = true;
                        }
                        else {
                            \u26036 *= 10;
                            \u26036 += char1 - '0';
                            b2 = true;
                        }
                    }
                    else if (char1 == '*') {
                        b = true;
                    }
                    else if (char1 == '!') {
                        if (b2) {
                            n3 += a(\u26033, \u26032, \u26034, \u26035, \u26036, \u26037, \u2603);
                            \u26032 = (b2 = (b = (\u26034 = (\u26033 = false))));
                            \u26037 = (\u26036 = 0);
                            \u26035 = -1;
                        }
                        \u26033 = true;
                    }
                    else if (char1 == '-') {
                        if (b2) {
                            n3 += a(\u26033, \u26032, \u26034, \u26035, \u26036, \u26037, \u2603);
                            \u26032 = (b2 = (b = (\u26034 = (\u26033 = false))));
                            \u26037 = (\u26036 = 0);
                            \u26035 = -1;
                        }
                        \u26034 = true;
                    }
                    else if (char1 == '=' || char1 == '<' || char1 == '>') {
                        if (b2) {
                            n3 += a(\u26033, \u26032, \u26034, \u26035, \u26036, \u26037, \u2603);
                            \u26032 = (b2 = (b = (\u26034 = (\u26033 = false))));
                            \u26037 = (\u26036 = 0);
                            \u26035 = -1;
                        }
                        if (char1 == '=') {
                            \u26035 = 0;
                        }
                        else if (char1 == '<') {
                            \u26035 = 2;
                        }
                        else if (char1 == '>') {
                            \u26035 = 1;
                        }
                    }
                    else if (char1 == '+' && b2) {
                        n3 += a(\u26033, \u26032, \u26034, \u26035, \u26036, \u26037, \u2603);
                        \u26032 = (b2 = (b = (\u26034 = (\u26033 = false))));
                        \u26037 = (\u26036 = 0);
                        \u26035 = -1;
                    }
                }
                if (b2) {
                    n3 += a(\u26033, \u26032, \u26034, \u26035, \u26036, \u26037, \u2603);
                }
                return n3;
            }
            final int n2 = a(\u2603, \u2603, n - 1, \u2603);
            if (n2 <= 0) {
                return 0;
            }
            final int a = a(\u2603, n + 1, \u2603, \u2603);
            if (a <= 0) {
                return 0;
            }
            if (n2 > a) {
                return n2;
            }
            return a;
        }
    }
    
    public static List<pf> b(final int \u2603, final boolean \u2603) {
        List<pf> arrayList = null;
        for (final pe pe : pe.a) {
            if (pe != null) {
                if (!pe.j() || \u2603) {
                    final String \u26032 = abe.o.get(pe.d());
                    if (\u26032 != null) {
                        int a2 = a(\u26032, 0, \u26032.length(), \u2603);
                        if (a2 > 0) {
                            int a3 = 0;
                            final String \u26033 = abe.p.get(pe.d());
                            if (\u26033 != null) {
                                a3 = a(\u26033, 0, \u26033.length(), \u2603);
                                if (a3 < 0) {
                                    a3 = 0;
                                }
                            }
                            if (pe.b()) {
                                a2 = 1;
                            }
                            else {
                                a2 = 1200 * (a2 * 3 + (a2 - 1) * 2);
                                a2 >>= a3;
                                a2 = (int)Math.round(a2 * pe.h());
                                if ((\u2603 & 0x4000) != 0x0) {
                                    a2 = (int)Math.round(a2 * 0.75 + 0.5);
                                }
                            }
                            if (arrayList == null) {
                                arrayList = (List<pf>)Lists.newArrayList();
                            }
                            final pf pf = new pf(pe.d(), a2, a3);
                            if ((\u2603 & 0x4000) != 0x0) {
                                pf.a(true);
                            }
                            arrayList.add(pf);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
    
    private static int a(int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (\u2603) {
            if (!a(\u2603, \u2603)) {
                return 0;
            }
        }
        else if (\u2603) {
            \u2603 &= ~(1 << \u2603);
        }
        else if (\u2603) {
            if ((\u2603 & 1 << \u2603) == 0x0) {
                \u2603 |= 1 << \u2603;
            }
            else {
                \u2603 &= ~(1 << \u2603);
            }
        }
        else {
            \u2603 |= 1 << \u2603;
        }
        return \u2603;
    }
    
    public static int a(int \u2603, final String \u2603) {
        final int n = 0;
        final int length = \u2603.length();
        boolean b = false;
        boolean \u26032 = false;
        boolean \u26033 = false;
        boolean \u26034 = false;
        int \u26035 = 0;
        for (int i = n; i < length; ++i) {
            final char char1 = \u2603.charAt(i);
            if (char1 >= '0' && char1 <= '9') {
                \u26035 *= 10;
                \u26035 += char1 - '0';
                b = true;
            }
            else if (char1 == '!') {
                if (b) {
                    \u2603 = a(\u2603, \u26035, \u26033, \u26032, \u26034);
                    \u26033 = (b = (\u26032 = (\u26034 = false)));
                    \u26035 = 0;
                }
                \u26032 = true;
            }
            else if (char1 == '-') {
                if (b) {
                    \u2603 = a(\u2603, \u26035, \u26033, \u26032, \u26034);
                    \u26033 = (b = (\u26032 = (\u26034 = false)));
                    \u26035 = 0;
                }
                \u26033 = true;
            }
            else if (char1 == '+') {
                if (b) {
                    \u2603 = a(\u2603, \u26035, \u26033, \u26032, \u26034);
                    \u26033 = (b = (\u26032 = (\u26034 = false)));
                    \u26035 = 0;
                }
            }
            else if (char1 == '&') {
                if (b) {
                    \u2603 = a(\u2603, \u26035, \u26033, \u26032, \u26034);
                    \u26033 = (b = (\u26032 = (\u26034 = false)));
                    \u26035 = 0;
                }
                \u26034 = true;
            }
        }
        if (b) {
            \u2603 = a(\u2603, \u26035, \u26033, \u26032, \u26034);
        }
        return \u2603 & 0x7FFF;
    }
    
    public static int a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return (a(\u2603, \u2603) ? 16 : 0) | (a(\u2603, \u2603) ? 8 : 0) | (a(\u2603, \u2603) ? 4 : 0) | (a(\u2603, \u2603) ? 2 : 0) | (a(\u2603, \u2603) ? 1 : 0);
    }
    
    static {
        o = Maps.newHashMap();
        p = Maps.newHashMap();
        a = null;
        c = "+0-1-2-3&4-4+13";
        abe.o.put(pe.l.d(), "0 & !1 & !2 & !3 & 0+6");
        b = "-0+1-2-3&4-4+13";
        abe.o.put(pe.c.d(), "!0 & 1 & !2 & !3 & 1+6");
        h = "+0+1-2-3&4-4+13";
        abe.o.put(pe.n.d(), "0 & 1 & !2 & !3 & 0+6");
        f = "+0-1+2-3&4-4+13";
        abe.o.put(pe.h.d(), "0 & !1 & 2 & !3");
        d = "-0-1+2-3&4-4+13";
        abe.o.put(pe.u.d(), "!0 & !1 & 2 & !3 & 2+6");
        e = "-0+3-4+13";
        abe.o.put(pe.t.d(), "!0 & !1 & !2 & 3 & 3+6");
        abe.o.put(pe.i.d(), "!0 & !1 & 2 & 3");
        abe.o.put(pe.d.d(), "!0 & 1 & !2 & 3 & 3+6");
        g = "+0-1-2+3&4-4+13";
        abe.o.put(pe.g.d(), "0 & !1 & !2 & 3 & 3+6");
        l = "-0+1+2-3+13&4-4";
        abe.o.put(pe.r.d(), "!0 & 1 & 2 & !3 & 2+6");
        abe.o.put(pe.p.d(), "!0 & 1 & 2 & 3 & 2+6");
        m = "+0-1+2+3+13&4-4";
        abe.o.put(pe.o.d(), "0 & !1 & 2 & 3 & 2+6");
        n = "+0+1-2+3&4-4+13";
        abe.o.put(pe.j.d(), "0 & 1 & !2 & 3 & 3+6");
        j = "+5-6-7";
        abe.p.put(pe.c.d(), "5");
        abe.p.put(pe.e.d(), "5");
        abe.p.put(pe.g.d(), "5");
        abe.p.put(pe.l.d(), "5");
        abe.p.put(pe.i.d(), "5");
        abe.p.put(pe.h.d(), "5");
        abe.p.put(pe.m.d(), "5");
        abe.p.put(pe.u.d(), "5");
        abe.p.put(pe.j.d(), "5");
        i = "-5+6-7";
        k = "+14&13-13";
        q = Maps.newHashMap();
        r = new String[] { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
    }
}
