// 
// Decompiled by Procyon v0.5.36
// 

public abstract class awd extends awi
{
    public awd(final ave \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    protected boolean a(final int \u2603) {
        return false;
    }
    
    @Override
    protected void a() {
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.b(\u2603).a(\u2603, \u2603, \u2603, this.c(), \u2603, \u2603, \u2603, this.c(\u2603, \u2603) == \u2603);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        this.b(\u2603).a(\u2603, \u2603, \u2603);
    }
    
    public boolean b(final int \u2603, final int \u2603, final int \u2603) {
        if (this.g(\u2603)) {
            final int c = this.c(\u2603, \u2603);
            if (c >= 0) {
                final int n = this.g + (this.b / 2 - this.c() / 2 + 2);
                final int n2 = this.d + 4 - this.n() + (c * this.h + this.t);
                final int n3 = \u2603 - n;
                final int n4 = \u2603 - n2;
                if (this.b(c).a(c, \u2603, \u2603, \u2603, n3, n4)) {
                    this.d(false);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean c(final int \u2603, final int \u2603, final int \u2603) {
        for (int i = 0; i < this.b(); ++i) {
            final int n = this.g + (this.b / 2 - this.c() / 2 + 2);
            final int n2 = this.d + 4 - this.n() + (i * this.h + this.t);
            final int n3 = \u2603 - n;
            final int n4 = \u2603 - n2;
            this.b(i).b(i, \u2603, \u2603, \u2603, n3, n4);
        }
        this.d(true);
        return false;
    }
    
    public abstract a b(final int p0);
    
    public interface a
    {
        void a(final int p0, final int p1, final int p2);
        
        void a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final boolean p7);
        
        boolean a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
        
        void b(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    }
}
