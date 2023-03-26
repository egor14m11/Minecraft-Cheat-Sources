// 
// Decompiled by Procyon v0.5.36
// 

public class sd extends rd
{
    private tp a;
    private double b;
    private double c;
    private double d;
    private double e;
    
    public sd(final tp \u2603, final double \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (this.a.co() || this.a.l == null) {
            return false;
        }
        final aui a = tc.a(this.a, 5, 4);
        if (a == null) {
            return false;
        }
        this.c = a.a;
        this.d = a.b;
        this.e = a.c;
        return true;
    }
    
    @Override
    public void c() {
        this.a.s().a(this.c, this.d, this.e, this.b);
    }
    
    @Override
    public boolean b() {
        return !this.a.s().m() && this.a.l != null;
    }
    
    @Override
    public void e() {
        if (this.a.bc().nextInt(50) == 0) {
            if (this.a.l instanceof wn) {
                final int cc = this.a.cC();
                final int ci = this.a.cI();
                if (ci > 0 && this.a.bc().nextInt(ci) < cc) {
                    this.a.h((wn)this.a.l);
                    this.a.o.a(this.a, (byte)7);
                    return;
                }
                this.a.u(5);
            }
            this.a.l.a((pk)null);
            this.a.l = null;
            this.a.cW();
            this.a.o.a(this.a, (byte)6);
        }
    }
}
