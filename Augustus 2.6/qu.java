// 
// Decompiled by Procyon v0.5.36
// 

public class qu extends qx
{
    private int g;
    private int h;
    
    public qu(final ps \u2603) {
        super(\u2603);
        this.h = -1;
    }
    
    @Override
    public boolean a() {
        if (!super.a()) {
            return false;
        }
        if (!this.a.o.Q().b("mobGriefing")) {
            return false;
        }
        final agh c = this.c;
        return !agh.f(this.a.o, this.b);
    }
    
    @Override
    public void c() {
        super.c();
        this.g = 0;
    }
    
    @Override
    public boolean b() {
        final double b = this.a.b(this.b);
        if (this.g <= 240) {
            final agh c = this.c;
            if (!agh.f(this.a.o, this.b) && b < 4.0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void d() {
        super.d();
        this.a.o.c(this.a.F(), this.b, -1);
    }
    
    @Override
    public void e() {
        super.e();
        if (this.a.bc().nextInt(20) == 0) {
            this.a.o.b(1010, this.b, 0);
        }
        ++this.g;
        final int n = (int)(this.g / 240.0f * 10.0f);
        if (n != this.h) {
            this.a.o.c(this.a.F(), this.b, n);
            this.h = n;
        }
        if (this.g == 240 && this.a.o.aa() == oj.d) {
            this.a.o.g(this.b);
            this.a.o.b(1012, this.b, 0);
            this.a.o.b(2001, this.b, afh.a(this.c));
        }
    }
}
