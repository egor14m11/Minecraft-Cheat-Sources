import org.apache.logging.log4j.LogManager;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bs extends i
{
    private static final Logger a;
    
    @Override
    public String c() {
        return "title";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.title.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.title.usage", new Object[0]);
        }
        if (\u2603.length < 3) {
            if ("title".equals(\u2603[1]) || "subtitle".equals(\u2603[1])) {
                throw new cf("commands.title.usage.title", new Object[0]);
            }
            if ("times".equals(\u2603[1])) {
                throw new cf("commands.title.usage.times", new Object[0]);
            }
        }
        final lf a = i.a(\u2603, \u2603[0]);
        final hv.a a2 = hv.a.a(\u2603[1]);
        if (a2 == hv.a.d || a2 == hv.a.e) {
            if (\u2603.length != 2) {
                throw new cf("commands.title.usage", new Object[0]);
            }
            final hv \u26032 = new hv(a2, null);
            a.a.a(\u26032);
            i.a(\u2603, this, "commands.title.success", new Object[0]);
        }
        else if (a2 == hv.a.c) {
            if (\u2603.length != 5) {
                throw new cf("commands.title.usage", new Object[0]);
            }
            final int a3 = i.a(\u2603[2]);
            final int a4 = i.a(\u2603[3]);
            final int a5 = i.a(\u2603[4]);
            final hv \u26033 = new hv(a3, a4, a5);
            a.a.a(\u26033);
            i.a(\u2603, this, "commands.title.success", new Object[0]);
        }
        else {
            if (\u2603.length < 3) {
                throw new cf("commands.title.usage", new Object[0]);
            }
            final String a6 = i.a(\u2603, 2);
            eu a7;
            try {
                a7 = eu.a.a(a6);
            }
            catch (JsonParseException throwable) {
                final Throwable rootCause = ExceptionUtils.getRootCause(throwable);
                throw new cc("commands.tellraw.jsonException", new Object[] { (rootCause == null) ? "" : rootCause.getMessage() });
            }
            final hv \u26034 = new hv(a2, ev.a(\u2603, a7, a));
            a.a.a(\u26034);
            i.a(\u2603, this, "commands.title.success", new Object[0]);
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, hv.a.a());
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
