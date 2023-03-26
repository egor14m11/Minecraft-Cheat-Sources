import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqw
{
    public static void a() {
        aqr.a(a.class, "ViBH");
        aqr.a(b.class, "ViDF");
        aqr.a(c.class, "ViF");
        aqr.a(d.class, "ViL");
        aqr.a(f.class, "ViPH");
        aqr.a(g.class, "ViSH");
        aqr.a(h.class, "ViSmH");
        aqr.a(i.class, "ViST");
        aqr.a(j.class, "ViS");
        aqr.a(k.class, "ViStart");
        aqr.a(l.class, "ViSR");
        aqr.a(m.class, "ViTRH");
        aqr.a(p.class, "ViW");
    }
    
    public static List<e> a(final Random \u2603, final int \u2603) {
        final List<e> arrayList = (List<e>)Lists.newArrayList();
        arrayList.add(new e(g.class, 4, ns.a(\u2603, 2 + \u2603, 4 + \u2603 * 2)));
        arrayList.add(new e(i.class, 20, ns.a(\u2603, 0 + \u2603, 1 + \u2603)));
        arrayList.add(new e(a.class, 20, ns.a(\u2603, 0 + \u2603, 2 + \u2603)));
        arrayList.add(new e(h.class, 3, ns.a(\u2603, 2 + \u2603, 5 + \u2603 * 3)));
        arrayList.add(new e(f.class, 15, ns.a(\u2603, 0 + \u2603, 2 + \u2603)));
        arrayList.add(new e(b.class, 3, ns.a(\u2603, 1 + \u2603, 4 + \u2603)));
        arrayList.add(new e(c.class, 3, ns.a(\u2603, 2 + \u2603, 4 + \u2603 * 2)));
        arrayList.add(new e(j.class, 15, ns.a(\u2603, 0, 1 + \u2603)));
        arrayList.add(new e(m.class, 8, ns.a(\u2603, 0 + \u2603, 3 + \u2603 * 2)));
        final Iterator<e> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().d == 0) {
                iterator.remove();
            }
        }
        return arrayList;
    }
    
    private static int a(final List<e> \u2603) {
        boolean b = false;
        int n = 0;
        for (final e e : \u2603) {
            if (e.d > 0 && e.c < e.d) {
                b = true;
            }
            n += e.b;
        }
        return b ? n : -1;
    }
    
    private static n a(final k \u2603, final e \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        final Class<? extends n> a = \u2603.a;
        n n = null;
        if (a == g.class) {
            n = g.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == i.class) {
            n = i.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == a.class) {
            n = aqw.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == h.class) {
            n = h.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == f.class) {
            n = f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == b.class) {
            n = b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == c.class) {
            n = c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == j.class) {
            n = j.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == m.class) {
            n = m.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        return n;
    }
    
    private static n c(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        final int a = a(\u2603.e);
        if (a <= 0) {
            return null;
        }
        int i = 0;
        while (i < 5) {
            ++i;
            int nextInt = \u2603.nextInt(a);
            for (final e e : \u2603.e) {
                nextInt -= e.b;
                if (nextInt < 0) {
                    if (!e.a(\u2603)) {
                        break;
                    }
                    if (e == \u2603.d && \u2603.e.size() > 1) {
                        break;
                    }
                    final n a2 = a(\u2603, e, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                    if (a2 != null) {
                        final e e2 = e;
                        ++e2.c;
                        \u2603.d = e;
                        if (!e.a()) {
                            \u2603.e.remove(e);
                        }
                        return a2;
                    }
                    continue;
                }
            }
        }
        final aqe a3 = d.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (a3 != null) {
            return new d(\u2603, \u2603, \u2603, a3, \u2603);
        }
        return null;
    }
    
    private static aqt d(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        if (\u2603 > 50) {
            return null;
        }
        if (Math.abs(\u2603 - \u2603.c().a) > 112 || Math.abs(\u2603 - \u2603.c().c) > 112) {
            return null;
        }
        final aqt c = c(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603 + 1);
        if (c != null) {
            final int \u26032 = (c.l.a + c.l.d) / 2;
            final int \u26033 = (c.l.c + c.l.f) / 2;
            final int n = c.l.d - c.l.a;
            final int n2 = c.l.f - c.l.c;
            final int n3 = (n > n2) ? n : n2;
            if (\u2603.e().a(\u26032, \u26033, n3 / 2 + 4, aqv.d)) {
                \u2603.add(c);
                \u2603.f.add(c);
                return c;
            }
        }
        return null;
    }
    
    private static aqt e(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        if (\u2603 > 3 + \u2603.c) {
            return null;
        }
        if (Math.abs(\u2603 - \u2603.c().a) > 112 || Math.abs(\u2603 - \u2603.c().c) > 112) {
            return null;
        }
        final aqe a = l.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (a != null && a.b > 10) {
            final aqt aqt = new l(\u2603, \u2603, \u2603, a, \u2603);
            final int \u26032 = (aqt.l.a + aqt.l.d) / 2;
            final int \u26033 = (aqt.l.c + aqt.l.f) / 2;
            final int n = aqt.l.d - aqt.l.a;
            final int n2 = aqt.l.f - aqt.l.c;
            final int n3 = (n > n2) ? n : n2;
            if (\u2603.e().a(\u26032, \u26033, n3 / 2 + 4, aqv.d)) {
                \u2603.add(aqt);
                \u2603.g.add(aqt);
                return aqt;
            }
        }
        return null;
    }
    
    public static class e
    {
        public Class<? extends n> a;
        public final int b;
        public int c;
        public int d;
        
        public e(final Class<? extends n> \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.d = \u2603;
        }
        
        public boolean a(final int \u2603) {
            return this.d == 0 || this.c < this.d;
        }
        
        public boolean a() {
            return this.d == 0 || this.c < this.d;
        }
    }
    
    abstract static class n extends aqt
    {
        protected int h;
        private int a;
        private boolean b;
        
        public n() {
            this.h = -1;
        }
        
        protected n(final k \u2603, final int \u2603) {
            super(\u2603);
            this.h = -1;
            if (\u2603 != null) {
                this.b = \u2603.b;
            }
        }
        
        @Override
        protected void a(final dn \u2603) {
            \u2603.a("HPos", this.h);
            \u2603.a("VCount", this.a);
            \u2603.a("Desert", this.b);
        }
        
        @Override
        protected void b(final dn \u2603) {
            this.h = \u2603.f("HPos");
            this.a = \u2603.f("VCount");
            this.b = \u2603.n("Desert");
        }
        
        protected aqt a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            if (this.m != null) {
                switch (aqw$1.a[this.m.ordinal()]) {
                    case 1: {
                        return d(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d());
                    }
                    case 2: {
                        return d(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d());
                    }
                    case 3: {
                        return d(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d());
                    }
                    case 4: {
                        return d(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d());
                    }
                }
            }
            return null;
        }
        
        protected aqt b(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            if (this.m != null) {
                switch (aqw$1.a[this.m.ordinal()]) {
                    case 1: {
                        return d(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d());
                    }
                    case 2: {
                        return d(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d());
                    }
                    case 3: {
                        return d(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d());
                    }
                    case 4: {
                        return d(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d());
                    }
                }
            }
            return null;
        }
        
        protected int b(final adm \u2603, final aqe \u2603) {
            int n = 0;
            int n2 = 0;
            final cj.a a = new cj.a();
            for (int i = this.l.c; i <= this.l.f; ++i) {
                for (int j = this.l.a; j <= this.l.d; ++j) {
                    a.c(j, 64, i);
                    if (\u2603.b(a)) {
                        n += Math.max(\u2603.r(a).o(), \u2603.t.i());
                        ++n2;
                    }
                }
            }
            if (n2 == 0) {
                return -1;
            }
            return n / n2;
        }
        
        protected static boolean a(final aqe \u2603) {
            return \u2603 != null && \u2603.b > 10;
        }
        
        protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (this.a >= \u2603) {
                return;
            }
            for (int i = this.a; i < \u2603; ++i) {
                final int a = this.a(\u2603 + i, \u2603);
                final int d = this.d(\u2603);
                final int b = this.b(\u2603 + i, \u2603);
                if (!\u2603.b(new cj(a, d, b))) {
                    break;
                }
                ++this.a;
                final wi wi = new wi(\u2603);
                wi.b(a + 0.5, d, b + 0.5, 0.0f, 0.0f);
                wi.a(\u2603.E(new cj(wi)), null);
                wi.r(this.c(i, wi.cl()));
                \u2603.d(wi);
            }
        }
        
        protected int c(final int \u2603, final int \u2603) {
            return \u2603;
        }
        
        protected alz a(final alz \u2603) {
            if (this.b) {
                if (\u2603.c() == afi.r || \u2603.c() == afi.s) {
                    return afi.A.Q();
                }
                if (\u2603.c() == afi.e) {
                    return afi.A.a(aji.a.a.a());
                }
                if (\u2603.c() == afi.f) {
                    return afi.A.a(aji.a.c.a());
                }
                if (\u2603.c() == afi.ad) {
                    return afi.bO.Q().a((amo<Comparable>)aju.a, (Comparable)\u2603.b((amo<V>)aju.a));
                }
                if (\u2603.c() == afi.aw) {
                    return afi.bO.Q().a((amo<Comparable>)aju.a, (Comparable)\u2603.b((amo<V>)aju.a));
                }
                if (\u2603.c() == afi.n) {
                    return afi.A.Q();
                }
            }
            return \u2603;
        }
        
        @Override
        protected void a(final adm \u2603, final alz \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
            final alz a = this.a(\u2603);
            super.a(\u2603, a, \u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603, final alz \u2603, final boolean \u2603) {
            final alz a = this.a(\u2603);
            final alz a2 = this.a(\u2603);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, a, a2, \u2603);
        }
        
        @Override
        protected void b(final adm \u2603, final alz \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
            final alz a = this.a(\u2603);
            super.b(\u2603, a, \u2603, \u2603, \u2603, \u2603);
        }
        
        protected void a(final boolean \u2603) {
            this.b = \u2603;
        }
    }
    
    public static class p extends n
    {
        public p() {
        }
        
        public p(final k \u2603, final int \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            this.m = cq.c.a.a(\u2603);
            switch (aqw$1.a[this.m.ordinal()]) {
                case 1:
                case 2: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 6 - 1, 78, \u2603 + 6 - 1);
                    break;
                }
                default: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 6 - 1, 78, \u2603 + 6 - 1);
                    break;
                }
            }
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            e((k)\u2603, \u2603, \u2603, this.l.a - 1, this.l.e - 4, this.l.c + 1, cq.e, this.d());
            e((k)\u2603, \u2603, \u2603, this.l.d + 1, this.l.e - 4, this.l.c + 1, cq.f, this.d());
            e((k)\u2603, \u2603, \u2603, this.l.a + 1, this.l.e - 4, this.l.c - 1, cq.c, this.d());
            e((k)\u2603, \u2603, \u2603, this.l.a + 1, this.l.e - 4, this.l.f + 1, cq.d, this.d());
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 3, 0);
            }
            this.a(\u2603, \u2603, 1, 0, 1, 4, 12, 4, afi.e.Q(), afi.i.Q(), false);
            this.a(\u2603, afi.a.Q(), 2, 12, 2, \u2603);
            this.a(\u2603, afi.a.Q(), 3, 12, 2, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 12, 3, \u2603);
            this.a(\u2603, afi.a.Q(), 3, 12, 3, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 13, 1, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 14, 1, \u2603);
            this.a(\u2603, afi.aO.Q(), 4, 13, 1, \u2603);
            this.a(\u2603, afi.aO.Q(), 4, 14, 1, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 13, 4, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 14, 4, \u2603);
            this.a(\u2603, afi.aO.Q(), 4, 13, 4, \u2603);
            this.a(\u2603, afi.aO.Q(), 4, 14, 4, \u2603);
            this.a(\u2603, \u2603, 1, 15, 1, 4, 15, 4, afi.e.Q(), afi.e.Q(), false);
            for (int i = 0; i <= 5; ++i) {
                for (int j = 0; j <= 5; ++j) {
                    if (j == 0 || j == 5 || i == 0 || i == 5) {
                        this.a(\u2603, afi.n.Q(), j, 11, i, \u2603);
                        this.b(\u2603, j, 12, i, \u2603);
                    }
                }
            }
            return true;
        }
    }
    
    public static class k extends p
    {
        public aec a;
        public boolean b;
        public int c;
        public e d;
        public List<e> e;
        public List<aqt> f;
        public List<aqt> g;
        
        public k() {
            this.f = (List<aqt>)Lists.newArrayList();
            this.g = (List<aqt>)Lists.newArrayList();
        }
        
        public k(final aec \u2603, final int \u2603, final Random \u2603, final int \u2603, final int \u2603, final List<e> \u2603, final int \u2603) {
            super(null, 0, \u2603, \u2603, \u2603);
            this.f = (List<aqt>)Lists.newArrayList();
            this.g = (List<aqt>)Lists.newArrayList();
            this.a = \u2603;
            this.e = \u2603;
            this.c = \u2603;
            final ady a = \u2603.a(new cj(\u2603, 0, \u2603), ady.ad);
            this.a(this.b = (a == ady.r || a == ady.G));
        }
        
        public aec e() {
            return this.a;
        }
    }
    
    public abstract static class o extends n
    {
        public o() {
        }
        
        protected o(final k \u2603, final int \u2603) {
            super(\u2603, \u2603);
        }
    }
    
    public static class l extends o
    {
        private int a;
        
        public l() {
        }
        
        public l(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = Math.max(\u2603.c(), \u2603.e());
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Length", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.f("Length");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            boolean b = false;
            for (int i = \u2603.nextInt(5); i < this.a - 8; i += 2 + \u2603.nextInt(5)) {
                final aqt aqt = this.a((k)\u2603, \u2603, \u2603, 0, i);
                if (aqt != null) {
                    i += Math.max(aqt.l.c(), aqt.l.e());
                    b = true;
                }
            }
            for (int i = \u2603.nextInt(5); i < this.a - 8; i += 2 + \u2603.nextInt(5)) {
                final aqt aqt = this.b((k)\u2603, \u2603, \u2603, 0, i);
                if (aqt != null) {
                    i += Math.max(aqt.l.c(), aqt.l.e());
                    b = true;
                }
            }
            if (b && \u2603.nextInt(3) > 0 && this.m != null) {
                switch (aqw$1.a[this.m.ordinal()]) {
                    case 1: {
                        e((k)\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.c, cq.e, this.d());
                        break;
                    }
                    case 2: {
                        e((k)\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.f - 2, cq.e, this.d());
                        break;
                    }
                    case 4: {
                        e((k)\u2603, \u2603, \u2603, this.l.d - 2, this.l.b, this.l.c - 1, cq.c, this.d());
                        break;
                    }
                    case 3: {
                        e((k)\u2603, \u2603, \u2603, this.l.a, this.l.b, this.l.c - 1, cq.c, this.d());
                        break;
                    }
                }
            }
            if (b && \u2603.nextInt(3) > 0 && this.m != null) {
                switch (aqw$1.a[this.m.ordinal()]) {
                    case 1: {
                        e((k)\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.c, cq.f, this.d());
                        break;
                    }
                    case 2: {
                        e((k)\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.f - 2, cq.f, this.d());
                        break;
                    }
                    case 4: {
                        e((k)\u2603, \u2603, \u2603, this.l.d - 2, this.l.b, this.l.f + 1, cq.d, this.d());
                        break;
                    }
                    case 3: {
                        e((k)\u2603, \u2603, \u2603, this.l.a, this.l.b, this.l.f + 1, cq.d, this.d());
                        break;
                    }
                }
            }
        }
        
        public static aqe a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            for (int i = 7 * ns.a(\u2603, 3, 5); i >= 7; i -= 7) {
                final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 3, 3, i, \u2603);
                if (aqt.a(\u2603, a) == null) {
                    return a;
                }
            }
            return null;
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final alz a = this.a(afi.n.Q());
            final alz a2 = this.a(afi.e.Q());
            for (int i = this.l.a; i <= this.l.d; ++i) {
                for (int j = this.l.c; j <= this.l.f; ++j) {
                    cj b = new cj(i, 64, j);
                    if (\u2603.b(b)) {
                        b = \u2603.r(b).b();
                        \u2603.a(b, a, 2);
                        \u2603.a(b.b(), a2, 2);
                    }
                }
            }
            return true;
        }
    }
    
    public static class g extends n
    {
        private boolean a;
        
        public g() {
        }
        
        public g(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = \u2603.nextBoolean();
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Terrace", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.n("Terrace");
        }
        
        public static g a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 5, 6, 5, \u2603);
            if (aqt.a(\u2603, a) != null) {
                return null;
            }
            return new g(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 6 - 1, 0);
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 0, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 0, 4, 4, 4, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 4, 1, 3, 4, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.e.Q(), 0, 1, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 0, 2, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 0, 3, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 1, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 2, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 3, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 0, 1, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 0, 2, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 0, 3, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 1, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 2, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 3, 4, \u2603);
            this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 1, 4, 3, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 4, 3, 3, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 2, 2, \u2603);
            this.a(\u2603, afi.f.Q(), 1, 1, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 1, 2, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 1, 3, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 2, 3, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 3, 3, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 3, 2, 0, \u2603);
            this.a(\u2603, afi.f.Q(), 3, 1, 0, \u2603);
            if (this.a(\u2603, 2, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 2, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, \u2603);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 3, 3, 3, afi.a.Q(), afi.a.Q(), false);
            if (this.a) {
                this.a(\u2603, afi.aO.Q(), 0, 5, 0, \u2603);
                this.a(\u2603, afi.aO.Q(), 1, 5, 0, \u2603);
                this.a(\u2603, afi.aO.Q(), 2, 5, 0, \u2603);
                this.a(\u2603, afi.aO.Q(), 3, 5, 0, \u2603);
                this.a(\u2603, afi.aO.Q(), 4, 5, 0, \u2603);
                this.a(\u2603, afi.aO.Q(), 0, 5, 4, \u2603);
                this.a(\u2603, afi.aO.Q(), 1, 5, 4, \u2603);
                this.a(\u2603, afi.aO.Q(), 2, 5, 4, \u2603);
                this.a(\u2603, afi.aO.Q(), 3, 5, 4, \u2603);
                this.a(\u2603, afi.aO.Q(), 4, 5, 4, \u2603);
                this.a(\u2603, afi.aO.Q(), 4, 5, 1, \u2603);
                this.a(\u2603, afi.aO.Q(), 4, 5, 2, \u2603);
                this.a(\u2603, afi.aO.Q(), 4, 5, 3, \u2603);
                this.a(\u2603, afi.aO.Q(), 0, 5, 1, \u2603);
                this.a(\u2603, afi.aO.Q(), 0, 5, 2, \u2603);
                this.a(\u2603, afi.aO.Q(), 0, 5, 3, \u2603);
            }
            if (this.a) {
                final int i = this.a(afi.au, 3);
                this.a(\u2603, afi.au.a(i), 3, 1, 3, \u2603);
                this.a(\u2603, afi.au.a(i), 3, 2, 3, \u2603);
                this.a(\u2603, afi.au.a(i), 3, 3, 3, \u2603);
                this.a(\u2603, afi.au.a(i), 3, 4, 3, \u2603);
            }
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m), 2, 3, 1, \u2603);
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 5; ++j) {
                    this.b(\u2603, j, 6, i, \u2603);
                    this.b(\u2603, afi.e.Q(), j, -1, i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 1, 1, 2, 1);
            return true;
        }
    }
    
    public static class i extends n
    {
        public i() {
        }
        
        public i(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static i a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 5, 12, 9, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new i(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 12 - 1, 0);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 3, 3, 7, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 1, 3, 9, 3, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 3, 0, 8, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 0, 3, 10, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 1, 0, 10, 3, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 1, 4, 10, 3, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 4, 0, 4, 7, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 4, 4, 4, 7, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 8, 3, 4, 8, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 4, 3, 10, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 5, 3, 5, 7, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 9, 0, 4, 9, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 0, 4, 4, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, afi.e.Q(), 0, 11, 2, \u2603);
            this.a(\u2603, afi.e.Q(), 4, 11, 2, \u2603);
            this.a(\u2603, afi.e.Q(), 2, 11, 0, \u2603);
            this.a(\u2603, afi.e.Q(), 2, 11, 4, \u2603);
            this.a(\u2603, afi.e.Q(), 1, 1, 6, \u2603);
            this.a(\u2603, afi.e.Q(), 1, 1, 7, \u2603);
            this.a(\u2603, afi.e.Q(), 2, 1, 7, \u2603);
            this.a(\u2603, afi.e.Q(), 3, 1, 6, \u2603);
            this.a(\u2603, afi.e.Q(), 3, 1, 7, \u2603);
            this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 1, 1, 5, \u2603);
            this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 2, 1, 6, \u2603);
            this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 3, 1, 5, \u2603);
            this.a(\u2603, afi.aw.a(this.a(afi.aw, 1)), 1, 2, 7, \u2603);
            this.a(\u2603, afi.aw.a(this.a(afi.aw, 0)), 3, 2, 7, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 3, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 3, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 6, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 7, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 6, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 7, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 6, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 7, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 6, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 7, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 3, 6, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 3, 6, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 3, 8, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.d()), 2, 4, 7, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.e()), 1, 4, 6, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.f()), 3, 4, 6, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m), 2, 4, 5, \u2603);
            final int a = this.a(afi.au, 4);
            for (int i = 1; i <= 9; ++i) {
                this.a(\u2603, afi.au.a(a), 3, i, 3, \u2603);
            }
            this.a(\u2603, afi.a.Q(), 2, 1, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 2, 0, \u2603);
            this.a(\u2603, \u2603, \u2603, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
            if (this.a(\u2603, 2, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 2, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, \u2603);
            }
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 5; ++j) {
                    this.b(\u2603, j, 12, i, \u2603);
                    this.b(\u2603, afi.e.Q(), j, -1, i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 2, 1, 2, 1);
            return true;
        }
        
        @Override
        protected int c(final int \u2603, final int \u2603) {
            return 2;
        }
    }
    
    public static class a extends n
    {
        public a() {
        }
        
        public a(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static a a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 9, 9, 6, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new a(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 9 - 1, 0);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 7, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 8, 0, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 8, 5, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 6, 1, 8, 6, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 7, 2, 8, 7, 3, afi.e.Q(), afi.e.Q(), false);
            final int a = this.a(afi.ad, 3);
            final int a2 = this.a(afi.ad, 2);
            for (int i = -1; i <= 2; ++i) {
                for (int j = 0; j <= 8; ++j) {
                    this.a(\u2603, afi.ad.a(a), j, 6 + i, i, \u2603);
                    this.a(\u2603, afi.ad.a(a2), j, 6 + i, 5 - i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 5, 8, 1, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 8, 1, 0, 8, 1, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 2, 1, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 4, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 5, 0, 4, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 8, 2, 5, 8, 4, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 8, 2, 0, 8, 4, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 1, 0, 4, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 5, 7, 4, 5, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 8, 2, 1, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 0, 7, 4, 0, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.bj.Q(), 4, 2, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 2, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 6, 2, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 3, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 3, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 6, 3, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 3, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 3, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 3, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 3, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 5, \u2603);
            this.a(\u2603, afi.bj.Q(), 3, 2, 5, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 2, 5, \u2603);
            this.a(\u2603, afi.bj.Q(), 6, 2, 5, \u2603);
            this.a(\u2603, \u2603, 1, 4, 1, 7, 4, 1, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 4, 4, 7, 4, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 4, 7, 3, 4, afi.X.Q(), afi.X.Q(), false);
            this.a(\u2603, afi.f.Q(), 7, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(this.a(afi.ad, 0)), 7, 1, 3, \u2603);
            int i = this.a(afi.ad, 3);
            this.a(\u2603, afi.ad.a(i), 6, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(i), 5, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(i), 4, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(i), 3, 1, 4, \u2603);
            this.a(\u2603, afi.aO.Q(), 6, 1, 3, \u2603);
            this.a(\u2603, afi.aB.Q(), 6, 2, 3, \u2603);
            this.a(\u2603, afi.aO.Q(), 4, 1, 3, \u2603);
            this.a(\u2603, afi.aB.Q(), 4, 2, 3, \u2603);
            this.a(\u2603, afi.ai.Q(), 7, 1, 1, \u2603);
            this.a(\u2603, afi.a.Q(), 1, 1, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 1, 2, 0, \u2603);
            this.a(\u2603, \u2603, \u2603, 1, 1, 0, cq.b(this.a(afi.ao, 1)));
            if (this.a(\u2603, 1, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 1, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 1, 0, -1, \u2603);
            }
            for (int j = 0; j < 6; ++j) {
                for (int k = 0; k < 9; ++k) {
                    this.b(\u2603, k, 9, j, \u2603);
                    this.b(\u2603, afi.e.Q(), k, -1, j, \u2603);
                }
            }
            this.a(\u2603, \u2603, 2, 1, 2, 1);
            return true;
        }
        
        @Override
        protected int c(final int \u2603, final int \u2603) {
            return 1;
        }
    }
    
    public static class h extends n
    {
        private boolean a;
        private int b;
        
        public h() {
        }
        
        public h(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = \u2603.nextBoolean();
            this.b = \u2603.nextInt(3);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("T", this.b);
            \u2603.a("C", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.f("T");
            this.a = \u2603.n("C");
        }
        
        public static h a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 4, 6, 5, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new h(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 6 - 1, 0);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 3, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 3, 0, 4, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 1, 2, 0, 3, afi.d.Q(), afi.d.Q(), false);
            if (this.a) {
                this.a(\u2603, \u2603, 1, 4, 1, 2, 4, 3, afi.r.Q(), afi.r.Q(), false);
            }
            else {
                this.a(\u2603, \u2603, 1, 5, 1, 2, 5, 3, afi.r.Q(), afi.r.Q(), false);
            }
            this.a(\u2603, afi.r.Q(), 1, 4, 0, \u2603);
            this.a(\u2603, afi.r.Q(), 2, 4, 0, \u2603);
            this.a(\u2603, afi.r.Q(), 1, 4, 4, \u2603);
            this.a(\u2603, afi.r.Q(), 2, 4, 4, \u2603);
            this.a(\u2603, afi.r.Q(), 0, 4, 1, \u2603);
            this.a(\u2603, afi.r.Q(), 0, 4, 2, \u2603);
            this.a(\u2603, afi.r.Q(), 0, 4, 3, \u2603);
            this.a(\u2603, afi.r.Q(), 3, 4, 1, \u2603);
            this.a(\u2603, afi.r.Q(), 3, 4, 2, \u2603);
            this.a(\u2603, afi.r.Q(), 3, 4, 3, \u2603);
            this.a(\u2603, \u2603, 0, 1, 0, 0, 3, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 0, 3, 3, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 4, 0, 3, 4, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 4, 3, 3, 4, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 1, 3, 3, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 4, 2, 3, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 3, 2, 2, \u2603);
            if (this.b > 0) {
                this.a(\u2603, afi.aO.Q(), this.b, 1, 3, \u2603);
                this.a(\u2603, afi.aB.Q(), this.b, 2, 3, \u2603);
            }
            this.a(\u2603, afi.a.Q(), 1, 1, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 1, 2, 0, \u2603);
            this.a(\u2603, \u2603, \u2603, 1, 1, 0, cq.b(this.a(afi.ao, 1)));
            if (this.a(\u2603, 1, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 1, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 1, 0, -1, \u2603);
            }
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 4; ++j) {
                    this.b(\u2603, j, 6, i, \u2603);
                    this.b(\u2603, afi.e.Q(), j, -1, i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 1, 1, 2, 1);
            return true;
        }
    }
    
    public static class f extends n
    {
        public f() {
        }
        
        public f(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static f a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 9, 7, 11, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new f(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 7 - 1, 0);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 0, 6, 8, 0, 10, afi.d.Q(), afi.d.Q(), false);
            this.a(\u2603, afi.e.Q(), 6, 0, 6, \u2603);
            this.a(\u2603, \u2603, 2, 1, 6, 2, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
            this.a(\u2603, \u2603, 8, 1, 6, 8, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 10, 7, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 8, 0, 0, 8, 3, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 5, 7, 1, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 5, 7, 3, 5, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 4, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.f.Q(), 0, 4, 2, \u2603);
            this.a(\u2603, afi.f.Q(), 0, 4, 3, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 4, 2, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 4, 3, \u2603);
            final int a = this.a(afi.ad, 3);
            final int a2 = this.a(afi.ad, 2);
            for (int i = -1; i <= 2; ++i) {
                for (int j = 0; j <= 8; ++j) {
                    this.a(\u2603, afi.ad.a(a), j, 4 + i, i, \u2603);
                    this.a(\u2603, afi.ad.a(a2), j, 4 + i, 5 - i, \u2603);
                }
            }
            this.a(\u2603, afi.r.Q(), 0, 2, 1, \u2603);
            this.a(\u2603, afi.r.Q(), 0, 2, 4, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 1, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 3, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 5, \u2603);
            this.a(\u2603, afi.bj.Q(), 3, 2, 5, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 2, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 6, 2, 5, \u2603);
            this.a(\u2603, afi.aO.Q(), 2, 1, 3, \u2603);
            this.a(\u2603, afi.aB.Q(), 2, 2, 3, \u2603);
            this.a(\u2603, afi.f.Q(), 1, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(this.a(afi.ad, 3)), 2, 1, 4, \u2603);
            this.a(\u2603, afi.ad.a(this.a(afi.ad, 1)), 1, 1, 3, \u2603);
            this.a(\u2603, \u2603, 5, 0, 1, 7, 0, 3, afi.T.Q(), afi.T.Q(), false);
            this.a(\u2603, afi.T.Q(), 6, 1, 1, \u2603);
            this.a(\u2603, afi.T.Q(), 6, 1, 2, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 1, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 2, 0, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m), 2, 3, 1, \u2603);
            this.a(\u2603, \u2603, \u2603, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
            if (this.a(\u2603, 2, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 2, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, \u2603);
            }
            this.a(\u2603, afi.a.Q(), 6, 1, 5, \u2603);
            this.a(\u2603, afi.a.Q(), 6, 2, 5, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.d()), 6, 3, 4, \u2603);
            this.a(\u2603, \u2603, \u2603, 6, 1, 5, cq.b(this.a(afi.ao, 1)));
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 9; ++j) {
                    this.b(\u2603, j, 7, i, \u2603);
                    this.b(\u2603, afi.e.Q(), j, -1, i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 4, 1, 2, 2);
            return true;
        }
        
        @Override
        protected int c(final int \u2603, final int \u2603) {
            if (\u2603 == 0) {
                return 4;
            }
            return super.c(\u2603, \u2603);
        }
    }
    
    public static class m extends n
    {
        public m() {
        }
        
        public m(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static m a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 9, 7, 12, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new m(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 7 - 1, 0);
            }
            this.a(\u2603, \u2603, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 0, 5, 8, 0, 10, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 8, 0, 0, 8, 3, 10, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 7, 2, 0, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 5, 2, 1, 5, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 2, 0, 6, 2, 3, 10, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 3, 0, 10, 7, 3, 10, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 5, 2, 3, 5, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 4, 3, 4, 4, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, afi.f.Q(), 0, 4, 2, \u2603);
            this.a(\u2603, afi.f.Q(), 0, 4, 3, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 4, 2, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 4, 3, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 4, 4, \u2603);
            final int a = this.a(afi.ad, 3);
            final int a2 = this.a(afi.ad, 2);
            for (int i = -1; i <= 2; ++i) {
                for (int j = 0; j <= 8; ++j) {
                    this.a(\u2603, afi.ad.a(a), j, 4 + i, i, \u2603);
                    if ((i > -1 || j <= 1) && (i > 0 || j <= 3) && (i > 1 || j <= 4 || j >= 6)) {
                        this.a(\u2603, afi.ad.a(a2), j, 4 + i, 5 - i, \u2603);
                    }
                }
            }
            this.a(\u2603, \u2603, 3, 4, 5, 3, 4, 10, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 7, 4, 2, 7, 4, 10, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 4, 5, 4, 4, 5, 10, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 6, 5, 4, 6, 5, 10, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 5, 6, 3, 5, 6, 10, afi.f.Q(), afi.f.Q(), false);
            int i = this.a(afi.ad, 0);
            for (int j = 4; j >= 1; --j) {
                this.a(\u2603, afi.f.Q(), j, 2 + j, 7 - j, \u2603);
                for (int k = 8 - j; k <= 10; ++k) {
                    this.a(\u2603, afi.ad.a(i), j, 2 + j, k, \u2603);
                }
            }
            int j = this.a(afi.ad, 1);
            this.a(\u2603, afi.f.Q(), 6, 6, 3, \u2603);
            this.a(\u2603, afi.f.Q(), 7, 5, 4, \u2603);
            this.a(\u2603, afi.ad.a(j), 6, 6, 4, \u2603);
            for (int k = 6; k <= 8; ++k) {
                for (int l = 5; l <= 10; ++l) {
                    this.a(\u2603, afi.ad.a(j), k, 12 - k, l, \u2603);
                }
            }
            this.a(\u2603, afi.r.Q(), 0, 2, 1, \u2603);
            this.a(\u2603, afi.r.Q(), 0, 2, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 3, \u2603);
            this.a(\u2603, afi.r.Q(), 4, 2, 0, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 2, 0, \u2603);
            this.a(\u2603, afi.r.Q(), 6, 2, 0, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 1, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 3, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 4, \u2603);
            this.a(\u2603, afi.f.Q(), 8, 2, 5, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 6, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 7, \u2603);
            this.a(\u2603, afi.bj.Q(), 8, 2, 8, \u2603);
            this.a(\u2603, afi.r.Q(), 8, 2, 9, \u2603);
            this.a(\u2603, afi.r.Q(), 2, 2, 6, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 7, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 8, \u2603);
            this.a(\u2603, afi.r.Q(), 2, 2, 9, \u2603);
            this.a(\u2603, afi.r.Q(), 4, 4, 10, \u2603);
            this.a(\u2603, afi.bj.Q(), 5, 4, 10, \u2603);
            this.a(\u2603, afi.r.Q(), 6, 4, 10, \u2603);
            this.a(\u2603, afi.f.Q(), 5, 5, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 1, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 2, 2, 0, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m), 2, 3, 1, \u2603);
            this.a(\u2603, \u2603, \u2603, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
            this.a(\u2603, \u2603, 1, 0, -1, 3, 2, -1, afi.a.Q(), afi.a.Q(), false);
            if (this.a(\u2603, 2, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, 2, -1, -1, \u2603).c().t() != arm.a) {
                this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, \u2603);
            }
            for (int k = 0; k < 5; ++k) {
                for (int l = 0; l < 9; ++l) {
                    this.b(\u2603, l, 7, k, \u2603);
                    this.b(\u2603, afi.e.Q(), l, -1, k, \u2603);
                }
            }
            for (int k = 5; k < 11; ++k) {
                for (int l = 2; l < 9; ++l) {
                    this.b(\u2603, l, 7, k, \u2603);
                    this.b(\u2603, afi.e.Q(), l, -1, k, \u2603);
                }
            }
            this.a(\u2603, \u2603, 4, 1, 2, 2);
            return true;
        }
    }
    
    public static class j extends n
    {
        private static final List<ob> a;
        private boolean b;
        
        public j() {
        }
        
        public j(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static j a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 10, 6, 7, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new j(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Chest", this.b);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.n("Chest");
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 6 - 1, 0);
            }
            this.a(\u2603, \u2603, 0, 1, 0, 9, 4, 6, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 9, 0, 6, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 4, 0, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 9, 5, 6, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 1, 8, 5, 5, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 0, 0, 4, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 0, 3, 4, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 6, 0, 4, 6, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, afi.f.Q(), 3, 3, 1, \u2603);
            this.a(\u2603, \u2603, 3, 1, 2, 3, 3, 2, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 3, 5, 3, 3, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 5, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 6, 5, 3, 6, afi.f.Q(), afi.f.Q(), false);
            this.a(\u2603, \u2603, 5, 1, 0, 5, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
            this.a(\u2603, \u2603, 9, 1, 0, 9, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
            this.a(\u2603, \u2603, 6, 1, 4, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
            this.a(\u2603, afi.k.Q(), 7, 1, 5, \u2603);
            this.a(\u2603, afi.k.Q(), 8, 1, 5, \u2603);
            this.a(\u2603, afi.bi.Q(), 9, 2, 5, \u2603);
            this.a(\u2603, afi.bi.Q(), 9, 2, 4, \u2603);
            this.a(\u2603, \u2603, 7, 2, 4, 8, 2, 5, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.e.Q(), 6, 1, 3, \u2603);
            this.a(\u2603, afi.al.Q(), 6, 2, 3, \u2603);
            this.a(\u2603, afi.al.Q(), 6, 3, 3, \u2603);
            this.a(\u2603, afi.T.Q(), 8, 1, 1, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 2, \u2603);
            this.a(\u2603, afi.bj.Q(), 0, 2, 4, \u2603);
            this.a(\u2603, afi.bj.Q(), 2, 2, 6, \u2603);
            this.a(\u2603, afi.bj.Q(), 4, 2, 6, \u2603);
            this.a(\u2603, afi.aO.Q(), 2, 1, 4, \u2603);
            this.a(\u2603, afi.aB.Q(), 2, 2, 4, \u2603);
            this.a(\u2603, afi.f.Q(), 1, 1, 5, \u2603);
            this.a(\u2603, afi.ad.a(this.a(afi.ad, 3)), 2, 1, 5, \u2603);
            this.a(\u2603, afi.ad.a(this.a(afi.ad, 1)), 1, 1, 4, \u2603);
            if (!this.b && \u2603.b(new cj(this.a(5, 5), this.d(1), this.b(5, 5)))) {
                this.b = true;
                this.a(\u2603, \u2603, \u2603, 5, 1, 5, j.a, 3 + \u2603.nextInt(6));
            }
            for (int i = 6; i <= 8; ++i) {
                if (this.a(\u2603, i, 0, -1, \u2603).c().t() == arm.a && this.a(\u2603, i, -1, -1, \u2603).c().t() != arm.a) {
                    this.a(\u2603, afi.aw.a(this.a(afi.aw, 3)), i, 0, -1, \u2603);
                }
            }
            for (int i = 0; i < 7; ++i) {
                for (int j = 0; j < 10; ++j) {
                    this.b(\u2603, j, 6, i, \u2603);
                    this.b(\u2603, afi.e.Q(), j, -1, i, \u2603);
                }
            }
            this.a(\u2603, \u2603, 7, 1, 1, 1);
            return true;
        }
        
        @Override
        protected int c(final int \u2603, final int \u2603) {
            return 3;
        }
        
        static {
            a = Lists.newArrayList(new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zw.a(afi.Z), 0, 3, 7, 5), new ob(zw.a(afi.g), 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1));
        }
    }
    
    public static class c extends n
    {
        private afh a;
        private afh b;
        
        public c() {
        }
        
        public c(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = this.a(\u2603);
            this.b = this.a(\u2603);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("CA", afh.c.b(this.a));
            \u2603.a("CB", afh.c.b(this.b));
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = afh.c(\u2603.f("CA"));
            this.b = afh.c(\u2603.f("CB"));
        }
        
        private afh a(final Random \u2603) {
            switch (\u2603.nextInt(5)) {
                default: {
                    return afi.aj;
                }
                case 0: {
                    return afi.cb;
                }
                case 1: {
                    return afi.cc;
                }
            }
        }
        
        public static c a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 7, 4, 9, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new c(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 4 - 1, 0);
            }
            this.a(\u2603, \u2603, 0, 1, 0, 6, 4, 8, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 5, 0, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 8, 5, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
            for (int i = 1; i <= 7; ++i) {
                this.a(\u2603, this.a.a(ns.a(\u2603, 2, 7)), 1, 1, i, \u2603);
                this.a(\u2603, this.a.a(ns.a(\u2603, 2, 7)), 2, 1, i, \u2603);
                this.a(\u2603, this.b.a(ns.a(\u2603, 2, 7)), 4, 1, i, \u2603);
                this.a(\u2603, this.b.a(ns.a(\u2603, 2, 7)), 5, 1, i, \u2603);
            }
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 7; ++j) {
                    this.b(\u2603, j, 4, i, \u2603);
                    this.b(\u2603, afi.d.Q(), j, -1, i, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class b extends n
    {
        private afh a;
        private afh b;
        private afh c;
        private afh d;
        
        public b() {
        }
        
        public b(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = this.a(\u2603);
            this.b = this.a(\u2603);
            this.c = this.a(\u2603);
            this.d = this.a(\u2603);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("CA", afh.c.b(this.a));
            \u2603.a("CB", afh.c.b(this.b));
            \u2603.a("CC", afh.c.b(this.c));
            \u2603.a("CD", afh.c.b(this.d));
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = afh.c(\u2603.f("CA"));
            this.b = afh.c(\u2603.f("CB"));
            this.c = afh.c(\u2603.f("CC"));
            this.d = afh.c(\u2603.f("CD"));
        }
        
        private afh a(final Random \u2603) {
            switch (\u2603.nextInt(5)) {
                default: {
                    return afi.aj;
                }
                case 0: {
                    return afi.cb;
                }
                case 1: {
                    return afi.cc;
                }
            }
        }
        
        public static b a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 13, 4, 9, \u2603);
            if (!n.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new b(\u2603, \u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 4 - 1, 0);
            }
            this.a(\u2603, \u2603, 0, 1, 0, 12, 4, 8, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 7, 0, 1, 8, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 10, 0, 1, 11, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 12, 0, 0, 12, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 11, 0, 0, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 8, 11, 0, 8, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
            this.a(\u2603, \u2603, 9, 0, 1, 9, 0, 7, afi.j.Q(), afi.j.Q(), false);
            for (int i = 1; i <= 7; ++i) {
                this.a(\u2603, this.a.a(ns.a(\u2603, 2, 7)), 1, 1, i, \u2603);
                this.a(\u2603, this.a.a(ns.a(\u2603, 2, 7)), 2, 1, i, \u2603);
                this.a(\u2603, this.b.a(ns.a(\u2603, 2, 7)), 4, 1, i, \u2603);
                this.a(\u2603, this.b.a(ns.a(\u2603, 2, 7)), 5, 1, i, \u2603);
                this.a(\u2603, this.c.a(ns.a(\u2603, 2, 7)), 7, 1, i, \u2603);
                this.a(\u2603, this.c.a(ns.a(\u2603, 2, 7)), 8, 1, i, \u2603);
                this.a(\u2603, this.d.a(ns.a(\u2603, 2, 7)), 10, 1, i, \u2603);
                this.a(\u2603, this.d.a(ns.a(\u2603, 2, 7)), 11, 1, i, \u2603);
            }
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 13; ++j) {
                    this.b(\u2603, j, 4, i, \u2603);
                    this.b(\u2603, afi.d.Q(), j, -1, i, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class d extends n
    {
        public d() {
        }
        
        public d(final k \u2603, final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603, \u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        public static aqe a(final k \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, 0, 0, 0, 3, 4, 2, \u2603);
            if (aqt.a(\u2603, a) != null) {
                return null;
            }
            return a;
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.h < 0) {
                this.h = this.b(\u2603, \u2603);
                if (this.h < 0) {
                    return true;
                }
                this.l.a(0, this.h - this.l.e + 4 - 1, 0);
            }
            this.a(\u2603, \u2603, 0, 0, 0, 2, 3, 1, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.aO.Q(), 1, 0, 0, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 1, 0, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 2, 0, \u2603);
            this.a(\u2603, afi.L.a(zd.a.b()), 1, 3, 0, \u2603);
            final boolean b = this.m == cq.f || this.m == cq.c;
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.e()), b ? 2 : 0, 3, 0, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m), 1, 3, 1, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.f()), b ? 0 : 2, 3, 0, \u2603);
            this.a(\u2603, afi.aa.Q().a((amo<Comparable>)akf.a, this.m.d()), 1, 3, -1, \u2603);
            return true;
        }
    }
}
