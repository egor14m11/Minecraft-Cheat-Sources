import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class akx extends alk implements km, ot
{
    private static final int[] a;
    private static final int[] f;
    private zx[] g;
    private int h;
    private boolean[] i;
    private zw j;
    private String k;
    
    public akx() {
        this.g = new zx[4];
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.k : "container.brewing";
    }
    
    @Override
    public boolean l_() {
        return this.k != null && this.k.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.k = \u2603;
    }
    
    @Override
    public int o_() {
        return this.g.length;
    }
    
    @Override
    public void c() {
        if (this.h > 0) {
            --this.h;
            if (this.h == 0) {
                this.o();
                this.p_();
            }
            else if (!this.n()) {
                this.h = 0;
                this.p_();
            }
            else if (this.j != this.g[3].b()) {
                this.h = 0;
                this.p_();
            }
        }
        else if (this.n()) {
            this.h = 400;
            this.j = this.g[3].b();
        }
        if (!this.b.D) {
            final boolean[] m = this.m();
            if (!Arrays.equals(m, this.i)) {
                this.i = m;
                alz \u2603 = this.b.p(this.v());
                if (!(\u2603.c() instanceof afl)) {
                    return;
                }
                for (int i = 0; i < afl.a.length; ++i) {
                    \u2603 = \u2603.a((amo<Comparable>)afl.a[i], m[i]);
                }
                this.b.a(this.c, \u2603, 2);
            }
        }
    }
    
    private boolean n() {
        if (this.g[3] == null || this.g[3].b <= 0) {
            return false;
        }
        final zx zx = this.g[3];
        if (!zx.b().l(zx)) {
            return false;
        }
        boolean b = false;
        for (int i = 0; i < 3; ++i) {
            if (this.g[i] != null && this.g[i].b() == zy.bz) {
                final int j = this.g[i].i();
                final int c = this.c(j, zx);
                if (!aai.f(j) && aai.f(c)) {
                    b = true;
                    break;
                }
                final List<pf> e = zy.bz.e(j);
                final List<pf> e2 = zy.bz.e(c);
                if (j <= 0 || e != e2) {
                    if (e != null) {
                        if (e.equals(e2)) {
                            continue;
                        }
                        if (e2 == null) {
                            continue;
                        }
                    }
                    if (j != c) {
                        b = true;
                        break;
                    }
                }
            }
        }
        return b;
    }
    
    private void o() {
        if (!this.n()) {
            return;
        }
        final zx \u2603 = this.g[3];
        for (int i = 0; i < 3; ++i) {
            if (this.g[i] != null && this.g[i].b() == zy.bz) {
                final int j = this.g[i].i();
                final int c = this.c(j, \u2603);
                final List<pf> e = zy.bz.e(j);
                final List<pf> e2 = zy.bz.e(c);
                if ((j > 0 && e == e2) || (e != null && (e.equals(e2) || e2 == null))) {
                    if (!aai.f(j) && aai.f(c)) {
                        this.g[i].b(c);
                    }
                }
                else if (j != c) {
                    this.g[i].b(c);
                }
            }
        }
        if (\u2603.b().r()) {
            this.g[3] = new zx(\u2603.b().q());
        }
        else {
            final zx zx = this.g[3];
            --zx.b;
            if (this.g[3].b <= 0) {
                this.g[3] = null;
            }
        }
    }
    
    private int c(final int \u2603, final zx \u2603) {
        if (\u2603 == null) {
            return \u2603;
        }
        if (\u2603.b().l(\u2603)) {
            return abe.a(\u2603, \u2603.b().j(\u2603));
        }
        return \u2603;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.g = new zx[this.o_()];
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int d = b.d("Slot");
            if (d >= 0 && d < this.g.length) {
                this.g[d] = zx.a(b);
            }
        }
        this.h = \u2603.e("BrewTime");
        if (\u2603.b("CustomName", 8)) {
            this.k = \u2603.j("CustomName");
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("BrewTime", (short)this.h);
        final du \u26032 = new du();
        for (int i = 0; i < this.g.length; ++i) {
            if (this.g[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.g[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
        if (this.l_()) {
            \u2603.a("CustomName", this.k);
        }
    }
    
    @Override
    public zx a(final int \u2603) {
        if (\u2603 >= 0 && \u2603 < this.g.length) {
            return this.g[\u2603];
        }
        return null;
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (\u2603 >= 0 && \u2603 < this.g.length) {
            final zx zx = this.g[\u2603];
            this.g[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (\u2603 >= 0 && \u2603 < this.g.length) {
            final zx zx = this.g[\u2603];
            this.g[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        if (\u2603 >= 0 && \u2603 < this.g.length) {
            this.g[\u2603] = \u2603;
        }
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.b.s(this.c) == this && \u2603.e(this.c.n() + 0.5, this.c.o() + 0.5, this.c.p() + 0.5) <= 64.0;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        if (\u2603 == 3) {
            return \u2603.b().l(\u2603);
        }
        return \u2603.b() == zy.bz || \u2603.b() == zy.bA;
    }
    
    public boolean[] m() {
        final boolean[] array = new boolean[3];
        for (int i = 0; i < 3; ++i) {
            if (this.g[i] != null) {
                array[i] = true;
            }
        }
        return array;
    }
    
    @Override
    public int[] a(final cq \u2603) {
        if (\u2603 == cq.b) {
            return akx.a;
        }
        return akx.f;
    }
    
    @Override
    public boolean a(final int \u2603, final zx \u2603, final cq \u2603) {
        return this.b(\u2603, \u2603);
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603, final cq \u2603) {
        return true;
    }
    
    @Override
    public String k() {
        return "minecraft:brewing_stand";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xm(\u2603, this);
    }
    
    @Override
    public int a_(final int \u2603) {
        switch (\u2603) {
            case 0: {
                return this.h;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        switch (\u2603) {
            case 0: {
                this.h = \u2603;
                break;
            }
        }
    }
    
    @Override
    public int g() {
        return 1;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.g.length; ++i) {
            this.g[i] = null;
        }
    }
    
    static {
        a = new int[] { 3 };
        f = new int[] { 0, 1, 2 };
    }
}
