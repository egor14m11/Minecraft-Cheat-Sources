// 
// Decompiled by Procyon v0.5.36
// 

public class ayb extends axu
{
    private axu f;
    protected String a;
    private avh g;
    private awd h;
    private static final avh.a[] i;
    
    public ayb(final axu \u2603, final avh \u2603) {
        this.a = "Video Settings";
        this.f = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void b() {
        this.a = bnq.a("options.videoTitle", new Object[0]);
        this.n.clear();
        this.n.add(new avs(200, this.l / 2 - 100, this.m - 27, bnq.a("gui.done", new Object[0])));
        if (!bqs.P) {
            final avh.a[] \u2603 = new avh.a[ayb.i.length - 1];
            int n = 0;
            for (final avh.a a : ayb.i) {
                if (a == avh.a.x) {
                    break;
                }
                \u2603[n] = a;
                ++n;
            }
            this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, \u2603);
        }
        else {
            this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, ayb.i);
        }
    }
    
    @Override
    public void k() {
        super.k();
        this.h.p();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 200) {
            this.j.t.b();
            this.j.a(this.f);
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        final int ak = this.g.aK;
        super.a(\u2603, \u2603, \u2603);
        this.h.b(\u2603, \u2603, \u2603);
        if (this.g.aK != ak) {
            final avr avr = new avr(this.j);
            final int a = avr.a();
            final int b = avr.b();
            this.a(this.j, a, b);
        }
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        final int ak = this.g.aK;
        super.b(\u2603, \u2603, \u2603);
        this.h.c(\u2603, \u2603, \u2603);
        if (this.g.aK != ak) {
            final avr avr = new avr(this.j);
            final int a = avr.a();
            final int b = avr.b();
            this.a(this.j, a, b);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.h.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.a, this.l / 2, 5, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        i = new avh.a[] { avh.a.l, avh.a.f, avh.a.m, avh.a.i, avh.a.h, avh.a.g, avh.a.n, avh.a.d, avh.a.k, avh.a.o, avh.a.v, avh.a.w, avh.a.D, avh.a.P, avh.a.x, avh.a.R };
    }
}
