import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class tg
{
    private adm a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private tf f;
    private int g;
    private int h;
    private int i;
    
    public tg(final adm \u2603) {
        this.c = -1;
        this.a = \u2603;
    }
    
    public void a() {
        if (this.a.w()) {
            this.c = 0;
            return;
        }
        if (this.c == 2) {
            return;
        }
        if (this.c == 0) {
            final float c = this.a.c(0.0f);
            if (c < 0.5 || c > 0.501) {
                return;
            }
            this.c = ((this.a.s.nextInt(10) == 0) ? 1 : 2);
            this.b = false;
            if (this.c == 2) {
                return;
            }
        }
        if (this.c == -1) {
            return;
        }
        if (!this.b) {
            if (!this.b()) {
                return;
            }
            this.b = true;
        }
        if (this.e > 0) {
            --this.e;
            return;
        }
        this.e = 2;
        if (this.d > 0) {
            this.c();
            --this.d;
        }
        else {
            this.c = 2;
        }
    }
    
    private boolean b() {
        final List<wn> j = this.a.j;
        for (final wn \u2603 : j) {
            if (!\u2603.v()) {
                this.f = this.a.ae().a(new cj(\u2603), 1);
                if (this.f == null) {
                    continue;
                }
                if (this.f.c() < 10) {
                    continue;
                }
                if (this.f.d() < 20) {
                    continue;
                }
                if (this.f.e() < 20) {
                    continue;
                }
                final cj a = this.f.a();
                final float n = (float)this.f.b();
                boolean b = false;
                for (int i = 0; i < 10; ++i) {
                    final float n2 = this.a.s.nextFloat() * 3.1415927f * 2.0f;
                    this.g = a.n() + (int)(ns.b(n2) * n * 0.9);
                    this.h = a.o();
                    this.i = a.p() + (int)(ns.a(n2) * n * 0.9);
                    b = false;
                    for (final tf tf : this.a.ae().b()) {
                        if (tf == this.f) {
                            continue;
                        }
                        if (tf.a(new cj(this.g, this.h, this.i))) {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        break;
                    }
                }
                if (b) {
                    return false;
                }
                final aui a2 = this.a(new cj(this.g, this.h, this.i));
                if (a2 == null) {
                    continue;
                }
                this.e = 0;
                this.d = 20;
                return true;
            }
        }
        return false;
    }
    
    private boolean c() {
        final aui a = this.a(new cj(this.g, this.h, this.i));
        if (a == null) {
            return false;
        }
        we we;
        try {
            we = new we(this.a);
            we.a(this.a.E(new cj(we)), null);
            we.m(false);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        we.b(a.a, a.b, a.c, this.a.s.nextFloat() * 360.0f, 0.0f);
        this.a.d(we);
        final cj a2 = this.f.a();
        we.a(a2, this.f.b());
        return true;
    }
    
    private aui a(final cj \u2603) {
        for (int i = 0; i < 10; ++i) {
            final cj a = \u2603.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
            if (this.f.a(a)) {
                if (adt.a(ps.a.a, this.a, a)) {
                    return new aui(a.n(), a.o(), a.p());
                }
            }
        }
        return null;
    }
}
