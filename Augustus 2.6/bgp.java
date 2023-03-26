import java.util.Iterator;
import org.lwjgl.util.vector.Vector3f;
import java.util.Map;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgp
{
    public static final List<String> a;
    
    public bgl a(final bmh \u2603, final bgl \u2603) {
        final Map<String, String> hashMap = (Map<String, String>)Maps.newHashMap();
        final List<bgh> arrayList = (List<bgh>)Lists.newArrayList();
        for (int i = 0; i < bgp.a.size(); ++i) {
            final String \u26032 = bgp.a.get(i);
            if (!\u2603.b(\u26032)) {
                break;
            }
            final String c = \u2603.c(\u26032);
            hashMap.put(\u26032, c);
            final bmi a = \u2603.a(new jy(c).toString());
            arrayList.addAll(this.a(i, \u26032, a));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", \u2603.b("particle") ? \u2603.c("particle") : hashMap.get("layer0"));
        return new bgl(arrayList, hashMap, false, false, \u2603.g());
    }
    
    private List<bgh> a(final int \u2603, final String \u2603, final bmi \u2603) {
        final Map<cq, bgi> hashMap = (Map<cq, bgi>)Maps.newHashMap();
        hashMap.put(cq.d, new bgi(null, \u2603, \u2603, new bgk(new float[] { 0.0f, 0.0f, 16.0f, 16.0f }, 0)));
        hashMap.put(cq.c, new bgi(null, \u2603, \u2603, new bgk(new float[] { 16.0f, 0.0f, 0.0f, 16.0f }, 0)));
        final List<bgh> arrayList = (List<bgh>)Lists.newArrayList();
        arrayList.add(new bgh(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.a(\u2603, \u2603, \u2603));
        return arrayList;
    }
    
    private List<bgh> a(final bmi \u2603, final String \u2603, final int \u2603) {
        final float n = (float)\u2603.c();
        final float n2 = (float)\u2603.d();
        final List<bgh> arrayList = (List<bgh>)Lists.newArrayList();
        for (final a a : this.a(\u2603)) {
            float n3 = 0.0f;
            float n4 = 0.0f;
            float n5 = 0.0f;
            float n6 = 0.0f;
            float n7 = 0.0f;
            float n8 = 0.0f;
            float n9 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            float n12 = 0.0f;
            final float n13 = (float)a.b();
            final float n14 = (float)a.c();
            final float n15 = (float)a.d();
            final b a2 = a.a();
            switch (bgp$1.a[a2.ordinal()]) {
                case 1: {
                    n7 = (n3 = n13);
                    n8 = (n5 = n14 + 1.0f);
                    n9 = (n4 = n15);
                    n10 = (n6 = n15);
                    n11 = 16.0f / n;
                    n12 = 16.0f / (n2 - 1.0f);
                    break;
                }
                case 2: {
                    n10 = (n9 = n15);
                    n7 = (n3 = n13);
                    n8 = (n5 = n14 + 1.0f);
                    n4 = n15 + 1.0f;
                    n6 = n15 + 1.0f;
                    n11 = 16.0f / n;
                    n12 = 16.0f / (n2 - 1.0f);
                    break;
                }
                case 3: {
                    n7 = (n3 = n15);
                    n8 = (n5 = n15);
                    n10 = (n4 = n13);
                    n9 = (n6 = n14 + 1.0f);
                    n11 = 16.0f / (n - 1.0f);
                    n12 = 16.0f / n2;
                    break;
                }
                case 4: {
                    n8 = (n7 = n15);
                    n3 = n15 + 1.0f;
                    n5 = n15 + 1.0f;
                    n10 = (n4 = n13);
                    n9 = (n6 = n14 + 1.0f);
                    n11 = 16.0f / (n - 1.0f);
                    n12 = 16.0f / n2;
                    break;
                }
            }
            final float n16 = 16.0f / n;
            final float n17 = 16.0f / n2;
            n3 *= n16;
            n5 *= n16;
            n4 *= n17;
            n6 *= n17;
            n4 = 16.0f - n4;
            n6 = 16.0f - n6;
            n7 *= n11;
            n8 *= n11;
            n9 *= n12;
            n10 *= n12;
            final Map<cq, bgi> hashMap = (Map<cq, bgi>)Maps.newHashMap();
            hashMap.put(a2.a(), new bgi(null, \u2603, \u2603, new bgk(new float[] { n7, n9, n8, n10 }, 0)));
            switch (bgp$1.a[a2.ordinal()]) {
                case 1: {
                    arrayList.add(new bgh(new Vector3f(n3, n4, 7.5f), new Vector3f(n5, n4, 8.5f), hashMap, null, true));
                    continue;
                }
                case 2: {
                    arrayList.add(new bgh(new Vector3f(n3, n6, 7.5f), new Vector3f(n5, n6, 8.5f), hashMap, null, true));
                    continue;
                }
                case 3: {
                    arrayList.add(new bgh(new Vector3f(n3, n4, 7.5f), new Vector3f(n3, n6, 8.5f), hashMap, null, true));
                    continue;
                }
                case 4: {
                    arrayList.add(new bgh(new Vector3f(n5, n4, 7.5f), new Vector3f(n5, n6, 8.5f), hashMap, null, true));
                    continue;
                }
            }
        }
        return arrayList;
    }
    
    private List<a> a(final bmi \u2603) {
        final int c = \u2603.c();
        final int d = \u2603.d();
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        for (int i = 0; i < \u2603.k(); ++i) {
            final int[] \u26032 = \u2603.a(i)[0];
            for (int j = 0; j < d; ++j) {
                for (int k = 0; k < c; ++k) {
                    final boolean b = !this.a(\u26032, k, j, c, d);
                    this.a(bgp.b.a, arrayList, \u26032, k, j, c, d, b);
                    this.a(bgp.b.b, arrayList, \u26032, k, j, c, d, b);
                    this.a(bgp.b.c, arrayList, \u26032, k, j, c, d, b);
                    this.a(bgp.b.d, arrayList, \u26032, k, j, c, d, b);
                }
            }
        }
        return arrayList;
    }
    
    private void a(final b \u2603, final List<a> \u2603, final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        final boolean b = this.a(\u2603, \u2603 + \u2603.b(), \u2603 + \u2603.c(), \u2603, \u2603) && \u2603;
        if (b) {
            this.a(\u2603, \u2603, \u2603, \u2603);
        }
    }
    
    private void a(final List<a> \u2603, final b \u2603, final int \u2603, final int \u2603) {
        a a = null;
        for (final a a2 : \u2603) {
            if (a2.a() != \u2603) {
                continue;
            }
            final int n = \u2603.d() ? \u2603 : \u2603;
            if (a2.d() == n) {
                a = a2;
                break;
            }
        }
        final int \u26032 = \u2603.d() ? \u2603 : \u2603;
        final int n2 = \u2603.d() ? \u2603 : \u2603;
        if (a == null) {
            \u2603.add(new a(\u2603, n2, \u26032));
        }
        else {
            a.a(n2);
        }
    }
    
    private boolean a(final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return \u2603 < 0 || \u2603 < 0 || \u2603 >= \u2603 || \u2603 >= \u2603 || (\u2603[\u2603 * \u2603 + \u2603] >> 24 & 0xFF) == 0x0;
    }
    
    static {
        a = Lists.newArrayList("layer0", "layer1", "layer2", "layer3", "layer4");
    }
    
    enum b
    {
        a(cq.b, 0, -1), 
        b(cq.a, 0, 1), 
        c(cq.f, -1, 0), 
        d(cq.e, 1, 0);
        
        private final cq e;
        private final int f;
        private final int g;
        
        private b(final cq \u2603, final int \u2603, final int \u2603) {
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
        }
        
        public cq a() {
            return this.e;
        }
        
        public int b() {
            return this.f;
        }
        
        public int c() {
            return this.g;
        }
        
        private boolean d() {
            return this == b.b || this == b.a;
        }
    }
    
    static class a
    {
        private final b a;
        private int b;
        private int c;
        private final int d;
        
        public a(final b \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public void a(final int \u2603) {
            if (\u2603 < this.b) {
                this.b = \u2603;
            }
            else if (\u2603 > this.c) {
                this.c = \u2603;
            }
        }
        
        public b a() {
            return this.a;
        }
        
        public int b() {
            return this.b;
        }
        
        public int c() {
            return this.c;
        }
        
        public int d() {
            return this.d;
        }
    }
}
