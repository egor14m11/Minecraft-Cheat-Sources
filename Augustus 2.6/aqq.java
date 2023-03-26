import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aqq extends any
{
    private aqs d;
    protected Map<Long, aqu> e;
    
    public aqq() {
        this.e = (Map<Long, aqu>)Maps.newHashMap();
    }
    
    public abstract String a();
    
    @Override
    protected final void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final ans \u2603) {
        this.a(\u2603);
        if (this.e.containsKey(adg.a(\u2603, \u2603))) {
            return;
        }
        this.b.nextInt();
        try {
            if (this.a(\u2603, \u2603)) {
                final aqu b = this.b(\u2603, \u2603);
                this.e.put(adg.a(\u2603, \u2603), b);
                this.a(\u2603, \u2603, b);
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Exception preparing structure feature");
            final c a2 = a.a("Feature being prepared");
            a2.a("Is feature chunk", new Callable<String>() {
                public String a() throws Exception {
                    return aqq.this.a(\u2603, \u2603) ? "True" : "False";
                }
            });
            a2.a("Chunk location", String.format("%d,%d", \u2603, \u2603));
            a2.a("Chunk pos hash", new Callable<String>() {
                public String a() throws Exception {
                    return String.valueOf(adg.a(\u2603, \u2603));
                }
            });
            a2.a("Structure type", new Callable<String>() {
                public String a() throws Exception {
                    return aqq.this.getClass().getCanonicalName();
                }
            });
            throw new e(a);
        }
    }
    
    public boolean a(final adm \u2603, final Random \u2603, final adg \u2603) {
        this.a(\u2603);
        final int n = (\u2603.a << 4) + 8;
        final int n2 = (\u2603.b << 4) + 8;
        boolean b = false;
        for (final aqu \u26032 : this.e.values()) {
            if (\u26032.d() && \u26032.a(\u2603) && \u26032.a().a(n, n2, n + 15, n2 + 15)) {
                \u26032.a(\u2603, \u2603, new aqe(n, n2, n + 15, n2 + 15));
                \u26032.b(\u2603);
                b = true;
                this.a(\u26032.e(), \u26032.f(), \u26032);
            }
        }
        return b;
    }
    
    public boolean b(final cj \u2603) {
        this.a(this.c);
        return this.c(\u2603) != null;
    }
    
    protected aqu c(final cj \u2603) {
        for (final aqu aqu : this.e.values()) {
            if (aqu.d() && aqu.a().b(\u2603)) {
                for (final aqt aqt : aqu.b()) {
                    if (aqt.c().b(\u2603)) {
                        return aqu;
                    }
                }
            }
        }
        return null;
    }
    
    public boolean a(final adm \u2603, final cj \u2603) {
        this.a(\u2603);
        for (final aqu aqu : this.e.values()) {
            if (aqu.d() && aqu.a().b(\u2603)) {
                return true;
            }
        }
        return false;
    }
    
    public cj b(final adm \u2603, final cj \u2603) {
        this.a(this.c = \u2603);
        this.b.setSeed(\u2603.J());
        final long nextLong = this.b.nextLong();
        final long nextLong2 = this.b.nextLong();
        final long n = (\u2603.n() >> 4) * nextLong;
        final long n2 = (\u2603.p() >> 4) * nextLong2;
        this.b.setSeed(n ^ n2 ^ \u2603.J());
        this.a(\u2603, \u2603.n() >> 4, \u2603.p() >> 4, 0, 0, null);
        double n3 = Double.MAX_VALUE;
        cj cj = null;
        for (final aqu aqu : this.e.values()) {
            if (aqu.d()) {
                final aqt aqt = aqu.b().get(0);
                final cj a = aqt.a();
                final double n4 = a.i(\u2603);
                if (n4 >= n3) {
                    continue;
                }
                n3 = n4;
                cj = a;
            }
        }
        if (cj != null) {
            return cj;
        }
        final List<cj> z_ = this.z_();
        if (z_ != null) {
            cj cj2 = null;
            for (final cj a : z_) {
                final double n4 = a.i(\u2603);
                if (n4 < n3) {
                    n3 = n4;
                    cj2 = a;
                }
            }
            return cj2;
        }
        return null;
    }
    
    protected List<cj> z_() {
        return null;
    }
    
    private void a(final adm \u2603) {
        if (this.d == null) {
            this.d = (aqs)\u2603.a(aqs.class, this.a());
            if (this.d == null) {
                this.d = new aqs(this.a());
                \u2603.a(this.a(), this.d);
            }
            else {
                final dn a = this.d.a();
                for (final String \u26032 : a.c()) {
                    final eb a2 = a.a(\u26032);
                    if (a2.a() == 10) {
                        final dn \u26033 = (dn)a2;
                        if (!\u26033.c("ChunkX") || !\u26033.c("ChunkZ")) {
                            continue;
                        }
                        final int f = \u26033.f("ChunkX");
                        final int f2 = \u26033.f("ChunkZ");
                        final aqu a3 = aqr.a(\u26033, \u2603);
                        if (a3 == null) {
                            continue;
                        }
                        this.e.put(adg.a(f, f2), a3);
                    }
                }
            }
        }
    }
    
    private void a(final int \u2603, final int \u2603, final aqu \u2603) {
        this.d.a(\u2603.a(\u2603, \u2603), \u2603, \u2603);
        this.d.c();
    }
    
    protected abstract boolean a(final int p0, final int p1);
    
    protected abstract aqu b(final int p0, final int p1);
}
