import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public class wm implements og
{
    public zx[] a;
    public zx[] b;
    public int c;
    public wn d;
    private zx f;
    public boolean e;
    
    public wm(final wn \u2603) {
        this.a = new zx[36];
        this.b = new zx[4];
        this.d = \u2603;
    }
    
    public zx h() {
        if (this.c < 9 && this.c >= 0) {
            return this.a[this.c];
        }
        return null;
    }
    
    public static int i() {
        return 9;
    }
    
    private int c(final zw \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null && this.a[i].b() == \u2603) {
                return i;
            }
        }
        return -1;
    }
    
    private int a(final zw \u2603, final int \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null && this.a[i].b() == \u2603 && this.a[i].i() == \u2603) {
                return i;
            }
        }
        return -1;
    }
    
    private int d(final zx \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null && this.a[i].b() == \u2603.b() && this.a[i].d() && this.a[i].b < this.a[i].c() && this.a[i].b < this.q_() && (!this.a[i].f() || this.a[i].i() == \u2603.i()) && zx.a(this.a[i], \u2603)) {
                return i;
            }
        }
        return -1;
    }
    
    public int j() {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void a(final zw \u2603, final int \u2603, final boolean \u2603, final boolean \u2603) {
        final zx h = this.h();
        final int c = \u2603 ? this.a(\u2603, \u2603) : this.c(\u2603);
        if (c >= 0 && c < 9) {
            this.c = c;
            return;
        }
        if (!\u2603 || \u2603 == null) {
            return;
        }
        final int j = this.j();
        if (j >= 0 && j < 9) {
            this.c = j;
        }
        if (h == null || !h.v() || this.a(h.b(), h.h()) != this.c) {
            final int a = this.a(\u2603, \u2603);
            int b;
            if (a >= 0) {
                b = this.a[a].b;
                this.a[a] = this.a[this.c];
            }
            else {
                b = 1;
            }
            this.a[this.c] = new zx(\u2603, b, \u2603);
        }
    }
    
    public void d(int \u2603) {
        if (\u2603 > 0) {
            \u2603 = 1;
        }
        if (\u2603 < 0) {
            \u2603 = -1;
        }
        this.c -= \u2603;
        while (this.c < 0) {
            this.c += 9;
        }
        while (this.c >= 9) {
            this.c -= 9;
        }
    }
    
    public int a(final zw \u2603, final int \u2603, final int \u2603, final dn \u2603) {
        int n = 0;
        for (int i = 0; i < this.a.length; ++i) {
            final zx zx = this.a[i];
            if (zx != null) {
                if (\u2603 == null || zx.b() == \u2603) {
                    if (\u2603 <= -1 || zx.i() == \u2603) {
                        if (\u2603 == null || dy.a(\u2603, zx.o(), true)) {
                            final int n2 = (\u2603 <= 0) ? zx.b : Math.min(\u2603 - n, zx.b);
                            n += n2;
                            if (\u2603 != 0) {
                                final zx zx2 = this.a[i];
                                zx2.b -= n2;
                                if (this.a[i].b == 0) {
                                    this.a[i] = null;
                                }
                                if (\u2603 > 0 && n >= \u2603) {
                                    return n;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < this.b.length; ++i) {
            final zx zx = this.b[i];
            if (zx != null) {
                if (\u2603 == null || zx.b() == \u2603) {
                    if (\u2603 <= -1 || zx.i() == \u2603) {
                        if (\u2603 == null || dy.a(\u2603, zx.o(), false)) {
                            final int n2 = (\u2603 <= 0) ? zx.b : Math.min(\u2603 - n, zx.b);
                            n += n2;
                            if (\u2603 != 0) {
                                final zx zx3 = this.b[i];
                                zx3.b -= n2;
                                if (this.b[i].b == 0) {
                                    this.b[i] = null;
                                }
                                if (\u2603 > 0 && n >= \u2603) {
                                    return n;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f != null) {
            if (\u2603 != null && this.f.b() != \u2603) {
                return n;
            }
            if (\u2603 > -1 && this.f.i() != \u2603) {
                return n;
            }
            if (\u2603 != null && !dy.a(\u2603, this.f.o(), false)) {
                return n;
            }
            final int i = (\u2603 <= 0) ? this.f.b : Math.min(\u2603 - n, this.f.b);
            n += i;
            if (\u2603 != 0) {
                final zx f = this.f;
                f.b -= i;
                if (this.f.b == 0) {
                    this.f = null;
                }
                if (\u2603 > 0 && n >= \u2603) {
                    return n;
                }
            }
        }
        return n;
    }
    
    private int e(final zx \u2603) {
        final zw b = \u2603.b();
        int b2 = \u2603.b;
        int n = this.d(\u2603);
        if (n < 0) {
            n = this.j();
        }
        if (n < 0) {
            return b2;
        }
        if (this.a[n] == null) {
            this.a[n] = new zx(b, 0, \u2603.i());
            if (\u2603.n()) {
                this.a[n].d((dn)\u2603.o().b());
            }
        }
        int n2 = b2;
        if (n2 > this.a[n].c() - this.a[n].b) {
            n2 = this.a[n].c() - this.a[n].b;
        }
        if (n2 > this.q_() - this.a[n].b) {
            n2 = this.q_() - this.a[n].b;
        }
        if (n2 == 0) {
            return b2;
        }
        b2 -= n2;
        final zx zx = this.a[n];
        zx.b += n2;
        this.a[n].c = 5;
        return b2;
    }
    
    public void k() {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null) {
                this.a[i].a(this.d.o, this.d, i, this.c == i);
            }
        }
    }
    
    public boolean a(final zw \u2603) {
        final int c = this.c(\u2603);
        if (c < 0) {
            return false;
        }
        final zx zx = this.a[c];
        if (--zx.b <= 0) {
            this.a[c] = null;
        }
        return true;
    }
    
    public boolean b(final zw \u2603) {
        final int c = this.c(\u2603);
        return c >= 0;
    }
    
    public boolean a(final zx \u2603) {
        if (\u2603 == null || \u2603.b == 0 || \u2603.b() == null) {
            return false;
        }
        try {
            if (!\u2603.g()) {
                int n;
                do {
                    n = \u2603.b;
                    \u2603.b = this.e(\u2603);
                } while (\u2603.b > 0 && \u2603.b < n);
                if (\u2603.b == n && this.d.bA.d) {
                    \u2603.b = 0;
                    return true;
                }
                return \u2603.b < n;
            }
            else {
                final int n = this.j();
                if (n >= 0) {
                    this.a[n] = zx.b(\u2603);
                    this.a[n].c = 5;
                    \u2603.b = 0;
                    return true;
                }
                if (this.d.bA.d) {
                    \u2603.b = 0;
                    return true;
                }
                return false;
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Adding item to inventory");
            final c a2 = a.a("Item being added");
            a2.a("Item ID", zw.b(\u2603.b()));
            a2.a("Item data", \u2603.i());
            a2.a("Item name", new Callable<String>() {
                public String a() throws Exception {
                    return \u2603.q();
                }
            });
            throw new e(a);
        }
    }
    
    @Override
    public zx a(int \u2603, final int \u2603) {
        zx[] array = this.a;
        if (\u2603 >= this.a.length) {
            array = this.b;
            \u2603 -= this.a.length;
        }
        if (array[\u2603] == null) {
            return null;
        }
        if (array[\u2603].b <= \u2603) {
            final zx a = array[\u2603];
            array[\u2603] = null;
            return a;
        }
        final zx a = array[\u2603].a(\u2603);
        if (array[\u2603].b == 0) {
            array[\u2603] = null;
        }
        return a;
    }
    
    @Override
    public zx b(int \u2603) {
        zx[] array = this.a;
        if (\u2603 >= this.a.length) {
            array = this.b;
            \u2603 -= this.a.length;
        }
        if (array[\u2603] != null) {
            final zx zx = array[\u2603];
            array[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(int \u2603, final zx \u2603) {
        zx[] array = this.a;
        if (\u2603 >= array.length) {
            \u2603 -= array.length;
            array = this.b;
        }
        array[\u2603] = \u2603;
    }
    
    public float a(final afh \u2603) {
        float n = 1.0f;
        if (this.a[this.c] != null) {
            n *= this.a[this.c].a(\u2603);
        }
        return n;
    }
    
    public du a(final du \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.a[i].b(dn);
                \u2603.a(dn);
            }
        }
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)(i + 100));
                this.b[i].b(dn);
                \u2603.a(dn);
            }
        }
        return \u2603;
    }
    
    public void b(final du \u2603) {
        this.a = new zx[36];
        this.b = new zx[4];
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            final int n = b.d("Slot") & 0xFF;
            final zx a = zx.a(b);
            if (a != null) {
                if (n >= 0 && n < this.a.length) {
                    this.a[n] = a;
                }
                if (n >= 100 && n < this.b.length + 100) {
                    this.b[n - 100] = a;
                }
            }
        }
    }
    
    @Override
    public int o_() {
        return this.a.length + 4;
    }
    
    @Override
    public zx a(int \u2603) {
        zx[] array = this.a;
        if (\u2603 >= array.length) {
            \u2603 -= array.length;
            array = this.b;
        }
        return array[\u2603];
    }
    
    @Override
    public String e_() {
        return "container.inventory";
    }
    
    @Override
    public boolean l_() {
        return false;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    public boolean b(final afh \u2603) {
        if (\u2603.t().l()) {
            return true;
        }
        final zx a = this.a(this.c);
        return a != null && a.b(\u2603);
    }
    
    public zx e(final int \u2603) {
        return this.b[\u2603];
    }
    
    public int m() {
        int n = 0;
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null && this.b[i].b() instanceof yj) {
                final int c = ((yj)this.b[i].b()).c;
                n += c;
            }
        }
        return n;
    }
    
    public void a(float \u2603) {
        \u2603 /= 4.0f;
        if (\u2603 < 1.0f) {
            \u2603 = 1.0f;
        }
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null && this.b[i].b() instanceof yj) {
                this.b[i].a((int)\u2603, this.d);
                if (this.b[i].b == 0) {
                    this.b[i] = null;
                }
            }
        }
    }
    
    public void n() {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null) {
                this.d.a(this.a[i], true, false);
                this.a[i] = null;
            }
        }
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null) {
                this.d.a(this.b[i], true, false);
                this.b[i] = null;
            }
        }
    }
    
    @Override
    public void p_() {
        this.e = true;
    }
    
    public void b(final zx \u2603) {
        this.f = \u2603;
    }
    
    public zx p() {
        return this.f;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return !this.d.I && \u2603.h(this.d) <= 64.0;
    }
    
    public boolean c(final zx \u2603) {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null && this.b[i].a(\u2603)) {
                return true;
            }
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null && this.a[i].a(\u2603)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return true;
    }
    
    public void b(final wm \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = zx.b(\u2603.a[i]);
        }
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = zx.b(\u2603.b[i]);
        }
        this.c = \u2603.c;
    }
    
    @Override
    public int a_(final int \u2603) {
        return 0;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = null;
        }
    }
}
