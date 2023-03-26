import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aju extends afh
{
    public static final aml a;
    public static final amm<a> b;
    public static final amm<b> N;
    private static final int[][] O;
    private final afh P;
    private final alz Q;
    private boolean R;
    private int S;
    
    protected aju(final alz \u2603) {
        super(\u2603.c().J);
        this.j(this.M.b().a((amo<Comparable>)aju.a, cq.c).a(aju.b, aju.a.b).a(aju.N, aju.b.a));
        this.P = \u2603.c();
        this.Q = \u2603;
        this.c(this.P.w);
        this.b(this.P.x / 3.0f);
        this.a(this.P.H);
        this.e(255);
        this.a(yz.b);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        if (this.R) {
            this.a(0.5f * (this.S % 2), 0.5f * (this.S / 4 % 2), 0.5f * (this.S / 2 % 2), 0.5f + 0.5f * (this.S % 2), 0.5f + 0.5f * (this.S / 4 % 2), 0.5f + 0.5f * (this.S / 2 % 2));
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    public void e(final adq \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).b(aju.b) == aju.a.a) {
            this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    public static boolean c(final afh \u2603) {
        return \u2603 instanceof aju;
    }
    
    public static boolean a(final adq \u2603, final cj \u2603, final alz \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        return c(c) && p.b(aju.b) == \u2603.b(aju.b) && p.b((amo<Comparable>)aju.a) == \u2603.b((amo<Comparable>)aju.a);
    }
    
    public int f(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final cq cq = p.b((amo<cq>)aju.a);
        final a a = p.b(aju.b);
        final boolean b = a == aju.a.a;
        if (cq == cq.f) {
            final alz alz = \u2603.p(\u2603.f());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.d(), p)) {
                    return b ? 1 : 2;
                }
                if (cq2 == cq.d && !a(\u2603, \u2603.c(), p)) {
                    return b ? 2 : 1;
                }
            }
        }
        else if (cq == cq.e) {
            final alz alz = \u2603.p(\u2603.e());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.d(), p)) {
                    return b ? 2 : 1;
                }
                if (cq2 == cq.d && !a(\u2603, \u2603.c(), p)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (cq == cq.d) {
            final alz alz = \u2603.p(\u2603.d());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.f(), p)) {
                    return b ? 2 : 1;
                }
                if (cq2 == cq.f && !a(\u2603, \u2603.e(), p)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (cq == cq.c) {
            final alz alz = \u2603.p(\u2603.c());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.f(), p)) {
                    return b ? 1 : 2;
                }
                if (cq2 == cq.f && !a(\u2603, \u2603.e(), p)) {
                    return b ? 2 : 1;
                }
            }
        }
        return 0;
    }
    
    public int g(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final cq cq = p.b((amo<cq>)aju.a);
        final a a = p.b(aju.b);
        final boolean b = a == aju.a.a;
        if (cq == cq.f) {
            final alz alz = \u2603.p(\u2603.e());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.c(), p)) {
                    return b ? 1 : 2;
                }
                if (cq2 == cq.d && !a(\u2603, \u2603.d(), p)) {
                    return b ? 2 : 1;
                }
            }
        }
        else if (cq == cq.e) {
            final alz alz = \u2603.p(\u2603.f());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.c(), p)) {
                    return b ? 2 : 1;
                }
                if (cq2 == cq.d && !a(\u2603, \u2603.d(), p)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (cq == cq.d) {
            final alz alz = \u2603.p(\u2603.c());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.e(), p)) {
                    return b ? 2 : 1;
                }
                if (cq2 == cq.f && !a(\u2603, \u2603.f(), p)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (cq == cq.c) {
            final alz alz = \u2603.p(\u2603.d());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.e(), p)) {
                    return b ? 1 : 2;
                }
                if (cq2 == cq.f && !a(\u2603, \u2603.f(), p)) {
                    return b ? 2 : 1;
                }
            }
        }
        return 0;
    }
    
    public boolean h(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final cq cq = p.b((amo<cq>)aju.a);
        final a a = p.b(aju.b);
        final boolean b = a == aju.a.a;
        float \u26032 = 0.5f;
        float \u26033 = 1.0f;
        if (b) {
            \u26032 = 0.0f;
            \u26033 = 0.5f;
        }
        float \u26034 = 0.0f;
        float \u26035 = 1.0f;
        float \u26036 = 0.0f;
        float \u26037 = 0.5f;
        boolean b2 = true;
        if (cq == cq.f) {
            \u26034 = 0.5f;
            \u26037 = 1.0f;
            final alz alz = \u2603.p(\u2603.f());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.d(), p)) {
                    \u26037 = 0.5f;
                    b2 = false;
                }
                else if (cq2 == cq.d && !a(\u2603, \u2603.c(), p)) {
                    \u26036 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (cq == cq.e) {
            \u26035 = 0.5f;
            \u26037 = 1.0f;
            final alz alz = \u2603.p(\u2603.e());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.d(), p)) {
                    \u26037 = 0.5f;
                    b2 = false;
                }
                else if (cq2 == cq.d && !a(\u2603, \u2603.c(), p)) {
                    \u26036 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (cq == cq.d) {
            \u26036 = 0.5f;
            \u26037 = 1.0f;
            final alz alz = \u2603.p(\u2603.d());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.f(), p)) {
                    \u26035 = 0.5f;
                    b2 = false;
                }
                else if (cq2 == cq.f && !a(\u2603, \u2603.e(), p)) {
                    \u26034 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (cq == cq.c) {
            final alz alz = \u2603.p(\u2603.c());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.f(), p)) {
                    \u26035 = 0.5f;
                    b2 = false;
                }
                else if (cq2 == cq.f && !a(\u2603, \u2603.e(), p)) {
                    \u26034 = 0.5f;
                    b2 = false;
                }
            }
        }
        this.a(\u26034, \u26032, \u26036, \u26035, \u26033, \u26037);
        return b2;
    }
    
    public boolean i(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final cq cq = p.b((amo<cq>)aju.a);
        final a a = p.b(aju.b);
        final boolean b = a == aju.a.a;
        float \u26032 = 0.5f;
        float \u26033 = 1.0f;
        if (b) {
            \u26032 = 0.0f;
            \u26033 = 0.5f;
        }
        float \u26034 = 0.0f;
        float \u26035 = 0.5f;
        float \u26036 = 0.5f;
        float \u26037 = 1.0f;
        boolean b2 = false;
        if (cq == cq.f) {
            final alz alz = \u2603.p(\u2603.e());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.c(), p)) {
                    \u26036 = 0.0f;
                    \u26037 = 0.5f;
                    b2 = true;
                }
                else if (cq2 == cq.d && !a(\u2603, \u2603.d(), p)) {
                    \u26036 = 0.5f;
                    \u26037 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (cq == cq.e) {
            final alz alz = \u2603.p(\u2603.f());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                \u26034 = 0.5f;
                \u26035 = 1.0f;
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.c && !a(\u2603, \u2603.c(), p)) {
                    \u26036 = 0.0f;
                    \u26037 = 0.5f;
                    b2 = true;
                }
                else if (cq2 == cq.d && !a(\u2603, \u2603.d(), p)) {
                    \u26036 = 0.5f;
                    \u26037 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (cq == cq.d) {
            final alz alz = \u2603.p(\u2603.c());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                \u26036 = 0.0f;
                \u26037 = 0.5f;
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.e(), p)) {
                    b2 = true;
                }
                else if (cq2 == cq.f && !a(\u2603, \u2603.f(), p)) {
                    \u26034 = 0.5f;
                    \u26035 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (cq == cq.c) {
            final alz alz = \u2603.p(\u2603.d());
            final afh afh = alz.c();
            if (c(afh) && a == alz.b(aju.b)) {
                final cq cq2 = alz.b((amo<cq>)aju.a);
                if (cq2 == cq.e && !a(\u2603, \u2603.e(), p)) {
                    b2 = true;
                }
                else if (cq2 == cq.f && !a(\u2603, \u2603.f(), p)) {
                    \u26034 = 0.5f;
                    \u26035 = 1.0f;
                    b2 = true;
                }
            }
        }
        if (b2) {
            this.a(\u26034, \u26032, \u26036, \u26035, \u26033, \u26037);
        }
        return b2;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.e(\u2603, \u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final boolean h = this.h(\u2603, \u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (h && this.i(\u2603, \u2603)) {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        this.P.c(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
        this.P.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void d(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.P.d(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int c(final adq \u2603, final cj \u2603) {
        return this.P.c(\u2603, \u2603);
    }
    
    @Override
    public float a(final pk \u2603) {
        return this.P.a(\u2603);
    }
    
    @Override
    public adf m() {
        return this.P.m();
    }
    
    @Override
    public int a(final adm \u2603) {
        return this.P.a(\u2603);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        return this.P.b(\u2603, \u2603);
    }
    
    @Override
    public aui a(final adm \u2603, final cj \u2603, final pk \u2603, final aui \u2603) {
        return this.P.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean A() {
        return this.P.A();
    }
    
    @Override
    public boolean a(final alz \u2603, final boolean \u2603) {
        return this.P.a(\u2603, \u2603);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return this.P.d(\u2603, \u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a(\u2603, \u2603, this.Q, afi.a);
        this.P.c(\u2603, \u2603, this.Q);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.P.b(\u2603, \u2603, this.Q);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final pk \u2603) {
        this.P.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        this.P.b(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        return this.P.a(\u2603, \u2603, this.Q, \u2603, cq.a, 0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final adi \u2603) {
        this.P.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return this.P.g(this.Q);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        alz alz = super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        alz = alz.a((amo<Comparable>)aju.a, \u2603.aP()).a(aju.N, aju.b.a);
        if (\u2603 == cq.a || (\u2603 != cq.b && \u2603 > 0.5)) {
            return alz.a(aju.b, aju.a.a);
        }
        return alz.a(aju.b, aju.a.b);
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        final auh[] array = new auh[8];
        final alz p = \u2603.p(\u2603);
        final int b = p.b((amo<cq>)aju.a).b();
        final boolean b2 = p.b(aju.b) == aju.a.a;
        final int[] a = aju.O[b + (b2 ? 4 : 0)];
        this.R = true;
        for (int i = 0; i < 8; ++i) {
            this.S = i;
            if (Arrays.binarySearch(a, i) < 0) {
                array[i] = super.a(\u2603, \u2603, \u2603, \u2603);
            }
        }
        for (final int n : a) {
            array[n] = null;
        }
        auh auh = null;
        double n2 = 0.0;
        for (final auh auh2 : array) {
            if (auh2 != null) {
                final double g = auh2.c.g(\u2603);
                if (g > n2) {
                    auh = auh2;
                    n2 = g;
                }
            }
        }
        return auh;
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q().a(aju.b, ((\u2603 & 0x4) > 0) ? aju.a.a : aju.a.b);
        alz = alz.a((amo<Comparable>)aju.a, cq.a(5 - (\u2603 & 0x3)));
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        if (\u2603.b(aju.b) == aju.a.a) {
            n |= 0x4;
        }
        n |= 5 - \u2603.b((amo<cq>)aju.a).a();
        return n;
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        if (this.h(\u2603, \u2603)) {
            switch (this.g(\u2603, \u2603)) {
                case 0: {
                    \u2603 = \u2603.a(aju.N, aju.b.a);
                    break;
                }
                case 1: {
                    \u2603 = \u2603.a(aju.N, aju.b.c);
                    break;
                }
                case 2: {
                    \u2603 = \u2603.a(aju.N, aju.b.b);
                    break;
                }
            }
        }
        else {
            switch (this.f(\u2603, \u2603)) {
                case 0: {
                    \u2603 = \u2603.a(aju.N, aju.b.a);
                    break;
                }
                case 1: {
                    \u2603 = \u2603.a(aju.N, aju.b.e);
                    break;
                }
                case 2: {
                    \u2603 = \u2603.a(aju.N, aju.b.d);
                    break;
                }
            }
        }
        return \u2603;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aju.a, aju.b, aju.N });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amm.a("half", a.class);
        N = amm.a("shape", b.class);
        O = new int[][] { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 }, { 1, 3 }, { 2, 3 }, { 0, 2 } };
    }
    
    public enum a implements nw
    {
        a("top"), 
        b("bottom");
        
        private final String c;
        
        private a(final String \u2603) {
            this.c = \u2603;
        }
        
        @Override
        public String toString() {
            return this.c;
        }
        
        @Override
        public String l() {
            return this.c;
        }
    }
    
    public enum b implements nw
    {
        a("straight"), 
        b("inner_left"), 
        c("inner_right"), 
        d("outer_left"), 
        e("outer_right");
        
        private final String f;
        
        private b(final String \u2603) {
            this.f = \u2603;
        }
        
        @Override
        public String toString() {
            return this.f;
        }
        
        @Override
        public String l() {
            return this.f;
        }
    }
}
