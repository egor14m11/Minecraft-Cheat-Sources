// 
// Decompiled by Procyon v0.5.36
// 

public class bcn extends bbj
{
    public bcn() {
        this(0.0f, false);
    }
    
    protected bcn(final float \u2603, final float \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    public bcn(final float \u2603, final boolean \u2603) {
        super(\u2603, 0.0f, 64, \u2603 ? 32 : 64);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final float a = ns.a(this.p * 3.1415927f);
        final float a2 = ns.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * 3.1415927f);
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.h.g = -(0.1f - a * 0.6f);
        this.i.g = 0.1f - a * 0.6f;
        this.h.f = -1.5707964f;
        this.i.f = -1.5707964f;
        final bct h = this.h;
        h.f -= a * 1.2f - a2 * 0.4f;
        final bct i = this.i;
        i.f -= a * 1.2f - a2 * 0.4f;
        final bct h2 = this.h;
        h2.h += ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
        final bct j = this.i;
        j.h -= ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
        final bct h3 = this.h;
        h3.f += ns.a(\u2603 * 0.067f) * 0.05f;
        final bct k = this.i;
        k.f -= ns.a(\u2603 * 0.067f) * 0.05f;
    }
}
