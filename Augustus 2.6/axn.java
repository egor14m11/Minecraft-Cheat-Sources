// 
// Decompiled by Procyon v0.5.36
// 

public class axn extends axu implements awx
{
    private static final avh.a[] f;
    private final axu g;
    private final avh h;
    private avs i;
    private awc r;
    protected String a;
    
    public axn(final axu \u2603, final avh \u2603) {
        this.a = "Options";
        this.g = \u2603;
        this.h = \u2603;
    }
    
    @Override
    public void b() {
        int n = 0;
        this.a = bnq.a("options.title", new Object[0]);
        for (final avh.a \u2603 : axn.f) {
            if (\u2603.a()) {
                this.n.add(new awj(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 - 12 + 24 * (n >> 1), \u2603));
            }
            else {
                final awe awe = new awe(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 - 12 + 24 * (n >> 1), \u2603, this.h.c(\u2603));
                this.n.add(awe);
            }
            ++n;
        }
        if (this.j.f != null) {
            final oj aa = this.j.f.aa();
            this.i = new avs(108, this.l / 2 - 155 + n % 2 * 160, this.m / 6 - 12 + 24 * (n >> 1), 150, 20, this.a(aa));
            this.n.add(this.i);
            if (this.j.F() && !this.j.f.P().t()) {
                this.i.a(this.i.b() - 20);
                this.r = new awc(109, this.i.h + this.i.b(), this.i.i);
                this.n.add(this.r);
                this.r.b(this.j.f.P().z());
                this.r.l = !this.r.c();
                this.i.l = !this.r.c();
            }
            else {
                this.i.l = false;
            }
        }
        this.n.add(new avs(110, this.l / 2 - 155, this.m / 6 + 48 - 6, 150, 20, bnq.a("options.skinCustomisation", new Object[0])));
        this.n.add(new avs(8675309, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, "Super Secret Settings...") {
            @Override
            public void a(final bpz \u2603) {
                final bpy a = \u2603.a(bpg.g, bpg.e, bpg.f, bpg.h, bpg.d);
                if (a != null) {
                    \u2603.a(bpf.a(a.c(), 0.5f));
                }
            }
        });
        this.n.add(new avs(106, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, bnq.a("options.sounds", new Object[0])));
        this.n.add(new avs(107, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, bnq.a("options.stream", new Object[0])));
        this.n.add(new avs(101, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, bnq.a("options.video", new Object[0])));
        this.n.add(new avs(100, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, bnq.a("options.controls", new Object[0])));
        this.n.add(new avs(102, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, bnq.a("options.language", new Object[0])));
        this.n.add(new avs(103, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, bnq.a("options.chat.title", new Object[0])));
        this.n.add(new avs(105, this.l / 2 - 155, this.m / 6 + 144 - 6, 150, 20, bnq.a("options.resourcepack", new Object[0])));
        this.n.add(new avs(104, this.l / 2 + 5, this.m / 6 + 144 - 6, 150, 20, bnq.a("options.snooper.view", new Object[0])));
        this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.done", new Object[0])));
    }
    
    public String a(final oj \u2603) {
        final eu eu = new fa("");
        eu.a(new fb("options.difficulty", new Object[0]));
        eu.a(": ");
        eu.a(new fb(\u2603.b(), new Object[0]));
        return eu.d();
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        this.j.a(this);
        if (\u2603 == 109 && \u2603 && this.j.f != null) {
            this.j.f.P().e(true);
            this.r.b(true);
            this.r.l = false;
            this.i.l = false;
        }
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
        }
        if (\u2603.k == 108) {
            this.j.f.P().a(oj.a(this.j.f.aa().a() + 1));
            this.i.j = this.a(this.j.f.aa());
        }
        if (\u2603.k == 109) {
            this.j.a(new awy(this, new fb("difficulty.lock.title", new Object[0]).d(), new fb("difficulty.lock.question", new Object[] { new fb(this.j.f.P().y().b(), new Object[0]) }).d(), 109));
        }
        if (\u2603.k == 110) {
            this.j.t.b();
            this.j.a(new axx(this));
        }
        if (\u2603.k == 8675309) {
            this.j.o.d();
        }
        if (\u2603.k == 101) {
            this.j.t.b();
            this.j.a(new ayb(this, this.h));
        }
        if (\u2603.k == 100) {
            this.j.t.b();
            this.j.a(new ayj(this, this.h));
        }
        if (\u2603.k == 102) {
            this.j.t.b();
            this.j.a(new axl(this, this.h, this.j.S()));
        }
        if (\u2603.k == 103) {
            this.j.t.b();
            this.j.a(new awu(this, this.h));
        }
        if (\u2603.k == 104) {
            this.j.t.b();
            this.j.a(new axy(this, this.h));
        }
        if (\u2603.k == 200) {
            this.j.t.b();
            this.j.a(this.g);
        }
        if (\u2603.k == 105) {
            this.j.t.b();
            this.j.a(new azo(this));
        }
        if (\u2603.k == 106) {
            this.j.t.b();
            this.j.a(new axz(this, this.h));
        }
        if (\u2603.k == 107) {
            this.j.t.b();
            final bqm y = this.j.Y();
            if (y.i() && y.A()) {
                this.j.a(new azz(this, this.h));
            }
            else {
                baa.a(this);
            }
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.a, this.l / 2, 15, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        f = new avh.a[] { avh.a.c };
    }
}
