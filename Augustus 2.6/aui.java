// 
// Decompiled by Procyon v0.5.36
// 

public class aui
{
    public final double a;
    public final double b;
    public final double c;
    
    public aui(double \u2603, double \u2603, double \u2603) {
        if (\u2603 == -0.0) {
            \u2603 = 0.0;
        }
        if (\u2603 == -0.0) {
            \u2603 = 0.0;
        }
        if (\u2603 == -0.0) {
            \u2603 = 0.0;
        }
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public aui(final df \u2603) {
        this(\u2603.n(), \u2603.o(), \u2603.p());
    }
    
    public aui a(final aui \u2603) {
        return new aui(\u2603.a - this.a, \u2603.b - this.b, \u2603.c - this.c);
    }
    
    public aui a() {
        final double n = ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
        if (n < 1.0E-4) {
            return new aui(0.0, 0.0, 0.0);
        }
        return new aui(this.a / n, this.b / n, this.c / n);
    }
    
    public double b(final aui \u2603) {
        return this.a * \u2603.a + this.b * \u2603.b + this.c * \u2603.c;
    }
    
    public aui c(final aui \u2603) {
        return new aui(this.b * \u2603.c - this.c * \u2603.b, this.c * \u2603.a - this.a * \u2603.c, this.a * \u2603.b - this.b * \u2603.a);
    }
    
    public aui d(final aui \u2603) {
        return this.a(\u2603.a, \u2603.b, \u2603.c);
    }
    
    public aui a(final double \u2603, final double \u2603, final double \u2603) {
        return this.b(-\u2603, -\u2603, -\u2603);
    }
    
    public aui e(final aui \u2603) {
        return this.b(\u2603.a, \u2603.b, \u2603.c);
    }
    
    public aui b(final double \u2603, final double \u2603, final double \u2603) {
        return new aui(this.a + \u2603, this.b + \u2603, this.c + \u2603);
    }
    
    public double f(final aui \u2603) {
        final double n = \u2603.a - this.a;
        final double n2 = \u2603.b - this.b;
        final double n3 = \u2603.c - this.c;
        return ns.a(n * n + n2 * n2 + n3 * n3);
    }
    
    public double g(final aui \u2603) {
        final double n = \u2603.a - this.a;
        final double n2 = \u2603.b - this.b;
        final double n3 = \u2603.c - this.c;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double b() {
        return ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
    }
    
    public aui a(final aui \u2603, final double \u2603) {
        final double n = \u2603.a - this.a;
        final double n2 = \u2603.b - this.b;
        final double n3 = \u2603.c - this.c;
        if (n * n < 1.0000000116860974E-7) {
            return null;
        }
        final double n4 = (\u2603 - this.a) / n;
        if (n4 < 0.0 || n4 > 1.0) {
            return null;
        }
        return new aui(this.a + n * n4, this.b + n2 * n4, this.c + n3 * n4);
    }
    
    public aui b(final aui \u2603, final double \u2603) {
        final double n = \u2603.a - this.a;
        final double n2 = \u2603.b - this.b;
        final double n3 = \u2603.c - this.c;
        if (n2 * n2 < 1.0000000116860974E-7) {
            return null;
        }
        final double n4 = (\u2603 - this.b) / n2;
        if (n4 < 0.0 || n4 > 1.0) {
            return null;
        }
        return new aui(this.a + n * n4, this.b + n2 * n4, this.c + n3 * n4);
    }
    
    public aui c(final aui \u2603, final double \u2603) {
        final double n = \u2603.a - this.a;
        final double n2 = \u2603.b - this.b;
        final double n3 = \u2603.c - this.c;
        if (n3 * n3 < 1.0000000116860974E-7) {
            return null;
        }
        final double n4 = (\u2603 - this.c) / n3;
        if (n4 < 0.0 || n4 > 1.0) {
            return null;
        }
        return new aui(this.a + n * n4, this.b + n2 * n4, this.c + n3 * n4);
    }
    
    @Override
    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
    
    public aui a(final float \u2603) {
        final float b = ns.b(\u2603);
        final float a = ns.a(\u2603);
        final double a2 = this.a;
        final double \u26032 = this.b * b + this.c * a;
        final double \u26033 = this.c * b - this.b * a;
        return new aui(a2, \u26032, \u26033);
    }
    
    public aui b(final float \u2603) {
        final float b = ns.b(\u2603);
        final float a = ns.a(\u2603);
        final double \u26032 = this.a * b + this.c * a;
        final double b2 = this.b;
        final double \u26033 = this.c * b - this.a * a;
        return new aui(\u26032, b2, \u26033);
    }
}
