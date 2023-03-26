import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class wd extends vv implements vx
{
    private static final UUID a;
    private static final qd b;
    private static final zw[] c;
    private int bm;
    
    public wd(final adm \u2603) {
        super(\u2603);
        this.a(0.6f, 1.95f);
        this.i.a(1, new ra(this));
        this.i.a(2, new sa(this, 1.0, 60, 10.0f));
        this.i.a(2, new rz(this, 1.0));
        this.i.a(3, new ri(this, wn.class, 8.0f));
        this.i.a(3, new ry(this));
        this.bi.a(1, new sm(this, false, new Class[0]));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
    }
    
    @Override
    protected void h() {
        super.h();
        this.H().a(21, (Byte)0);
    }
    
    @Override
    protected String z() {
        return null;
    }
    
    @Override
    protected String bo() {
        return null;
    }
    
    @Override
    protected String bp() {
        return null;
    }
    
    public void a(final boolean \u2603) {
        this.H().b(21, (byte)(\u2603 ? 1 : 0));
    }
    
    public boolean n() {
        return this.H().a(21) == 1;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(26.0);
        this.a(vy.d).a(0.25);
    }
    
    @Override
    public void m() {
        if (!this.o.D) {
            if (this.n()) {
                if (this.bm-- <= 0) {
                    this.a(false);
                    final zx ba = this.bA();
                    this.c(0, null);
                    if (ba != null && ba.b() == zy.bz) {
                        final List<pf> h = zy.bz.h(ba);
                        if (h != null) {
                            for (final pf \u2603 : h) {
                                this.c(new pf(\u2603));
                            }
                        }
                    }
                    this.a(vy.d).c(wd.b);
                }
            }
            else {
                int \u26032 = -1;
                if (this.V.nextFloat() < 0.15f && this.a(arm.h) && !this.a(pe.o)) {
                    \u26032 = 8237;
                }
                else if (this.V.nextFloat() < 0.15f && this.at() && !this.a(pe.n)) {
                    \u26032 = 16307;
                }
                else if (this.V.nextFloat() < 0.05f && this.bn() < this.bu()) {
                    \u26032 = 16341;
                }
                else if (this.V.nextFloat() < 0.25f && this.u() != null && !this.a(pe.c) && this.u().h(this) > 121.0) {
                    \u26032 = 16274;
                }
                else if (this.V.nextFloat() < 0.25f && this.u() != null && !this.a(pe.c) && this.u().h(this) > 121.0) {
                    \u26032 = 16274;
                }
                if (\u26032 > -1) {
                    this.c(0, new zx(zy.bz, 1, \u26032));
                    this.bm = this.bA().l();
                    this.a(true);
                    final qc a = this.a(vy.d);
                    a.c(wd.b);
                    a.b(wd.b);
                }
            }
            if (this.V.nextFloat() < 7.5E-4f) {
                this.o.a(this, (byte)15);
            }
        }
        super.m();
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 15) {
            for (int i = 0; i < this.V.nextInt(35) + 10; ++i) {
                this.o.a(cy.r, this.s + this.V.nextGaussian() * 0.12999999523162842, this.aR().e + 0.5 + this.V.nextGaussian() * 0.12999999523162842, this.u + this.V.nextGaussian() * 0.12999999523162842, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    protected float c(final ow \u2603, float \u2603) {
        \u2603 = super.c(\u2603, \u2603);
        if (\u2603.j() == this) {
            \u2603 = 0.0f;
        }
        if (\u2603.s()) {
            \u2603 *= (float)0.15;
        }
        return \u2603;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(3) + 1, i = 0; i < n; ++i) {
            int nextInt = this.V.nextInt(3);
            final zw \u26032 = wd.c[this.V.nextInt(wd.c.length)];
            if (\u2603 > 0) {
                nextInt += this.V.nextInt(\u2603 + 1);
            }
            for (int j = 0; j < nextInt; ++j) {
                this.a(\u26032, 1);
            }
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603) {
        if (this.n()) {
            return;
        }
        final xc \u26032 = new xc(this.o, this, 32732);
        final double n = \u2603.t + \u2603.aS() - 1.100000023841858;
        final xc xc = \u26032;
        xc.z += 20.0f;
        final double \u26033 = \u2603.s + \u2603.v - this.s;
        final double n2 = n - this.t;
        final double \u26034 = \u2603.u + \u2603.x - this.u;
        final float a = ns.a(\u26033 * \u26033 + \u26034 * \u26034);
        if (a >= 8.0f && !\u2603.a(pe.d)) {
            \u26032.a(32698);
        }
        else if (\u2603.bn() >= 8.0f && !\u2603.a(pe.u)) {
            \u26032.a(32660);
        }
        else if (a <= 3.0f && !\u2603.a(pe.t) && this.V.nextFloat() < 0.25f) {
            \u26032.a(32696);
        }
        \u26032.c(\u26033, n2 + a * 0.2f, \u26034, 0.75f, 8.0f);
        this.o.d(\u26032);
    }
    
    @Override
    public float aS() {
        return 1.62f;
    }
    
    static {
        a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
        b = new qd(wd.a, "Drinking speed penalty", -0.25, 0).a(false);
        c = new zw[] { zy.aT, zy.aY, zy.aC, zy.bB, zy.bA, zy.H, zy.y, zy.y };
    }
}
