import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aei extends ady
{
    private boolean aD;
    private apb aE;
    private apa aF;
    
    public aei(final int \u2603, final boolean \u2603) {
        super(\u2603);
        this.aE = new apb();
        this.aF = new apa(4);
        this.aD = \u2603;
        if (\u2603) {
            this.ak = afi.aJ.Q();
        }
        this.au.clear();
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (this.aD) {
            for (int i = 0; i < 3; ++i) {
                final int n = \u2603.nextInt(16) + 8;
                final int n2 = \u2603.nextInt(16) + 8;
                this.aE.b(\u2603, \u2603, \u2603.m(\u2603.a(n, 0, n2)));
            }
            for (int i = 0; i < 2; ++i) {
                final int n = \u2603.nextInt(16) + 8;
                final int n2 = \u2603.nextInt(16) + 8;
                this.aF.b(\u2603, \u2603, \u2603.m(\u2603.a(n, 0, n2)));
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public aoh a(final Random \u2603) {
        return new aps(false);
    }
    
    @Override
    protected ady d(final int \u2603) {
        final ady a = new aei(\u2603, true).a(13828095, true).a(this.ah + " Spikes").c().a(0.0f, 0.5f).a(new a(this.an + 0.1f, this.ao + 0.1f));
        a.an = this.an + 0.3f;
        a.ao = this.ao + 0.4f;
        return a;
    }
}
