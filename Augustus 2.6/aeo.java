import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aeo extends ady
{
    protected boolean aD;
    
    protected aeo(final int \u2603) {
        super(\u2603);
        this.a(0.8f, 0.4f);
        this.a(aeo.e);
        this.au.add(new c(tp.class, 5, 2, 6));
        this.as.A = -999;
        this.as.B = 4;
        this.as.C = 10;
    }
    
    @Override
    public agw.a a(final Random \u2603, final cj \u2603) {
        final double a = aeo.af.a(\u2603.n() / 200.0, \u2603.p() / 200.0);
        if (a < -0.8) {
            final int n = \u2603.nextInt(4);
            switch (n) {
                case 0: {
                    return agw.a.g;
                }
                case 1: {
                    return agw.a.f;
                }
                case 2: {
                    return agw.a.i;
                }
                default: {
                    return agw.a.h;
                }
            }
        }
        else {
            if (\u2603.nextInt(3) <= 0) {
                return agw.a.a;
            }
            final int n = \u2603.nextInt(3);
            if (n == 0) {
                return agw.a.b;
            }
            if (n == 1) {
                return agw.a.e;
            }
            return agw.a.j;
        }
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        final double a = aeo.af.a((\u2603.n() + 8) / 200.0, (\u2603.p() + 8) / 200.0);
        if (a < -0.8) {
            this.as.B = 15;
            this.as.C = 5;
        }
        else {
            this.as.B = 4;
            this.as.C = 10;
            aeo.ag.a(agi.b.c);
            for (int i = 0; i < 7; ++i) {
                final int n = \u2603.nextInt(16) + 8;
                final int n2 = \u2603.nextInt(16) + 8;
                final int n3 = \u2603.nextInt(\u2603.m(\u2603.a(n, 0, n2)).o() + 32);
                aeo.ag.b(\u2603, \u2603, \u2603.a(n, n3, n2));
            }
        }
        if (this.aD) {
            aeo.ag.a(agi.b.a);
            for (int i = 0; i < 10; ++i) {
                final int n = \u2603.nextInt(16) + 8;
                final int n2 = \u2603.nextInt(16) + 8;
                final int n3 = \u2603.nextInt(\u2603.m(\u2603.a(n, 0, n2)).o() + 32);
                aeo.ag.b(\u2603, \u2603, \u2603.a(n, n3, n2));
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected ady d(final int \u2603) {
        final aeo aeo = new aeo(\u2603);
        aeo.a("Sunflower Plains");
        aeo.aD = true;
        aeo.b(9286496);
        aeo.aj = 14273354;
        return aeo;
    }
}
