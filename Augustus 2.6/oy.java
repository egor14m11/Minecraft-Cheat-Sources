// 
// Decompiled by Procyon v0.5.36
// 

public class oy extends ox
{
    private pk r;
    
    public oy(final String \u2603, final pk \u2603, final pk \u2603) {
        super(\u2603, \u2603);
        this.r = \u2603;
    }
    
    @Override
    public pk i() {
        return this.q;
    }
    
    @Override
    public pk j() {
        return this.r;
    }
    
    @Override
    public eu b(final pr \u2603) {
        final eu eu = (this.r == null) ? this.q.f_() : this.r.f_();
        final zx zx = (this.r instanceof pr) ? ((pr)this.r).bA() : null;
        final String string = "death.attack." + this.p;
        final String string2 = string + ".item";
        if (zx != null && zx.s() && di.c(string2)) {
            return new fb(string2, new Object[] { \u2603.f_(), eu, zx.C() });
        }
        return new fb(string, new Object[] { \u2603.f_(), eu });
    }
}
