import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class xs extends xi
{
    public og a;
    private adm i;
    private cj j;
    private Random k;
    public int f;
    public int[] g;
    public int[] h;
    
    public xs(final wm \u2603, final adm \u2603) {
        this(\u2603, \u2603, cj.a);
    }
    
    public xs(final wm \u2603, final adm \u2603, final cj \u2603) {
        this.a = new oq("Enchant", true, 2) {
            @Override
            public int q_() {
                return 64;
            }
            
            @Override
            public void p_() {
                super.p_();
                xs.this.a(this);
            }
        };
        this.k = new Random();
        this.g = new int[3];
        this.h = new int[] { -1, -1, -1 };
        this.i = \u2603;
        this.j = \u2603;
        this.f = \u2603.d.cj();
        this.a(new yg(this.a, 0, 15, 47) {
            @Override
            public boolean a(final zx \u2603) {
                return true;
            }
            
            @Override
            public int a() {
                return 1;
            }
        });
        this.a(new yg(this.a, 1, 35, 47) {
            @Override
            public boolean a(final zx \u2603) {
                return \u2603.b() == zy.aW && zd.a(\u2603.i()) == zd.l;
            }
        });
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 142));
        }
    }
    
    @Override
    public void a(final xn \u2603) {
        super.a(\u2603);
        \u2603.a(this, 0, this.g[0]);
        \u2603.a(this, 1, this.g[1]);
        \u2603.a(this, 2, this.g[2]);
        \u2603.a(this, 3, this.f & 0xFFFFFFF0);
        \u2603.a(this, 4, this.h[0]);
        \u2603.a(this, 5, this.h[1]);
        \u2603.a(this, 6, this.h[2]);
    }
    
    @Override
    public void b() {
        super.b();
        for (int i = 0; i < this.e.size(); ++i) {
            final xn xn = this.e.get(i);
            xn.a(this, 0, this.g[0]);
            xn.a(this, 1, this.g[1]);
            xn.a(this, 2, this.g[2]);
            xn.a(this, 3, this.f & 0xFFFFFFF0);
            xn.a(this, 4, this.h[0]);
            xn.a(this, 5, this.h[1]);
            xn.a(this, 6, this.h[2]);
        }
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        if (\u2603 >= 0 && \u2603 <= 2) {
            this.g[\u2603] = \u2603;
        }
        else if (\u2603 == 3) {
            this.f = \u2603;
        }
        else if (\u2603 >= 4 && \u2603 <= 6) {
            this.h[\u2603 - 4] = \u2603;
        }
        else {
            super.b(\u2603, \u2603);
        }
    }
    
    @Override
    public void a(final og \u2603) {
        if (\u2603 == this.a) {
            final zx a = \u2603.a(0);
            if (a == null || !a.v()) {
                for (int i = 0; i < 3; ++i) {
                    this.g[i] = 0;
                    this.h[i] = -1;
                }
            }
            else if (!this.i.D) {
                int i = 0;
                for (int j = -1; j <= 1; ++j) {
                    for (int k = -1; k <= 1; ++k) {
                        if (j != 0 || k != 0) {
                            if (this.i.d(this.j.a(k, 0, j)) && this.i.d(this.j.a(k, 1, j))) {
                                if (this.i.p(this.j.a(k * 2, 0, j * 2)).c() == afi.X) {
                                    ++i;
                                }
                                if (this.i.p(this.j.a(k * 2, 1, j * 2)).c() == afi.X) {
                                    ++i;
                                }
                                if (k != 0 && j != 0) {
                                    if (this.i.p(this.j.a(k * 2, 0, j)).c() == afi.X) {
                                        ++i;
                                    }
                                    if (this.i.p(this.j.a(k * 2, 1, j)).c() == afi.X) {
                                        ++i;
                                    }
                                    if (this.i.p(this.j.a(k, 0, j * 2)).c() == afi.X) {
                                        ++i;
                                    }
                                    if (this.i.p(this.j.a(k, 1, j * 2)).c() == afi.X) {
                                        ++i;
                                    }
                                }
                            }
                        }
                    }
                }
                this.k.setSeed(this.f);
                for (int j = 0; j < 3; ++j) {
                    this.g[j] = ack.a(this.k, j, i, a);
                    this.h[j] = -1;
                    if (this.g[j] < j + 1) {
                        this.g[j] = 0;
                    }
                }
                for (int j = 0; j < 3; ++j) {
                    if (this.g[j] > 0) {
                        final List<acl> a2 = this.a(a, j, this.g[j]);
                        if (a2 != null && !a2.isEmpty()) {
                            final acl acl = a2.get(this.k.nextInt(a2.size()));
                            this.h[j] = (acl.b.B | acl.c << 8);
                        }
                    }
                }
                this.b();
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603, final int \u2603) {
        final zx a = this.a.a(0);
        final zx a2 = this.a.a(1);
        final int \u26032 = \u2603 + 1;
        if ((a2 == null || a2.b < \u26032) && !\u2603.bA.d) {
            return false;
        }
        if (this.g[\u2603] > 0 && a != null && ((\u2603.bB >= \u26032 && \u2603.bB >= this.g[\u2603]) || \u2603.bA.d)) {
            if (!this.i.D) {
                final List<acl> a3 = this.a(a, \u2603, this.g[\u2603]);
                final boolean b = a.b() == zy.aL;
                if (a3 != null) {
                    \u2603.b(\u26032);
                    if (b) {
                        a.a(zy.cd);
                    }
                    for (int i = 0; i < a3.size(); ++i) {
                        final acl \u26033 = a3.get(i);
                        if (b) {
                            zy.cd.a(a, \u26033);
                        }
                        else {
                            a.a(\u26033.b, \u26033.c);
                        }
                    }
                    if (!\u2603.bA.d) {
                        final zx zx = a2;
                        zx.b -= \u26032;
                        if (a2.b <= 0) {
                            this.a.a(1, null);
                        }
                    }
                    \u2603.b(na.W);
                    this.a.p_();
                    this.f = \u2603.cj();
                    this.a(this.a);
                }
            }
            return true;
        }
        return false;
    }
    
    private List<acl> a(final zx \u2603, final int \u2603, final int \u2603) {
        this.k.setSeed(this.f + \u2603);
        final List<acl> b = ack.b(this.k, \u2603, \u2603);
        if (\u2603.b() == zy.aL && b != null && b.size() > 1) {
            b.remove(this.k.nextInt(b.size()));
        }
        return b;
    }
    
    public int e() {
        final zx a = this.a.a(1);
        if (a == null) {
            return 0;
        }
        return a.b;
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        if (this.i.D) {
            return;
        }
        for (int i = 0; i < this.a.o_(); ++i) {
            final zx b = this.a.b(i);
            if (b != null) {
                \u2603.a(b, false);
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.i.p(this.j).c() == afi.bC && \u2603.e(this.j.n() + 0.5, this.j.o() + 0.5, this.j.p() + 0.5) <= 64.0;
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 == 0) {
                if (!this.a(d, 2, 38, true)) {
                    return null;
                }
            }
            else if (\u2603 == 1) {
                if (!this.a(d, 2, 38, true)) {
                    return null;
                }
            }
            else if (d.b() == zy.aW && zd.a(d.i()) == zd.l) {
                if (!this.a(d, 1, 2, true)) {
                    return null;
                }
            }
            else {
                if (this.c.get(0).e() || !this.c.get(0).a(d)) {
                    return null;
                }
                if (d.n() && d.b == 1) {
                    this.c.get(0).d(d.k());
                    d.b = 0;
                }
                else if (d.b >= 1) {
                    this.c.get(0).d(new zx(d.b(), 1, d.i()));
                    final zx zx = d;
                    --zx.b;
                }
            }
            if (d.b == 0) {
                yg.d(null);
            }
            else {
                yg.f();
            }
            if (d.b == k.b) {
                return null;
            }
            yg.a(\u2603, d);
        }
        return k;
    }
}
