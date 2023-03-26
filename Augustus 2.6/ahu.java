import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahu extends afh
{
    public static final amm<a> a;
    public static final amk b;
    
    protected ahu() {
        super(arm.q);
        this.j(this.M.b().a(ahu.a, ahu.a.e).a((amo<Comparable>)ahu.b, false));
        this.a(yz.d);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
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
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return a(\u2603, \u2603, \u2603.d());
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.values()) {
            if (a(\u2603, \u2603, \u26032)) {
                return true;
            }
        }
        return false;
    }
    
    protected static boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        return afn.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        final alz a = this.Q().a((amo<Comparable>)ahu.b, false);
        if (a(\u2603, \u2603, \u2603.d())) {
            return a.a(ahu.a, ahu.a.a(\u2603, \u2603.aP()));
        }
        for (final cq \u26032 : cq.c.a) {
            if (\u26032 != \u2603 && a(\u2603, \u2603, \u26032.d())) {
                return a.a(ahu.a, ahu.a.a(\u26032, \u2603.aP()));
            }
        }
        if (adm.a(\u2603, \u2603.b())) {
            return a.a(ahu.a, ahu.a.a(cq.b, \u2603.aP()));
        }
        return a;
    }
    
    public static int a(final cq \u2603) {
        switch (ahu$1.a[\u2603.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 2;
            }
            case 6: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (this.e(\u2603, \u2603, \u2603) && !a(\u2603, \u2603, \u2603.b(ahu.a).c().d())) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    private boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.d(\u2603, \u2603)) {
            return true;
        }
        this.b(\u2603, \u2603, \u2603, 0);
        \u2603.g(\u2603);
        return false;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        float n = 0.1875f;
        switch (ahu$1.b[\u2603.p(\u2603).b(ahu.a).ordinal()]) {
            case 1: {
                this.a(0.0f, 0.2f, 0.5f - n, n * 2.0f, 0.8f, 0.5f + n);
                break;
            }
            case 2: {
                this.a(1.0f - n * 2.0f, 0.2f, 0.5f - n, 1.0f, 0.8f, 0.5f + n);
                break;
            }
            case 3: {
                this.a(0.5f - n, 0.2f, 0.0f, 0.5f + n, 0.8f, n * 2.0f);
                break;
            }
            case 4: {
                this.a(0.5f - n, 0.2f, 1.0f - n * 2.0f, 0.5f + n, 0.8f, 1.0f);
                break;
            }
            case 5:
            case 6: {
                n = 0.25f;
                this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.6f, 0.5f + n);
                break;
            }
            case 7:
            case 8: {
                n = 0.25f;
                this.a(0.5f - n, 0.4f, 0.5f - n, 0.5f + n, 1.0f, 0.5f + n);
                break;
            }
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        \u2603 = \u2603.a((amo<Comparable>)ahu.b);
        \u2603.a(\u2603, \u2603, 3);
        \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, ((boolean)\u2603.b((amo<Boolean>)ahu.b)) ? 0.6f : 0.5f);
        \u2603.c(\u2603, this);
        final cq c = \u2603.b(ahu.a).c();
        \u2603.c(\u2603.a(c.d()), this);
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.b((amo<Boolean>)ahu.b)) {
            \u2603.c(\u2603, this);
            final cq c = \u2603.b(ahu.a).c();
            \u2603.c(\u2603.a(c.d()), this);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return \u2603.b((amo<Boolean>)ahu.b) ? 15 : 0;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!\u2603.b((amo<Boolean>)ahu.b)) {
            return 0;
        }
        if (\u2603.b(ahu.a).c() == \u2603) {
            return 15;
        }
        return 0;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ahu.a, ahu.a.a(\u2603 & 0x7)).a((amo<Comparable>)ahu.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(ahu.a).a();
        if (\u2603.b((amo<Boolean>)ahu.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahu.a, ahu.b });
    }
    
    static {
        a = amm.a("facing", a.class);
        b = amk.a("powered");
    }
    
    public enum a implements nw
    {
        a(0, "down_x", cq.a), 
        b(1, "east", cq.f), 
        c(2, "west", cq.e), 
        d(3, "south", cq.d), 
        e(4, "north", cq.c), 
        f(5, "up_z", cq.b), 
        g(6, "up_x", cq.b), 
        h(7, "down_z", cq.a);
        
        private static final a[] i;
        private final int j;
        private final String k;
        private final cq l;
        
        private a(final int \u2603, final String \u2603, final cq \u2603) {
            this.j = \u2603;
            this.k = \u2603;
            this.l = \u2603;
        }
        
        public int a() {
            return this.j;
        }
        
        public cq c() {
            return this.l;
        }
        
        @Override
        public String toString() {
            return this.k;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.i.length) {
                \u2603 = 0;
            }
            return a.i[\u2603];
        }
        
        public static a a(final cq \u2603, final cq \u2603) {
            switch (ahu$1.a[\u2603.ordinal()]) {
                case 1: {
                    switch (ahu$1.c[\u2603.k().ordinal()]) {
                        case 1: {
                            return a.a;
                        }
                        case 2: {
                            return a.h;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid entityFacing " + \u2603 + " for facing " + \u2603);
                        }
                    }
                    break;
                }
                case 2: {
                    switch (ahu$1.c[\u2603.k().ordinal()]) {
                        case 1: {
                            return a.g;
                        }
                        case 2: {
                            return a.f;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid entityFacing " + \u2603 + " for facing " + \u2603);
                        }
                    }
                    break;
                }
                case 3: {
                    return a.e;
                }
                case 4: {
                    return a.d;
                }
                case 5: {
                    return a.c;
                }
                case 6: {
                    return a.b;
                }
                default: {
                    throw new IllegalArgumentException("Invalid facing: " + \u2603);
                }
            }
        }
        
        @Override
        public String l() {
            return this.k;
        }
        
        static {
            i = new a[values().length];
            for (final a a2 : values()) {
                a.i[a2.a()] = a2;
            }
        }
    }
}
