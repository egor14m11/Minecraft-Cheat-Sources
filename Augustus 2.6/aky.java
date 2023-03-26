import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aky extends alk implements km, og
{
    private zx[] m;
    public boolean a;
    public aky f;
    public aky g;
    public aky h;
    public aky i;
    public float j;
    public float k;
    public int l;
    private int n;
    private int o;
    private String p;
    
    public aky() {
        this.m = new zx[27];
        this.o = -1;
    }
    
    public aky(final int \u2603) {
        this.m = new zx[27];
        this.o = \u2603;
    }
    
    @Override
    public int o_() {
        return 27;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.m[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.m[\u2603] == null) {
            return null;
        }
        if (this.m[\u2603].b <= \u2603) {
            final zx a = this.m[\u2603];
            this.m[\u2603] = null;
            this.p_();
            return a;
        }
        final zx a = this.m[\u2603].a(\u2603);
        if (this.m[\u2603].b == 0) {
            this.m[\u2603] = null;
        }
        this.p_();
        return a;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.m[\u2603] != null) {
            final zx zx = this.m[\u2603];
            this.m[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.m[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
        this.p_();
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.p : "container.chest";
    }
    
    @Override
    public boolean l_() {
        return this.p != null && this.p.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.p = \u2603;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.m = new zx[this.o_()];
        if (\u2603.b("CustomName", 8)) {
            this.p = \u2603.j("CustomName");
        }
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int n = b.d("Slot") & 0xFF;
            if (n >= 0 && n < this.m.length) {
                this.m[n] = zx.a(b);
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final du \u26032 = new du();
        for (int i = 0; i < this.m.length; ++i) {
            if (this.m[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.m[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
        if (this.l_()) {
            \u2603.a("CustomName", this.p);
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
    public void E() {
        super.E();
        this.a = false;
    }
    
    private void a(final aky \u2603, final cq \u2603) {
        if (\u2603.x()) {
            this.a = false;
        }
        else if (this.a) {
            switch (aky$1.a[\u2603.ordinal()]) {
                case 1: {
                    if (this.f != \u2603) {
                        this.a = false;
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.i != \u2603) {
                        this.a = false;
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.g != \u2603) {
                        this.a = false;
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.h != \u2603) {
                        this.a = false;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void m() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.h = this.a(cq.e);
        this.g = this.a(cq.f);
        this.f = this.a(cq.c);
        this.i = this.a(cq.d);
    }
    
    protected aky a(final cq \u2603) {
        final cj a = this.c.a(\u2603);
        if (this.b(a)) {
            final akw s = this.b.s(a);
            if (s instanceof aky) {
                final aky aky = (aky)s;
                aky.a(this, \u2603.d());
                return aky;
            }
        }
        return null;
    }
    
    private boolean b(final cj \u2603) {
        if (this.b == null) {
            return false;
        }
        final afh c = this.b.p(\u2603).c();
        return c instanceof afs && ((afs)c).b == this.n();
    }
    
    @Override
    public void c() {
        this.m();
        final int n = this.c.n();
        final int o = this.c.o();
        final int p = this.c.p();
        ++this.n;
        if (!this.b.D && this.l != 0 && (this.n + n + o + p) % 200 == 0) {
            this.l = 0;
            final float n2 = 5.0f;
            final List<wn> a = this.b.a((Class<? extends wn>)wn.class, new aug(n - n2, o - n2, p - n2, n + 1 + n2, o + 1 + n2, p + 1 + n2));
            for (final wn wn : a) {
                if (wn.bk instanceof xo) {
                    final og e = ((xo)wn.bk).e();
                    if (e != this && (!(e instanceof of) || !((of)e).a(this))) {
                        continue;
                    }
                    ++this.l;
                }
            }
        }
        this.k = this.j;
        final float n2 = 0.1f;
        if (this.l > 0 && this.j == 0.0f && this.f == null && this.h == null) {
            double \u2603 = n + 0.5;
            double n3 = p + 0.5;
            if (this.i != null) {
                n3 += 0.5;
            }
            if (this.g != null) {
                \u2603 += 0.5;
            }
            this.b.a(\u2603, o + 0.5, n3, "random.chestopen", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
        }
        if ((this.l == 0 && this.j > 0.0f) || (this.l > 0 && this.j < 1.0f)) {
            final float j = this.j;
            if (this.l > 0) {
                this.j += n2;
            }
            else {
                this.j -= n2;
            }
            if (this.j > 1.0f) {
                this.j = 1.0f;
            }
            final float n4 = 0.5f;
            if (this.j < n4 && j >= n4 && this.f == null && this.h == null) {
                double n3 = n + 0.5;
                double \u26032 = p + 0.5;
                if (this.i != null) {
                    \u26032 += 0.5;
                }
                if (this.g != null) {
                    n3 += 0.5;
                }
                this.b.a(n3, o + 0.5, \u26032, "random.chestclosed", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
            }
            if (this.j < 0.0f) {
                this.j = 0.0f;
            }
        }
    }
    
    @Override
    public boolean c(final int \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.l = \u2603;
            return true;
        }
        return super.c(\u2603, \u2603);
    }
    
    @Override
    public void b(final wn \u2603) {
        if (!\u2603.v()) {
            if (this.l < 0) {
                this.l = 0;
            }
            ++this.l;
            this.b.c(this.c, this.w(), 1, this.l);
            this.b.c(this.c, this.w());
            this.b.c(this.c.b(), this.w());
        }
    }
    
    @Override
    public void c(final wn \u2603) {
        if (!\u2603.v() && this.w() instanceof afs) {
            --this.l;
            this.b.c(this.c, this.w(), 1, this.l);
            this.b.c(this.c, this.w());
            this.b.c(this.c.b(), this.w());
        }
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return true;
    }
    
    @Override
    public void y() {
        super.y();
        this.E();
        this.m();
    }
    
    public int n() {
        if (this.o == -1) {
            if (this.b == null || !(this.w() instanceof afs)) {
                return 0;
            }
            this.o = ((afs)this.w()).b;
        }
        return this.o;
    }
    
    @Override
    public String k() {
        return "minecraft:chest";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xo(\u2603, this, \u2603);
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
        for (int i = 0; i < this.m.length; ++i) {
            this.m[i] = null;
        }
    }
}
