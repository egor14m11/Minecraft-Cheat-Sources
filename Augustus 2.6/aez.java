import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aez extends agr
{
    public static final aml a;
    public static final amn b;
    
    protected aez() {
        super(arm.g);
        this.j(this.M.b().a((amo<Comparable>)aez.a, cq.c).a((amo<Comparable>)aez.b, 0));
        this.e(0);
        this.a(yz.c);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        final cq e = \u2603.aP().e();
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603).a((amo<Comparable>)aez.a, e).a((amo<Comparable>)aez.b, \u2603 >> 2);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.D) {
            \u2603.a(new a(\u2603, \u2603));
        }
        return true;
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b((amo<Integer>)aez.b);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final cq cq = \u2603.p(\u2603).b((amo<cq>)aez.a);
        if (cq.k() == cq.a.a) {
            this.a(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        }
        else {
            this.a(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
        \u2603.add(new zx(\u2603, 1, 1));
        \u2603.add(new zx(\u2603, 1, 2));
    }
    
    @Override
    protected void a(final uy \u2603) {
        \u2603.a(true);
    }
    
    @Override
    public void a_(final adm \u2603, final cj \u2603) {
        \u2603.b(1022, \u2603, 0);
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    @Override
    public alz b(final alz \u2603) {
        return this.Q().a((amo<Comparable>)aez.a, cq.d);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aez.a, cq.b(\u2603 & 0x3)).a((amo<Comparable>)aez.b, (\u2603 & 0xF) >> 2);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)aez.a).b();
        n |= \u2603.b((amo<Integer>)aez.b) << 2;
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aez.a, aez.b });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amn.a("damage", 0, 2);
    }
    
    public static class a implements ol
    {
        private final adm a;
        private final cj b;
        
        public a(final adm \u2603, final cj \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public String e_() {
            return "anvil";
        }
        
        @Override
        public boolean l_() {
            return false;
        }
        
        @Override
        public eu f_() {
            return new fb(afi.cf.a() + ".name", new Object[0]);
        }
        
        @Override
        public xi a(final wm \u2603, final wn \u2603) {
            return new xk(\u2603, this.a, this.b, \u2603);
        }
        
        @Override
        public String k() {
            return "minecraft:anvil";
        }
    }
}
