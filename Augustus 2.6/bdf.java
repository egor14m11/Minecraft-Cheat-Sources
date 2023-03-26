import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.File;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bdf
{
    private static final Logger a;
    private final ave b;
    private final List<bde> c;
    
    public bdf(final ave \u2603) {
        this.c = (List<bde>)Lists.newArrayList();
        this.b = \u2603;
        this.a();
    }
    
    public void a() {
        try {
            this.c.clear();
            final dn a = dx.a(new File(this.b.v, "servers.dat"));
            if (a == null) {
                return;
            }
            final du c = a.c("servers", 10);
            for (int i = 0; i < c.c(); ++i) {
                this.c.add(bde.a(c.b(i)));
            }
        }
        catch (Exception throwable) {
            bdf.a.error("Couldn't load server list", throwable);
        }
    }
    
    public void b() {
        try {
            final du \u2603 = new du();
            for (final bde bde : this.c) {
                \u2603.a(bde.a());
            }
            final dn \u26032 = new dn();
            \u26032.a("servers", \u2603);
            dx.a(\u26032, new File(this.b.v, "servers.dat"));
        }
        catch (Exception throwable) {
            bdf.a.error("Couldn't save server list", throwable);
        }
    }
    
    public bde a(final int \u2603) {
        return this.c.get(\u2603);
    }
    
    public void b(final int \u2603) {
        this.c.remove(\u2603);
    }
    
    public void a(final bde \u2603) {
        this.c.add(\u2603);
    }
    
    public int c() {
        return this.c.size();
    }
    
    public void a(final int \u2603, final int \u2603) {
        final bde a = this.a(\u2603);
        this.c.set(\u2603, this.a(\u2603));
        this.c.set(\u2603, a);
        this.b();
    }
    
    public void a(final int \u2603, final bde \u2603) {
        this.c.set(\u2603, \u2603);
    }
    
    public static void b(final bde \u2603) {
        final bdf bdf = new bdf(ave.A());
        bdf.a();
        for (int i = 0; i < bdf.c(); ++i) {
            final bde a = bdf.a(i);
            if (a.a.equals(\u2603.a) && a.b.equals(\u2603.b)) {
                bdf.a(i, \u2603);
                break;
            }
        }
        bdf.b();
    }
    
    static {
        a = LogManager.getLogger();
    }
}
