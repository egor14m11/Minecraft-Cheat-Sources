import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahe extends afh implements afj
{
    public static final amk a;
    
    protected ahe() {
        super(arm.b);
        this.j(this.M.b().a((amo<Comparable>)ahe.a, false));
        this.a(true);
        this.a(yz.b);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603.a()).c();
        return \u2603.a((amo<Comparable>)ahe.a, c == afi.aJ || c == afi.aH);
    }
    
    @Override
    public int H() {
        return adl.a(0.5, 1.0);
    }
    
    @Override
    public int h(final alz \u2603) {
        return this.H();
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return aea.a(\u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.l(\u2603.a()) < 4 && \u2603.p(\u2603.a()).c().p() > 2) {
            \u2603.a(\u2603, afi.d.Q());
            return;
        }
        if (\u2603.l(\u2603.a()) >= 9) {
            for (int i = 0; i < 4; ++i) {
                final cj a = \u2603.a(\u2603.nextInt(3) - 1, \u2603.nextInt(5) - 3, \u2603.nextInt(3) - 1);
                final afh c = \u2603.p(a.a()).c();
                final alz p = \u2603.p(a);
                if (p.c() == afi.d && p.b(agf.a) == agf.a.a && \u2603.l(a.a()) >= 4 && c.p() <= 2) {
                    \u2603.a(a, afi.c.Q());
                }
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return true;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        final cj a = \u2603.a();
        int i = 0;
    Label_0260_Outer:
        while (i < 128) {
            cj a2 = a;
            int j = 0;
            while (true) {
                while (j < i / 16) {
                    a2 = a2.a(\u2603.nextInt(3) - 1, (\u2603.nextInt(3) - 1) * \u2603.nextInt(3) / 2, \u2603.nextInt(3) - 1);
                    if (\u2603.p(a2.b()).c() == afi.c) {
                        if (!\u2603.p(a2).c().v()) {
                            ++j;
                            continue Label_0260_Outer;
                        }
                    }
                    ++i;
                    continue Label_0260_Outer;
                }
                if (\u2603.p(a2).c().J != arm.a) {
                    continue;
                }
                if (\u2603.nextInt(8) == 0) {
                    final agw.a a3 = \u2603.b(a2).a(\u2603, a2);
                    final agw a4 = a3.a().a();
                    final alz a5 = a4.Q().a(a4.n(), a3);
                    if (a4.f(\u2603, a2, a5)) {
                        \u2603.a(a2, a5, 3);
                    }
                    continue;
                }
                final alz a6 = afi.H.Q().a(akc.a, akc.a.b);
                if (afi.H.f(\u2603, a2, a6)) {
                    \u2603.a(a2, a6, 3);
                }
                continue;
            }
        }
    }
    
    @Override
    public adf m() {
        return adf.b;
    }
    
    @Override
    public int c(final alz \u2603) {
        return 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahe.a });
    }
    
    static {
        a = amk.a("snowy");
    }
}
