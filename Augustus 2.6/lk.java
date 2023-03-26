import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class lk implements jd
{
    private final MinecraftServer a;
    private final ek b;
    
    public lk(final MinecraftServer \u2603, final ek \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final jc \u2603) {
        this.b.a(\u2603.a());
        this.b.a(new lo(this.a, this.b));
    }
    
    @Override
    public void a(final eu \u2603) {
    }
}
