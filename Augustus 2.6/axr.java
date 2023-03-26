// 
// Decompiled by Procyon v0.5.36
// 

public class axr extends axu implements nu
{
    private String a;
    private String f;
    private int g;
    private boolean h;
    
    public axr() {
        this.a = "";
        this.f = "";
    }
    
    @Override
    public void a(final String \u2603) {
        this.b(\u2603);
    }
    
    @Override
    public void b(final String \u2603) {
        this.a = \u2603;
        this.c("Working...");
    }
    
    @Override
    public void c(final String \u2603) {
        this.f = \u2603;
        this.a(0);
    }
    
    @Override
    public void a(final int \u2603) {
        this.g = \u2603;
    }
    
    @Override
    public void a() {
        this.h = true;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        if (this.h) {
            if (!this.j.al()) {
                this.j.a((axu)null);
            }
            return;
        }
        this.c();
        this.a(this.q, this.a, this.l / 2, 70, 16777215);
        this.a(this.q, this.f + " " + this.g + "%", this.l / 2, 90, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
}
