import java.util.UUID;
import com.google.gson.JsonObject;
import java.util.Date;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class md extends ls<GameProfile>
{
    public md(final GameProfile \u2603) {
        this(\u2603, null, null, null, null);
    }
    
    public md(final GameProfile \u2603, final Date \u2603, final String \u2603, final Date \u2603, final String \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public md(final JsonObject \u2603) {
        super(b(\u2603), \u2603);
    }
    
    @Override
    protected void a(final JsonObject \u2603) {
        if (this.f() == null) {
            return;
        }
        \u2603.addProperty("uuid", (this.f().getId() == null) ? "" : this.f().getId().toString());
        \u2603.addProperty("name", this.f().getName());
        super.a(\u2603);
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
