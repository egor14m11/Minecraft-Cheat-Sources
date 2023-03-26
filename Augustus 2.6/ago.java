import com.google.common.base.Predicate;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ago extends afh
{
    public static final aml a;
    public static final amk b;
    
    public ago() {
        super(arm.e, arn.C);
        this.j(this.M.b().a((amo<Comparable>)ago.a, cq.c).a((amo<Comparable>)ago.b, false));
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.p(\u2603).b((amo<Boolean>)ago.b)) {
            this.a(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        this.j();
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)ago.a, \u2603.aP().d()).a((amo<Comparable>)ago.b, false);
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).b((amo<Boolean>)ago.b)) {
            return 15;
        }
        return 0;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ago.b, (\u2603 & 0x4) != 0x0).a((amo<Comparable>)ago.a, cq.b(\u2603 & 0x3));
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)ago.a).b();
        if (\u2603.b((amo<Boolean>)ago.b)) {
            n |= 0x4;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ago.a, ago.b });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amk.a("eye");
    }
}
