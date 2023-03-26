// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ph extends py
{
    protected int a;
    protected int b;
    protected int c;
    private float bm;
    private float bn;
    
    public ph(final adm \u2603) {
        super(\u2603);
        this.bm = -1.0f;
    }
    
    public abstract ph a(final ph p0);
    
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.bJ) {
            if (!this.o.D) {
                final Class<? extends pk> a = pm.a(h.i());
                if (a != null && this.getClass() == a) {
                    final ph a2 = this.a(this);
                    if (a2 != null) {
                        a2.b(-24000);
                        a2.b(this.s, this.t, this.u, 0.0f, 0.0f);
                        this.o.d(a2);
                        if (h.s()) {
                            a2.a(h.q());
                        }
                        if (!\u2603.bA.d) {
                            final zx zx = h;
                            --zx.b;
                            if (h.b <= 0) {
                                \u2603.bi.a(\u2603.bi.c, null);
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(12, (Byte)0);
    }
    
    public int l() {
        if (this.o.D) {
            return this.ac.a(12);
        }
        return this.a;
    }
    
    public void a(final int \u2603, final boolean \u2603) {
        final int l;
        int \u26032 = l = this.l();
        \u26032 += \u2603 * 20;
        if (\u26032 > 0) {
            \u26032 = 0;
            if (l < 0) {
                this.n();
            }
        }
        final int n = \u26032 - l;
        this.b(\u26032);
        if (\u2603) {
            this.b += n;
            if (this.c == 0) {
                this.c = 40;
            }
        }
        if (this.l() == 0) {
            this.b(this.b);
        }
    }
    
    public void a(final int \u2603) {
        this.a(\u2603, false);
    }
    
    public void b(final int \u2603) {
        this.ac.b(12, (byte)ns.a(\u2603, -1, 1));
        this.a = \u2603;
        this.a(this.j_());
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Age", this.l());
        \u2603.a("ForcedAge", this.b);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.b(\u2603.f("Age"));
        this.b = \u2603.f("ForcedAge");
    }
    
    @Override
    public void m() {
        super.m();
        if (this.o.D) {
            if (this.c > 0) {
                if (this.c % 4 == 0) {
                    this.o.a(cy.v, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.c;
            }
            this.a(this.j_());
        }
        else {
            int l = this.l();
            if (l < 0) {
                ++l;
                this.b(l);
                if (l == 0) {
                    this.n();
                }
            }
            else if (l > 0) {
                --l;
                this.b(l);
            }
        }
    }
    
    protected void n() {
    }
    
    @Override
    public boolean j_() {
        return this.l() < 0;
    }
    
    public void a(final boolean \u2603) {
        this.a(\u2603 ? 0.5f : 1.0f);
    }
    
    @Override
    protected final void a(final float \u2603, final float \u2603) {
        final boolean b = this.bm > 0.0f;
        this.bm = \u2603;
        this.bn = \u2603;
        if (!b) {
            this.a(1.0f);
        }
    }
    
    protected final void a(final float \u2603) {
        super.a(this.bm * \u2603, this.bn * \u2603);
    }
}
