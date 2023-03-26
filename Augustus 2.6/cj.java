import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class cj extends df
{
    public static final cj a;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final long h;
    private static final long i;
    private static final long j;
    
    public cj(final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    public cj(final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    public cj(final pk \u2603) {
        this(\u2603.s, \u2603.t, \u2603.u);
    }
    
    public cj(final aui \u2603) {
        this(\u2603.a, \u2603.b, \u2603.c);
    }
    
    public cj(final df \u2603) {
        this(\u2603.n(), \u2603.o(), \u2603.p());
    }
    
    public cj a(final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 == 0.0 && \u2603 == 0.0 && \u2603 == 0.0) {
            return this;
        }
        return new cj(this.n() + \u2603, this.o() + \u2603, this.p() + \u2603);
    }
    
    public cj a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0 && \u2603 == 0 && \u2603 == 0) {
            return this;
        }
        return new cj(this.n() + \u2603, this.o() + \u2603, this.p() + \u2603);
    }
    
    public cj a(final df \u2603) {
        if (\u2603.n() == 0 && \u2603.o() == 0 && \u2603.p() == 0) {
            return this;
        }
        return new cj(this.n() + \u2603.n(), this.o() + \u2603.o(), this.p() + \u2603.p());
    }
    
    public cj b(final df \u2603) {
        if (\u2603.n() == 0 && \u2603.o() == 0 && \u2603.p() == 0) {
            return this;
        }
        return new cj(this.n() - \u2603.n(), this.o() - \u2603.o(), this.p() - \u2603.p());
    }
    
    public cj a() {
        return this.b(1);
    }
    
    public cj b(final int \u2603) {
        return this.a(cq.b, \u2603);
    }
    
    public cj b() {
        return this.c(1);
    }
    
    public cj c(final int \u2603) {
        return this.a(cq.a, \u2603);
    }
    
    public cj c() {
        return this.d(1);
    }
    
    public cj d(final int \u2603) {
        return this.a(cq.c, \u2603);
    }
    
    public cj d() {
        return this.e(1);
    }
    
    public cj e(final int \u2603) {
        return this.a(cq.d, \u2603);
    }
    
    public cj e() {
        return this.f(1);
    }
    
    public cj f(final int \u2603) {
        return this.a(cq.e, \u2603);
    }
    
    public cj f() {
        return this.g(1);
    }
    
    public cj g(final int \u2603) {
        return this.a(cq.f, \u2603);
    }
    
    public cj a(final cq \u2603) {
        return this.a(\u2603, 1);
    }
    
    public cj a(final cq \u2603, final int \u2603) {
        if (\u2603 == 0) {
            return this;
        }
        return new cj(this.n() + \u2603.g() * \u2603, this.o() + \u2603.h() * \u2603, this.p() + \u2603.i() * \u2603);
    }
    
    public cj c(final df \u2603) {
        return new cj(this.o() * \u2603.p() - this.p() * \u2603.o(), this.p() * \u2603.n() - this.n() * \u2603.p(), this.n() * \u2603.o() - this.o() * \u2603.n());
    }
    
    public long g() {
        return ((long)this.n() & cj.h) << cj.g | ((long)this.o() & cj.i) << cj.f | ((long)this.p() & cj.j) << 0;
    }
    
    public static cj a(final long \u2603) {
        final int \u26032 = (int)(\u2603 << 64 - cj.g - cj.c >> 64 - cj.c);
        final int \u26033 = (int)(\u2603 << 64 - cj.f - cj.e >> 64 - cj.e);
        final int \u26034 = (int)(\u2603 << 64 - cj.d >> 64 - cj.d);
        return new cj(\u26032, \u26033, \u26034);
    }
    
    public static Iterable<cj> a(final cj \u2603, final cj \u2603) {
        final cj cj = new cj(Math.min(\u2603.n(), \u2603.n()), Math.min(\u2603.o(), \u2603.o()), Math.min(\u2603.p(), \u2603.p()));
        final cj cj2 = new cj(Math.max(\u2603.n(), \u2603.n()), Math.max(\u2603.o(), \u2603.o()), Math.max(\u2603.p(), \u2603.p()));
        return new Iterable<cj>() {
            @Override
            public Iterator<cj> iterator() {
                return new AbstractIterator<cj>() {
                    private cj b = null;
                    
                    protected cj a() {
                        if (this.b == null) {
                            return this.b = cj;
                        }
                        if (this.b.equals(cj2)) {
                            return this.endOfData();
                        }
                        int \u2603 = this.b.n();
                        int \u26032 = this.b.o();
                        int p = this.b.p();
                        if (\u2603 < cj2.n()) {
                            ++\u2603;
                        }
                        else if (\u26032 < cj2.o()) {
                            \u2603 = cj.n();
                            ++\u26032;
                        }
                        else if (p < cj2.p()) {
                            \u2603 = cj.n();
                            \u26032 = cj.o();
                            ++p;
                        }
                        return this.b = new cj(\u2603, \u26032, p);
                    }
                };
            }
        };
    }
    
    public static Iterable<a> b(final cj \u2603, final cj \u2603) {
        final cj cj = new cj(Math.min(\u2603.n(), \u2603.n()), Math.min(\u2603.o(), \u2603.o()), Math.min(\u2603.p(), \u2603.p()));
        final cj cj2 = new cj(Math.max(\u2603.n(), \u2603.n()), Math.max(\u2603.o(), \u2603.o()), Math.max(\u2603.p(), \u2603.p()));
        return new Iterable<a>() {
            @Override
            public Iterator<a> iterator() {
                return new AbstractIterator<a>() {
                    private a b = null;
                    
                    protected a a() {
                        if (this.b == null) {
                            return this.b = new a(cj.n(), cj.o(), cj.p());
                        }
                        if (this.b.equals(cj2)) {
                            return this.endOfData();
                        }
                        int \u2603 = this.b.n();
                        int \u26032 = this.b.o();
                        int p = this.b.p();
                        if (\u2603 < cj2.n()) {
                            ++\u2603;
                        }
                        else if (\u26032 < cj2.o()) {
                            \u2603 = cj.n();
                            ++\u26032;
                        }
                        else if (p < cj2.p()) {
                            \u2603 = cj.n();
                            \u26032 = cj.o();
                            ++p;
                        }
                        this.b.c = \u2603;
                        this.b.d = \u26032;
                        this.b.e = p;
                        return this.b;
                    }
                };
            }
        };
    }
    
    static {
        a = new cj(0, 0, 0);
        c = 1 + ns.c(ns.b(30000000));
        d = cj.c;
        e = 64 - cj.c - cj.d;
        f = 0 + cj.d;
        g = cj.f + cj.e;
        h = (1L << cj.c) - 1L;
        i = (1L << cj.e) - 1L;
        j = (1L << cj.d) - 1L;
    }
    
    public static final class a extends cj
    {
        private int c;
        private int d;
        private int e;
        
        public a() {
            this(0, 0, 0);
        }
        
        public a(final int \u2603, final int \u2603, final int \u2603) {
            super(0, 0, 0);
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
        }
        
        @Override
        public int n() {
            return this.c;
        }
        
        @Override
        public int o() {
            return this.d;
        }
        
        @Override
        public int p() {
            return this.e;
        }
        
        public a c(final int \u2603, final int \u2603, final int \u2603) {
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
            return this;
        }
    }
}
