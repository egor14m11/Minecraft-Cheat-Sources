import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afa extends afc
{
    public static final aml a;
    public static final amn b;
    
    protected afa() {
        super(arm.d);
        final float n = 0.25f;
        final float \u2603 = 1.0f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, \u2603, 0.5f + n);
    }
    
    @Override
    public String f() {
        return di.a("item.banner.white.name");
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean g() {
        return true;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new aku();
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.cE;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.cE;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof aku) {
            final zx \u26032 = new zx(zy.cE, 1, ((aku)s).b());
            final dn dn = new dn();
            s.b(dn);
            dn.o("x");
            dn.o("y");
            dn.o("z");
            dn.o("id");
            \u26032.a("BlockEntityTag", dn);
            afh.a(\u2603, \u2603, \u26032);
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return !this.e(\u2603, \u2603) && super.d(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (\u2603 instanceof aku) {
            final aku aku = (aku)\u2603;
            final zx \u26032 = new zx(zy.cE, 1, ((aku)\u2603).b());
            final dn dn = new dn();
            aku.a(dn, aku.b(), aku.d());
            \u26032.a("BlockEntityTag", dn);
            afh.a(\u2603, \u2603, \u26032);
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603, null);
        }
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amn.a("rotation", 0, 15);
    }
    
    public static class b extends afa
    {
        public b() {
            this.j(this.M.b().a((amo<Comparable>)b.a, cq.c));
        }
        
        @Override
        public void a(final adq \u2603, final cj \u2603) {
            final cq cq = \u2603.p(\u2603).b((amo<cq>)b.a);
            final float n = 0.0f;
            final float n2 = 0.78125f;
            final float n3 = 0.0f;
            final float n4 = 1.0f;
            final float n5 = 0.125f;
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            switch (afa$1.a[cq.ordinal()]) {
                default: {
                    this.a(n3, n, 1.0f - n5, n4, n2, 1.0f);
                    break;
                }
                case 2: {
                    this.a(n3, n, 0.0f, n4, n2, n5);
                    break;
                }
                case 3: {
                    this.a(1.0f - n5, n, n3, 1.0f, n2, n4);
                    break;
                }
                case 4: {
                    this.a(0.0f, n, n3, n5, n2, n4);
                    break;
                }
            }
        }
        
        @Override
        public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
            final cq cq = \u2603.b((amo<cq>)b.a);
            if (!\u2603.p(\u2603.a(cq.d())).c().t().a()) {
                this.b(\u2603, \u2603, \u2603, 0);
                \u2603.g(\u2603);
            }
            super.a(\u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        public alz a(final int \u2603) {
            cq cq = cq.a(\u2603);
            if (cq.k() == cq.a.b) {
                cq = cq.c;
            }
            return this.Q().a((amo<Comparable>)b.a, cq);
        }
        
        @Override
        public int c(final alz \u2603) {
            return \u2603.b((amo<cq>)b.a).a();
        }
        
        @Override
        protected ama e() {
            return new ama(this, new amo[] { b.a });
        }
    }
    
    public static class a extends afa
    {
        public a() {
            this.j(this.M.b().a((amo<Comparable>)a.b, 0));
        }
        
        @Override
        public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
            if (!\u2603.p(\u2603.b()).c().t().a()) {
                this.b(\u2603, \u2603, \u2603, 0);
                \u2603.g(\u2603);
            }
            super.a(\u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        public alz a(final int \u2603) {
            return this.Q().a((amo<Comparable>)a.b, \u2603);
        }
        
        @Override
        public int c(final alz \u2603) {
            return \u2603.b((amo<Integer>)a.b);
        }
        
        @Override
        protected ama e() {
            return new ama(this, new amo[] { a.b });
        }
    }
}
