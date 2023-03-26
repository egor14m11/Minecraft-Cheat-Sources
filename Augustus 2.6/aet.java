import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aet extends ady
{
    protected aet(final int \u2603) {
        super(\u2603);
        this.as.A = 2;
        this.as.B = 1;
        this.as.D = 1;
        this.as.E = 8;
        this.as.F = 10;
        this.as.J = 1;
        this.as.z = 4;
        this.as.I = 0;
        this.as.H = 0;
        this.as.C = 5;
        this.ar = 14745518;
        this.at.add(new c(wb.class, 1, 1, 1));
    }
    
    @Override
    public aoh a(final Random \u2603) {
        return this.aC;
    }
    
    @Override
    public int b(final cj \u2603) {
        final double a = aet.af.a(\u2603.n() * 0.0225, \u2603.p() * 0.0225);
        if (a < -0.1) {
            return 5011004;
        }
        return 6975545;
    }
    
    @Override
    public int c(final cj \u2603) {
        return 6975545;
    }
    
    @Override
    public agw.a a(final Random \u2603, final cj \u2603) {
        return agw.a.c;
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        final double a = aet.af.a(\u2603 * 0.25, \u2603 * 0.25);
        if (a > 0.0) {
            final int n = \u2603 & 0xF;
            final int n2 = \u2603 & 0xF;
            int i = 255;
            while (i >= 0) {
                if (\u2603.a(n2, i, n).c().t() != arm.a) {
                    if (i != 62 || \u2603.a(n2, i, n).c() == afi.j) {
                        break;
                    }
                    \u2603.a(n2, i, n, afi.j.Q());
                    if (a < 0.12) {
                        \u2603.a(n2, i + 1, n, afi.bx.Q());
                        break;
                    }
                    break;
                }
                else {
                    --i;
                }
            }
        }
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
}
