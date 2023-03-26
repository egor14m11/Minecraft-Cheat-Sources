import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class vz extends vv
{
    private b a;
    
    public vz(final adm \u2603) {
        super(\u2603);
        this.a(0.4f, 0.3f);
        this.i.a(1, new ra(this));
        this.i.a(3, this.a = new b(this));
        this.i.a(4, new rl(this, wn.class, 1.0, false));
        this.i.a(5, new a(this));
        this.bi.a(1, new sm(this, true, new Class[0]));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
    }
    
    @Override
    public double am() {
        return 0.2;
    }
    
    @Override
    public float aS() {
        return 0.1f;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(8.0);
        this.a(vy.d).a(0.25);
        this.a(vy.e).a(1.0);
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected String z() {
        return "mob.silverfish.say";
    }
    
    @Override
    protected String bo() {
        return "mob.silverfish.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.silverfish.kill";
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (\u2603 instanceof ox || \u2603 == ow.l) {
            this.a.f();
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.silverfish.step", 0.15f, 1.0f);
    }
    
    @Override
    protected zw A() {
        return null;
    }
    
    @Override
    public void t_() {
        this.aI = this.y;
        super.t_();
    }
    
    @Override
    public float a(final cj \u2603) {
        if (this.o.p(\u2603.b()).c() == afi.b) {
            return 10.0f;
        }
        return super.a(\u2603);
    }
    
    @Override
    protected boolean n_() {
        return true;
    }
    
    @Override
    public boolean bR() {
        if (super.bR()) {
            final wn a = this.o.a(this, 5.0);
            return a == null;
        }
        return false;
    }
    
    @Override
    public pw bz() {
        return pw.c;
    }
    
    static class b extends rd
    {
        private vz a;
        private int b;
        
        public b(final vz \u2603) {
            this.a = \u2603;
        }
        
        public void f() {
            if (this.b == 0) {
                this.b = 20;
            }
        }
        
        @Override
        public boolean a() {
            return this.b > 0;
        }
        
        @Override
        public void e() {
            --this.b;
            Label_0248: {
                if (this.b <= 0) {
                    final adm o = this.a.o;
                    final Random bc = this.a.bc();
                    final cj cj = new cj(this.a);
                    for (int \u2603 = 0; \u2603 <= 5 && \u2603 >= -5; \u2603 = ((\u2603 <= 0) ? (1 - \u2603) : (0 - \u2603))) {
                        for (int \u26032 = 0; \u26032 <= 10 && \u26032 >= -10; \u26032 = ((\u26032 <= 0) ? (1 - \u26032) : (0 - \u26032))) {
                            for (int \u26033 = 0; \u26033 <= 10 && \u26033 >= -10; \u26033 = ((\u26033 <= 0) ? (1 - \u26033) : (0 - \u26033))) {
                                final cj a = cj.a(\u26032, \u2603, \u26033);
                                final alz p = o.p(a);
                                if (p.c() == afi.be) {
                                    if (o.Q().b("mobGriefing")) {
                                        o.b(a, true);
                                    }
                                    else {
                                        o.a(a, p.b(ahz.a).d(), 3);
                                    }
                                    if (bc.nextBoolean()) {
                                        break Label_0248;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static class a extends rz
    {
        private final vz a;
        private cq b;
        private boolean c;
        
        public a(final vz \u2603) {
            super(\u2603, 1.0, 10);
            this.a = \u2603;
            this.a(1);
        }
        
        @Override
        public boolean a() {
            if (this.a.u() != null) {
                return false;
            }
            if (!this.a.s().m()) {
                return false;
            }
            final Random bc = this.a.bc();
            if (bc.nextInt(10) == 0) {
                this.b = cq.a(bc);
                final cj a = new cj(this.a.s, this.a.t + 0.5, this.a.u).a(this.b);
                final alz p = this.a.o.p(a);
                if (ahz.d(p)) {
                    return this.c = true;
                }
            }
            this.c = false;
            return super.a();
        }
        
        @Override
        public boolean b() {
            return !this.c && super.b();
        }
        
        @Override
        public void c() {
            if (!this.c) {
                super.c();
                return;
            }
            final adm o = this.a.o;
            final cj a = new cj(this.a.s, this.a.t + 0.5, this.a.u).a(this.b);
            final alz p = o.p(a);
            if (ahz.d(p)) {
                o.a(a, afi.be.Q().a(ahz.a, ahz.a.a(p)), 3);
                this.a.y();
                this.a.J();
            }
        }
    }
}
