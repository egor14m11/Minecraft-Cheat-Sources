import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aeu extends ady
{
    private static final apk aD;
    private static final aps aE;
    private static final apf aF;
    private static final apf aG;
    private static final aok aH;
    private int aI;
    
    public aeu(final int \u2603, final int \u2603) {
        super(\u2603);
        this.aI = \u2603;
        this.au.add(new c(ua.class, 8, 4, 4));
        this.as.A = 10;
        if (\u2603 == 1 || \u2603 == 2) {
            this.as.C = 7;
            this.as.D = 1;
            this.as.E = 3;
        }
        else {
            this.as.C = 1;
            this.as.E = 1;
        }
    }
    
    @Override
    public aoh a(final Random \u2603) {
        if ((this.aI == 1 || this.aI == 2) && \u2603.nextInt(3) == 0) {
            if (this.aI == 2 || \u2603.nextInt(13) == 0) {
                return aeu.aG;
            }
            return aeu.aF;
        }
        else {
            if (\u2603.nextInt(3) == 0) {
                return aeu.aD;
            }
            return aeu.aE;
        }
    }
    
    @Override
    public aot b(final Random \u2603) {
        if (\u2603.nextInt(5) > 0) {
            return new apu(akc.a.c);
        }
        return new apu(akc.a.b);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (this.aI == 1 || this.aI == 2) {
            for (int i = \u2603.nextInt(3), j = 0; j < i; ++j) {
                final int \u26032 = \u2603.nextInt(16) + 8;
                final int nextInt = \u2603.nextInt(16) + 8;
                final cj m = \u2603.m(\u2603.a(\u26032, 0, nextInt));
                aeu.aH.b(\u2603, \u2603, m);
            }
        }
        aeu.ag.a(agi.b.d);
        for (int i = 0; i < 7; ++i) {
            final int j = \u2603.nextInt(16) + 8;
            final int \u26032 = \u2603.nextInt(16) + 8;
            final int nextInt = \u2603.nextInt(\u2603.m(\u2603.a(j, 0, \u26032)).o() + 32);
            aeu.ag.b(\u2603, \u2603, \u2603.a(j, nextInt, \u26032));
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        if (this.aI == 1 || this.aI == 2) {
            this.ak = afi.c.Q();
            this.al = afi.d.Q();
            if (\u2603 > 1.75) {
                this.ak = afi.d.Q().a(agf.a, agf.a.b);
            }
            else if (\u2603 > -0.95) {
                this.ak = afi.d.Q().a(agf.a, agf.a.c);
            }
        }
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected ady d(final int \u2603) {
        if (this.az == ady.V.az) {
            return new aeu(\u2603, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25f, 0.8f).a(new a(this.an, this.ao));
        }
        return super.d(\u2603);
    }
    
    static {
        aD = new apk();
        aE = new aps(false);
        aF = new apf(false, false);
        aG = new apf(false, true);
        aH = new aok(afi.Y, 0);
    }
}
