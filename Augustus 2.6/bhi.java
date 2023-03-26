// 
// Decompiled by Procyon v0.5.36
// 

public class bhi extends bhd<alu>
{
    private final bgd c;
    
    public bhi() {
        this.c = ave.A().ae();
    }
    
    @Override
    public void a(final alu \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final cj v = \u2603.v();
        alz alz = \u2603.b();
        final afh c = alz.c();
        if (c.t() == arm.a || \u2603.a(\u2603) >= 1.0f) {
            return;
        }
        final bfx a = bfx.a();
        final bfd c2 = a.c();
        this.a(bmh.g);
        avc.a();
        bfl.b(770, 771);
        bfl.l();
        bfl.p();
        if (ave.x()) {
            bfl.j(7425);
        }
        else {
            bfl.j(7424);
        }
        c2.a(7, bms.a);
        c2.c((float)\u2603 - v.n() + \u2603.b(\u2603), (float)\u2603 - v.o() + \u2603.c(\u2603), (double)((float)\u2603 - v.p() + \u2603.d(\u2603)));
        final adm b = this.b();
        if (c == afi.K && \u2603.a(\u2603) < 0.5f) {
            alz = alz.a((amo<Comparable>)alt.N, true);
            this.c.b().a(b, this.c.a(alz, b, v), alz, v, c2, true);
        }
        else if (\u2603.g() && !\u2603.d()) {
            final alt.a a2 = (c == afi.F) ? alt.a.b : alt.a.a;
            alz alz2 = afi.K.Q().a(alt.b, a2).a((amo<Comparable>)alt.a, (Comparable)alz.b((amo<V>)als.a));
            alz2 = alz2.a((amo<Comparable>)alt.N, \u2603.a(\u2603) >= 0.5f);
            this.c.b().a(b, this.c.a(alz2, b, v), alz2, v, c2, true);
            c2.c((float)\u2603 - v.n(), (float)\u2603 - v.o(), (double)((float)\u2603 - v.p()));
            alz.a((amo<Comparable>)als.b, true);
            this.c.b().a(b, this.c.a(alz, b, v), alz, v, c2, true);
        }
        else {
            this.c.b().a(b, this.c.a(alz, b, v), alz, v, c2, false);
        }
        c2.c(0.0, 0.0, 0.0);
        a.b();
        avc.b();
    }
}
