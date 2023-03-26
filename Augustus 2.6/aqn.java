import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqn
{
    public static void a() {
        aqr.a(a.class, "TeDP");
        aqr.a(b.class, "TeJP");
        aqr.a(d.class, "TeSH");
    }
    
    abstract static class c extends aqt
    {
        protected int a;
        protected int b;
        protected int c;
        protected int d;
        
        public c() {
            this.d = -1;
        }
        
        protected c(final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(0);
            this.d = -1;
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.m = cq.c.a.a(\u2603);
            switch (aqn$1.a[this.m.ordinal()]) {
                case 1:
                case 2: {
                    this.l = new aqe(\u2603, \u2603, \u2603, \u2603 + \u2603 - 1, \u2603 + \u2603 - 1, \u2603 + \u2603 - 1);
                    break;
                }
                default: {
                    this.l = new aqe(\u2603, \u2603, \u2603, \u2603 + \u2603 - 1, \u2603 + \u2603 - 1, \u2603 + \u2603 - 1);
                    break;
                }
            }
        }
        
        @Override
        protected void a(final dn \u2603) {
            \u2603.a("Width", this.a);
            \u2603.a("Height", this.b);
            \u2603.a("Depth", this.c);
            \u2603.a("HPos", this.d);
        }
        
        @Override
        protected void b(final dn \u2603) {
            this.a = \u2603.f("Width");
            this.b = \u2603.f("Height");
            this.c = \u2603.f("Depth");
            this.d = \u2603.f("HPos");
        }
        
        protected boolean a(final adm \u2603, final aqe \u2603, final int \u2603) {
            if (this.d >= 0) {
                return true;
            }
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
                return false;
            }
            this.d = n / n2;
            this.l.a(0, this.d - this.l.b + \u2603, 0);
            return true;
        }
    }
    
    public static class a extends c
    {
        private boolean[] e;
        private static final List<ob> f;
        
        public a() {
            this.e = new boolean[4];
        }
        
        public a(final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, 64, \u2603, 21, 15, 21);
            this.e = new boolean[4];
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("hasPlacedChest0", this.e[0]);
            \u2603.a("hasPlacedChest1", this.e[1]);
            \u2603.a("hasPlacedChest2", this.e[2]);
            \u2603.a("hasPlacedChest3", this.e[3]);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.e[0] = \u2603.n("hasPlacedChest0");
            this.e[1] = \u2603.n("hasPlacedChest1");
            this.e[2] = \u2603.n("hasPlacedChest2");
            this.e[3] = \u2603.n("hasPlacedChest3");
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, -4, 0, this.a - 1, 0, this.c - 1, afi.A.Q(), afi.A.Q(), false);
            for (int i = 1; i <= 9; ++i) {
                this.a(\u2603, \u2603, i, i, i, this.a - 1 - i, i, this.c - 1 - i, afi.A.Q(), afi.A.Q(), false);
                this.a(\u2603, \u2603, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, afi.a.Q(), afi.a.Q(), false);
            }
            for (int i = 0; i < this.a; ++i) {
                for (int j = 0; j < this.c; ++j) {
                    final int a = -5;
                    this.b(\u2603, afi.A.Q(), i, a, j, \u2603);
                }
            }
            int i = this.a(afi.bO, 3);
            int j = this.a(afi.bO, 2);
            final int a = this.a(afi.bO, 0);
            final int a2 = this.a(afi.bO, 1);
            final int n = ~zd.b.b() & 0xF;
            final int \u26032 = ~zd.l.b() & 0xF;
            this.a(\u2603, \u2603, 0, 0, 0, 4, 9, 4, afi.A.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 1, 10, 1, 3, 10, 3, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, afi.bO.a(i), 2, 10, 0, \u2603);
            this.a(\u2603, afi.bO.a(j), 2, 10, 4, \u2603);
            this.a(\u2603, afi.bO.a(a), 0, 10, 2, \u2603);
            this.a(\u2603, afi.bO.a(a2), 4, 10, 2, \u2603);
            this.a(\u2603, \u2603, this.a - 5, 0, 0, this.a - 1, 9, 4, afi.A.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.a - 4, 10, 1, this.a - 2, 10, 3, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, afi.bO.a(i), this.a - 3, 10, 0, \u2603);
            this.a(\u2603, afi.bO.a(j), this.a - 3, 10, 4, \u2603);
            this.a(\u2603, afi.bO.a(a), this.a - 5, 10, 2, \u2603);
            this.a(\u2603, afi.bO.a(a2), this.a - 1, 10, 2, \u2603);
            this.a(\u2603, \u2603, 8, 0, 0, 12, 4, 4, afi.A.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 9, 1, 0, 11, 3, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 9, 1, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 9, 2, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 9, 3, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 10, 3, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 11, 3, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 11, 2, 1, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 11, 1, 1, \u2603);
            this.a(\u2603, \u2603, 4, 1, 1, 8, 3, 3, afi.A.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 4, 1, 2, 8, 2, 2, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 12, 1, 1, 16, 3, 3, afi.A.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 12, 1, 2, 16, 2, 2, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 5, 4, 5, this.a - 6, 4, this.c - 6, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, 9, 4, 9, 11, 4, 11, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, 8, 1, 8, 8, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 12, 1, 8, 12, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 8, 1, 12, 8, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 12, 1, 12, 12, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 1, 1, 5, 4, 4, 11, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, this.a - 5, 1, 5, this.a - 2, 4, 11, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, 6, 7, 9, 6, 7, 11, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, this.a - 7, 7, 9, this.a - 7, 7, 11, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, 5, 5, 9, 5, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, this.a - 6, 5, 9, this.a - 6, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, afi.a.Q(), 5, 5, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 5, 6, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 6, 6, 10, \u2603);
            this.a(\u2603, afi.a.Q(), this.a - 6, 5, 10, \u2603);
            this.a(\u2603, afi.a.Q(), this.a - 6, 6, 10, \u2603);
            this.a(\u2603, afi.a.Q(), this.a - 7, 6, 10, \u2603);
            this.a(\u2603, \u2603, 2, 4, 4, 2, 6, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.a - 3, 4, 4, this.a - 3, 6, 4, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.bO.a(i), 2, 4, 5, \u2603);
            this.a(\u2603, afi.bO.a(i), 2, 3, 4, \u2603);
            this.a(\u2603, afi.bO.a(i), this.a - 3, 4, 5, \u2603);
            this.a(\u2603, afi.bO.a(i), this.a - 3, 3, 4, \u2603);
            this.a(\u2603, \u2603, 1, 1, 3, 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, this.a - 3, 1, 3, this.a - 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, afi.bO.Q(), 1, 1, 2, \u2603);
            this.a(\u2603, afi.bO.Q(), this.a - 2, 1, 2, \u2603);
            this.a(\u2603, afi.U.a(akb.a.b.a()), 1, 2, 2, \u2603);
            this.a(\u2603, afi.U.a(akb.a.b.a()), this.a - 2, 2, 2, \u2603);
            this.a(\u2603, afi.bO.a(a2), 2, 1, 2, \u2603);
            this.a(\u2603, afi.bO.a(a), this.a - 3, 1, 2, \u2603);
            this.a(\u2603, \u2603, 4, 3, 5, 4, 3, 18, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, this.a - 5, 3, 5, this.a - 5, 3, 17, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, 3, 1, 5, 4, 2, 16, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, \u2603, this.a - 6, 1, 5, this.a - 5, 2, 16, afi.a.Q(), afi.a.Q(), false);
            for (int k = 5; k <= 17; k += 2) {
                this.a(\u2603, afi.A.a(aji.a.c.a()), 4, 1, k, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), 4, 2, k, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), this.a - 5, 1, k, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), this.a - 5, 2, k, \u2603);
            }
            this.a(\u2603, afi.cu.a(n), 10, 0, 7, \u2603);
            this.a(\u2603, afi.cu.a(n), 10, 0, 8, \u2603);
            this.a(\u2603, afi.cu.a(n), 9, 0, 9, \u2603);
            this.a(\u2603, afi.cu.a(n), 11, 0, 9, \u2603);
            this.a(\u2603, afi.cu.a(n), 8, 0, 10, \u2603);
            this.a(\u2603, afi.cu.a(n), 12, 0, 10, \u2603);
            this.a(\u2603, afi.cu.a(n), 7, 0, 10, \u2603);
            this.a(\u2603, afi.cu.a(n), 13, 0, 10, \u2603);
            this.a(\u2603, afi.cu.a(n), 9, 0, 11, \u2603);
            this.a(\u2603, afi.cu.a(n), 11, 0, 11, \u2603);
            this.a(\u2603, afi.cu.a(n), 10, 0, 12, \u2603);
            this.a(\u2603, afi.cu.a(n), 10, 0, 13, \u2603);
            this.a(\u2603, afi.cu.a(\u26032), 10, 0, 10, \u2603);
            for (int k = 0; k <= this.a - 1; k += this.a - 1) {
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 2, 1, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 2, 2, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 2, 3, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 3, 1, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 3, 2, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 3, 3, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 4, 1, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), k, 4, 2, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 4, 3, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 5, 1, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 5, 2, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 5, 3, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 6, 1, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), k, 6, 2, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 6, 3, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 7, 1, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 7, 2, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 7, 3, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 8, 1, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 8, 2, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 8, 3, \u2603);
            }
            for (int k = 2; k <= this.a - 3; k += this.a - 3 - 2) {
                this.a(\u2603, afi.A.a(aji.a.c.a()), k - 1, 2, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 2, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k + 1, 2, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k - 1, 3, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 3, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k + 1, 3, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k - 1, 4, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), k, 4, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k + 1, 4, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k - 1, 5, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 5, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k + 1, 5, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k - 1, 6, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.b.a()), k, 6, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k + 1, 6, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k - 1, 7, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k, 7, 0, \u2603);
                this.a(\u2603, afi.cu.a(n), k + 1, 7, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k - 1, 8, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k, 8, 0, \u2603);
                this.a(\u2603, afi.A.a(aji.a.c.a()), k + 1, 8, 0, \u2603);
            }
            this.a(\u2603, \u2603, 8, 4, 0, 12, 6, 0, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, afi.a.Q(), 8, 6, 0, \u2603);
            this.a(\u2603, afi.a.Q(), 12, 6, 0, \u2603);
            this.a(\u2603, afi.cu.a(n), 9, 5, 0, \u2603);
            this.a(\u2603, afi.A.a(aji.a.b.a()), 10, 5, 0, \u2603);
            this.a(\u2603, afi.cu.a(n), 11, 5, 0, \u2603);
            this.a(\u2603, \u2603, 8, -14, 8, 12, -11, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 8, -10, 8, 12, -10, 12, afi.A.a(aji.a.b.a()), afi.A.a(aji.a.b.a()), false);
            this.a(\u2603, \u2603, 8, -9, 8, 12, -9, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
            this.a(\u2603, \u2603, 8, -8, 8, 12, -1, 12, afi.A.Q(), afi.A.Q(), false);
            this.a(\u2603, \u2603, 9, -11, 9, 11, -1, 11, afi.a.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.az.Q(), 10, -11, 10, \u2603);
            this.a(\u2603, \u2603, 9, -13, 9, 11, -13, 11, afi.W.Q(), afi.a.Q(), false);
            this.a(\u2603, afi.a.Q(), 8, -11, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 8, -10, 10, \u2603);
            this.a(\u2603, afi.A.a(aji.a.b.a()), 7, -10, 10, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 7, -11, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 12, -11, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 12, -10, 10, \u2603);
            this.a(\u2603, afi.A.a(aji.a.b.a()), 13, -10, 10, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 13, -11, 10, \u2603);
            this.a(\u2603, afi.a.Q(), 10, -11, 8, \u2603);
            this.a(\u2603, afi.a.Q(), 10, -10, 8, \u2603);
            this.a(\u2603, afi.A.a(aji.a.b.a()), 10, -10, 7, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 10, -11, 7, \u2603);
            this.a(\u2603, afi.a.Q(), 10, -11, 12, \u2603);
            this.a(\u2603, afi.a.Q(), 10, -10, 12, \u2603);
            this.a(\u2603, afi.A.a(aji.a.b.a()), 10, -10, 13, \u2603);
            this.a(\u2603, afi.A.a(aji.a.c.a()), 10, -11, 13, \u2603);
            for (final cq cq : cq.c.a) {
                if (!this.e[cq.b()]) {
                    final int n2 = cq.g() * 2;
                    final int n3 = cq.i() * 2;
                    this.e[cq.b()] = this.a(\u2603, \u2603, \u2603, 10 + n2, -11, 10 + n3, ob.a(aqn.a.f, zy.cd.b(\u2603)), 2 + \u2603.nextInt(5));
                }
            }
            return true;
        }
        
        static {
            f = Lists.newArrayList(new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1));
        }
    }
    
    public static class b extends c
    {
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private static final List<ob> i;
        private static final List<ob> j;
        private static a k;
        
        public b() {
        }
        
        public b(final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, 64, \u2603, 12, 10, 15);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("placedMainChest", this.e);
            \u2603.a("placedHiddenChest", this.f);
            \u2603.a("placedTrap1", this.g);
            \u2603.a("placedTrap2", this.h);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.e = \u2603.n("placedMainChest");
            this.f = \u2603.n("placedHiddenChest");
            this.g = \u2603.n("placedTrap1");
            this.h = \u2603.n("placedTrap2");
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (!this.a(\u2603, \u2603, 0)) {
                return false;
            }
            final int a = this.a(afi.aw, 3);
            final int a2 = this.a(afi.aw, 2);
            final int a3 = this.a(afi.aw, 0);
            final int a4 = this.a(afi.aw, 1);
            this.a(\u2603, \u2603, 0, -4, 0, this.a - 1, 0, this.c - 1, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 1, 2, 9, 2, 2, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 1, 12, 9, 2, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 1, 3, 2, 2, 11, false, \u2603, b.k);
            this.a(\u2603, \u2603, 9, 1, 3, 9, 2, 11, false, \u2603, b.k);
            this.a(\u2603, \u2603, 1, 3, 1, 10, 6, 1, false, \u2603, b.k);
            this.a(\u2603, \u2603, 1, 3, 13, 10, 6, 13, false, \u2603, b.k);
            this.a(\u2603, \u2603, 1, 3, 2, 1, 6, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 10, 3, 2, 10, 6, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 3, 2, 9, 3, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 6, 2, 9, 6, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 3, 7, 3, 8, 7, 11, false, \u2603, b.k);
            this.a(\u2603, \u2603, 4, 8, 4, 7, 8, 10, false, \u2603, b.k);
            this.a(\u2603, \u2603, 3, 1, 3, 8, 2, 11);
            this.a(\u2603, \u2603, 4, 3, 6, 7, 3, 9);
            this.a(\u2603, \u2603, 2, 4, 2, 9, 5, 12);
            this.a(\u2603, \u2603, 4, 6, 5, 7, 6, 9);
            this.a(\u2603, \u2603, 5, 7, 6, 6, 7, 8);
            this.a(\u2603, \u2603, 5, 1, 2, 6, 2, 2);
            this.a(\u2603, \u2603, 5, 2, 12, 6, 2, 12);
            this.a(\u2603, \u2603, 5, 5, 1, 6, 5, 1);
            this.a(\u2603, \u2603, 5, 5, 13, 6, 5, 13);
            this.a(\u2603, afi.a.Q(), 1, 5, 5, \u2603);
            this.a(\u2603, afi.a.Q(), 10, 5, 5, \u2603);
            this.a(\u2603, afi.a.Q(), 1, 5, 9, \u2603);
            this.a(\u2603, afi.a.Q(), 10, 5, 9, \u2603);
            for (int i = 0; i <= 14; i += 14) {
                this.a(\u2603, \u2603, 2, 4, i, 2, 5, i, false, \u2603, b.k);
                this.a(\u2603, \u2603, 4, 4, i, 4, 5, i, false, \u2603, b.k);
                this.a(\u2603, \u2603, 7, 4, i, 7, 5, i, false, \u2603, b.k);
                this.a(\u2603, \u2603, 9, 4, i, 9, 5, i, false, \u2603, b.k);
            }
            this.a(\u2603, \u2603, 5, 6, 0, 6, 6, 0, false, \u2603, b.k);
            for (int i = 0; i <= 11; i += 11) {
                for (int j = 2; j <= 12; j += 2) {
                    this.a(\u2603, \u2603, i, 4, j, i, 5, j, false, \u2603, b.k);
                }
                this.a(\u2603, \u2603, i, 6, 5, i, 6, 5, false, \u2603, b.k);
                this.a(\u2603, \u2603, i, 6, 9, i, 6, 9, false, \u2603, b.k);
            }
            this.a(\u2603, \u2603, 2, 7, 2, 2, 9, 2, false, \u2603, b.k);
            this.a(\u2603, \u2603, 9, 7, 2, 9, 9, 2, false, \u2603, b.k);
            this.a(\u2603, \u2603, 2, 7, 12, 2, 9, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 9, 7, 12, 9, 9, 12, false, \u2603, b.k);
            this.a(\u2603, \u2603, 4, 9, 4, 4, 9, 4, false, \u2603, b.k);
            this.a(\u2603, \u2603, 7, 9, 4, 7, 9, 4, false, \u2603, b.k);
            this.a(\u2603, \u2603, 4, 9, 10, 4, 9, 10, false, \u2603, b.k);
            this.a(\u2603, \u2603, 7, 9, 10, 7, 9, 10, false, \u2603, b.k);
            this.a(\u2603, \u2603, 5, 9, 7, 6, 9, 7, false, \u2603, b.k);
            this.a(\u2603, afi.aw.a(a), 5, 9, 6, \u2603);
            this.a(\u2603, afi.aw.a(a), 6, 9, 6, \u2603);
            this.a(\u2603, afi.aw.a(a2), 5, 9, 8, \u2603);
            this.a(\u2603, afi.aw.a(a2), 6, 9, 8, \u2603);
            this.a(\u2603, afi.aw.a(a), 4, 0, 0, \u2603);
            this.a(\u2603, afi.aw.a(a), 5, 0, 0, \u2603);
            this.a(\u2603, afi.aw.a(a), 6, 0, 0, \u2603);
            this.a(\u2603, afi.aw.a(a), 7, 0, 0, \u2603);
            this.a(\u2603, afi.aw.a(a), 4, 1, 8, \u2603);
            this.a(\u2603, afi.aw.a(a), 4, 2, 9, \u2603);
            this.a(\u2603, afi.aw.a(a), 4, 3, 10, \u2603);
            this.a(\u2603, afi.aw.a(a), 7, 1, 8, \u2603);
            this.a(\u2603, afi.aw.a(a), 7, 2, 9, \u2603);
            this.a(\u2603, afi.aw.a(a), 7, 3, 10, \u2603);
            this.a(\u2603, \u2603, 4, 1, 9, 4, 1, 9, false, \u2603, b.k);
            this.a(\u2603, \u2603, 7, 1, 9, 7, 1, 9, false, \u2603, b.k);
            this.a(\u2603, \u2603, 4, 1, 10, 7, 2, 10, false, \u2603, b.k);
            this.a(\u2603, \u2603, 5, 4, 5, 6, 4, 5, false, \u2603, b.k);
            this.a(\u2603, afi.aw.a(a3), 4, 4, 5, \u2603);
            this.a(\u2603, afi.aw.a(a4), 7, 4, 5, \u2603);
            for (int i = 0; i < 4; ++i) {
                this.a(\u2603, afi.aw.a(a2), 5, 0 - i, 6 + i, \u2603);
                this.a(\u2603, afi.aw.a(a2), 6, 0 - i, 6 + i, \u2603);
                this.a(\u2603, \u2603, 5, 0 - i, 7 + i, 6, 0 - i, 9 + i);
            }
            this.a(\u2603, \u2603, 1, -3, 12, 10, -1, 13);
            this.a(\u2603, \u2603, 1, -3, 1, 3, -1, 13);
            this.a(\u2603, \u2603, 1, -3, 1, 9, -1, 5);
            for (int i = 1; i <= 13; i += 2) {
                this.a(\u2603, \u2603, 1, -3, i, 1, -2, i, false, \u2603, b.k);
            }
            for (int i = 2; i <= 12; i += 2) {
                this.a(\u2603, \u2603, 1, -1, i, 3, -1, i, false, \u2603, b.k);
            }
            this.a(\u2603, \u2603, 2, -2, 1, 5, -2, 1, false, \u2603, b.k);
            this.a(\u2603, \u2603, 7, -2, 1, 9, -2, 1, false, \u2603, b.k);
            this.a(\u2603, \u2603, 6, -3, 1, 6, -3, 1, false, \u2603, b.k);
            this.a(\u2603, \u2603, 6, -1, 1, 6, -1, 1, false, \u2603, b.k);
            this.a(\u2603, afi.bR.a(this.a(afi.bR, cq.f.b())).a((amo<Comparable>)akj.N, true), 1, -3, 8, \u2603);
            this.a(\u2603, afi.bR.a(this.a(afi.bR, cq.e.b())).a((amo<Comparable>)akj.N, true), 4, -3, 8, \u2603);
            this.a(\u2603, afi.bS.Q().a((amo<Comparable>)aki.N, true), 2, -3, 8, \u2603);
            this.a(\u2603, afi.bS.Q().a((amo<Comparable>)aki.N, true), 3, -3, 8, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 7, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 6, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 5, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 4, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 3, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 2, \u2603);
            this.a(\u2603, afi.af.Q(), 5, -3, 1, \u2603);
            this.a(\u2603, afi.af.Q(), 4, -3, 1, \u2603);
            this.a(\u2603, afi.Y.Q(), 3, -3, 1, \u2603);
            if (!this.g) {
                this.g = this.a(\u2603, \u2603, \u2603, 3, -2, 1, cq.c.a(), b.j, 2);
            }
            this.a(\u2603, afi.bn.a(15), 3, -2, 2, \u2603);
            this.a(\u2603, afi.bR.a(this.a(afi.bR, cq.c.b())).a((amo<Comparable>)akj.N, true), 7, -3, 1, \u2603);
            this.a(\u2603, afi.bR.a(this.a(afi.bR, cq.d.b())).a((amo<Comparable>)akj.N, true), 7, -3, 5, \u2603);
            this.a(\u2603, afi.bS.Q().a((amo<Comparable>)aki.N, true), 7, -3, 2, \u2603);
            this.a(\u2603, afi.bS.Q().a((amo<Comparable>)aki.N, true), 7, -3, 3, \u2603);
            this.a(\u2603, afi.bS.Q().a((amo<Comparable>)aki.N, true), 7, -3, 4, \u2603);
            this.a(\u2603, afi.af.Q(), 8, -3, 6, \u2603);
            this.a(\u2603, afi.af.Q(), 9, -3, 6, \u2603);
            this.a(\u2603, afi.af.Q(), 9, -3, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 9, -3, 4, \u2603);
            this.a(\u2603, afi.af.Q(), 9, -2, 4, \u2603);
            if (!this.h) {
                this.h = this.a(\u2603, \u2603, \u2603, 9, -2, 3, cq.e.a(), b.j, 2);
            }
            this.a(\u2603, afi.bn.a(15), 8, -1, 3, \u2603);
            this.a(\u2603, afi.bn.a(15), 8, -2, 3, \u2603);
            if (!this.e) {
                this.e = this.a(\u2603, \u2603, \u2603, 8, -3, 3, ob.a(b.i, zy.cd.b(\u2603)), 2 + \u2603.nextInt(5));
            }
            this.a(\u2603, afi.Y.Q(), 9, -3, 2, \u2603);
            this.a(\u2603, afi.Y.Q(), 8, -3, 1, \u2603);
            this.a(\u2603, afi.Y.Q(), 4, -3, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 5, -2, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 5, -1, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 6, -3, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 7, -2, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 7, -1, 5, \u2603);
            this.a(\u2603, afi.Y.Q(), 8, -3, 5, \u2603);
            this.a(\u2603, \u2603, 9, -1, 1, 9, -1, 5, false, \u2603, b.k);
            this.a(\u2603, \u2603, 8, -3, 8, 10, -1, 10);
            this.a(\u2603, afi.bf.a(ajz.P), 8, -2, 11, \u2603);
            this.a(\u2603, afi.bf.a(ajz.P), 9, -2, 11, \u2603);
            this.a(\u2603, afi.bf.a(ajz.P), 10, -2, 11, \u2603);
            this.a(\u2603, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 8, -2, 12, \u2603);
            this.a(\u2603, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 9, -2, 12, \u2603);
            this.a(\u2603, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 10, -2, 12, \u2603);
            this.a(\u2603, \u2603, 8, -3, 8, 8, -3, 10, false, \u2603, b.k);
            this.a(\u2603, \u2603, 10, -3, 8, 10, -3, 10, false, \u2603, b.k);
            this.a(\u2603, afi.Y.Q(), 10, -2, 9, \u2603);
            this.a(\u2603, afi.af.Q(), 8, -2, 9, \u2603);
            this.a(\u2603, afi.af.Q(), 8, -2, 10, \u2603);
            this.a(\u2603, afi.af.Q(), 10, -1, 9, \u2603);
            this.a(\u2603, afi.F.a(cq.b.a()), 9, -2, 8, \u2603);
            this.a(\u2603, afi.F.a(this.a(afi.F, cq.e.a())), 10, -2, 8, \u2603);
            this.a(\u2603, afi.F.a(this.a(afi.F, cq.e.a())), 10, -1, 8, \u2603);
            this.a(\u2603, afi.bb.a(this.a(afi.bb, cq.c.b())), 10, -2, 10, \u2603);
            if (!this.f) {
                this.f = this.a(\u2603, \u2603, \u2603, 9, -3, 10, ob.a(b.i, zy.cd.b(\u2603)), 2 + \u2603.nextInt(5));
            }
            return true;
        }
        
        static {
            i = Lists.newArrayList(new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1));
            j = Lists.newArrayList(new ob(zy.g, 0, 2, 7, 30));
            b.k = new a();
        }
        
        static class a extends aqt.a
        {
            private a() {
            }
            
            @Override
            public void a(final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
                if (\u2603.nextFloat() < 0.4f) {
                    this.a = afi.e.Q();
                }
                else {
                    this.a = afi.Y.Q();
                }
            }
        }
    }
    
    public static class d extends c
    {
        private boolean e;
        
        public d() {
        }
        
        public d(final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, 64, \u2603, 7, 7, 9);
        }
        
        @Override
        protected void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Witch", this.e);
        }
        
        @Override
        protected void b(final dn \u2603) {
            super.b(\u2603);
            this.e = \u2603.n("Witch");
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (!this.a(\u2603, \u2603, 0)) {
                return false;
            }
            this.a(\u2603, \u2603, 1, 1, 1, 5, 1, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 1, 4, 2, 5, 4, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 2, 1, 0, 4, 1, 0, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 2, 2, 2, 3, 3, 2, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 1, 2, 3, 1, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 5, 2, 3, 5, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 2, 2, 7, 4, 3, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
            this.a(\u2603, \u2603, 1, 0, 2, 1, 3, 2, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 5, 0, 2, 5, 3, 2, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 1, 0, 7, 1, 3, 7, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, \u2603, 5, 0, 7, 5, 3, 7, afi.r.Q(), afi.r.Q(), false);
            this.a(\u2603, afi.aO.Q(), 2, 3, 2, \u2603);
            this.a(\u2603, afi.aO.Q(), 3, 3, 7, \u2603);
            this.a(\u2603, afi.a.Q(), 1, 3, 4, \u2603);
            this.a(\u2603, afi.a.Q(), 5, 3, 4, \u2603);
            this.a(\u2603, afi.a.Q(), 5, 3, 5, \u2603);
            this.a(\u2603, afi.ca.Q().a(agx.b, agx.a.r), 1, 3, 5, \u2603);
            this.a(\u2603, afi.ai.Q(), 3, 2, 6, \u2603);
            this.a(\u2603, afi.bE.Q(), 4, 2, 6, \u2603);
            this.a(\u2603, afi.aO.Q(), 1, 2, 1, \u2603);
            this.a(\u2603, afi.aO.Q(), 5, 2, 1, \u2603);
            final int a = this.a(afi.ad, 3);
            final int a2 = this.a(afi.ad, 1);
            final int a3 = this.a(afi.ad, 0);
            final int a4 = this.a(afi.ad, 2);
            this.a(\u2603, \u2603, 0, 4, 1, 6, 4, 1, afi.bU.a(a), afi.bU.a(a), false);
            this.a(\u2603, \u2603, 0, 4, 2, 0, 4, 7, afi.bU.a(a3), afi.bU.a(a3), false);
            this.a(\u2603, \u2603, 6, 4, 2, 6, 4, 7, afi.bU.a(a2), afi.bU.a(a2), false);
            this.a(\u2603, \u2603, 0, 4, 8, 6, 4, 8, afi.bU.a(a4), afi.bU.a(a4), false);
            for (int i = 2; i <= 7; i += 5) {
                for (int j = 1; j <= 5; j += 4) {
                    this.b(\u2603, afi.r.Q(), j, -1, i, \u2603);
                }
            }
            if (!this.e) {
                final int i = this.a(2, 5);
                final int j = this.d(2);
                final int b = this.b(2, 5);
                if (\u2603.b(new cj(i, j, b))) {
                    this.e = true;
                    final wd \u26032 = new wd(\u2603);
                    \u26032.b(i + 0.5, j, b + 0.5, 0.0f, 0.0f);
                    \u26032.a(\u2603.E(new cj(i, j, b)), null);
                    \u2603.d(\u26032);
                }
            }
            return true;
        }
    }
}
