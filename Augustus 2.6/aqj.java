import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqj
{
    private static final n[] a;
    private static final n[] b;
    
    public static void a() {
        aqr.a(a.class, "NeBCr");
        aqr.a(b.class, "NeBEF");
        aqr.a(c.class, "NeBS");
        aqr.a(d.class, "NeCCS");
        aqr.a(e.class, "NeCTB");
        aqr.a(f.class, "NeCE");
        aqr.a(g.class, "NeSCSC");
        aqr.a(h.class, "NeSCLT");
        aqr.a(i.class, "NeSC");
        aqr.a(j.class, "NeSCRT");
        aqr.a(k.class, "NeCSR");
        aqr.a(l.class, "NeMT");
        aqr.a(o.class, "NeRC");
        aqr.a(p.class, "NeSR");
        aqr.a(q.class, "NeStart");
    }
    
    private static m b(final n \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        final Class<? extends m> a = \u2603.a;
        m m = null;
        if (a == c.class) {
            m = c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == a.class) {
            m = aqj.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == o.class) {
            m = o.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == p.class) {
            m = p.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == l.class) {
            m = l.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == f.class) {
            m = f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == i.class) {
            m = i.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == j.class) {
            m = j.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == h.class) {
            m = h.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == d.class) {
            m = d.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == e.class) {
            m = e.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == g.class) {
            m = g.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (a == k.class) {
            m = k.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        return m;
    }
    
    static {
        a = new n[] { new n(c.class, 30, 0, true), new n(a.class, 10, 4), new n(o.class, 10, 4), new n(p.class, 10, 3), new n(l.class, 5, 2), new n(f.class, 5, 1) };
        b = new n[] { new n(i.class, 25, 0, true), new n(g.class, 15, 5), new n(j.class, 5, 10), new n(h.class, 5, 10), new n(d.class, 10, 3, true), new n(e.class, 7, 2), new n(k.class, 5, 2) };
    }
    
    static class n
    {
        public Class<? extends m> a;
        public final int b;
        public int c;
        public int d;
        public boolean e;
        
        public n(final Class<? extends m> \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.d = \u2603;
            this.e = \u2603;
        }
        
        public n(final Class<? extends m> \u2603, final int \u2603, final int \u2603) {
            this(\u2603, \u2603, \u2603, false);
        }
        
        public boolean a(final int \u2603) {
            return this.d == 0 || this.c < this.d;
        }
        
        public boolean a() {
            return this.d == 0 || this.c < this.d;
        }
    }
    
    abstract static class m extends aqt
    {
        protected static final List<ob> a;
        
        public m() {
        }
        
        protected m(final int \u2603) {
            super(\u2603);
        }
        
        @Override
        protected void b(final dn \u2603) {
        }
        
        @Override
        protected void a(final dn \u2603) {
        }
        
        private int a(final List<n> \u2603) {
            boolean b = false;
            int n = 0;
            for (final n n2 : \u2603) {
                if (n2.d > 0 && n2.c < n2.d) {
                    b = true;
                }
                n += n2.b;
            }
            return b ? n : -1;
        }
        
        private m a(final q \u2603, final List<n> \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final int a = this.a(\u2603);
            final boolean b = a > 0 && \u2603 <= 30;
            int n = 0;
            while (n < 5 && b) {
                ++n;
                int nextInt = \u2603.nextInt(a);
                for (final n n2 : \u2603) {
                    nextInt -= n2.b;
                    if (nextInt < 0) {
                        if (!n2.a(\u2603)) {
                            break;
                        }
                        if (n2 == \u2603.b && !n2.e) {
                            break;
                        }
                        final m a2 = b(n2, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                        if (a2 != null) {
                            final n n3 = n2;
                            ++n3.c;
                            \u2603.b = n2;
                            if (!n2.a()) {
                                \u2603.remove(n2);
                            }
                            return a2;
                        }
                        continue;
                    }
                }
            }
            return aqj.b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        
        private aqt a(final q \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603, final boolean \u2603) {
            if (Math.abs(\u2603 - \u2603.c().a) > 112 || Math.abs(\u2603 - \u2603.c().c) > 112) {
                return aqj.b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            }
            List<n> \u26032 = \u2603.c;
            if (\u2603) {
                \u26032 = \u2603.d;
            }
            final aqt a = this.a(\u2603, \u26032, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603 + 1);
            if (a != null) {
                \u2603.add(a);
                \u2603.e.add(a);
            }
            return a;
        }
        
        protected aqt a(final q \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (this.m != null) {
                switch (aqj$1.a[this.m.ordinal()]) {
                    case 1: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, this.m, this.d(), \u2603);
                    }
                    case 2: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, this.m, this.d(), \u2603);
                    }
                    case 3: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, this.m, this.d(), \u2603);
                    }
                    case 4: {
                        return this.a(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, this.m, this.d(), \u2603);
                    }
                }
            }
            return null;
        }
        
        protected aqt b(final q \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (this.m != null) {
                switch (aqj$1.a[this.m.ordinal()]) {
                    case 1: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d(), \u2603);
                    }
                    case 2: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d(), \u2603);
                    }
                    case 3: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d(), \u2603);
                    }
                    case 4: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d(), \u2603);
                    }
                }
            }
            return null;
        }
        
        protected aqt c(final q \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (this.m != null) {
                switch (aqj$1.a[this.m.ordinal()]) {
                    case 1: {
                        return this.a(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d(), \u2603);
                    }
                    case 2: {
                        return this.a(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d(), \u2603);
                    }
                    case 3: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d(), \u2603);
                    }
                    case 4: {
                        return this.a(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d(), \u2603);
                    }
                }
            }
            return null;
        }
        
        protected static boolean a(final aqe \u2603) {
            return \u2603 != null && \u2603.b > 10;
        }
        
        static {
            a = Lists.newArrayList(new ob(zy.i, 0, 1, 3, 5), new ob(zy.j, 0, 1, 5, 5), new ob(zy.k, 0, 1, 3, 15), new ob(zy.B, 0, 1, 1, 5), new ob(zy.ah, 0, 1, 1, 5), new ob(zy.d, 0, 1, 1, 5), new ob(zy.by, 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 8), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 3), new ob(zw.a(afi.Z), 0, 2, 4, 2));
        }
    }
    
    public static class q extends a
    {
        public n b;
        public List<n> c;
        public List<n> d;
        public List<aqt> e;
        
        public q() {
            this.e = (List<aqt>)Lists.newArrayList();
        }
        
        public q(final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603);
            this.e = (List<aqt>)Lists.newArrayList();
            this.c = (List<n>)Lists.newArrayList();
            for (final n n2 : aqj.a) {
                n2.c = 0;
                this.c.add(n2);
            }
            this.d = (List<n>)Lists.newArrayList();
            for (final n n2 : aqj.b) {
                n2.c = 0;
                this.d.add(n2);
            }
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
        }
    }
    
    public static class c extends m
    {
        public c() {
        }
        
        public c(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 1, 3, false);
        }
        
        public static c a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -3, 0, 5, 10, 19, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new c(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 3, 0, 4, 4, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 0, 3, 7, 18, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 0, 5, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 5, 0, 4, 5, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 4, 2, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 13, 4, 2, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 0, 4, 1, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 15, 4, 1, 18, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 2; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                    this.b(\u2603, afi.by.Q(), i, -1, 18 - j, \u2603);
                }
            }
            this.a(\u2603, \u2603, 0, 1, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 4, 0, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 14, 0, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 17, 0, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 4, 4, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 14, 4, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 17, 4, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
            return true;
        }
    }
    
    public static class b extends m
    {
        private int b;
        
        public b() {
        }
        
        public b(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.b = \u2603.nextInt();
        }
        
        public static b a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -3, 0, 5, 10, 8, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new b(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.f("Seed");
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Seed", this.b);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final Random random = new Random(this.b);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 3; j <= 4; ++j) {
                    final int n = random.nextInt(8);
                    this.a(\u2603, \u2603, i, j, 0, i, j, n, afi.by.Q(), afi.by.Q(), false);
                }
            }
            int i = random.nextInt(8);
            this.a(\u2603, \u2603, 0, 5, 0, 0, 5, i, afi.by.Q(), afi.by.Q(), false);
            i = random.nextInt(8);
            this.a(\u2603, \u2603, 4, 5, 0, 4, 5, i, afi.by.Q(), afi.by.Q(), false);
            for (i = 0; i <= 4; ++i) {
                final int j = random.nextInt(5);
                this.a(\u2603, \u2603, i, 2, 0, i, 2, j, afi.by.Q(), afi.by.Q(), false);
            }
            for (i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 1; ++j) {
                    final int n = random.nextInt(3);
                    this.a(\u2603, \u2603, i, j, 0, i, j, n, afi.by.Q(), afi.by.Q(), false);
                }
            }
            return true;
        }
    }
    
    public static class a extends m
    {
        public a() {
        }
        
        public a(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        protected a(final Random \u2603, final int \u2603, final int \u2603) {
            super(0);
            this.m = cq.c.a.a(\u2603);
            switch (aqj$1.a[this.m.ordinal()]) {
                case 1:
                case 2: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 19 - 1, 73, \u2603 + 19 - 1);
                    break;
                }
                default: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 19 - 1, 73, \u2603 + 19 - 1);
                    break;
                }
            }
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 8, 3, false);
            this.b((q)\u2603, \u2603, \u2603, 3, 8, false);
            this.c((q)\u2603, \u2603, \u2603, 3, 8, false);
        }
        
        public static a a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -8, -3, 0, 19, 10, 19, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new a(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 7, 3, 0, 11, 4, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 7, 18, 4, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 0, 10, 7, 18, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 8, 18, 7, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 7, 5, 0, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 7, 5, 11, 7, 5, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 0, 11, 5, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 11, 11, 5, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 7, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 7, 18, 5, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 11, 7, 5, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 11, 18, 5, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 7, 2, 0, 11, 2, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 7, 2, 13, 11, 2, 18, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 7, 0, 0, 11, 1, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 7, 0, 15, 11, 1, 18, afi.by.Q(), afi.by.Q(), false);
            for (int i = 7; i <= 11; ++i) {
                for (int j = 0; j <= 2; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                    this.b(\u2603, afi.by.Q(), i, -1, 18 - j, \u2603);
                }
            }
            this.a(\u2603, \u2603, 0, 2, 7, 5, 2, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 13, 2, 7, 18, 2, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 7, 3, 1, 11, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 15, 0, 7, 18, 1, 11, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 2; ++i) {
                for (int j = 7; j <= 11; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                    this.b(\u2603, afi.by.Q(), 18 - i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class o extends m
    {
        public o() {
        }
        
        public o(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 2, 0, false);
            this.b((q)\u2603, \u2603, \u2603, 0, 2, false);
            this.c((q)\u2603, \u2603, \u2603, 0, 2, false);
        }
        
        public static o a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -2, 0, 0, 7, 9, 7, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new o(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 6, 7, 6, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 1, 6, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 6, 1, 6, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 2, 0, 6, 6, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 2, 6, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 6, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 5, 0, 6, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 2, 0, 6, 6, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 2, 5, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 6, 0, 4, 6, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 2, 6, 6, 4, 6, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 6, 4, 5, 6, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 6, 2, 0, 6, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 6, 6, 2, 6, 6, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 5, 2, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
            for (int i = 0; i <= 6; ++i) {
                for (int j = 0; j <= 6; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class p extends m
    {
        public p() {
        }
        
        public p(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.c((q)\u2603, \u2603, \u2603, 6, 2, false);
        }
        
        public static p a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -2, 0, 0, 7, 11, 7, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new p(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 6, 10, 6, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 1, 8, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 2, 0, 6, 8, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 1, 0, 8, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 2, 1, 6, 8, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 6, 5, 8, 6, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 6, 3, 2, 6, 5, 2, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 6, 3, 4, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, afi.by.Q(), 5, 2, 5, \u2603);
            this.a(\u2603, \u2603, 4, 2, 5, 4, 3, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 3, 2, 5, 3, 4, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 2, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 5, 1, 6, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 7, 1, 5, 7, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 8, 2, 6, 8, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 6, 0, 4, 8, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
            for (int i = 0; i <= 6; ++i) {
                for (int j = 0; j <= 6; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class l extends m
    {
        private boolean b;
        
        public l() {
        }
        
        public l(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.n("Mob");
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Mob", this.b);
        }
        
        public static l a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -2, 0, 0, 7, 8, 9, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new l(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 2, 0, 6, 7, 7, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 0, 5, 1, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 1, 5, 2, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 2, 5, 3, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 4, 3, 5, 4, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 0, 1, 4, 2, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 2, 0, 5, 4, 2, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 2, 1, 5, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 5, 2, 5, 5, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 3, 0, 5, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 5, 3, 6, 5, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 5, 8, 5, 5, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, afi.bz.Q(), 1, 6, 3, \u2603);
            this.a(\u2603, afi.bz.Q(), 5, 6, 3, \u2603);
            this.a(\u2603, \u2603, 0, 6, 3, 0, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 6, 6, 3, 6, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 1, 6, 8, 5, 7, 8, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 2, 8, 8, 4, 8, 8, afi.bz.Q(), afi.bz.Q(), false);
            if (!this.b) {
                final cj \u26032 = new cj(this.a(3, 5), this.d(5), this.b(3, 5));
                if (\u2603.b(\u26032)) {
                    this.b = true;
                    \u2603.a(\u26032, afi.ac.Q(), 2);
                    final akw s = \u2603.s(\u26032);
                    if (s instanceof all) {
                        ((all)s).b().a("Blaze");
                    }
                }
            }
            for (int i = 0; i <= 6; ++i) {
                for (int j = 0; j <= 6; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class f extends m
    {
        public f() {
        }
        
        public f(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 5, 3, true);
        }
        
        public static f a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -5, -3, 0, 13, 14, 13, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new f(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 3, 0, 12, 4, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 12, 13, 12, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 1, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 0, 12, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 11, 4, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 11, 10, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 9, 11, 7, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 0, 4, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 0, 10, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 9, 0, 7, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 11, 2, 10, 12, 10, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 8, 0, 7, 8, 0, afi.bz.Q(), afi.bz.Q(), false);
            for (int i = 1; i <= 11; i += 2) {
                this.a(\u2603, \u2603, i, 10, 0, i, 11, 0, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, i, 10, 12, i, 11, 12, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 0, 10, i, 0, 11, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 12, 10, i, 12, 11, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, afi.by.Q(), i, 13, 0, \u2603);
                this.a(\u2603, afi.by.Q(), i, 13, 12, \u2603);
                this.a(\u2603, afi.by.Q(), 0, 13, i, \u2603);
                this.a(\u2603, afi.by.Q(), 12, 13, i, \u2603);
                this.a(\u2603, afi.bz.Q(), i + 1, 13, 0, \u2603);
                this.a(\u2603, afi.bz.Q(), i + 1, 13, 12, \u2603);
                this.a(\u2603, afi.bz.Q(), 0, 13, i + 1, \u2603);
                this.a(\u2603, afi.bz.Q(), 12, 13, i + 1, \u2603);
            }
            this.a(\u2603, afi.bz.Q(), 0, 13, 0, \u2603);
            this.a(\u2603, afi.bz.Q(), 0, 13, 12, \u2603);
            this.a(\u2603, afi.bz.Q(), 0, 13, 0, \u2603);
            this.a(\u2603, afi.bz.Q(), 12, 13, 0, \u2603);
            for (int i = 3; i <= 9; i += 2) {
                this.a(\u2603, \u2603, 1, 7, i, 1, 8, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 11, 7, i, 11, 8, i, afi.bz.Q(), afi.bz.Q(), false);
            }
            this.a(\u2603, \u2603, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
            for (int i = 4; i <= 8; ++i) {
                for (int j = 0; j <= 2; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                    this.b(\u2603, afi.by.Q(), i, -1, 12 - j, \u2603);
                }
            }
            for (int i = 0; i <= 2; ++i) {
                for (int j = 4; j <= 8; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                    this.b(\u2603, afi.by.Q(), 12 - i, -1, j, \u2603);
                }
            }
            this.a(\u2603, \u2603, 5, 5, 5, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 1, 6, 6, 4, 6, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.by.Q(), 6, 0, 6, \u2603);
            this.a(\u2603, afi.k.Q(), 6, 5, 6, \u2603);
            final cj cj = new cj(this.a(6, 6), this.d(5), this.b(6, 6));
            if (\u2603.b(cj)) {
                \u2603.a(afi.k, cj, \u2603);
            }
            return true;
        }
    }
    
    public static class k extends m
    {
        public k() {
        }
        
        public k(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 5, 3, true);
            this.a((q)\u2603, \u2603, \u2603, 5, 11, true);
        }
        
        public static k a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -5, -3, 0, 13, 14, 13, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new k(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 3, 0, 12, 4, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 12, 13, 12, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 5, 0, 1, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 11, 5, 0, 12, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 11, 4, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 11, 10, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 9, 11, 7, 12, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 0, 4, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 0, 10, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 5, 9, 0, 7, 12, 1, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 11, 2, 10, 12, 10, afi.by.Q(), afi.by.Q(), false);
            for (int i = 1; i <= 11; i += 2) {
                this.a(\u2603, \u2603, i, 10, 0, i, 11, 0, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, i, 10, 12, i, 11, 12, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 0, 10, i, 0, 11, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 12, 10, i, 12, 11, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, afi.by.Q(), i, 13, 0, \u2603);
                this.a(\u2603, afi.by.Q(), i, 13, 12, \u2603);
                this.a(\u2603, afi.by.Q(), 0, 13, i, \u2603);
                this.a(\u2603, afi.by.Q(), 12, 13, i, \u2603);
                this.a(\u2603, afi.bz.Q(), i + 1, 13, 0, \u2603);
                this.a(\u2603, afi.bz.Q(), i + 1, 13, 12, \u2603);
                this.a(\u2603, afi.bz.Q(), 0, 13, i + 1, \u2603);
                this.a(\u2603, afi.bz.Q(), 12, 13, i + 1, \u2603);
            }
            this.a(\u2603, afi.bz.Q(), 0, 13, 0, \u2603);
            this.a(\u2603, afi.bz.Q(), 0, 13, 12, \u2603);
            this.a(\u2603, afi.bz.Q(), 0, 13, 0, \u2603);
            this.a(\u2603, afi.bz.Q(), 12, 13, 0, \u2603);
            for (int i = 3; i <= 9; i += 2) {
                this.a(\u2603, \u2603, 1, 7, i, 1, 8, i, afi.bz.Q(), afi.bz.Q(), false);
                this.a(\u2603, \u2603, 11, 7, i, 11, 8, i, afi.bz.Q(), afi.bz.Q(), false);
            }
            int i = this.a(afi.bA, 3);
            for (int j = 0; j <= 6; ++j) {
                final int a = j + 4;
                for (int k = 5; k <= 7; ++k) {
                    this.a(\u2603, afi.bA.a(i), k, 5 + j, a, \u2603);
                }
                if (a >= 5 && a <= 8) {
                    this.a(\u2603, \u2603, 5, 5, a, 7, j + 4, a, afi.by.Q(), afi.by.Q(), false);
                }
                else if (a >= 9 && a <= 10) {
                    this.a(\u2603, \u2603, 5, 8, a, 7, j + 4, a, afi.by.Q(), afi.by.Q(), false);
                }
                if (j >= 1) {
                    this.a(\u2603, \u2603, 5, 6 + j, a, 7, 9 + j, a, afi.a.Q(), afi.a.Q(), false);
                }
            }
            for (int j = 5; j <= 7; ++j) {
                this.a(\u2603, afi.bA.a(i), j, 12, 11, \u2603);
            }
            this.a(\u2603, \u2603, 5, 6, 7, 5, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 7, 6, 7, 7, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 5, 13, 12, 7, 13, 12, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 2, 3, 5, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 9, 3, 5, 10, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 2, 5, 4, 2, 5, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 9, 5, 2, 10, 5, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 9, 5, 9, 10, 5, 10, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 10, 5, 4, 10, 5, 8, afi.by.Q(), afi.by.Q(), false);
            int j = this.a(afi.bA, 0);
            final int a = this.a(afi.bA, 1);
            this.a(\u2603, afi.bA.a(a), 4, 5, 2, \u2603);
            this.a(\u2603, afi.bA.a(a), 4, 5, 3, \u2603);
            this.a(\u2603, afi.bA.a(a), 4, 5, 9, \u2603);
            this.a(\u2603, afi.bA.a(a), 4, 5, 10, \u2603);
            this.a(\u2603, afi.bA.a(j), 8, 5, 2, \u2603);
            this.a(\u2603, afi.bA.a(j), 8, 5, 3, \u2603);
            this.a(\u2603, afi.bA.a(j), 8, 5, 9, \u2603);
            this.a(\u2603, afi.bA.a(j), 8, 5, 10, \u2603);
            this.a(\u2603, \u2603, 3, 4, 4, 4, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
            this.a(\u2603, \u2603, 8, 4, 4, 9, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
            this.a(\u2603, \u2603, 3, 5, 4, 4, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 4, 9, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
            for (int k = 4; k <= 8; ++k) {
                for (int l = 0; l <= 2; ++l) {
                    this.b(\u2603, afi.by.Q(), k, -1, l, \u2603);
                    this.b(\u2603, afi.by.Q(), k, -1, 12 - l, \u2603);
                }
            }
            for (int k = 0; k <= 2; ++k) {
                for (int l = 4; l <= 8; ++l) {
                    this.b(\u2603, afi.by.Q(), k, -1, l, \u2603);
                    this.b(\u2603, afi.by.Q(), 12 - k, -1, l, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class i extends m
    {
        public i() {
        }
        
        public i(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 1, 0, true);
        }
        
        public static i a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, 0, 0, 5, 7, 5, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new i(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 0, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 3, 0, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 3, 4, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 4; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class g extends m
    {
        public g() {
        }
        
        public g(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 1, 0, true);
            this.b((q)\u2603, \u2603, \u2603, 0, 1, true);
            this.c((q)\u2603, \u2603, \u2603, 0, 1, true);
        }
        
        public static g a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, 0, 0, 5, 7, 5, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new g(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 4, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 4; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class j extends m
    {
        private boolean b;
        
        public j() {
        }
        
        public j(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.b = (\u2603.nextInt(3) == 0);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.n("Chest");
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Chest", this.b);
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.c((q)\u2603, \u2603, \u2603, 0, 1, true);
        }
        
        public static j a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, 0, 0, 5, 7, 5, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new j(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 3, 0, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
            if (this.b && \u2603.b(new cj(this.a(1, 3), this.d(2), this.b(1, 3)))) {
                this.b = false;
                this.a(\u2603, \u2603, \u2603, 1, 2, 3, j.a, 2 + \u2603.nextInt(4));
            }
            this.a(\u2603, \u2603, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 4; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class h extends m
    {
        private boolean b;
        
        public h() {
        }
        
        public h(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.b = (\u2603.nextInt(3) == 0);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.n("Chest");
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Chest", this.b);
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.b((q)\u2603, \u2603, \u2603, 0, 1, true);
        }
        
        public static h a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, 0, 0, 5, 7, 5, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new h(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 4, 2, 0, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 4, 3, 3, 4, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 4, 3, 5, 4, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
            if (this.b && \u2603.b(new cj(this.a(3, 3), this.d(2), this.b(3, 3)))) {
                this.b = false;
                this.a(\u2603, \u2603, \u2603, 3, 2, 3, h.a, 2 + \u2603.nextInt(4));
            }
            this.a(\u2603, \u2603, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
            for (int i = 0; i <= 4; ++i) {
                for (int j = 0; j <= 4; ++j) {
                    this.b(\u2603, afi.by.Q(), i, -1, j, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class d extends m
    {
        public d() {
        }
        
        public d(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((q)\u2603, \u2603, \u2603, 1, 0, true);
        }
        
        public static d a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -7, 0, 5, 14, 10, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new d(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final int a = this.a(afi.bA, 2);
            for (int i = 0; i <= 9; ++i) {
                final int max = Math.max(1, 7 - i);
                final int min = Math.min(Math.max(max + 5, 14 - i), 13);
                final int \u26032 = i;
                this.a(\u2603, \u2603, 0, 0, \u26032, 4, max, \u26032, afi.by.Q(), afi.by.Q(), false);
                this.a(\u2603, \u2603, 1, max + 1, \u26032, 3, min - 1, \u26032, afi.a.Q(), afi.a.Q(), false);
                if (i <= 6) {
                    this.a(\u2603, afi.bA.a(a), 1, max + 1, \u26032, \u2603);
                    this.a(\u2603, afi.bA.a(a), 2, max + 1, \u26032, \u2603);
                    this.a(\u2603, afi.bA.a(a), 3, max + 1, \u26032, \u2603);
                }
                this.a(\u2603, \u2603, 0, min, \u26032, 4, min, \u26032, afi.by.Q(), afi.by.Q(), false);
                this.a(\u2603, \u2603, 0, max + 1, \u26032, 0, min - 1, \u26032, afi.by.Q(), afi.by.Q(), false);
                this.a(\u2603, \u2603, 4, max + 1, \u26032, 4, min - 1, \u26032, afi.by.Q(), afi.by.Q(), false);
                if ((i & 0x1) == 0x0) {
                    this.a(\u2603, \u2603, 0, max + 2, \u26032, 0, max + 3, \u26032, afi.bz.Q(), afi.bz.Q(), false);
                    this.a(\u2603, \u2603, 4, max + 2, \u26032, 4, max + 3, \u26032, afi.bz.Q(), afi.bz.Q(), false);
                }
                for (int j = 0; j <= 4; ++j) {
                    this.b(\u2603, afi.by.Q(), j, -1, \u26032, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class e extends m
    {
        public e() {
        }
        
        public e(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            int n = 1;
            if (this.m == cq.e || this.m == cq.c) {
                n = 5;
            }
            this.b((q)\u2603, \u2603, \u2603, 0, n, \u2603.nextInt(8) > 0);
            this.c((q)\u2603, \u2603, \u2603, 0, n, \u2603.nextInt(8) > 0);
        }
        
        public static e a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -3, 0, 0, 9, 7, 9, \u2603);
            if (!m.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new e(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 8, 1, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 8, 5, 8, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 6, 0, 8, 6, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 0, 2, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 2, 0, 8, 5, 0, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 0, 1, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 7, 3, 0, 7, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 2, 4, 8, 2, 8, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 1, 4, 2, 2, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 6, 1, 4, 7, 2, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 8, 8, 3, 8, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 6, 0, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 8, 3, 6, 8, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 0, 3, 4, 0, 5, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 8, 3, 4, 8, 5, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 3, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 6, 3, 5, 7, 5, 5, afi.by.Q(), afi.by.Q(), false);
            this.a(\u2603, \u2603, 1, 4, 5, 1, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
            this.a(\u2603, \u2603, 7, 4, 5, 7, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
            for (int i = 0; i <= 5; ++i) {
                for (int j = 0; j <= 8; ++j) {
                    this.b(\u2603, afi.by.Q(), j, -1, i, \u2603);
                }
            }
            return true;
        }
    }
}
