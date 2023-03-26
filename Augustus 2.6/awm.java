// 
// Decompiled by Procyon v0.5.36
// 

public class awm extends avp implements bai
{
    private static final jy f;
    public static final jy a;
    private final ave g;
    private long h;
    private baf i;
    
    public awm(final ave \u2603) {
        this.g = \u2603;
    }
    
    public void a(final int \u2603) {
        this.h = ave.J();
        if (this.i != null) {
            this.i.b(\u2603);
        }
        else {
            this.i = new baf(this);
        }
    }
    
    private float c() {
        final long n = this.h - ave.J() + 5000L;
        return ns.a(n / 2000.0f, 0.0f, 1.0f);
    }
    
    public void a(final avr \u2603, final float \u2603) {
        if (this.i == null) {
            return;
        }
        final float c = this.c();
        if (c <= 0.0f) {
            this.i.d();
            return;
        }
        final int \u26032 = \u2603.a() / 2;
        final float e = this.e;
        this.e = -90.0f;
        final float \u26033 = \u2603.b() - 22.0f * c;
        final baj f = this.i.f();
        this.a(\u2603, c, \u26032, \u26033, f);
        this.e = e;
    }
    
    protected void a(final avr \u2603, final float \u2603, final int \u2603, final float \u2603, final baj \u2603) {
        bfl.B();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.c(1.0f, 1.0f, 1.0f, \u2603);
        this.g.P().a(awm.f);
        this.a((float)(\u2603 - 91), \u2603, 0, 0, 182, 22);
        if (\u2603.b() >= 0) {
            this.a((float)(\u2603 - 91 - 1 + \u2603.b() * 20), \u2603 - 1.0f, 0, 22, 24, 22);
        }
        avc.c();
        for (int i = 0; i < 9; ++i) {
            this.a(i, \u2603.a() / 2 - 90 + i * 20 + 2, \u2603 + 3.0f, \u2603, \u2603.a(i));
        }
        avc.a();
        bfl.C();
        bfl.k();
    }
    
    private void a(final int \u2603, final int \u2603, final float \u2603, final float \u2603, final bah \u2603) {
        this.g.P().a(awm.a);
        if (\u2603 != baf.a) {
            final int n = (int)(\u2603 * 255.0f);
            bfl.E();
            bfl.b((float)\u2603, \u2603, 0.0f);
            final float n2 = \u2603.B_() ? 1.0f : 0.25f;
            bfl.c(n2, n2, n2, \u2603);
            \u2603.a(n2, n);
            bfl.F();
            final String value = String.valueOf(avh.c(this.g.t.av[\u2603].i()));
            if (n > 3 && \u2603.B_()) {
                this.g.k.a(value, (float)(\u2603 + 19 - 2 - this.g.k.a(value)), \u2603 + 6.0f + 3.0f, 16777215 + (n << 24));
            }
        }
    }
    
    public void a(final avr \u2603) {
        final int n = (int)(this.c() * 255.0f);
        if (n > 3 && this.i != null) {
            final bah b = this.i.b();
            final String s = (b != baf.a) ? b.A_().d() : this.i.c().b().d();
            if (s != null) {
                final int n2 = (\u2603.a() - this.g.k.a(s)) / 2;
                final int n3 = \u2603.b() - 35;
                bfl.E();
                bfl.l();
                bfl.a(770, 771, 1, 0);
                this.g.k.a(s, (float)n2, (float)n3, 16777215 + (n << 24));
                bfl.k();
                bfl.F();
            }
        }
    }
    
    @Override
    public void a(final baf \u2603) {
        this.i = null;
        this.h = 0L;
    }
    
    public boolean a() {
        return this.i != null;
    }
    
    public void b(final int \u2603) {
        int \u26032;
        for (\u26032 = this.i.e() + \u2603; \u26032 >= 0 && \u26032 <= 8 && (this.i.a(\u26032) == baf.a || !this.i.a(\u26032).B_()); \u26032 += \u2603) {}
        if (\u26032 >= 0 && \u26032 <= 8) {
            this.i.b(\u26032);
            this.h = ave.J();
        }
    }
    
    public void b() {
        this.h = ave.J();
        if (this.a()) {
            final int e = this.i.e();
            if (e != -1) {
                this.i.b(e);
            }
        }
        else {
            this.i = new baf(this);
        }
    }
    
    static {
        f = new jy("textures/gui/widgets.png");
        a = new jy("textures/gui/spectator_widgets.png");
    }
}
