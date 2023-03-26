// 
// Decompiled by Procyon v0.5.36
// 

public class asy
{
    private asu a;
    private asv[] b;
    private asw c;
    
    public asy(final asw \u2603) {
        this.a = new asu();
        this.b = new asv[32];
        this.c = \u2603;
    }
    
    public asx a(final adq \u2603, final pk \u2603, final pk \u2603, final float \u2603) {
        return this.a(\u2603, \u2603, \u2603.s, \u2603.aR().b, \u2603.u, \u2603);
    }
    
    public asx a(final adq \u2603, final pk \u2603, final cj \u2603, final float \u2603) {
        return this.a(\u2603, \u2603, \u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, \u2603);
    }
    
    private asx a(final adq \u2603, final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        this.a.a();
        this.c.a(\u2603, \u2603);
        final asv a = this.c.a(\u2603);
        final asv a2 = this.c.a(\u2603, \u2603, \u2603, \u2603);
        final asx a3 = this.a(\u2603, a, a2, \u2603);
        this.c.a();
        return a3;
    }
    
    private asx a(final pk \u2603, final asv \u2603, final asv \u2603, final float \u2603) {
        \u2603.e = 0.0f;
        \u2603.f = \u2603.b(\u2603);
        \u2603.g = \u2603.f;
        this.a.a();
        this.a.a(\u2603);
        asv \u26032 = \u2603;
        while (!this.a.e()) {
            final asv c = this.a.c();
            if (c.equals(\u2603)) {
                return this.a(\u2603, \u2603);
            }
            if (c.b(\u2603) < \u26032.b(\u2603)) {
                \u26032 = c;
            }
            c.i = true;
            for (int a = this.c.a(this.b, \u2603, c, \u2603, \u2603), i = 0; i < a; ++i) {
                final asv \u26033 = this.b[i];
                final float e = c.e + c.b(\u26033);
                if (e < \u2603 * 2.0f && (!\u26033.a() || e < \u26033.e)) {
                    \u26033.h = c;
                    \u26033.e = e;
                    \u26033.f = \u26033.b(\u2603);
                    if (\u26033.a()) {
                        this.a.a(\u26033, \u26033.e + \u26033.f);
                    }
                    else {
                        \u26033.g = \u26033.e + \u26033.f;
                        this.a.a(\u26033);
                    }
                }
            }
        }
        if (\u26032 == \u2603) {
            return null;
        }
        return this.a(\u2603, \u26032);
    }
    
    private asx a(final asv \u2603, final asv \u2603) {
        int n = 1;
        for (asv asv = \u2603; asv.h != null; asv = asv.h) {
            ++n;
        }
        final asv[] \u26032 = new asv[n];
        asv asv = \u2603;
        \u26032[--n] = asv;
        while (asv.h != null) {
            asv = asv.h;
            \u26032[--n] = asv;
        }
        return new asx(\u26032);
    }
}
