import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ayw extends ayl
{
    private boolean u;
    
    public ayw(final xi \u2603) {
        super(\u2603);
    }
    
    @Override
    public void b() {
        super.b();
        this.a();
    }
    
    protected void a() {
        if (!this.j.h.bl().isEmpty()) {
            this.i = 160 + (this.l - this.f - 200) / 2;
            this.u = true;
        }
        else {
            this.i = (this.l - this.f) / 2;
            this.u = false;
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (this.u) {
            this.f();
        }
    }
    
    private void f() {
        final int \u2603 = this.i - 124;
        int r = this.r;
        final int n = 166;
        final Collection<pf> bl = this.j.h.bl();
        if (bl.isEmpty()) {
            return;
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.f();
        int n2 = 33;
        if (bl.size() > 5) {
            n2 = 132 / (bl.size() - 1);
        }
        for (final pf \u26032 : this.j.h.bl()) {
            final pe pe = pe.a[\u26032.a()];
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.j.P().a(ayw.a);
            this.b(\u2603, r, 0, 166, 140, 32);
            if (pe.e()) {
                final int f = pe.f();
                this.b(\u2603 + 6, r + 7, 0 + f % 8 * 18, 198 + f / 8 * 18, 18, 18);
            }
            String s = bnq.a(pe.a(), new Object[0]);
            if (\u26032.c() == 1) {
                s = s + " " + bnq.a("enchantment.level.2", new Object[0]);
            }
            else if (\u26032.c() == 2) {
                s = s + " " + bnq.a("enchantment.level.3", new Object[0]);
            }
            else if (\u26032.c() == 3) {
                s = s + " " + bnq.a("enchantment.level.4", new Object[0]);
            }
            this.q.a(s, (float)(\u2603 + 10 + 18), (float)(r + 6), 16777215);
            final String a = pe.a(\u26032);
            this.q.a(a, (float)(\u2603 + 10 + 18), (float)(r + 6 + 10), 8355711);
            r += n2;
        }
    }
}
