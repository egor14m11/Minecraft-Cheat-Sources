import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ln implements jd
{
    private final MinecraftServer a;
    private final ek b;
    
    public ln(final MinecraftServer \u2603, final ek \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final jc \u2603) {
        switch (ln$1.a[\u2603.a().ordinal()]) {
            case 1: {
                this.b.a(el.d);
                if (\u2603.b() > 47) {
                    final fa fa = new fa("Outdated server! I'm still on 1.8.8");
                    this.b.a(new jj(fa));
                    this.b.a(fa);
                    break;
                }
                if (\u2603.b() < 47) {
                    final fa fa = new fa("Outdated client! Please use 1.8.8");
                    this.b.a(new jj(fa));
                    this.b.a(fa);
                    break;
                }
                this.b.a(new lo(this.a, this.b));
                break;
            }
            case 2: {
                this.b.a(el.c);
                this.b.a(new lp(this.a, this.b));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + \u2603.a());
            }
        }
    }
    
    @Override
    public void a(final eu \u2603) {
    }
}
