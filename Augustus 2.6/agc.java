import java.util.List;
import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agc extends afe
{
    public static final amm<b> b;
    public static final amk N;
    
    public agc() {
        super(true);
        this.j(this.M.b().a((amo<Comparable>)agc.N, false).a(agc.b, afe.b.a));
        this.a(true);
    }
    
    @Override
    public int a(final adm \u2603) {
        return 20;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.b((amo<Boolean>)agc.N)) {
            return;
        }
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D || !\u2603.b((amo<Boolean>)agc.N)) {
            return;
        }
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return \u2603.b((amo<Boolean>)agc.N) ? 15 : 0;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!\u2603.b((amo<Boolean>)agc.N)) {
            return 0;
        }
        return (\u2603 == cq.b) ? 15 : 0;
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        final boolean booleanValue = \u2603.b((amo<Boolean>)agc.N);
        boolean b = false;
        final List<va> a = this.a(\u2603, \u2603, va.class, (Predicate<pk>[])new Predicate[0]);
        if (!a.isEmpty()) {
            b = true;
        }
        if (b && !booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)agc.N, true), 3);
            \u2603.c(\u2603, this);
            \u2603.c(\u2603.b(), this);
            \u2603.b(\u2603, \u2603);
        }
        if (!b && booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)agc.N, false), 3);
            \u2603.c(\u2603, this);
            \u2603.c(\u2603.b(), this);
            \u2603.b(\u2603, \u2603);
        }
        if (b) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
        \u2603.e(\u2603, this);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.c(\u2603, \u2603, \u2603);
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public amo<b> n() {
        return agc.b;
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).b((amo<Boolean>)agc.N)) {
            final List<vc> a = this.a(\u2603, \u2603, vc.class, (Predicate<pk>[])new Predicate[0]);
            if (!a.isEmpty()) {
                return a.get(0).j().j();
            }
            final List<va> a2 = this.a(\u2603, \u2603, va.class, po.c);
            if (!a2.isEmpty()) {
                return xi.b((og)a2.get(0));
            }
        }
        return 0;
    }
    
    protected <T extends va> List<T> a(final adm \u2603, final cj \u2603, final Class<T> \u2603, final Predicate<pk>... \u2603) {
        final aug a = this.a(\u2603);
        if (\u2603.length != 1) {
            return \u2603.a((Class<? extends T>)\u2603, a);
        }
        return \u2603.a((Class<? extends T>)\u2603, a, (Predicate<? super T>)\u2603[0]);
    }
    
    private aug a(final cj \u2603) {
        final float n = 0.2f;
        return new aug(\u2603.n() + 0.2f, \u2603.o(), \u2603.p() + 0.2f, \u2603.n() + 1 - 0.2f, \u2603.o() + 1 - 0.2f, \u2603.p() + 1 - 0.2f);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(agc.b, afe.b.a(\u2603 & 0x7)).a((amo<Comparable>)agc.N, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(agc.b).a();
        if (\u2603.b((amo<Boolean>)agc.N)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agc.b, agc.N });
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
