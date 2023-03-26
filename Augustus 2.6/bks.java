import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bks implements blb<pr>
{
    private final bct a;
    
    public bks(final bct \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final zx q = \u2603.q(3);
        if (q == null || q.b() == null) {
            return;
        }
        final zw b = q.b();
        final ave a = ave.A();
        bfl.E();
        if (\u2603.av()) {
            bfl.b(0.0f, 0.2f, 0.0f);
        }
        final boolean b2 = \u2603 instanceof wi || (\u2603 instanceof we && ((we)\u2603).co());
        if (!b2 && \u2603.j_()) {
            final float n = 2.0f;
            final float n2 = 1.4f;
            bfl.a(n2 / n, n2 / n, n2 / n);
            bfl.b(0.0f, 16.0f * \u2603, 0.0f);
        }
        this.a.c(0.0625f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (b instanceof yo) {
            final float n = 0.625f;
            bfl.b(0.0f, -0.25f, 0.0f);
            bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
            bfl.a(n, -n, -n);
            if (b2) {
                bfl.b(0.0f, 0.1875f, 0.0f);
            }
            a.ah().a(\u2603, q, bgr.b.d);
        }
        else if (b == zy.bX) {
            final float n = 1.1875f;
            bfl.a(n, -n, -n);
            if (b2) {
                bfl.b(0.0f, 0.0625f, 0.0f);
            }
            GameProfile gameProfile = null;
            if (q.n()) {
                final dn o = q.o();
                if (o.b("SkullOwner", 10)) {
                    gameProfile = dy.a(o.m("SkullOwner"));
                }
                else if (o.b("SkullOwner", 8)) {
                    final String j = o.j("SkullOwner");
                    if (!nx.b(j)) {
                        gameProfile = alo.b(new GameProfile(null, j));
                        o.a("SkullOwner", dy.a(new dn(), gameProfile));
                    }
                }
            }
            bhk.c.a(-0.5f, 0.0f, -0.5f, cq.b, 180.0f, q.i(), gameProfile, -1);
        }
        bfl.F();
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
