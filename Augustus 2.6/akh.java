import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class akh extends afh
{
    public static final aml a;
    public static final amk b;
    public static final amm<a> N;
    
    protected akh(final arm \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)akh.a, cq.c).a((amo<Comparable>)akh.b, false).a(akh.N, akh.a.b));
        final float n = 0.5f;
        final float n2 = 1.0f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.a(yz.d);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return !\u2603.p(\u2603).b((amo<Boolean>)akh.b);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.d(\u2603.p(\u2603));
    }
    
    @Override
    public void j() {
        final float n = 0.1875f;
        this.a(0.0f, 0.40625f, 0.0f, 1.0f, 0.59375f, 1.0f);
    }
    
    public void d(final alz \u2603) {
        if (\u2603.c() != this) {
            return;
        }
        final boolean b = \u2603.b(akh.N) == akh.a.a;
        final Boolean b2 = \u2603.b((amo<Boolean>)akh.b);
        final cq cq = \u2603.b((amo<cq>)akh.a);
        final float n = 0.1875f;
        if (b) {
            this.a(0.0f, 0.8125f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.1875f, 1.0f);
        }
        if (b2) {
            if (cq == cq.c) {
                this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
            }
            if (cq == cq.d) {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
            }
            if (cq == cq.e) {
                this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
            if (cq == cq.f) {
                this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
            }
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (this.J == arm.f) {
            return true;
        }
        \u2603 = \u2603.a((amo<Comparable>)akh.b);
        \u2603.a(\u2603, \u2603, 2);
        \u2603.a(\u2603, ((boolean)\u2603.b((amo<Boolean>)akh.b)) ? 1003 : 1006, \u2603, 0);
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.D) {
            return;
        }
        final cj a = \u2603.a(\u2603.b((amo<cq>)akh.a).d());
        if (!c(\u2603.p(a).c())) {
            \u2603.g(\u2603);
            this.b(\u2603, \u2603, \u2603, 0);
            return;
        }
        final boolean z = \u2603.z(\u2603);
        if (z || \u2603.i()) {
            final boolean booleanValue = \u2603.b((amo<Boolean>)akh.b);
            if (booleanValue != z) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)akh.b, z), 2);
                \u2603.a(null, z ? 1003 : 1006, \u2603, 0);
            }
        }
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        alz alz = this.Q();
        if (\u2603.k().c()) {
            alz = alz.a((amo<Comparable>)akh.a, \u2603).a((amo<Comparable>)akh.b, false);
            alz = alz.a(akh.N, (\u2603 > 0.5f) ? akh.a.a : akh.a.b);
        }
        return alz;
    }
    
    @Override
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return !\u2603.k().b() && c(\u2603.p(\u2603.a(\u2603.d())).c());
    }
    
    protected static cq b(final int \u2603) {
        switch (\u2603 & 0x3) {
            case 0: {
                return cq.c;
            }
            case 1: {
                return cq.d;
            }
            case 2: {
                return cq.e;
            }
            default: {
                return cq.f;
            }
        }
    }
    
    protected static int a(final cq \u2603) {
        switch (akh$1.a[\u2603.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            default: {
                return 3;
            }
        }
    }
    
    private static boolean c(final afh \u2603) {
        return (\u2603.J.k() && \u2603.d()) || \u2603 == afi.aX || \u2603 instanceof ahh || \u2603 instanceof aju;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)akh.a, b(\u2603)).a((amo<Comparable>)akh.b, (\u2603 & 0x4) != 0x0).a(akh.N, ((\u2603 & 0x8) == 0x0) ? akh.a.b : akh.a.a);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= a(\u2603.b((amo<cq>)akh.a));
        if (\u2603.b((amo<Boolean>)akh.b)) {
            n |= 0x4;
        }
        if (\u2603.b(akh.N) == akh.a.a) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akh.a, akh.b, akh.N });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amk.a("open");
        N = amm.a("half", a.class);
    }
    
    public enum a implements nw
    {
        a("top"), 
        b("bottom");
        
        private final String c;
        
        private a(final String \u2603) {
            this.c = \u2603;
        }
        
        @Override
        public String toString() {
            return this.c;
        }
        
        @Override
        public String l() {
            return this.c;
        }
    }
}
