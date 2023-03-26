import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aed extends ady
{
    public aed(final int \u2603) {
        super(\u2603);
        this.au.clear();
        this.ak = afi.m.Q();
        this.al = afi.m.Q();
        this.as.A = -999;
        this.as.D = 2;
        this.as.F = 50;
        this.as.G = 10;
        this.au.clear();
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (\u2603.nextInt(1000) == 0) {
            final int \u26032 = \u2603.nextInt(16) + 8;
            final int \u26033 = \u2603.nextInt(16) + 8;
            final cj a = \u2603.m(\u2603.a(\u26032, 0, \u26033)).a();
            new aor().b(\u2603, \u2603, a);
        }
    }
}
