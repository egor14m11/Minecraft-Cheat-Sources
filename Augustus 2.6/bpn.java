import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpn extends lx
{
    private dn f;
    
    public bpn(final bpo \u2603) {
        super(\u2603);
        this.a(10);
    }
    
    @Override
    protected void b(final lf \u2603) {
        if (\u2603.e_().equals(this.b().S())) {
            \u2603.e(this.f = new dn());
        }
        super.b(\u2603);
    }
    
    @Override
    public String a(final SocketAddress \u2603, final GameProfile \u2603) {
        if (\u2603.getName().equalsIgnoreCase(this.b().S()) && this.a(\u2603.getName()) != null) {
            return "That name is already taken.";
        }
        return super.a(\u2603, \u2603);
    }
    
    public bpo b() {
        return (bpo)super.c();
    }
    
    @Override
    public dn t() {
        return this.f;
    }
}
