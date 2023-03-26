import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bkn<T extends bbo> implements blb<pr>
{
    protected static final jy b;
    protected T c;
    protected T d;
    private final bjl<?> a;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private static final Map<String, jy> j;
    
    public bkn(final bjl<?> \u2603) {
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.a = \u2603;
        this.a();
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 4);
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 3);
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 2);
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 1);
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    private void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603) {
        final zx a = this.a(\u2603, \u2603);
        if (a == null || !(a.b() instanceof yj)) {
            return;
        }
        final yj yj = (yj)a.b();
        final T a2 = this.a(\u2603);
        a2.a(this.a.b());
        a2.a(\u2603, \u2603, \u2603, \u2603);
        this.a(a2, \u2603);
        final boolean b = this.b(\u2603);
        this.a.a(this.a(yj, b));
        switch (bkn$1.a[yj.x_().ordinal()]) {
            case 1: {
                final int b2 = yj.b(a);
                final float n = (b2 >> 16 & 0xFF) / 255.0f;
                final float n2 = (b2 >> 8 & 0xFF) / 255.0f;
                final float n3 = (b2 & 0xFF) / 255.0f;
                bfl.c(this.f * n, this.g * n2, this.h * n3, this.e);
                a2.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                this.a.a(this.a(yj, b, "overlay"));
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                bfl.c(this.f, this.g, this.h, this.e);
                a2.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
                break;
            }
        }
        if (!this.i && a.w()) {
            this.a(\u2603, a2, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public zx a(final pr \u2603, final int \u2603) {
        return \u2603.q(\u2603 - 1);
    }
    
    public T a(final int \u2603) {
        return this.b(\u2603) ? this.c : this.d;
    }
    
    private boolean b(final int \u2603) {
        return \u2603 == 2;
    }
    
    private void a(final pr \u2603, final T \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float n = \u2603.W + \u2603;
        this.a.a(bkn.b);
        bfl.l();
        bfl.c(514);
        bfl.a(false);
        final float n2 = 0.5f;
        bfl.c(n2, n2, n2, 1.0f);
        for (int i = 0; i < 2; ++i) {
            bfl.f();
            bfl.b(768, 1);
            final float n3 = 0.76f;
            bfl.c(0.5f * n3, 0.25f * n3, 0.8f * n3, 1.0f);
            bfl.n(5890);
            bfl.D();
            final float n4 = 0.33333334f;
            bfl.a(n4, n4, n4);
            bfl.b(30.0f - i * 60.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(0.0f, n * (0.001f + i * 0.003f) * 20.0f, 0.0f);
            bfl.n(5888);
            \u2603.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        bfl.n(5890);
        bfl.D();
        bfl.n(5888);
        bfl.e();
        bfl.a(true);
        bfl.c(515);
        bfl.k();
    }
    
    private jy a(final yj \u2603, final boolean \u2603) {
        return this.a(\u2603, \u2603, null);
    }
    
    private jy a(final yj \u2603, final boolean \u2603, final String \u2603) {
        final String format = String.format("textures/models/armor/%s_layer_%d%s.png", \u2603.x_().c(), \u2603 ? 2 : 1, (\u2603 == null) ? "" : String.format("_%s", \u2603));
        jy jy = bkn.j.get(format);
        if (jy == null) {
            jy = new jy(format);
            bkn.j.put(format, jy);
        }
        return jy;
    }
    
    protected abstract void a();
    
    protected abstract void a(final T p0, final int p1);
    
    static {
        b = new jy("textures/misc/enchanted_item_glint.png");
        j = Maps.newHashMap();
    }
}
