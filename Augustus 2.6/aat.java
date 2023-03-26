import java.util.List;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class aat extends zw
{
    private static final String[] a;
    
    public aat() {
        this.a(yz.c);
        this.d(0);
        this.a(true);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 == cq.a) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        final boolean a = c.a(\u2603, \u2603);
        if (!a) {
            if (!\u2603.p(\u2603).c().t().a()) {
                return false;
            }
            \u2603 = \u2603.a(\u2603);
        }
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (!afi.ce.d(\u2603, \u2603)) {
            return false;
        }
        if (!\u2603.D) {
            \u2603.a(\u2603, afi.ce.Q().a((amo<Comparable>)ajm.a, \u2603), 3);
            int \u26032 = 0;
            if (\u2603 == cq.b) {
                \u26032 = (ns.c(\u2603.y * 16.0f / 360.0f + 0.5) & 0xF);
            }
            final akw s = \u2603.s(\u2603);
            if (s instanceof alo) {
                final alo \u26033 = (alo)s;
                if (\u2603.i() == 3) {
                    GameProfile a2 = null;
                    if (\u2603.n()) {
                        final dn o = \u2603.o();
                        if (o.b("SkullOwner", 10)) {
                            a2 = dy.a(o.m("SkullOwner"));
                        }
                        else if (o.b("SkullOwner", 8) && o.j("SkullOwner").length() > 0) {
                            a2 = new GameProfile(null, o.j("SkullOwner"));
                        }
                    }
                    \u26033.a(a2);
                }
                else {
                    \u26033.a(\u2603.i());
                }
                \u26033.b(\u26032);
                afi.ce.a(\u2603, \u2603, \u26033);
            }
            --\u2603.b;
        }
        return true;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (int i = 0; i < aat.a.length; ++i) {
            \u2603.add(new zx(\u2603, 1, i));
        }
    }
    
    @Override
    public int a(final int \u2603) {
        return \u2603;
    }
    
    @Override
    public String e_(final zx \u2603) {
        int i = \u2603.i();
        if (i < 0 || i >= aat.a.length) {
            i = 0;
        }
        return super.a() + "." + aat.a[i];
    }
    
    @Override
    public String a(final zx \u2603) {
        if (\u2603.i() == 3 && \u2603.n()) {
            if (\u2603.o().b("SkullOwner", 8)) {
                return di.a("item.skull.player.name", \u2603.o().j("SkullOwner"));
            }
            if (\u2603.o().b("SkullOwner", 10)) {
                final dn m = \u2603.o().m("SkullOwner");
                if (m.b("Name", 8)) {
                    return di.a("item.skull.player.name", m.j("Name"));
                }
            }
        }
        return super.a(\u2603);
    }
    
    @Override
    public boolean a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("SkullOwner", 8) && \u2603.j("SkullOwner").length() > 0) {
            GameProfile b = new GameProfile(null, \u2603.j("SkullOwner"));
            b = alo.b(b);
            \u2603.a("SkullOwner", dy.a(new dn(), b));
            return true;
        }
        return false;
    }
    
    static {
        a = new String[] { "skeleton", "wither", "zombie", "char", "creeper" };
    }
}
