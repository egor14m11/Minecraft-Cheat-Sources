import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ams
{
    private final List<amq> a;
    private double b;
    private double c;
    private double d;
    private double e;
    private long f;
    private long g;
    private int h;
    private double i;
    private double j;
    private int k;
    private int l;
    
    public ams() {
        this.a = (List<amq>)Lists.newArrayList();
        this.b = 0.0;
        this.c = 0.0;
        this.d = 6.0E7;
        this.e = this.d;
        this.h = 29999984;
        this.i = 0.2;
        this.j = 5.0;
        this.k = 15;
        this.l = 5;
    }
    
    public boolean a(final cj \u2603) {
        return \u2603.n() + 1 > this.b() && \u2603.n() < this.d() && \u2603.p() + 1 > this.c() && \u2603.p() < this.e();
    }
    
    public boolean a(final adg \u2603) {
        return \u2603.e() > this.b() && \u2603.c() < this.d() && \u2603.f() > this.c() && \u2603.d() < this.e();
    }
    
    public boolean a(final aug \u2603) {
        return \u2603.d > this.b() && \u2603.a < this.d() && \u2603.f > this.c() && \u2603.c < this.e();
    }
    
    public double a(final pk \u2603) {
        return this.b(\u2603.s, \u2603.u);
    }
    
    public double b(final double \u2603, final double \u2603) {
        final double b = \u2603 - this.c();
        final double b2 = this.e() - \u2603;
        final double a = \u2603 - this.b();
        final double b3 = this.d() - \u2603;
        double n = Math.min(a, b3);
        n = Math.min(n, b);
        return Math.min(n, b2);
    }
    
    public amr a() {
        if (this.e < this.d) {
            return amr.b;
        }
        if (this.e > this.d) {
            return amr.a;
        }
        return amr.c;
    }
    
    public double b() {
        double n = this.f() - this.h() / 2.0;
        if (n < -this.h) {
            n = -this.h;
        }
        return n;
    }
    
    public double c() {
        double n = this.g() - this.h() / 2.0;
        if (n < -this.h) {
            n = -this.h;
        }
        return n;
    }
    
    public double d() {
        double n = this.f() + this.h() / 2.0;
        if (n > this.h) {
            n = this.h;
        }
        return n;
    }
    
    public double e() {
        double n = this.g() + this.h() / 2.0;
        if (n > this.h) {
            n = this.h;
        }
        return n;
    }
    
    public double f() {
        return this.b;
    }
    
    public double g() {
        return this.c;
    }
    
    public void c(final double \u2603, final double \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        for (final amq amq : this.k()) {
            amq.a(this, \u2603, \u2603);
        }
    }
    
    public double h() {
        if (this.a() != amr.c) {
            final double n = (System.currentTimeMillis() - this.g) / (float)(this.f - this.g);
            if (n < 1.0) {
                return this.d + (this.e - this.d) * n;
            }
            this.a(this.e);
        }
        return this.d;
    }
    
    public long i() {
        if (this.a() != amr.c) {
            return this.f - System.currentTimeMillis();
        }
        return 0L;
    }
    
    public double j() {
        return this.e;
    }
    
    public void a(final double \u2603) {
        this.d = \u2603;
        this.e = \u2603;
        this.f = System.currentTimeMillis();
        this.g = this.f;
        for (final amq amq : this.k()) {
            amq.a(this, \u2603);
        }
    }
    
    public void a(final double \u2603, final double \u2603, final long \u2603) {
        this.d = \u2603;
        this.e = \u2603;
        this.g = System.currentTimeMillis();
        this.f = this.g + \u2603;
        for (final amq amq : this.k()) {
            amq.a(this, \u2603, \u2603, \u2603);
        }
    }
    
    protected List<amq> k() {
        return (List<amq>)Lists.newArrayList((Iterable<?>)this.a);
    }
    
    public void a(final amq \u2603) {
        this.a.add(\u2603);
    }
    
    public void a(final int \u2603) {
        this.h = \u2603;
    }
    
    public int l() {
        return this.h;
    }
    
    public double m() {
        return this.j;
    }
    
    public void b(final double \u2603) {
        this.j = \u2603;
        for (final amq amq : this.k()) {
            amq.c(this, \u2603);
        }
    }
    
    public double n() {
        return this.i;
    }
    
    public void c(final double \u2603) {
        this.i = \u2603;
        for (final amq amq : this.k()) {
            amq.b(this, \u2603);
        }
    }
    
    public double o() {
        if (this.f == this.g) {
            return 0.0;
        }
        return Math.abs(this.d - this.e) / (this.f - this.g);
    }
    
    public int p() {
        return this.k;
    }
    
    public void b(final int \u2603) {
        this.k = \u2603;
        for (final amq amq : this.k()) {
            amq.a(this, \u2603);
        }
    }
    
    public int q() {
        return this.l;
    }
    
    public void c(final int \u2603) {
        this.l = \u2603;
        for (final amq amq : this.k()) {
            amq.b(this, \u2603);
        }
    }
}
