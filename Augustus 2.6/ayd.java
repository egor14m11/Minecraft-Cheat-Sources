// 
// Decompiled by Procyon v0.5.36
// 

public class ayd extends avp
{
    private static final jy a;
    private ave f;
    private int g;
    private int h;
    private String i;
    private String j;
    private mq k;
    private long l;
    private bjh m;
    private boolean n;
    
    public ayd(final ave \u2603) {
        this.f = \u2603;
        this.m = \u2603.ag();
    }
    
    public void a(final mq \u2603) {
        this.i = bnq.a("achievement.get", new Object[0]);
        this.j = \u2603.e().c();
        this.l = ave.J();
        this.k = \u2603;
        this.n = false;
    }
    
    public void b(final mq \u2603) {
        this.i = \u2603.e().c();
        this.j = \u2603.f();
        this.l = ave.J() + 2500L;
        this.k = \u2603;
        this.n = true;
    }
    
    private void c() {
        bfl.b(0, 0, this.f.d, this.f.e);
        bfl.n(5889);
        bfl.D();
        bfl.n(5888);
        bfl.D();
        this.g = this.f.d;
        this.h = this.f.e;
        final avr avr = new avr(this.f);
        this.g = avr.a();
        this.h = avr.b();
        bfl.m(256);
        bfl.n(5889);
        bfl.D();
        bfl.a(0.0, this.g, this.h, 0.0, 1000.0, 3000.0);
        bfl.n(5888);
        bfl.D();
        bfl.b(0.0f, 0.0f, -2000.0f);
    }
    
    public void a() {
        if (this.k == null || this.l == 0L || ave.A().h == null) {
            return;
        }
        double n = (ave.J() - this.l) / 3000.0;
        if (!this.n) {
            if (n < 0.0 || n > 1.0) {
                this.l = 0L;
                return;
            }
        }
        else if (n > 0.5) {
            n = 0.5;
        }
        this.c();
        bfl.i();
        bfl.a(false);
        double n2 = n * 2.0;
        if (n2 > 1.0) {
            n2 = 2.0 - n2;
        }
        n2 *= 4.0;
        n2 = 1.0 - n2;
        if (n2 < 0.0) {
            n2 = 0.0;
        }
        n2 *= n2;
        n2 *= n2;
        final int \u2603 = this.g - 160;
        final int \u26032 = 0 - (int)(n2 * 36.0);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.w();
        this.f.P().a(ayd.a);
        bfl.f();
        this.b(\u2603, \u26032, 96, 202, 160, 32);
        if (this.n) {
            this.f.k.a(this.j, \u2603 + 30, \u26032 + 7, 120, -1);
        }
        else {
            this.f.k.a(this.i, \u2603 + 30, \u26032 + 7, -256);
            this.f.k.a(this.j, \u2603 + 30, \u26032 + 18, -1);
        }
        avc.c();
        bfl.f();
        bfl.B();
        bfl.g();
        bfl.e();
        this.m.b(this.k.d, \u2603 + 8, \u26032 + 8);
        bfl.f();
        bfl.a(true);
        bfl.j();
    }
    
    public void b() {
        this.k = null;
        this.l = 0L;
    }
    
    static {
        a = new jy("textures/gui/achievement/achievement_background.png");
    }
}
