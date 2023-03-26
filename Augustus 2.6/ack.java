import com.google.common.collect.Lists;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ack
{
    private static final Random a;
    private static final e b;
    private static final d c;
    private static final b d;
    private static final a e;
    
    public static int a(final int \u2603, final zx \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        final du p = \u2603.p();
        if (p == null) {
            return 0;
        }
        for (int i = 0; i < p.c(); ++i) {
            final int e = p.b(i).e("id");
            final int e2 = p.b(i).e("lvl");
            if (e == \u2603) {
                return e2;
            }
        }
        return 0;
    }
    
    public static Map<Integer, Integer> a(final zx \u2603) {
        final Map<Integer, Integer> linkedHashMap = (Map<Integer, Integer>)Maps.newLinkedHashMap();
        final du du = (\u2603.b() == zy.cd) ? zy.cd.h(\u2603) : \u2603.p();
        if (du != null) {
            for (int i = 0; i < du.c(); ++i) {
                final int e = du.b(i).e("id");
                final int e2 = du.b(i).e("lvl");
                linkedHashMap.put(e, e2);
            }
        }
        return linkedHashMap;
    }
    
    public static void a(final Map<Integer, Integer> \u2603, final zx \u2603) {
        final du \u26032 = new du();
        for (final int intValue : \u2603.keySet()) {
            final aci c = aci.c(intValue);
            if (c == null) {
                continue;
            }
            final dn \u26033 = new dn();
            \u26033.a("id", (short)intValue);
            \u26033.a("lvl", (short)(int)\u2603.get(intValue));
            \u26032.a(\u26033);
            if (\u2603.b() != zy.cd) {
                continue;
            }
            zy.cd.a(\u2603, new acl(c, \u2603.get(intValue)));
        }
        if (\u26032.c() > 0) {
            if (\u2603.b() != zy.cd) {
                \u2603.a("ench", \u26032);
            }
        }
        else if (\u2603.n()) {
            \u2603.o().o("ench");
        }
    }
    
    public static int a(final int \u2603, final zx[] \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        int n = 0;
        for (final zx \u26032 : \u2603) {
            final int a = a(\u2603, \u26032);
            if (a > n) {
                n = a;
            }
        }
        return n;
    }
    
    private static void a(final c \u2603, final zx \u2603) {
        if (\u2603 == null) {
            return;
        }
        final du p = \u2603.p();
        if (p == null) {
            return;
        }
        for (int i = 0; i < p.c(); ++i) {
            final int e = p.b(i).e("id");
            final int e2 = p.b(i).e("lvl");
            if (aci.c(e) != null) {
                \u2603.a(aci.c(e), e2);
            }
        }
    }
    
    private static void a(final c \u2603, final zx[] \u2603) {
        for (final zx \u26032 : \u2603) {
            a(\u2603, \u26032);
        }
    }
    
    public static int a(final zx[] \u2603, final ow \u2603) {
        ack.b.a = 0;
        ack.b.b = \u2603;
        a(ack.b, \u2603);
        if (ack.b.a > 25) {
            ack.b.a = 25;
        }
        else if (ack.b.a < 0) {
            ack.b.a = 0;
        }
        return (ack.b.a + 1 >> 1) + ack.a.nextInt((ack.b.a >> 1) + 1);
    }
    
    public static float a(final zx \u2603, final pw \u2603) {
        ack.c.a = 0.0f;
        ack.c.b = \u2603;
        a(ack.c, \u2603);
        return ack.c.a;
    }
    
    public static void a(final pr \u2603, final pk \u2603) {
        ack.d.b = \u2603;
        ack.d.a = \u2603;
        if (\u2603 != null) {
            a(ack.d, \u2603.as());
        }
        if (\u2603 instanceof wn) {
            a(ack.d, \u2603.bA());
        }
    }
    
    public static void b(final pr \u2603, final pk \u2603) {
        ack.e.a = \u2603;
        ack.e.b = \u2603;
        if (\u2603 != null) {
            a(ack.e, \u2603.as());
        }
        if (\u2603 instanceof wn) {
            a(ack.e, \u2603.bA());
        }
    }
    
    public static int a(final pr \u2603) {
        return a(aci.o.B, \u2603.bA());
    }
    
    public static int b(final pr \u2603) {
        return a(aci.p.B, \u2603.bA());
    }
    
    public static int a(final pk \u2603) {
        return a(aci.h.B, \u2603.as());
    }
    
    public static int b(final pk \u2603) {
        return a(aci.k.B, \u2603.as());
    }
    
    public static int c(final pr \u2603) {
        return a(aci.r.B, \u2603.bA());
    }
    
    public static boolean e(final pr \u2603) {
        return a(aci.s.B, \u2603.bA()) > 0;
    }
    
    public static int f(final pr \u2603) {
        return a(aci.u.B, \u2603.bA());
    }
    
    public static int g(final pr \u2603) {
        return a(aci.z.B, \u2603.bA());
    }
    
    public static int h(final pr \u2603) {
        return a(aci.A.B, \u2603.bA());
    }
    
    public static int i(final pr \u2603) {
        return a(aci.q.B, \u2603.bA());
    }
    
    public static boolean j(final pr \u2603) {
        return a(aci.i.B, \u2603.as()) > 0;
    }
    
    public static zx a(final aci \u2603, final pr \u2603) {
        for (final zx \u26032 : \u2603.as()) {
            if (\u26032 != null && a(\u2603.B, \u26032) > 0) {
                return \u26032;
            }
        }
        return null;
    }
    
    public static int a(final Random \u2603, final int \u2603, int \u2603, final zx \u2603) {
        final zw b = \u2603.b();
        final int b2 = b.b();
        if (b2 <= 0) {
            return 0;
        }
        if (\u2603 > 15) {
            \u2603 = 15;
        }
        final int a = \u2603.nextInt(8) + 1 + (\u2603 >> 1) + \u2603.nextInt(\u2603 + 1);
        if (\u2603 == 0) {
            return Math.max(a / 3, 1);
        }
        if (\u2603 == 1) {
            return a * 2 / 3 + 1;
        }
        return Math.max(a, \u2603 * 2);
    }
    
    public static zx a(final Random \u2603, final zx \u2603, final int \u2603) {
        final List<acl> b = b(\u2603, \u2603, \u2603);
        final boolean b2 = \u2603.b() == zy.aL;
        if (b2) {
            \u2603.a(zy.cd);
        }
        if (b != null) {
            for (final acl \u26032 : b) {
                if (b2) {
                    zy.cd.a(\u2603, \u26032);
                }
                else {
                    \u2603.a(\u26032.b, \u26032.c);
                }
            }
        }
        return \u2603;
    }
    
    public static List<acl> b(final Random \u2603, final zx \u2603, final int \u2603) {
        final zw b = \u2603.b();
        int b2 = b.b();
        if (b2 <= 0) {
            return null;
        }
        b2 /= 2;
        b2 = 1 + \u2603.nextInt((b2 >> 1) + 1) + \u2603.nextInt((b2 >> 1) + 1);
        final int n = b2 + \u2603;
        final float n2 = (\u2603.nextFloat() + \u2603.nextFloat() - 1.0f) * 0.15f;
        int \u26032 = (int)(n * (1.0f + n2) + 0.5f);
        if (\u26032 < 1) {
            \u26032 = 1;
        }
        List<acl> arrayList = null;
        final Map<Integer, acl> b3 = b(\u26032, \u2603);
        if (b3 != null && !b3.isEmpty()) {
            final acl acl = oa.a(\u2603, b3.values());
            if (acl != null) {
                arrayList = (List<acl>)Lists.newArrayList();
                arrayList.add(acl);
                for (int n3 = \u26032; \u2603.nextInt(50) <= n3; n3 >>= 1) {
                    final Iterator<Integer> iterator = b3.keySet().iterator();
                    while (iterator.hasNext()) {
                        final Integer n4 = iterator.next();
                        boolean b4 = true;
                        for (final acl acl2 : arrayList) {
                            if (!acl2.b.a(aci.c(n4))) {
                                b4 = false;
                                break;
                            }
                        }
                        if (!b4) {
                            iterator.remove();
                        }
                    }
                    if (!b3.isEmpty()) {
                        final acl acl3 = oa.a(\u2603, b3.values());
                        arrayList.add(acl3);
                    }
                }
            }
        }
        return arrayList;
    }
    
    public static Map<Integer, acl> b(final int \u2603, final zx \u2603) {
        final zw b = \u2603.b();
        Map<Integer, acl> hashMap = null;
        final boolean b2 = \u2603.b() == zy.aL;
        for (final aci \u26032 : aci.b) {
            if (\u26032 != null) {
                if (\u26032.C.a(b) || b2) {
                    for (int j = \u26032.e(); j <= \u26032.b(); ++j) {
                        if (\u2603 >= \u26032.a(j) && \u2603 <= \u26032.b(j)) {
                            if (hashMap == null) {
                                hashMap = (Map<Integer, acl>)Maps.newHashMap();
                            }
                            hashMap.put(\u26032.B, new acl(\u26032, j));
                        }
                    }
                }
            }
        }
        return hashMap;
    }
    
    static {
        a = new Random();
        b = new e();
        c = new d();
        d = new b();
        e = new a();
    }
    
    static final class e implements c
    {
        public int a;
        public ow b;
        
        private e() {
        }
        
        @Override
        public void a(final aci \u2603, final int \u2603) {
            this.a += \u2603.a(\u2603, this.b);
        }
    }
    
    static final class d implements c
    {
        public float a;
        public pw b;
        
        private d() {
        }
        
        @Override
        public void a(final aci \u2603, final int \u2603) {
            this.a += \u2603.a(\u2603, this.b);
        }
    }
    
    static final class b implements c
    {
        public pr a;
        public pk b;
        
        private b() {
        }
        
        @Override
        public void a(final aci \u2603, final int \u2603) {
            \u2603.b(this.a, this.b, \u2603);
        }
    }
    
    static final class a implements c
    {
        public pr a;
        public pk b;
        
        private a() {
        }
        
        @Override
        public void a(final aci \u2603, final int \u2603) {
            \u2603.a(this.a, this.b, \u2603);
        }
    }
    
    interface c
    {
        void a(final aci p0, final int p1);
    }
}
