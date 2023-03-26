import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqg
{
    private static final List<ob> a;
    
    public static void a() {
        aqr.a(a.class, "MSCorridor");
        aqr.a(b.class, "MSCrossing");
        aqr.a(c.class, "MSRoom");
        aqr.a(d.class, "MSStairs");
    }
    
    private static aqt a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        final int nextInt = \u2603.nextInt(100);
        if (nextInt >= 80) {
            final aqe \u26032 = b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (\u26032 != null) {
                return new b(\u2603, \u2603, \u26032, \u2603);
            }
        }
        else if (nextInt >= 70) {
            final aqe \u26032 = d.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (\u26032 != null) {
                return new d(\u2603, \u2603, \u26032, \u2603);
            }
        }
        else {
            final aqe \u26032 = aqg.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (\u26032 != null) {
                return new a(\u2603, \u2603, \u26032, \u2603);
            }
        }
        return null;
    }
    
    private static aqt b(final aqt \u2603, final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603, final int \u2603) {
        if (\u2603 > 8) {
            return null;
        }
        if (Math.abs(\u2603 - \u2603.c().a) > 80 || Math.abs(\u2603 - \u2603.c().c) > 80) {
            return null;
        }
        final aqt a = a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603 + 1);
        if (a != null) {
            \u2603.add(a);
            a.a(\u2603, \u2603, \u2603);
        }
        return a;
    }
    
    static {
        a = Lists.newArrayList(new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.aW, zd.l.b(), 4, 9, 5), new ob(zy.i, 0, 1, 2, 3), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1), new ob(zw.a(afi.av), 0, 4, 8, 1), new ob(zy.bh, 0, 2, 4, 10), new ob(zy.bg, 0, 2, 4, 10), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1));
    }
    
    public static class c extends aqt
    {
        private List<aqe> a;
        
        public c() {
            this.a = (List<aqe>)Lists.newLinkedList();
        }
        
        public c(final int \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603);
            this.a = (List<aqe>)Lists.newLinkedList();
            this.l = new aqe(\u2603, 50, \u2603, \u2603 + 7 + \u2603.nextInt(6), 54 + \u2603.nextInt(6), \u2603 + 7 + \u2603.nextInt(6));
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            final int d = this.d();
            int n = this.l.d() - 3 - 1;
            if (n <= 0) {
                n = 1;
            }
            for (int i = 0; i < this.l.c(); i += 4) {
                i += \u2603.nextInt(this.l.c());
                if (i + 3 > this.l.c()) {
                    break;
                }
                final aqt aqt = b(\u2603, \u2603, \u2603, this.l.a + i, this.l.b + \u2603.nextInt(n) + 1, this.l.c - 1, cq.c, d);
                if (aqt != null) {
                    final aqe aqe = aqt.c();
                    this.a.add(new aqe(aqe.a, aqe.b, this.l.c, aqe.d, aqe.e, this.l.c + 1));
                }
            }
            for (int i = 0; i < this.l.c(); i += 4) {
                i += \u2603.nextInt(this.l.c());
                if (i + 3 > this.l.c()) {
                    break;
                }
                final aqt aqt = b(\u2603, \u2603, \u2603, this.l.a + i, this.l.b + \u2603.nextInt(n) + 1, this.l.f + 1, cq.d, d);
                if (aqt != null) {
                    final aqe aqe = aqt.c();
                    this.a.add(new aqe(aqe.a, aqe.b, this.l.f - 1, aqe.d, aqe.e, this.l.f));
                }
            }
            for (int i = 0; i < this.l.e(); i += 4) {
                i += \u2603.nextInt(this.l.e());
                if (i + 3 > this.l.e()) {
                    break;
                }
                final aqt aqt = b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + \u2603.nextInt(n) + 1, this.l.c + i, cq.e, d);
                if (aqt != null) {
                    final aqe aqe = aqt.c();
                    this.a.add(new aqe(this.l.a, aqe.b, aqe.c, this.l.a + 1, aqe.e, aqe.f));
                }
            }
            for (int i = 0; i < this.l.e(); i += 4) {
                i += \u2603.nextInt(this.l.e());
                if (i + 3 > this.l.e()) {
                    break;
                }
                final aqt aqt = b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + \u2603.nextInt(n) + 1, this.l.c + i, cq.f, d);
                if (aqt != null) {
                    final aqe aqe = aqt.c();
                    this.a.add(new aqe(this.l.d - 1, aqe.b, aqe.c, this.l.d, aqe.e, aqe.f));
                }
            }
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
            this.a(\u2603, \u2603, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
            for (final aqe aqe : this.a) {
                this.a(\u2603, \u2603, aqe.a, aqe.e - 2, aqe.c, aqe.d, aqe.e, aqe.f, afi.a.Q(), afi.a.Q(), false);
            }
            this.a(\u2603, \u2603, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
            return true;
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603) {
            super.a(\u2603, \u2603, \u2603);
            for (final aqe aqe : this.a) {
                aqe.a(\u2603, \u2603, \u2603);
            }
        }
        
        @Override
        protected void a(final dn \u2603) {
            final du \u26032 = new du();
            for (final aqe aqe : this.a) {
                \u26032.a(aqe.g());
            }
            \u2603.a("Entrances", \u26032);
        }
        
        @Override
        protected void b(final dn \u2603) {
            final du c = \u2603.c("Entrances", 11);
            for (int i = 0; i < c.c(); ++i) {
                this.a.add(new aqe(c.c(i)));
            }
        }
    }
    
    public static class a extends aqt
    {
        private boolean a;
        private boolean b;
        private boolean c;
        private int d;
        
        public a() {
        }
        
        @Override
        protected void a(final dn \u2603) {
            \u2603.a("hr", this.a);
            \u2603.a("sc", this.b);
            \u2603.a("hps", this.c);
            \u2603.a("Num", this.d);
        }
        
        @Override
        protected void b(final dn \u2603) {
            this.a = \u2603.n("hr");
            this.b = \u2603.n("sc");
            this.c = \u2603.n("hps");
            this.d = \u2603.f("Num");
        }
        
        public a(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
            this.a = (\u2603.nextInt(3) == 0);
            this.b = (!this.a && \u2603.nextInt(23) == 0);
            if (this.m == cq.c || this.m == cq.d) {
                this.d = \u2603.e() / 5;
            }
            else {
                this.d = \u2603.c() / 5;
            }
        }
        
        public static aqe a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe \u26032 = new aqe(\u2603, \u2603, \u2603, \u2603, \u2603 + 2, \u2603);
            int i;
            for (i = \u2603.nextInt(3) + 2; i > 0; --i) {
                final int n = i * 5;
                switch (aqg$1.a[\u2603.ordinal()]) {
                    case 1: {
                        \u26032.d = \u2603 + 2;
                        \u26032.c = \u2603 - (n - 1);
                        break;
                    }
                    case 2: {
                        \u26032.d = \u2603 + 2;
                        \u26032.f = \u2603 + (n - 1);
                        break;
                    }
                    case 3: {
                        \u26032.a = \u2603 - (n - 1);
                        \u26032.f = \u2603 + 2;
                        break;
                    }
                    case 4: {
                        \u26032.d = \u2603 + (n - 1);
                        \u26032.f = \u2603 + 2;
                        break;
                    }
                }
                if (aqt.a(\u2603, \u26032) == null) {
                    break;
                }
            }
            if (i > 0) {
                return \u26032;
            }
            return null;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            final int d = this.d();
            final int nextInt = \u2603.nextInt(4);
            if (this.m != null) {
                switch (aqg$1.a[this.m.ordinal()]) {
                    case 1: {
                        if (nextInt <= 1) {
                            b(\u2603, \u2603, \u2603, this.l.a, this.l.b - 1 + \u2603.nextInt(3), this.l.c - 1, this.m, d);
                            break;
                        }
                        if (nextInt == 2) {
                            b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b - 1 + \u2603.nextInt(3), this.l.c, cq.e, d);
                            break;
                        }
                        b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b - 1 + \u2603.nextInt(3), this.l.c, cq.f, d);
                        break;
                    }
                    case 2: {
                        if (nextInt <= 1) {
                            b(\u2603, \u2603, \u2603, this.l.a, this.l.b - 1 + \u2603.nextInt(3), this.l.f + 1, this.m, d);
                            break;
                        }
                        if (nextInt == 2) {
                            b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b - 1 + \u2603.nextInt(3), this.l.f - 3, cq.e, d);
                            break;
                        }
                        b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b - 1 + \u2603.nextInt(3), this.l.f - 3, cq.f, d);
                        break;
                    }
                    case 3: {
                        if (nextInt <= 1) {
                            b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b - 1 + \u2603.nextInt(3), this.l.c, this.m, d);
                            break;
                        }
                        if (nextInt == 2) {
                            b(\u2603, \u2603, \u2603, this.l.a, this.l.b - 1 + \u2603.nextInt(3), this.l.c - 1, cq.c, d);
                            break;
                        }
                        b(\u2603, \u2603, \u2603, this.l.a, this.l.b - 1 + \u2603.nextInt(3), this.l.f + 1, cq.d, d);
                        break;
                    }
                    case 4: {
                        if (nextInt <= 1) {
                            b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b - 1 + \u2603.nextInt(3), this.l.c, this.m, d);
                            break;
                        }
                        if (nextInt == 2) {
                            b(\u2603, \u2603, \u2603, this.l.d - 3, this.l.b - 1 + \u2603.nextInt(3), this.l.c - 1, cq.c, d);
                            break;
                        }
                        b(\u2603, \u2603, \u2603, this.l.d - 3, this.l.b - 1 + \u2603.nextInt(3), this.l.f + 1, cq.d, d);
                        break;
                    }
                }
            }
            if (d < 8) {
                if (this.m == cq.c || this.m == cq.d) {
                    for (int n = this.l.c + 3; n + 3 <= this.l.f; n += 5) {
                        final int n2 = \u2603.nextInt(5);
                        if (n2 == 0) {
                            b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, n, cq.e, d + 1);
                        }
                        else if (n2 == 1) {
                            b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, n, cq.f, d + 1);
                        }
                    }
                }
                else {
                    for (int n = this.l.a + 3; n + 3 <= this.l.d; n += 5) {
                        final int n2 = \u2603.nextInt(5);
                        if (n2 == 0) {
                            b(\u2603, \u2603, \u2603, n, this.l.b, this.l.c - 1, cq.c, d + 1);
                        }
                        else if (n2 == 1) {
                            b(\u2603, \u2603, \u2603, n, this.l.b, this.l.f + 1, cq.d, d + 1);
                        }
                    }
                }
            }
        }
        
        @Override
        protected boolean a(final adm \u2603, final aqe \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final List<ob> \u2603, final int \u2603) {
            final cj \u26032 = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
            if (\u2603.b(\u26032) && \u2603.p(\u26032).c().t() == arm.a) {
                final int nextBoolean = \u2603.nextBoolean() ? 1 : 0;
                \u2603.a(\u26032, afi.av.a(this.a(afi.av, nextBoolean)), 2);
                final vb vb = new vb(\u2603, \u26032.n() + 0.5f, \u26032.o() + 0.5f, \u26032.p() + 0.5f);
                ob.a(\u2603, \u2603, vb, \u2603);
                \u2603.d(vb);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            final int n = 0;
            final int n2 = 2;
            final int n3 = 0;
            final int n4 = 2;
            final int \u26032 = this.d * 5 - 1;
            this.a(\u2603, \u2603, 0, 0, 0, 2, 1, \u26032, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, \u2603, 0.8f, 0, 2, 0, 2, 2, \u26032, afi.a.Q(), afi.a.Q(), false);
            if (this.b) {
                this.a(\u2603, \u2603, \u2603, 0.6f, 0, 0, 0, 2, 1, \u26032, afi.G.Q(), afi.a.Q(), false);
            }
            for (int i = 0; i < this.d; ++i) {
                final int j = 2 + i * 5;
                this.a(\u2603, \u2603, 0, 0, j, 0, 1, j, afi.aO.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, 2, 0, j, 2, 1, j, afi.aO.Q(), afi.a.Q(), false);
                if (\u2603.nextInt(4) == 0) {
                    this.a(\u2603, \u2603, 0, 2, j, 0, 2, j, afi.f.Q(), afi.a.Q(), false);
                    this.a(\u2603, \u2603, 2, 2, j, 2, 2, j, afi.f.Q(), afi.a.Q(), false);
                }
                else {
                    this.a(\u2603, \u2603, 0, 2, j, 2, 2, j, afi.f.Q(), afi.a.Q(), false);
                }
                this.a(\u2603, \u2603, \u2603, 0.1f, 0, 2, j - 1, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.1f, 2, 2, j - 1, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.1f, 0, 2, j + 1, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.1f, 2, 2, j + 1, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.05f, 0, 2, j - 2, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.05f, 2, 2, j - 2, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.05f, 0, 2, j + 2, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.05f, 2, 2, j + 2, afi.G.Q());
                this.a(\u2603, \u2603, \u2603, 0.05f, 1, 2, j - 1, afi.aa.a(cq.b.a()));
                this.a(\u2603, \u2603, \u2603, 0.05f, 1, 2, j + 1, afi.aa.a(cq.b.a()));
                if (\u2603.nextInt(100) == 0) {
                    this.a(\u2603, \u2603, \u2603, 2, 0, j - 1, ob.a(aqg.a, zy.cd.b(\u2603)), 3 + \u2603.nextInt(4));
                }
                if (\u2603.nextInt(100) == 0) {
                    this.a(\u2603, \u2603, \u2603, 0, 0, j + 1, ob.a(aqg.a, zy.cd.b(\u2603)), 3 + \u2603.nextInt(4));
                }
                if (this.b && !this.c) {
                    final int d = this.d(0);
                    int b = j - 1 + \u2603.nextInt(3);
                    final int a = this.a(1, b);
                    b = this.b(1, b);
                    final cj \u26033 = new cj(a, d, b);
                    if (\u2603.b(\u26033)) {
                        this.c = true;
                        \u2603.a(\u26033, afi.ac.Q(), 2);
                        final akw s = \u2603.s(\u26033);
                        if (s instanceof all) {
                            ((all)s).b().a("CaveSpider");
                        }
                    }
                }
            }
            for (int i = 0; i <= 2; ++i) {
                for (int j = 0; j <= \u26032; ++j) {
                    final int d = -1;
                    final alz a2 = this.a(\u2603, i, d, j, \u2603);
                    if (a2.c().t() == arm.a) {
                        final int a = -1;
                        this.a(\u2603, afi.f.Q(), i, a, j, \u2603);
                    }
                }
            }
            if (this.a) {
                for (int i = 0; i <= \u26032; ++i) {
                    final alz a3 = this.a(\u2603, 1, -1, i, \u2603);
                    if (a3.c().t() != arm.a && a3.c().o()) {
                        this.a(\u2603, \u2603, \u2603, 0.7f, 1, 0, i, afi.av.a(this.a(afi.av, 0)));
                    }
                }
            }
            return true;
        }
    }
    
    public static class b extends aqt
    {
        private cq a;
        private boolean b;
        
        public b() {
        }
        
        @Override
        protected void a(final dn \u2603) {
            \u2603.a("tf", this.b);
            \u2603.a("D", this.a.b());
        }
        
        @Override
        protected void b(final dn \u2603) {
            this.b = \u2603.n("tf");
            this.a = cq.b(\u2603.f("D"));
        }
        
        public b(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.a = \u2603;
            this.l = \u2603;
            this.b = (\u2603.d() > 3);
        }
        
        public static aqe a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe \u26032 = new aqe(\u2603, \u2603, \u2603, \u2603, \u2603 + 2, \u2603);
            if (\u2603.nextInt(4) == 0) {
                final aqe aqe = \u26032;
                aqe.e += 4;
            }
            switch (aqg$1.a[\u2603.ordinal()]) {
                case 1: {
                    \u26032.a = \u2603 - 1;
                    \u26032.d = \u2603 + 3;
                    \u26032.c = \u2603 - 4;
                    break;
                }
                case 2: {
                    \u26032.a = \u2603 - 1;
                    \u26032.d = \u2603 + 3;
                    \u26032.f = \u2603 + 4;
                    break;
                }
                case 3: {
                    \u26032.a = \u2603 - 4;
                    \u26032.c = \u2603 - 1;
                    \u26032.f = \u2603 + 3;
                    break;
                }
                case 4: {
                    \u26032.d = \u2603 + 4;
                    \u26032.c = \u2603 - 1;
                    \u26032.f = \u2603 + 3;
                    break;
                }
            }
            if (aqt.a(\u2603, \u26032) != null) {
                return null;
            }
            return \u26032;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            final int d = this.d();
            switch (aqg$1.a[this.a.ordinal()]) {
                case 1: {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, d);
                    b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, d);
                    b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, d);
                    break;
                }
                case 2: {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, d);
                    b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, d);
                    b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, d);
                    break;
                }
                case 3: {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, d);
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, d);
                    b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, d);
                    break;
                }
                case 4: {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, d);
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, d);
                    b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, d);
                    break;
                }
            }
            if (this.b) {
                if (\u2603.nextBoolean()) {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cq.c, d);
                }
                if (\u2603.nextBoolean()) {
                    b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cq.e, d);
                }
                if (\u2603.nextBoolean()) {
                    b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cq.f, d);
                }
                if (\u2603.nextBoolean()) {
                    b(\u2603, \u2603, \u2603, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cq.d, d);
                }
            }
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            if (this.b) {
                this.a(\u2603, \u2603, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, afi.a.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
            }
            else {
                this.a(\u2603, \u2603, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
                this.a(\u2603, \u2603, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
            }
            this.a(\u2603, \u2603, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
            for (int i = this.l.a; i <= this.l.d; ++i) {
                for (int j = this.l.c; j <= this.l.f; ++j) {
                    if (this.a(\u2603, i, this.l.b - 1, j, \u2603).c().t() == arm.a) {
                        this.a(\u2603, afi.f.Q(), i, this.l.b - 1, j, \u2603);
                    }
                }
            }
            return true;
        }
    }
    
    public static class d extends aqt
    {
        public d() {
        }
        
        public d(final int \u2603, final Random \u2603, final aqe \u2603, final cq \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        @Override
        protected void a(final dn \u2603) {
        }
        
        @Override
        protected void b(final dn \u2603) {
        }
        
        public static aqe a(final List<aqt> \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            final aqe \u26032 = new aqe(\u2603, \u2603 - 5, \u2603, \u2603, \u2603 + 2, \u2603);
            switch (aqg$1.a[\u2603.ordinal()]) {
                case 1: {
                    \u26032.d = \u2603 + 2;
                    \u26032.c = \u2603 - 8;
                    break;
                }
                case 2: {
                    \u26032.d = \u2603 + 2;
                    \u26032.f = \u2603 + 8;
                    break;
                }
                case 3: {
                    \u26032.a = \u2603 - 8;
                    \u26032.f = \u2603 + 2;
                    break;
                }
                case 4: {
                    \u26032.d = \u2603 + 8;
                    \u26032.f = \u2603 + 2;
                    break;
                }
            }
            if (aqt.a(\u2603, \u26032) != null) {
                return null;
            }
            return \u26032;
        }
        
        @Override
        public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
            final int d = this.d();
            if (this.m != null) {
                switch (aqg$1.a[this.m.ordinal()]) {
                    case 1: {
                        b(\u2603, \u2603, \u2603, this.l.a, this.l.b, this.l.c - 1, cq.c, d);
                        break;
                    }
                    case 2: {
                        b(\u2603, \u2603, \u2603, this.l.a, this.l.b, this.l.f + 1, cq.d, d);
                        break;
                    }
                    case 3: {
                        b(\u2603, \u2603, \u2603, this.l.a - 1, this.l.b, this.l.c, cq.e, d);
                        break;
                    }
                    case 4: {
                        b(\u2603, \u2603, \u2603, this.l.d + 1, this.l.b, this.l.c, cq.f, d);
                        break;
                    }
                }
            }
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, \u2603)) {
                return false;
            }
            this.a(\u2603, \u2603, 0, 5, 0, 2, 7, 1, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 0, 0, 7, 2, 2, 8, afi.a.Q(), afi.a.Q(), false);
            for (int i = 0; i < 5; ++i) {
                this.a(\u2603, \u2603, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, afi.a.Q(), afi.a.Q(), false);
            }
            return true;
        }
    }
}
