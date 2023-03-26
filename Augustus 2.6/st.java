import org.apache.commons.lang3.StringUtils;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class st extends rd
{
    protected final py e;
    protected boolean f;
    private boolean a;
    private int b;
    private int c;
    private int d;
    
    public st(final py \u2603, final boolean \u2603) {
        this(\u2603, \u2603, false);
    }
    
    public st(final py \u2603, final boolean \u2603, final boolean \u2603) {
        this.e = \u2603;
        this.f = \u2603;
        this.a = \u2603;
    }
    
    @Override
    public boolean b() {
        final pr u = this.e.u();
        if (u == null) {
            return false;
        }
        if (!u.ai()) {
            return false;
        }
        final auq bo = this.e.bO();
        final auq bo2 = u.bO();
        if (bo != null && bo2 == bo) {
            return false;
        }
        final double f = this.f();
        if (this.e.h(u) > f * f) {
            return false;
        }
        if (this.f) {
            if (this.e.t().a(u)) {
                this.d = 0;
            }
            else if (++this.d > 60) {
                return false;
            }
        }
        return !(u instanceof wn) || !((wn)u).bA.a;
    }
    
    protected double f() {
        final qc a = this.e.a(vy.b);
        return (a == null) ? 16.0 : a.e();
    }
    
    @Override
    public void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
    
    @Override
    public void d() {
        this.e.d((pr)null);
    }
    
    public static boolean a(final ps \u2603, final pr \u2603, final boolean \u2603, final boolean \u2603) {
        if (\u2603 == null) {
            return false;
        }
        if (\u2603 == \u2603) {
            return false;
        }
        if (!\u2603.ai()) {
            return false;
        }
        if (!\u2603.a(\u2603.getClass())) {
            return false;
        }
        final auq bo = \u2603.bO();
        final auq bo2 = \u2603.bO();
        if (bo != null && bo2 == bo) {
            return false;
        }
        if (\u2603 instanceof px && StringUtils.isNotEmpty(((px)\u2603).b())) {
            if (\u2603 instanceof px && ((px)\u2603).b().equals(((px)\u2603).b())) {
                return false;
            }
            if (\u2603 == ((px)\u2603).m_()) {
                return false;
            }
        }
        else if (\u2603 instanceof wn && !\u2603 && ((wn)\u2603).bA.a) {
            return false;
        }
        return !\u2603 || \u2603.t().a(\u2603);
    }
    
    protected boolean a(final pr \u2603, final boolean \u2603) {
        if (!a(this.e, \u2603, \u2603, this.f)) {
            return false;
        }
        if (!this.e.e(new cj(\u2603))) {
            return false;
        }
        if (this.a) {
            if (--this.c <= 0) {
                this.b = 0;
            }
            if (this.b == 0) {
                this.b = (this.a(\u2603) ? 1 : 2);
            }
            if (this.b == 2) {
                return false;
            }
        }
        return true;
    }
    
    private boolean a(final pr \u2603) {
        this.c = 10 + this.e.bc().nextInt(5);
        final asx a = this.e.s().a(\u2603);
        if (a == null) {
            return false;
        }
        final asv c = a.c();
        if (c == null) {
            return false;
        }
        final int n = c.a - ns.c(\u2603.s);
        final int n2 = c.c - ns.c(\u2603.u);
        return n * n + n2 * n2 <= 2.25;
    }
}
