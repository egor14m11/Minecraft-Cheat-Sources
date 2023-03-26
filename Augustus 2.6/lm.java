import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import java.util.concurrent.Callable;
import java.util.Set;
import java.util.Collections;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Doubles;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lm implements ic, km
{
    private static final Logger c;
    public final ek a;
    private final MinecraftServer d;
    public lf b;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private long j;
    private long k;
    private int l;
    private int m;
    private nm<Short> n;
    private double o;
    private double p;
    private double q;
    private boolean r;
    
    public lm(final MinecraftServer \u2603, final ek \u2603, final lf \u2603) {
        this.n = new nm<Short>();
        this.r = true;
        this.d = \u2603;
        (this.a = \u2603).a(this);
        this.b = \u2603;
        \u2603.a = this;
    }
    
    @Override
    public void c() {
        this.h = false;
        ++this.e;
        this.d.c.a("keepAlive");
        if (this.e - this.k > 40L) {
            this.k = this.e;
            this.j = this.d();
            this.i = (int)this.j;
            this.a(new gn(this.i));
        }
        this.d.c.b();
        if (this.l > 0) {
            --this.l;
        }
        if (this.m > 0) {
            --this.m;
        }
        if (this.b.D() > 0L && this.d.aA() > 0 && MinecraftServer.az() - this.b.D() > this.d.aA() * 1000 * 60) {
            this.c("You have been idle for too long!");
        }
    }
    
    public ek a() {
        return this.a;
    }
    
    public void c(final String \u2603) {
        final fa \u26032 = new fa(\u2603);
        this.a.a(new gh(\u26032), new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(final Future<? super Void> \u2603) throws Exception {
                lm.this.a.a(\u26032);
            }
        }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[0]);
        this.a.k();
        Futures.getUnchecked((java.util.concurrent.Future<Object>)this.d.a((Runnable)new Runnable() {
            @Override
            public void run() {
                lm.this.a.l();
            }
        }));
    }
    
    @Override
    public void a(final it \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.a(\u2603.a(), \u2603.b(), \u2603.c(), \u2603.d());
    }
    
    private boolean b(final ip \u2603) {
        return !Doubles.isFinite(\u2603.a()) || !Doubles.isFinite(\u2603.b()) || !Doubles.isFinite(\u2603.c()) || !Floats.isFinite(\u2603.e()) || !Floats.isFinite(\u2603.d());
    }
    
    @Override
    public void a(final ip \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if (this.b(\u2603)) {
            this.c("Invalid move packet received");
            return;
        }
        final le a = this.d.a(this.b.am);
        this.h = true;
        if (this.b.i) {
            return;
        }
        final double s = this.b.s;
        final double t = this.b.t;
        final double u = this.b.u;
        double n = 0.0;
        final double n2 = \u2603.a() - this.o;
        final double n3 = \u2603.b() - this.p;
        final double n4 = \u2603.c() - this.q;
        if (\u2603.g()) {
            n = n2 * n2 + n3 * n3 + n4 * n4;
            if (!this.r && n < 0.25) {
                this.r = true;
            }
        }
        if (this.r) {
            this.f = this.e;
            if (this.b.m != null) {
                float \u26032 = this.b.y;
                float \u26033 = this.b.z;
                this.b.m.al();
                final double n5 = this.b.s;
                final double n6 = this.b.t;
                final double n7 = this.b.u;
                if (\u2603.h()) {
                    \u26032 = \u2603.d();
                    \u26033 = \u2603.e();
                }
                this.b.C = \u2603.f();
                this.b.l();
                this.b.a(n5, n6, n7, \u26032, \u26033);
                if (this.b.m != null) {
                    this.b.m.al();
                }
                this.d.ap().d(this.b);
                if (this.b.m != null) {
                    if (n > 4.0) {
                        final pk m = this.b.m;
                        this.b.a.a(new hz(m));
                        this.a(this.b.s, this.b.t, this.b.u, this.b.y, this.b.z);
                    }
                    this.b.m.ai = true;
                }
                if (this.r) {
                    this.o = this.b.s;
                    this.p = this.b.t;
                    this.q = this.b.u;
                }
                a.g(this.b);
                return;
            }
            if (this.b.bJ()) {
                this.b.l();
                this.b.a(this.o, this.p, this.q, this.b.y, this.b.z);
                a.g(this.b);
                return;
            }
            final double t2 = this.b.t;
            this.o = this.b.s;
            this.p = this.b.t;
            this.q = this.b.u;
            double n5 = this.b.s;
            double n6 = this.b.t;
            double n7 = this.b.u;
            float \u26034 = this.b.y;
            float \u26035 = this.b.z;
            if (\u2603.g() && \u2603.b() == -999.0) {
                \u2603.a(false);
            }
            if (\u2603.g()) {
                n5 = \u2603.a();
                n6 = \u2603.b();
                n7 = \u2603.c();
                if (Math.abs(\u2603.a()) > 3.0E7 || Math.abs(\u2603.c()) > 3.0E7) {
                    this.c("Illegal position");
                    return;
                }
            }
            if (\u2603.h()) {
                \u26034 = \u2603.d();
                \u26035 = \u2603.e();
            }
            this.b.l();
            this.b.a(this.o, this.p, this.q, \u26034, \u26035);
            if (!this.r) {
                return;
            }
            double \u26036 = n5 - this.b.s;
            double \u26037 = n6 - this.b.t;
            double \u26038 = n7 - this.b.u;
            final double n8 = this.b.v * this.b.v + this.b.w * this.b.w + this.b.x * this.b.x;
            double n9 = \u26036 * \u26036 + \u26037 * \u26037 + \u26038 * \u26038;
            if (n9 - n8 > 100.0 && (!this.d.T() || !this.d.S().equals(this.b.e_()))) {
                lm.c.warn(this.b.e_() + " moved too quickly! " + \u26036 + "," + \u26037 + "," + \u26038 + " (" + \u26036 + ", " + \u26037 + ", " + \u26038 + ")");
                this.a(this.o, this.p, this.q, this.b.y, this.b.z);
                return;
            }
            final float n10 = 0.0625f;
            final boolean empty = a.a(this.b, this.b.aR().d(n10, n10, n10)).isEmpty();
            if (this.b.C && !\u2603.f() && \u26037 > 0.0) {
                this.b.bF();
            }
            this.b.d(\u26036, \u26037, \u26038);
            this.b.C = \u2603.f();
            final double n11 = \u26037;
            \u26036 = n5 - this.b.s;
            \u26037 = n6 - this.b.t;
            if (\u26037 > -0.5 || \u26037 < 0.5) {
                \u26037 = 0.0;
            }
            \u26038 = n7 - this.b.u;
            n9 = \u26036 * \u26036 + \u26037 * \u26037 + \u26038 * \u26038;
            boolean b = false;
            if (n9 > 0.0625 && !this.b.bJ() && !this.b.c.d()) {
                b = true;
                lm.c.warn(this.b.e_() + " moved wrongly!");
            }
            this.b.a(n5, n6, n7, \u26034, \u26035);
            this.b.k(this.b.s - s, this.b.t - t, this.b.u - u);
            if (!this.b.T) {
                final boolean empty2 = a.a(this.b, this.b.aR().d(n10, n10, n10)).isEmpty();
                if (empty && (b || !empty2) && !this.b.bJ()) {
                    this.a(this.o, this.p, this.q, \u26034, \u26035);
                    return;
                }
            }
            final aug a2 = this.b.aR().b(n10, n10, n10).a(0.0, -0.55, 0.0);
            if (!this.d.ak() && !this.b.bA.c && !a.c(a2)) {
                if (n11 >= -0.03125) {
                    ++this.g;
                    if (this.g > 80) {
                        lm.c.warn(this.b.e_() + " was kicked for floating too long!");
                        this.c("Flying is not enabled on this server");
                        return;
                    }
                }
            }
            else {
                this.g = 0;
            }
            this.b.C = \u2603.f();
            this.d.ap().d(this.b);
            this.b.a(this.b.t - t2, \u2603.f());
        }
        else if (this.e - this.f > 20) {
            this.a(this.o, this.p, this.q, this.b.y, this.b.z);
        }
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, Collections.emptySet());
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final Set<fi.a> \u2603) {
        this.r = false;
        this.o = \u2603;
        this.p = \u2603;
        this.q = \u2603;
        if (\u2603.contains(fi.a.a)) {
            this.o += this.b.s;
        }
        if (\u2603.contains(fi.a.b)) {
            this.p += this.b.t;
        }
        if (\u2603.contains(fi.a.c)) {
            this.q += this.b.u;
        }
        float \u26032 = \u2603;
        float \u26033 = \u2603;
        if (\u2603.contains(fi.a.d)) {
            \u26032 += this.b.y;
        }
        if (\u2603.contains(fi.a.e)) {
            \u26033 += this.b.z;
        }
        this.b.a(this.o, this.p, this.q, \u26032, \u26033);
        this.b.a.a(new fi(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603));
    }
    
    @Override
    public void a(final ir \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        final le a = this.d.a(this.b.am);
        final cj a2 = \u2603.a();
        this.b.z();
        switch (lm$4.a[\u2603.c().ordinal()]) {
            case 1: {
                if (!this.b.v()) {
                    this.b.a(false);
                }
            }
            case 2: {
                if (!this.b.v()) {
                    this.b.a(true);
                }
            }
            case 3: {
                this.b.bU();
            }
            case 4:
            case 5:
            case 6: {
                final double n = this.b.s - (a2.n() + 0.5);
                final double n2 = this.b.t - (a2.o() + 0.5) + 1.5;
                final double n3 = this.b.u - (a2.p() + 0.5);
                final double n4 = n * n + n2 * n2 + n3 * n3;
                if (n4 > 36.0) {
                    return;
                }
                if (a2.o() >= this.d.an()) {
                    return;
                }
                if (\u2603.c() == ir.a.a) {
                    if (!this.d.a((adm)a, a2, (wn)this.b) && a.af().a(a2)) {
                        this.b.c.a(a2, \u2603.b());
                    }
                    else {
                        this.b.a.a(new fv(a, a2));
                    }
                }
                else {
                    if (\u2603.c() == ir.a.c) {
                        this.b.c.a(a2);
                    }
                    else if (\u2603.c() == ir.a.b) {
                        this.b.c.e();
                    }
                    if (a.p(a2).c().t() != arm.a) {
                        this.b.a.a(new fv(a, a2));
                    }
                }
            }
            default: {
                throw new IllegalArgumentException("Invalid player action");
            }
        }
    }
    
    @Override
    public void a(final ja \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        final le a = this.d.a(this.b.am);
        zx zx = this.b.bi.h();
        boolean b = false;
        final cj a2 = \u2603.a();
        final cq a3 = cq.a(\u2603.b());
        this.b.z();
        if (\u2603.b() == 255) {
            if (zx == null) {
                return;
            }
            this.b.c.a(this.b, a, zx);
        }
        else if (a2.o() < this.d.an() - 1 || (a3 != cq.b && a2.o() < this.d.an())) {
            if (this.r && this.b.e(a2.n() + 0.5, a2.o() + 0.5, a2.p() + 0.5) < 64.0 && !this.d.a((adm)a, a2, (wn)this.b) && a.af().a(a2)) {
                this.b.c.a(this.b, a, zx, a2, a3, \u2603.d(), \u2603.e(), \u2603.f());
            }
            b = true;
        }
        else {
            final fb \u26032 = new fb("build.tooHigh", new Object[] { this.d.an() });
            \u26032.b().a(a.m);
            this.b.a.a(new fy(\u26032));
            b = true;
        }
        if (b) {
            this.b.a.a(new fv(a, a2));
            this.b.a.a(new fv(a, a2.a(a3)));
        }
        zx = this.b.bi.h();
        if (zx != null && zx.b == 0) {
            this.b.bi.a[this.b.bi.c] = null;
            zx = null;
        }
        if (zx == null || zx.l() == 0) {
            this.b.g = true;
            this.b.bi.a[this.b.bi.c] = zx.b(this.b.bi.a[this.b.bi.c]);
            final yg a4 = this.b.bk.a(this.b.bi, this.b.bi.c);
            this.b.bk.b();
            this.b.g = false;
            if (!zx.b(this.b.bi.h(), \u2603.c())) {
                this.a(new gf(this.b.bk.d, a4.e, this.b.bi.h()));
            }
        }
    }
    
    @Override
    public void a(final iz \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if (this.b.v()) {
            pk a = null;
            for (final le \u26032 : this.d.d) {
                if (\u26032 != null) {
                    a = \u2603.a(\u26032);
                    if (a != null) {
                        break;
                    }
                }
            }
            if (a != null) {
                this.b.e((pk)this.b);
                this.b.a((pk)null);
                if (a.o != this.b.o) {
                    final le u = this.b.u();
                    final le \u26033 = (le)a.o;
                    this.b.am = a.am;
                    this.a(new he(this.b.am, u.aa(), u.P().u(), this.b.c.b()));
                    u.f(this.b);
                    this.b.I = false;
                    this.b.b(a.s, a.t, a.u, a.y, a.z);
                    if (this.b.ai()) {
                        u.a(this.b, false);
                        \u26033.d(this.b);
                        \u26033.a(this.b, false);
                    }
                    this.b.a(\u26033);
                    this.d.ap().a(this.b, u);
                    this.b.a(a.s, a.t, a.u);
                    this.b.c.a(\u26033);
                    this.d.ap().b(this.b, \u26033);
                    this.d.ap().f(this.b);
                }
                else {
                    this.b.a(a.s, a.t, a.u);
                }
            }
        }
    }
    
    @Override
    public void a(final iu \u2603) {
    }
    
    @Override
    public void a(final eu \u2603) {
        lm.c.info(this.b.e_() + " lost connection: " + \u2603);
        this.d.aH();
        final fb \u26032 = new fb("multiplayer.player.left", new Object[] { this.b.f_() });
        \u26032.b().a(a.o);
        this.d.ap().a(\u26032);
        this.b.q();
        this.d.ap().e(this.b);
        if (this.d.T() && this.b.e_().equals(this.d.S())) {
            lm.c.info("Stopping singleplayer server as player logged out");
            this.d.w();
        }
    }
    
    public void a(final ff \u2603) {
        if (\u2603 instanceof fy) {
            final fy fy = (fy)\u2603;
            final wn.b y = this.b.y();
            if (y == wn.b.c) {
                return;
            }
            if (y == wn.b.b && !fy.b()) {
                return;
            }
        }
        try {
            this.a.a(\u2603);
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Sending packet");
            final c a2 = a.a("Packet being sent");
            a2.a("Packet class", new Callable<String>() {
                public String a() throws Exception {
                    return \u2603.getClass().getCanonicalName();
                }
            });
            throw new e(a);
        }
    }
    
    @Override
    public void a(final iv \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if (\u2603.a() < 0 || \u2603.a() >= wm.i()) {
            lm.c.warn(this.b.e_() + " tried to set an invalid carried item");
            return;
        }
        this.b.bi.c = \u2603.a();
        this.b.z();
    }
    
    @Override
    public void a(final ie \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if (this.b.y() == wn.b.c) {
            final fb \u26032 = new fb("chat.cannotSend", new Object[0]);
            \u26032.b().a(a.m);
            this.a(new fy(\u26032));
            return;
        }
        this.b.z();
        String s = \u2603.a();
        s = StringUtils.normalizeSpace(s);
        for (int i = 0; i < s.length(); ++i) {
            if (!f.a(s.charAt(i))) {
                this.c("Illegal characters in chat");
                return;
            }
        }
        if (s.startsWith("/")) {
            this.d(s);
        }
        else {
            final eu \u26033 = new fb("chat.type.text", new Object[] { this.b.f_(), s });
            this.d.ap().a(\u26033, false);
        }
        this.l += 20;
        if (this.l > 200 && !this.d.ap().h(this.b.cd())) {
            this.c("disconnect.spam");
        }
    }
    
    private void d(final String \u2603) {
        this.d.P().a(this.b, \u2603);
    }
    
    @Override
    public void a(final iy \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        this.b.bw();
    }
    
    @Override
    public void a(final is \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        switch (lm$4.b[\u2603.b().ordinal()]) {
            case 1: {
                this.b.c(true);
                break;
            }
            case 2: {
                this.b.c(false);
                break;
            }
            case 3: {
                this.b.d(true);
                break;
            }
            case 4: {
                this.b.d(false);
                break;
            }
            case 5: {
                this.b.a(false, true, true);
                this.r = false;
                break;
            }
            case 6: {
                if (this.b.m instanceof tp) {
                    ((tp)this.b.m).v(\u2603.c());
                    break;
                }
                break;
            }
            case 7: {
                if (this.b.m instanceof tp) {
                    ((tp)this.b.m).g(this.b);
                    break;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }
    
    @Override
    public void a(final in \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        final le a = this.d.a(this.b.am);
        final pk a2 = \u2603.a(a);
        this.b.z();
        if (a2 != null) {
            final boolean t = this.b.t(a2);
            double n = 36.0;
            if (!t) {
                n = 9.0;
            }
            if (this.b.h(a2) < n) {
                if (\u2603.a() == in.a.a) {
                    this.b.u(a2);
                }
                else if (\u2603.a() == in.a.c) {
                    a2.a(this.b, \u2603.b());
                }
                else if (\u2603.a() == in.a.b) {
                    if (a2 instanceof uz || a2 instanceof pp || a2 instanceof wq || a2 == this.b) {
                        this.c("Attempting to attack an invalid entity");
                        this.d.f("Player " + this.b.e_() + " tried to attack an invalid entity");
                        return;
                    }
                    this.b.f(a2);
                }
            }
        }
    }
    
    @Override
    public void a(final ig \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        final ig.a a = \u2603.a();
        switch (lm$4.c[a.ordinal()]) {
            case 1: {
                if (this.b.i) {
                    this.b = this.d.ap().a(this.b, 0, true);
                    break;
                }
                if (this.b.u().P().t()) {
                    if (this.d.T() && this.b.e_().equals(this.d.S())) {
                        this.b.a.c("You have died. Game over, man, it's game over!");
                        this.d.aa();
                        break;
                    }
                    final md \u26032 = new md(this.b.cd(), null, "(You just lost the game)", null, "Death in Hardcore");
                    ((mb<K, md>)this.d.ap().h()).a(\u26032);
                    this.b.a.c("You have died. Game over, man, it's game over!");
                    break;
                }
                else {
                    if (this.b.bn() > 0.0f) {
                        return;
                    }
                    this.b = this.d.ap().a(this.b, 0, false);
                    break;
                }
                break;
            }
            case 2: {
                this.b.A().a(this.b);
                break;
            }
            case 3: {
                this.b.b(mr.f);
                break;
            }
        }
    }
    
    @Override
    public void a(final il \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.p();
    }
    
    @Override
    public void a(final ik \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        if (this.b.bk.d == \u2603.a() && this.b.bk.c(this.b)) {
            if (this.b.v()) {
                final List<zx> arrayList = (List<zx>)Lists.newArrayList();
                for (int i = 0; i < this.b.bk.c.size(); ++i) {
                    arrayList.add(this.b.bk.c.get(i).d());
                }
                this.b.a(this.b.bk, arrayList);
            }
            else {
                final zx a = this.b.bk.a(\u2603.b(), \u2603.c(), \u2603.f(), this.b);
                if (zx.b(\u2603.e(), a)) {
                    this.b.a.a(new ga(\u2603.a(), \u2603.d(), true));
                    this.b.g = true;
                    this.b.bk.b();
                    this.b.o();
                    this.b.g = false;
                }
                else {
                    this.n.a(this.b.bk.d, Short.valueOf(\u2603.d()));
                    this.b.a.a(new ga(\u2603.a(), \u2603.d(), false));
                    this.b.bk.a(this.b, false);
                    final List<zx> arrayList2 = (List<zx>)Lists.newArrayList();
                    for (int j = 0; j < this.b.bk.c.size(); ++j) {
                        arrayList2.add(this.b.bk.c.get(j).d());
                    }
                    this.b.a(this.b.bk, arrayList2);
                }
            }
        }
    }
    
    @Override
    public void a(final ij \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        if (this.b.bk.d == \u2603.a() && this.b.bk.c(this.b) && !this.b.v()) {
            this.b.bk.a(this.b, \u2603.b());
            this.b.bk.b();
        }
    }
    
    @Override
    public void a(final iw \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if (this.b.c.d()) {
            final boolean b = \u2603.a() < 0;
            final zx b2 = \u2603.b();
            if (b2 != null && b2.n() && b2.o().b("BlockEntityTag", 10)) {
                final dn m = b2.o().m("BlockEntityTag");
                if (m.c("x") && m.c("y") && m.c("z")) {
                    final cj \u26032 = new cj(m.f("x"), m.f("y"), m.f("z"));
                    final akw s = this.b.o.s(\u26032);
                    if (s != null) {
                        final dn dn = new dn();
                        s.b(dn);
                        dn.o("x");
                        dn.o("y");
                        dn.o("z");
                        b2.a("BlockEntityTag", dn);
                    }
                }
            }
            final boolean b3 = \u2603.a() >= 1 && \u2603.a() < 36 + wm.i();
            final boolean b4 = b2 == null || b2.b() != null;
            final boolean b5 = b2 == null || (b2.i() >= 0 && b2.b <= 64 && b2.b > 0);
            if (b3 && b4 && b5) {
                if (b2 == null) {
                    this.b.bj.a(\u2603.a(), (zx)null);
                }
                else {
                    this.b.bj.a(\u2603.a(), b2);
                }
                this.b.bj.a(this.b, true);
            }
            else if (b && b4 && b5 && this.m < 200) {
                this.m += 20;
                final uz a = this.b.a(b2, true);
                if (a != null) {
                    a.j();
                }
            }
        }
    }
    
    @Override
    public void a(final ii \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        final Short n = this.n.a(this.b.bk.d);
        if (n != null && \u2603.b() == n && this.b.bk.d == \u2603.a() && !this.b.bk.c(this.b) && !this.b.v()) {
            this.b.bk.a(this.b, true);
        }
    }
    
    @Override
    public void a(final ix \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.z();
        final le a = this.d.a(this.b.am);
        final cj a2 = \u2603.a();
        if (a.e(a2)) {
            final akw s = a.s(a2);
            if (!(s instanceof aln)) {
                return;
            }
            final aln aln = (aln)s;
            if (!aln.b() || aln.c() != this.b) {
                this.d.f("Player " + this.b.e_() + " just tried to change non-editable sign");
                return;
            }
            final eu[] b = \u2603.b();
            for (int i = 0; i < b.length; ++i) {
                aln.a[i] = new fa(a.a(b[i].c()));
            }
            aln.p_();
            a.h(a2);
        }
    }
    
    @Override
    public void a(final io \u2603) {
        if (\u2603.a() == this.i) {
            final int n = (int)(this.d() - this.j);
            this.b.h = (this.b.h * 3 + n) / 4;
        }
    }
    
    private long d() {
        return System.nanoTime() / 1000000L;
    }
    
    @Override
    public void a(final iq \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.bA.b = (\u2603.b() && this.b.bA.c);
    }
    
    @Override
    public void a(final id \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final String s : this.d.a((m)this.b, \u2603.a(), \u2603.b())) {
            arrayList.add(s);
        }
        this.b.a.a(new fx(arrayList.toArray(new String[arrayList.size()])));
    }
    
    @Override
    public void a(final ih \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        this.b.a(\u2603);
    }
    
    @Override
    public void a(final im \u2603) {
        fh.a((ff<lm>)\u2603, this, this.b.u());
        if ("MC|BEdit".equals(\u2603.a())) {
            final em em = new em(Unpooled.wrappedBuffer(\u2603.b()));
            try {
                final zx zx = em.i();
                if (zx == null) {
                    return;
                }
                if (!abc.b(zx.o())) {
                    throw new IOException("Invalid book tag!");
                }
                final zx zx2 = this.b.bi.h();
                if (zx2 == null) {
                    return;
                }
                if (zx.b() == zy.bM && zx.b() == zx2.b()) {
                    zx2.a("pages", zx.o().c("pages", 8));
                }
            }
            catch (Exception throwable) {
                lm.c.error("Couldn't handle book info", throwable);
            }
            finally {
                em.release();
            }
        }
        else if ("MC|BSign".equals(\u2603.a())) {
            final em em = new em(Unpooled.wrappedBuffer(\u2603.b()));
            try {
                final zx zx = em.i();
                if (zx == null) {
                    return;
                }
                if (!abd.b(zx.o())) {
                    throw new IOException("Invalid book tag!");
                }
                final zx zx2 = this.b.bi.h();
                if (zx2 == null) {
                    return;
                }
                if (zx.b() == zy.bN && zx2.b() == zy.bM) {
                    zx2.a("author", new ea(this.b.e_()));
                    zx2.a("title", new ea(zx.o().j("title")));
                    zx2.a("pages", zx.o().c("pages", 8));
                    zx2.a(zy.bN);
                }
            }
            catch (Exception throwable) {
                lm.c.error("Couldn't sign book", throwable);
            }
            finally {
                em.release();
            }
        }
        else if ("MC|TrSel".equals(\u2603.a())) {
            try {
                final int int1 = \u2603.b().readInt();
                final xi bk = this.b.bk;
                if (bk instanceof yb) {
                    ((yb)bk).d(int1);
                }
            }
            catch (Exception ex) {
                lm.c.error("Couldn't select trade", ex);
            }
        }
        else if ("MC|AdvCdm".equals(\u2603.a())) {
            if (!this.d.al()) {
                this.b.a(new fb("advMode.notEnabled", new Object[0]));
            }
            else if (this.b.a(2, "") && this.b.bA.d) {
                final em em = \u2603.b();
                try {
                    final int n = em.readByte();
                    adc adc = null;
                    if (n == 0) {
                        final akw s = this.b.o.s(new cj(em.readInt(), em.readInt(), em.readInt()));
                        if (s instanceof akz) {
                            adc = ((akz)s).b();
                        }
                    }
                    else if (n == 1) {
                        final pk a = this.b.o.a(em.readInt());
                        if (a instanceof vc) {
                            adc = ((vc)a).j();
                        }
                    }
                    final String c = em.c(em.readableBytes());
                    final boolean boolean1 = em.readBoolean();
                    if (adc != null) {
                        adc.a(c);
                        adc.a(boolean1);
                        if (!boolean1) {
                            adc.b((eu)null);
                        }
                        adc.h();
                        this.b.a(new fb("advMode.setCommand.success", new Object[] { c }));
                    }
                }
                catch (Exception throwable) {
                    lm.c.error("Couldn't set command block", throwable);
                }
                finally {
                    em.release();
                }
            }
            else {
                this.b.a(new fb("advMode.notAllowed", new Object[0]));
            }
        }
        else if ("MC|Beacon".equals(\u2603.a())) {
            if (this.b.bk instanceof xl) {
                try {
                    final em em = \u2603.b();
                    final int n = em.readInt();
                    final int int2 = em.readInt();
                    final xl xl = (xl)this.b.bk;
                    final yg a2 = xl.a(0);
                    if (a2.e()) {
                        a2.a(1);
                        final og e = xl.e();
                        e.b(1, n);
                        e.b(2, int2);
                        e.p_();
                    }
                }
                catch (Exception ex) {
                    lm.c.error("Couldn't set beacon", ex);
                }
            }
        }
        else if ("MC|ItemName".equals(\u2603.a()) && this.b.bk instanceof xk) {
            final xk xk = (xk)this.b.bk;
            if (\u2603.b() == null || \u2603.b().readableBytes() < 1) {
                xk.a("");
            }
            else {
                final String a3 = f.a(\u2603.b().c(32767));
                if (a3.length() <= 30) {
                    xk.a(a3);
                }
            }
        }
    }
    
    static {
        c = LogManager.getLogger();
    }
}
