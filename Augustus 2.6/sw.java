import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class sw
{
    protected ps b;
    protected adm c;
    protected asx d;
    protected double e;
    private final qc a;
    private int f;
    private int g;
    private aui h;
    private float i;
    private final asy j;
    
    public sw(final ps \u2603, final adm \u2603) {
        this.h = new aui(0.0, 0.0, 0.0);
        this.i = 1.0f;
        this.b = \u2603;
        this.c = \u2603;
        this.a = \u2603.a(vy.b);
        this.j = this.a();
    }
    
    protected abstract asy a();
    
    public void a(final double \u2603) {
        this.e = \u2603;
    }
    
    public float i() {
        return (float)this.a.e();
    }
    
    public final asx a(final double \u2603, final double \u2603, final double \u2603) {
        return this.a(new cj(ns.c(\u2603), (int)\u2603, ns.c(\u2603)));
    }
    
    public asx a(final cj \u2603) {
        if (!this.b()) {
            return null;
        }
        final float i = this.i();
        this.c.B.a("pathfind");
        final cj cj = new cj(this.b);
        final int n = (int)(i + 8.0f);
        final adv \u26032 = new adv(this.c, cj.a(-n, -n, -n), cj.a(n, n, n), 0);
        final asx a = this.j.a(\u26032, this.b, \u2603, i);
        this.c.B.b();
        return a;
    }
    
    public boolean a(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        final asx a = this.a(ns.c(\u2603), (int)\u2603, ns.c(\u2603));
        return this.a(a, \u2603);
    }
    
    public void a(final float \u2603) {
        this.i = \u2603;
    }
    
    public asx a(final pk \u2603) {
        if (!this.b()) {
            return null;
        }
        final float i = this.i();
        this.c.B.a("pathfind");
        final cj a = new cj(this.b).a();
        final int n = (int)(i + 16.0f);
        final adv \u26032 = new adv(this.c, a.a(-n, -n, -n), a.a(n, n, n), 0);
        final asx a2 = this.j.a(\u26032, this.b, \u2603, i);
        this.c.B.b();
        return a2;
    }
    
    public boolean a(final pk \u2603, final double \u2603) {
        final asx a = this.a(\u2603);
        return a != null && this.a(a, \u2603);
    }
    
    public boolean a(final asx \u2603, final double \u2603) {
        if (\u2603 == null) {
            this.d = null;
            return false;
        }
        if (!\u2603.a(this.d)) {
            this.d = \u2603;
        }
        this.d();
        if (this.d.d() == 0) {
            return false;
        }
        this.e = \u2603;
        final aui c = this.c();
        this.g = this.f;
        this.h = c;
        return true;
    }
    
    public asx j() {
        return this.d;
    }
    
    public void k() {
        ++this.f;
        if (this.m()) {
            return;
        }
        if (this.b()) {
            this.l();
        }
        else if (this.d != null && this.d.e() < this.d.d()) {
            final aui aui = this.c();
            final aui a = this.d.a(this.b, this.d.e());
            if (aui.b > a.b && !this.b.C && ns.c(aui.a) == ns.c(a.a) && ns.c(aui.c) == ns.c(a.c)) {
                this.d.c(this.d.e() + 1);
            }
        }
        if (this.m()) {
            return;
        }
        final aui aui = this.d.a(this.b);
        if (aui == null) {
            return;
        }
        aug \u2603 = new aug(aui.a, aui.b, aui.c, aui.a, aui.b, aui.c).b(0.5, 0.5, 0.5);
        final List<aug> a2 = this.c.a(this.b, \u2603.a(0.0, -1.0, 0.0));
        double b = -1.0;
        \u2603 = \u2603.c(0.0, 1.0, 0.0);
        for (final aug aug : a2) {
            b = aug.b(\u2603, b);
        }
        this.b.q().a(aui.a, aui.b + b, aui.c, this.e);
    }
    
    protected void l() {
        final aui c = this.c();
        int d = this.d.d();
        for (int i = this.d.e(); i < this.d.d(); ++i) {
            if (this.d.a(i).b != (int)c.b) {
                d = i;
                break;
            }
        }
        final float n = this.b.J * this.b.J * this.i;
        for (int j = this.d.e(); j < d; ++j) {
            final aui a = this.d.a(this.b, j);
            if (c.g(a) < n) {
                this.d.c(j + 1);
            }
        }
        int j = ns.f(this.b.J);
        final int n2 = (int)this.b.K + 1;
        final int n3 = j;
        for (int k = d - 1; k >= this.d.e(); --k) {
            if (this.a(c, this.d.a(this.b, k), j, n2, n3)) {
                this.d.c(k);
                break;
            }
        }
        this.a(c);
    }
    
    protected void a(final aui \u2603) {
        if (this.f - this.g > 100) {
            if (\u2603.g(this.h) < 2.25) {
                this.n();
            }
            this.g = this.f;
            this.h = \u2603;
        }
    }
    
    public boolean m() {
        return this.d == null || this.d.b();
    }
    
    public void n() {
        this.d = null;
    }
    
    protected abstract aui c();
    
    protected abstract boolean b();
    
    protected boolean o() {
        return this.b.V() || this.b.ab();
    }
    
    protected void d() {
    }
    
    protected abstract boolean a(final aui p0, final aui p1, final int p2, final int p3, final int p4);
}
