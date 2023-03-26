import com.google.common.base.Objects;

// 
// Decompiled by Procyon v0.5.36
// 

public class df implements Comparable<df>
{
    public static final df b;
    private final int a;
    private final int c;
    private final int d;
    
    public df(final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public df(final double \u2603, final double \u2603, final double \u2603) {
        this(ns.c(\u2603), ns.c(\u2603), ns.c(\u2603));
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (!(\u2603 instanceof df)) {
            return false;
        }
        final df df = (df)\u2603;
        return this.n() == df.n() && this.o() == df.o() && this.p() == df.p();
    }
    
    @Override
    public int hashCode() {
        return (this.o() + this.p() * 31) * 31 + this.n();
    }
    
    public int g(final df \u2603) {
        if (this.o() != \u2603.o()) {
            return this.o() - \u2603.o();
        }
        if (this.p() == \u2603.p()) {
            return this.n() - \u2603.n();
        }
        return this.p() - \u2603.p();
    }
    
    public int n() {
        return this.a;
    }
    
    public int o() {
        return this.c;
    }
    
    public int p() {
        return this.d;
    }
    
    public df d(final df \u2603) {
        return new df(this.o() * \u2603.p() - this.p() * \u2603.o(), this.p() * \u2603.n() - this.n() * \u2603.p(), this.n() * \u2603.o() - this.o() * \u2603.n());
    }
    
    public double c(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.n() - \u2603;
        final double n2 = this.o() - \u2603;
        final double n3 = this.p() - \u2603;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double d(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.n() + 0.5 - \u2603;
        final double n2 = this.o() + 0.5 - \u2603;
        final double n3 = this.p() + 0.5 - \u2603;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double i(final df \u2603) {
        return this.c(\u2603.n(), \u2603.o(), \u2603.p());
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("x", this.n()).add("y", this.o()).add("z", this.p()).toString();
    }
    
    static {
        b = new df(0, 0, 0);
    }
}
