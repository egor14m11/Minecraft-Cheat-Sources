import java.util.Iterator;
import com.google.gson.JsonObject;
import java.io.File;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class me extends mb<GameProfile, mf>
{
    public me(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    protected ma<GameProfile> a(final JsonObject \u2603) {
        return new mf(\u2603);
    }
    
    @Override
    public String[] a() {
        final String[] array = new String[((mb<K, mf>)this).e().size()];
        int n = 0;
        for (final mf mf : ((mb<K, mf>)this).e().values()) {
            array[n++] = mf.f().getName();
        }
        return array;
    }
    
    protected String b(final GameProfile \u2603) {
        return \u2603.getId().toString();
    }
    
    public GameProfile a(final String \u2603) {
        for (final mf mf : ((mb<K, mf>)this).e().values()) {
            if (\u2603.equalsIgnoreCase(mf.f().getName())) {
                return mf.f();
            }
        }
        return null;
    }
}
