import com.google.common.base.Objects;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqe
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    public aqe() {
    }
    
    public aqe(final int[] \u2603) {
        if (\u2603.length == 6) {
            this.a = \u2603[0];
            this.b = \u2603[1];
            this.c = \u2603[2];
            this.d = \u2603[3];
            this.e = \u2603[4];
            this.f = \u2603[5];
        }
    }
    
    public static aqe a() {
        return new aqe(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public static aqe a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
        switch (aqe$1.a[\u2603.ordinal()]) {
            default: {
                return new aqe(\u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603);
            }
            case 1: {
                return new aqe(\u2603 + \u2603, \u2603 + \u2603, \u2603 - \u2603 + 1 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603);
            }
            case 2: {
                return new aqe(\u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603);
            }
            case 3: {
                return new aqe(\u2603 - \u2603 + 1 + \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603);
            }
            case 4: {
                return new aqe(\u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603, \u2603 + \u2603 - 1 + \u2603);
            }
        }
    }
    
    public static aqe a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return new aqe(Math.min(\u2603, \u2603), Math.min(\u2603, \u2603), Math.min(\u2603, \u2603), Math.max(\u2603, \u2603), Math.max(\u2603, \u2603), Math.max(\u2603, \u2603));
    }
    
    public aqe(final aqe \u2603) {
        this.a = \u2603.a;
        this.b = \u2603.b;
        this.c = \u2603.c;
        this.d = \u2603.d;
        this.e = \u2603.e;
        this.f = \u2603.f;
    }
    
    public aqe(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
    }
    
    public aqe(final df \u2603, final df \u2603) {
        this.a = Math.min(\u2603.n(), \u2603.n());
        this.b = Math.min(\u2603.o(), \u2603.o());
        this.c = Math.min(\u2603.p(), \u2603.p());
        this.d = Math.max(\u2603.n(), \u2603.n());
        this.e = Math.max(\u2603.o(), \u2603.o());
        this.f = Math.max(\u2603.p(), \u2603.p());
    }
    
    public aqe(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.f = \u2603;
        this.b = 1;
        this.e = 512;
    }
    
    public boolean a(final aqe \u2603) {
        return this.d >= \u2603.a && this.a <= \u2603.d && this.f >= \u2603.c && this.c <= \u2603.f && this.e >= \u2603.b && this.b <= \u2603.e;
    }
    
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return this.d >= \u2603 && this.a <= \u2603 && this.f >= \u2603 && this.c <= \u2603;
    }
    
    public void b(final aqe \u2603) {
        this.a = Math.min(this.a, \u2603.a);
        this.b = Math.min(this.b, \u2603.b);
        this.c = Math.min(this.c, \u2603.c);
        this.d = Math.max(this.d, \u2603.d);
        this.e = Math.max(this.e, \u2603.e);
        this.f = Math.max(this.f, \u2603.f);
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603) {
        this.a += \u2603;
        this.b += \u2603;
        this.c += \u2603;
        this.d += \u2603;
        this.e += \u2603;
        this.f += \u2603;
    }
    
    public boolean b(final df \u2603) {
        return \u2603.n() >= this.a && \u2603.n() <= this.d && \u2603.p() >= this.c && \u2603.p() <= this.f && \u2603.o() >= this.b && \u2603.o() <= this.e;
    }
    
    public df b() {
        return new df(this.d - this.a, this.e - this.b, this.f - this.c);
    }
    
    public int c() {
        return this.d - this.a + 1;
    }
    
    public int d() {
        return this.e - this.b + 1;
    }
    
    public int e() {
        return this.f - this.c + 1;
    }
    
    public df f() {
        return new cj(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
    }
    
    public ds g() {
        return new ds(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
}
