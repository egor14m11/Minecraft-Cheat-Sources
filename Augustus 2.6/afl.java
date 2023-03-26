import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class afl extends afc
{
    public static final amk[] a;
    
    public afl() {
        super(arm.f);
        this.j(this.M.b().a((amo<Comparable>)afl.a[0], false).a((amo<Comparable>)afl.a[1], false).a((amo<Comparable>)afl.a[2], false));
    }
    
    @Override
    public String f() {
        return di.a("item.brewingStand.name");
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new akx();
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.j();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof akx) {
            \u2603.a((og)s);
            \u2603.b(na.M);
        }
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof akx) {
                ((akx)s).a(\u2603.q());
            }
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final double \u26032 = \u2603.n() + 0.4f + \u2603.nextFloat() * 0.2f;
        final double \u26033 = \u2603.o() + 0.7f + \u2603.nextFloat() * 0.3f;
        final double \u26034 = \u2603.p() + 0.4f + \u2603.nextFloat() * 0.2f;
        \u2603.a(cy.l, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof akx) {
            oi.a(\u2603, \u2603, (og)s);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bF;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.bF;
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return xi.a(\u2603.s(\u2603));
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q();
        for (int i = 0; i < 3; ++i) {
            alz = alz.a((amo<Comparable>)afl.a[i], (\u2603 & 1 << i) > 0);
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (\u2603.b((amo<Boolean>)afl.a[i])) {
                n |= 1 << i;
            }
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afl.a[0], afl.a[1], afl.a[2] });
    }
    
    static {
        a = new amk[] { amk.a("has_bottle_0"), amk.a("has_bottle_1"), amk.a("has_bottle_2") };
    }
}
