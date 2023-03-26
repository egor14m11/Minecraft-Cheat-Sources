import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import com.google.common.base.Predicates;
import net.minecraft.server.MinecraftServer;
import java.util.Map;
import java.util.regex.Matcher;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.36
// 

public class o
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Set<String> d;
    
    public static lf a(final m \u2603, final String \u2603) {
        return a(\u2603, \u2603, (Class<? extends lf>)lf.class);
    }
    
    public static <T extends pk> T a(final m \u2603, final String \u2603, final Class<? extends T> \u2603) {
        final List<T> b = b(\u2603, \u2603, \u2603);
        return (T)((b.size() == 1) ? ((T)b.get(0)) : null);
    }
    
    public static eu b(final m \u2603, final String \u2603) {
        final List<pk> b = b(\u2603, \u2603, (Class<? extends pk>)pk.class);
        if (b.isEmpty()) {
            return null;
        }
        final List<eu> arrayList = (List<eu>)Lists.newArrayList();
        for (final pk pk : b) {
            arrayList.add(pk.f_());
        }
        return i.a(arrayList);
    }
    
    public static <T extends pk> List<T> b(final m \u2603, final String \u2603, final Class<? extends T> \u2603) {
        final Matcher matcher = o.a.matcher(\u2603);
        if (!matcher.matches() || !\u2603.a(1, "@")) {
            return Collections.emptyList();
        }
        final Map<String, String> c = c(matcher.group(2));
        if (!b(\u2603, c)) {
            return Collections.emptyList();
        }
        final String group = matcher.group(1);
        final cj b = b(c, \u2603.c());
        final List<adm> a = a(\u2603, c);
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        for (final adm \u26032 : a) {
            if (\u26032 == null) {
                continue;
            }
            final List<Predicate<pk>> arrayList2 = (List<Predicate<pk>>)Lists.newArrayList();
            arrayList2.addAll(a(c, group));
            arrayList2.addAll(b(c));
            arrayList2.addAll(c(c));
            arrayList2.addAll(d(c));
            arrayList2.addAll(e(c));
            arrayList2.addAll(f(c));
            arrayList2.addAll(a(c, b));
            arrayList2.addAll(g(c));
            arrayList.addAll((Collection<? extends T>)a(c, (Class<? extends pk>)\u2603, arrayList2, group, \u26032, b));
        }
        return a(arrayList, c, \u2603, \u2603, group, b);
    }
    
    private static List<adm> a(final m \u2603, final Map<String, String> \u2603) {
        final List<adm> arrayList = (List<adm>)Lists.newArrayList();
        if (h(\u2603)) {
            arrayList.add(\u2603.e());
        }
        else {
            Collections.addAll(arrayList, MinecraftServer.N().d);
        }
        return arrayList;
    }
    
    private static <T extends pk> boolean b(final m \u2603, final Map<String, String> \u2603) {
        String b = b(\u2603, "type");
        b = ((b != null && b.startsWith("!")) ? b.substring(1) : b);
        if (b != null && !pm.b(b)) {
            final fb fb = new fb("commands.generic.entity.invalidType", new Object[] { b });
            fb.b().a(a.m);
            \u2603.a(fb);
            return false;
        }
        return true;
    }
    
    private static List<Predicate<pk>> a(final Map<String, String> \u2603, final String \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        String s = b(\u2603, "type");
        final boolean b = s != null && s.startsWith("!");
        if (b) {
            s = s.substring(1);
        }
        final String s2 = s;
        final boolean b2 = !\u2603.equals("e");
        final boolean b3 = \u2603.equals("r") && s != null;
        if ((s != null && \u2603.equals("e")) || b3) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    return pm.a(\u2603, s2) != b;
                }
            });
        }
        else if (b2) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    return \u2603 instanceof wn;
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> b(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        final int a = a(\u2603, "lm", -1);
        final int a2 = a(\u2603, "l", -1);
        if (a > -1 || a2 > -1) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    if (!(\u2603 instanceof lf)) {
                        return false;
                    }
                    final lf lf = (lf)\u2603;
                    return (a <= -1 || lf.bB >= a) && (a2 <= -1 || lf.bB <= a2);
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> c(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        final int a = a(\u2603, "m", adp.a.a.a());
        if (a != adp.a.a.a()) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    if (!(\u2603 instanceof lf)) {
                        return false;
                    }
                    final lf lf = (lf)\u2603;
                    return lf.c.b().a() == a;
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> d(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        String s = b(\u2603, "team");
        final boolean b = s != null && s.startsWith("!");
        if (b) {
            s = s.substring(1);
        }
        final String s2;
        if ((s2 = s) != null) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    if (!(\u2603 instanceof pr)) {
                        return false;
                    }
                    final pr pr = (pr)\u2603;
                    final auq bo = pr.bO();
                    final String s = (bo == null) ? "" : bo.b();
                    return s.equals(s2) != b;
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> e(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        final Map<String, Integer> a = a(\u2603);
        if (a != null && a.size() > 0) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    final auo z = MinecraftServer.N().a(0).Z();
                    for (final Map.Entry<String, Integer> entry : a.entrySet()) {
                        String substring = entry.getKey();
                        boolean b = false;
                        if (substring.endsWith("_min") && substring.length() > 4) {
                            b = true;
                            substring = substring.substring(0, substring.length() - 4);
                        }
                        final auk b2 = z.b(substring);
                        if (b2 == null) {
                            return false;
                        }
                        final String s = (\u2603 instanceof lf) ? \u2603.e_() : \u2603.aK().toString();
                        if (!z.b(s, b2)) {
                            return false;
                        }
                        final aum c = z.c(s, b2);
                        final int c2 = c.c();
                        if (c2 < entry.getValue() && b) {
                            return false;
                        }
                        if (c2 > entry.getValue() && !b) {
                            return false;
                        }
                    }
                    return true;
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> f(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        String s = b(\u2603, "name");
        final boolean b = s != null && s.startsWith("!");
        if (b) {
            s = s.substring(1);
        }
        final String s2;
        if ((s2 = s) != null) {
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    return \u2603.e_().equals(s2) != b;
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> a(final Map<String, String> \u2603, final cj \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        final int a = a(\u2603, "rm", -1);
        final int a2 = a(\u2603, "r", -1);
        if (\u2603 != null && (a >= 0 || a2 >= 0)) {
            final int n = a * a;
            final int n2 = a2 * a2;
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    final int n = (int)\u2603.c(\u2603);
                    return (a < 0 || n >= n) && (a2 < 0 || n <= n2);
                }
            });
        }
        return arrayList;
    }
    
    private static List<Predicate<pk>> g(final Map<String, String> \u2603) {
        final List<Predicate<pk>> arrayList = (List<Predicate<pk>>)Lists.newArrayList();
        if (\u2603.containsKey("rym") || \u2603.containsKey("ry")) {
            final int n = a(a(\u2603, "rym", 0));
            final int n2 = a(a(\u2603, "ry", 359));
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    final int a = o.a((int)Math.floor(\u2603.y));
                    if (n > n2) {
                        return a >= n || a <= n2;
                    }
                    return a >= n && a <= n2;
                }
            });
        }
        if (\u2603.containsKey("rxm") || \u2603.containsKey("rx")) {
            final int n = a(a(\u2603, "rxm", 0));
            final int n2 = a(a(\u2603, "rx", 359));
            arrayList.add(new Predicate<pk>() {
                public boolean a(final pk \u2603) {
                    final int a = o.a((int)Math.floor(\u2603.z));
                    if (n > n2) {
                        return a >= n || a <= n2;
                    }
                    return a >= n && a <= n2;
                }
            });
        }
        return arrayList;
    }
    
    private static <T extends pk> List<T> a(final Map<String, String> \u2603, final Class<? extends T> \u2603, final List<Predicate<pk>> \u2603, final String \u2603, final adm \u2603, final cj \u2603) {
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        String b = b(\u2603, "type");
        b = ((b != null && b.startsWith("!")) ? b.substring(1) : b);
        final boolean b2 = !\u2603.equals("e");
        final boolean b3 = \u2603.equals("r") && b != null;
        final int a = a(\u2603, "dx", 0);
        final int a2 = a(\u2603, "dy", 0);
        final int a3 = a(\u2603, "dz", 0);
        final int a4 = a(\u2603, "r", -1);
        final Predicate<pk> and = Predicates.and((Iterable<? extends Predicate<? super pk>>)\u2603);
        final Predicate<pk> and2 = Predicates.and((Predicate<? super pk>)po.a, (Predicate<? super pk>)and);
        if (\u2603 != null) {
            final int size = \u2603.j.size();
            final int size2 = \u2603.f.size();
            final boolean b4 = size < size2 / 16;
            if (\u2603.containsKey("dx") || \u2603.containsKey("dy") || \u2603.containsKey("dz")) {
                final aug a5 = a(\u2603, a, a2, a3);
                if (b2 && b4 && !b3) {
                    final Predicate<pk> second = new Predicate<pk>() {
                        public boolean a(final pk \u2603) {
                            return \u2603.s >= a5.a && \u2603.t >= a5.b && \u2603.u >= a5.c && \u2603.s < a5.d && \u2603.t < a5.e && \u2603.u < a5.f;
                        }
                    };
                    arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, Predicates.and((Predicate<? super pk>)and2, (Predicate<? super pk>)second)));
                }
                else {
                    arrayList.addAll((Collection<? extends T>)\u2603.a((Class<? extends pk>)\u2603, a5, (Predicate<? super pk>)and2));
                }
            }
            else if (a4 >= 0) {
                final aug a5 = new aug(\u2603.n() - a4, \u2603.o() - a4, \u2603.p() - a4, \u2603.n() + a4 + 1, \u2603.o() + a4 + 1, \u2603.p() + a4 + 1);
                if (b2 && b4 && !b3) {
                    arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, (Predicate<? super pk>)and2));
                }
                else {
                    arrayList.addAll((Collection<? extends T>)\u2603.a((Class<? extends pk>)\u2603, a5, (Predicate<? super pk>)and2));
                }
            }
            else if (\u2603.equals("a")) {
                arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, (Predicate<? super pk>)and));
            }
            else if (\u2603.equals("p") || (\u2603.equals("r") && !b3)) {
                arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, (Predicate<? super pk>)and2));
            }
            else {
                arrayList.addAll((Collection<? extends T>)\u2603.a((Class<? extends pk>)\u2603, (Predicate<? super pk>)and2));
            }
        }
        else if (\u2603.equals("a")) {
            arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, (Predicate<? super pk>)and));
        }
        else if (\u2603.equals("p") || (\u2603.equals("r") && !b3)) {
            arrayList.addAll((Collection<? extends T>)\u2603.b((Class<? extends pk>)\u2603, (Predicate<? super pk>)and2));
        }
        else {
            arrayList.addAll((Collection<? extends T>)\u2603.a((Class<? extends pk>)\u2603, (Predicate<? super pk>)and2));
        }
        return arrayList;
    }
    
    private static <T extends pk> List<T> a(List<T> \u2603, final Map<String, String> \u2603, final m \u2603, final Class<? extends T> \u2603, final String \u2603, final cj \u2603) {
        final int a = a(\u2603, "c", (!\u2603.equals("a") && !\u2603.equals("e")) ? 1 : 0);
        if (\u2603.equals("p") || \u2603.equals("a") || \u2603.equals("e")) {
            if (\u2603 != null) {
                Collections.sort(\u2603, new Comparator<pk>() {
                    public int a(final pk \u2603, final pk \u2603) {
                        return ComparisonChain.start().compare(\u2603.b(\u2603), \u2603.b(\u2603)).result();
                    }
                });
            }
        }
        else if (\u2603.equals("r")) {
            Collections.shuffle(\u2603);
        }
        final pk f = \u2603.f();
        if (f != null && \u2603.isAssignableFrom(f.getClass()) && a == 1 && \u2603.contains(f) && !"r".equals(\u2603)) {
            \u2603 = (List<T>)Lists.newArrayList(f);
        }
        if (a != 0) {
            if (a < 0) {
                Collections.reverse(\u2603);
            }
            \u2603 = \u2603.subList(0, Math.min(Math.abs(a), \u2603.size()));
        }
        return \u2603;
    }
    
    private static aug a(final cj \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final boolean b = \u2603 < 0;
        final boolean b2 = \u2603 < 0;
        final boolean b3 = \u2603 < 0;
        final int n = \u2603.n() + (b ? \u2603 : 0);
        final int n2 = \u2603.o() + (b2 ? \u2603 : 0);
        final int n3 = \u2603.p() + (b3 ? \u2603 : 0);
        final int n4 = \u2603.n() + (b ? 0 : \u2603) + 1;
        final int n5 = \u2603.o() + (b2 ? 0 : \u2603) + 1;
        final int n6 = \u2603.p() + (b3 ? 0 : \u2603) + 1;
        return new aug(n, n2, n3, n4, n5, n6);
    }
    
    public static int a(int \u2603) {
        \u2603 %= 360;
        if (\u2603 >= 160) {
            \u2603 -= 360;
        }
        if (\u2603 < 0) {
            \u2603 += 360;
        }
        return \u2603;
    }
    
    private static cj b(final Map<String, String> \u2603, final cj \u2603) {
        return new cj(a(\u2603, "x", \u2603.n()), a(\u2603, "y", \u2603.o()), a(\u2603, "z", \u2603.p()));
    }
    
    private static boolean h(final Map<String, String> \u2603) {
        for (final String s : o.d) {
            if (\u2603.containsKey(s)) {
                return true;
            }
        }
        return false;
    }
    
    private static int a(final Map<String, String> \u2603, final String \u2603, final int \u2603) {
        return \u2603.containsKey(\u2603) ? ns.a(\u2603.get(\u2603), \u2603) : \u2603;
    }
    
    private static String b(final Map<String, String> \u2603, final String \u2603) {
        return \u2603.get(\u2603);
    }
    
    public static Map<String, Integer> a(final Map<String, String> \u2603) {
        final Map<String, Integer> hashMap = (Map<String, Integer>)Maps.newHashMap();
        for (final String s : \u2603.keySet()) {
            if (s.startsWith("score_") && s.length() > "score_".length()) {
                hashMap.put(s.substring("score_".length()), ns.a(\u2603.get(s), 1));
            }
        }
        return hashMap;
    }
    
    public static boolean a(final String \u2603) {
        final Matcher matcher = o.a.matcher(\u2603);
        if (matcher.matches()) {
            final Map<String, String> c = c(matcher.group(2));
            final String group = matcher.group(1);
            final int \u26032 = (!"a".equals(group) && !"e".equals(group)) ? 1 : 0;
            return a(c, "c", \u26032) != 1;
        }
        return false;
    }
    
    public static boolean b(final String \u2603) {
        return o.a.matcher(\u2603).matches();
    }
    
    private static Map<String, String> c(final String \u2603) {
        final Map<String, String> hashMap = (Map<String, String>)Maps.newHashMap();
        if (\u2603 == null) {
            return hashMap;
        }
        int n = 0;
        int end = -1;
        final Matcher matcher = o.b.matcher(\u2603);
        while (matcher.find()) {
            String s = null;
            switch (n++) {
                case 0: {
                    s = "x";
                    break;
                }
                case 1: {
                    s = "y";
                    break;
                }
                case 2: {
                    s = "z";
                    break;
                }
                case 3: {
                    s = "r";
                    break;
                }
            }
            if (s != null && matcher.group(1).length() > 0) {
                hashMap.put(s, matcher.group(1));
            }
            end = matcher.end();
        }
        if (end < \u2603.length()) {
            final Matcher matcher2 = o.c.matcher((end == -1) ? \u2603 : \u2603.substring(end));
            while (matcher2.find()) {
                hashMap.put(matcher2.group(1), matcher2.group(2));
            }
        }
        return hashMap;
    }
    
    static {
        a = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
        b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
        c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
        d = Sets.newHashSet("x", "y", "z", "dx", "dy", "dz", "rm", "r");
    }
}
