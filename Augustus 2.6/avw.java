import com.google.common.base.Predicates;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class avw extends avp
{
    private final int g;
    private final avn h;
    public int a;
    public int f;
    private final int i;
    private final int j;
    private String k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private awg.b x;
    private Predicate<String> y;
    
    public avw(final int \u2603, final avn \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.k = "";
        this.l = 32;
        this.n = true;
        this.o = true;
        this.q = true;
        this.u = 14737632;
        this.v = 7368816;
        this.w = true;
        this.y = Predicates.alwaysTrue();
        this.g = \u2603;
        this.h = \u2603;
        this.a = \u2603;
        this.f = \u2603;
        this.i = \u2603;
        this.j = \u2603;
    }
    
    public void a(final awg.b \u2603) {
        this.x = \u2603;
    }
    
    public void a() {
        ++this.m;
    }
    
    public void a(final String \u2603) {
        if (!this.y.apply(\u2603)) {
            return;
        }
        if (\u2603.length() > this.l) {
            this.k = \u2603.substring(0, this.l);
        }
        else {
            this.k = \u2603;
        }
        this.f();
    }
    
    public String b() {
        return this.k;
    }
    
    public String c() {
        final int beginIndex = (this.s < this.t) ? this.s : this.t;
        final int endIndex = (this.s < this.t) ? this.t : this.s;
        return this.k.substring(beginIndex, endIndex);
    }
    
    public void a(final Predicate<String> \u2603) {
        this.y = \u2603;
    }
    
    public void b(final String \u2603) {
        String k = "";
        final String a = f.a(\u2603);
        final int endIndex = (this.s < this.t) ? this.s : this.t;
        final int beginIndex = (this.s < this.t) ? this.t : this.s;
        final int endIndex2 = this.l - this.k.length() - (endIndex - beginIndex);
        int length = 0;
        if (this.k.length() > 0) {
            k += this.k.substring(0, endIndex);
        }
        if (endIndex2 < a.length()) {
            k += a.substring(0, endIndex2);
            length = endIndex2;
        }
        else {
            k += a;
            length = a.length();
        }
        if (this.k.length() > 0 && beginIndex < this.k.length()) {
            k += this.k.substring(beginIndex);
        }
        if (!this.y.apply(k)) {
            return;
        }
        this.k = k;
        this.d(endIndex - this.t + length);
        if (this.x != null) {
            this.x.a(this.g, this.k);
        }
    }
    
    public void a(final int \u2603) {
        if (this.k.length() == 0) {
            return;
        }
        if (this.t != this.s) {
            this.b("");
            return;
        }
        this.b(this.c(\u2603) - this.s);
    }
    
    public void b(final int \u2603) {
        if (this.k.length() == 0) {
            return;
        }
        if (this.t != this.s) {
            this.b("");
            return;
        }
        final boolean b = \u2603 < 0;
        final int endIndex = b ? (this.s + \u2603) : this.s;
        final int beginIndex = b ? this.s : (this.s + \u2603);
        String s = "";
        if (endIndex >= 0) {
            s = this.k.substring(0, endIndex);
        }
        if (beginIndex < this.k.length()) {
            s += this.k.substring(beginIndex);
        }
        if (!this.y.apply(s)) {
            return;
        }
        this.k = s;
        if (b) {
            this.d(\u2603);
        }
        if (this.x != null) {
            this.x.a(this.g, this.k);
        }
    }
    
    public int d() {
        return this.g;
    }
    
    public int c(final int \u2603) {
        return this.a(\u2603, this.i());
    }
    
    public int a(final int \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, true);
    }
    
    public int a(final int \u2603, final int \u2603, final boolean \u2603) {
        int index = \u2603;
        final boolean b = \u2603 < 0;
        for (int abs = Math.abs(\u2603), i = 0; i < abs; ++i) {
            if (b) {
                while (\u2603 && index > 0 && this.k.charAt(index - 1) == ' ') {
                    --index;
                }
                while (index > 0 && this.k.charAt(index - 1) != ' ') {
                    --index;
                }
            }
            else {
                final int length = this.k.length();
                index = this.k.indexOf(32, index);
                if (index == -1) {
                    index = length;
                }
                else {
                    while (\u2603 && index < length && this.k.charAt(index) == ' ') {
                        ++index;
                    }
                }
            }
        }
        return index;
    }
    
    public void d(final int \u2603) {
        this.e(this.t + \u2603);
    }
    
    public void e(final int \u2603) {
        this.s = \u2603;
        final int length = this.k.length();
        this.i(this.s = ns.a(this.s, 0, length));
    }
    
    public void e() {
        this.e(0);
    }
    
    public void f() {
        this.e(this.k.length());
    }
    
    public boolean a(final char \u2603, final int \u2603) {
        if (!this.p) {
            return false;
        }
        if (axu.g(\u2603)) {
            this.f();
            this.i(0);
            return true;
        }
        if (axu.f(\u2603)) {
            axu.e(this.c());
            return true;
        }
        if (axu.e(\u2603)) {
            if (this.q) {
                this.b(axu.o());
            }
            return true;
        }
        if (axu.d(\u2603)) {
            axu.e(this.c());
            if (this.q) {
                this.b("");
            }
            return true;
        }
        switch (\u2603) {
            case 203: {
                if (axu.r()) {
                    if (axu.q()) {
                        this.i(this.a(-1, this.o()));
                    }
                    else {
                        this.i(this.o() - 1);
                    }
                }
                else if (axu.q()) {
                    this.e(this.c(-1));
                }
                else {
                    this.d(-1);
                }
                return true;
            }
            case 205: {
                if (axu.r()) {
                    if (axu.q()) {
                        this.i(this.a(1, this.o()));
                    }
                    else {
                        this.i(this.o() + 1);
                    }
                }
                else if (axu.q()) {
                    this.e(this.c(1));
                }
                else {
                    this.d(1);
                }
                return true;
            }
            case 14: {
                if (axu.q()) {
                    if (this.q) {
                        this.a(-1);
                    }
                }
                else if (this.q) {
                    this.b(-1);
                }
                return true;
            }
            case 211: {
                if (axu.q()) {
                    if (this.q) {
                        this.a(1);
                    }
                }
                else if (this.q) {
                    this.b(1);
                }
                return true;
            }
            case 199: {
                if (axu.r()) {
                    this.i(0);
                }
                else {
                    this.e();
                }
                return true;
            }
            case 207: {
                if (axu.r()) {
                    this.i(this.k.length());
                }
                else {
                    this.f();
                }
                return true;
            }
            default: {
                if (f.a(\u2603)) {
                    if (this.q) {
                        this.b(Character.toString(\u2603));
                    }
                    return true;
                }
                return false;
            }
        }
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603) {
        final boolean \u26032 = \u2603 >= this.a && \u2603 < this.a + this.i && \u2603 >= this.f && \u2603 < this.f + this.j;
        if (this.o) {
            this.b(\u26032);
        }
        if (this.p && \u26032 && \u2603 == 0) {
            int \u26033 = \u2603 - this.a;
            if (this.n) {
                \u26033 -= 4;
            }
            final String a = this.h.a(this.k.substring(this.r), this.p());
            this.e(this.h.a(a, \u26033).length() + this.r);
        }
    }
    
    public void g() {
        if (!this.r()) {
            return;
        }
        if (this.j()) {
            avp.a(this.a - 1, this.f - 1, this.a + this.i + 1, this.f + this.j + 1, -6250336);
            avp.a(this.a, this.f, this.a + this.i, this.f + this.j, -16777216);
        }
        final int \u2603 = this.q ? this.u : this.v;
        final int n = this.s - this.r;
        int length = this.t - this.r;
        final String a = this.h.a(this.k.substring(this.r), this.p());
        final boolean b = n >= 0 && n <= a.length();
        final boolean b2 = this.p && this.m / 6 % 2 == 0 && b;
        final int n2 = this.n ? (this.a + 4) : this.a;
        final int n3 = this.n ? (this.f + (this.j - 8) / 2) : this.f;
        int n4 = n2;
        if (length > a.length()) {
            length = a.length();
        }
        if (a.length() > 0) {
            final String \u26032 = b ? a.substring(0, n) : a;
            n4 = this.h.a(\u26032, (float)n4, (float)n3, \u2603);
        }
        final boolean b3 = this.s < this.k.length() || this.k.length() >= this.h();
        int n5 = n4;
        if (!b) {
            n5 = ((n > 0) ? (n2 + this.i) : n2);
        }
        else if (b3) {
            --n5;
            --n4;
        }
        if (a.length() > 0 && b && n < a.length()) {
            n4 = this.h.a(a.substring(n), (float)n4, (float)n3, \u2603);
        }
        if (b2) {
            if (b3) {
                avp.a(n5, n3 - 1, n5 + 1, n3 + 1 + this.h.a, -3092272);
            }
            else {
                this.h.a("_", (float)n5, (float)n3, \u2603);
            }
        }
        if (length != n) {
            final int n6 = n2 + this.h.a(a.substring(0, length));
            this.c(n5, n3 - 1, n6 - 1, n3 + 1 + this.h.a);
        }
    }
    
    private void c(int \u2603, int \u2603, int \u2603, int \u2603) {
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        if (\u2603 > this.a + this.i) {
            \u2603 = this.a + this.i;
        }
        if (\u2603 > this.a + this.i) {
            \u2603 = this.a + this.i;
        }
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.c(0.0f, 0.0f, 255.0f, 255.0f);
        bfl.x();
        bfl.u();
        bfl.f(5387);
        c.a(7, bms.e);
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        a.b();
        bfl.v();
        bfl.w();
    }
    
    public void f(final int \u2603) {
        this.l = \u2603;
        if (this.k.length() > \u2603) {
            this.k = this.k.substring(0, \u2603);
        }
    }
    
    public int h() {
        return this.l;
    }
    
    public int i() {
        return this.s;
    }
    
    public boolean j() {
        return this.n;
    }
    
    public void a(final boolean \u2603) {
        this.n = \u2603;
    }
    
    public void g(final int \u2603) {
        this.u = \u2603;
    }
    
    public void h(final int \u2603) {
        this.v = \u2603;
    }
    
    public void b(final boolean \u2603) {
        if (\u2603 && !this.p) {
            this.m = 0;
        }
        this.p = \u2603;
    }
    
    public boolean m() {
        return this.p;
    }
    
    public void c(final boolean \u2603) {
        this.q = \u2603;
    }
    
    public int o() {
        return this.t;
    }
    
    public int p() {
        return this.j() ? (this.i - 8) : this.i;
    }
    
    public void i(int \u2603) {
        final int length = this.k.length();
        if (\u2603 > length) {
            \u2603 = length;
        }
        if (\u2603 < 0) {
            \u2603 = 0;
        }
        this.t = \u2603;
        if (this.h != null) {
            if (this.r > length) {
                this.r = length;
            }
            final int p = this.p();
            final String a = this.h.a(this.k.substring(this.r), p);
            final int n = a.length() + this.r;
            if (\u2603 == this.r) {
                this.r -= this.h.a(this.k, p, true).length();
            }
            if (\u2603 > n) {
                this.r += \u2603 - n;
            }
            else if (\u2603 <= this.r) {
                this.r -= this.r - \u2603;
            }
            this.r = ns.a(this.r, 0, length);
        }
    }
    
    public void d(final boolean \u2603) {
        this.o = \u2603;
    }
    
    public boolean r() {
        return this.w;
    }
    
    public void e(final boolean \u2603) {
        this.w = \u2603;
    }
}
