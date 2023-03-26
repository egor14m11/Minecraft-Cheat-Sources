// 
// Decompiled by Procyon v0.5.36
// 

public class bep extends beb
{
    private pk a;
    private int az;
    private int aA;
    private cy aB;
    
    public bep(final adm \u2603, final pk \u2603, final cy \u2603) {
        super(\u2603, \u2603.s, \u2603.aR().b + \u2603.K / 2.0f, \u2603.u, \u2603.v, \u2603.w, \u2603.x);
        this.a = \u2603;
        this.aA = 3;
        this.aB = \u2603;
        this.t_();
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
    }
    
    @Override
    public void t_() {
        for (int i = 0; i < 16; ++i) {
            final double \u2603 = this.V.nextFloat() * 2.0f - 1.0f;
            final double n = this.V.nextFloat() * 2.0f - 1.0f;
            final double \u26032 = this.V.nextFloat() * 2.0f - 1.0f;
            if (\u2603 * \u2603 + n * n + \u26032 * \u26032 <= 1.0) {
                final double \u26033 = this.a.s + \u2603 * this.a.J / 4.0;
                final double \u26034 = this.a.aR().b + this.a.K / 2.0f + n * this.a.K / 4.0;
                final double \u26035 = this.a.u + \u26032 * this.a.J / 4.0;
                this.o.a(this.aB, false, \u26033, \u26034, \u26035, \u2603, n + 0.2, \u26032, new int[0]);
            }
        }
        ++this.az;
        if (this.az >= this.aA) {
            this.J();
        }
    }
    
    @Override
    public int a() {
        return 3;
    }
}
