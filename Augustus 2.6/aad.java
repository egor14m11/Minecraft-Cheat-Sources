// 
// Decompiled by Procyon v0.5.36
// 

public class aad extends zw
{
    private static final cr a;
    private final va.a b;
    
    public aad(final va.a \u2603) {
        this.h = 1;
        this.b = \u2603;
        this.a(yz.e);
        agg.N.a(this, aad.a);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz p = \u2603.p(\u2603);
        if (afe.d(p)) {
            if (!\u2603.D) {
                final afe.b b = (p.c() instanceof afe) ? p.b(((afe)p.c()).n()) : afe.b.a;
                double n = 0.0;
                if (b.c()) {
                    n = 0.5;
                }
                final va a = va.a(\u2603, \u2603.n() + 0.5, \u2603.o() + 0.0625 + n, \u2603.p() + 0.5, this.b);
                if (\u2603.s()) {
                    a.a(\u2603.q());
                }
                \u2603.d(a);
            }
            --\u2603.b;
            return true;
        }
        return false;
    }
    
    static {
        a = new cn() {
            private final cn b = new cn();
            
            public zx b(final ck \u2603, final zx \u2603) {
                final cq b = agg.b(\u2603.f());
                final adm i = \u2603.i();
                final double \u26032 = \u2603.a() + b.g() * 1.125;
                final double n = Math.floor(\u2603.b()) + b.h();
                final double \u26033 = \u2603.c() + b.i() * 1.125;
                final cj a = \u2603.d().a(b);
                final alz p = i.p(a);
                final afe.b b2 = (p.c() instanceof afe) ? p.b(((afe)p.c()).n()) : afe.b.a;
                double n2;
                if (afe.d(p)) {
                    if (b2.c()) {
                        n2 = 0.6;
                    }
                    else {
                        n2 = 0.1;
                    }
                }
                else {
                    if (p.c().t() != arm.a || !afe.d(i.p(a.b()))) {
                        return this.b.a(\u2603, \u2603);
                    }
                    final alz p2 = i.p(a.b());
                    final afe.b b3 = (p2.c() instanceof afe) ? p2.b(((afe)p2.c()).n()) : afe.b.a;
                    if (b == cq.a || !b3.c()) {
                        n2 = -0.9;
                    }
                    else {
                        n2 = -0.4;
                    }
                }
                final va a2 = va.a(i, \u26032, n + n2, \u26033, ((aad)\u2603.b()).b);
                if (\u2603.s()) {
                    a2.a(\u2603.q());
                }
                i.d(a2);
                \u2603.a(1);
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                \u2603.i().b(1000, \u2603.d(), 0);
            }
        };
    }
}
