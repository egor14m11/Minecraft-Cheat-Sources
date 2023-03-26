// 
// Decompiled by Procyon v0.5.36
// 

public class yp extends zw
{
    private afh a;
    
    public yp(final afh \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (c == afi.aH && p.b((amo<Integer>)ajp.a) < 1) {
            \u2603 = cq.b;
        }
        else if (!c.a(\u2603, \u2603)) {
            \u2603 = \u2603.a(\u2603);
        }
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (\u2603.b == 0) {
            return false;
        }
        if (\u2603.a(this.a, \u2603, false, \u2603, null, \u2603)) {
            alz alz = this.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0, \u2603);
            if (\u2603.a(\u2603, alz, 3)) {
                alz = \u2603.p(\u2603);
                if (alz.c() == this.a) {
                    yo.a(\u2603, \u2603, \u2603, \u2603);
                    alz.c().a(\u2603, \u2603, alz, \u2603, \u2603);
                }
                \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, this.a.H.b(), (this.a.H.d() + 1.0f) / 2.0f, this.a.H.e() * 0.8f);
                --\u2603.b;
                return true;
            }
        }
        return false;
    }
}
