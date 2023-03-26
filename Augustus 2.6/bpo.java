import org.apache.logging.log4j.LogManager;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.Futures;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import java.net.InetAddress;
import net.minecraft.client.ClientBrandRetriever;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.io.IOException;
import java.io.File;
import org.apache.logging.log4j.Logger;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpo extends MinecraftServer
{
    private static final Logger k;
    private final ave l;
    private final adp m;
    private boolean n;
    private boolean o;
    private bpr p;
    
    public bpo(final ave \u2603) {
        super(\u2603.O(), new File(\u2603.v, bpo.a.getName()));
        this.l = \u2603;
        this.m = null;
    }
    
    public bpo(final ave \u2603, final String \u2603, final String \u2603, final adp \u2603) {
        super(new File(\u2603.v, "saves"), \u2603.O(), new File(\u2603.v, bpo.a.getName()));
        this.i(\u2603.L().c());
        this.j(\u2603);
        this.k(\u2603);
        this.b(\u2603.t());
        this.c(\u2603.c());
        this.c(256);
        this.a((lx)new bpn(this));
        this.l = \u2603;
        this.m = (this.X() ? kx.a : \u2603);
    }
    
    protected bd h() {
        return new bpp();
    }
    
    protected void a(final String \u2603, final String \u2603, final long \u2603, final adr \u2603, final String \u2603) {
        this.a(\u2603);
        this.d = new le[3];
        this.i = new long[this.d.length][100];
        final atp a = this.Y().a(\u2603, true);
        this.a(this.U(), a);
        ato d = a.d();
        if (d == null) {
            d = new ato(this.m, \u2603);
        }
        else {
            d.a(\u2603);
        }
        for (int i = 0; i < this.d.length; ++i) {
            int \u26032 = 0;
            if (i == 1) {
                \u26032 = -1;
            }
            if (i == 2) {
                \u26032 = 1;
            }
            if (i == 0) {
                if (this.X()) {
                    this.d[i] = (le)new kx(this, a, d, \u26032, this.c).b();
                }
                else {
                    this.d[i] = (le)new le(this, a, d, \u26032, this.c).b();
                }
                this.d[i].a(this.m);
            }
            else {
                this.d[i] = (le)new kz(this, a, \u26032, this.d[0], this.c).b();
            }
            this.d[i].a(new lb(this, this.d[i]));
        }
        this.ap().a(this.d);
        if (this.d[0].P().y() == null) {
            this.a(this.l.t.ay);
        }
        this.k();
    }
    
    protected boolean i() throws IOException {
        bpo.k.info("Starting integrated minecraft server version 1.8.8");
        this.d(true);
        this.e(true);
        this.f(true);
        this.g(true);
        this.h(true);
        bpo.k.info("Generating keypair");
        this.a(ng.b());
        this.a(this.U(), this.V(), this.m.d(), this.m.h(), this.m.j());
        this.l(this.S() + " - " + this.d[0].P().k());
        return true;
    }
    
    protected void A() {
        final boolean n = this.n;
        this.n = (ave.A().u() != null && ave.A().V());
        if (!n && this.n) {
            bpo.k.info("Saving and pausing game...");
            this.ap().j();
            this.a(false);
        }
        if (this.n) {
            synchronized (this.j) {
                while (!this.j.isEmpty()) {
                    g.a(this.j.poll(), bpo.k);
                }
            }
        }
        else {
            super.A();
            if (this.l.t.c != this.ap().s()) {
                bpo.k.info("Changing view distance to {}, from {}", new Object[] { this.l.t.c, this.ap().s() });
                this.ap().a(this.l.t.c);
            }
            if (this.l.f != null) {
                final ato p = this.d[0].P();
                final ato p2 = this.l.f.P();
                if (!p.z() && p2.y() != p.y()) {
                    bpo.k.info("Changing difficulty to {}, from {}", new Object[] { p2.y(), p.y() });
                    this.a(p2.y());
                }
                else if (p2.z() && !p.z()) {
                    bpo.k.info("Locking difficulty to {}", new Object[] { p2.y() });
                    for (final le le : this.d) {
                        if (le != null) {
                            le.P().e(true);
                        }
                    }
                }
            }
        }
    }
    
    public boolean l() {
        return false;
    }
    
    public adp.a m() {
        return this.m.e();
    }
    
    public oj n() {
        return this.l.f.P().y();
    }
    
    public boolean o() {
        return this.m.f();
    }
    
    public boolean q() {
        return true;
    }
    
    public boolean r() {
        return true;
    }
    
    public File y() {
        return this.l.v;
    }
    
    public boolean ae() {
        return false;
    }
    
    public boolean ai() {
        return false;
    }
    
    protected void a(final b \u2603) {
        this.l.a(\u2603);
    }
    
    public b b(b \u2603) {
        \u2603 = super.b(\u2603);
        \u2603.g().a("Type", new Callable<String>() {
            public String a() throws Exception {
                return "Integrated Server (map_client.txt)";
            }
        });
        \u2603.g().a("Is Modded", new Callable<String>() {
            public String a() throws Exception {
                String s = ClientBrandRetriever.getClientModName();
                if (!s.equals("vanilla")) {
                    return "Definitely; Client brand changed to '" + s + "'";
                }
                s = bpo.this.getServerModName();
                if (!s.equals("vanilla")) {
                    return "Definitely; Server brand changed to '" + s + "'";
                }
                if (ave.class.getSigners() == null) {
                    return "Very likely; Jar signature invalidated";
                }
                return "Probably not. Jar signature remains and both client + server brands are untouched.";
            }
        });
        return \u2603;
    }
    
    public void a(final oj \u2603) {
        super.a(\u2603);
        if (this.l.f != null) {
            this.l.f.P().a(\u2603);
        }
    }
    
    public void a(final or \u2603) {
        super.a(\u2603);
        \u2603.a("snooper_partner", this.l.I().f());
    }
    
    public boolean ad() {
        return ave.A().ad();
    }
    
    public String a(final adp.a \u2603, final boolean \u2603) {
        try {
            int a = -1;
            try {
                a = nj.a();
            }
            catch (IOException ex) {}
            if (a <= 0) {
                a = 25564;
            }
            this.aq().a(null, a);
            bpo.k.info("Started on " + a);
            this.o = true;
            (this.p = new bpr(this.am(), a + "")).start();
            this.ap().a(\u2603);
            this.ap().c(\u2603);
            return a + "";
        }
        catch (IOException ex2) {
            return null;
        }
    }
    
    public void t() {
        super.t();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }
    
    public void w() {
        Futures.getUnchecked((Future<Object>)this.a((Runnable)new Runnable() {
            @Override
            public void run() {
                final List<lf> arrayList = (List<lf>)Lists.newArrayList((Iterable<?>)bpo.this.ap().v());
                for (final lf \u2603 : arrayList) {
                    bpo.this.ap().e(\u2603);
                }
            }
        }));
        super.w();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }
    
    public void a() {
        this.x();
    }
    
    public boolean b() {
        return this.o;
    }
    
    public void a(final adp.a \u2603) {
        this.ap().a(\u2603);
    }
    
    public boolean al() {
        return true;
    }
    
    public int p() {
        return 4;
    }
    
    static {
        k = LogManager.getLogger();
    }
}
