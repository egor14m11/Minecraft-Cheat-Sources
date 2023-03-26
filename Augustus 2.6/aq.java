import net.minecraft.server.MinecraftServer;
import java.util.List;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.exception.ExceptionUtils;

// 
// Decompiled by Procyon v0.5.36
// 

public class aq extends i
{
    @Override
    public String c() {
        return "tellraw";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.tellraw.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.tellraw.usage", new Object[0]);
        }
        final wn a = i.a(\u2603, \u2603[0]);
        final String a2 = i.a(\u2603, 1);
        try {
            final eu a3 = eu.a.a(a2);
            a.a(ev.a(\u2603, a3, a));
        }
        catch (JsonParseException throwable) {
            final Throwable rootCause = ExceptionUtils.getRootCause(throwable);
            throw new cc("commands.tellraw.jsonException", new Object[] { (rootCause == null) ? "" : rootCause.getMessage() });
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
