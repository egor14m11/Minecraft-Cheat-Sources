import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class avt extends avp
{
    private static final Logger a;
    private final ave f;
    private final List<String> g;
    private final List<ava> h;
    private final List<ava> i;
    private int j;
    private boolean k;
    
    public avt(final ave \u2603) {
        this.g = (List<String>)Lists.newArrayList();
        this.h = (List<ava>)Lists.newArrayList();
        this.i = (List<ava>)Lists.newArrayList();
        this.f = \u2603;
    }
    
    public void a(final int \u2603) {
        if (this.f.t.m == wn.b.c) {
            return;
        }
        final int i = this.i();
        boolean b = false;
        int n = 0;
        final int size = this.i.size();
        final float n2 = this.f.t.q * 0.9f + 0.1f;
        if (size <= 0) {
            return;
        }
        if (this.e()) {
            b = true;
        }
        final float h = this.h();
        final int f = ns.f(this.f() / h);
        bfl.E();
        bfl.b(2.0f, 20.0f, 0.0f);
        bfl.a(h, h, 1.0f);
        for (int a = 0; a + this.j < this.i.size() && a < i; ++a) {
            final ava ava = this.i.get(a + this.j);
            if (ava != null) {
                final int n3 = \u2603 - ava.b();
                if (n3 < 200 || b) {
                    double a2 = n3 / 200.0;
                    a2 = 1.0 - a2;
                    a2 *= 10.0;
                    a2 = ns.a(a2, 0.0, 1.0);
                    a2 *= a2;
                    int n4 = (int)(255.0 * a2);
                    if (b) {
                        n4 = 255;
                    }
                    n4 *= (int)n2;
                    ++n;
                    if (n4 > 3) {
                        final int \u26032 = 0;
                        final int \u26033 = -a * 9;
                        avp.a(\u26032, \u26033 - 9, \u26032 + f + 4, \u26033, n4 / 2 << 24);
                        final String d = ava.a().d();
                        bfl.l();
                        this.f.k.a(d, (float)\u26032, (float)(\u26033 - 8), 16777215 + (n4 << 24));
                        bfl.c();
                        bfl.k();
                    }
                }
            }
        }
        if (b) {
            final int a = this.f.k.a;
            bfl.b(-3.0f, 0.0f, 0.0f);
            final int n5 = size * a + size;
            final int n3 = n * a + n;
            final int n6 = this.j * n3 / size;
            final int n7 = n3 * n3 / n5;
            if (n5 != n3) {
                final int n4 = (n6 > 0) ? 170 : 96;
                final int \u26032 = this.k ? 13382451 : 3355562;
                avp.a(0, -n6, 2, -n6 - n7, \u26032 + (n4 << 24));
                avp.a(2, -n6, 1, -n6 - n7, 13421772 + (n4 << 24));
            }
        }
        bfl.F();
    }
    
    public void a() {
        this.i.clear();
        this.h.clear();
        this.g.clear();
    }
    
    public void a(final eu \u2603) {
        this.a(\u2603, 0);
    }
    
    public void a(final eu \u2603, final int \u2603) {
        this.a(\u2603, \u2603, this.f.q.e(), false);
        avt.a.info("[CHAT] " + \u2603.c());
    }
    
    private void a(final eu \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 != 0) {
            this.c(\u2603);
        }
        final int d = ns.d(this.f() / this.h());
        final List<eu> a = avu.a(\u2603, d, this.f.k, false, false);
        final boolean e = this.e();
        for (final eu \u26032 : a) {
            if (e && this.j > 0) {
                this.k = true;
                this.b(1);
            }
            this.i.add(0, new ava(\u2603, \u26032, \u2603));
        }
        while (this.i.size() > 100) {
            this.i.remove(this.i.size() - 1);
        }
        if (!\u2603) {
            this.h.add(0, new ava(\u2603, \u2603, \u2603));
            while (this.h.size() > 100) {
                this.h.remove(this.h.size() - 1);
            }
        }
    }
    
    public void b() {
        this.i.clear();
        this.d();
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final ava ava = this.h.get(i);
            this.a(ava.a(), ava.c(), ava.b(), true);
        }
    }
    
    public List<String> c() {
        return this.g;
    }
    
    public void a(final String \u2603) {
        if (this.g.isEmpty() || !this.g.get(this.g.size() - 1).equals(\u2603)) {
            this.g.add(\u2603);
        }
    }
    
    public void d() {
        this.j = 0;
        this.k = false;
    }
    
    public void b(final int \u2603) {
        this.j += \u2603;
        final int size = this.i.size();
        if (this.j > size - this.i()) {
            this.j = size - this.i();
        }
        if (this.j <= 0) {
            this.j = 0;
            this.k = false;
        }
    }
    
    public eu a(final int \u2603, final int \u2603) {
        if (!this.e()) {
            return null;
        }
        final avr avr = new avr(this.f);
        final int e = avr.e();
        final float h = this.h();
        int d = \u2603 / e - 3;
        int d2 = \u2603 / e - 27;
        d = ns.d(d / h);
        d2 = ns.d(d2 / h);
        if (d < 0 || d2 < 0) {
            return null;
        }
        final int min = Math.min(this.i(), this.i.size());
        if (d <= ns.d(this.f() / this.h()) && d2 < this.f.k.a * min + min) {
            final int n = d2 / this.f.k.a + this.j;
            if (n >= 0 && n < this.i.size()) {
                final ava ava = this.i.get(n);
                int n2 = 0;
                for (final eu eu : ava.a()) {
                    if (eu instanceof fa) {
                        n2 += this.f.k.a(avu.a(((fa)eu).g(), false));
                        if (n2 > d) {
                            return eu;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    public boolean e() {
        return this.f.m instanceof awv;
    }
    
    public void c(final int \u2603) {
        Iterator<ava> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final ava ava = iterator.next();
            if (ava.c() == \u2603) {
                iterator.remove();
            }
        }
        iterator = this.h.iterator();
        while (iterator.hasNext()) {
            final ava ava = iterator.next();
            if (ava.c() == \u2603) {
                iterator.remove();
                break;
            }
        }
    }
    
    public int f() {
        return a(this.f.t.F);
    }
    
    public int g() {
        return b(this.e() ? this.f.t.H : this.f.t.G);
    }
    
    public float h() {
        return this.f.t.E;
    }
    
    public static int a(final float \u2603) {
        final int n = 320;
        final int n2 = 40;
        return ns.d(\u2603 * (n - n2) + n2);
    }
    
    public static int b(final float \u2603) {
        final int n = 180;
        final int n2 = 20;
        return ns.d(\u2603 * (n - n2) + n2);
    }
    
    public int i() {
        return this.g() / 9;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
