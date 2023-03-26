import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.io.IOException;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmj implements bmm, bnj
{
    private static final Logger a;
    private final Map<jy, bmk> b;
    private final List<bmm> c;
    private final Map<String, Integer> d;
    private bni e;
    
    public bmj(final bni \u2603) {
        this.b = (Map<jy, bmk>)Maps.newHashMap();
        this.c = (List<bmm>)Lists.newArrayList();
        this.d = (Map<String, Integer>)Maps.newHashMap();
        this.e = \u2603;
    }
    
    public void a(final jy \u2603) {
        bmk \u26032 = this.b.get(\u2603);
        if (\u26032 == null) {
            \u26032 = new bme(\u2603);
            this.a(\u2603, \u26032);
        }
        bml.b(\u26032.b());
    }
    
    public boolean a(final jy \u2603, final bmn \u2603) {
        if (this.a(\u2603, (bmk)\u2603)) {
            this.c.add(\u2603);
            return true;
        }
        return false;
    }
    
    public boolean a(final jy \u2603, bmk \u2603) {
        boolean b = true;
        try {
            \u2603.a(this.e);
        }
        catch (IOException throwable) {
            bmj.a.warn("Failed to load texture: " + \u2603, throwable);
            \u2603 = bml.a;
            this.b.put(\u2603, \u2603);
            b = false;
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Registering texture");
            final c a2 = a.a("Resource location being registered");
            final bmk bmk = \u2603;
            a2.a("Resource location", \u2603);
            a2.a("Texture object class", new Callable<String>() {
                public String a() throws Exception {
                    return bmk.getClass().getName();
                }
            });
            throw new e(a);
        }
        this.b.put(\u2603, \u2603);
        return b;
    }
    
    public bmk b(final jy \u2603) {
        return this.b.get(\u2603);
    }
    
    public jy a(final String \u2603, final blz \u2603) {
        Integer n = this.d.get(\u2603);
        if (n == null) {
            n = 1;
        }
        else {
            ++n;
        }
        this.d.put(\u2603, n);
        final jy \u26032 = new jy(String.format("dynamic/%s_%d", \u2603, n));
        this.a(\u26032, \u2603);
        return \u26032;
    }
    
    @Override
    public void e() {
        for (final bmm bmm : this.c) {
            bmm.e();
        }
    }
    
    public void c(final jy \u2603) {
        final bmk b = this.b(\u2603);
        if (b != null) {
            bml.a(b.b());
        }
    }
    
    @Override
    public void a(final bni \u2603) {
        for (final Map.Entry<jy, bmk> entry : this.b.entrySet()) {
            this.a(entry.getKey(), entry.getValue());
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
