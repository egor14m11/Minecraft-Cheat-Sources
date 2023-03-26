import com.google.common.cache.LoadingCache;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aip extends ahj
{
    public static final amm<cq.a> a;
    
    public aip() {
        super(arm.E, false);
        this.j(this.M.b().a(aip.a, cq.a.a));
        this.a(true);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        super.b(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.t.d() && \u2603.Q().b("doMobSpawning") && \u2603.nextInt(2000) < \u2603.aa().a()) {
            final int o = \u2603.o();
            cj b;
            for (b = \u2603; !adm.a(\u2603, b) && b.o() > 0; b = b.b()) {}
            if (o > 0 && !\u2603.p(b.a()).c().v()) {
                final pk a = aax.a(\u2603, 57, b.n() + 0.5, b.o() + 1.1, b.p() + 0.5);
                if (a != null) {
                    a.aj = a.aq();
                }
            }
        }
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final cq.a a = \u2603.p(\u2603).b(aip.a);
        float n = 0.125f;
        float n2 = 0.125f;
        if (a == cq.a.a) {
            n = 0.5f;
        }
        if (a == cq.a.c) {
            n2 = 0.5f;
        }
        this.a(0.5f - n, 0.0f, 0.5f - n2, 0.5f + n, 1.0f, 0.5f + n2);
    }
    
    public static int a(final cq.a \u2603) {
        if (\u2603 == cq.a.a) {
            return 1;
        }
        if (\u2603 == cq.a.c) {
            return 2;
        }
        return 0;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    public boolean e(final adm \u2603, final cj \u2603) {
        final a \u26032 = new a(\u2603, \u2603, cq.a.a);
        if (\u26032.d() && \u26032.e == 0) {
            \u26032.e();
            return true;
        }
        final a \u26033 = new a(\u2603, \u2603, cq.a.c);
        if (\u26033.d() && \u26033.e == 0) {
            \u26033.e();
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final cq.a a = \u2603.b(aip.a);
        if (a == cq.a.a) {
            final a a2 = new a(\u2603, \u2603, cq.a.a);
            if (!a2.d() || a2.e < a2.h * a2.g) {
                \u2603.a(\u2603, afi.a.Q());
            }
        }
        else if (a == cq.a.c) {
            final a a2 = new a(\u2603, \u2603, cq.a.c);
            if (!a2.d() || a2.e < a2.h * a2.g) {
                \u2603.a(\u2603, afi.a.Q());
            }
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        cq.a a = null;
        final alz p = \u2603.p(\u2603);
        if (\u2603.p(\u2603).c() == this) {
            a = p.b(aip.a);
            if (a == null) {
                return false;
            }
            if (a == cq.a.c && \u2603 != cq.f && \u2603 != cq.e) {
                return false;
            }
            if (a == cq.a.a && \u2603 != cq.d && \u2603 != cq.c) {
                return false;
            }
        }
        final boolean b = \u2603.p(\u2603.e()).c() == this && \u2603.p(\u2603.f(2)).c() != this;
        final boolean b2 = \u2603.p(\u2603.f()).c() == this && \u2603.p(\u2603.g(2)).c() != this;
        final boolean b3 = \u2603.p(\u2603.c()).c() == this && \u2603.p(\u2603.d(2)).c() != this;
        final boolean b4 = \u2603.p(\u2603.d()).c() == this && \u2603.p(\u2603.e(2)).c() != this;
        final boolean b5 = b || b2 || a == cq.a.a;
        final boolean b6 = b3 || b4 || a == cq.a.c;
        return (b5 && \u2603 == cq.e) || (b5 && \u2603 == cq.f) || (b6 && \u2603 == cq.c) || (b6 && \u2603 == cq.d);
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.m == null && \u2603.l == null) {
            \u2603.d(\u2603);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.nextInt(100) == 0) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "portal.portal", 0.5f, \u2603.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double \u26032 = \u2603.n() + \u2603.nextFloat();
            final double \u26033 = \u2603.o() + \u2603.nextFloat();
            double \u26034 = \u2603.p() + \u2603.nextFloat();
            double \u26035 = (\u2603.nextFloat() - 0.5) * 0.5;
            final double \u26036 = (\u2603.nextFloat() - 0.5) * 0.5;
            double \u26037 = (\u2603.nextFloat() - 0.5) * 0.5;
            final int n = \u2603.nextInt(2) * 2 - 1;
            if (\u2603.p(\u2603.e()).c() == this || \u2603.p(\u2603.f()).c() == this) {
                \u26034 = \u2603.p() + 0.5 + 0.25 * n;
                \u26037 = \u2603.nextFloat() * 2.0f * n;
            }
            else {
                \u26032 = \u2603.n() + 0.5 + 0.25 * n;
                \u26035 = \u2603.nextFloat() * 2.0f * n;
            }
            \u2603.a(cy.y, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037, new int[0]);
        }
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aip.a, ((\u2603 & 0x3) == 0x2) ? cq.a.c : cq.a.a);
    }
    
    @Override
    public int c(final alz \u2603) {
        return a(\u2603.b(aip.a));
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aip.a });
    }
    
    public amd.b f(final adm \u2603, final cj \u2603) {
        cq.a a = cq.a.c;
        a a2 = new a(\u2603, \u2603, cq.a.a);
        final LoadingCache<cj, amc> a3 = amd.a(\u2603, true);
        if (!a2.d()) {
            a = cq.a.a;
            a2 = new a(\u2603, \u2603, cq.a.c);
        }
        if (!a2.d()) {
            return new amd.b(\u2603, cq.c, cq.b, a3, 1, 1, 1);
        }
        final int[] array = new int[cq.b.values().length];
        final cq f = a2.c.f();
        final cj b = a2.f.b(a2.a() - 1);
        for (final cq.b \u26032 : cq.b.values()) {
            final amd.b b2 = new amd.b((f.c() == \u26032) ? b : b.a(a2.c, a2.b() - 1), cq.a(\u26032, a), cq.b, a3, a2.b(), a2.a(), 1);
            for (int j = 0; j < a2.b(); ++j) {
                for (int k = 0; k < a2.a(); ++k) {
                    final amc a4 = b2.a(j, k, 1);
                    if (a4.a() != null && a4.a().c().t() != arm.a) {
                        final int[] array2 = array;
                        final int ordinal = \u26032.ordinal();
                        ++array2[ordinal];
                    }
                }
            }
        }
        cq.b a5 = cq.b.a;
        for (final cq.b b3 : cq.b.values()) {
            if (array[b3.ordinal()] < array[a5.ordinal()]) {
                a5 = b3;
            }
        }
        return new amd.b((f.c() == a5) ? b : b.a(a2.c, a2.b() - 1), cq.a(a5, a), cq.b, a3, a2.b(), a2.a(), 1);
    }
    
    static {
        a = amm.a("axis", cq.a.class, cq.a.a, cq.a.c);
    }
    
    public static class a
    {
        private final adm a;
        private final cq.a b;
        private final cq c;
        private final cq d;
        private int e;
        private cj f;
        private int g;
        private int h;
        
        public a(final adm \u2603, cj \u2603, final cq.a \u2603) {
            this.e = 0;
            this.a = \u2603;
            this.b = \u2603;
            if (\u2603 == cq.a.a) {
                this.d = cq.f;
                this.c = cq.e;
            }
            else {
                this.d = cq.c;
                this.c = cq.d;
            }
            for (cj cj = \u2603; \u2603.o() > cj.o() - 21 && \u2603.o() > 0 && this.a(\u2603.p(\u2603.b()).c()); \u2603 = \u2603.b()) {}
            final int \u26032 = this.a(\u2603, this.d) - 1;
            if (\u26032 >= 0) {
                this.f = \u2603.a(this.d, \u26032);
                this.h = this.a(this.f, this.c);
                if (this.h < 2 || this.h > 21) {
                    this.f = null;
                    this.h = 0;
                }
            }
            if (this.f != null) {
                this.g = this.c();
            }
        }
        
        protected int a(final cj \u2603, final cq \u2603) {
            int i;
            for (i = 0; i < 22; ++i) {
                final cj a = \u2603.a(\u2603, i);
                if (!this.a(this.a.p(a).c())) {
                    break;
                }
                if (this.a.p(a.b()).c() != afi.Z) {
                    break;
                }
            }
            final afh c = this.a.p(\u2603.a(\u2603, i)).c();
            if (c == afi.Z) {
                return i;
            }
            return 0;
        }
        
        public int a() {
            return this.g;
        }
        
        public int b() {
            return this.h;
        }
        
        protected int c() {
            this.g = 0;
        Label_0181:
            while (this.g < 21) {
                for (int i = 0; i < this.h; ++i) {
                    final cj b = this.f.a(this.c, i).b(this.g);
                    afh \u2603 = this.a.p(b).c();
                    if (!this.a(\u2603)) {
                        break Label_0181;
                    }
                    if (\u2603 == afi.aY) {
                        ++this.e;
                    }
                    if (i == 0) {
                        \u2603 = this.a.p(b.a(this.d)).c();
                        if (\u2603 != afi.Z) {
                            break Label_0181;
                        }
                    }
                    else if (i == this.h - 1) {
                        \u2603 = this.a.p(b.a(this.c)).c();
                        if (\u2603 != afi.Z) {
                            break Label_0181;
                        }
                    }
                }
                ++this.g;
            }
            for (int i = 0; i < this.h; ++i) {
                if (this.a.p(this.f.a(this.c, i).b(this.g)).c() != afi.Z) {
                    this.g = 0;
                    break;
                }
            }
            if (this.g > 21 || this.g < 3) {
                this.f = null;
                this.h = 0;
                return this.g = 0;
            }
            return this.g;
        }
        
        protected boolean a(final afh \u2603) {
            return \u2603.J == arm.a || \u2603 == afi.ab || \u2603 == afi.aY;
        }
        
        public boolean d() {
            return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
        }
        
        public void e() {
            for (int i = 0; i < this.h; ++i) {
                final cj a = this.f.a(this.c, i);
                for (int j = 0; j < this.g; ++j) {
                    this.a.a(a.b(j), afi.aY.Q().a(aip.a, this.b), 2);
                }
            }
        }
    }
}
