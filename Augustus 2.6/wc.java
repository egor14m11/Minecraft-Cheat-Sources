import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class wc extends vv
{
    public wc(final adm \u2603) {
        super(\u2603);
        this.a(1.4f, 0.9f);
        this.i.a(1, new ra(this));
        this.i.a(3, new rh(this, 0.4f));
        this.i.a(4, new a(this, wn.class));
        this.i.a(4, new a(this, ty.class));
        this.i.a(5, new rz(this, 0.8));
        this.i.a(6, new ri(this, wn.class, 8.0f));
        this.i.a(6, new ry(this));
        this.bi.a(1, new sm(this, false, new Class[0]));
        this.bi.a(2, new c<Object>(this, wn.class));
        this.bi.a(3, new c<Object>(this, ty.class));
    }
    
    @Override
    public double an() {
        return this.K * 0.5f;
    }
    
    @Override
    protected sw b(final adm \u2603) {
        return new sx(this, \u2603);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Byte((byte)0));
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D) {
            this.a(this.D);
        }
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(16.0);
        this.a(vy.d).a(0.30000001192092896);
    }
    
    @Override
    protected String z() {
        return "mob.spider.say";
    }
    
    @Override
    protected String bo() {
        return "mob.spider.say";
    }
    
    @Override
    protected String bp() {
        return "mob.spider.death";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.spider.step", 0.15f, 1.0f);
    }
    
    @Override
    protected zw A() {
        return zy.F;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        super.b(\u2603, \u2603);
        if (\u2603 && (this.V.nextInt(3) == 0 || this.V.nextInt(1 + \u2603) > 0)) {
            this.a(zy.bB, 1);
        }
    }
    
    @Override
    public boolean k_() {
        return this.n();
    }
    
    @Override
    public void aA() {
    }
    
    @Override
    public pw bz() {
        return pw.c;
    }
    
    @Override
    public boolean d(final pf \u2603) {
        return \u2603.a() != pe.u.H && super.d(\u2603);
    }
    
    public boolean n() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void a(final boolean \u2603) {
        byte a = this.ac.a(16);
        if (\u2603) {
            a |= 0x1;
        }
        else {
            a &= 0xFFFFFFFE;
        }
        this.ac.b(16, a);
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        if (this.o.s.nextInt(100) == 0) {
            final wa \u26032 = new wa(this.o);
            \u26032.b(this.s, this.t, this.u, this.y, 0.0f);
            \u26032.a(\u2603, null);
            this.o.d(\u26032);
            \u26032.a((pk)this);
        }
        if (\u2603 == null) {
            \u2603 = new b();
            if (this.o.aa() == oj.d && this.o.s.nextFloat() < 0.1f * \u2603.c()) {
                ((b)\u2603).a(this.o.s);
            }
        }
        if (\u2603 instanceof b) {
            final int a = ((b)\u2603).a;
            if (a > 0 && pe.a[a] != null) {
                this.c(new pf(a, Integer.MAX_VALUE));
            }
        }
        return \u2603;
    }
    
    @Override
    public float aS() {
        return 0.65f;
    }
    
    public static class b implements pu
    {
        public int a;
        
        public void a(final Random \u2603) {
            final int nextInt = \u2603.nextInt(5);
            if (nextInt <= 1) {
                this.a = pe.c.H;
            }
            else if (nextInt <= 2) {
                this.a = pe.g.H;
            }
            else if (nextInt <= 3) {
                this.a = pe.l.H;
            }
            else if (nextInt <= 4) {
                this.a = pe.p.H;
            }
        }
    }
    
    static class a extends rl
    {
        public a(final wc \u2603, final Class<? extends pk> \u2603) {
            super(\u2603, \u2603, 1.0, true);
        }
        
        @Override
        public boolean b() {
            final float c = this.b.c(1.0f);
            if (c >= 0.5f && this.b.bc().nextInt(100) == 0) {
                this.b.d((pr)null);
                return false;
            }
            return super.b();
        }
        
        @Override
        protected double a(final pr \u2603) {
            return 4.0f + \u2603.J;
        }
    }
    
    static class c<T extends pr> extends sp
    {
        public c(final wc \u2603, final Class<T> \u2603) {
            super(\u2603, \u2603, true);
        }
        
        @Override
        public boolean a() {
            final float c = this.e.c(1.0f);
            return c < 0.5f && super.a();
        }
    }
}
