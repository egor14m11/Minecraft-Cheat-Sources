import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class apg extends aoh
{
    protected final int a;
    protected final alz b;
    protected final alz c;
    protected int d;
    
    public apg(final boolean \u2603, final int \u2603, final int \u2603, final alz \u2603, final alz \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.d = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    protected int a(final Random \u2603) {
        int n = \u2603.nextInt(3) + this.a;
        if (this.d > 1) {
            n += \u2603.nextInt(this.d);
        }
        return n;
    }
    
    private boolean c(final adm \u2603, final cj \u2603, final int \u2603) {
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + \u2603 + 1 > 256) {
            return false;
        }
        for (int i = 0; i <= 1 + \u2603; ++i) {
            int n = 2;
            if (i == 0) {
                n = 1;
            }
            else if (i >= 1 + \u2603 - 2) {
                n = 2;
            }
            for (int \u26032 = -n; \u26032 <= n && b; ++\u26032) {
                for (int \u26033 = -n; \u26033 <= n && b; ++\u26033) {
                    if (\u2603.o() + i < 0 || \u2603.o() + i >= 256 || !this.a(\u2603.p(\u2603.a(\u26032, i, \u26033)).c())) {
                        b = false;
                    }
                }
            }
        }
        return b;
    }
    
    private boolean a(final cj \u2603, final adm \u2603) {
        final cj b = \u2603.b();
        final afh c = \u2603.p(b).c();
        if ((c != afi.c && c != afi.d) || \u2603.o() < 2) {
            return false;
        }
        this.a(\u2603, b);
        this.a(\u2603, b.f());
        this.a(\u2603, b.d());
        this.a(\u2603, b.d().f());
        return true;
    }
    
    protected boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final int \u2603) {
        return this.c(\u2603, \u2603, \u2603) && this.a(\u2603, \u2603);
    }
    
    protected void a(final adm \u2603, final cj \u2603, final int \u2603) {
        final int n = \u2603 * \u2603;
        for (int i = -\u2603; i <= \u2603 + 1; ++i) {
            for (int j = -\u2603; j <= \u2603 + 1; ++j) {
                final int n2 = i - 1;
                final int n3 = j - 1;
                if (i * i + j * j <= n || n2 * n2 + n3 * n3 <= n || i * i + n3 * n3 <= n || n2 * n2 + j * j <= n) {
                    final cj a = \u2603.a(i, 0, j);
                    final arm t = \u2603.p(a).c().t();
                    if (t == arm.a || t == arm.j) {
                        this.a(\u2603, a, this.c);
                    }
                }
            }
        }
    }
    
    protected void b(final adm \u2603, final cj \u2603, final int \u2603) {
        final int n = \u2603 * \u2603;
        for (int i = -\u2603; i <= \u2603; ++i) {
            for (int j = -\u2603; j <= \u2603; ++j) {
                if (i * i + j * j <= n) {
                    final cj a = \u2603.a(i, 0, j);
                    final arm t = \u2603.p(a).c().t();
                    if (t == arm.a || t == arm.j) {
                        this.a(\u2603, a, this.c);
                    }
                }
            }
        }
    }
}
