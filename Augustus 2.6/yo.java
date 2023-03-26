import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class yo extends zw
{
    protected final afh a;
    
    public yo(final afh \u2603) {
        this.a = \u2603;
    }
    
    public yo b(final String \u2603) {
        super.c(\u2603);
        return this;
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (!c.a(\u2603, \u2603)) {
            \u2603 = \u2603.a(\u2603);
        }
        if (\u2603.b == 0) {
            return false;
        }
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (\u2603.a(this.a, \u2603, false, \u2603, null, \u2603)) {
            final int a = this.a(\u2603.i());
            alz alz = this.a.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, a, \u2603);
            if (\u2603.a(\u2603, alz, 3)) {
                alz = \u2603.p(\u2603);
                if (alz.c() == this.a) {
                    a(\u2603, \u2603, \u2603, \u2603);
                    this.a.a(\u2603, \u2603, alz, \u2603, \u2603);
                }
                \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, this.a.H.b(), (this.a.H.d() + 1.0f) / 2.0f, this.a.H.e() * 0.8f);
                --\u2603.b;
            }
            return true;
        }
        return false;
    }
    
    public static boolean a(final adm \u2603, final wn \u2603, final cj \u2603, final zx \u2603) {
        final MinecraftServer n = MinecraftServer.N();
        if (n == null) {
            return false;
        }
        if (\u2603.n() && \u2603.o().b("BlockEntityTag", 10)) {
            final akw s = \u2603.s(\u2603);
            if (s != null) {
                if (!\u2603.D && s.F() && !n.ap().h(\u2603.cd())) {
                    return false;
                }
                final dn dn = new dn();
                final dn \u26032 = (dn)dn.b();
                s.b(dn);
                final dn \u26033 = (dn)\u2603.o().a("BlockEntityTag");
                dn.a(\u26033);
                dn.a("x", \u2603.n());
                dn.a("y", \u2603.o());
                dn.a("z", \u2603.p());
                if (!dn.equals(\u26032)) {
                    s.a(dn);
                    s.p_();
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean a(final adm \u2603, cj \u2603, cq \u2603, final wn \u2603, final zx \u2603) {
        final afh c = \u2603.p(\u2603).c();
        if (c == afi.aH) {
            \u2603 = cq.b;
        }
        else if (!c.a(\u2603, \u2603)) {
            \u2603 = \u2603.a(\u2603);
        }
        return \u2603.a(this.a, \u2603, false, \u2603, null, \u2603);
    }
    
    @Override
    public String e_(final zx \u2603) {
        return this.a.a();
    }
    
    @Override
    public String a() {
        return this.a.a();
    }
    
    @Override
    public yz c() {
        return this.a.L();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        this.a.a(\u2603, \u2603, \u2603);
    }
    
    public afh d() {
        return this.a;
    }
}
