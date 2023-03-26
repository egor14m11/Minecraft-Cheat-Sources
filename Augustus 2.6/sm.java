import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class sm extends st
{
    private boolean a;
    private int b;
    private final Class[] c;
    
    public sm(final py \u2603, final boolean \u2603, final Class... \u2603) {
        super(\u2603, false);
        this.a = \u2603;
        this.c = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        final int be = this.e.be();
        return be != this.b && this.a(this.e.bd(), false);
    }
    
    @Override
    public void c() {
        this.e.d(this.e.bd());
        this.b = this.e.be();
        if (this.a) {
            final double f = this.f();
            final List<py> a = this.e.o.a(this.e.getClass(), new aug(this.e.s, this.e.t, this.e.u, this.e.s + 1.0, this.e.t + 1.0, this.e.u + 1.0).b(f, 10.0, f));
            for (final py \u2603 : a) {
                if (this.e == \u2603) {
                    continue;
                }
                if (\u2603.u() != null) {
                    continue;
                }
                if (\u2603.c(this.e.bd())) {
                    continue;
                }
                boolean b = false;
                for (final Class clazz : this.c) {
                    if (\u2603.getClass() == clazz) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    continue;
                }
                this.a(\u2603, this.e.bd());
            }
        }
        super.c();
    }
    
    protected void a(final py \u2603, final pr \u2603) {
        \u2603.d(\u2603);
    }
}
