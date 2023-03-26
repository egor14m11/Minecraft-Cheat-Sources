import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class rc extends rd
{
    tm a;
    tm b;
    double c;
    private int d;
    
    public rc(final tm \u2603, final double \u2603) {
        this.a = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public boolean a() {
        if (this.a.l() >= 0) {
            return false;
        }
        final List<tm> a = this.a.o.a(this.a.getClass(), this.a.aR().b(8.0, 4.0, 8.0));
        tm b = null;
        double n = Double.MAX_VALUE;
        for (final tm \u2603 : a) {
            if (\u2603.l() < 0) {
                continue;
            }
            final double h = this.a.h(\u2603);
            if (h > n) {
                continue;
            }
            n = h;
            b = \u2603;
        }
        if (b == null) {
            return false;
        }
        if (n < 9.0) {
            return false;
        }
        this.b = b;
        return true;
    }
    
    @Override
    public boolean b() {
        if (this.a.l() >= 0) {
            return false;
        }
        if (!this.b.ai()) {
            return false;
        }
        final double h = this.a.h(this.b);
        return h >= 9.0 && h <= 256.0;
    }
    
    @Override
    public void c() {
        this.d = 0;
    }
    
    @Override
    public void d() {
        this.b = null;
    }
    
    @Override
    public void e() {
        final int d = this.d - 1;
        this.d = d;
        if (d > 0) {
            return;
        }
        this.d = 10;
        this.a.s().a(this.b, this.c);
    }
}
