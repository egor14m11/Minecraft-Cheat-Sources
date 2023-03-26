import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aeg extends ady
{
    private int aG;
    protected static final aoj aD;
    protected static final aoj aE;
    protected static final apn aF;
    
    public aeg(final int \u2603, final int \u2603) {
        super(\u2603);
        this.aG = \u2603;
        this.as.A = 10;
        this.as.C = 2;
        if (this.aG == 1) {
            this.as.A = 6;
            this.as.B = 100;
            this.as.C = 1;
        }
        this.a(5159473);
        this.a(0.7f, 0.8f);
        if (this.aG == 2) {
            this.aj = 353825;
            this.ai = 3175492;
            this.a(0.6f, 0.6f);
        }
        if (this.aG == 0) {
            this.au.add(new c(ua.class, 5, 4, 4));
        }
        if (this.aG == 3) {
            this.as.A = -999;
        }
    }
    
    @Override
    protected ady a(final int \u2603, final boolean \u2603) {
        if (this.aG == 2) {
            this.aj = 353825;
            this.ai = \u2603;
            if (\u2603) {
                this.aj = (this.aj & 0xFEFEFE) >> 1;
            }
            return this;
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public aoh a(final Random \u2603) {
        if (this.aG == 3 && \u2603.nextInt(3) > 0) {
            return aeg.aF;
        }
        if (this.aG == 2 || \u2603.nextInt(5) == 0) {
            return aeg.aE;
        }
        return this.aA;
    }
    
    @Override
    public agw.a a(final Random \u2603, final cj \u2603) {
        if (this.aG != 1) {
            return super.a(\u2603, \u2603);
        }
        final double a = ns.a((1.0 + aeg.af.a(\u2603.n() / 48.0, \u2603.p() / 48.0)) / 2.0, 0.0, 0.9999);
        final agw.a a2 = agw.a.values()[(int)(a * agw.a.values().length)];
        if (a2 == agw.a.c) {
            return agw.a.b;
        }
        return a2;
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (this.aG == 3) {
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    final int nextInt = i * 4 + 1 + 8 + \u2603.nextInt(3);
                    final int k = j * 4 + 1 + 8 + \u2603.nextInt(3);
                    final cj m = \u2603.m(\u2603.a(nextInt, 0, k));
                    if (\u2603.nextInt(20) == 0) {
                        final aoz aoz = new aoz();
                        aoz.b(\u2603, \u2603, m);
                    }
                    else {
                        final aoh a = this.a(\u2603);
                        a.e();
                        if (a.b(\u2603, \u2603, m)) {
                            a.a(\u2603, \u2603, m);
                        }
                    }
                }
            }
        }
        int i = \u2603.nextInt(5) - 3;
        if (this.aG == 1) {
            i += 2;
        }
        for (int j = 0; j < i; ++j) {
            final int nextInt = \u2603.nextInt(3);
            if (nextInt == 0) {
                aeg.ag.a(agi.b.b);
            }
            else if (nextInt == 1) {
                aeg.ag.a(agi.b.e);
            }
            else if (nextInt == 2) {
                aeg.ag.a(agi.b.f);
            }
            for (int k = 0; k < 5; ++k) {
                final int \u26032 = \u2603.nextInt(16) + 8;
                final int \u26033 = \u2603.nextInt(16) + 8;
                final int nextInt2 = \u2603.nextInt(\u2603.m(\u2603.a(\u26032, 0, \u26033)).o() + 32);
                if (aeg.ag.b(\u2603, \u2603, new cj(\u2603.n() + \u26032, nextInt2, \u2603.p() + \u26033))) {
                    break;
                }
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int b(final cj \u2603) {
        final int b = super.b(\u2603);
        if (this.aG == 3) {
            return (b & 0xFEFEFE) + 2634762 >> 1;
        }
        return b;
    }
    
    @Override
    protected ady d(final int \u2603) {
        if (this.az == ady.t.az) {
            final aeg aeg = new aeg(\u2603, 1);
            aeg.a(new a(this.an, this.ao + 0.2f));
            aeg.a("Flower Forest");
            aeg.a(6976549, true);
            aeg.a(8233509);
            return aeg;
        }
        if (this.az == ady.Q.az || this.az == ady.R.az) {
            return new aem(\u2603, this) {
                @Override
                public aoh a(final Random \u2603) {
                    if (\u2603.nextBoolean()) {
                        return aeg.aD;
                    }
                    return aeg.aE;
                }
            };
        }
        return new aem(\u2603, this) {
            @Override
            public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
                this.aE.a(\u2603, \u2603, \u2603);
            }
        };
    }
    
    static {
        aD = new aoj(false, true);
        aE = new aoj(false, false);
        aF = new apn(false);
    }
}
