import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class akc extends afm implements afj
{
    public static final amm<a> a;
    
    protected akc() {
        super(arm.l);
        this.j(this.M.b().a(akc.a, akc.a.a));
        final float n = 0.4f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.8f, 0.5f + n);
    }
    
    @Override
    public int H() {
        return adl.a(0.5, 1.0);
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        return this.c(\u2603.p(\u2603.b()).c());
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public int h(final alz \u2603) {
        if (\u2603.c() != this) {
            return super.h(\u2603);
        }
        final a a = \u2603.b(akc.a);
        if (a == akc.a.a) {
            return 16777215;
        }
        return adl.a(0.5, 1.0);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return \u2603.b(\u2603).b(\u2603);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.nextInt(8) == 0) {
            return zy.N;
        }
        return null;
    }
    
    @Override
    public int a(final int \u2603, final Random \u2603) {
        return 1 + \u2603.nextInt(\u2603 * 2 + 1);
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (!\u2603.D && \u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
            \u2603.b(na.ab[afh.a(this)]);
            afh.a(\u2603, \u2603, new zx(afi.H, 1, \u2603.b(akc.a).a()));
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        return p.c().c(p);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (int i = 1; i < 3; ++i) {
            \u2603.add(new zx(\u2603, 1, i));
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return \u2603.b(akc.a) != akc.a.a;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        agi.b \u26032 = agi.b.c;
        if (\u2603.b(akc.a) == akc.a.c) {
            \u26032 = agi.b.d;
        }
        if (afi.cF.d(\u2603, \u2603)) {
            afi.cF.a(\u2603, \u2603, \u26032, 2);
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(akc.a, akc.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(akc.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akc.a });
    }
    
    @Override
    public afh.a R() {
        return afh.a.c;
    }
    
    static {
        a = amm.a("type", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "dead_bush"), 
        b(1, "tall_grass"), 
        c(2, "fern");
        
        private static final a[] d;
        private final int e;
        private final String f;
        
        private a(final int \u2603, final String \u2603) {
            this.e = \u2603;
            this.f = \u2603;
        }
        
        public int a() {
            return this.e;
        }
        
        @Override
        public String toString() {
            return this.f;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.d.length) {
                \u2603 = 0;
            }
            return a.d[\u2603];
        }
        
        @Override
        public String l() {
            return this.f;
        }
        
        static {
            d = new a[values().length];
            for (final a a2 : values()) {
                a.d[a2.a()] = a2;
            }
        }
    }
}
