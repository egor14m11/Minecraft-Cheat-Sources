// 
// Decompiled by Procyon v0.5.36
// 

public class sl extends st
{
    ty a;
    pr b;
    
    public sl(final ty \u2603) {
        super(\u2603, false, true);
        this.a = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        final tf n = this.a.n();
        if (n == null) {
            return false;
        }
        this.b = n.b(this.a);
        if (this.b instanceof vn) {
            return false;
        }
        if (this.a(this.b, false)) {
            return true;
        }
        if (this.e.bc().nextInt(20) == 0) {
            this.b = n.c(this.a);
            return this.a(this.b, false);
        }
        return false;
    }
    
    @Override
    public void c() {
        this.a.d(this.b);
        super.c();
    }
}
