import java.io.IOException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class jl implements ff<jk>
{
    private GameProfile a;
    
    public jl() {
    }
    
    public jl(final GameProfile \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = new GameProfile(null, \u2603.c(16));
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a.getName());
    }
    
    @Override
    public void a(final jk \u2603) {
        \u2603.a(this);
    }
    
    public GameProfile a() {
        return this.a;
    }
}
