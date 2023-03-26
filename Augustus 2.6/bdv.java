// 
// Decompiled by Procyon v0.5.36
// 

public class bdv extends beb
{
    private int a;
    private int az;
    
    protected bdv(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.az = 8;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
    }
    
    @Override
    public void t_() {
        for (int i = 0; i < 6; ++i) {
            final double \u2603 = this.s + (this.V.nextDouble() - this.V.nextDouble()) * 4.0;
            final double \u26032 = this.t + (this.V.nextDouble() - this.V.nextDouble()) * 4.0;
            final double \u26033 = this.u + (this.V.nextDouble() - this.V.nextDouble()) * 4.0;
            this.o.a(cy.b, \u2603, \u26032, \u26033, this.a / (float)this.az, 0.0, 0.0, new int[0]);
        }
        ++this.a;
        if (this.a == this.az) {
            this.J();
        }
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdv(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
