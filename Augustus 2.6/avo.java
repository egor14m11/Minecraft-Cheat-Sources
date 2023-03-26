import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Iterables;
import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class avo extends avp
{
    private static final jy f;
    private static final jy g;
    private static final jy h;
    private final Random i;
    private final ave j;
    private final bjh k;
    private final avt l;
    private final awk m;
    private int n;
    private String o;
    private int p;
    private boolean q;
    public float a;
    private int r;
    private zx s;
    private final avv t;
    private final awm u;
    private final awh v;
    private int w;
    private String x;
    private String y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private long E;
    private long F;
    
    public avo(final ave \u2603) {
        this.i = new Random();
        this.o = "";
        this.a = 1.0f;
        this.x = "";
        this.y = "";
        this.C = 0;
        this.D = 0;
        this.E = 0L;
        this.F = 0L;
        this.j = \u2603;
        this.k = \u2603.ag();
        this.t = new avv(\u2603);
        this.u = new awm(\u2603);
        this.l = new avt(\u2603);
        this.m = new awk(\u2603);
        this.v = new awh(\u2603, this);
        this.a();
    }
    
    public void a() {
        this.z = 10;
        this.A = 70;
        this.B = 20;
    }
    
    public void a(final float \u2603) {
        final avr \u26032 = new avr(this.j);
        final int a = \u26032.a();
        final int b = \u26032.b();
        this.j.o.j();
        bfl.l();
        if (ave.w()) {
            this.a(this.j.h.c(\u2603), \u26032);
        }
        else {
            bfl.a(770, 771, 1, 0);
        }
        final zx e = this.j.h.bi.e(3);
        if (this.j.t.aA == 0 && e != null && e.b() == zw.a(afi.aU)) {
            this.e(\u26032);
        }
        if (!this.j.h.a(pe.k)) {
            final float \u26033 = this.j.h.bI + (this.j.h.bH - this.j.h.bI) * \u2603;
            if (\u26033 > 0.0f) {
                this.b(\u26033, \u26032);
            }
        }
        if (this.j.c.a()) {
            this.u.a(\u26032, \u2603);
        }
        else {
            this.a(\u26032, \u2603);
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(avo.d);
        bfl.l();
        if (this.b()) {
            bfl.a(775, 769, 1, 0);
            bfl.d();
            this.b(a / 2 - 7, b / 2 - 7, 0, 0, 16, 16);
        }
        bfl.a(770, 771, 1, 0);
        this.j.A.a("bossHealth");
        this.j();
        this.j.A.b();
        if (this.j.c.b()) {
            this.d(\u26032);
        }
        bfl.k();
        if (this.j.h.cg() > 0) {
            this.j.A.a("sleep");
            bfl.i();
            bfl.c();
            final int cg = this.j.h.cg();
            float n = cg / 100.0f;
            if (n > 1.0f) {
                n = 1.0f - (cg - 100) / 10.0f;
            }
            final int a2 = (int)(220.0f * n) << 24 | 0x101020;
            avp.a(0, 0, a, b, a2);
            bfl.d();
            bfl.j();
            this.j.A.b();
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final int cg = a / 2 - 91;
        if (this.j.h.y()) {
            this.a(\u26032, cg);
        }
        else if (this.j.c.f()) {
            this.b(\u26032, cg);
        }
        if (this.j.t.D && !this.j.c.a()) {
            this.a(\u26032);
        }
        else if (this.j.h.v()) {
            this.u.a(\u26032);
        }
        if (this.j.t()) {
            this.b(\u26032);
        }
        if (this.j.t.aB) {
            this.t.a(\u26032);
        }
        if (this.p > 0) {
            this.j.A.a("overlayMessage");
            final float n = this.p - \u2603;
            int a2 = (int)(n * 255.0f / 20.0f);
            if (a2 > 255) {
                a2 = 255;
            }
            if (a2 > 8) {
                bfl.E();
                bfl.b((float)(a / 2), (float)(b - 68), 0.0f);
                bfl.l();
                bfl.a(770, 771, 1, 0);
                int n2 = 16777215;
                if (this.q) {
                    n2 = (ns.c(n / 50.0f, 0.7f, 0.6f) & 0xFFFFFF);
                }
                this.f().a(this.o, -this.f().a(this.o) / 2, -4, n2 + (a2 << 24 & 0xFF000000));
                bfl.k();
                bfl.F();
            }
            this.j.A.b();
        }
        if (this.w > 0) {
            this.j.A.a("titleAndSubtitle");
            final float n = this.w - \u2603;
            int a2 = 255;
            if (this.w > this.B + this.A) {
                final float n3 = this.z + this.A + this.B - n;
                a2 = (int)(n3 * 255.0f / this.z);
            }
            if (this.w <= this.B) {
                final float n3 = n;
                a2 = (int)(n3 * 255.0f / this.B);
            }
            a2 = ns.a(a2, 0, 255);
            if (a2 > 8) {
                bfl.E();
                bfl.b((float)(a / 2), (float)(b / 2), 0.0f);
                bfl.l();
                bfl.a(770, 771, 1, 0);
                bfl.E();
                bfl.a(4.0f, 4.0f, 4.0f);
                final int n2 = a2 << 24 & 0xFF000000;
                this.f().a(this.x, (float)(-this.f().a(this.x) / 2), -10.0f, 0xFFFFFF | n2, true);
                bfl.F();
                bfl.E();
                bfl.a(2.0f, 2.0f, 2.0f);
                this.f().a(this.y, (float)(-this.f().a(this.y) / 2), 5.0f, 0xFFFFFF | n2, true);
                bfl.F();
                bfl.k();
                bfl.F();
            }
            this.j.A.b();
        }
        final auo z = this.j.f.Z();
        auk a3 = null;
        final aul h = z.h(this.j.h.e_());
        if (h != null) {
            final int b2 = h.l().b();
            if (b2 >= 0) {
                a3 = z.a(3 + b2);
            }
        }
        auk a4 = (a3 != null) ? a3 : z.a(1);
        if (a4 != null) {
            this.a(a4, \u26032);
        }
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.c();
        bfl.E();
        bfl.b(0.0f, (float)(b - 48), 0.0f);
        this.j.A.a("chat");
        this.l.a(this.n);
        this.j.A.b();
        bfl.F();
        a4 = z.a(0);
        if (this.j.t.ak.d() && (!this.j.E() || this.j.h.a.d().size() > 1 || a4 != null)) {
            this.v.a(true);
            this.v.a(a, z, a4);
        }
        else {
            this.v.a(false);
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.f();
        bfl.d();
    }
    
    protected void a(final avr \u2603, final float \u2603) {
        if (!(this.j.ac() instanceof wn)) {
            return;
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(avo.g);
        final wn \u26032 = (wn)this.j.ac();
        final int n = \u2603.a() / 2;
        final float e = this.e;
        this.e = -90.0f;
        this.b(n - 91, \u2603.b() - 22, 0, 0, 182, 22);
        this.b(n - 91 - 1 + \u26032.bi.c * 20, \u2603.b() - 22 - 1, 0, 22, 24, 22);
        this.e = e;
        bfl.B();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        avc.c();
        for (int i = 0; i < 9; ++i) {
            final int \u26033 = \u2603.a() / 2 - 90 + i * 20 + 2;
            final int \u26034 = \u2603.b() - 16 - 3;
            this.a(i, \u26033, \u26034, \u2603, \u26032);
        }
        avc.a();
        bfl.C();
        bfl.k();
    }
    
    public void a(final avr \u2603, final int \u2603) {
        this.j.A.a("jumpBar");
        this.j.P().a(avp.d);
        final float z = this.j.h.z();
        final int \u26032 = 182;
        final int \u26033 = (int)(z * (\u26032 + 1));
        final int n = \u2603.b() - 32 + 3;
        this.b(\u2603, n, 0, 84, \u26032, 5);
        if (\u26033 > 0) {
            this.b(\u2603, n, 0, 89, \u26033, 5);
        }
        this.j.A.b();
    }
    
    public void b(final avr \u2603, final int \u2603) {
        this.j.A.a("expBar");
        this.j.P().a(avp.d);
        final int ck = this.j.h.ck();
        if (ck > 0) {
            final int n = 182;
            final int \u26032 = (int)(this.j.h.bD * (n + 1));
            final int \u26033 = \u2603.b() - 32 + 3;
            this.b(\u2603, \u26033, 0, 64, n, 5);
            if (\u26032 > 0) {
                this.b(\u2603, \u26033, 0, 69, \u26032, 5);
            }
        }
        this.j.A.b();
        if (this.j.h.bB > 0) {
            this.j.A.a("expLevel");
            final int n = 8453920;
            final String string = "" + this.j.h.bB;
            final int \u26033 = (\u2603.a() - this.f().a(string)) / 2;
            final int \u26034 = \u2603.b() - 31 - 4;
            final int n2 = 0;
            this.f().a(string, \u26033 + 1, \u26034, 0);
            this.f().a(string, \u26033 - 1, \u26034, 0);
            this.f().a(string, \u26033, \u26034 + 1, 0);
            this.f().a(string, \u26033, \u26034 - 1, 0);
            this.f().a(string, \u26033, \u26034, n);
            this.j.A.b();
        }
    }
    
    public void a(final avr \u2603) {
        this.j.A.a("selectedItemName");
        if (this.r > 0 && this.s != null) {
            String \u26032 = this.s.q();
            if (this.s.s()) {
                \u26032 = a.u + \u26032;
            }
            final int n = (\u2603.a() - this.f().a(\u26032)) / 2;
            int n2 = \u2603.b() - 59;
            if (!this.j.c.b()) {
                n2 += 14;
            }
            int n3 = (int)(this.r * 256.0f / 10.0f);
            if (n3 > 255) {
                n3 = 255;
            }
            if (n3 > 0) {
                bfl.E();
                bfl.l();
                bfl.a(770, 771, 1, 0);
                this.f().a(\u26032, (float)n, (float)n2, 16777215 + (n3 << 24));
                bfl.k();
                bfl.F();
            }
        }
        this.j.A.b();
    }
    
    public void b(final avr \u2603) {
        this.j.A.a("demo");
        String s = "";
        if (this.j.f.K() >= 120500L) {
            s = bnq.a("demo.demoExpired", new Object[0]);
        }
        else {
            s = bnq.a("demo.remainingTime", nx.a((int)(120500L - this.j.f.K())));
        }
        final int a = this.f().a(s);
        this.f().a(s, (float)(\u2603.a() - a - 10), 5.0f, 16777215);
        this.j.A.b();
    }
    
    protected boolean b() {
        if (this.j.t.aB && !this.j.h.cq() && !this.j.t.w) {
            return false;
        }
        if (!this.j.c.a()) {
            return true;
        }
        if (this.j.i != null) {
            return true;
        }
        if (this.j.s != null && this.j.s.a == auh.a.b) {
            final cj a = this.j.s.a();
            if (this.j.f.s(a) instanceof og) {
                return true;
            }
        }
        return false;
    }
    
    public void c(final avr \u2603) {
        this.m.a(\u2603.a() - 10, 10);
    }
    
    private void a(final auk \u2603, final avr \u2603) {
        final auo a = \u2603.a();
        Collection<aum> unfiltered = a.i(\u2603);
        final List<aum> arrayList = (List<aum>)Lists.newArrayList((Iterable<?>)Iterables.filter((Iterable<? extends E>)unfiltered, (Predicate<? super E>)new Predicate<aum>() {
            public boolean a(final aum \u2603) {
                return \u2603.e() != null && !\u2603.e().startsWith("#");
            }
        }));
        if (arrayList.size() > 15) {
            unfiltered = (Collection<aum>)Lists.newArrayList((Iterable<?>)Iterables.skip((Iterable<? extends E>)arrayList, unfiltered.size() - 15));
        }
        else {
            unfiltered = arrayList;
        }
        int a2 = this.f().a(\u2603.d());
        for (final aum aum : unfiltered) {
            final aul h = a.h(aum.e());
            final String string = aul.a(h, aum.e()) + ": " + a.m + aum.c();
            a2 = Math.max(a2, this.f().a(string));
        }
        final int n = unfiltered.size() * this.f().a;
        final int n2 = \u2603.b() / 2 + n / 3;
        final int n3 = 3;
        final int n4 = \u2603.a() - a2 - n3;
        int n5 = 0;
        for (final aum aum2 : unfiltered) {
            ++n5;
            final aul h2 = a.h(aum2.e());
            final String a3 = aul.a(h2, aum2.e());
            final String string2 = a.m + "" + aum2.c();
            final int \u26032 = n4;
            final int n6 = n2 - n5 * this.f().a;
            final int \u26033 = \u2603.a() - n3 + 2;
            avp.a(\u26032 - 2, n6, \u26033, n6 + this.f().a, 1342177280);
            this.f().a(a3, \u26032, n6, 553648127);
            this.f().a(string2, \u26033 - this.f().a(string2), n6, 553648127);
            if (n5 == unfiltered.size()) {
                final String d = \u2603.d();
                avp.a(\u26032 - 2, n6 - this.f().a - 1, \u26033, n6 - 1, 1610612736);
                avp.a(\u26032 - 2, n6 - 1, \u26033, n6, 1342177280);
                this.f().a(d, \u26032 + a2 / 2 - this.f().a(d) / 2, n6 - this.f().a, 553648127);
            }
        }
    }
    
    private void d(final avr \u2603) {
        if (!(this.j.ac() instanceof wn)) {
            return;
        }
        final wn wn = (wn)this.j.ac();
        final int f = ns.f(wn.bn());
        final boolean b = this.F > this.n && (this.F - this.n) / 3L % 2L == 1L;
        if (f < this.C && wn.Z > 0) {
            this.E = ave.J();
            this.F = this.n + 20;
        }
        else if (f > this.C && wn.Z > 0) {
            this.E = ave.J();
            this.F = this.n + 10;
        }
        if (ave.J() - this.E > 1000L) {
            this.C = f;
            this.D = f;
            this.E = ave.J();
        }
        this.C = f;
        final int d = this.D;
        this.i.setSeed(this.n * 312871);
        final boolean b2 = false;
        final xg cl = wn.cl();
        final int a = cl.a();
        final int b3 = cl.b();
        final qc a2 = wn.a(vy.a);
        final int n = \u2603.a() / 2 - 91;
        final int n2 = \u2603.a() / 2 + 91;
        final int n3 = \u2603.b() - 39;
        final float n4 = (float)a2.e();
        final float bn = wn.bN();
        final int f2 = ns.f((n4 + bn) / 2.0f / 10.0f);
        final int max = Math.max(10 - (f2 - 2), 3);
        final int \u26032 = n3 - (f2 - 1) * max - 10;
        float n5 = bn;
        final int br = wn.br();
        int n6 = -1;
        if (wn.a(pe.l)) {
            n6 = this.n % ns.f(n4 + 5.0f);
        }
        this.j.A.a("armor");
        for (int i = 0; i < 10; ++i) {
            if (br > 0) {
                final int j = n + i * 8;
                if (i * 2 + 1 < br) {
                    this.b(j, \u26032, 34, 9, 9, 9);
                }
                if (i * 2 + 1 == br) {
                    this.b(j, \u26032, 25, 9, 9, 9);
                }
                if (i * 2 + 1 > br) {
                    this.b(j, \u26032, 16, 9, 9, 9);
                }
            }
        }
        this.j.A.c("health");
        for (int i = ns.f((n4 + bn) / 2.0f) - 1; i >= 0; --i) {
            int j = 16;
            if (wn.a(pe.u)) {
                j += 36;
            }
            else if (wn.a(pe.v)) {
                j += 72;
            }
            int f3 = 0;
            if (b) {
                f3 = 1;
            }
            final int n7 = ns.f((i + 1) / 10.0f) - 1;
            final int k = n + i % 10 * 8;
            int \u26033 = n3 - n7 * max;
            if (f <= 4) {
                \u26033 += this.i.nextInt(2);
            }
            if (i == n6) {
                \u26033 -= 2;
            }
            int n8 = 0;
            if (wn.o.P().t()) {
                n8 = 5;
            }
            this.b(k, \u26033, 16 + f3 * 9, 9 * n8, 9, 9);
            if (b) {
                if (i * 2 + 1 < d) {
                    this.b(k, \u26033, j + 54, 9 * n8, 9, 9);
                }
                if (i * 2 + 1 == d) {
                    this.b(k, \u26033, j + 63, 9 * n8, 9, 9);
                }
            }
            if (n5 > 0.0f) {
                if (n5 == bn && bn % 2.0f == 1.0f) {
                    this.b(k, \u26033, j + 153, 9 * n8, 9, 9);
                }
                else {
                    this.b(k, \u26033, j + 144, 9 * n8, 9, 9);
                }
                n5 -= 2.0f;
            }
            else {
                if (i * 2 + 1 < f) {
                    this.b(k, \u26033, j + 36, 9 * n8, 9, 9);
                }
                if (i * 2 + 1 == f) {
                    this.b(k, \u26033, j + 45, 9 * n8, 9, 9);
                }
            }
        }
        final pk m = wn.m;
        if (m == null) {
            this.j.A.c("food");
            for (int j = 0; j < 10; ++j) {
                int f3 = n3;
                int n7 = 16;
                int k = 0;
                if (wn.a(pe.s)) {
                    n7 += 36;
                    k = 13;
                }
                if (wn.cl().e() <= 0.0f && this.n % (a * 3 + 1) == 0) {
                    f3 += this.i.nextInt(3) - 1;
                }
                if (b2) {
                    k = 1;
                }
                final int \u26033 = n2 - j * 8 - 9;
                this.b(\u26033, f3, 16 + k * 9, 27, 9, 9);
                if (b2) {
                    if (j * 2 + 1 < b3) {
                        this.b(\u26033, f3, n7 + 54, 27, 9, 9);
                    }
                    if (j * 2 + 1 == b3) {
                        this.b(\u26033, f3, n7 + 63, 27, 9, 9);
                    }
                }
                if (j * 2 + 1 < a) {
                    this.b(\u26033, f3, n7 + 36, 27, 9, 9);
                }
                if (j * 2 + 1 == a) {
                    this.b(\u26033, f3, n7 + 45, 27, 9, 9);
                }
            }
        }
        else if (m instanceof pr) {
            this.j.A.c("mountHealth");
            final pr pr = (pr)m;
            final int f3 = (int)Math.ceil(pr.bn());
            final float bu = pr.bu();
            int k = (int)(bu + 0.5f) / 2;
            if (k > 30) {
                k = 30;
            }
            int \u26033 = n3;
            int n8 = 0;
            while (k > 0) {
                final int min = Math.min(k, 10);
                k -= min;
                for (int l = 0; l < min; ++l) {
                    final int n9 = 52;
                    int n10 = 0;
                    if (b2) {
                        n10 = 1;
                    }
                    final int \u26034 = n2 - l * 8 - 9;
                    this.b(\u26034, \u26033, n9 + n10 * 9, 9, 9, 9);
                    if (l * 2 + 1 + n8 < f3) {
                        this.b(\u26034, \u26033, n9 + 36, 9, 9, 9);
                    }
                    if (l * 2 + 1 + n8 == f3) {
                        this.b(\u26034, \u26033, n9 + 45, 9, 9, 9);
                    }
                }
                \u26033 -= 10;
                n8 += 20;
            }
        }
        this.j.A.c("air");
        if (wn.a(arm.h)) {
            final int j = this.j.h.az();
            for (int f3 = ns.f((j - 2) * 10.0 / 300.0), n7 = ns.f(j * 10.0 / 300.0) - f3, k = 0; k < f3 + n7; ++k) {
                if (k < f3) {
                    this.b(n2 - k * 8 - 9, \u26032, 16, 18, 9, 9);
                }
                else {
                    this.b(n2 - k * 8 - 9, \u26032, 25, 18, 9, 9);
                }
            }
        }
        this.j.A.b();
    }
    
    private void j() {
        if (bfc.c == null || bfc.b <= 0) {
            return;
        }
        --bfc.b;
        final avn k = this.j.k;
        final avr avr = new avr(this.j);
        final int a = avr.a();
        final int n = 182;
        final int \u2603 = a / 2 - n / 2;
        final int \u26032 = (int)(bfc.a * (n + 1));
        final int \u26033 = 12;
        this.b(\u2603, \u26033, 0, 74, n, 5);
        this.b(\u2603, \u26033, 0, 74, n, 5);
        if (\u26032 > 0) {
            this.b(\u2603, \u26033, 0, 79, \u26032, 5);
        }
        final String c = bfc.c;
        this.f().a(c, (float)(a / 2 - this.f().a(c) / 2), (float)(\u26033 - 10), 16777215);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(avo.d);
    }
    
    private void e(final avr \u2603) {
        bfl.i();
        bfl.a(false);
        bfl.a(770, 771, 1, 0);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.c();
        this.j.P().a(avo.h);
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(0.0, \u2603.b(), -90.0).a(0.0, 1.0).d();
        c.b(\u2603.a(), \u2603.b(), -90.0).a(1.0, 1.0).d();
        c.b(\u2603.a(), 0.0, -90.0).a(1.0, 0.0).d();
        c.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        a.b();
        bfl.a(true);
        bfl.j();
        bfl.d();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void a(float \u2603, final avr \u2603) {
        \u2603 = 1.0f - \u2603;
        \u2603 = ns.a(\u2603, 0.0f, 1.0f);
        final ams af = this.j.f.af();
        float n = (float)af.a(this.j.h);
        final double min = Math.min(af.o() * af.p() * 1000.0, Math.abs(af.j() - af.h()));
        final double max = Math.max(af.q(), min);
        if (n < max) {
            n = 1.0f - (float)(n / max);
        }
        else {
            n = 0.0f;
        }
        this.a += (float)((\u2603 - this.a) * 0.01);
        bfl.i();
        bfl.a(false);
        bfl.a(0, 769, 1, 0);
        if (n > 0.0f) {
            bfl.c(0.0f, n, n, 1.0f);
        }
        else {
            bfl.c(this.a, this.a, this.a, 1.0f);
        }
        this.j.P().a(avo.f);
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(0.0, \u2603.b(), -90.0).a(0.0, 1.0).d();
        c.b(\u2603.a(), \u2603.b(), -90.0).a(1.0, 1.0).d();
        c.b(\u2603.a(), 0.0, -90.0).a(1.0, 0.0).d();
        c.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        a.b();
        bfl.a(true);
        bfl.j();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.a(770, 771, 1, 0);
    }
    
    private void b(float \u2603, final avr \u2603) {
        if (\u2603 < 1.0f) {
            \u2603 *= \u2603;
            \u2603 *= \u2603;
            \u2603 = \u2603 * 0.8f + 0.2f;
        }
        bfl.c();
        bfl.i();
        bfl.a(false);
        bfl.a(770, 771, 1, 0);
        bfl.c(1.0f, 1.0f, 1.0f, \u2603);
        this.j.P().a(bmh.g);
        final bmi a = this.j.ae().a().a(afi.aY.Q());
        final float e = a.e();
        final float g = a.g();
        final float f = a.f();
        final float h = a.h();
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        c.a(7, bms.g);
        c.b(0.0, \u2603.b(), -90.0).a(e, h).d();
        c.b(\u2603.a(), \u2603.b(), -90.0).a(f, h).d();
        c.b(\u2603.a(), 0.0, -90.0).a(f, g).d();
        c.b(0.0, 0.0, -90.0).a(e, g).d();
        a2.b();
        bfl.a(true);
        bfl.j();
        bfl.d();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603, final float \u2603, final wn \u2603) {
        final zx zx = \u2603.bi.a[\u2603];
        if (zx == null) {
            return;
        }
        final float n = zx.c - \u2603;
        if (n > 0.0f) {
            bfl.E();
            final float n2 = 1.0f + n / 5.0f;
            bfl.b((float)(\u2603 + 8), (float)(\u2603 + 12), 0.0f);
            bfl.a(1.0f / n2, (n2 + 1.0f) / 2.0f, 1.0f);
            bfl.b((float)(-(\u2603 + 8)), (float)(-(\u2603 + 12)), 0.0f);
        }
        this.k.b(zx, \u2603, \u2603);
        if (n > 0.0f) {
            bfl.F();
        }
        this.k.a(this.j.k, zx, \u2603, \u2603);
    }
    
    public void c() {
        if (this.p > 0) {
            --this.p;
        }
        if (this.w > 0) {
            --this.w;
            if (this.w <= 0) {
                this.x = "";
                this.y = "";
            }
        }
        ++this.n;
        this.m.a();
        if (this.j.h != null) {
            final zx h = this.j.h.bi.h();
            if (h == null) {
                this.r = 0;
            }
            else if (this.s == null || h.b() != this.s.b() || !zx.a(h, this.s) || (!h.e() && h.i() != this.s.i())) {
                this.r = 40;
            }
            else if (this.r > 0) {
                --this.r;
            }
            this.s = h;
        }
    }
    
    public void a(final String \u2603) {
        this.a(bnq.a("record.nowPlaying", \u2603), true);
    }
    
    public void a(final String \u2603, final boolean \u2603) {
        this.o = \u2603;
        this.p = 60;
        this.q = \u2603;
    }
    
    public void a(final String \u2603, final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null && \u2603 == null && \u2603 < 0 && \u2603 < 0 && \u2603 < 0) {
            this.x = "";
            this.y = "";
            this.w = 0;
            return;
        }
        if (\u2603 != null) {
            this.x = \u2603;
            this.w = this.z + this.A + this.B;
            return;
        }
        if (\u2603 != null) {
            this.y = \u2603;
            return;
        }
        if (\u2603 >= 0) {
            this.z = \u2603;
        }
        if (\u2603 >= 0) {
            this.A = \u2603;
        }
        if (\u2603 >= 0) {
            this.B = \u2603;
        }
        if (this.w > 0) {
            this.w = this.z + this.A + this.B;
        }
    }
    
    public void a(final eu \u2603, final boolean \u2603) {
        this.a(\u2603.c(), \u2603);
    }
    
    public avt d() {
        return this.l;
    }
    
    public int e() {
        return this.n;
    }
    
    public avn f() {
        return this.j.k;
    }
    
    public awm g() {
        return this.u;
    }
    
    public awh h() {
        return this.v;
    }
    
    public void i() {
        this.v.a();
    }
    
    static {
        f = new jy("textures/misc/vignette.png");
        g = new jy("textures/gui/widgets.png");
        h = new jy("textures/misc/pumpkinblur.png");
    }
}
