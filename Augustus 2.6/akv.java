import java.util.Arrays;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class akv extends alk implements km, og
{
    public static final pe[][] a;
    private final List<a> f;
    private long g;
    private float h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private zx m;
    private String n;
    
    public akv() {
        this.f = (List<a>)Lists.newArrayList();
        this.j = -1;
    }
    
    @Override
    public void c() {
        if (this.b.K() % 80L == 0L) {
            this.m();
        }
    }
    
    public void m() {
        this.B();
        this.A();
    }
    
    private void A() {
        if (this.i && this.j > 0 && !this.b.D && this.k > 0) {
            final double n = this.j * 10 + 10;
            int \u2603 = 0;
            if (this.j >= 4 && this.k == this.l) {
                \u2603 = 1;
            }
            final int n2 = this.c.n();
            final int o = this.c.o();
            final int p = this.c.p();
            final aug a = new aug(n2, o, p, n2 + 1, o + 1, p + 1).b(n, n, n).a(0.0, this.b.U(), 0.0);
            final List<wn> a2 = this.b.a((Class<? extends wn>)wn.class, a);
            for (final wn wn : a2) {
                wn.c(new pf(this.k, 180, \u2603, true, true));
            }
            if (this.j >= 4 && this.k != this.l && this.l > 0) {
                for (final wn wn : a2) {
                    wn.c(new pf(this.l, 180, 0, true, true));
                }
            }
        }
    }
    
    private void B() {
        final int j = this.j;
        final int n = this.c.n();
        final int o = this.c.o();
        final int p = this.c.p();
        this.j = 0;
        this.f.clear();
        this.i = true;
        a a = new a(tv.a(zd.a));
        this.f.add(a);
        boolean b = true;
        final cj.a a2 = new cj.a();
        for (int i = o + 1; i < 256; ++i) {
            final alz p2 = this.b.p(a2.c(n, i, p));
            float[] array;
            if (p2.c() == afi.cG) {
                array = tv.a(p2.b(ajs.a));
            }
            else if (p2.c() == afi.cH) {
                array = tv.a(p2.b(ajt.a));
            }
            else {
                if (p2.c().p() < 15 || p2.c() == afi.h) {
                    a.a();
                    continue;
                }
                this.i = false;
                this.f.clear();
                break;
            }
            if (!b) {
                array = new float[] { (a.b()[0] + array[0]) / 2.0f, (a.b()[1] + array[1]) / 2.0f, (a.b()[2] + array[2]) / 2.0f };
            }
            if (Arrays.equals(array, a.b())) {
                a.a();
            }
            else {
                a = new a(array);
                this.f.add(a);
            }
            b = false;
        }
        if (this.i) {
            for (int i = 1; i <= 4; ++i) {
                final int \u2603 = o - i;
                if (\u2603 < 0) {
                    break;
                }
                boolean b2 = true;
                for (int \u26032 = n - i; \u26032 <= n + i && b2; ++\u26032) {
                    for (int k = p - i; k <= p + i; ++k) {
                        final afh c = this.b.p(new cj(\u26032, \u2603, k)).c();
                        if (c != afi.bT && c != afi.R && c != afi.ah && c != afi.S) {
                            b2 = false;
                            break;
                        }
                    }
                }
                if (!b2) {
                    break;
                }
                this.j = i;
            }
            if (this.j == 0) {
                this.i = false;
            }
        }
        if (!this.b.D && this.j == 4 && j < this.j) {
            for (final wn wn : this.b.a((Class<? extends pk>)wn.class, new aug(n, o, p, n, o - 4, p).b(10.0, 5.0, 10.0))) {
                wn.b(mr.K);
            }
        }
    }
    
    public List<a> n() {
        return this.f;
    }
    
    public float o() {
        if (!this.i) {
            return 0.0f;
        }
        final int n = (int)(this.b.K() - this.g);
        this.g = this.b.K();
        if (n > 1) {
            this.h -= n / 40.0f;
            if (this.h < 0.0f) {
                this.h = 0.0f;
            }
        }
        this.h += 0.025f;
        if (this.h > 1.0f) {
            this.h = 1.0f;
        }
        return this.h;
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        return new ft(this.c, 3, dn);
    }
    
    @Override
    public double s() {
        return 65536.0;
    }
    
    private int h(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= pe.a.length || pe.a[\u2603] == null) {
            return 0;
        }
        final pe pe = pe.a[\u2603];
        if (pe != pe.c && pe != pe.e && pe != pe.m && pe != pe.j && pe != pe.g && pe != pe.l) {
            return 0;
        }
        return \u2603;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.k = this.h(\u2603.f("Primary"));
        this.l = this.h(\u2603.f("Secondary"));
        this.j = \u2603.f("Levels");
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Primary", this.k);
        \u2603.a("Secondary", this.l);
        \u2603.a("Levels", this.j);
    }
    
    @Override
    public int o_() {
        return 1;
    }
    
    @Override
    public zx a(final int \u2603) {
        if (\u2603 == 0) {
            return this.m;
        }
        return null;
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (\u2603 != 0 || this.m == null) {
            return null;
        }
        if (\u2603 >= this.m.b) {
            final zx m = this.m;
            this.m = null;
            return m;
        }
        final zx i = this.m;
        i.b -= \u2603;
        return new zx(this.m.b(), \u2603, this.m.i());
    }
    
    @Override
    public zx b(final int \u2603) {
        if (\u2603 == 0 && this.m != null) {
            final zx m = this.m;
            this.m = null;
            return m;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        if (\u2603 == 0) {
            this.m = \u2603;
        }
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.n : "container.beacon";
    }
    
    @Override
    public boolean l_() {
        return this.n != null && this.n.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.n = \u2603;
    }
    
    @Override
    public int q_() {
        return 1;
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
        return \u2603.b() == zy.bO || \u2603.b() == zy.i || \u2603.b() == zy.k || \u2603.b() == zy.j;
    }
    
    @Override
    public String k() {
        return "minecraft:beacon";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xl(\u2603, this);
    }
    
    @Override
    public int a_(final int \u2603) {
        switch (\u2603) {
            case 0: {
                return this.j;
            }
            case 1: {
                return this.k;
            }
            case 2: {
                return this.l;
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
                this.j = \u2603;
                break;
            }
            case 1: {
                this.k = this.h(\u2603);
                break;
            }
            case 2: {
                this.l = this.h(\u2603);
                break;
            }
        }
    }
    
    @Override
    public int g() {
        return 3;
    }
    
    @Override
    public void l() {
        this.m = null;
    }
    
    @Override
    public boolean c(final int \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.m();
            return true;
        }
        return super.c(\u2603, \u2603);
    }
    
    static {
        a = new pe[][] { { pe.c, pe.e }, { pe.m, pe.j }, { pe.g }, { pe.l } };
    }
    
    public static class a
    {
        private final float[] a;
        private int b;
        
        public a(final float[] \u2603) {
            this.a = \u2603;
            this.b = 1;
        }
        
        protected void a() {
            ++this.b;
        }
        
        public float[] b() {
            return this.a;
        }
        
        public int c() {
            return this.b;
        }
    }
}
