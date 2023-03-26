import org.apache.logging.log4j.LogManager;
import java.net.UnknownHostException;
import java.net.InetAddress;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class awz extends axu
{
    private static final AtomicInteger a;
    private static final Logger f;
    private ek g;
    private boolean h;
    private final axu i;
    
    public awz(final axu \u2603, final ave \u2603, final bde \u2603) {
        this.j = \u2603;
        this.i = \u2603;
        final bdd a = bdd.a(\u2603.b);
        \u2603.a((bdb)null);
        \u2603.a(\u2603);
        this.a(a.a(), a.b());
    }
    
    public awz(final axu \u2603, final ave \u2603, final String \u2603, final int \u2603) {
        this.j = \u2603;
        this.i = \u2603;
        \u2603.a((bdb)null);
        this.a(\u2603, \u2603);
    }
    
    private void a(final String \u2603, final int \u2603) {
        awz.f.info("Connecting to " + \u2603 + ", " + \u2603);
        new Thread("Server Connector #" + awz.a.incrementAndGet()) {
            @Override
            public void run() {
                InetAddress byName = null;
                try {
                    if (awz.this.h) {
                        return;
                    }
                    byName = InetAddress.getByName(\u2603);
                    awz.this.g = ek.a(byName, \u2603, awz.this.j.t.f());
                    awz.this.g.a(new bcx(awz.this.g, awz.this.j, awz.this.i));
                    awz.this.g.a(new jc(47, \u2603, \u2603, el.d));
                    awz.this.g.a(new jl(awz.this.j.L().e()));
                }
                catch (UnknownHostException throwable) {
                    if (awz.this.h) {
                        return;
                    }
                    awz.f.error("Couldn't connect to server", throwable);
                    awz.this.j.a(new axh(awz.this.i, "connect.failed", new fb("disconnect.genericReason", new Object[] { "Unknown host" })));
                }
                catch (Exception throwable2) {
                    if (awz.this.h) {
                        return;
                    }
                    awz.f.error("Couldn't connect to server", throwable2);
                    String s = throwable2.toString();
                    if (byName != null) {
                        final String string = byName.toString() + ":" + \u2603;
                        s = s.replaceAll(string, "");
                    }
                    awz.this.j.a(new axh(awz.this.i, "connect.failed", new fb("disconnect.genericReason", new Object[] { s })));
                }
            }
        }.start();
    }
    
    @Override
    public void e() {
        if (this.g != null) {
            if (this.g.g()) {
                this.g.a();
            }
            else {
                this.g.l();
            }
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    public void b() {
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.h = true;
            if (this.g != null) {
                this.g.a(new fa("Aborted"));
            }
            this.j.a(this.i);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        if (this.g == null) {
            this.a(this.q, bnq.a("connect.connecting", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
        }
        else {
            this.a(this.q, bnq.a("connect.authorizing", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = new AtomicInteger(0);
        f = LogManager.getLogger();
    }
}
