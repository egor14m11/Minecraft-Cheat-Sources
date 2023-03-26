import java.util.Random;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqp
{
    private static final f[] b;
    private static List<f> c;
    private static Class<? extends p> d;
    static int a;
    private static final k e;
    
    public static void a() {
        aqr.a(a.class, "SHCC");
        aqr.a(b.class, "SHFC");
        aqr.a(c.class, "SH5C");
        aqr.a(d.class, "SHLT");
        aqr.a(e.class, "SHLi");
        aqr.a(g.class, "SHPR");
        aqr.a(h.class, "SHPH");
        aqr.a(i.class, "SHRT");
        aqr.a(j.class, "SHRC");
        aqr.a(l.class, "SHSD");
        aqr.a(m.class, "SHStart");
        aqr.a(n.class, "SHS");
        aqr.a(o.class, "SHSSD");
    }
    
    public static void b() {
        aqp.c = (List<f>)Lists.newArrayList();
        for (final f f : aqp.b) {
            f.c = 0;
            aqp.c.add(f);
        }
        aqp.d = null;
    }
    
    private static boolean d() {
        boolean b = false;
        aqp.a = 0;
        for (final f f : aqp.c) {
            if (f.d > 0 && f.c < f.d) {
                b = true;
            }
            aqp.a += f.b;
        }
        return b;
    }
    
    private static p a(final Class<? extends p> \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        p p = null;
        if (\u2603 == n.class) {
            p = n.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == h.class) {
            p = h.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == d.class) {
            p = aqp.d.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == i.class) {
            p = aqp.d.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == j.class) {
            p = j.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == o.class) {
            p = o.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == l.class) {
            p = l.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == c.class) {
            p = aqp.c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == a.class) {
            p = aqp.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == e.class) {
            p = aqp.e.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (\u2603 == g.class) {
            p = g.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        return p;
    }
    
    private static p b(final m \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        if (!d()) {
            return null;
        }
        if (aqp.d != null) {
            final p a = a(aqp.d, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            aqp.d = null;
            if (a != null) {
                return a;
            }
        }
        int i = 0;
        while (i < 5) {
            ++i;
            int nextInt = \u2603.nextInt(aqp.a);
            for (final f a2 : aqp.c) {
                nextInt -= a2.b;
                if (nextInt < 0) {
                    if (!a2.a(\u2603)) {
                        break;
                    }
                    if (a2 == \u2603.a) {
                        break;
                    }
                    final p a3 = a(a2.a, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                    if (a3 != null) {
                        final f f = a2;
                        ++f.c;
                        \u2603.a = a2;
                        if (!a2.a()) {
                            aqp.c.remove(a2);
                        }
                        return a3;
                    }
                    continue;
                }
            }
        }
        final aqe a4 = aqp.b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (a4 != null && a4.b > 1) {
            return new b(\u2603, \u2603, a4, \u2603);
        }
        return null;
    }
    
    private static aqt c(final m \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        if (\u2603 > 50) {
            return null;
        }
        if (Math.abs(\u2603 - \u2603.c().a) > 112 || Math.abs(\u2603 - \u2603.c().c) > 112) {
            return null;
        }
        final aqt b = b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603 + 1);
        if (b != null) {
            \u2603.add(b);
            \u2603.c.add(b);
        }
        return b;
    }
    
    static {
        b = new f[] { new f(n.class, 40, 0), new f(h.class, 5, 5), new f(d.class, 20, 0), new f(i.class, 20, 0), new f(j.class, 10, 6), new f(o.class, 5, 5), new f(l.class, 5, 5), new f(c.class, 5, 4), new f(a.class, 5, 4), new f(e.class, 10, 2) {
                @Override
                public boolean a(final int \u2603) {
                    return super.a(\u2603) && \u2603 > 4;
                }
            }, new f(g.class, 20, 1) {
                @Override
                public boolean a(final int \u2603) {
                    return super.a(\u2603) && \u2603 > 5;
                }
            } };
        e = new k();
    }
    
    static class f
    {
        public Class<? extends p> a;
        public final int b;
        public int c;
        public int d;
        
        public f(final Class<? extends p> \u2603, final int \u2603, final int \u2603) {
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
    
    abstract static class p extends aqt
    {
        protected a d;
        
        public p() {
            this.d = a.a;
        }
        
        protected p(final int \u2603) {
            super(\u2603);
            this.d = a.a;
        }
        
        @Override
        protected void a(final dn \u2603) {
            \u2603.a("EntryDoor", this.d.name());
        }
        
        @Override
        protected void b(final dn \u2603) {
            this.d = a.valueOf(\u2603.j("EntryDoor"));
        }
        
        protected void a(final adm \u2603, final Random \u2603, final aqe \u2603, final a \u2603, final int \u2603, final int \u2603, final int \u2603) {
            switch (aqp$3.a[\u2603.ordinal()]) {
                default: {
                    this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603 + 3 - 1, \u2603 + 3 - 1, \u2603, afi.a.Q(), afi.a.Q(), false);
                    break;
                }
                case 2: {
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 1, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.ao.Q(), \u2603 + 1, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.ao.a(8), \u2603 + 1, \u2603 + 1, \u2603, \u2603);
                    break;
                }
                case 3: {
                    this.a(\u2603, afi.a.Q(), \u2603 + 1, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.a.Q(), \u2603 + 1, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603 + 1, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603 + 2, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603 + 2, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bi.Q(), \u2603 + 2, \u2603, \u2603, \u2603);
                    break;
                }
                case 4: {
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 1, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603 + 2, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.bf.Q(), \u2603 + 2, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.aA.Q(), \u2603 + 1, \u2603, \u2603, \u2603);
                    this.a(\u2603, afi.aA.a(8), \u2603 + 1, \u2603 + 1, \u2603, \u2603);
                    this.a(\u2603, afi.aG.a(this.a(afi.aG, 4)), \u2603 + 2, \u2603 + 1, \u2603 + 1, \u2603);
                    this.a(\u2603, afi.aG.a(this.a(afi.aG, 3)), \u2603 + 2, \u2603 + 1, \u2603 - 1, \u2603);
                    break;
                }
            }
        }
        
        protected a a(final Random \u2603) {
            final int nextInt = \u2603.nextInt(5);
            switch (nextInt) {
                default: {
                    return a.a;
                }
                case 2: {
                    return a.b;
                }
                case 3: {
                    return a.c;
                }
                case 4: {
                    return a.d;
                }
            }
        }
        
        protected aqt a(final m \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            if (this.m != null) {
                switch (aqp$3.b[this.m.ordinal()]) {
                    case 1: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, this.m, this.d());
                    }
                    case 2: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, this.m, this.d());
                    }
                    case 3: {
                        return c(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, this.m, this.d());
                    }
                    case 4: {
                        return c(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, this.m, this.d());
                    }
                }
            }
            return null;
        }
        
        protected aqt b(final m \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            if (this.m != null) {
                switch (aqp$3.b[this.m.ordinal()]) {
                    case 1: {
                        return c(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d());
                    }
                    case 2: {
                        return c(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603, this.l.c + \u2603, cq.e, this.d());
                    }
                    case 3: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d());
                    }
                    case 4: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.c - 1, cq.c, this.d());
                    }
                }
            }
            return null;
        }
        
        protected aqt c(final m \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            if (this.m != null) {
                switch (aqp$3.b[this.m.ordinal()]) {
                    case 1: {
                        return c(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d());
                    }
                    case 2: {
                        return c(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603, this.l.c + \u2603, cq.f, this.d());
                    }
                    case 3: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d());
                    }
                    case 4: {
                        return c(\u2603, \u2603, \u2603, this.l.a + \u2603, this.l.b + \u2603, this.l.f + 1, cq.d, this.d());
                    }
                }
            }
            return null;
        }
        
        protected static boolean a(final aqe \u2603) {
            return \u2603 != null && \u2603.b > 10;
        }
        
        public enum a
        {
            a, 
            b, 
            c, 
            d;
        }
    }
    
    public static class b extends p
    {
        private int a;
        
        public b() {
        }
        
        public b(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = ((\u2603 == cq.c || \u2603 == cq.d) ? \u2603.e() : \u2603.c());
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Steps", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.f("Steps");
        }
        
        public static aqe a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final int n = 3;
            aqe aqe = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, 4, \u2603);
            final aqt a = aqt.a(\u2603, aqe);
            if (a == null) {
                return null;
            }
            if (a.c().b == aqe.b) {
                for (int i = 3; i >= 1; --i) {
                    aqe = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, i - 1, \u2603);
                    if (!a.c().a(aqe)) {
                        return aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, i, \u2603);
                    }
                }
            }
            return null;
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            for (int i = 0; i < this.a; ++i) {
                this.a(\u2603, afi.bf.Q(), 0, 0, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 1, 0, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 2, 0, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 3, 0, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 4, 0, i, \u2603);
                for (int j = 1; j <= 3; ++j) {
                    this.a(\u2603, afi.bf.Q(), 0, j, i, \u2603);
                    this.a(\u2603, afi.a.Q(), 1, j, i, \u2603);
                    this.a(\u2603, afi.a.Q(), 2, j, i, \u2603);
                    this.a(\u2603, afi.a.Q(), 3, j, i, \u2603);
                    this.a(\u2603, afi.bf.Q(), 4, j, i, \u2603);
                }
                this.a(\u2603, afi.bf.Q(), 0, 4, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 1, 4, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 2, 4, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 3, 4, i, \u2603);
                this.a(\u2603, afi.bf.Q(), 4, 4, i, \u2603);
            }
            return true;
        }
    }
    
    public static class l extends p
    {
        private boolean a;
        
        public l() {
        }
        
        public l(final int \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603);
            this.a = true;
            this.m = cq.c.a.a(\u2603);
            this.d = p.a.a;
            switch (aqp$3.b[this.m.ordinal()]) {
                case 1:
                case 2: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 5 - 1, 74, \u2603 + 5 - 1);
                    break;
                }
                default: {
                    this.l = new aqe(\u2603, 64, \u2603, \u2603 + 5 - 1, 74, \u2603 + 5 - 1);
                    break;
                }
            }
        }
        
        public l(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.a = false;
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Source", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.n("Source");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            if (this.a) {
                aqp.d = c.class;
            }
            this.a((m)\u2603, \u2603, \u2603, 1, 1);
        }
        
        public static l a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -7, 0, 5, 11, 5, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new l(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 10, 4, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 7, 0);
            this.a(\u2603, \u2603, \u2603, p.a.a, 1, 1, 4);
            this.a(\u2603, afi.bf.Q(), 2, 6, 1, \u2603);
            this.a(\u2603, afi.bf.Q(), 1, 5, 1, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 1, 6, 1, \u2603);
            this.a(\u2603, afi.bf.Q(), 1, 5, 2, \u2603);
            this.a(\u2603, afi.bf.Q(), 1, 4, 3, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 1, 5, 3, \u2603);
            this.a(\u2603, afi.bf.Q(), 2, 4, 3, \u2603);
            this.a(\u2603, afi.bf.Q(), 3, 3, 3, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 3, 4, 3, \u2603);
            this.a(\u2603, afi.bf.Q(), 3, 3, 2, \u2603);
            this.a(\u2603, afi.bf.Q(), 3, 2, 1, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 3, 3, 1, \u2603);
            this.a(\u2603, afi.bf.Q(), 2, 2, 1, \u2603);
            this.a(\u2603, afi.bf.Q(), 1, 1, 1, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 1, 2, 1, \u2603);
            this.a(\u2603, afi.bf.Q(), 1, 1, 2, \u2603);
            this.a(\u2603, afi.U.a(akb.a.a.a()), 1, 1, 3, \u2603);
            return true;
        }
    }
    
    public static class m extends l
    {
        public f a;
        public g b;
        public List<aqt> c;
        
        public m() {
            this.c = (List<aqt>)Lists.newArrayList();
        }
        
        public m(final int \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(0, \u2603, \u2603, \u2603);
            this.c = (List<aqt>)Lists.newArrayList();
        }
        
        @Override
        public cj a() {
            if (this.b != null) {
                return this.b.a();
            }
            return super.a();
        }
    }
    
    public static class n extends p
    {
        private boolean a;
        private boolean b;
        
        public n() {
        }
        
        public n(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
            this.a = (\u2603.nextInt(2) == 0);
            this.b = (\u2603.nextInt(2) == 0);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Left", this.a);
            \u2603.a("Right", this.b);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.n("Left");
            this.b = \u2603.n("Right");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((m)\u2603, \u2603, \u2603, 1, 1);
            if (this.a) {
                this.b((m)\u2603, \u2603, \u2603, 1, 2);
            }
            if (this.b) {
                this.c((m)\u2603, \u2603, \u2603, 1, 2);
            }
        }
        
        public static n a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, 7, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new n(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 4, 6, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 1, 0);
            this.a(\u2603, \u2603, \u2603, p.a.a, 1, 1, 6);
            this.a(\u2603, \u2603, \u2603, 0.1f, 1, 2, 1, afi.aa.Q());
            this.a(\u2603, \u2603, \u2603, 0.1f, 3, 2, 1, afi.aa.Q());
            this.a(\u2603, \u2603, \u2603, 0.1f, 1, 2, 5, afi.aa.Q());
            this.a(\u2603, \u2603, \u2603, 0.1f, 3, 2, 5, afi.aa.Q());
            if (this.a) {
                this.a(\u2603, \u2603, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
            }
            if (this.b) {
                this.a(\u2603, \u2603, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
            }
            return true;
        }
    }
    
    public static class a extends p
    {
        private static final List<ob> a;
        private boolean b;
        
        public a() {
        }
        
        public a(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
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
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((m)\u2603, \u2603, \u2603, 1, 1);
        }
        
        public static a a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, 7, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new a(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 4, 6, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 1, 0);
            this.a(\u2603, \u2603, \u2603, p.a.a, 1, 1, 6);
            this.a(\u2603, \u2603, 3, 1, 2, 3, 1, 4, afi.bf.Q(), afi.bf.Q(), false);
            this.a(\u2603, afi.U.a(akb.a.f.a()), 3, 1, 1, \u2603);
            this.a(\u2603, afi.U.a(akb.a.f.a()), 3, 1, 5, \u2603);
            this.a(\u2603, afi.U.a(akb.a.f.a()), 3, 2, 2, \u2603);
            this.a(\u2603, afi.U.a(akb.a.f.a()), 3, 2, 4, \u2603);
            for (int i = 2; i <= 4; ++i) {
                this.a(\u2603, afi.U.a(akb.a.f.a()), 2, 1, i, \u2603);
            }
            if (!this.b && \u2603.b(new cj(this.a(3, 3), this.d(2), this.b(3, 3)))) {
                this.b = true;
                this.a(\u2603, \u2603, \u2603, 3, 2, 3, ob.a(aqp.a.a, zy.cd.b(\u2603)), 2 + \u2603.nextInt(2));
            }
            return true;
        }
        
        static {
            a = Lists.newArrayList(new ob(zy.bu, 0, 1, 1, 10), new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aA, 0, 1, 1, 1), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1));
        }
    }
    
    public static class o extends p
    {
        public o() {
        }
        
        public o(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((m)\u2603, \u2603, \u2603, 1, 1);
        }
        
        public static o a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -7, 0, 5, 11, 8, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new o(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 10, 7, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 7, 0);
            this.a(\u2603, \u2603, \u2603, p.a.a, 1, 1, 7);
            final int a = this.a(afi.aw, 2);
            for (int i = 0; i < 6; ++i) {
                this.a(\u2603, afi.aw.a(a), 1, 6 - i, 1 + i, \u2603);
                this.a(\u2603, afi.aw.a(a), 2, 6 - i, 1 + i, \u2603);
                this.a(\u2603, afi.aw.a(a), 3, 6 - i, 1 + i, \u2603);
                if (i < 5) {
                    this.a(\u2603, afi.bf.Q(), 1, 5 - i, 1 + i, \u2603);
                    this.a(\u2603, afi.bf.Q(), 2, 5 - i, 1 + i, \u2603);
                    this.a(\u2603, afi.bf.Q(), 3, 5 - i, 1 + i, \u2603);
                }
            }
            return true;
        }
    }
    
    public static class d extends p
    {
        public d() {
        }
        
        public d(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            if (this.m == cq.c || this.m == cq.f) {
                this.b((m)\u2603, \u2603, \u2603, 1, 1);
            }
            else {
                this.c((m)\u2603, \u2603, \u2603, 1, 1);
            }
        }
        
        public static d a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 5, 5, 5, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new d(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 4, 4, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 1, 0);
            if (this.m == cq.c || this.m == cq.f) {
                this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
            }
            else {
                this.a(\u2603, \u2603, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
            }
            return true;
        }
    }
    
    public static class i extends d
    {
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            if (this.m == cq.c || this.m == cq.f) {
                this.c((m)\u2603, \u2603, \u2603, 1, 1);
            }
            else {
                this.b((m)\u2603, \u2603, \u2603, 1, 1);
            }
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 4, 4, 4, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 1, 0);
            if (this.m == cq.c || this.m == cq.f) {
                this.a(\u2603, \u2603, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
            }
            else {
                this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
            }
            return true;
        }
    }
    
    public static class j extends p
    {
        private static final List<ob> b;
        protected int a;
        
        public j() {
        }
        
        public j(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
            this.a = \u2603.nextInt(5);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Type", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.f("Type");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((m)\u2603, \u2603, \u2603, 4, 1);
            this.b((m)\u2603, \u2603, \u2603, 1, 4);
            this.c((m)\u2603, \u2603, \u2603, 1, 4);
        }
        
        public static j a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -4, -1, 0, 11, 7, 11, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new j(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 10, 6, 10, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 4, 1, 0);
            this.a(\u2603, \u2603, 4, 1, 10, 6, 3, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 1, 4, 0, 3, 6, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 10, 1, 4, 10, 3, 6, afi.a.Q(), afi.a.Q(), false);
            switch (this.a) {
                case 0: {
                    this.a(\u2603, afi.bf.Q(), 5, 1, 5, \u2603);
                    this.a(\u2603, afi.bf.Q(), 5, 2, 5, \u2603);
                    this.a(\u2603, afi.bf.Q(), 5, 3, 5, \u2603);
                    this.a(\u2603, afi.aa.Q(), 4, 3, 5, \u2603);
                    this.a(\u2603, afi.aa.Q(), 6, 3, 5, \u2603);
                    this.a(\u2603, afi.aa.Q(), 5, 3, 4, \u2603);
                    this.a(\u2603, afi.aa.Q(), 5, 3, 6, \u2603);
                    this.a(\u2603, afi.U.Q(), 4, 1, 4, \u2603);
                    this.a(\u2603, afi.U.Q(), 4, 1, 5, \u2603);
                    this.a(\u2603, afi.U.Q(), 4, 1, 6, \u2603);
                    this.a(\u2603, afi.U.Q(), 6, 1, 4, \u2603);
                    this.a(\u2603, afi.U.Q(), 6, 1, 5, \u2603);
                    this.a(\u2603, afi.U.Q(), 6, 1, 6, \u2603);
                    this.a(\u2603, afi.U.Q(), 5, 1, 4, \u2603);
                    this.a(\u2603, afi.U.Q(), 5, 1, 6, \u2603);
                    break;
                }
                case 1: {
                    for (int i = 0; i < 5; ++i) {
                        this.a(\u2603, afi.bf.Q(), 3, 1, 3 + i, \u2603);
                        this.a(\u2603, afi.bf.Q(), 7, 1, 3 + i, \u2603);
                        this.a(\u2603, afi.bf.Q(), 3 + i, 1, 3, \u2603);
                        this.a(\u2603, afi.bf.Q(), 3 + i, 1, 7, \u2603);
                    }
                    this.a(\u2603, afi.bf.Q(), 5, 1, 5, \u2603);
                    this.a(\u2603, afi.bf.Q(), 5, 2, 5, \u2603);
                    this.a(\u2603, afi.bf.Q(), 5, 3, 5, \u2603);
                    this.a(\u2603, afi.i.Q(), 5, 4, 5, \u2603);
                    break;
                }
                case 2: {
                    for (int i = 1; i <= 9; ++i) {
                        this.a(\u2603, afi.e.Q(), 1, 3, i, \u2603);
                        this.a(\u2603, afi.e.Q(), 9, 3, i, \u2603);
                    }
                    for (int i = 1; i <= 9; ++i) {
                        this.a(\u2603, afi.e.Q(), i, 3, 1, \u2603);
                        this.a(\u2603, afi.e.Q(), i, 3, 9, \u2603);
                    }
                    this.a(\u2603, afi.e.Q(), 5, 1, 4, \u2603);
                    this.a(\u2603, afi.e.Q(), 5, 1, 6, \u2603);
                    this.a(\u2603, afi.e.Q(), 5, 3, 4, \u2603);
                    this.a(\u2603, afi.e.Q(), 5, 3, 6, \u2603);
                    this.a(\u2603, afi.e.Q(), 4, 1, 5, \u2603);
                    this.a(\u2603, afi.e.Q(), 6, 1, 5, \u2603);
                    this.a(\u2603, afi.e.Q(), 4, 3, 5, \u2603);
                    this.a(\u2603, afi.e.Q(), 6, 3, 5, \u2603);
                    for (int i = 1; i <= 3; ++i) {
                        this.a(\u2603, afi.e.Q(), 4, i, 4, \u2603);
                        this.a(\u2603, afi.e.Q(), 6, i, 4, \u2603);
                        this.a(\u2603, afi.e.Q(), 4, i, 6, \u2603);
                        this.a(\u2603, afi.e.Q(), 6, i, 6, \u2603);
                    }
                    this.a(\u2603, afi.aa.Q(), 5, 3, 5, \u2603);
                    for (int i = 2; i <= 8; ++i) {
                        this.a(\u2603, afi.f.Q(), 2, 3, i, \u2603);
                        this.a(\u2603, afi.f.Q(), 3, 3, i, \u2603);
                        if (i <= 3 || i >= 7) {
                            this.a(\u2603, afi.f.Q(), 4, 3, i, \u2603);
                            this.a(\u2603, afi.f.Q(), 5, 3, i, \u2603);
                            this.a(\u2603, afi.f.Q(), 6, 3, i, \u2603);
                        }
                        this.a(\u2603, afi.f.Q(), 7, 3, i, \u2603);
                        this.a(\u2603, afi.f.Q(), 8, 3, i, \u2603);
                    }
                    this.a(\u2603, afi.au.a(this.a(afi.au, cq.e.a())), 9, 1, 3, \u2603);
                    this.a(\u2603, afi.au.a(this.a(afi.au, cq.e.a())), 9, 2, 3, \u2603);
                    this.a(\u2603, afi.au.a(this.a(afi.au, cq.e.a())), 9, 3, 3, \u2603);
                    this.a(\u2603, \u2603, \u2603, 3, 4, 8, ob.a(j.b, zy.cd.b(\u2603)), 1 + \u2603.nextInt(4));
                    break;
                }
            }
            return true;
        }
        
        static {
            b = Lists.newArrayList(new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1));
        }
    }
    
    public static class h extends p
    {
        public h() {
        }
        
        public h(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            this.a((m)\u2603, \u2603, \u2603, 1, 1);
        }
        
        public static h a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -1, -1, 0, 9, 5, 11, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new h(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 8, 4, 10, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 1, 1, 0);
            this.a(\u2603, \u2603, 1, 1, 10, 3, 3, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 1, 4, 3, 1, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 3, 4, 3, 3, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 7, 4, 3, 7, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 9, 4, 3, 9, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 4, 4, 3, 6, afi.bi.Q(), afi.bi.Q(), false);
            this.a(\u2603, \u2603, 5, 1, 5, 7, 3, 5, afi.bi.Q(), afi.bi.Q(), false);
            this.a(\u2603, afi.bi.Q(), 4, 3, 2, \u2603);
            this.a(\u2603, afi.bi.Q(), 4, 3, 8, \u2603);
            this.a(\u2603, afi.aA.a(this.a(afi.aA, 3)), 4, 1, 2, \u2603);
            this.a(\u2603, afi.aA.a(this.a(afi.aA, 3) + 8), 4, 2, 2, \u2603);
            this.a(\u2603, afi.aA.a(this.a(afi.aA, 3)), 4, 1, 8, \u2603);
            this.a(\u2603, afi.aA.a(this.a(afi.aA, 3) + 8), 4, 2, 8, \u2603);
            return true;
        }
    }
    
    public static class e extends p
    {
        private static final List<ob> a;
        private boolean b;
        
        public e() {
        }
        
        public e(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
            this.b = (\u2603.d() > 6);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Tall", this.b);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.b = \u2603.n("Tall");
        }
        
        public static e a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            aqe \u26032 = aqe.a(\u2603, \u2603, \u2603, -4, -1, 0, 14, 11, 15, \u2603);
            if (!p.a(\u26032) || aqt.a(\u2603, \u26032) != null) {
                \u26032 = aqe.a(\u2603, \u2603, \u2603, -4, -1, 0, 14, 6, 15, \u2603);
                if (!p.a(\u26032) || aqt.a(\u2603, \u26032) != null) {
                    return null;
                }
            }
            return new e(\u2603, \u2603, \u26032, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            int n = 11;
            if (!this.b) {
                n = 6;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 13, n - 1, 14, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 4, 1, 0);
            this.a(\u2603, \u2603, \u2603, 0.07f, 2, 1, 1, 11, 4, 13, afi.G.Q(), afi.G.Q(), false);
            final int n2 = 1;
            final int n3 = 12;
            for (int i = 1; i <= 13; ++i) {
                if ((i - 1) % 4 == 0) {
                    this.a(\u2603, \u2603, 1, 1, i, 1, 4, i, afi.f.Q(), afi.f.Q(), false);
                    this.a(\u2603, \u2603, 12, 1, i, 12, 4, i, afi.f.Q(), afi.f.Q(), false);
                    this.a(\u2603, afi.aa.Q(), 2, 3, i, \u2603);
                    this.a(\u2603, afi.aa.Q(), 11, 3, i, \u2603);
                    if (this.b) {
                        this.a(\u2603, \u2603, 1, 6, i, 1, 9, i, afi.f.Q(), afi.f.Q(), false);
                        this.a(\u2603, \u2603, 12, 6, i, 12, 9, i, afi.f.Q(), afi.f.Q(), false);
                    }
                }
                else {
                    this.a(\u2603, \u2603, 1, 1, i, 1, 4, i, afi.X.Q(), afi.X.Q(), false);
                    this.a(\u2603, \u2603, 12, 1, i, 12, 4, i, afi.X.Q(), afi.X.Q(), false);
                    if (this.b) {
                        this.a(\u2603, \u2603, 1, 6, i, 1, 9, i, afi.X.Q(), afi.X.Q(), false);
                        this.a(\u2603, \u2603, 12, 6, i, 12, 9, i, afi.X.Q(), afi.X.Q(), false);
                    }
                }
            }
            for (int i = 3; i < 12; i += 2) {
                this.a(\u2603, \u2603, 3, 1, i, 4, 3, i, afi.X.Q(), afi.X.Q(), false);
                this.a(\u2603, \u2603, 6, 1, i, 7, 3, i, afi.X.Q(), afi.X.Q(), false);
                this.a(\u2603, \u2603, 9, 1, i, 10, 3, i, afi.X.Q(), afi.X.Q(), false);
            }
            if (this.b) {
                this.a(\u2603, \u2603, 1, 5, 1, 3, 5, 13, afi.f.Q(), afi.f.Q(), false);
                this.a(\u2603, \u2603, 10, 5, 1, 12, 5, 13, afi.f.Q(), afi.f.Q(), false);
                this.a(\u2603, \u2603, 4, 5, 1, 9, 5, 2, afi.f.Q(), afi.f.Q(), false);
                this.a(\u2603, \u2603, 4, 5, 12, 9, 5, 13, afi.f.Q(), afi.f.Q(), false);
                this.a(\u2603, afi.f.Q(), 9, 5, 11, \u2603);
                this.a(\u2603, afi.f.Q(), 8, 5, 11, \u2603);
                this.a(\u2603, afi.f.Q(), 9, 5, 10, \u2603);
                this.a(\u2603, \u2603, 3, 6, 2, 3, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
                this.a(\u2603, \u2603, 10, 6, 2, 10, 6, 10, afi.aO.Q(), afi.aO.Q(), false);
                this.a(\u2603, \u2603, 4, 6, 2, 9, 6, 2, afi.aO.Q(), afi.aO.Q(), false);
                this.a(\u2603, \u2603, 4, 6, 12, 8, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
                this.a(\u2603, afi.aO.Q(), 9, 6, 11, \u2603);
                this.a(\u2603, afi.aO.Q(), 8, 6, 11, \u2603);
                this.a(\u2603, afi.aO.Q(), 9, 6, 10, \u2603);
                final int i = this.a(afi.au, 3);
                this.a(\u2603, afi.au.a(i), 10, 1, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 2, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 3, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 4, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 5, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 6, 13, \u2603);
                this.a(\u2603, afi.au.a(i), 10, 7, 13, \u2603);
                final int \u26032 = 7;
                final int n4 = 7;
                this.a(\u2603, afi.aO.Q(), \u26032 - 1, 9, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032, 9, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 - 1, 8, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032, 8, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 - 1, 7, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032, 7, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 - 2, 7, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 + 1, 7, n4, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 - 1, 7, n4 - 1, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032 - 1, 7, n4 + 1, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032, 7, n4 - 1, \u2603);
                this.a(\u2603, afi.aO.Q(), \u26032, 7, n4 + 1, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032 - 2, 8, n4, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032 + 1, 8, n4, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032 - 1, 8, n4 - 1, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032 - 1, 8, n4 + 1, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032, 8, n4 - 1, \u2603);
                this.a(\u2603, afi.aa.Q(), \u26032, 8, n4 + 1, \u2603);
            }
            this.a(\u2603, \u2603, \u2603, 3, 3, 5, ob.a(e.a, zy.cd.a(\u2603, 1, 5, 2)), 1 + \u2603.nextInt(4));
            if (this.b) {
                this.a(\u2603, afi.a.Q(), 12, 9, 1, \u2603);
                this.a(\u2603, \u2603, \u2603, 12, 8, 1, ob.a(e.a, zy.cd.a(\u2603, 1, 5, 2)), 1 + \u2603.nextInt(4));
            }
            return true;
        }
        
        static {
            a = Lists.newArrayList(new ob(zy.aL, 0, 1, 3, 20), new ob(zy.aK, 0, 2, 7, 20), new ob(zy.bV, 0, 1, 1, 1), new ob(zy.aQ, 0, 1, 1, 1));
        }
    }
    
    public static class c extends p
    {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean e;
        
        public c() {
        }
        
        public c(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.d = this.a(\u2603);
            this.l = \u2603;
            this.a = \u2603.nextBoolean();
            this.b = \u2603.nextBoolean();
            this.c = \u2603.nextBoolean();
            this.e = (\u2603.nextInt(3) > 0);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("leftLow", this.a);
            \u2603.a("leftHigh", this.b);
            \u2603.a("rightLow", this.c);
            \u2603.a("rightHigh", this.e);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.n("leftLow");
            this.b = \u2603.n("leftHigh");
            this.c = \u2603.n("rightLow");
            this.e = \u2603.n("rightHigh");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            int n = 3;
            int n2 = 5;
            if (this.m == cq.e || this.m == cq.c) {
                n = 8 - n;
                n2 = 8 - n2;
            }
            this.a((m)\u2603, \u2603, \u2603, 5, 1);
            if (this.a) {
                this.b((m)\u2603, \u2603, \u2603, n, 1);
            }
            if (this.b) {
                this.b((m)\u2603, \u2603, \u2603, n2, 7);
            }
            if (this.c) {
                this.c((m)\u2603, \u2603, \u2603, n, 1);
            }
            if (this.e) {
                this.c((m)\u2603, \u2603, \u2603, n2, 7);
            }
        }
        
        public static c a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -4, -3, 0, 10, 9, 11, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new c(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 0, 0, 9, 8, 10, true, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, this.d, 4, 3, 0);
            if (this.a) {
                this.a(\u2603, \u2603, 0, 3, 1, 0, 5, 3, afi.a.Q(), afi.a.Q(), false);
            }
            if (this.c) {
                this.a(\u2603, \u2603, 9, 3, 1, 9, 5, 3, afi.a.Q(), afi.a.Q(), false);
            }
            if (this.b) {
                this.a(\u2603, \u2603, 0, 5, 7, 0, 7, 9, afi.a.Q(), afi.a.Q(), false);
            }
            if (this.e) {
                this.a(\u2603, \u2603, 9, 5, 7, 9, 7, 9, afi.a.Q(), afi.a.Q(), false);
            }
            this.a(\u2603, \u2603, 5, 1, 10, 7, 3, 10, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 2, 1, 8, 2, 6, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 5, 4, 4, 9, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 8, 1, 5, 8, 4, 9, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 1, 4, 7, 3, 4, 9, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 1, 3, 5, 3, 3, 6, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 1, 3, 4, 3, 3, 4, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 1, 4, 6, 3, 4, 6, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 5, 1, 7, 7, 1, 8, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 5, 1, 9, 7, 1, 9, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 5, 2, 7, 7, 2, 7, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 4, 5, 7, 4, 5, 9, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 8, 5, 7, 8, 5, 9, afi.U.Q(), afi.U.Q(), false);
            this.a(\u2603, \u2603, 5, 5, 7, 7, 5, 9, afi.T.Q(), afi.T.Q(), false);
            this.a(\u2603, afi.aa.Q(), 6, 5, 6, \u2603);
            return true;
        }
    }
    
    public static class g extends p
    {
        private boolean a;
        
        public g() {
        }
        
        public g(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Mob", this.a);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.a = \u2603.n("Mob");
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            if (\u2603 != null) {
                ((m)\u2603).b = this;
            }
        }
        
        public static g a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
            final aqe a = aqe.a(\u2603, \u2603, \u2603, -4, -1, 0, 11, 8, 16, \u2603);
            if (!p.a(a) || aqt.a(\u2603, a) != null) {
                return null;
            }
            return new g(\u2603, \u2603, a, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 0, 0, 10, 7, 15, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, \u2603, p.a.c, 4, 1, 0);
            int d = 6;
            this.a(\u2603, \u2603, 1, d, 1, 1, d, 14, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 9, d, 1, 9, d, 14, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 2, d, 1, 8, d, 2, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 2, d, 14, 8, d, 14, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 1, 1, 1, 2, 1, 4, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 8, 1, 1, 9, 1, 4, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 1, 1, 1, 1, 1, 3, afi.k.Q(), afi.k.Q(), false);
            this.a(\u2603, \u2603, 9, 1, 1, 9, 1, 3, afi.k.Q(), afi.k.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 8, 7, 1, 12, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 1, 9, 6, 1, 11, afi.k.Q(), afi.k.Q(), false);
            for (int i = 3; i < 14; i += 2) {
                this.a(\u2603, \u2603, 0, 3, i, 0, 4, i, afi.bi.Q(), afi.bi.Q(), false);
                this.a(\u2603, \u2603, 10, 3, i, 10, 4, i, afi.bi.Q(), afi.bi.Q(), false);
            }
            for (int i = 2; i < 9; i += 2) {
                this.a(\u2603, \u2603, i, 3, 15, i, 4, 15, afi.bi.Q(), afi.bi.Q(), false);
            }
            int i = this.a(afi.bv, 3);
            this.a(\u2603, \u2603, 4, 1, 5, 6, 1, 7, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 2, 6, 6, 2, 7, false, \u2603, aqp.e);
            this.a(\u2603, \u2603, 4, 3, 7, 6, 3, 7, false, \u2603, aqp.e);
            for (int j = 4; j <= 6; ++j) {
                this.a(\u2603, afi.bv.a(i), j, 1, 4, \u2603);
                this.a(\u2603, afi.bv.a(i), j, 2, 5, \u2603);
                this.a(\u2603, afi.bv.a(i), j, 3, 6, \u2603);
            }
            int j = cq.c.b();
            int \u26032 = cq.d.b();
            int \u26033 = cq.f.b();
            int \u26034 = cq.e.b();
            if (this.m != null) {
                switch (aqp$3.b[this.m.ordinal()]) {
                    case 2: {
                        j = cq.d.b();
                        \u26032 = cq.c.b();
                        break;
                    }
                    case 4: {
                        j = cq.f.b();
                        \u26032 = cq.e.b();
                        \u26033 = cq.d.b();
                        \u26034 = cq.c.b();
                        break;
                    }
                    case 3: {
                        j = cq.e.b();
                        \u26032 = cq.f.b();
                        \u26033 = cq.d.b();
                        \u26034 = cq.c.b();
                        break;
                    }
                }
            }
            this.a(\u2603, afi.bG.a(j).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 4, 3, 8, \u2603);
            this.a(\u2603, afi.bG.a(j).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 5, 3, 8, \u2603);
            this.a(\u2603, afi.bG.a(j).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 6, 3, 8, \u2603);
            this.a(\u2603, afi.bG.a(\u26032).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 4, 3, 12, \u2603);
            this.a(\u2603, afi.bG.a(\u26032).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 5, 3, 12, \u2603);
            this.a(\u2603, afi.bG.a(\u26032).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 6, 3, 12, \u2603);
            this.a(\u2603, afi.bG.a(\u26033).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 3, 3, 9, \u2603);
            this.a(\u2603, afi.bG.a(\u26033).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 3, 3, 10, \u2603);
            this.a(\u2603, afi.bG.a(\u26033).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 3, 3, 11, \u2603);
            this.a(\u2603, afi.bG.a(\u26034).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 7, 3, 9, \u2603);
            this.a(\u2603, afi.bG.a(\u26034).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 7, 3, 10, \u2603);
            this.a(\u2603, afi.bG.a(\u26034).a((amo<Comparable>)ago.b, \u2603.nextFloat() > 0.9f), 7, 3, 11, \u2603);
            if (!this.a) {
                d = this.d(3);
                final cj \u26035 = new cj(this.a(5, 6), d, this.b(5, 6));
                if (\u2603.b(\u26035)) {
                    this.a = true;
                    \u2603.a(\u26035, afi.ac.Q(), 2);
                    final akw s = \u2603.s(\u26035);
                    if (s instanceof all) {
                        ((all)s).b().a("Silverfish");
                    }
                }
            }
            return true;
        }
    }
    
    static class k extends aqt.a
    {
        private k() {
        }
        
        @Override
        public void a(final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (\u2603) {
                final float nextFloat = \u2603.nextFloat();
                if (nextFloat < 0.2f) {
                    this.a = afi.bf.a(ajz.O);
                }
                else if (nextFloat < 0.5f) {
                    this.a = afi.bf.a(ajz.N);
                }
                else if (nextFloat < 0.55f) {
                    this.a = afi.be.a(ahz.a.c.a());
                }
                else {
                    this.a = afi.bf.Q();
                }
            }
            else {
                this.a = afi.a.Q();
            }
        }
    }
}
