// 
// Decompiled by Procyon v0.5.36
// 

public class ru extends qx
{
    boolean g;
    int h;
    
    public ru(final ps \u2603, final boolean \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public boolean b() {
        return this.g && this.h > 0 && super.b();
    }
    
    @Override
    public void c() {
        this.h = 20;
        this.c.a(this.a.o, this.b, true);
    }
    
    @Override
    public void d() {
        if (this.g) {
            this.c.a(this.a.o, this.b, false);
        }
    }
    
    @Override
    public void e() {
        --this.h;
        super.e();
    }
}
