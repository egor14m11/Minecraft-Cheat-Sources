import java.util.concurrent.Callable;
import java.util.Random;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class bdb extends adm
{
    private bcy a;
    private bcz b;
    private final Set<pk> c;
    private final Set<pk> d;
    private final ave I;
    private final Set<adg> J;
    
    public bdb(final bcy \u2603, final adp \u2603, final int \u2603, final oj \u2603, final nt \u2603) {
        super(new atx(), new ato(\u2603, "MpServer"), anm.a(\u2603), \u2603, true);
        this.c = (Set<pk>)Sets.newHashSet();
        this.d = (Set<pk>)Sets.newHashSet();
        this.I = ave.A();
        this.J = (Set<adg>)Sets.newHashSet();
        this.a = \u2603;
        this.P().a(\u2603);
        this.B(new cj(8, 64, 8));
        this.t.a(this);
        this.v = this.k();
        this.z = new atz();
        this.B();
        this.C();
    }
    
    @Override
    public void c() {
        super.c();
        this.a(this.K() + 1L);
        if (this.Q().b("doDaylightCycle")) {
            this.b(this.L() + 1L);
        }
        this.B.a("reEntryProcessing");
        for (int n = 0; n < 10 && !this.d.isEmpty(); ++n) {
            final pk \u2603 = this.d.iterator().next();
            this.d.remove(\u2603);
            if (!this.f.contains(\u2603)) {
                this.d(\u2603);
            }
        }
        this.B.c("chunkCache");
        this.b.d();
        this.B.c("blocks");
        this.h();
        this.B.b();
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    protected amv k() {
        return this.b = new bcz(this);
    }
    
    @Override
    protected void h() {
        super.h();
        this.J.retainAll(this.E);
        if (this.J.size() == this.E.size()) {
            this.J.clear();
        }
        int n = 0;
        for (final adg adg : this.E) {
            if (this.J.contains(adg)) {
                continue;
            }
            final int \u2603 = adg.a * 16;
            final int \u26032 = adg.b * 16;
            this.B.a("getChunk");
            final amy a = this.a(adg.a, adg.b);
            this.a(\u2603, \u26032, a);
            this.B.b();
            this.J.add(adg);
            if (++n >= 10) {
                return;
            }
        }
    }
    
    public void b(final int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603) {
            this.b.c(\u2603, \u2603);
        }
        else {
            this.b.b(\u2603, \u2603);
        }
        if (!\u2603) {
            this.b(\u2603 * 16, 0, \u2603 * 16, \u2603 * 16 + 15, 256, \u2603 * 16 + 15);
        }
    }
    
    @Override
    public boolean d(final pk \u2603) {
        final boolean d = super.d(\u2603);
        this.c.add(\u2603);
        if (!d) {
            this.d.add(\u2603);
        }
        else if (\u2603 instanceof va) {
            this.I.W().a(new bpd((va)\u2603));
        }
        return d;
    }
    
    @Override
    public void e(final pk \u2603) {
        super.e(\u2603);
        this.c.remove(\u2603);
    }
    
    @Override
    protected void a(final pk \u2603) {
        super.a(\u2603);
        if (this.d.contains(\u2603)) {
            this.d.remove(\u2603);
        }
    }
    
    @Override
    protected void b(final pk \u2603) {
        super.b(\u2603);
        boolean b = false;
        if (this.c.contains(\u2603)) {
            if (\u2603.ai()) {
                this.d.add(\u2603);
                b = true;
            }
            else {
                this.c.remove(\u2603);
            }
        }
    }
    
    public void a(final int \u2603, final pk \u2603) {
        final pk a = this.a(\u2603);
        if (a != null) {
            this.e(a);
        }
        this.c.add(\u2603);
        \u2603.d(\u2603);
        if (!this.d(\u2603)) {
            this.d.add(\u2603);
        }
        this.l.a(\u2603, \u2603);
    }
    
    @Override
    public pk a(final int \u2603) {
        if (\u2603 == this.I.h.F()) {
            return this.I.h;
        }
        return super.a(\u2603);
    }
    
    public pk e(final int \u2603) {
        final pk \u26032 = this.l.d(\u2603);
        if (\u26032 != null) {
            this.c.remove(\u26032);
            this.e(\u26032);
        }
        return \u26032;
    }
    
    public boolean b(final cj \u2603, final alz \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        this.a(n, o, p, n, o, p);
        return super.a(\u2603, \u2603, 3);
    }
    
    @Override
    public void H() {
        this.a.a().a(new fa("Quitting"));
    }
    
    @Override
    protected void p() {
    }
    
    @Override
    protected int q() {
        return this.I.t.c;
    }
    
    public void b(final int \u2603, final int \u2603, final int \u2603) {
        final int n = 16;
        final Random \u26032 = new Random();
        final zx ba = this.I.h.bA();
        final boolean b = this.I.c.l() == adp.a.c && ba != null && afh.a(ba.b()) == afi.cv;
        final cj.a a = new cj.a();
        for (int i = 0; i < 1000; ++i) {
            final int \u26033 = \u2603 + this.s.nextInt(n) - this.s.nextInt(n);
            final int \u26034 = \u2603 + this.s.nextInt(n) - this.s.nextInt(n);
            final int \u26035 = \u2603 + this.s.nextInt(n) - this.s.nextInt(n);
            a.c(\u26033, \u26034, \u26035);
            final alz p = this.p(a);
            p.c().c(this, a, p, \u26032);
            if (b && p.c() == afi.cv) {
                this.a(cy.J, \u26033 + 0.5f, \u26034 + 0.5f, \u26035 + 0.5f, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    public void a() {
        this.f.removeAll(this.g);
        for (int i = 0; i < this.g.size(); ++i) {
            final pk \u2603 = this.g.get(i);
            final int n = \u2603.ae;
            final int n2 = \u2603.ag;
            if (\u2603.ad && this.a(n, n2, true)) {
                this.a(n, n2).b(\u2603);
            }
        }
        for (int i = 0; i < this.g.size(); ++i) {
            this.b(this.g.get(i));
        }
        this.g.clear();
        for (int i = 0; i < this.f.size(); ++i) {
            final pk \u2603 = this.f.get(i);
            if (\u2603.m != null) {
                if (!\u2603.m.I && \u2603.m.l == \u2603) {
                    continue;
                }
                \u2603.m.l = null;
                \u2603.m = null;
            }
            if (\u2603.I) {
                final int n = \u2603.ae;
                final int n2 = \u2603.ag;
                if (\u2603.ad && this.a(n, n2, true)) {
                    this.a(n, n2).b(\u2603);
                }
                this.f.remove(i--);
                this.b(\u2603);
            }
        }
    }
    
    @Override
    public c a(final b \u2603) {
        final c a = super.a(\u2603);
        a.a("Forced entities", new Callable<String>() {
            public String a() {
                return bdb.this.c.size() + " total; " + bdb.this.c.toString();
            }
        });
        a.a("Retry entities", new Callable<String>() {
            public String a() {
                return bdb.this.d.size() + " total; " + bdb.this.d.toString();
            }
        });
        a.a("Server brand", new Callable<String>() {
            public String a() throws Exception {
                return bdb.this.I.h.w();
            }
        });
        a.a("Server type", new Callable<String>() {
            public String a() throws Exception {
                return (bdb.this.I.G() == null) ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
            }
        });
        return a;
    }
    
    public void a(final cj \u2603, final String \u2603, final float \u2603, final float \u2603, final boolean \u2603) {
        this.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final String \u2603, final float \u2603, final float \u2603, final boolean \u2603) {
        final double e = this.I.ac().e(\u2603, \u2603, \u2603);
        final bpf bpf = new bpf(new jy(\u2603), \u2603, \u2603, (float)\u2603, (float)\u2603, (float)\u2603);
        if (\u2603 && e > 100.0) {
            final double n = Math.sqrt(e) / 40.0;
            this.I.W().a(bpf, (int)(n * 20.0));
        }
        else {
            this.I.W().a(bpf);
        }
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final dn \u2603) {
        this.I.j.a(new bdq.c(this, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, this.I.j, \u2603));
    }
    
    public void a(final auo \u2603) {
        this.C = \u2603;
    }
    
    @Override
    public void b(long \u2603) {
        if (\u2603 < 0L) {
            \u2603 = -\u2603;
            this.Q().a("doDaylightCycle", "false");
        }
        else {
            this.Q().a("doDaylightCycle", "true");
        }
        super.b(\u2603);
    }
}
