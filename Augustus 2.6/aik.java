import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aik extends ahs
{
    public static final amm<aio.a> Q;
    
    public aik() {
        this.j(this.M.b().a(aik.Q, aio.a.a).a((amo<Comparable>)aik.b, true).a((amo<Comparable>)aik.a, true));
    }
    
    @Override
    public int h(final alz \u2603) {
        if (\u2603.c() != this) {
            return super.h(\u2603);
        }
        final aio.a a = \u2603.b(aik.Q);
        if (a == aio.a.b) {
            return adj.a();
        }
        if (a == aio.a.c) {
            return adj.b();
        }
        return super.h(\u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() == this) {
            final aio.a a = p.b(aik.Q);
            if (a == aio.a.b) {
                return adj.a();
            }
            if (a == aio.a.c) {
                return adj.b();
            }
        }
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
        if (\u2603.b(aik.Q) == aio.a.a && \u2603.s.nextInt(\u2603) == 0) {
            afh.a(\u2603, \u2603, new zx(zy.e, 1, 0));
        }
    }
    
    @Override
    protected int d(final alz \u2603) {
        if (\u2603.b(aik.Q) == aio.a.d) {
            return 40;
        }
        return super.d(\u2603);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, aio.a.a.a()));
        \u2603.add(new zx(\u2603, 1, aio.a.b.a()));
        \u2603.add(new zx(\u2603, 1, aio.a.c.a()));
        \u2603.add(new zx(\u2603, 1, aio.a.d.a()));
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(zw.a(this), 1, \u2603.b(aik.Q).a());
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aik.Q, this.b(\u2603)).a((amo<Comparable>)aik.a, (\u2603 & 0x4) == 0x0).a((amo<Comparable>)aik.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(aik.Q).a();
        if (!\u2603.b((amo<Boolean>)aik.a)) {
            n |= 0x4;
        }
        if (\u2603.b((amo<Boolean>)aik.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    public aio.a b(final int \u2603) {
        return aio.a.a((\u2603 & 0x3) % 4);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aik.Q, aik.b, aik.a });
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aik.Q).a();
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (!\u2603.D && \u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
            \u2603.b(na.ab[afh.a(this)]);
            afh.a(\u2603, \u2603, new zx(zw.a(this), 1, \u2603.b(aik.Q).a()));
            return;
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    static {
        Q = amm.a("variant", aio.a.class, new Predicate<aio.a>() {
            public boolean a(final aio.a \u2603) {
                return \u2603.a() < 4;
            }
        });
    }
}
