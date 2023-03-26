import java.net.SocketAddress;
import com.google.gson.JsonObject;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class lu extends mb<String, lv>
{
    public lu(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    protected ma<String> a(final JsonObject \u2603) {
        return new lv(\u2603);
    }
    
    public boolean a(final SocketAddress \u2603) {
        final String c = this.c(\u2603);
        return ((mb<String, V>)this).d(c);
    }
    
    public lv b(final SocketAddress \u2603) {
        final String c = this.c(\u2603);
        return this.b(c);
    }
    
    private String c(final SocketAddress \u2603) {
        String s = \u2603.toString();
        if (s.contains("/")) {
            s = s.substring(s.indexOf(47) + 1);
        }
        if (s.contains(":")) {
            s = s.substring(0, s.indexOf(58));
        }
        return s;
    }
}
