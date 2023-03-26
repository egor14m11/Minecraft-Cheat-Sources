import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afo extends afh
{
    public static final amn a;
    
    protected afo() {
        super(arm.A);
        this.j(this.M.b().a((amo<Comparable>)afo.a, 0));
        this.a(true);
        this.a(yz.c);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final cj a = \u2603.a();
        if (!\u2603.d(a)) {
            return;
        }
        int \u26032;
        for (\u26032 = 1; \u2603.p(\u2603.c(\u26032)).c() == this; ++\u26032) {}
        if (\u26032 >= 3) {
            return;
        }
        final int intValue = \u2603.b((amo<Integer>)afo.a);
        if (intValue == 15) {
            \u2603.a(a, this.Q());
            final alz a2 = \u2603.a((amo<Comparable>)afo.a, 0);
            \u2603.a(\u2603, a2, 4);
            this.a(\u2603, a, a2, this);
        }
        else {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)afo.a, intValue + 1), 4);
        }
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        final float n = 0.0625f;
        return new aug(\u2603.n() + n, \u2603.o(), \u2603.p() + n, \u2603.n() + 1 - n, \u2603.o() + 1 - n, \u2603.p() + 1 - n);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        final float n = 0.0625f;
        return new aug(\u2603.n() + n, \u2603.o(), \u2603.p() + n, \u2603.n() + 1 - n, \u2603.o() + 1, \u2603.p() + 1 - n);
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
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && this.e(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!this.e(\u2603, \u2603)) {
            \u2603.b(\u2603, true);
        }
    }
    
    public boolean e(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.c.a) {
            if (\u2603.p(\u2603.a(\u26032)).c().t().a()) {
                return false;
            }
        }
        final afh c = \u2603.p(\u2603.b()).c();
        return c == afi.aK || c == afi.m;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        \u2603.a(ow.h, 1.0f);
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afo.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)afo.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afo.a });
    }
    
    static {
        a = amn.a("age", 0, 15);
    }
}
