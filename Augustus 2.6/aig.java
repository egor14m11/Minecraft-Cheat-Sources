import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aig extends ahw
{
    public static final amm<aio.a> b;
    
    public aig() {
        this.j(this.M.b().a(aig.b, aio.a.e).a(aig.a, ahw.a.b));
    }
    
    @Override
    public arn g(final alz \u2603) {
        final aio.a a = \u2603.b(aig.b);
        switch (aig$2.b[\u2603.b(aig.a).ordinal()]) {
            default: {
                switch (aig$2.a[a.ordinal()]) {
                    default: {
                        return arn.m;
                    }
                    case 2: {
                        return aio.a.f.c();
                    }
                }
                break;
            }
            case 4: {
                return a.c();
            }
        }
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, aio.a.e.a() - 4));
        \u2603.add(new zx(\u2603, 1, aio.a.f.a() - 4));
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q().a(aig.b, aio.a.a((\u2603 & 0x3) + 4));
        switch (\u2603 & 0xC) {
            case 0: {
                alz = alz.a(aig.a, ahw.a.b);
                break;
            }
            case 4: {
                alz = alz.a(aig.a, ahw.a.a);
                break;
            }
            case 8: {
                alz = alz.a(aig.a, ahw.a.c);
                break;
            }
            default: {
                alz = alz.a(aig.a, ahw.a.d);
                break;
            }
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(aig.b).a() - 4;
        switch (aig$2.b[\u2603.b(aig.a).ordinal()]) {
            case 1: {
                n |= 0x4;
                break;
            }
            case 2: {
                n |= 0x8;
                break;
            }
            case 3: {
                n |= 0xC;
                break;
            }
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aig.b, aig.a });
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(zw.a(this), 1, \u2603.b(aig.b).a() - 4);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aig.b).a() - 4;
    }
    
    static {
        b = amm.a("variant", aio.a.class, new Predicate<aio.a>() {
            public boolean a(final aio.a \u2603) {
                return \u2603.a() >= 4;
            }
        });
    }
}
