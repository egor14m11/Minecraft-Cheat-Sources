// 
// Decompiled by Procyon v0.5.36
// 

public class bca extends bcn
{
    public bca() {
        this(0.0f, false);
    }
    
    public bca(final float \u2603, final boolean \u2603) {
        super(\u2603, 0.0f, 64, 32);
        if (!\u2603) {
            (this.h = new bct(this, 40, 16)).a(-1.0f, -2.0f, -1.0f, 2, 12, 2, \u2603);
            this.h.a(-5.0f, 2.0f, 0.0f);
            this.i = new bct(this, 40, 16);
            this.i.i = true;
            this.i.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, \u2603);
            this.i.a(5.0f, 2.0f, 0.0f);
            (this.j = new bct(this, 0, 16)).a(-1.0f, 0.0f, -1.0f, 2, 12, 2, \u2603);
            this.j.a(-2.0f, 12.0f, 0.0f);
            this.k = new bct(this, 0, 16);
            this.k.i = true;
            this.k.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, \u2603);
            this.k.a(2.0f, 12.0f, 0.0f);
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.o = (((wa)\u2603).cm() == 1);
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
}
