// 
// Decompiled by Procyon v0.5.36
// 

public class azz extends axu
{
    private static final avh.a[] a;
    private static final avh.a[] f;
    private final axu g;
    private final avh h;
    private String i;
    private String r;
    private int s;
    private boolean t;
    
    public azz(final axu \u2603, final avh \u2603) {
        this.t = false;
        this.g = \u2603;
        this.h = \u2603;
    }
    
    @Override
    public void b() {
        int n = 0;
        this.i = bnq.a("options.stream.title", new Object[0]);
        this.r = bnq.a("options.stream.chat.title", new Object[0]);
        for (final avh.a a : azz.a) {
            if (a.a()) {
                this.n.add(new awj(a.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a));
            }
            else {
                this.n.add(new awe(a.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a, this.h.c(a)));
            }
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.s = this.m / 6 + 24 * (n >> 1) + 6;
        n += 2;
        for (final avh.a a : azz.f) {
            if (a.a()) {
                this.n.add(new awj(a.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a));
            }
            else {
                this.n.add(new awe(a.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a, this.h.c(a)));
            }
            ++n;
        }
        this.n.add(new avs(200, this.l / 2 - 155, this.m / 6 + 168, 150, 20, bnq.a("gui.done", new Object[0])));
        final avs avs = new avs(201, this.l / 2 + 5, this.m / 6 + 168, 150, 20, bnq.a("options.stream.ingestSelection", new Object[0]));
        avs.l = ((this.j.Y().j() && this.j.Y().s().length > 0) || this.j.Y().w());
        this.n.add(avs);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k < 100 && \u2603 instanceof awe) {
            final avh.a c = ((awe)\u2603).c();
            this.h.a(c, 1);
            \u2603.j = this.h.c(avh.a.a(\u2603.k));
            if (this.j.Y().k() && c != avh.a.M && c != avh.a.N) {
                this.t = true;
            }
        }
        else if (\u2603 instanceof awj) {
            if (\u2603.k == avh.a.G.c()) {
                this.j.Y().p();
            }
            else if (\u2603.k == avh.a.H.c()) {
                this.j.Y().p();
            }
            else if (this.j.Y().k()) {
                this.t = true;
            }
        }
        if (\u2603.k == 200) {
            this.j.t.b();
            this.j.a(this.g);
        }
        else if (\u2603.k == 201) {
            this.j.t.b();
            this.j.a(new azy(this));
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.i, this.l / 2, 20, 16777215);
        this.a(this.q, this.r, this.l / 2, this.s, 16777215);
        if (this.t) {
            this.a(this.q, a.m + bnq.a("options.stream.changes", new Object[0]), this.l / 2, 20 + this.q.a, 16777215);
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = new avh.a[] { avh.a.F, avh.a.J, avh.a.I, avh.a.L, avh.a.G, avh.a.H, avh.a.O, avh.a.K };
        f = new avh.a[] { avh.a.M, avh.a.N };
    }
}
