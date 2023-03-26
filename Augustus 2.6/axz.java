// 
// Decompiled by Procyon v0.5.36
// 

public class axz extends axu
{
    private final axu f;
    private final avh g;
    protected String a;
    private String h;
    
    public axz(final axu \u2603, final avh \u2603) {
        this.a = "Options";
        this.f = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void b() {
        int n = 0;
        this.a = bnq.a("options.sounds.title", new Object[0]);
        this.h = bnq.a("options.off", new Object[0]);
        this.n.add(new a(bpg.a.b(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 - 12 + 24 * (n >> 1), bpg.a, true));
        n += 2;
        for (final bpg \u2603 : bpg.values()) {
            if (\u2603 != bpg.a) {
                this.n.add(new a(\u2603.b(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 - 12 + 24 * (n >> 1), \u2603, false));
                ++n;
            }
        }
        this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.done", new Object[0])));
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
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.a, this.l / 2, 15, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    protected String a(final bpg \u2603) {
        final float a = this.g.a(\u2603);
        if (a == 0.0f) {
            return this.h;
        }
        return (int)(a * 100.0f) + "%";
    }
    
    class a extends avs
    {
        private final bpg r;
        private final String s;
        public float o;
        public boolean p;
        
        public a(final int \u2603, final int \u2603, final int \u2603, final bpg \u2603, final boolean \u2603) {
            super(\u2603, \u2603, \u2603, \u2603 ? 310 : 150, 20, "");
            this.o = 1.0f;
            this.r = \u2603;
            this.s = bnq.a("soundCategory." + \u2603.a(), new Object[0]);
            this.j = this.s + ": " + axz.this.a(\u2603);
            this.o = axz.this.g.a(\u2603);
        }
        
        @Override
        protected int a(final boolean \u2603) {
            return 0;
        }
        
        @Override
        protected void b(final ave \u2603, final int \u2603, final int \u2603) {
            if (!this.m) {
                return;
            }
            if (this.p) {
                this.o = (\u2603 - (this.h + 4)) / (float)(this.f - 8);
                this.o = ns.a(this.o, 0.0f, 1.0f);
                \u2603.t.a(this.r, this.o);
                \u2603.t.b();
                this.j = this.s + ": " + axz.this.a(this.r);
            }
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.b(this.h + (int)(this.o * (this.f - 8)), this.i, 0, 66, 4, 20);
            this.b(this.h + (int)(this.o * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
        }
        
        @Override
        public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
            if (super.c(\u2603, \u2603, \u2603)) {
                this.o = (\u2603 - (this.h + 4)) / (float)(this.f - 8);
                this.o = ns.a(this.o, 0.0f, 1.0f);
                \u2603.t.a(this.r, this.o);
                \u2603.t.b();
                this.j = this.s + ": " + axz.this.a(this.r);
                return this.p = true;
            }
            return false;
        }
        
        @Override
        public void a(final bpz \u2603) {
        }
        
        @Override
        public void a(final int \u2603, final int \u2603) {
            if (this.p) {
                final float n = (this.r == bpg.a) ? 1.0f : axz.this.g.a(this.r);
                axz.this.j.W().a(bpf.a(new jy("gui.button.press"), 1.0f));
            }
            this.p = false;
        }
    }
}
