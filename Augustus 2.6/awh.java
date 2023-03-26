import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Ordering;

// 
// Decompiled by Procyon v0.5.36
// 

public class awh extends avp
{
    private static final Ordering<bdc> a;
    private final ave f;
    private final avo g;
    private eu h;
    private eu i;
    private long j;
    private boolean k;
    
    public awh(final ave \u2603, final avo \u2603) {
        this.f = \u2603;
        this.g = \u2603;
    }
    
    public String a(final bdc \u2603) {
        if (\u2603.k() != null) {
            return \u2603.k().d();
        }
        return aul.a(\u2603.i(), \u2603.a().getName());
    }
    
    public void a(final boolean \u2603) {
        if (\u2603 && !this.k) {
            this.j = ave.J();
        }
        this.k = \u2603;
    }
    
    public void a(final int \u2603, final auo \u2603, final auk \u2603) {
        final bcy a = this.f.h.a;
        List<bdc> list = awh.a.sortedCopy(a.d());
        int max = 0;
        int max2 = 0;
        for (final bdc \u26032 : list) {
            int n = this.f.k.a(this.a(\u26032));
            max = Math.max(max, n);
            if (\u2603 != null && \u2603.e() != auu.a.b) {
                n = this.f.k.a(" " + \u2603.c(\u26032.a().getName(), \u2603).c());
                max2 = Math.max(max2, n);
            }
        }
        list = list.subList(0, Math.min(list.size(), 80));
        int n;
        int i;
        int n2;
        for (n2 = (i = list.size()), n = 1; i > 20; i = (n2 + n - 1) / n) {
            ++n;
        }
        final boolean b = this.f.E() || this.f.u().a().f();
        int n3;
        if (\u2603 != null) {
            if (\u2603.e() == auu.a.b) {
                n3 = 90;
            }
            else {
                n3 = max2;
            }
        }
        else {
            n3 = 0;
        }
        final int \u26033 = Math.min(n * ((b ? 9 : 0) + max + n3 + 13), \u2603 - 50) / n;
        final int n4 = \u2603 / 2 - (\u26033 * n + (n - 1) * 5) / 2;
        int n5 = 10;
        int n6 = \u26033 * n + (n - 1) * 5;
        List<String> c = null;
        List<String> c2 = null;
        if (this.i != null) {
            c = this.f.k.c(this.i.d(), \u2603 - 50);
            for (final String s : c) {
                n6 = Math.max(n6, this.f.k.a(s));
            }
        }
        if (this.h != null) {
            c2 = this.f.k.c(this.h.d(), \u2603 - 50);
            for (final String s : c2) {
                n6 = Math.max(n6, this.f.k.a(s));
            }
        }
        if (c != null) {
            avp.a(\u2603 / 2 - n6 / 2 - 1, n5 - 1, \u2603 / 2 + n6 / 2 + 1, n5 + c.size() * this.f.k.a, Integer.MIN_VALUE);
            for (final String s : c) {
                final int n7 = this.f.k.a(s);
                this.f.k.a(s, (float)(\u2603 / 2 - n7 / 2), (float)n5, -1);
                n5 += this.f.k.a;
            }
            ++n5;
        }
        avp.a(\u2603 / 2 - n6 / 2 - 1, n5 - 1, \u2603 / 2 + n6 / 2 + 1, n5 + i * 9, Integer.MIN_VALUE);
        for (int j = 0; j < n2; ++j) {
            final int n8 = j / i;
            final int n7 = j % i;
            int \u26034 = n4 + n8 * \u26033 + n8 * 5;
            final int \u26035 = n5 + n7 * 9;
            avp.a(\u26034, \u26035, \u26034 + \u26033, \u26035 + 8, 553648127);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            bfl.d();
            bfl.l();
            bfl.a(770, 771, 1, 0);
            if (j < list.size()) {
                final bdc \u26036 = list.get(j);
                String \u26037 = this.a(\u26036);
                final GameProfile a2 = \u26036.a();
                if (b) {
                    final wn b2 = this.f.f.b(a2.getId());
                    final boolean b3 = b2 != null && b2.a(wo.a) && (a2.getName().equals("Dinnerbone") || a2.getName().equals("Grumm"));
                    this.f.P().a(\u26036.g());
                    final int n9 = 8 + (b3 ? 8 : 0);
                    final int \u26038 = 8 * (b3 ? -1 : 1);
                    avp.a(\u26034, \u26035, 8.0f, (float)n9, 8, \u26038, 8, 8, 64.0f, 64.0f);
                    if (b2 != null && b2.a(wo.g)) {
                        final int n10 = 8 + (b3 ? 8 : 0);
                        final int \u26039 = 8 * (b3 ? -1 : 1);
                        avp.a(\u26034, \u26035, 40.0f, (float)n10, 8, \u26039, 8, 8, 64.0f, 64.0f);
                    }
                    \u26034 += 9;
                }
                if (\u26036.b() == adp.a.e) {
                    \u26037 = a.u + \u26037;
                    this.f.k.a(\u26037, (float)\u26034, (float)\u26035, -1862270977);
                }
                else {
                    this.f.k.a(\u26037, (float)\u26034, (float)\u26035, -1);
                }
                if (\u2603 != null && \u26036.b() != adp.a.e) {
                    final int \u260310 = \u26034 + max + 1;
                    final int \u260311 = \u260310 + n3;
                    if (\u260311 - \u260310 > 5) {
                        this.a(\u2603, \u26035, a2.getName(), \u260310, \u260311, \u26036);
                    }
                }
                this.a(\u26033, \u26034 - (b ? 9 : 0), \u26035, \u26036);
            }
        }
        if (c2 != null) {
            n5 += i * 9 + 1;
            avp.a(\u2603 / 2 - n6 / 2 - 1, n5 - 1, \u2603 / 2 + n6 / 2 + 1, n5 + c2.size() * this.f.k.a, Integer.MIN_VALUE);
            for (final String s : c2) {
                final int n7 = this.f.k.a(s);
                this.f.k.a(s, (float)(\u2603 / 2 - n7 / 2), (float)n5, -1);
                n5 += this.f.k.a;
            }
        }
    }
    
    protected void a(final int \u2603, final int \u2603, final int \u2603, final bdc \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(awh.d);
        final int n = 0;
        int n2 = 0;
        if (\u2603.c() < 0) {
            n2 = 5;
        }
        else if (\u2603.c() < 150) {
            n2 = 0;
        }
        else if (\u2603.c() < 300) {
            n2 = 1;
        }
        else if (\u2603.c() < 600) {
            n2 = 2;
        }
        else if (\u2603.c() < 1000) {
            n2 = 3;
        }
        else {
            n2 = 4;
        }
        this.e += 100.0f;
        this.b(\u2603 + \u2603 - 11, \u2603, 0 + n * 10, 176 + n2 * 8, 10, 8);
        this.e -= 100.0f;
    }
    
    private void a(final auk \u2603, final int \u2603, final String \u2603, final int \u2603, final int \u2603, final bdc \u2603) {
        final int c = \u2603.a().c(\u2603, \u2603).c();
        if (\u2603.e() == auu.a.b) {
            this.f.P().a(awh.d);
            if (this.j == \u2603.p()) {
                if (c < \u2603.l()) {
                    \u2603.a(ave.J());
                    \u2603.b((long)(this.g.e() + 20));
                }
                else if (c > \u2603.l()) {
                    \u2603.a(ave.J());
                    \u2603.b((long)(this.g.e() + 10));
                }
            }
            if (ave.J() - \u2603.n() > 1000L || this.j != \u2603.p()) {
                \u2603.b(c);
                \u2603.c(c);
                \u2603.a(ave.J());
            }
            \u2603.c(this.j);
            \u2603.b(c);
            final int f = ns.f(Math.max(c, \u2603.m()) / 2.0f);
            final int max = Math.max(ns.f((float)(c / 2)), Math.max(ns.f((float)(\u2603.m() / 2)), 10));
            final boolean b = \u2603.o() > this.g.e() && (\u2603.o() - this.g.e()) / 3L % 2L == 1L;
            if (f > 0) {
                final float min = Math.min((\u2603 - \u2603 - 4) / (float)max, 9.0f);
                if (min > 3.0f) {
                    for (int i = f; i < max; ++i) {
                        this.a(\u2603 + i * min, (float)\u2603, b ? 25 : 16, 0, 9, 9);
                    }
                    for (int i = 0; i < f; ++i) {
                        this.a(\u2603 + i * min, (float)\u2603, b ? 25 : 16, 0, 9, 9);
                        if (b) {
                            if (i * 2 + 1 < \u2603.m()) {
                                this.a(\u2603 + i * min, (float)\u2603, 70, 0, 9, 9);
                            }
                            if (i * 2 + 1 == \u2603.m()) {
                                this.a(\u2603 + i * min, (float)\u2603, 79, 0, 9, 9);
                            }
                        }
                        if (i * 2 + 1 < c) {
                            this.a(\u2603 + i * min, (float)\u2603, (i >= 10) ? 160 : 52, 0, 9, 9);
                        }
                        if (i * 2 + 1 == c) {
                            this.a(\u2603 + i * min, (float)\u2603, (i >= 10) ? 169 : 61, 0, 9, 9);
                        }
                    }
                }
                else {
                    final float a = ns.a(c / 20.0f, 0.0f, 1.0f);
                    final int \u26032 = (int)((1.0f - a) * 255.0f) << 16 | (int)(a * 255.0f) << 8;
                    String s = "" + c / 2.0f;
                    if (\u2603 - this.f.k.a(s + "hp") >= \u2603) {
                        s += "hp";
                    }
                    this.f.k.a(s, (float)((\u2603 + \u2603) / 2 - this.f.k.a(s) / 2), (float)\u2603, \u26032);
                }
            }
        }
        else {
            final String string = a.o + "" + c;
            this.f.k.a(string, (float)(\u2603 - this.f.k.a(string)), (float)\u2603, 16777215);
        }
    }
    
    public void a(final eu \u2603) {
        this.h = \u2603;
    }
    
    public void b(final eu \u2603) {
        this.i = \u2603;
    }
    
    public void a() {
        this.i = null;
        this.h = null;
    }
    
    static {
        a = Ordering.from((Comparator<bdc>)new a());
    }
    
    static class a implements Comparator<bdc>
    {
        private a() {
        }
        
        public int a(final bdc \u2603, final bdc \u2603) {
            final aul i = \u2603.i();
            final aul j = \u2603.i();
            return ComparisonChain.start().compareTrueFirst(\u2603.b() != adp.a.e, \u2603.b() != adp.a.e).compare((i != null) ? i.b() : "", (j != null) ? j.b() : "").compare(\u2603.a().getName(), \u2603.a().getName()).result();
        }
    }
}
