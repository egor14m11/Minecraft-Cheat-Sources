import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ld implements amv
{
    private static final Logger b;
    private Set<Long> c;
    private amy d;
    private amv e;
    private and f;
    public boolean a;
    private nq<amy> g;
    private List<amy> h;
    private le i;
    
    public ld(final le \u2603, final and \u2603, final amv \u2603) {
        this.c = Collections.newSetFromMap(new ConcurrentHashMap<Long, Boolean>());
        this.a = true;
        this.g = new nq<amy>();
        this.h = (List<amy>)Lists.newArrayList();
        this.d = new amx(\u2603, 0, 0);
        this.i = \u2603;
        this.f = \u2603;
        this.e = \u2603;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return this.g.b(adg.a(\u2603, \u2603));
    }
    
    public List<amy> a() {
        return this.h;
    }
    
    public void b(final int \u2603, final int \u2603) {
        if (this.i.t.e()) {
            if (!this.i.c(\u2603, \u2603)) {
                this.c.add(adg.a(\u2603, \u2603));
            }
        }
        else {
            this.c.add(adg.a(\u2603, \u2603));
        }
    }
    
    public void b() {
        for (final amy amy : this.h) {
            this.b(amy.a, amy.b);
        }
    }
    
    public amy c(final int \u2603, final int \u2603) {
        final long a = adg.a(\u2603, \u2603);
        this.c.remove(a);
        amy \u26032 = this.g.a(a);
        if (\u26032 == null) {
            \u26032 = this.e(\u2603, \u2603);
            if (\u26032 == null) {
                if (this.e == null) {
                    \u26032 = this.d;
                }
                else {
                    try {
                        \u26032 = this.e.d(\u2603, \u2603);
                    }
                    catch (Throwable \u26033) {
                        final b a2 = b.a(\u26033, "Exception generating new chunk");
                        final c a3 = a2.a("Chunk to be generated");
                        a3.a("Location", String.format("%d,%d", \u2603, \u2603));
                        a3.a("Position hash", a);
                        a3.a("Generator", this.e.f());
                        throw new e(a2);
                    }
                }
            }
            this.g.a(a, \u26032);
            this.h.add(\u26032);
            \u26032.c();
            \u26032.a(this, this, \u2603, \u2603);
        }
        return \u26032;
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        final amy amy = this.g.a(adg.a(\u2603, \u2603));
        if (amy != null) {
            return amy;
        }
        if (this.i.ad() || this.a) {
            return this.c(\u2603, \u2603);
        }
        return this.d;
    }
    
    private amy e(final int \u2603, final int \u2603) {
        if (this.f == null) {
            return null;
        }
        try {
            final amy a = this.f.a(this.i, \u2603, \u2603);
            if (a != null) {
                a.b(this.i.K());
                if (this.e != null) {
                    this.e.a(a, \u2603, \u2603);
                }
            }
            return a;
        }
        catch (Exception throwable) {
            ld.b.error("Couldn't load chunk", throwable);
            return null;
        }
    }
    
    private void a(final amy \u2603) {
        if (this.f == null) {
            return;
        }
        try {
            this.f.b(this.i, \u2603);
        }
        catch (Exception throwable) {
            ld.b.error("Couldn't save entities", throwable);
        }
    }
    
    private void b(final amy \u2603) {
        if (this.f == null) {
            return;
        }
        try {
            \u2603.b(this.i.K());
            this.f.a(this.i, \u2603);
        }
        catch (IOException throwable) {
            ld.b.error("Couldn't save chunk", throwable);
        }
        catch (adn throwable2) {
            ld.b.error("Couldn't save chunk; already in use by another instance of Minecraft?", throwable2);
        }
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
        final amy d = this.d(\u2603, \u2603);
        if (!d.t()) {
            d.n();
            if (this.e != null) {
                this.e.a(\u2603, \u2603, \u2603);
                d.e();
            }
        }
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        if (this.e != null && this.e.a(\u2603, \u2603, \u2603, \u2603)) {
            final amy d = this.d(\u2603, \u2603);
            d.e();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final boolean \u2603, final nu \u2603) {
        int n = 0;
        final List<amy> arrayList = (List<amy>)Lists.newArrayList((Iterable<?>)this.h);
        for (int i = 0; i < arrayList.size(); ++i) {
            final amy amy = arrayList.get(i);
            if (\u2603) {
                this.a(amy);
            }
            if (amy.a(\u2603)) {
                this.b(amy);
                amy.f(false);
                if (++n == 24 && !\u2603) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void c() {
        if (this.f != null) {
            this.f.b();
        }
    }
    
    @Override
    public boolean d() {
        if (!this.i.c) {
            for (int i = 0; i < 100; ++i) {
                if (!this.c.isEmpty()) {
                    final Long n = this.c.iterator().next();
                    final amy amy = this.g.a(n);
                    if (amy != null) {
                        amy.d();
                        this.b(amy);
                        this.a(amy);
                        this.g.d(n);
                        this.h.remove(amy);
                    }
                    this.c.remove(n);
                }
            }
            if (this.f != null) {
                this.f.a();
            }
        }
        return this.e.d();
    }
    
    @Override
    public boolean e() {
        return !this.i.c;
    }
    
    @Override
    public String f() {
        return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        return this.e.a(\u2603, \u2603);
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        return this.e.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int g() {
        return this.g.a();
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
    
    static {
        b = LogManager.getLogger();
    }
}
