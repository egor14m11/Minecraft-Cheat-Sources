import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import java.net.SocketAddress;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.Iterator;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import java.text.SimpleDateFormat;
import org.apache.logging.log4j.Logger;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class lx
{
    public static final File a;
    public static final File b;
    public static final File c;
    public static final File d;
    private static final Logger f;
    private static final SimpleDateFormat g;
    private final MinecraftServer h;
    private final List<lf> i;
    private final Map<UUID, lf> j;
    private final mc k;
    private final lu l;
    private final ly m;
    private final me n;
    private final Map<UUID, mv> o;
    private aty p;
    private boolean q;
    protected int e;
    private int r;
    private adp.a s;
    private boolean t;
    private int u;
    
    public lx(final MinecraftServer \u2603) {
        this.i = (List<lf>)Lists.newArrayList();
        this.j = (Map<UUID, lf>)Maps.newHashMap();
        this.k = new mc(lx.a);
        this.l = new lu(lx.b);
        this.m = new ly(lx.c);
        this.n = new me(lx.d);
        this.o = (Map<UUID, mv>)Maps.newHashMap();
        this.h = \u2603;
        this.k.a(false);
        this.l.a(false);
        this.e = 8;
    }
    
    public void a(final ek \u2603, final lf \u2603) {
        final GameProfile cd = \u2603.cd();
        final lt af = this.h.aF();
        final GameProfile a = af.a(cd.getId());
        final String anotherString = (a == null) ? cd.getName() : a.getName();
        af.a(cd);
        final dn a2 = this.a(\u2603);
        \u2603.a(this.h.a(\u2603.am));
        \u2603.c.a((le)\u2603.o);
        String string = "local";
        if (\u2603.b() != null) {
            string = \u2603.b().toString();
        }
        lx.f.info(\u2603.e_() + "[" + string + "] logged in with entity id " + \u2603.F() + " at (" + \u2603.s + ", " + \u2603.t + ", " + \u2603.u + ")");
        final le a3 = this.h.a(\u2603.am);
        final ato p = a3.P();
        final cj m = a3.M();
        this.a(\u2603, null, a3);
        final lm lm = new lm(this.h, \u2603, \u2603);
        lm.a(new gt(\u2603.F(), \u2603.c.b(), p.t(), a3.t.q(), a3.aa(), this.p(), p.u(), a3.Q().b("reducedDebugInfo")));
        lm.a(new gg("MC|Brand", new em(Unpooled.buffer()).a(this.c().getServerModName())));
        lm.a(new fw(p.y(), p.z()));
        lm.a(new ht(m));
        lm.a(new gx(\u2603.bA));
        lm.a(new hi(\u2603.bi.c));
        \u2603.A().d();
        \u2603.A().b(\u2603);
        this.a((kk)a3.Z(), \u2603);
        this.h.aH();
        fb \u26032;
        if (!\u2603.e_().equalsIgnoreCase(anotherString)) {
            \u26032 = new fb("multiplayer.player.joined.renamed", new Object[] { \u2603.f_(), anotherString });
        }
        else {
            \u26032 = new fb("multiplayer.player.joined", new Object[] { \u2603.f_() });
        }
        \u26032.b().a(a.o);
        this.a(\u26032);
        this.c(\u2603);
        lm.a(\u2603.s, \u2603.t, \u2603.u, \u2603.y, \u2603.z);
        this.b(\u2603, a3);
        if (this.h.ab().length() > 0) {
            \u2603.a(this.h.ab(), this.h.ac());
        }
        for (final pf \u26033 : \u2603.bl()) {
            lm.a(new ib(\u2603.F(), \u26033));
        }
        \u2603.g_();
        if (a2 != null && a2.b("Riding", 10)) {
            final pk a4 = pm.a(a2.m("Riding"), a3);
            if (a4 != null) {
                a4.n = true;
                a3.d(a4);
                \u2603.a(a4);
                a4.n = false;
            }
        }
    }
    
    protected void a(final kk \u2603, final lf \u2603) {
        final Set<auk> hashSet = (Set<auk>)Sets.newHashSet();
        for (final aul \u26032 : \u2603.g()) {
            \u2603.a.a(new hr(\u26032, 0));
        }
        for (int i = 0; i < 19; ++i) {
            final auk a = \u2603.a(i);
            if (a != null && !hashSet.contains(a)) {
                final List<ff> d = \u2603.d(a);
                for (final ff \u26033 : d) {
                    \u2603.a.a(\u26033);
                }
                hashSet.add(a);
            }
        }
    }
    
    public void a(final le[] \u2603) {
        this.p = \u2603[0].O().e();
        \u2603[0].af().a(new amq() {
            @Override
            public void a(final ams \u2603, final double \u2603) {
                lx.this.a(new hg(\u2603, hg.a.a));
            }
            
            @Override
            public void a(final ams \u2603, final double \u2603, final double \u2603, final long \u2603) {
                lx.this.a(new hg(\u2603, hg.a.b));
            }
            
            @Override
            public void a(final ams \u2603, final double \u2603, final double \u2603) {
                lx.this.a(new hg(\u2603, hg.a.c));
            }
            
            @Override
            public void a(final ams \u2603, final int \u2603) {
                lx.this.a(new hg(\u2603, hg.a.e));
            }
            
            @Override
            public void b(final ams \u2603, final int \u2603) {
                lx.this.a(new hg(\u2603, hg.a.f));
            }
            
            @Override
            public void b(final ams \u2603, final double \u2603) {
            }
            
            @Override
            public void c(final ams \u2603, final double \u2603) {
            }
        });
    }
    
    public void a(final lf \u2603, final le \u2603) {
        final le u = \u2603.u();
        if (\u2603 != null) {
            \u2603.t().c(\u2603);
        }
        u.t().a(\u2603);
        u.b.c((int)\u2603.s >> 4, (int)\u2603.u >> 4);
    }
    
    public int d() {
        return lc.b(this.s());
    }
    
    public dn a(final lf \u2603) {
        final dn i = this.h.d[0].P().i();
        dn b;
        if (\u2603.e_().equals(this.h.S()) && i != null) {
            \u2603.f(i);
            b = i;
            lx.f.debug("loading single player");
        }
        else {
            b = this.p.b(\u2603);
        }
        return b;
    }
    
    protected void b(final lf \u2603) {
        this.p.a(\u2603);
        final mv mv = this.o.get(\u2603.aK());
        if (mv != null) {
            mv.b();
        }
    }
    
    public void c(final lf \u2603) {
        this.i.add(\u2603);
        this.j.put(\u2603.aK(), \u2603);
        this.a(new gz(gz.a.a, new lf[] { \u2603 }));
        final le a = this.h.a(\u2603.am);
        a.d(\u2603);
        this.a(\u2603, null);
        for (int i = 0; i < this.i.size(); ++i) {
            final lf lf = this.i.get(i);
            \u2603.a.a(new gz(gz.a.a, new lf[] { lf }));
        }
    }
    
    public void d(final lf \u2603) {
        \u2603.u().t().d(\u2603);
    }
    
    public void e(final lf \u2603) {
        \u2603.b(na.f);
        this.b(\u2603);
        final le u = \u2603.u();
        if (\u2603.m != null) {
            u.f(\u2603.m);
            lx.f.debug("removing player mount");
        }
        u.e(\u2603);
        u.t().c(\u2603);
        this.i.remove(\u2603);
        final UUID ak = \u2603.aK();
        final lf lf = this.j.get(ak);
        if (lf == \u2603) {
            this.j.remove(ak);
            this.o.remove(ak);
        }
        this.a(new gz(gz.a.e, new lf[] { \u2603 }));
    }
    
    public String a(final SocketAddress \u2603, final GameProfile \u2603) {
        if (this.k.a(\u2603)) {
            final md md = this.k.b(\u2603);
            String s = "You are banned from this server!\nReason: " + md.d();
            if (md.c() != null) {
                s = s + "\nYour ban will be removed on " + lx.g.format(md.c());
            }
            return s;
        }
        if (!this.e(\u2603)) {
            return "You are not white-listed on this server!";
        }
        if (this.l.a(\u2603)) {
            final lv b = this.l.b(\u2603);
            String s = "Your IP address is banned from this server!\nReason: " + b.d();
            if (b.c() != null) {
                s = s + "\nYour ban will be removed on " + lx.g.format(b.c());
            }
            return s;
        }
        if (this.i.size() >= this.e && !this.f(\u2603)) {
            return "The server is full!";
        }
        return null;
    }
    
    public lf g(final GameProfile \u2603) {
        final UUID a = wn.a(\u2603);
        final List<lf> arrayList = (List<lf>)Lists.newArrayList();
        for (int i = 0; i < this.i.size(); ++i) {
            final lf lf = this.i.get(i);
            if (lf.aK().equals(a)) {
                arrayList.add(lf);
            }
        }
        final lf lf2 = this.j.get(\u2603.getId());
        if (lf2 != null && !arrayList.contains(lf2)) {
            arrayList.add(lf2);
        }
        for (final lf lf3 : arrayList) {
            lf3.a.c("You logged in from another location");
        }
        lg \u26032;
        if (this.h.X()) {
            \u26032 = new ky(this.h.a(0));
        }
        else {
            \u26032 = new lg(this.h.a(0));
        }
        return new lf(this.h, this.h.a(0), \u2603, \u26032);
    }
    
    public lf a(final lf \u2603, final int \u2603, final boolean \u2603) {
        \u2603.u().s().b(\u2603);
        \u2603.u().s().b((pk)\u2603);
        \u2603.u().t().c(\u2603);
        this.i.remove(\u2603);
        this.h.a(\u2603.am).f(\u2603);
        final cj ch = \u2603.ch();
        final boolean ci = \u2603.ci();
        \u2603.am = \u2603;
        lg \u26032;
        if (this.h.X()) {
            \u26032 = new ky(this.h.a(\u2603.am));
        }
        else {
            \u26032 = new lg(this.h.a(\u2603.am));
        }
        final lf \u26033 = new lf(this.h, this.h.a(\u2603.am), \u2603.cd(), \u26032);
        \u26033.a = \u2603.a;
        \u26033.a(\u2603, \u2603);
        \u26033.d(\u2603.F());
        \u26033.o(\u2603);
        final le a = this.h.a(\u2603.am);
        this.a(\u26033, \u2603, a);
        if (ch != null) {
            final cj \u26034 = wn.a(this.h.a(\u2603.am), ch, ci);
            if (\u26034 != null) {
                \u26033.b(\u26034.n() + 0.5f, \u26034.o() + 0.1f, \u26034.p() + 0.5f, 0.0f, 0.0f);
                \u26033.a(ch, ci);
            }
            else {
                \u26033.a.a(new gm(0, 0.0f));
            }
        }
        a.b.c((int)\u26033.s >> 4, (int)\u26033.u >> 4);
        while (!a.a(\u26033, \u26033.aR()).isEmpty() && \u26033.t < 256.0) {
            \u26033.b(\u26033.s, \u26033.t + 1.0, \u26033.u);
        }
        \u26033.a.a(new he(\u26033.am, \u26033.o.aa(), \u26033.o.P().u(), \u26033.c.b()));
        final cj \u26034 = a.M();
        \u26033.a.a(\u26033.s, \u26033.t, \u26033.u, \u26033.y, \u26033.z);
        \u26033.a.a(new ht(\u26034));
        \u26033.a.a(new ho(\u26033.bD, \u26033.bC, \u26033.bB));
        this.b(\u26033, a);
        a.t().a(\u26033);
        a.d(\u26033);
        this.i.add(\u26033);
        this.j.put(\u26033.aK(), \u26033);
        \u26033.g_();
        \u26033.i(\u26033.bn());
        return \u26033;
    }
    
    public void a(final lf \u2603, final int \u2603) {
        final int am = \u2603.am;
        final le a = this.h.a(\u2603.am);
        \u2603.am = \u2603;
        final le a2 = this.h.a(\u2603.am);
        \u2603.a.a(new he(\u2603.am, \u2603.o.aa(), \u2603.o.P().u(), \u2603.c.b()));
        a.f(\u2603);
        \u2603.I = false;
        this.a(\u2603, am, a, a2);
        this.a(\u2603, a);
        \u2603.a.a(\u2603.s, \u2603.t, \u2603.u, \u2603.y, \u2603.z);
        \u2603.c.a(a2);
        this.b(\u2603, a2);
        this.f(\u2603);
        for (final pf \u26032 : \u2603.bl()) {
            \u2603.a.a(new ib(\u2603.F(), \u26032));
        }
    }
    
    public void a(final pk \u2603, final int \u2603, final le \u2603, final le \u2603) {
        double n = \u2603.s;
        double n2 = \u2603.u;
        final double n3 = 8.0;
        final float y = \u2603.y;
        \u2603.B.a("moving");
        if (\u2603.am == -1) {
            n = ns.a(n / n3, \u2603.af().b() + 16.0, \u2603.af().d() - 16.0);
            n2 = ns.a(n2 / n3, \u2603.af().c() + 16.0, \u2603.af().e() - 16.0);
            \u2603.b(n, \u2603.t, n2, \u2603.y, \u2603.z);
            if (\u2603.ai()) {
                \u2603.a(\u2603, false);
            }
        }
        else if (\u2603.am == 0) {
            n = ns.a(n * n3, \u2603.af().b() + 16.0, \u2603.af().d() - 16.0);
            n2 = ns.a(n2 * n3, \u2603.af().c() + 16.0, \u2603.af().e() - 16.0);
            \u2603.b(n, \u2603.t, n2, \u2603.y, \u2603.z);
            if (\u2603.ai()) {
                \u2603.a(\u2603, false);
            }
        }
        else {
            cj cj;
            if (\u2603 == 1) {
                cj = \u2603.M();
            }
            else {
                cj = \u2603.m();
            }
            n = cj.n();
            \u2603.t = cj.o();
            n2 = cj.p();
            \u2603.b(n, \u2603.t, n2, 90.0f, 0.0f);
            if (\u2603.ai()) {
                \u2603.a(\u2603, false);
            }
        }
        \u2603.B.b();
        if (\u2603 != 1) {
            \u2603.B.a("placing");
            n = ns.a((int)n, -29999872, 29999872);
            n2 = ns.a((int)n2, -29999872, 29999872);
            if (\u2603.ai()) {
                \u2603.b(n, \u2603.t, n2, \u2603.y, \u2603.z);
                \u2603.u().a(\u2603, y);
                \u2603.d(\u2603);
                \u2603.a(\u2603, false);
            }
            \u2603.B.b();
        }
        \u2603.a(\u2603);
    }
    
    public void e() {
        if (++this.u > 600) {
            this.a(new gz(gz.a.c, this.i));
            this.u = 0;
        }
    }
    
    public void a(final ff \u2603) {
        for (int i = 0; i < this.i.size(); ++i) {
            this.i.get(i).a.a(\u2603);
        }
    }
    
    public void a(final ff \u2603, final int \u2603) {
        for (int i = 0; i < this.i.size(); ++i) {
            final lf lf = this.i.get(i);
            if (lf.am == \u2603) {
                lf.a.a(\u2603);
            }
        }
    }
    
    public void a(final wn \u2603, final eu \u2603) {
        final auq bo = \u2603.bO();
        if (bo == null) {
            return;
        }
        final Collection<String> d = bo.d();
        for (final String \u26032 : d) {
            final lf a = this.a(\u26032);
            if (a != null) {
                if (a == \u2603) {
                    continue;
                }
                a.a(\u2603);
            }
        }
    }
    
    public void b(final wn \u2603, final eu \u2603) {
        final auq bo = \u2603.bO();
        if (bo == null) {
            this.a(\u2603);
            return;
        }
        for (int i = 0; i < this.i.size(); ++i) {
            final lf lf = this.i.get(i);
            if (lf.bO() != bo) {
                lf.a(\u2603);
            }
        }
    }
    
    public String b(final boolean \u2603) {
        String str = "";
        final List<lf> arrayList = (List<lf>)Lists.newArrayList((Iterable<?>)this.i);
        for (int i = 0; i < arrayList.size(); ++i) {
            if (i > 0) {
                str += ", ";
            }
            str += arrayList.get(i).e_();
            if (\u2603) {
                str = str + " (" + arrayList.get(i).aK().toString() + ")";
            }
        }
        return str;
    }
    
    public String[] f() {
        final String[] array = new String[this.i.size()];
        for (int i = 0; i < this.i.size(); ++i) {
            array[i] = this.i.get(i).e_();
        }
        return array;
    }
    
    public GameProfile[] g() {
        final GameProfile[] array = new GameProfile[this.i.size()];
        for (int i = 0; i < this.i.size(); ++i) {
            array[i] = this.i.get(i).cd();
        }
        return array;
    }
    
    public mc h() {
        return this.k;
    }
    
    public lu i() {
        return this.l;
    }
    
    public void a(final GameProfile \u2603) {
        ((mb<K, lz>)this.m).a(new lz(\u2603, this.h.p(), this.m.b(\u2603)));
    }
    
    public void b(final GameProfile \u2603) {
        ((mb<GameProfile, V>)this.m).c(\u2603);
    }
    
    public boolean e(final GameProfile \u2603) {
        return !this.q || ((mb<GameProfile, V>)this.m).d(\u2603) || ((mb<GameProfile, V>)this.n).d(\u2603);
    }
    
    public boolean h(final GameProfile \u2603) {
        return ((mb<GameProfile, V>)this.m).d(\u2603) || (this.h.T() && this.h.d[0].P().v() && this.h.S().equalsIgnoreCase(\u2603.getName())) || this.t;
    }
    
    public lf a(final String \u2603) {
        for (final lf lf : this.i) {
            if (lf.e_().equalsIgnoreCase(\u2603)) {
                return lf;
            }
        }
        return null;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603, final ff \u2603) {
        this.a(null, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final wn \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603, final ff \u2603) {
        for (int i = 0; i < this.i.size(); ++i) {
            final lf lf = this.i.get(i);
            if (lf != \u2603) {
                if (lf.am == \u2603) {
                    final double n = \u2603 - lf.s;
                    final double n2 = \u2603 - lf.t;
                    final double n3 = \u2603 - lf.u;
                    if (n * n + n2 * n2 + n3 * n3 < \u2603 * \u2603) {
                        lf.a.a(\u2603);
                    }
                }
            }
        }
    }
    
    public void j() {
        for (int i = 0; i < this.i.size(); ++i) {
            this.b(this.i.get(i));
        }
    }
    
    public void d(final GameProfile \u2603) {
        ((mb<K, mf>)this.n).a(new mf(\u2603));
    }
    
    public void c(final GameProfile \u2603) {
        ((mb<GameProfile, V>)this.n).c(\u2603);
    }
    
    public me k() {
        return this.n;
    }
    
    public String[] l() {
        return this.n.a();
    }
    
    public ly m() {
        return this.m;
    }
    
    public String[] n() {
        return this.m.a();
    }
    
    public void a() {
    }
    
    public void b(final lf \u2603, final le \u2603) {
        final ams af = this.h.d[0].af();
        \u2603.a.a(new hg(af, hg.a.d));
        \u2603.a.a(new hu(\u2603.K(), \u2603.L(), \u2603.Q().b("doDaylightCycle")));
        if (\u2603.S()) {
            \u2603.a.a(new gm(1, 0.0f));
            \u2603.a.a(new gm(7, \u2603.j(1.0f)));
            \u2603.a.a(new gm(8, \u2603.h(1.0f)));
        }
    }
    
    public void f(final lf \u2603) {
        \u2603.a(\u2603.bj);
        \u2603.r();
        \u2603.a.a(new hi(\u2603.bi.c));
    }
    
    public int o() {
        return this.i.size();
    }
    
    public int p() {
        return this.e;
    }
    
    public String[] q() {
        return this.h.d[0].O().e().f();
    }
    
    public void a(final boolean \u2603) {
        this.q = \u2603;
    }
    
    public List<lf> b(final String \u2603) {
        final List<lf> arrayList = (List<lf>)Lists.newArrayList();
        for (final lf lf : this.i) {
            if (lf.w().equals(\u2603)) {
                arrayList.add(lf);
            }
        }
        return arrayList;
    }
    
    public int s() {
        return this.r;
    }
    
    public MinecraftServer c() {
        return this.h;
    }
    
    public dn t() {
        return null;
    }
    
    public void a(final adp.a \u2603) {
        this.s = \u2603;
    }
    
    private void a(final lf \u2603, final lf \u2603, final adm \u2603) {
        if (\u2603 != null) {
            \u2603.c.a(\u2603.c.b());
        }
        else if (this.s != null) {
            \u2603.c.a(this.s);
        }
        \u2603.c.b(\u2603.P().r());
    }
    
    public void c(final boolean \u2603) {
        this.t = \u2603;
    }
    
    public void u() {
        for (int i = 0; i < this.i.size(); ++i) {
            this.i.get(i).a.c("Server closed");
        }
    }
    
    public void a(final eu \u2603, final boolean \u2603) {
        this.h.a(\u2603);
        final byte \u26032 = (byte)(\u2603 ? 1 : 0);
        this.a(new fy(\u2603, \u26032));
    }
    
    public void a(final eu \u2603) {
        this.a(\u2603, true);
    }
    
    public mv a(final wn \u2603) {
        final UUID ak = \u2603.aK();
        mv mv = (ak == null) ? null : this.o.get(ak);
        if (mv == null) {
            final File file = new File(this.h.a(0).O().b(), "stats");
            final File file2 = new File(file, ak.toString() + ".json");
            if (!file2.exists()) {
                final File file3 = new File(file, \u2603.e_() + ".json");
                if (file3.exists() && file3.isFile()) {
                    file3.renameTo(file2);
                }
            }
            mv = new mv(this.h, file2);
            mv.a();
            this.o.put(ak, mv);
        }
        return mv;
    }
    
    public void a(final int \u2603) {
        this.r = \u2603;
        if (this.h.d == null) {
            return;
        }
        for (final le le : this.h.d) {
            if (le != null) {
                le.t().a(\u2603);
            }
        }
    }
    
    public List<lf> v() {
        return this.i;
    }
    
    public lf a(final UUID \u2603) {
        return this.j.get(\u2603);
    }
    
    public boolean f(final GameProfile \u2603) {
        return false;
    }
    
    static {
        a = new File("banned-players.json");
        b = new File("banned-ips.json");
        c = new File("ops.json");
        d = new File("whitelist.json");
        f = LogManager.getLogger();
        g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    }
}
