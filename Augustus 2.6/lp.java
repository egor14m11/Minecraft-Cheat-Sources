import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class lp implements jt
{
    private static final eu a;
    private final MinecraftServer b;
    private final ek c;
    private boolean d;
    
    public lp(final MinecraftServer \u2603, final ek \u2603) {
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final eu \u2603) {
    }
    
    @Override
    public void a(final jv \u2603) {
        if (this.d) {
            this.c.a(lp.a);
            return;
        }
        this.d = true;
        this.c.a(new jr(this.b.aG()));
    }
    
    @Override
    public void a(final ju \u2603) {
        this.c.a(new jq(\u2603.a()));
        this.c.a(lp.a);
    }
    
    static {
        a = new fa("Status request has been handled.");
    }
}
