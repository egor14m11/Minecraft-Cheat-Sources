import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afz extends afm implements afj
{
    public static final amn a;
    
    protected afz() {
        this.j(this.M.b().a((amo<Comparable>)afz.a, 0));
        this.a(true);
        final float n = 0.5f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
        this.a((yz)null);
        this.c(0.0f);
        this.a(afz.h);
        this.K();
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.ak;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        super.b(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.l(\u2603.a()) >= 9) {
            final int intValue = \u2603.b((amo<Integer>)afz.a);
            if (intValue < 7) {
                final float a = a(this, \u2603, \u2603);
                if (\u2603.nextInt((int)(25.0f / a) + 1) == 0) {
                    \u2603.a(\u2603, \u2603.a((amo<Comparable>)afz.a, intValue + 1), 2);
                }
            }
        }
    }
    
    public void g(final adm \u2603, final cj \u2603, final alz \u2603) {
        int i = \u2603.b((amo<Integer>)afz.a) + ns.a(\u2603.s, 2, 5);
        if (i > 7) {
            i = 7;
        }
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)afz.a, i), 2);
    }
    
    protected static float a(final afh \u2603, final adm \u2603, final cj \u2603) {
        float n = 1.0f;
        final cj b = \u2603.b();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float n2 = 0.0f;
                final alz p = \u2603.p(b.a(i, 0, j));
                if (p.c() == afi.ak) {
                    n2 = 1.0f;
                    if (p.b((amo<Integer>)ags.a) > 0) {
                        n2 = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    n2 /= 4.0f;
                }
                n += n2;
            }
        }
        final cj c = \u2603.c();
        final cj d = \u2603.d();
        final cj e = \u2603.e();
        final cj f = \u2603.f();
        final boolean b2 = \u2603 == \u2603.p(e).c() || \u2603 == \u2603.p(f).c();
        final boolean b3 = \u2603 == \u2603.p(c).c() || \u2603 == \u2603.p(d).c();
        if (b2 && b3) {
            n /= 2.0f;
        }
        else {
            final boolean b4 = \u2603 == \u2603.p(e.c()).c() || \u2603 == \u2603.p(f.c()).c() || \u2603 == \u2603.p(f.d()).c() || \u2603 == \u2603.p(e.d()).c();
            if (b4) {
                n /= 2.0f;
            }
        }
        return n;
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        return (\u2603.k(\u2603) >= 8 || \u2603.i(\u2603)) && this.c(\u2603.p(\u2603.b()).c());
    }
    
    protected zw l() {
        return zy.N;
    }
    
    protected zw n() {
        return zy.O;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, 0);
        if (\u2603.D) {
            return;
        }
        final int intValue = \u2603.b((amo<Integer>)afz.a);
        if (intValue >= 7) {
            for (int n = 3 + \u2603, i = 0; i < n; ++i) {
                if (\u2603.s.nextInt(15) <= intValue) {
                    afh.a(\u2603, \u2603, new zx(this.l(), 1, 0));
                }
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.b((amo<Integer>)afz.a) == 7) {
            return this.n();
        }
        return this.l();
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return this.l();
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return \u2603.b((amo<Integer>)afz.a) < 7;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        this.g(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afz.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)afz.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afz.a });
    }
    
    static {
        a = amn.a("age", 0, 7);
    }
}
