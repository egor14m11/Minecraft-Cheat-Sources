import java.util.Random;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class qv extends rd
{
    private tm d;
    adm a;
    private tm e;
    int b;
    double c;
    
    public qv(final tm \u2603, final double \u2603) {
        this.d = \u2603;
        this.a = \u2603.o;
        this.c = \u2603;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        if (!this.d.cr()) {
            return false;
        }
        this.e = this.f();
        return this.e != null;
    }
    
    @Override
    public boolean b() {
        return this.e.ai() && this.e.cr() && this.b < 60;
    }
    
    @Override
    public void d() {
        this.e = null;
        this.b = 0;
    }
    
    @Override
    public void e() {
        this.d.p().a(this.e, 10.0f, (float)this.d.bQ());
        this.d.s().a(this.e, this.c);
        ++this.b;
        if (this.b >= 60 && this.d.h(this.e) < 9.0) {
            this.g();
        }
    }
    
    private tm f() {
        final float n = 8.0f;
        final List<tm> a = this.a.a(this.d.getClass(), this.d.aR().b(n, n, n));
        double h = Double.MAX_VALUE;
        tm tm = null;
        for (final tm \u2603 : a) {
            if (this.d.a(\u2603) && this.d.h(\u2603) < h) {
                tm = \u2603;
                h = this.d.h(\u2603);
            }
        }
        return tm;
    }
    
    private void g() {
        final ph a = this.d.a(this.e);
        if (a == null) {
            return;
        }
        wn wn = this.d.cq();
        if (wn == null && this.e.cq() != null) {
            wn = this.e.cq();
        }
        if (wn != null) {
            wn.b(na.A);
            if (this.d instanceof to) {
                wn.b(mr.H);
            }
        }
        this.d.b(6000);
        this.e.b(6000);
        this.d.cs();
        this.e.cs();
        a.b(-24000);
        a.b(this.d.s, this.d.t, this.d.u, 0.0f, 0.0f);
        this.a.d(a);
        final Random bc = this.d.bc();
        for (int i = 0; i < 7; ++i) {
            final double \u2603 = bc.nextGaussian() * 0.02;
            final double \u26032 = bc.nextGaussian() * 0.02;
            final double \u26033 = bc.nextGaussian() * 0.02;
            final double n = bc.nextDouble() * this.d.J * 2.0 - this.d.J;
            final double n2 = 0.5 + bc.nextDouble() * this.d.K;
            final double n3 = bc.nextDouble() * this.d.J * 2.0 - this.d.J;
            this.a.a(cy.I, this.d.s + n, this.d.t + n2, this.d.u + n3, \u2603, \u26032, \u26033, new int[0]);
        }
        if (this.a.Q().b("doMobLoot")) {
            this.a.d(new pp(this.a, this.d.s, this.d.t, this.d.u, bc.nextInt(7) + 1));
        }
    }
}
