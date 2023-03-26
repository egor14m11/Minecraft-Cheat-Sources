// 
// Decompiled by Procyon v0.5.36
// 

public class bix extends biv<uy>
{
    public bix(final biu \u2603) {
        super(\u2603);
        this.c = 0.5f;
    }
    
    @Override
    public void a(final uy \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        if (\u2603.l() == null) {
            return;
        }
        this.a(bmh.g);
        final alz l = \u2603.l();
        final afh c = l.c();
        final cj cj = new cj(\u2603);
        final adm j = \u2603.j();
        if (l == j.p(cj) || c.b() == -1) {
            return;
        }
        if (c.b() != 3) {
            return;
        }
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        bfl.f();
        final bfx a = bfx.a();
        final bfd c2 = a.c();
        c2.a(7, bms.a);
        final int n = cj.n();
        final int o = cj.o();
        final int p = cj.p();
        c2.c(-n - 0.5f, -o, (double)(-p - 0.5f));
        final bgd ae = ave.A().ae();
        final boq a2 = ae.a(l, j, null);
        ae.b().a(j, a2, l, cj, c2, false);
        c2.c(0.0, 0.0, 0.0);
        a.b();
        bfl.e();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final uy \u2603) {
        return bmh.g;
    }
}
