import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aej extends ady
{
    private boolean aD;
    private static final alz aE;
    private static final alz aF;
    private static final alz aG;
    
    public aej(final int \u2603, final boolean \u2603) {
        super(\u2603);
        this.aD = \u2603;
        if (\u2603) {
            this.as.A = 2;
        }
        else {
            this.as.A = 50;
        }
        this.as.C = 25;
        this.as.B = 4;
        if (!\u2603) {
            this.at.add(new c(ts.class, 2, 1, 1));
        }
        this.au.add(new c(tn.class, 10, 4, 4));
    }
    
    @Override
    public aoh a(final Random \u2603) {
        if (\u2603.nextInt(10) == 0) {
            return this.aB;
        }
        if (\u2603.nextInt(2) == 0) {
            return new aov(aej.aE, aej.aG);
        }
        if (!this.aD && \u2603.nextInt(3) == 0) {
            return new ape(false, 10, 20, aej.aE, aej.aF);
        }
        return new apv(false, 4 + \u2603.nextInt(7), aej.aE, aej.aF, true);
    }
    
    @Override
    public aot b(final Random \u2603) {
        if (\u2603.nextInt(4) == 0) {
            return new apu(akc.a.c);
        }
        return new apu(akc.a.b);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        super.a(\u2603, \u2603, \u2603);
        final int n = \u2603.nextInt(16) + 8;
        int i = \u2603.nextInt(16) + 8;
        int nextInt = \u2603.nextInt(\u2603.m(\u2603.a(n, 0, i)).o() * 2);
        new aph().b(\u2603, \u2603, \u2603.a(n, nextInt, i));
        final apw apw = new apw();
        for (i = 0; i < 50; ++i) {
            nextInt = \u2603.nextInt(16) + 8;
            final int n2 = 128;
            final int \u26032 = \u2603.nextInt(16) + 8;
            apw.b(\u2603, \u2603, \u2603.a(nextInt, 128, \u26032));
        }
    }
    
    static {
        aE = afi.r.Q().a(ail.b, aio.a.d);
        aF = afi.t.Q().a(aik.Q, aio.a.d).a((amo<Comparable>)ahs.b, false);
        aG = afi.t.Q().a(aik.Q, aio.a.a).a((amo<Comparable>)ahs.b, false);
    }
}
