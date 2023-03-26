import java.util.Random;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class afg extends age
{
    public static final amm<a> a;
    public static final amk b;
    
    public afg() {
        super(arm.n);
        this.j(this.M.b().a(afg.a, afg.a.b).a((amo<Comparable>)afg.b, false));
        this.l();
    }
    
    @Override
    public boolean a(final adm \u2603, cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        if (\u2603.b(afg.a) != afg.a.a) {
            \u2603 = \u2603.a(\u2603.b((amo<cq>)afg.O));
            \u2603 = \u2603.p(\u2603);
            if (\u2603.c() != this) {
                return true;
            }
        }
        if (!\u2603.t.e() || \u2603.b(\u2603) == ady.x) {
            \u2603.g(\u2603);
            final cj a = \u2603.a(\u2603.b((amo<cq>)afg.O).d());
            if (\u2603.p(a).c() == this) {
                \u2603.g(a);
            }
            \u2603.a(null, \u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, 5.0f, true, true);
            return true;
        }
        if (\u2603.b((amo<Boolean>)afg.b)) {
            final wn f = this.f(\u2603, \u2603);
            if (f != null) {
                \u2603.b(new fb("tile.bed.occupied", new Object[0]));
                return true;
            }
            \u2603 = \u2603.a((amo<Comparable>)afg.b, false);
            \u2603.a(\u2603, \u2603, 4);
        }
        final wn.a a2 = \u2603.a(\u2603);
        if (a2 == wn.a.a) {
            \u2603 = \u2603.a((amo<Comparable>)afg.b, true);
            \u2603.a(\u2603, \u2603, 4);
            return true;
        }
        if (a2 == wn.a.c) {
            \u2603.b(new fb("tile.bed.noSleep", new Object[0]));
        }
        else if (a2 == wn.a.f) {
            \u2603.b(new fb("tile.bed.notSafe", new Object[0]));
        }
        return true;
    }
    
    private wn f(final adm \u2603, final cj \u2603) {
        for (final wn wn : \u2603.j) {
            if (wn.bJ() && wn.bx.equals(\u2603)) {
                return wn;
            }
        }
        return null;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.l();
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final cq \u26032 = \u2603.b((amo<cq>)afg.O);
        if (\u2603.b(afg.a) == afg.a.a) {
            if (\u2603.p(\u2603.a(\u26032.d())).c() != this) {
                \u2603.g(\u2603);
            }
        }
        else if (\u2603.p(\u2603.a(\u26032)).c() != this) {
            \u2603.g(\u2603);
            if (!\u2603.D) {
                this.b(\u2603, \u2603, \u2603, 0);
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.b(afg.a) == afg.a.a) {
            return null;
        }
        return zy.ba;
    }
    
    private void l() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }
    
    public static cj a(final adm \u2603, final cj \u2603, int \u2603) {
        final cq cq = \u2603.p(\u2603).b((amo<cq>)afg.O);
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        for (int i = 0; i <= 1; ++i) {
            final int n2 = n - cq.g() * i - 1;
            final int n3 = p - cq.i() * i - 1;
            final int n4 = n2 + 2;
            final int n5 = n3 + 2;
            for (int j = n2; j <= n4; ++j) {
                for (int k = n3; k <= n5; ++k) {
                    final cj \u26032 = new cj(j, o, k);
                    if (e(\u2603, \u26032)) {
                        if (\u2603 <= 0) {
                            return \u26032;
                        }
                        --\u2603;
                    }
                }
            }
        }
        return null;
    }
    
    protected static boolean e(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b()) && !\u2603.p(\u2603).c().t().a() && !\u2603.p(\u2603.a()).c().t().a();
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (\u2603.b(afg.a) == afg.a.b) {
            super.a(\u2603, \u2603, \u2603, \u2603, 0);
        }
    }
    
    @Override
    public int k() {
        return 1;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.ba;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        if (\u2603.bA.d && \u2603.b(afg.a) == afg.a.a) {
            final cj a = \u2603.a(\u2603.b((amo<cq>)afg.O).d());
            if (\u2603.p(a).c() == this) {
                \u2603.g(a);
            }
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        final cq b = cq.b(\u2603);
        if ((\u2603 & 0x8) > 0) {
            return this.Q().a(afg.a, afg.a.a).a((amo<Comparable>)afg.O, b).a((amo<Comparable>)afg.b, (\u2603 & 0x4) > 0);
        }
        return this.Q().a(afg.a, afg.a.b).a((amo<Comparable>)afg.O, b);
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        if (\u2603.b(afg.a) == afg.a.b) {
            final alz p = \u2603.p(\u2603.a(\u2603.b((amo<cq>)afg.O)));
            if (p.c() == this) {
                \u2603 = \u2603.a((amo<Comparable>)afg.b, (Comparable)p.b((amo<V>)afg.b));
            }
        }
        return \u2603;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)afg.O).b();
        if (\u2603.b(afg.a) == afg.a.a) {
            n |= 0x8;
            if (\u2603.b((amo<Boolean>)afg.b)) {
                n |= 0x4;
            }
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afg.O, afg.a, afg.b });
    }
    
    static {
        a = amm.a("part", a.class);
        b = amk.a("occupied");
    }
    
    public enum a implements nw
    {
        a("head"), 
        b("foot");
        
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
}
