import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aif extends ahs
{
    public static final amm<aio.a> Q;
    
    public aif() {
        this.j(this.M.b().a(aif.Q, aio.a.e).a((amo<Comparable>)aif.b, true).a((amo<Comparable>)aif.a, true));
    }
    
    @Override
    protected void a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
        if (\u2603.b(aif.Q) == aio.a.f && \u2603.s.nextInt(\u2603) == 0) {
            afh.a(\u2603, \u2603, new zx(zy.e, 1, 0));
        }
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aif.Q).a();
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        return p.c().c(p) & 0x3;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
        \u2603.add(new zx(\u2603, 1, 1));
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(zw.a(this), 1, \u2603.b(aif.Q).a() - 4);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aif.Q, this.b(\u2603)).a((amo<Comparable>)aif.a, (\u2603 & 0x4) == 0x0).a((amo<Comparable>)aif.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(aif.Q).a() - 4;
        if (!\u2603.b((amo<Boolean>)aif.a)) {
            n |= 0x4;
        }
        if (\u2603.b((amo<Boolean>)aif.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    public aio.a b(final int \u2603) {
        return aio.a.a((\u2603 & 0x3) + 4);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aif.Q, aif.b, aif.a });
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (!\u2603.D && \u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
            \u2603.b(na.ab[afh.a(this)]);
            afh.a(\u2603, \u2603, new zx(zw.a(this), 1, \u2603.b(aif.Q).a() - 4));
            return;
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    static {
        Q = amm.a("variant", aio.a.class, new Predicate<aio.a>() {
            public boolean a(final aio.a \u2603) {
                return \u2603.a() >= 4;
            }
        });
    }
}
