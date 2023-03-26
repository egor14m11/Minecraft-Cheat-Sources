import com.google.common.base.Predicate;
import java.util.Random;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajx extends afm implements afj
{
    public static final amn a;
    public static final aml b;
    private final afh N;
    
    protected ajx(final afh \u2603) {
        this.j(this.M.b().a((amo<Comparable>)ajx.a, 0).a((amo<Comparable>)ajx.b, cq.b));
        this.N = \u2603;
        this.a(true);
        final float n = 0.125f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
        this.a((yz)null);
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        \u2603 = \u2603.a((amo<Comparable>)ajx.b, cq.b);
        for (final cq \u26032 : cq.c.a) {
            if (\u2603.p(\u2603.a(\u26032)).c() == this.N) {
                \u2603 = \u2603.a((amo<Comparable>)ajx.b, \u26032);
                break;
            }
        }
        return \u2603;
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.ak;
    }
    
    @Override
    public void b(final adm \u2603, cj \u2603, alz \u2603, final Random \u2603) {
        super.b(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.l(\u2603.a()) < 9) {
            return;
        }
        final float a = afz.a(this, \u2603, \u2603);
        if (\u2603.nextInt((int)(25.0f / a) + 1) == 0) {
            final int intValue = \u2603.b((amo<Integer>)ajx.a);
            if (intValue < 7) {
                \u2603 = \u2603.a((amo<Comparable>)ajx.a, intValue + 1);
                \u2603.a(\u2603, \u2603, 2);
            }
            else {
                for (final cq \u26032 : cq.c.a) {
                    if (\u2603.p(\u2603.a(\u26032)).c() == this.N) {
                        return;
                    }
                }
                \u2603 = \u2603.a(cq.c.a.a(\u2603));
                final afh c = \u2603.p(\u2603.b()).c();
                if (\u2603.p(\u2603).c().J == arm.a && (c == afi.ak || c == afi.d || c == afi.c)) {
                    \u2603.a(\u2603, this.N.Q());
                }
            }
        }
    }
    
    public void g(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int b = \u2603.b((amo<Integer>)ajx.a) + ns.a(\u2603.s, 2, 5);
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)ajx.a, Math.min(7, b)), 2);
    }
    
    @Override
    public int h(final alz \u2603) {
        if (\u2603.c() != this) {
            return super.h(\u2603);
        }
        final int intValue = \u2603.b((amo<Integer>)ajx.a);
        final int n = intValue * 32;
        final int n2 = 255 - intValue * 8;
        final int n3 = intValue * 4;
        return n << 16 | n2 << 8 | n3;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return this.h(\u2603.p(\u2603));
    }
    
    @Override
    public void j() {
        final float n = 0.125f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.F = (\u2603.p(\u2603).b((amo<Integer>)ajx.a) * 2 + 2) / 16.0f;
        final float n = 0.125f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, (float)this.F, 0.5f + n);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.D) {
            return;
        }
        final zw l = this.l();
        if (l == null) {
            return;
        }
        final int intValue = \u2603.b((amo<Integer>)ajx.a);
        for (int i = 0; i < 3; ++i) {
            if (\u2603.s.nextInt(15) <= intValue) {
                afh.a(\u2603, \u2603, new zx(l));
            }
        }
    }
    
    protected zw l() {
        if (this.N == afi.aU) {
            return zy.bg;
        }
        if (this.N == afi.bk) {
            return zy.bh;
        }
        return null;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        final zw l = this.l();
        return (l != null) ? l : null;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return \u2603.b((amo<Integer>)ajx.a) != 7;
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
        return this.Q().a((amo<Comparable>)ajx.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ajx.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajx.a, ajx.b });
    }
    
    static {
        a = amn.a("age", 0, 7);
        b = aml.a("facing", new Predicate<cq>() {
            public boolean a(final cq \u2603) {
                return \u2603 != cq.a;
            }
        });
    }
}
