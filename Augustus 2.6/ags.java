import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ags extends afh
{
    public static final amn a;
    
    protected ags() {
        super(arm.c);
        this.j(this.M.b().a((amo<Comparable>)ags.a, 0));
        this.a(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.e(255);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return new aug(\u2603.n(), \u2603.o(), \u2603.p(), \u2603.n() + 1, \u2603.o() + 1, \u2603.p() + 1);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final int intValue = \u2603.b((amo<Integer>)ags.a);
        if (this.f(\u2603, \u2603) || \u2603.C(\u2603.a())) {
            if (intValue < 7) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)ags.a, 7), 2);
            }
        }
        else if (intValue > 0) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)ags.a, intValue - 1), 2);
        }
        else if (!this.e(\u2603, \u2603)) {
            \u2603.a(\u2603, afi.d.Q());
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final pk \u2603, final float \u2603) {
        if (!(\u2603 instanceof pr)) {
            return;
        }
        if (!\u2603.D && \u2603.s.nextFloat() < \u2603 - 0.5f) {
            if (!(\u2603 instanceof wn) && !\u2603.Q().b("mobGriefing")) {
                return;
            }
            \u2603.a(\u2603, afi.d.Q());
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    private boolean e(final adm \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603.a()).c();
        return c instanceof afz || c instanceof ajx;
    }
    
    private boolean f(final adm \u2603, final cj \u2603) {
        for (final cj.a \u26032 : cj.b(\u2603.a(-4, 0, -4), \u2603.a(4, 1, 4))) {
            if (\u2603.p(\u26032).c().t() == arm.h) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.p(\u2603.a()).c().t().a()) {
            \u2603.a(\u2603, afi.d.Q());
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        switch (ags$1.a[\u2603.ordinal()]) {
            case 1: {
                return true;
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                final afh c = \u2603.p(\u2603).c();
                return !c.c() && c != afi.ak;
            }
            default: {
                return super.a(\u2603, \u2603, \u2603);
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), \u2603, \u2603);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.d);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ags.a, \u2603 & 0x7);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ags.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ags.a });
    }
    
    static {
        a = amn.a("moisture", 0, 7);
    }
}
