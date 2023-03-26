import java.util.Iterator;
import java.util.List;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgf
{
    public boolean a(final adq \u2603, final boq \u2603, final alz \u2603, final cj \u2603, final bfd \u2603) {
        final afh c = \u2603.c();
        c.a(\u2603, \u2603);
        return this.a(\u2603, \u2603, \u2603, \u2603, \u2603, true);
    }
    
    public boolean a(final adq \u2603, final boq \u2603, final alz \u2603, final cj \u2603, final bfd \u2603, final boolean \u2603) {
        final boolean b = ave.x() && \u2603.c().r() == 0 && \u2603.b();
        try {
            final afh c = \u2603.c();
            if (b) {
                return this.a(\u2603, \u2603, c, \u2603, \u2603, \u2603);
            }
            return this.b(\u2603, \u2603, c, \u2603, \u2603, \u2603);
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Tesselating block model");
            final c a2 = a.a("Block model being tesselated");
            c.a(a2, \u2603, \u2603);
            a2.a("Using AO", b);
            throw new e(a);
        }
    }
    
    public boolean a(final adq \u2603, final boq \u2603, final afh \u2603, final cj \u2603, final bfd \u2603, final boolean \u2603) {
        boolean b = false;
        final float[] array = new float[cq.values().length * 2];
        final BitSet set = new BitSet(3);
        final b b2 = new b();
        for (final cq cq : cq.values()) {
            final List<bgg> a = \u2603.a(cq);
            if (!a.isEmpty()) {
                final cj a2 = \u2603.a(cq);
                if (!\u2603 || \u2603.a(\u2603, a2, cq)) {
                    this.a(\u2603, \u2603, \u2603, \u2603, a, array, set, b2);
                    b = true;
                }
            }
        }
        final List<bgg> a3 = \u2603.a();
        if (a3.size() > 0) {
            this.a(\u2603, \u2603, \u2603, \u2603, a3, array, set, b2);
            b = true;
        }
        return b;
    }
    
    public boolean b(final adq \u2603, final boq \u2603, final afh \u2603, final cj \u2603, final bfd \u2603, final boolean \u2603) {
        boolean b = false;
        final BitSet set = new BitSet(3);
        for (final cq \u26032 : cq.values()) {
            final List<bgg> a = \u2603.a(\u26032);
            if (!a.isEmpty()) {
                final cj a2 = \u2603.a(\u26032);
                if (!\u2603 || \u2603.a(\u2603, a2, \u26032)) {
                    final int c = \u2603.c(\u2603, a2);
                    this.a(\u2603, \u2603, \u2603, \u26032, c, false, \u2603, a, set);
                    b = true;
                }
            }
        }
        final List<bgg> a3 = \u2603.a();
        if (a3.size() > 0) {
            this.a(\u2603, \u2603, \u2603, null, -1, true, \u2603, a3, set);
            b = true;
        }
        return b;
    }
    
    private void a(final adq \u2603, final afh \u2603, final cj \u2603, final bfd \u2603, final List<bgg> \u2603, final float[] \u2603, final BitSet \u2603, final b \u2603) {
        double \u26032 = \u2603.n();
        double \u26033 = \u2603.o();
        double \u26034 = \u2603.p();
        final afh.a r = \u2603.R();
        if (r != afh.a.a) {
            final long a = ns.a(\u2603);
            \u26032 += ((a >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
            \u26034 += ((a >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
            if (r == afh.a.c) {
                \u26033 += ((a >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        for (final bgg bgg : \u2603) {
            this.a(\u2603, bgg.a(), bgg.d(), \u2603, \u2603);
            \u2603.a(\u2603, \u2603, \u2603, bgg.d(), \u2603, \u2603);
            \u2603.a(bgg.a());
            \u2603.a(\u2603.c[0], \u2603.c[1], \u2603.c[2], \u2603.c[3]);
            if (bgg.b()) {
                int \u26035 = \u2603.a(\u2603, \u2603, bgg.c());
                if (bfk.a) {
                    \u26035 = bml.c(\u26035);
                }
                final float n = (\u26035 >> 16 & 0xFF) / 255.0f;
                final float n2 = (\u26035 >> 8 & 0xFF) / 255.0f;
                final float n3 = (\u26035 & 0xFF) / 255.0f;
                \u2603.a(\u2603.b[0] * n, \u2603.b[0] * n2, \u2603.b[0] * n3, 4);
                \u2603.a(\u2603.b[1] * n, \u2603.b[1] * n2, \u2603.b[1] * n3, 3);
                \u2603.a(\u2603.b[2] * n, \u2603.b[2] * n2, \u2603.b[2] * n3, 2);
                \u2603.a(\u2603.b[3] * n, \u2603.b[3] * n2, \u2603.b[3] * n3, 1);
            }
            else {
                \u2603.a(\u2603.b[0], \u2603.b[0], \u2603.b[0], 4);
                \u2603.a(\u2603.b[1], \u2603.b[1], \u2603.b[1], 3);
                \u2603.a(\u2603.b[2], \u2603.b[2], \u2603.b[2], 2);
                \u2603.a(\u2603.b[3], \u2603.b[3], \u2603.b[3], 1);
            }
            \u2603.a(\u26032, \u26033, \u26034);
        }
    }
    
    private void a(final afh \u2603, final int[] \u2603, final cq \u2603, final float[] \u2603, final BitSet \u2603) {
        float min = 32.0f;
        float min2 = 32.0f;
        float min3 = 32.0f;
        float max = -32.0f;
        float max2 = -32.0f;
        float max3 = -32.0f;
        for (int i = 0; i < 4; ++i) {
            final float intBitsToFloat = Float.intBitsToFloat(\u2603[i * 7]);
            final float intBitsToFloat2 = Float.intBitsToFloat(\u2603[i * 7 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(\u2603[i * 7 + 2]);
            min = Math.min(min, intBitsToFloat);
            min2 = Math.min(min2, intBitsToFloat2);
            min3 = Math.min(min3, intBitsToFloat3);
            max = Math.max(max, intBitsToFloat);
            max2 = Math.max(max2, intBitsToFloat2);
            max3 = Math.max(max3, intBitsToFloat3);
        }
        if (\u2603 != null) {
            \u2603[cq.e.a()] = min;
            \u2603[cq.f.a()] = max;
            \u2603[cq.a.a()] = min2;
            \u2603[cq.b.a()] = max2;
            \u2603[cq.c.a()] = min3;
            \u2603[cq.d.a()] = max3;
            \u2603[cq.e.a() + cq.values().length] = 1.0f - min;
            \u2603[cq.f.a() + cq.values().length] = 1.0f - max;
            \u2603[cq.a.a() + cq.values().length] = 1.0f - min2;
            \u2603[cq.b.a() + cq.values().length] = 1.0f - max2;
            \u2603[cq.c.a() + cq.values().length] = 1.0f - min3;
            \u2603[cq.d.a() + cq.values().length] = 1.0f - max3;
        }
        final float n = 1.0E-4f;
        final float intBitsToFloat = 0.9999f;
        switch (bgf$1.a[\u2603.ordinal()]) {
            case 1: {
                \u2603.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                \u2603.set(0, (min2 < 1.0E-4f || \u2603.d()) && min2 == max2);
                break;
            }
            case 2: {
                \u2603.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                \u2603.set(0, (max2 > 0.9999f || \u2603.d()) && min2 == max2);
                break;
            }
            case 3: {
                \u2603.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                \u2603.set(0, (min3 < 1.0E-4f || \u2603.d()) && min3 == max3);
                break;
            }
            case 4: {
                \u2603.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                \u2603.set(0, (max3 > 0.9999f || \u2603.d()) && min3 == max3);
                break;
            }
            case 5: {
                \u2603.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                \u2603.set(0, (min < 1.0E-4f || \u2603.d()) && min == max);
                break;
            }
            case 6: {
                \u2603.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                \u2603.set(0, (max > 0.9999f || \u2603.d()) && min == max);
                break;
            }
        }
    }
    
    private void a(final adq \u2603, final afh \u2603, final cj \u2603, final cq \u2603, int \u2603, final boolean \u2603, final bfd \u2603, final List<bgg> \u2603, final BitSet \u2603) {
        double \u26032 = \u2603.n();
        double \u26033 = \u2603.o();
        double \u26034 = \u2603.p();
        final afh.a r = \u2603.R();
        if (r != afh.a.a) {
            final int n = \u2603.n();
            final int p = \u2603.p();
            long n2 = (long)(n * 3129871) ^ p * 116129781L;
            n2 = n2 * n2 * 42317861L + n2 * 11L;
            \u26032 += ((n2 >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
            \u26034 += ((n2 >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
            if (r == afh.a.c) {
                \u26033 += ((n2 >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        for (final bgg bgg : \u2603) {
            if (\u2603) {
                this.a(\u2603, bgg.a(), bgg.d(), null, \u2603);
                \u2603 = (\u2603.get(0) ? \u2603.c(\u2603, \u2603.a(bgg.d())) : \u2603.c(\u2603, \u2603));
            }
            \u2603.a(bgg.a());
            \u2603.a(\u2603, \u2603, \u2603, \u2603);
            if (bgg.b()) {
                int \u26035 = \u2603.a(\u2603, \u2603, bgg.c());
                if (bfk.a) {
                    \u26035 = bml.c(\u26035);
                }
                final float n3 = (\u26035 >> 16 & 0xFF) / 255.0f;
                final float n4 = (\u26035 >> 8 & 0xFF) / 255.0f;
                final float n5 = (\u26035 & 0xFF) / 255.0f;
                \u2603.a(n3, n4, n5, 4);
                \u2603.a(n3, n4, n5, 3);
                \u2603.a(n3, n4, n5, 2);
                \u2603.a(n3, n4, n5, 1);
            }
            \u2603.a(\u26032, \u26033, \u26034);
        }
    }
    
    public void a(final boq \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        for (final cq cq : cq.values()) {
            this.a(\u2603, \u2603, \u2603, \u2603, \u2603.a(cq));
        }
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603.a());
    }
    
    public void a(final boq \u2603, final alz \u2603, final float \u2603, final boolean \u2603) {
        final afh c = \u2603.c();
        c.j();
        bfl.b(90.0f, 0.0f, 1.0f, 0.0f);
        int \u26032 = c.h(c.b(\u2603));
        if (bfk.a) {
            \u26032 = bml.c(\u26032);
        }
        final float \u26033 = (\u26032 >> 16 & 0xFF) / 255.0f;
        final float \u26034 = (\u26032 >> 8 & 0xFF) / 255.0f;
        final float \u26035 = (\u26032 & 0xFF) / 255.0f;
        if (!\u2603) {
            bfl.c(\u2603, \u2603, \u2603, 1.0f);
        }
        this.a(\u2603, \u2603, \u26033, \u26034, \u26035);
    }
    
    private void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final List<bgg> \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        for (final bgg bgg : \u2603) {
            c.a(7, bms.b);
            c.a(bgg.a());
            if (bgg.b()) {
                c.d(\u2603 * \u2603, \u2603 * \u2603, \u2603 * \u2603);
            }
            else {
                c.d(\u2603, \u2603, \u2603);
            }
            final df m = bgg.d().m();
            c.b((float)m.n(), (float)m.o(), (float)m.p());
            a.b();
        }
    }
    
    enum c
    {
        a(0, 1, 2, 3), 
        b(2, 3, 0, 1), 
        c(3, 0, 1, 2), 
        d(0, 1, 2, 3), 
        e(3, 0, 1, 2), 
        f(1, 2, 3, 0);
        
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private static final c[] k;
        
        private c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public static c a(final cq \u2603) {
            return c.k[\u2603.a()];
        }
        
        static {
            (k = new c[6])[cq.a.a()] = c.a;
            c.k[cq.b.a()] = c.b;
            c.k[cq.c.a()] = c.c;
            c.k[cq.d.a()] = c.d;
            c.k[cq.e.a()] = c.e;
            c.k[cq.f.a()] = c.f;
        }
    }
    
    class b
    {
        private final float[] b;
        private final int[] c;
        
        public b() {
            this.b = new float[4];
            this.c = new int[4];
        }
        
        public void a(final adq \u2603, final afh \u2603, final cj \u2603, final cq \u2603, final float[] \u2603, final BitSet \u2603) {
            final cj cj = \u2603.get(0) ? \u2603.a(\u2603) : \u2603;
            final a a = bgf.a.a(\u2603);
            final cj a2 = cj.a(a.g[0]);
            final cj a3 = cj.a(a.g[1]);
            final cj a4 = cj.a(a.g[2]);
            final cj a5 = cj.a(a.g[3]);
            final int c = \u2603.c(\u2603, a2);
            final int c2 = \u2603.c(\u2603, a3);
            final int c3 = \u2603.c(\u2603, a4);
            final int c4 = \u2603.c(\u2603, a5);
            final float h = \u2603.p(a2).c().h();
            final float h2 = \u2603.p(a3).c().h();
            final float h3 = \u2603.p(a4).c().h();
            final float h4 = \u2603.p(a5).c().h();
            final boolean q = \u2603.p(a2.a(\u2603)).c().q();
            final boolean q2 = \u2603.p(a3.a(\u2603)).c().q();
            final boolean q3 = \u2603.p(a4.a(\u2603)).c().q();
            final boolean q4 = \u2603.p(a5.a(\u2603)).c().q();
            float h5;
            int c5;
            if (q3 || q) {
                final cj cj2 = a2.a(a.g[2]);
                h5 = \u2603.p(cj2).c().h();
                c5 = \u2603.c(\u2603, cj2);
            }
            else {
                h5 = h;
                c5 = c;
            }
            float h6;
            int c6;
            if (q4 || q) {
                final cj cj2 = a2.a(a.g[3]);
                h6 = \u2603.p(cj2).c().h();
                c6 = \u2603.c(\u2603, cj2);
            }
            else {
                h6 = h;
                c6 = c;
            }
            float h7;
            int c7;
            if (q3 || q2) {
                final cj cj2 = a3.a(a.g[2]);
                h7 = \u2603.p(cj2).c().h();
                c7 = \u2603.c(\u2603, cj2);
            }
            else {
                h7 = h2;
                c7 = c2;
            }
            float h8;
            int c8;
            if (q4 || q2) {
                final cj cj2 = a3.a(a.g[3]);
                h8 = \u2603.p(cj2).c().h();
                c8 = \u2603.c(\u2603, cj2);
            }
            else {
                h8 = h2;
                c8 = c2;
            }
            int n = \u2603.c(\u2603, \u2603);
            if (\u2603.get(0) || !\u2603.p(\u2603.a(\u2603)).c().c()) {
                n = \u2603.c(\u2603, \u2603.a(\u2603));
            }
            final float n2 = \u2603.get(0) ? \u2603.p(cj).c().h() : \u2603.p(\u2603).c().h();
            final c a6 = bgf.c.a(\u2603);
            if (!\u2603.get(1) || !a.i) {
                final float n3 = (h4 + h + h6 + n2) * 0.25f;
                final float n4 = (h3 + h + h5 + n2) * 0.25f;
                final float n5 = (h3 + h2 + h7 + n2) * 0.25f;
                final float n6 = (h4 + h2 + h8 + n2) * 0.25f;
                this.c[a6.g] = this.a(c4, c, c6, n);
                this.c[a6.h] = this.a(c3, c, c5, n);
                this.c[a6.i] = this.a(c3, c2, c7, n);
                this.c[a6.j] = this.a(c4, c2, c8, n);
                this.b[a6.g] = n3;
                this.b[a6.h] = n4;
                this.b[a6.i] = n5;
                this.b[a6.j] = n6;
            }
            else {
                final float n3 = (h4 + h + h6 + n2) * 0.25f;
                final float n4 = (h3 + h + h5 + n2) * 0.25f;
                final float n5 = (h3 + h2 + h7 + n2) * 0.25f;
                final float n6 = (h4 + h2 + h8 + n2) * 0.25f;
                final float \u26032 = \u2603[a.j[0].m] * \u2603[a.j[1].m];
                final float \u26033 = \u2603[a.j[2].m] * \u2603[a.j[3].m];
                final float \u26034 = \u2603[a.j[4].m] * \u2603[a.j[5].m];
                final float \u26035 = \u2603[a.j[6].m] * \u2603[a.j[7].m];
                final float \u26036 = \u2603[a.k[0].m] * \u2603[a.k[1].m];
                final float \u26037 = \u2603[a.k[2].m] * \u2603[a.k[3].m];
                final float \u26038 = \u2603[a.k[4].m] * \u2603[a.k[5].m];
                final float \u26039 = \u2603[a.k[6].m] * \u2603[a.k[7].m];
                final float \u260310 = \u2603[a.l[0].m] * \u2603[a.l[1].m];
                final float \u260311 = \u2603[a.l[2].m] * \u2603[a.l[3].m];
                final float \u260312 = \u2603[a.l[4].m] * \u2603[a.l[5].m];
                final float \u260313 = \u2603[a.l[6].m] * \u2603[a.l[7].m];
                final float \u260314 = \u2603[a.m[0].m] * \u2603[a.m[1].m];
                final float \u260315 = \u2603[a.m[2].m] * \u2603[a.m[3].m];
                final float \u260316 = \u2603[a.m[4].m] * \u2603[a.m[5].m];
                final float \u260317 = \u2603[a.m[6].m] * \u2603[a.m[7].m];
                this.b[a6.g] = n3 * \u26032 + n4 * \u26033 + n5 * \u26034 + n6 * \u26035;
                this.b[a6.h] = n3 * \u26036 + n4 * \u26037 + n5 * \u26038 + n6 * \u26039;
                this.b[a6.i] = n3 * \u260310 + n4 * \u260311 + n5 * \u260312 + n6 * \u260313;
                this.b[a6.j] = n3 * \u260314 + n4 * \u260315 + n5 * \u260316 + n6 * \u260317;
                final int a7 = this.a(c4, c, c6, n);
                final int a8 = this.a(c3, c, c5, n);
                final int a9 = this.a(c3, c2, c7, n);
                final int a10 = this.a(c4, c2, c8, n);
                this.c[a6.g] = this.a(a7, a8, a9, a10, \u26032, \u26033, \u26034, \u26035);
                this.c[a6.h] = this.a(a7, a8, a9, a10, \u26036, \u26037, \u26038, \u26039);
                this.c[a6.i] = this.a(a7, a8, a9, a10, \u260310, \u260311, \u260312, \u260313);
                this.c[a6.j] = this.a(a7, a8, a9, a10, \u260314, \u260315, \u260316, \u260317);
            }
        }
        
        private int a(int \u2603, int \u2603, int \u2603, final int \u2603) {
            if (\u2603 == 0) {
                \u2603 = \u2603;
            }
            if (\u2603 == 0) {
                \u2603 = \u2603;
            }
            if (\u2603 == 0) {
                \u2603 = \u2603;
            }
            return \u2603 + \u2603 + \u2603 + \u2603 >> 2 & 0xFF00FF;
        }
        
        private int a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
            final int n = (int)((\u2603 >> 16 & 0xFF) * \u2603 + (\u2603 >> 16 & 0xFF) * \u2603 + (\u2603 >> 16 & 0xFF) * \u2603 + (\u2603 >> 16 & 0xFF) * \u2603) & 0xFF;
            final int n2 = (int)((\u2603 & 0xFF) * \u2603 + (\u2603 & 0xFF) * \u2603 + (\u2603 & 0xFF) * \u2603 + (\u2603 & 0xFF) * \u2603) & 0xFF;
            return n << 16 | n2;
        }
    }
    
    public enum d
    {
        a(cq.a, false), 
        b(cq.b, false), 
        c(cq.c, false), 
        d(cq.d, false), 
        e(cq.e, false), 
        f(cq.f, false), 
        g(cq.a, true), 
        h(cq.b, true), 
        i(cq.c, true), 
        j(cq.d, true), 
        k(cq.e, true), 
        l(cq.f, true);
        
        protected final int m;
        
        private d(final cq \u2603, final boolean \u2603) {
            this.m = \u2603.a() + (\u2603 ? cq.values().length : 0);
        }
    }
    
    public enum a
    {
        a(new cq[] { cq.e, cq.f, cq.c, cq.d }, 0.5f, false, new d[0], new d[0], new d[0], new d[0]), 
        b(new cq[] { cq.f, cq.e, cq.c, cq.d }, 1.0f, false, new d[0], new d[0], new d[0], new d[0]), 
        c(new cq[] { cq.b, cq.a, cq.f, cq.e }, 0.8f, true, new d[] { bgf.d.b, bgf.d.k, bgf.d.b, bgf.d.e, bgf.d.h, bgf.d.e, bgf.d.h, bgf.d.k }, new d[] { bgf.d.b, bgf.d.l, bgf.d.b, bgf.d.f, bgf.d.h, bgf.d.f, bgf.d.h, bgf.d.l }, new d[] { bgf.d.a, bgf.d.l, bgf.d.a, bgf.d.f, bgf.d.g, bgf.d.f, bgf.d.g, bgf.d.l }, new d[] { bgf.d.a, bgf.d.k, bgf.d.a, bgf.d.e, bgf.d.g, bgf.d.e, bgf.d.g, bgf.d.k }), 
        d(new cq[] { cq.e, cq.f, cq.a, cq.b }, 0.8f, true, new d[] { bgf.d.b, bgf.d.k, bgf.d.h, bgf.d.k, bgf.d.h, bgf.d.e, bgf.d.b, bgf.d.e }, new d[] { bgf.d.a, bgf.d.k, bgf.d.g, bgf.d.k, bgf.d.g, bgf.d.e, bgf.d.a, bgf.d.e }, new d[] { bgf.d.a, bgf.d.l, bgf.d.g, bgf.d.l, bgf.d.g, bgf.d.f, bgf.d.a, bgf.d.f }, new d[] { bgf.d.b, bgf.d.l, bgf.d.h, bgf.d.l, bgf.d.h, bgf.d.f, bgf.d.b, bgf.d.f }), 
        e(new cq[] { cq.b, cq.a, cq.c, cq.d }, 0.6f, true, new d[] { bgf.d.b, bgf.d.d, bgf.d.b, bgf.d.j, bgf.d.h, bgf.d.j, bgf.d.h, bgf.d.d }, new d[] { bgf.d.b, bgf.d.c, bgf.d.b, bgf.d.i, bgf.d.h, bgf.d.i, bgf.d.h, bgf.d.c }, new d[] { bgf.d.a, bgf.d.c, bgf.d.a, bgf.d.i, bgf.d.g, bgf.d.i, bgf.d.g, bgf.d.c }, new d[] { bgf.d.a, bgf.d.d, bgf.d.a, bgf.d.j, bgf.d.g, bgf.d.j, bgf.d.g, bgf.d.d }), 
        f(new cq[] { cq.a, cq.b, cq.c, cq.d }, 0.6f, true, new d[] { bgf.d.g, bgf.d.d, bgf.d.g, bgf.d.j, bgf.d.a, bgf.d.j, bgf.d.a, bgf.d.d }, new d[] { bgf.d.g, bgf.d.c, bgf.d.g, bgf.d.i, bgf.d.a, bgf.d.i, bgf.d.a, bgf.d.c }, new d[] { bgf.d.h, bgf.d.c, bgf.d.h, bgf.d.i, bgf.d.b, bgf.d.i, bgf.d.b, bgf.d.c }, new d[] { bgf.d.h, bgf.d.d, bgf.d.h, bgf.d.j, bgf.d.b, bgf.d.j, bgf.d.b, bgf.d.d });
        
        protected final cq[] g;
        protected final float h;
        protected final boolean i;
        protected final d[] j;
        protected final d[] k;
        protected final d[] l;
        protected final d[] m;
        private static final a[] n;
        
        private a(final cq[] \u2603, final float \u2603, final boolean \u2603, final d[] \u2603, final d[] \u2603, final d[] \u2603, final d[] \u2603) {
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
            this.k = \u2603;
            this.l = \u2603;
            this.m = \u2603;
        }
        
        public static a a(final cq \u2603) {
            return a.n[\u2603.a()];
        }
        
        static {
            (n = new a[6])[cq.a.a()] = a.a;
            a.n[cq.b.a()] = a.b;
            a.n[cq.c.a()] = a.c;
            a.n[cq.d.a()] = a.d;
            a.n[cq.e.a()] = a.e;
            a.n[cq.f.a()] = a.f;
        }
    }
}
