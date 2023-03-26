import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.MinecraftServer;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class alo extends akw
{
    private int a;
    private int f;
    private GameProfile g;
    
    public alo() {
        this.g = null;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("SkullType", (byte)(this.a & 0xFF));
        \u2603.a("Rot", (byte)(this.f & 0xFF));
        if (this.g != null) {
            final dn dn = new dn();
            dy.a(dn, this.g);
            \u2603.a("Owner", dn);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.d("SkullType");
        this.f = \u2603.d("Rot");
        if (this.a == 3) {
            if (\u2603.b("Owner", 10)) {
                this.g = dy.a(\u2603.m("Owner"));
            }
            else if (\u2603.b("ExtraType", 8)) {
                final String j = \u2603.j("ExtraType");
                if (!nx.b(j)) {
                    this.g = new GameProfile(null, j);
                    this.e();
                }
            }
        }
    }
    
    public GameProfile b() {
        return this.g;
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        return new ft(this.c, 4, dn);
    }
    
    public void a(final int \u2603) {
        this.a = \u2603;
        this.g = null;
    }
    
    public void a(final GameProfile \u2603) {
        this.a = 3;
        this.g = \u2603;
        this.e();
    }
    
    private void e() {
        this.g = b(this.g);
        this.p_();
    }
    
    public static GameProfile b(final GameProfile \u2603) {
        if (\u2603 == null || nx.b(\u2603.getName())) {
            return \u2603;
        }
        if (\u2603.isComplete() && \u2603.getProperties().containsKey("textures")) {
            return \u2603;
        }
        if (MinecraftServer.N() == null) {
            return \u2603;
        }
        GameProfile gameProfile = MinecraftServer.N().aF().a(\u2603.getName());
        if (gameProfile == null) {
            return \u2603;
        }
        final Property property = Iterables.getFirst((Iterable<? extends Property>)((ForwardingMultimap<String, Object>)gameProfile.getProperties()).get("textures"), (Property)null);
        if (property == null) {
            gameProfile = MinecraftServer.N().aD().fillProfileProperties(gameProfile, true);
        }
        return gameProfile;
    }
    
    public int c() {
        return this.a;
    }
    
    public int d() {
        return this.f;
    }
    
    public void b(final int \u2603) {
        this.f = \u2603;
    }
}
