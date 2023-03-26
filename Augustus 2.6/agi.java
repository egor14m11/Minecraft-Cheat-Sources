import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agi extends afm implements afj
{
    public static final amm<b> a;
    public static final amm<a> b;
    public static final amm<cq> N;
    
    public agi() {
        super(arm.l);
        this.j(this.M.b().a(agi.a, agi.b.a).a(agi.b, agi.a.b).a(agi.N, cq.c));
        this.c(0.0f);
        this.a(agi.h);
        this.c("doublePlant");
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public b e(final adq \u2603, final cj \u2603) {
        alz \u26032 = \u2603.p(\u2603);
        if (\u26032.c() == this) {
            \u26032 = this.a(\u26032, \u2603, \u2603);
            return \u26032.b(agi.a);
        }
        return agi.b.d;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && \u2603.d(\u2603.a());
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() == this) {
            final b b = this.a(p, \u2603, \u2603).b(agi.a);
            return b == agi.b.d || b == agi.b.c;
        }
        return true;
    }
    
    @Override
    protected void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.f(\u2603, \u2603, \u2603)) {
            return;
        }
        final boolean b = \u2603.b(agi.b) == agi.a.a;
        final cj cj = b ? \u2603 : \u2603.a();
        final cj \u26032 = b ? \u2603.b() : \u2603;
        final afh afh = b ? this : \u2603.p(cj).c();
        final afh afh2 = b ? \u2603.p(\u26032).c() : this;
        if (afh == this) {
            \u2603.a(cj, afi.a.Q(), 2);
        }
        if (afh2 == this) {
            \u2603.a(\u26032, afi.a.Q(), 3);
            if (!b) {
                this.b(\u2603, \u26032, \u2603, 0);
            }
        }
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.b(agi.b) == agi.a.a) {
            return \u2603.p(\u2603.b()).c() == this;
        }
        final alz p = \u2603.p(\u2603.a());
        return p.c() == this && super.f(\u2603, \u2603, p);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.b(agi.b) == agi.a.a) {
            return null;
        }
        final b b = \u2603.b(agi.a);
        if (b == agi.b.d) {
            return null;
        }
        if (b != agi.b.c) {
            return zw.a(this);
        }
        if (\u2603.nextInt(8) == 0) {
            return zy.N;
        }
        return null;
    }
    
    @Override
    public int a(final alz \u2603) {
        if (\u2603.b(agi.b) == agi.a.a || \u2603.b(agi.a) == agi.b.c) {
            return 0;
        }
        return \u2603.b(agi.a).a();
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        final b e = this.e(\u2603, \u2603);
        if (e == agi.b.c || e == agi.b.d) {
            return aea.a(\u2603, \u2603);
        }
        return 16777215;
    }
    
    public void a(final adm \u2603, final cj \u2603, final b \u2603, final int \u2603) {
        \u2603.a(\u2603, this.Q().a(agi.b, agi.a.b).a(agi.a, \u2603), \u2603);
        \u2603.a(\u2603.a(), this.Q().a(agi.b, agi.a.a), \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        \u2603.a(\u2603.a(), this.Q().a(agi.b, agi.a.a), 2);
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (!\u2603.D && \u2603.bZ() != null && \u2603.bZ().b() == zy.be && \u2603.b(agi.b) == agi.a.b && this.b(\u2603, \u2603, \u2603, \u2603)) {
            return;
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        if (\u2603.b(agi.b) == agi.a.a) {
            if (\u2603.p(\u2603.b()).c() == this) {
                if (!\u2603.bA.d) {
                    final alz p = \u2603.p(\u2603.b());
                    final b b = p.b(agi.a);
                    if (b == agi.b.d || b == agi.b.c) {
                        if (!\u2603.D) {
                            if (\u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
                                this.b(\u2603, \u2603, p, \u2603);
                                \u2603.g(\u2603.b());
                            }
                            else {
                                \u2603.b(\u2603.b(), true);
                            }
                        }
                        else {
                            \u2603.g(\u2603.b());
                        }
                    }
                    else {
                        \u2603.b(\u2603.b(), true);
                    }
                }
                else {
                    \u2603.g(\u2603.b());
                }
            }
        }
        else if (\u2603.bA.d && \u2603.p(\u2603.a()).c() == this) {
            \u2603.a(\u2603.a(), afi.a.Q(), 2);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    private boolean b(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        final b b = \u2603.b(agi.a);
        if (b == agi.b.d || b == agi.b.c) {
            \u2603.b(na.ab[afh.a(this)]);
            final int a = ((b == agi.b.c) ? akc.a.b : akc.a.c).a();
            afh.a(\u2603, \u2603, new zx(afi.H, 2, a));
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final b b : agi.b.values()) {
            \u2603.add(new zx(\u2603, 1, b.a()));
        }
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        return this.e(\u2603, \u2603).a();
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        final b e = this.e(\u2603, \u2603);
        return e != agi.b.c && e != agi.b.d;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        afh.a(\u2603, \u2603, new zx(this, 1, this.e(\u2603, \u2603).a()));
    }
    
    @Override
    public alz a(final int \u2603) {
        if ((\u2603 & 0x8) > 0) {
            return this.Q().a(agi.b, agi.a.a);
        }
        return this.Q().a(agi.b, agi.a.b).a(agi.a, agi.b.a(\u2603 & 0x7));
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        if (\u2603.b(agi.b) == agi.a.a) {
            final alz p = \u2603.p(\u2603.b());
            if (p.c() == this) {
                \u2603 = \u2603.a(agi.a, (Comparable)p.b((amo<V>)agi.a));
            }
        }
        return \u2603;
    }
    
    @Override
    public int c(final alz \u2603) {
        if (\u2603.b(agi.b) == agi.a.a) {
            return 0x8 | \u2603.b(agi.N).b();
        }
        return \u2603.b(agi.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agi.b, agi.a, agi.N });
    }
    
    @Override
    public afh.a R() {
        return afh.a.b;
    }
    
    static {
        a = amm.a("variant", b.class);
        b = amm.a("half", a.class);
        N = age.O;
    }
    
    public enum b implements nw
    {
        a(0, "sunflower"), 
        b(1, "syringa"), 
        c(2, "double_grass", "grass"), 
        d(3, "double_fern", "fern"), 
        e(4, "double_rose", "rose"), 
        f(5, "paeonia");
        
        private static final b[] g;
        private final int h;
        private final String i;
        private final String j;
        
        private b(final int \u2603, final String \u2603) {
            this(\u2603, \u2603, \u2603);
        }
        
        private b(final int \u2603, final String \u2603, final String \u2603) {
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public int a() {
            return this.h;
        }
        
        @Override
        public String toString() {
            return this.i;
        }
        
        public static b a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= b.g.length) {
                \u2603 = 0;
            }
            return b.g[\u2603];
        }
        
        @Override
        public String l() {
            return this.i;
        }
        
        public String c() {
            return this.j;
        }
        
        static {
            g = new b[values().length];
            for (final b b2 : values()) {
                b.g[b2.a()] = b2;
            }
        }
    }
    
    public enum a implements nw
    {
        a, 
        b;
        
        @Override
        public String toString() {
            return this.l();
        }
        
        @Override
        public String l() {
            return (this == a.a) ? "upper" : "lower";
        }
    }
}
