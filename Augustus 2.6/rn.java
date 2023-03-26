import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class rn extends rd
{
    private py a;
    private double b;
    private asx c;
    private te d;
    private boolean e;
    private List<te> f;
    
    public rn(final py \u2603, final double \u2603, final boolean \u2603) {
        this.f = (List<te>)Lists.newArrayList();
        this.a = \u2603;
        this.b = \u2603;
        this.e = \u2603;
        this.a(1);
        if (!(\u2603.s() instanceof sv)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }
    
    @Override
    public boolean a() {
        this.f();
        if (this.e && this.a.o.w()) {
            return false;
        }
        final tf a = this.a.o.ae().a(new cj(this.a), 0);
        if (a == null) {
            return false;
        }
        this.d = this.a(a);
        if (this.d == null) {
            return false;
        }
        final sv sv = (sv)this.a.s();
        final boolean g = sv.g();
        sv.b(false);
        this.c = sv.a(this.d.d());
        sv.b(g);
        if (this.c != null) {
            return true;
        }
        final aui a2 = tc.a(this.a, 10, 7, new aui(this.d.d().n(), this.d.d().o(), this.d.d().p()));
        if (a2 == null) {
            return false;
        }
        sv.b(false);
        this.c = this.a.s().a(a2.a, a2.b, a2.c);
        sv.b(g);
        return this.c != null;
    }
    
    @Override
    public boolean b() {
        if (this.a.s().m()) {
            return false;
        }
        final float n = this.a.J + 4.0f;
        return this.a.b(this.d.d()) > n * n;
    }
    
    @Override
    public void c() {
        this.a.s().a(this.c, this.b);
    }
    
    @Override
    public void d() {
        if (this.a.s().m() || this.a.b(this.d.d()) < 16.0) {
            this.f.add(this.d);
        }
    }
    
    private te a(final tf \u2603) {
        te te = null;
        int n = Integer.MAX_VALUE;
        final List<te> f = \u2603.f();
        for (final te \u26032 : f) {
            final int b = \u26032.b(ns.c(this.a.s), ns.c(this.a.t), ns.c(this.a.u));
            if (b < n) {
                if (this.a(\u26032)) {
                    continue;
                }
                te = \u26032;
                n = b;
            }
        }
        return te;
    }
    
    private boolean a(final te \u2603) {
        for (final te te : this.f) {
            if (\u2603.d().equals(te.d())) {
                return true;
            }
        }
        return false;
    }
    
    private void f() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}
