import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class lb implements ado
{
    private MinecraftServer a;
    private le b;
    
    public lb(final MinecraftServer \u2603, final le \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final int \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
    }
    
    @Override
    public void a(final pk \u2603) {
        this.b.s().a(\u2603);
    }
    
    @Override
    public void b(final pk \u2603) {
        this.b.s().b(\u2603);
        this.b.Z().a(\u2603);
    }
    
    @Override
    public void a(final String \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.a.ap().a(\u2603, \u2603, \u2603, (\u2603 > 1.0f) ? ((double)(16.0f * \u2603)) : 16.0, this.b.t.q(), new gs(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603));
    }
    
    @Override
    public void a(final wn \u2603, final String \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.a.ap().a(\u2603, \u2603, \u2603, \u2603, (\u2603 > 1.0f) ? ((double)(16.0f * \u2603)) : 16.0, this.b.t.q(), new gs(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603));
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public void a(final cj \u2603) {
        this.b.t().a(\u2603);
    }
    
    @Override
    public void b(final cj \u2603) {
    }
    
    @Override
    public void a(final String \u2603, final cj \u2603) {
    }
    
    @Override
    public void a(final wn \u2603, final int \u2603, final cj \u2603, final int \u2603) {
        this.a.ap().a(\u2603, \u2603.n(), \u2603.o(), \u2603.p(), 64.0, this.b.t.q(), new gq(\u2603, \u2603, \u2603, false));
    }
    
    @Override
    public void a(final int \u2603, final cj \u2603, final int \u2603) {
        this.a.ap().a(new gq(\u2603, \u2603, \u2603, true));
    }
    
    @Override
    public void b(final int \u2603, final cj \u2603, final int \u2603) {
        for (final lf lf : this.a.ap().v()) {
            if (lf != null && lf.o == this.b) {
                if (lf.F() == \u2603) {
                    continue;
                }
                final double n = \u2603.n() - lf.s;
                final double n2 = \u2603.o() - lf.t;
                final double n3 = \u2603.p() - lf.u;
                if (n * n + n2 * n2 + n3 * n3 >= 1024.0) {
                    continue;
                }
                lf.a.a(new fs(\u2603, \u2603, \u2603));
            }
        }
    }
}
