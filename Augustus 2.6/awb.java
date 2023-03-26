// 
// Decompiled by Procyon v0.5.36
// 

public class awb extends avs
{
    private boolean o;
    private String p;
    private final awg.b q;
    
    public awb(final awg.b \u2603, final int \u2603, final int \u2603, final int \u2603, final String \u2603, final boolean \u2603) {
        super(\u2603, \u2603, \u2603, 150, 20, "");
        this.p = \u2603;
        this.o = \u2603;
        this.j = this.c();
        this.q = \u2603;
    }
    
    private String c() {
        return bnq.a(this.p, new Object[0]) + ": " + (this.o ? bnq.a("gui.yes", new Object[0]) : bnq.a("gui.no", new Object[0]));
    }
    
    public void b(final boolean \u2603) {
        this.o = \u2603;
        this.j = this.c();
        this.q.a(this.k, \u2603);
    }
    
    @Override
    public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
        if (super.c(\u2603, \u2603, \u2603)) {
            this.o = !this.o;
            this.j = this.c();
            this.q.a(this.k, this.o);
            return true;
        }
        return false;
    }
}
