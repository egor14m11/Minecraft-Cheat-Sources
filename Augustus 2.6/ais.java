import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class ais extends afe
{
    public static final amm<b> b;
    public static final amk N;
    
    protected ais() {
        super(true);
        this.j(this.M.b().a(ais.b, afe.b.a).a((amo<Comparable>)ais.N, false));
    }
    
    protected boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603, final int \u2603) {
        if (\u2603 >= 8) {
            return false;
        }
        int n = \u2603.n();
        int o = \u2603.o();
        int p = \u2603.p();
        boolean b = true;
        b b2 = \u2603.b(ais.b);
        switch (ais$2.a[b2.ordinal()]) {
            case 1: {
                if (\u2603) {
                    ++p;
                    break;
                }
                --p;
                break;
            }
            case 2: {
                if (\u2603) {
                    --n;
                    break;
                }
                ++n;
                break;
            }
            case 3: {
                if (\u2603) {
                    --n;
                }
                else {
                    ++n;
                    ++o;
                    b = false;
                }
                b2 = afe.b.b;
                break;
            }
            case 4: {
                if (\u2603) {
                    --n;
                    ++o;
                    b = false;
                }
                else {
                    ++n;
                }
                b2 = afe.b.b;
                break;
            }
            case 5: {
                if (\u2603) {
                    ++p;
                }
                else {
                    --p;
                    ++o;
                    b = false;
                }
                b2 = afe.b.a;
                break;
            }
            case 6: {
                if (\u2603) {
                    ++p;
                    ++o;
                    b = false;
                }
                else {
                    --p;
                }
                b2 = afe.b.a;
                break;
            }
        }
        return this.a(\u2603, new cj(n, o, p), \u2603, \u2603, b2) || (b && this.a(\u2603, new cj(n, o - 1, p), \u2603, \u2603, b2));
    }
    
    protected boolean a(final adm \u2603, final cj \u2603, final boolean \u2603, final int \u2603, final b \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return false;
        }
        final b b = p.b(ais.b);
        return (\u2603 != afe.b.b || (b != afe.b.a && b != afe.b.e && b != afe.b.f)) && (\u2603 != afe.b.a || (b != afe.b.b && b != afe.b.c && b != afe.b.d)) && p.b((amo<Boolean>)ais.N) && (\u2603.z(\u2603) || this.a(\u2603, \u2603, p, \u2603, \u2603 + 1));
    }
    
    @Override
    protected void b(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final boolean booleanValue = \u2603.b((amo<Boolean>)ais.N);
        final boolean b = \u2603.z(\u2603) || this.a(\u2603, \u2603, \u2603, true, 0) || this.a(\u2603, \u2603, \u2603, false, 0);
        if (b != booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)ais.N, b), 3);
            \u2603.c(\u2603.b(), this);
            if (\u2603.b(ais.b).c()) {
                \u2603.c(\u2603.a(), this);
            }
        }
    }
    
    @Override
    public amo<b> n() {
        return ais.b;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ais.b, afe.b.a(\u2603 & 0x7)).a((amo<Comparable>)ais.N, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(ais.b).a();
        if (\u2603.b((amo<Boolean>)ais.N)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ais.b, ais.N });
    }
    
    static {
        b = amm.a("shape", b.class, new Predicate<b>() {
            public boolean a(final b \u2603) {
                return \u2603 != afe.b.j && \u2603 != afe.b.i && \u2603 != afe.b.g && \u2603 != afe.b.h;
            }
        });
        N = amk.a("powered");
    }
}
