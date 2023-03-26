// 
// Decompiled by Procyon v0.5.36
// 

public class sr extends st
{
    qa a;
    pr b;
    private int c;
    
    public sr(final qa \u2603) {
        super(\u2603, false);
        this.a = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (!this.a.cl()) {
            return false;
        }
        final pr co = this.a.co();
        if (co == null) {
            return false;
        }
        this.b = co.bd();
        final int be = co.be();
        return be != this.c && this.a(this.b, false) && this.a.a(this.b, co);
    }
    
    @Override
    public void c() {
        this.e.d(this.b);
        final pr co = this.a.co();
        if (co != null) {
            this.c = co.be();
        }
        super.c();
    }
}
