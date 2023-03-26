import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class up extends un
{
    public up(final adm \u2603) {
        super(\u2603);
    }
    
    public up(final adm \u2603, final cj \u2603) {
        super(\u2603, \u2603);
        this.b(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5);
        final float n = 0.125f;
        final float n2 = 0.1875f;
        final float n3 = 0.25f;
        this.a(new aug(this.s - 0.1875, this.t - 0.25 + 0.125, this.u - 0.1875, this.s + 0.1875, this.t + 0.25 + 0.125, this.u + 0.1875));
    }
    
    @Override
    protected void h() {
        super.h();
    }
    
    public void a(final cq \u2603) {
    }
    
    @Override
    public int l() {
        return 9;
    }
    
    @Override
    public int m() {
        return 9;
    }
    
    @Override
    public float aS() {
        return -0.0625f;
    }
    
    @Override
    public boolean a(final double \u2603) {
        return \u2603 < 1024.0;
    }
    
    @Override
    public void b(final pk \u2603) {
    }
    
    @Override
    public boolean d(final dn \u2603) {
        return false;
    }
    
    @Override
    public void b(final dn \u2603) {
    }
    
    @Override
    public void a(final dn \u2603) {
    }
    
    @Override
    public boolean e(final wn \u2603) {
        final zx ba = \u2603.bA();
        boolean b = false;
        if (ba != null && ba.b() == zy.cn && !this.o.D) {
            final double n = 7.0;
            final List<ps> list = this.o.a((Class<? extends ps>)ps.class, new aug(this.s - n, this.t - n, this.u - n, this.s + n, this.t + n, this.u + n));
            for (final ps ps : list) {
                if (ps.cc() && ps.cd() == \u2603) {
                    ps.a(this, true);
                    b = true;
                }
            }
        }
        if (!this.o.D && !b) {
            this.J();
            if (\u2603.bA.d) {
                final double n = 7.0;
                final List<ps> list = this.o.a((Class<? extends ps>)ps.class, new aug(this.s - n, this.t - n, this.u - n, this.s + n, this.t + n, this.u + n));
                for (final ps ps : list) {
                    if (ps.cc() && ps.cd() == this) {
                        ps.a(true, false);
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean j() {
        return this.o.p(this.a).c() instanceof agt;
    }
    
    public static up a(final adm \u2603, final cj \u2603) {
        final up \u26032 = new up(\u2603, \u2603);
        \u26032.n = true;
        \u2603.d(\u26032);
        return \u26032;
    }
    
    public static up b(final adm \u2603, final cj \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        final List<up> a = \u2603.a((Class<? extends up>)up.class, new aug(n - 1.0, o - 1.0, p - 1.0, n + 1.0, o + 1.0, p + 1.0));
        for (final up up : a) {
            if (up.n().equals(\u2603)) {
                return up;
            }
        }
        return null;
    }
}
