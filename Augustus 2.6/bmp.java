// 
// Decompiled by Procyon v0.5.36
// 

public class bmp extends bmi
{
    public double j;
    public double k;
    public static String l;
    
    public bmp(final String \u2603) {
        super(\u2603);
        bmp.l = \u2603;
    }
    
    @Override
    public void j() {
        final ave a = ave.A();
        if (a.f != null && a.h != null) {
            this.a(a.f, a.h.s, a.h.u, a.h.y, false, false);
        }
        else {
            this.a(null, 0.0, 0.0, 0.0, true, false);
        }
    }
    
    public void a(final adm \u2603, final double \u2603, final double \u2603, double \u2603, final boolean \u2603, final boolean \u2603) {
        if (this.a.isEmpty()) {
            return;
        }
        double j = 0.0;
        if (\u2603 != null && !\u2603) {
            final cj m = \u2603.M();
            final double x = m.n() - \u2603;
            final double y = m.p() - \u2603;
            \u2603 %= 360.0;
            j = -((\u2603 - 90.0) * 3.141592653589793 / 180.0 - Math.atan2(y, x));
            if (!\u2603.t.d()) {
                j = Math.random() * 3.1415927410125732 * 2.0;
            }
        }
        if (\u2603) {
            this.j = j;
        }
        else {
            double a;
            for (a = j - this.j; a < -3.141592653589793; a += 6.283185307179586) {}
            while (a >= 3.141592653589793) {
                a -= 6.283185307179586;
            }
            a = ns.a(a, -1.0, 1.0);
            this.k += a * 0.1;
            this.k *= 0.8;
            this.j += this.k;
        }
        int i;
        for (i = (int)((this.j / 6.283185307179586 + 1.0) * this.a.size()) % this.a.size(); i < 0; i = (i + this.a.size()) % this.a.size()) {}
        if (i != this.h) {
            this.h = i;
            bml.a(this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        }
    }
}
