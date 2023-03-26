import java.util.Iterator;
import com.google.gson.JsonObject;
import java.io.File;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class ly extends mb<GameProfile, lz>
{
    public ly(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    protected ma<GameProfile> a(final JsonObject \u2603) {
        return new lz(\u2603);
    }
    
    @Override
    public String[] a() {
        final String[] array = new String[((mb<K, lz>)this).e().size()];
        int n = 0;
        for (final lz lz : ((mb<K, lz>)this).e().values()) {
            array[n++] = lz.f().getName();
        }
        return array;
    }
    
    public boolean b(final GameProfile \u2603) {
        final lz lz = this.b(\u2603);
        return lz != null && lz.b();
    }
    
    protected String c(final GameProfile \u2603) {
        return \u2603.getId().toString();
    }
    
    public GameProfile a(final String \u2603) {
        for (final lz lz : ((mb<K, lz>)this).e().values()) {
            if (\u2603.equalsIgnoreCase(lz.f().getName())) {
                return lz.f();
            }
        }
        return null;
    }
}
