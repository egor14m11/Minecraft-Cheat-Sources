import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahp extends ahj
{
    public ahp() {
        super(arm.w, false);
        this.L = 0.98f;
        this.a(true);
        this.a(yz.b);
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        \u2603.b(na.ab[afh.a(this)]);
        \u2603.a(0.025f);
        if (this.I() && ack.e(\u2603)) {
            final zx i = this.i(\u2603);
            if (i != null) {
                afh.a(\u2603, \u2603, i);
            }
        }
        else {
            if (\u2603.t.n()) {
                \u2603.g(\u2603);
                return;
            }
            final int f = ack.f(\u2603);
            this.b(\u2603, \u2603, \u2603, f);
            final arm t = \u2603.p(\u2603.b()).c().t();
            if (t.c() || t.d()) {
                \u2603.a(\u2603, afi.i.Q());
            }
        }
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.b(ads.b, \u2603) <= 11 - this.p()) {
            return;
        }
        if (\u2603.t.n()) {
            \u2603.g(\u2603);
            return;
        }
        this.b(\u2603, \u2603, \u2603.p(\u2603), 0);
        \u2603.a(\u2603, afi.j.Q());
    }
    
    @Override
    public int k() {
        return 0;
    }
}
