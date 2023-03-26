// 
// Decompiled by Procyon v0.5.36
// 

public class avi implements nu
{
    private String a;
    private ave b;
    private String c;
    private long d;
    private boolean e;
    private avr f;
    private bfw g;
    
    public avi(final ave \u2603) {
        this.a = "";
        this.c = "";
        this.d = ave.J();
        this.b = \u2603;
        this.f = new avr(\u2603);
        (this.g = new bfw(\u2603.d, \u2603.e, false)).a(9728);
    }
    
    @Override
    public void b(final String \u2603) {
        this.e = false;
        this.d(\u2603);
    }
    
    @Override
    public void a(final String \u2603) {
        this.e = true;
        this.d(\u2603);
    }
    
    private void d(final String \u2603) {
        this.c = \u2603;
        if (this.b.B) {
            bfl.m(256);
            bfl.n(5889);
            bfl.D();
            if (bqs.i()) {
                final int e = this.f.e();
                bfl.a(0.0, this.f.a() * e, this.f.b() * e, 0.0, 100.0, 300.0);
            }
            else {
                final avr avr = new avr(this.b);
                bfl.a(0.0, avr.c(), avr.d(), 0.0, 100.0, 300.0);
            }
            bfl.n(5888);
            bfl.D();
            bfl.b(0.0f, 0.0f, -200.0f);
            return;
        }
        if (this.e) {
            return;
        }
        throw new avk();
    }
    
    @Override
    public void c(final String \u2603) {
        if (this.b.B) {
            this.d = 0L;
            this.a = \u2603;
            this.a(-1);
            this.d = 0L;
            return;
        }
        if (this.e) {
            return;
        }
        throw new avk();
    }
    
    @Override
    public void a(final int \u2603) {
        if (!this.b.B) {
            if (this.e) {
                return;
            }
            throw new avk();
        }
        else {
            final long j = ave.J();
            if (j - this.d < 100L) {
                return;
            }
            this.d = j;
            final avr avr = new avr(this.b);
            final int e = avr.e();
            final int a = avr.a();
            final int b = avr.b();
            if (bqs.i()) {
                this.g.f();
            }
            else {
                bfl.m(256);
            }
            this.g.a(false);
            bfl.n(5889);
            bfl.D();
            bfl.a(0.0, avr.c(), avr.d(), 0.0, 100.0, 300.0);
            bfl.n(5888);
            bfl.D();
            bfl.b(0.0f, 0.0f, -200.0f);
            if (!bqs.i()) {
                bfl.m(16640);
            }
            final bfx a2 = bfx.a();
            final bfd c = a2.c();
            this.b.P().a(avp.b);
            final float n = 32.0f;
            c.a(7, bms.i);
            c.b(0.0, b, 0.0).a(0.0, b / n).b(64, 64, 64, 255).d();
            c.b(a, b, 0.0).a(a / n, b / n).b(64, 64, 64, 255).d();
            c.b(a, 0.0, 0.0).a(a / n, 0.0).b(64, 64, 64, 255).d();
            c.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 255).d();
            a2.b();
            if (\u2603 >= 0) {
                final int n2 = 100;
                final int n3 = 2;
                final int n4 = a / 2 - n2 / 2;
                final int n5 = b / 2 + 16;
                bfl.x();
                c.a(7, bms.f);
                c.b(n4, n5, 0.0).b(128, 128, 128, 255).d();
                c.b(n4, n5 + n3, 0.0).b(128, 128, 128, 255).d();
                c.b(n4 + n2, n5 + n3, 0.0).b(128, 128, 128, 255).d();
                c.b(n4 + n2, n5, 0.0).b(128, 128, 128, 255).d();
                c.b(n4, n5, 0.0).b(128, 255, 128, 255).d();
                c.b(n4, n5 + n3, 0.0).b(128, 255, 128, 255).d();
                c.b(n4 + \u2603, n5 + n3, 0.0).b(128, 255, 128, 255).d();
                c.b(n4 + \u2603, n5, 0.0).b(128, 255, 128, 255).d();
                a2.b();
                bfl.w();
            }
            bfl.l();
            bfl.a(770, 771, 1, 0);
            this.b.k.a(this.c, (float)((a - this.b.k.a(this.c)) / 2), (float)(b / 2 - 4 - 16), 16777215);
            this.b.k.a(this.a, (float)((a - this.b.k.a(this.a)) / 2), (float)(b / 2 - 4 + 8), 16777215);
            this.g.e();
            if (bqs.i()) {
                this.g.c(a * e, b * e);
            }
            this.b.h();
            try {
                Thread.yield();
            }
            catch (Exception ex) {}
        }
    }
    
    @Override
    public void a() {
    }
}
