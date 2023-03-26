import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajj extends afm implements afj
{
    public static final amm<aio.a> a;
    public static final amn b;
    
    protected ajj() {
        this.j(this.M.b().a(ajj.a, aio.a.a).a((amo<Comparable>)ajj.b, 0));
        final float n = 0.4f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 2.0f, 0.5f + n);
        this.a(yz.c);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + "." + aio.a.a.d() + ".name");
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        super.b(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.l(\u2603.a()) >= 9 && \u2603.nextInt(7) == 0) {
            this.d(\u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public void d(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.b((amo<Integer>)ajj.b) == 0) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)ajj.b), 4);
        }
        else {
            this.e(\u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public void e(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        aot aot = (\u2603.nextInt(10) == 0) ? new aoi(true) : new apv(true);
        int i = 0;
        int j = 0;
        boolean b = false;
        switch (ajj$1.a[\u2603.b(ajj.a).ordinal()]) {
            case 1: {
            Label_0163:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.a(\u2603, \u2603, i, j, aio.a.b)) {
                            aot = new apf(false, \u2603.nextBoolean());
                            b = true;
                            break Label_0163;
                        }
                    }
                }
                if (!b) {
                    j = (i = 0);
                    aot = new aps(true);
                    break;
                }
                break;
            }
            case 2: {
                aot = new aoj(true, false);
                break;
            }
            case 3: {
                final alz \u26032 = afi.r.Q().a(ail.b, aio.a.d);
                final alz a = afi.t.Q().a(aik.Q, aio.a.d).a((amo<Comparable>)ahs.b, false);
            Label_0321:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.a(\u2603, \u2603, i, j, aio.a.d)) {
                            aot = new ape(true, 10, 20, \u26032, a);
                            b = true;
                            break Label_0321;
                        }
                    }
                }
                if (!b) {
                    j = (i = 0);
                    aot = new apv(true, 4 + \u2603.nextInt(7), \u26032, a, false);
                    break;
                }
                break;
            }
            case 4: {
                aot = new app(true);
                break;
            }
            case 5: {
            Label_0434:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.a(\u2603, \u2603, i, j, aio.a.f)) {
                            aot = new apn(true);
                            b = true;
                            break Label_0434;
                        }
                    }
                }
                if (!b) {
                    return;
                }
                break;
            }
        }
        final alz \u26032 = afi.a.Q();
        if (b) {
            \u2603.a(\u2603.a(i, 0, j), \u26032, 4);
            \u2603.a(\u2603.a(i + 1, 0, j), \u26032, 4);
            \u2603.a(\u2603.a(i, 0, j + 1), \u26032, 4);
            \u2603.a(\u2603.a(i + 1, 0, j + 1), \u26032, 4);
        }
        else {
            \u2603.a(\u2603, \u26032, 4);
        }
        if (!aot.b(\u2603, \u2603, \u2603.a(i, 0, j))) {
            if (b) {
                \u2603.a(\u2603.a(i, 0, j), \u2603, 4);
                \u2603.a(\u2603.a(i + 1, 0, j), \u2603, 4);
                \u2603.a(\u2603.a(i, 0, j + 1), \u2603, 4);
                \u2603.a(\u2603.a(i + 1, 0, j + 1), \u2603, 4);
            }
            else {
                \u2603.a(\u2603, \u2603, 4);
            }
        }
    }
    
    private boolean a(final adm \u2603, final cj \u2603, final int \u2603, final int \u2603, final aio.a \u2603) {
        return this.a(\u2603, \u2603.a(\u2603, 0, \u2603), \u2603) && this.a(\u2603, \u2603.a(\u2603 + 1, 0, \u2603), \u2603) && this.a(\u2603, \u2603.a(\u2603, 0, \u2603 + 1), \u2603) && this.a(\u2603, \u2603.a(\u2603 + 1, 0, \u2603 + 1), \u2603);
    }
    
    public boolean a(final adm \u2603, final cj \u2603, final aio.a \u2603) {
        final alz p = \u2603.p(\u2603);
        return p.c() == this && p.b(ajj.a) == \u2603;
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajj.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final aio.a a : aio.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return true;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return \u2603.s.nextFloat() < 0.45;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        this.d(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajj.a, aio.a.a(\u2603 & 0x7)).a((amo<Comparable>)ajj.b, (\u2603 & 0x8) >> 3);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(ajj.a).a();
        n |= \u2603.b((amo<Integer>)ajj.b) << 3;
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajj.a, ajj.b });
    }
    
    static {
        a = amm.a("type", aio.a.class);
        b = amn.a("stage", 0, 1);
    }
}
