import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class rw extends rd
{
    private wi a;
    private pr b;
    private double c;
    private int d;
    
    public rw(final wi \u2603, final double \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (this.a.l() >= 0) {
            return false;
        }
        if (this.a.bc().nextInt(400) != 0) {
            return false;
        }
        final List<wi> a = this.a.o.a((Class<? extends wi>)wi.class, this.a.aR().b(6.0, 3.0, 6.0));
        double n = Double.MAX_VALUE;
        for (final wi b : a) {
            if (b == this.a) {
                continue;
            }
            if (b.cn()) {
                continue;
            }
            if (b.l() >= 0) {
                continue;
            }
            final double h = b.h(this.a);
            if (h > n) {
                continue;
            }
            n = h;
            this.b = b;
        }
        if (this.b == null) {
            final aui a2 = tc.a(this.a, 16, 3);
            if (a2 == null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean b() {
        return this.d > 0;
    }
    
    @Override
    public void c() {
        if (this.b != null) {
            this.a.m(true);
        }
        this.d = 1000;
    }
    
    @Override
    public void d() {
        this.a.m(false);
        this.b = null;
    }
    
    @Override
    public void e() {
        --this.d;
        if (this.b != null) {
            if (this.a.h(this.b) > 4.0) {
                this.a.s().a(this.b, this.c);
            }
        }
        else if (this.a.s().m()) {
            final aui a = tc.a(this.a, 16, 3);
            if (a == null) {
                return;
            }
            this.a.s().a(a.a, a.b, a.c, this.c);
        }
    }
}
