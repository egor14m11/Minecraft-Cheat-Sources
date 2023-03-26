import java.util.Iterator;
import com.google.gson.JsonObject;
import java.io.File;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class mc extends mb<GameProfile, md>
{
    public mc(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    protected ma<GameProfile> a(final JsonObject \u2603) {
        return new md(\u2603);
    }
    
    public boolean a(final GameProfile \u2603) {
        return ((mb<GameProfile, V>)this).d(\u2603);
    }
    
    @Override
    public String[] a() {
        final String[] array = new String[((mb<K, md>)this).e().size()];
        int n = 0;
        for (final md md : ((mb<K, md>)this).e().values()) {
            array[n++] = md.f().getName();
        }
        return array;
    }
    
    protected String b(final GameProfile \u2603) {
        return \u2603.getId().toString();
    }
    
    public GameProfile a(final String \u2603) {
        for (final md md : ((mb<K, md>)this).e().values()) {
            if (\u2603.equalsIgnoreCase(md.f().getName())) {
                return md.f();
            }
        }
        return null;
    }
}
