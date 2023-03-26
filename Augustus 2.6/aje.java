import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aje extends afh
{
    public static final amn a;
    
    protected aje() {
        super(arm.k);
        this.j(this.M.b().a((amo<Comparable>)aje.a, 0));
        final float n = 0.375f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 1.0f, 0.5f + n);
        this.a(true);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.p(\u2603.b()).c() != afi.aM && !this.e(\u2603, \u2603, \u2603)) {
            return;
        }
        if (\u2603.d(\u2603.a())) {
            int \u26032;
            for (\u26032 = 1; \u2603.p(\u2603.c(\u26032)).c() == this; ++\u26032) {}
            if (\u26032 < 3) {
                final int intValue = \u2603.b((amo<Integer>)aje.a);
                if (intValue == 15) {
                    \u2603.a(\u2603.a(), this.Q());
                    \u2603.a(\u2603, \u2603.a((amo<Comparable>)aje.a, 0), 4);
                }
                else {
                    \u2603.a(\u2603, \u2603.a((amo<Comparable>)aje.a, intValue + 1), 4);
                }
            }
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603.b()).c();
        if (c == this) {
            return true;
        }
        if (c == afi.c || c == afi.d || c == afi.m) {
            for (final cq \u26032 : cq.c.a) {
                if (\u2603.p(\u2603.a(\u26032).b()).c().t() == arm.h) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    protected final boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.e(\u2603, \u2603)) {
            return true;
        }
        this.b(\u2603, \u2603, \u2603, 0);
        \u2603.g(\u2603);
        return false;
    }
    
    public boolean e(final adm \u2603, final cj \u2603) {
        return this.d(\u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.aJ;
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
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.aJ;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return \u2603.b(\u2603).b(\u2603);
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aje.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)aje.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aje.a });
    }
    
    static {
        a = amn.a("age", 0, 15);
    }
}
