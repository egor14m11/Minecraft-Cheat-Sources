import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bcz implements amv
{
    private static final Logger a;
    private amy b;
    private nq<amy> c;
    private List<amy> d;
    private adm e;
    
    public bcz(final adm \u2603) {
        this.c = new nq<amy>();
        this.d = (List<amy>)Lists.newArrayList();
        this.b = new amx(\u2603, 0, 0);
        this.e = \u2603;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return true;
    }
    
    public void b(final int \u2603, final int \u2603) {
        final amy d = this.d(\u2603, \u2603);
        if (!d.f()) {
            d.d();
        }
        this.c.d(adg.a(\u2603, \u2603));
        this.d.remove(d);
    }
    
    public amy c(final int \u2603, final int \u2603) {
        final amy \u26032 = new amy(this.e, \u2603, \u2603);
        this.c.a(adg.a(\u2603, \u2603), \u26032);
        this.d.add(\u26032);
        \u26032.c(true);
        return \u26032;
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        final amy amy = this.c.a(adg.a(\u2603, \u2603));
        if (amy == null) {
            return this.b;
        }
        return amy;
    }
    
    @Override
    public boolean a(final boolean \u2603, final nu \u2603) {
        return true;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        final long currentTimeMillis = System.currentTimeMillis();
        for (final amy amy : this.d) {
            amy.b(System.currentTimeMillis() - currentTimeMillis > 5L);
        }
        if (System.currentTimeMillis() - currentTimeMillis > 100L) {
            bcz.a.info("Warning: Clientside chunk ticking took {} ms", new Object[] { System.currentTimeMillis() - currentTimeMillis });
        }
        return false;
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public String f() {
        return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public int g() {
        return this.d.size();
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
    
    static {
        a = LogManager.getLogger();
    }
}
