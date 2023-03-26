import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aia extends afm implements afj
{
    protected aia() {
        final float n = 0.2f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 2.0f, 0.5f + n);
        this.a(true);
    }
    
    @Override
    public void b(final adm \u2603, cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.nextInt(25) == 0) {
            int n = 5;
            final int n2 = 4;
            for (final cj \u26032 : cj.b(\u2603.a(-4, -1, -4), \u2603.a(4, 1, 4))) {
                if (\u2603.p(\u26032).c() == this && --n <= 0) {
                    return;
                }
            }
            cj \u26033 = \u2603.a(\u2603.nextInt(3) - 1, \u2603.nextInt(2) - \u2603.nextInt(2), \u2603.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (\u2603.d(\u26033) && this.f(\u2603, \u26033, this.Q())) {
                    \u2603 = \u26033;
                }
                \u26033 = \u2603.a(\u2603.nextInt(3) - 1, \u2603.nextInt(2) - \u2603.nextInt(2), \u2603.nextInt(3) - 1);
            }
            if (\u2603.d(\u26033) && this.f(\u2603, \u26033, this.Q())) {
                \u2603.a(\u26033, this.Q(), 2);
            }
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && this.f(\u2603, \u2603, this.Q());
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603.o();
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.o() < 0 || \u2603.o() >= 256) {
            return false;
        }
        final alz p = \u2603.p(\u2603.b());
        return p.c() == afi.bw || (p.c() == afi.d && p.b(agf.a) == agf.a.c) || (\u2603.k(\u2603) < 13 && this.c(p.c()));
    }
    
    public boolean d(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        \u2603.g(\u2603);
        aot aot = null;
        if (this == afi.P) {
            aot = new aoz(afi.bg);
        }
        else if (this == afi.Q) {
            aot = new aoz(afi.bh);
        }
        if (aot != null && aot.b(\u2603, \u2603, \u2603)) {
            return true;
        }
        \u2603.a(\u2603, \u2603, 3);
        return false;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return true;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return \u2603.nextFloat() < 0.4;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        this.d(\u2603, \u2603, \u2603, \u2603);
    }
}
