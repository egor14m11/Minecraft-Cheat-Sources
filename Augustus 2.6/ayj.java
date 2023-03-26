// 
// Decompiled by Procyon v0.5.36
// 

public class ayj extends axu
{
    private static final avh.a[] h;
    private axu i;
    protected String a;
    private avh r;
    public avb f;
    public long g;
    private ayi s;
    private avs t;
    
    public ayj(final axu \u2603, final avh \u2603) {
        this.a = "Controls";
        this.f = null;
        this.i = \u2603;
        this.r = \u2603;
    }
    
    @Override
    public void b() {
        this.s = new ayi(this, this.j);
        this.n.add(new avs(200, this.l / 2 - 155, this.m - 29, 150, 20, bnq.a("gui.done", new Object[0])));
        this.n.add(this.t = new avs(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, bnq.a("controls.resetAll", new Object[0])));
        this.a = bnq.a("controls.title", new Object[0]);
        int n = 0;
        for (final avh.a \u2603 : ayj.h) {
            if (\u2603.a()) {
                this.n.add(new awj(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), \u2603));
            }
            else {
                this.n.add(new awe(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), \u2603, this.r.c(\u2603)));
            }
            ++n;
        }
    }
    
    @Override
    public void k() {
        super.k();
        this.s.p();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 200) {
            this.j.a(this.i);
        }
        else if (\u2603.k == 201) {
            for (final avb avb : this.j.t.aw) {
                avb.b(avb.h());
            }
            avb.b();
        }
        else if (\u2603.k < 100 && \u2603 instanceof awe) {
            this.r.a(((awe)\u2603).c(), 1);
            \u2603.j = this.r.c(avh.a.a(\u2603.k));
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        if (this.f != null) {
            this.r.a(this.f, -100 + \u2603);
            this.f = null;
            avb.b();
        }
        else if (\u2603 != 0 || !this.s.b(\u2603, \u2603, \u2603)) {
            super.a(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 != 0 || !this.s.c(\u2603, \u2603, \u2603)) {
            super.b(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (this.f != null) {
            if (\u2603 == 1) {
                this.r.a(this.f, 0);
            }
            else if (\u2603 != 0) {
                this.r.a(this.f, \u2603);
            }
            else if (\u2603 > '\0') {
                this.r.a(this.f, \u2603 + '\u0100');
            }
            this.f = null;
            this.g = ave.J();
            avb.b();
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.s.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.a, this.l / 2, 8, 16777215);
        boolean b = true;
        for (final avb avb : this.r.aw) {
            if (avb.i() != avb.h()) {
                b = false;
                break;
            }
        }
        this.t.l = !b;
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        h = new avh.a[] { avh.a.a, avh.a.b, avh.a.y };
    }
}
