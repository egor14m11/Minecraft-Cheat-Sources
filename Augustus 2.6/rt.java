// 
// Decompiled by Procyon v0.5.36
// 

public class rt extends rd
{
    private ty a;
    private wi b;
    private int c;
    
    public rt(final ty \u2603) {
        this.a = \u2603;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        if (!this.a.o.w()) {
            return false;
        }
        if (this.a.bc().nextInt(8000) != 0) {
            return false;
        }
        this.b = this.a.o.a(wi.class, this.a.aR().b(6.0, 2.0, 6.0), (wi)this.a);
        return this.b != null;
    }
    
    @Override
    public boolean b() {
        return this.c > 0;
    }
    
    @Override
    public void c() {
        this.c = 400;
        this.a.a(true);
    }
    
    @Override
    public void d() {
        this.a.a(false);
        this.b = null;
    }
    
    @Override
    public void e() {
        this.a.p().a(this.b, 30.0f, 30.0f);
        --this.c;
    }
}
