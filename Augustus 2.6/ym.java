import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ym extends yo
{
    public ym() {
        super(afi.cK);
        this.h = 16;
        this.a(yz.c);
        this.a(true);
        this.d(0);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 == cq.a) {
            return false;
        }
        if (!\u2603.p(\u2603).c().t().a()) {
            return false;
        }
        \u2603 = \u2603.a(\u2603);
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (!afi.cK.d(\u2603, \u2603)) {
            return false;
        }
        if (\u2603.D) {
            return true;
        }
        if (\u2603 == cq.b) {
            final int i = ns.c((\u2603.y + 180.0f) * 16.0f / 360.0f + 0.5) & 0xF;
            \u2603.a(\u2603, afi.cK.Q().a((amo<Comparable>)ajv.a, i), 3);
        }
        else {
            \u2603.a(\u2603, afi.cL.Q().a((amo<Comparable>)akm.a, \u2603), 3);
        }
        --\u2603.b;
        final akw s = \u2603.s(\u2603);
        if (s instanceof aku) {
            ((aku)s).a(\u2603);
        }
        return true;
    }
    
    @Override
    public String a(final zx \u2603) {
        String string = "item.banner.";
        final zd h = this.h(\u2603);
        string = string + h.d() + ".name";
        return di.a(string);
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        final dn a = \u2603.a("BlockEntityTag", false);
        if (a == null || !a.c("Patterns")) {
            return;
        }
        final du c = a.c("Patterns", 10);
        for (int \u26032 = 0; \u26032 < c.c() && \u26032 < 6; ++\u26032) {
            final dn b = c.b(\u26032);
            final zd a2 = zd.a(b.f("Color"));
            final aku.a a3 = aku.a.a(b.j("Pattern"));
            if (a3 != null) {
                \u2603.add(di.a("item.banner." + a3.a() + "." + a2.d()));
            }
        }
    }
    
    @Override
    public int a(final zx \u2603, final int \u2603) {
        if (\u2603 == 0) {
            return 16777215;
        }
        final zd h = this.h(\u2603);
        return h.e().L;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final zd zd : zd.values()) {
            final dn dn = new dn();
            aku.a(dn, zd.b(), null);
            final dn \u26032 = new dn();
            \u26032.a("BlockEntityTag", dn);
            final zx zx = new zx(\u2603, 1, zd.b());
            zx.d(\u26032);
            \u2603.add(zx);
        }
    }
    
    @Override
    public yz c() {
        return yz.c;
    }
    
    private zd h(final zx \u2603) {
        final dn a = \u2603.a("BlockEntityTag", false);
        zd zd = null;
        if (a != null && a.c("Base")) {
            zd = zd.a(a.f("Base"));
        }
        else {
            zd = zd.a(\u2603.i());
        }
        return zd;
    }
}
