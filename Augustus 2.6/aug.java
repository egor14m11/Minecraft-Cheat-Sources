// 
// Decompiled by Procyon v0.5.36
// 

public class aug
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    
    public aug(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this.a = Math.min(\u2603, \u2603);
        this.b = Math.min(\u2603, \u2603);
        this.c = Math.min(\u2603, \u2603);
        this.d = Math.max(\u2603, \u2603);
        this.e = Math.max(\u2603, \u2603);
        this.f = Math.max(\u2603, \u2603);
    }
    
    public aug(final cj \u2603, final cj \u2603) {
        this.a = \u2603.n();
        this.b = \u2603.o();
        this.c = \u2603.p();
        this.d = \u2603.n();
        this.e = \u2603.o();
        this.f = \u2603.p();
    }
    
    public aug a(final double \u2603, final double \u2603, final double \u2603) {
        double a = this.a;
        double b = this.b;
        double c = this.c;
        double d = this.d;
        double e = this.e;
        double f = this.f;
        if (\u2603 < 0.0) {
            a += \u2603;
        }
        else if (\u2603 > 0.0) {
            d += \u2603;
        }
        if (\u2603 < 0.0) {
            b += \u2603;
        }
        else if (\u2603 > 0.0) {
            e += \u2603;
        }
        if (\u2603 < 0.0) {
            c += \u2603;
        }
        else if (\u2603 > 0.0) {
            f += \u2603;
        }
        return new aug(a, b, c, d, e, f);
    }
    
    public aug b(final double \u2603, final double \u2603, final double \u2603) {
        final double \u26032 = this.a - \u2603;
        final double \u26033 = this.b - \u2603;
        final double \u26034 = this.c - \u2603;
        final double \u26035 = this.d + \u2603;
        final double \u26036 = this.e + \u2603;
        final double \u26037 = this.f + \u2603;
        return new aug(\u26032, \u26033, \u26034, \u26035, \u26036, \u26037);
    }
    
    public aug a(final aug \u2603) {
        final double min = Math.min(this.a, \u2603.a);
        final double min2 = Math.min(this.b, \u2603.b);
        final double min3 = Math.min(this.c, \u2603.c);
        final double max = Math.max(this.d, \u2603.d);
        final double max2 = Math.max(this.e, \u2603.e);
        final double max3 = Math.max(this.f, \u2603.f);
        return new aug(min, min2, min3, max, max2, max3);
    }
    
    public static aug a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        final double min = Math.min(\u2603, \u2603);
        final double min2 = Math.min(\u2603, \u2603);
        final double min3 = Math.min(\u2603, \u2603);
        final double max = Math.max(\u2603, \u2603);
        final double max2 = Math.max(\u2603, \u2603);
        final double max3 = Math.max(\u2603, \u2603);
        return new aug(min, min2, min3, max, max2, max3);
    }
    
    public aug c(final double \u2603, final double \u2603, final double \u2603) {
        return new aug(this.a + \u2603, this.b + \u2603, this.c + \u2603, this.d + \u2603, this.e + \u2603, this.f + \u2603);
    }
    
    public double a(final aug \u2603, double \u2603) {
        if (\u2603.e <= this.b || \u2603.b >= this.e || \u2603.f <= this.c || \u2603.c >= this.f) {
            return \u2603;
        }
        if (\u2603 > 0.0 && \u2603.d <= this.a) {
            final double n = this.a - \u2603.d;
            if (n < \u2603) {
                \u2603 = n;
            }
        }
        else if (\u2603 < 0.0 && \u2603.a >= this.d) {
            final double n = this.d - \u2603.a;
            if (n > \u2603) {
                \u2603 = n;
            }
        }
        return \u2603;
    }
    
    public double b(final aug \u2603, double \u2603) {
        if (\u2603.d <= this.a || \u2603.a >= this.d || \u2603.f <= this.c || \u2603.c >= this.f) {
            return \u2603;
        }
        if (\u2603 > 0.0 && \u2603.e <= this.b) {
            final double n = this.b - \u2603.e;
            if (n < \u2603) {
                \u2603 = n;
            }
        }
        else if (\u2603 < 0.0 && \u2603.b >= this.e) {
            final double n = this.e - \u2603.b;
            if (n > \u2603) {
                \u2603 = n;
            }
        }
        return \u2603;
    }
    
    public double c(final aug \u2603, double \u2603) {
        if (\u2603.d <= this.a || \u2603.a >= this.d || \u2603.e <= this.b || \u2603.b >= this.e) {
            return \u2603;
        }
        if (\u2603 > 0.0 && \u2603.f <= this.c) {
            final double n = this.c - \u2603.f;
            if (n < \u2603) {
                \u2603 = n;
            }
        }
        else if (\u2603 < 0.0 && \u2603.c >= this.f) {
            final double n = this.f - \u2603.c;
            if (n > \u2603) {
                \u2603 = n;
            }
        }
        return \u2603;
    }
    
    public boolean b(final aug \u2603) {
        return \u2603.d > this.a && \u2603.a < this.d && \u2603.e > this.b && \u2603.b < this.e && \u2603.f > this.c && \u2603.c < this.f;
    }
    
    public boolean a(final aui \u2603) {
        return \u2603.a > this.a && \u2603.a < this.d && \u2603.b > this.b && \u2603.b < this.e && \u2603.c > this.c && \u2603.c < this.f;
    }
    
    public double a() {
        final double n = this.d - this.a;
        final double n2 = this.e - this.b;
        final double n3 = this.f - this.c;
        return (n + n2 + n3) / 3.0;
    }
    
    public aug d(final double \u2603, final double \u2603, final double \u2603) {
        final double \u26032 = this.a + \u2603;
        final double \u26033 = this.b + \u2603;
        final double \u26034 = this.c + \u2603;
        final double \u26035 = this.d - \u2603;
        final double \u26036 = this.e - \u2603;
        final double \u26037 = this.f - \u2603;
        return new aug(\u26032, \u26033, \u26034, \u26035, \u26036, \u26037);
    }
    
    public auh a(final aui \u2603, final aui \u2603) {
        aui a = \u2603.a(\u2603, this.a);
        aui a2 = \u2603.a(\u2603, this.d);
        aui b = \u2603.b(\u2603, this.b);
        aui b2 = \u2603.b(\u2603, this.e);
        aui c = \u2603.c(\u2603, this.c);
        aui c2 = \u2603.c(\u2603, this.f);
        if (!this.b(a)) {
            a = null;
        }
        if (!this.b(a2)) {
            a2 = null;
        }
        if (!this.c(b)) {
            b = null;
        }
        if (!this.c(b2)) {
            b2 = null;
        }
        if (!this.d(c)) {
            c = null;
        }
        if (!this.d(c2)) {
            c2 = null;
        }
        aui aui = null;
        if (a != null) {
            aui = a;
        }
        if (a2 != null && (aui == null || \u2603.g(a2) < \u2603.g(aui))) {
            aui = a2;
        }
        if (b != null && (aui == null || \u2603.g(b) < \u2603.g(aui))) {
            aui = b;
        }
        if (b2 != null && (aui == null || \u2603.g(b2) < \u2603.g(aui))) {
            aui = b2;
        }
        if (c != null && (aui == null || \u2603.g(c) < \u2603.g(aui))) {
            aui = c;
        }
        if (c2 != null && (aui == null || \u2603.g(c2) < \u2603.g(aui))) {
            aui = c2;
        }
        if (aui == null) {
            return null;
        }
        cq \u26032 = null;
        if (aui == a) {
            \u26032 = cq.e;
        }
        else if (aui == a2) {
            \u26032 = cq.f;
        }
        else if (aui == b) {
            \u26032 = cq.a;
        }
        else if (aui == b2) {
            \u26032 = cq.b;
        }
        else if (aui == c) {
            \u26032 = cq.c;
        }
        else {
            \u26032 = cq.d;
        }
        return new auh(aui, \u26032);
    }
    
    private boolean b(final aui \u2603) {
        return \u2603 != null && \u2603.b >= this.b && \u2603.b <= this.e && \u2603.c >= this.c && \u2603.c <= this.f;
    }
    
    private boolean c(final aui \u2603) {
        return \u2603 != null && \u2603.a >= this.a && \u2603.a <= this.d && \u2603.c >= this.c && \u2603.c <= this.f;
    }
    
    private boolean d(final aui \u2603) {
        return \u2603 != null && \u2603.a >= this.a && \u2603.a <= this.d && \u2603.b >= this.b && \u2603.b <= this.e;
    }
    
    @Override
    public String toString() {
        return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
    }
    
    public boolean b() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
    }
}
