import com.google.common.collect.Maps;
import java.util.Random;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class tv extends tm
{
    private final xp bm;
    private static final Map<zd, float[]> bo;
    private int bp;
    private qy bq;
    
    public static float[] a(final zd \u2603) {
        return tv.bo.get(\u2603);
    }
    
    public tv(final adm \u2603) {
        super(\u2603);
        this.bm = new xp(new xi() {
            @Override
            public boolean a(final wn \u2603) {
                return false;
            }
        }, 2, 1);
        this.bq = new qy(this);
        this.a(0.9f, 1.3f);
        ((sv)this.s()).a(true);
        this.i.a(0, new ra(this));
        this.i.a(1, new rv(this, 1.25));
        this.i.a(2, new qv(this, 1.0));
        this.i.a(3, new sh(this, 1.1, zy.O, false));
        this.i.a(4, new rc(this, 1.1));
        this.i.a(5, this.bq);
        this.i.a(6, new rz(this, 1.0));
        this.i.a(7, new ri(this, wn.class, 6.0f));
        this.i.a(8, new ry(this));
        this.bm.a(0, new zx(zy.aW, 1, 0));
        this.bm.a(1, new zx(zy.aW, 1, 0));
    }
    
    @Override
    protected void E() {
        this.bp = this.bq.f();
        super.E();
    }
    
    @Override
    public void m() {
        if (this.o.D) {
            this.bp = Math.max(0, this.bp - 1);
        }
        super.m();
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(8.0);
        this.a(vy.d).a(0.23000000417232513);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Byte((byte)0));
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        if (!this.cm()) {
            this.a(new zx(zw.a(afi.L), 1, this.cl().a()), 0.0f);
        }
        for (int n = this.V.nextInt(2) + 1 + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            if (this.at()) {
                this.a(zy.bn, 1);
            }
            else {
                this.a(zy.bm, 1);
            }
        }
    }
    
    @Override
    protected zw A() {
        return zw.a(afi.L);
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 10) {
            this.bp = 40;
        }
        else {
            super.a(\u2603);
        }
    }
    
    public float p(final float \u2603) {
        if (this.bp <= 0) {
            return 0.0f;
        }
        if (this.bp >= 4 && this.bp <= 36) {
            return 1.0f;
        }
        if (this.bp < 4) {
            return (this.bp - \u2603) / 4.0f;
        }
        return -(this.bp - 40 - \u2603) / 4.0f;
    }
    
    public float q(final float \u2603) {
        if (this.bp > 4 && this.bp <= 36) {
            final float n = (this.bp - 4 - \u2603) / 32.0f;
            return 0.62831855f + 0.21991149f * ns.a(n * 28.7f);
        }
        if (this.bp > 0) {
            return 0.62831855f;
        }
        return this.z / 57.295776f;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.be && !this.cm() && !this.j_()) {
            if (!this.o.D) {
                this.l(true);
                for (int n = 1 + this.V.nextInt(3), i = 0; i < n; ++i) {
                    final uz a;
                    final uz uz = a = this.a(new zx(zw.a(afi.L), 1, this.cl().a()), 1.0f);
                    a.w += this.V.nextFloat() * 0.05f;
                    final uz uz2 = uz;
                    uz2.v += (this.V.nextFloat() - this.V.nextFloat()) * 0.1f;
                    final uz uz3 = uz;
                    uz3.x += (this.V.nextFloat() - this.V.nextFloat()) * 0.1f;
                }
            }
            h.a(1, \u2603);
            this.a("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.a(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Sheared", this.cm());
        \u2603.a("Color", (byte)this.cl().a());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.l(\u2603.n("Sheared"));
        this.b(zd.b(\u2603.d("Color")));
    }
    
    @Override
    protected String z() {
        return "mob.sheep.say";
    }
    
    @Override
    protected String bo() {
        return "mob.sheep.say";
    }
    
    @Override
    protected String bp() {
        return "mob.sheep.say";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.sheep.step", 0.15f, 1.0f);
    }
    
    public zd cl() {
        return zd.b(this.ac.a(16) & 0xF);
    }
    
    public void b(final zd \u2603) {
        final byte a = this.ac.a(16);
        this.ac.b(16, (byte)((a & 0xF0) | (\u2603.a() & 0xF)));
    }
    
    public boolean cm() {
        return (this.ac.a(16) & 0x10) != 0x0;
    }
    
    public void l(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x10));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFEF));
        }
    }
    
    public static zd a(final Random \u2603) {
        final int nextInt = \u2603.nextInt(100);
        if (nextInt < 5) {
            return zd.p;
        }
        if (nextInt < 10) {
            return zd.h;
        }
        if (nextInt < 15) {
            return zd.i;
        }
        if (nextInt < 18) {
            return zd.m;
        }
        if (\u2603.nextInt(500) == 0) {
            return zd.g;
        }
        return zd.a;
    }
    
    public tv b(final ph \u2603) {
        final tv \u26032 = (tv)\u2603;
        final tv tv = new tv(this.o);
        tv.b(this.a(this, \u26032));
        return tv;
    }
    
    @Override
    public void v() {
        this.l(false);
        if (this.j_()) {
            this.a(60);
        }
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        this.b(a(this.o.s));
        return \u2603;
    }
    
    private zd a(final tm \u2603, final tm \u2603) {
        final int b = ((tv)\u2603).cl().b();
        final int b2 = ((tv)\u2603).cl().b();
        this.bm.a(0).b(b);
        this.bm.a(1).b(b2);
        final zx a = abt.a().a(this.bm, ((tv)\u2603).o);
        int i;
        if (a != null && a.b() == zy.aW) {
            i = a.i();
        }
        else {
            i = (this.o.s.nextBoolean() ? b : b2);
        }
        return zd.a(i);
    }
    
    @Override
    public float aS() {
        return 0.95f * this.K;
    }
    
    static {
        (bo = Maps.newEnumMap(zd.class)).put(zd.a, new float[] { 1.0f, 1.0f, 1.0f });
        tv.bo.put(zd.b, new float[] { 0.85f, 0.5f, 0.2f });
        tv.bo.put(zd.c, new float[] { 0.7f, 0.3f, 0.85f });
        tv.bo.put(zd.d, new float[] { 0.4f, 0.6f, 0.85f });
        tv.bo.put(zd.e, new float[] { 0.9f, 0.9f, 0.2f });
        tv.bo.put(zd.f, new float[] { 0.5f, 0.8f, 0.1f });
        tv.bo.put(zd.g, new float[] { 0.95f, 0.5f, 0.65f });
        tv.bo.put(zd.h, new float[] { 0.3f, 0.3f, 0.3f });
        tv.bo.put(zd.i, new float[] { 0.6f, 0.6f, 0.6f });
        tv.bo.put(zd.j, new float[] { 0.3f, 0.5f, 0.6f });
        tv.bo.put(zd.k, new float[] { 0.5f, 0.25f, 0.7f });
        tv.bo.put(zd.l, new float[] { 0.2f, 0.3f, 0.7f });
        tv.bo.put(zd.m, new float[] { 0.4f, 0.3f, 0.2f });
        tv.bo.put(zd.n, new float[] { 0.4f, 0.5f, 0.2f });
        tv.bo.put(zd.o, new float[] { 0.6f, 0.2f, 0.2f });
        tv.bo.put(zd.p, new float[] { 0.1f, 0.1f, 0.1f });
    }
}
