import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afw extends afc
{
    public static final amk a;
    
    public afw() {
        super(arm.f, arn.q);
        this.j(this.M.b().a((amo<Comparable>)afw.a, false));
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new akz();
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!\u2603.D) {
            final boolean z = \u2603.z(\u2603);
            final boolean booleanValue = \u2603.b((amo<Boolean>)afw.a);
            if (z && !booleanValue) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)afw.a, true), 4);
                \u2603.a(\u2603, this, this.a(\u2603));
            }
            else if (!z && booleanValue) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)afw.a, false), 4);
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof akz) {
            ((akz)s).b().a(\u2603);
            \u2603.e(\u2603, this);
        }
    }
    
    @Override
    public int a(final adm \u2603) {
        return 1;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final akw s = \u2603.s(\u2603);
        return s instanceof akz && ((akz)s).b().a(\u2603);
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof akz) {
            return ((akz)s).b().j();
        }
        return 0;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        final akw s = \u2603.s(\u2603);
        if (!(s instanceof akz)) {
            return;
        }
        final adc b = ((akz)s).b();
        if (\u2603.s()) {
            b.b(\u2603.q());
        }
        if (!\u2603.D) {
            b.a(\u2603.Q().b("sendCommandFeedback"));
        }
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afw.a, (\u2603 & 0x1) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        if (\u2603.b((amo<Boolean>)afw.a)) {
            n |= 0x1;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afw.a });
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)afw.a, false);
    }
    
    static {
        a = amk.a("triggered");
    }
}
