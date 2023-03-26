// 
// Decompiled by Procyon v0.5.36
// 

public class ox extends ow
{
    protected pk q;
    private boolean r;
    
    public ox(final String \u2603, final pk \u2603) {
        super(\u2603);
        this.r = false;
        this.q = \u2603;
    }
    
    public ox v() {
        this.r = true;
        return this;
    }
    
    public boolean w() {
        return this.r;
    }
    
    @Override
    public pk j() {
        return this.q;
    }
    
    @Override
    public eu b(final pr \u2603) {
        final zx zx = (this.q instanceof pr) ? ((pr)this.q).bA() : null;
        final String string = "death.attack." + this.p;
        final String string2 = string + ".item";
        if (zx != null && zx.s() && di.c(string2)) {
            return new fb(string2, new Object[] { \u2603.f_(), this.q.f_(), zx.C() });
        }
        return new fb(string, new Object[] { \u2603.f_(), this.q.f_() });
    }
    
    @Override
    public boolean r() {
        return this.q != null && this.q instanceof pr && !(this.q instanceof wn);
    }
}
