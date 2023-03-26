import java.util.UUID;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class lz extends ma<GameProfile>
{
    private final int a;
    private final boolean b;
    
    public lz(final GameProfile \u2603, final int \u2603, final boolean \u2603) {
        super(\u2603);
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public lz(final JsonObject \u2603) {
        super(b(\u2603), \u2603);
        this.a = (\u2603.has("level") ? \u2603.get("level").getAsInt() : 0);
        this.b = (\u2603.has("bypassesPlayerLimit") && \u2603.get("bypassesPlayerLimit").getAsBoolean());
    }
    
    public int a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    @Override
    protected void a(final JsonObject \u2603) {
        if (this.f() == null) {
            return;
        }
        \u2603.addProperty("uuid", (this.f().getId() == null) ? "" : this.f().getId().toString());
        \u2603.addProperty("name", this.f().getName());
        super.a(\u2603);
        \u2603.addProperty("level", this.a);
        \u2603.addProperty("bypassesPlayerLimit", this.b);
    }
    
    private static GameProfile b(final JsonObject \u2603) {
        if (!\u2603.has("uuid") || !\u2603.has("name")) {
            return null;
        }
        final String asString = \u2603.get("uuid").getAsString();
        UUID fromString;
        try {
            fromString = UUID.fromString(asString);
        }
        catch (Throwable t) {
            return null;
        }
        return new GameProfile(fromString, \u2603.get("name").getAsString());
    }
}
