import java.io.IOException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class jg implements ff<jf>
{
    private GameProfile a;
    
    public jg() {
    }
    
    public jg(final GameProfile \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        final String c = \u2603.c(36);
        final String c2 = \u2603.c(16);
        final UUID fromString = UUID.fromString(c);
        this.a = new GameProfile(fromString, c2);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        final UUID id = this.a.getId();
        \u2603.a((id == null) ? "" : id.toString());
        \u2603.a(this.a.getName());
    }
    
    @Override
    public void a(final jf \u2603) {
        \u2603.a(this);
    }
    
    public GameProfile a() {
        return this.a;
    }
}
