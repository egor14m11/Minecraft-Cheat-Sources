// 
// Decompiled by Procyon v0.5.36
// 

public class rf extends ro
{
    private final wi c;
    private boolean d;
    private boolean e;
    private int f;
    
    public rf(final wi \u2603, final double \u2603) {
        super(\u2603, \u2603, 16);
        this.c = \u2603;
    }
    
    @Override
    public boolean a() {
        if (this.a <= 0) {
            if (!this.c.o.Q().b("mobGriefing")) {
                return false;
            }
            this.f = -1;
            this.d = this.c.cu();
            this.e = this.c.ct();
        }
        return super.a();
    }
    
    @Override
    public boolean b() {
        return this.f >= 0 && super.b();
    }
    
    @Override
    public void c() {
        super.c();
    }
    
    @Override
    public void d() {
        super.d();
    }
    
    @Override
    public void e() {
        super.e();
        this.c.p().a(this.b.n() + 0.5, this.b.o() + 1, this.b.p() + 0.5, 10.0f, (float)this.c.bQ());
        if (this.f()) {
            final adm o = this.c.o;
            final cj a = this.b.a();
            final alz p = o.p(a);
            final afh c = p.c();
            if (this.f == 0 && c instanceof afz && p.b((amo<Integer>)afz.a) == 7) {
                o.b(a, true);
            }
            else if (this.f == 1 && c == afi.a) {
                final oq cq = this.c.cq();
                int i = 0;
                while (i < cq.o_()) {
                    final zx a2 = cq.a(i);
                    boolean b = false;
                    if (a2 != null) {
                        if (a2.b() == zy.N) {
                            o.a(a, afi.aj.Q(), 3);
                            b = true;
                        }
                        else if (a2.b() == zy.bS) {
                            o.a(a, afi.cc.Q(), 3);
                            b = true;
                        }
                        else if (a2.b() == zy.bR) {
                            o.a(a, afi.cb.Q(), 3);
                            b = true;
                        }
                    }
                    if (b) {
                        final zx zx = a2;
                        --zx.b;
                        if (a2.b <= 0) {
                            cq.a(i, null);
                            break;
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            this.f = -1;
            this.a = 10;
        }
    }
    
    @Override
    protected boolean a(final adm \u2603, cj \u2603) {
        afh afh = \u2603.p(\u2603).c();
        if (afh == afi.ak) {
            \u2603 = \u2603.a();
            final alz p = \u2603.p(\u2603);
            afh = p.c();
            if (afh instanceof afz && p.b((amo<Integer>)afz.a) == 7 && this.e && (this.f == 0 || this.f < 0)) {
                this.f = 0;
                return true;
            }
            if (afh == afi.a && this.d && (this.f == 1 || this.f < 0)) {
                this.f = 1;
                return true;
            }
        }
        return false;
    }
}
