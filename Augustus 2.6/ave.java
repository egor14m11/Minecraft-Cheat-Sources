import com.google.common.collect.ForwardingMultimap;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.apache.commons.lang3.Validate;
import com.mojang.authlib.GameProfile;
import com.google.common.collect.Multimap;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;
import java.nio.ByteOrder;
import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.client.ClientBrandRetriever;
import java.net.SocketAddress;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import java.util.concurrent.Callable;
import java.text.DecimalFormat;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.opengl.GL11;
import java.util.Set;
import com.google.common.collect.Sets;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.PixelFormat;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.Sys;
import javax.imageio.ImageIO;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import com.google.common.collect.Queues;
import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import java.util.concurrent.FutureTask;
import java.util.Queue;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.net.Proxy;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import org.lwjgl.opengl.DisplayMode;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ave implements od, os
{
    private static final Logger K;
    private static final jy L;
    public static final boolean a;
    public static byte[] b;
    private static final List<DisplayMode> M;
    private final File N;
    private final PropertyMap O;
    private final PropertyMap P;
    private bde Q;
    private bmj R;
    private static ave S;
    public bda c;
    private boolean T;
    private boolean U;
    private boolean V;
    private b W;
    public int d;
    public int e;
    private boolean X;
    private avl Y;
    private or Z;
    public bdb f;
    public bfr g;
    private biu aa;
    private bjh ab;
    private bfn ac;
    public bew h;
    private pk ad;
    public pk i;
    public bec j;
    private final avm ae;
    private boolean af;
    public avn k;
    public avn l;
    public axu m;
    public avi n;
    public bfk o;
    private int ag;
    private int ah;
    private int ai;
    private bpo aj;
    public ayd p;
    public avo q;
    public boolean r;
    public auh s;
    public avh t;
    public avf u;
    public final File v;
    private final File ak;
    private final String al;
    private final Proxy am;
    private atr an;
    private static int ao;
    private int ap;
    private String aq;
    private int ar;
    public boolean w;
    long x;
    private int as;
    public final nh y;
    long z;
    private final boolean at;
    private final boolean au;
    private ek av;
    private boolean aw;
    public final nt A;
    private long ax;
    private bng ay;
    private final bny az;
    private final List<bnk> aA;
    private final bna aB;
    private bnm aC;
    private bns aD;
    private bqm aE;
    private bfw aF;
    private bmh aG;
    private bpz aH;
    private bpv aI;
    private jy aJ;
    private final MinecraftSessionService aK;
    private bnp aL;
    private final Queue<FutureTask<?>> aM;
    private long aN;
    private final Thread aO;
    private bou aP;
    private bgd aQ;
    volatile boolean B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    long H;
    int I;
    long J;
    private String aR;
    
    public ave(final bao \u2603) {
        this.U = true;
        this.X = false;
        this.Y = new avl(20.0f);
        this.Z = new or("client", this, MinecraftServer.az());
        this.x = J();
        this.y = new nh();
        this.z = System.nanoTime();
        this.A = new nt();
        this.ax = -1L;
        this.az = new bny();
        this.aA = (List<bnk>)Lists.newArrayList();
        this.aM = (Queue<FutureTask<?>>)Queues.newArrayDeque();
        this.aN = 0L;
        this.aO = Thread.currentThread();
        this.B = true;
        this.C = "";
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = J();
        this.J = -1L;
        this.aR = "root";
        ave.S = this;
        this.v = \u2603.c.a;
        this.ak = \u2603.c.c;
        this.N = \u2603.c.b;
        this.al = \u2603.d.b;
        this.O = \u2603.a.b;
        this.P = \u2603.a.c;
        this.aB = new bna(new bmy(\u2603.c.c, \u2603.c.d).a());
        this.am = ((\u2603.a.d == null) ? Proxy.NO_PROXY : \u2603.a.d);
        this.aK = new YggdrasilAuthenticationService(\u2603.a.d, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.ae = \u2603.a.a;
        ave.K.info("Setting user: " + this.ae.c());
        ave.K.info("(Session ID is " + this.ae.a() + ")");
        this.au = \u2603.d.a;
        this.d = ((\u2603.b.a > 0) ? \u2603.b.a : 1);
        this.e = ((\u2603.b.b > 0) ? \u2603.b.b : 1);
        this.ah = \u2603.b.a;
        this.ai = \u2603.b.b;
        this.T = \u2603.b.c;
        this.at = as();
        this.aj = new bpo(this);
        if (\u2603.e.a != null) {
            this.aq = \u2603.e.a;
            this.ar = \u2603.e.b;
        }
        ImageIO.setUseCache(false);
        kb.c();
    }
    
    public void a() {
        this.B = true;
        try {
            this.am();
        }
        catch (Throwable throwable) {
            final b b = b.a(throwable, "Initializing game");
            b.a("Initialization");
            this.c(this.b(b));
            return;
        }
        try {
            while (this.B) {
                if (this.V && this.W != null) {
                    this.c(this.W);
                    return;
                }
                try {
                    this.av();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.l();
                    this.a(new axo());
                    System.gc();
                }
            }
        }
        catch (avk avk) {}
        catch (e throwable2) {
            this.b(throwable2.a());
            this.l();
            ave.K.fatal("Reported exception thrown!", throwable2);
            this.c(throwable2.a());
        }
        catch (Throwable throwable) {
            final b b = this.b(new b("Unexpected error", throwable));
            this.l();
            ave.K.fatal("Unreported exception thrown!", throwable);
            this.c(b);
        }
        finally {
            this.g();
        }
    }
    
    private void am() throws LWJGLException, IOException {
        this.t = new avh(this, this.v);
        this.aA.add(this.aB);
        this.at();
        if (this.t.C > 0 && this.t.B > 0) {
            this.d = this.t.B;
            this.e = this.t.C;
        }
        ave.K.info("LWJGL Version: " + Sys.getVersion());
        this.ar();
        this.aq();
        this.ap();
        bqs.a();
        (this.aF = new bfw(this.d, this.e, true)).a(0.0f, 0.0f, 0.0f, 0.0f);
        this.an();
        this.aC = new bnm(this.N, new File(this.v, "server-resource-packs"), this.aB, this.az, this.t);
        this.ay = new bnn(this.az);
        this.aD = new bns(this.az, this.t.aM);
        this.ay.a(this.aD);
        this.e();
        this.R = new bmj(this.ay);
        this.ay.a(this.R);
        this.a(this.R);
        this.ao();
        this.aL = new bnp(this.R, new File(this.ak, "skins"), this.aK);
        this.an = new atk(new File(this.v, "saves"));
        this.aH = new bpz(this.ay, this.t);
        this.ay.a(this.aH);
        this.aI = new bpv(this);
        this.k = new avn(this.t, new jy("textures/font/ascii.png"), this.R, false);
        if (this.t.aM != null) {
            this.k.a(this.d());
            this.k.b(this.aD.b());
        }
        this.l = new avn(this.t, new jy("textures/font/ascii_sga.png"), this.R, false);
        this.ay.a(this.k);
        this.ay.a(this.l);
        this.ay.a(new bnf());
        this.ay.a(new bne());
        mr.f.a(new ms() {
            @Override
            public String a(final String \u2603) {
                try {
                    return String.format(\u2603, avh.c(ave.this.t.ae.i()));
                }
                catch (Exception ex) {
                    return "Error: " + ex.getLocalizedMessage();
                }
            }
        });
        this.u = new avf();
        this.b("Pre startup");
        bfl.w();
        bfl.j(7425);
        bfl.a(1.0);
        bfl.j();
        bfl.c(515);
        bfl.d();
        bfl.a(516, 0.1f);
        bfl.e(1029);
        bfl.n(5889);
        bfl.D();
        bfl.n(5888);
        this.b("Startup");
        (this.aG = new bmh("textures")).a(this.t.J);
        this.R.a(bmh.g, this.aG);
        this.R.a(bmh.g);
        this.aG.a(false, this.t.J > 0);
        this.aP = new bou(this.aG);
        this.ay.a(this.aP);
        this.ab = new bjh(this.R, this.aP);
        this.aa = new biu(this.R, this.ab);
        this.ac = new bfn(this);
        this.ay.a(this.ab);
        this.o = new bfk(this, this.ay);
        this.ay.a(this.o);
        this.aQ = new bgd(this.aP.c(), this.t);
        this.ay.a(this.aQ);
        this.g = new bfr(this);
        this.ay.a(this.g);
        this.p = new ayd(this);
        bfl.b(0, 0, this.d, this.e);
        this.j = new bec(this.f, this.R);
        this.b("Post startup");
        this.q = new avo(this);
        if (this.aq != null) {
            this.a(new awz(new aya(), this, this.aq, this.ar));
        }
        else {
            this.a(new aya());
        }
        this.R.c(this.aJ);
        this.aJ = null;
        this.n = new avi(this);
        if (this.t.s && !this.T) {
            this.q();
        }
        try {
            Display.setVSyncEnabled(this.t.t);
        }
        catch (OpenGLException ex) {
            this.t.t = false;
            this.t.b();
        }
        this.g.b();
    }
    
    private void an() {
        this.az.a(new boo(), bon.class);
        this.az.a(new boe(), bod.class);
        this.az.a(new bob(), boa.class);
        this.az.a(new bok(), boj.class);
        this.az.a(new boh(), bog.class);
    }
    
    private void ao() {
        try {
            this.aE = new bqn(this, Iterables.getFirst((Iterable<? extends Property>)((ForwardingMultimap<String, Object>)this.O).get("twitch_access_token"), (Property)null));
        }
        catch (Throwable \u2603) {
            this.aE = new bqo(\u2603);
            ave.K.error("Couldn't initialize twitch stream");
        }
    }
    
    private void ap() throws LWJGLException {
        Display.setResizable(true);
        Display.setTitle("Minecraft 1.8.8");
        try {
            Display.create(new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException throwable) {
            ave.K.error("Couldn't set pixel format", throwable);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException ex) {}
            if (this.T) {
                this.au();
            }
            Display.create();
        }
    }
    
    private void aq() throws LWJGLException {
        if (this.T) {
            Display.setFullscreen(true);
            final DisplayMode displayMode = Display.getDisplayMode();
            this.d = Math.max(1, displayMode.getWidth());
            this.e = Math.max(1, displayMode.getHeight());
        }
        else {
            Display.setDisplayMode(new DisplayMode(this.d, this.e));
        }
    }
    
    private void ar() {
        final g.a a = g.a();
        if (a != g.a.d) {
            InputStream c = null;
            InputStream c2 = null;
            try {
                c = this.aB.c(new jy("icons/icon_16x16.png"));
                c2 = this.aB.c(new jy("icons/icon_32x32.png"));
                if (c != null && c2 != null) {
                    Display.setIcon(new ByteBuffer[] { this.a(c), this.a(c2) });
                }
            }
            catch (IOException throwable) {
                ave.K.error("Couldn't set icon", throwable);
            }
            finally {
                IOUtils.closeQuietly(c);
                IOUtils.closeQuietly(c2);
            }
        }
    }
    
    private static boolean as() {
        final String[] array2;
        final String[] array = array2 = new String[] { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
        for (final String key : array2) {
            final String property = System.getProperty(key);
            if (property != null && property.contains("64")) {
                return true;
            }
        }
        return false;
    }
    
    public bfw b() {
        return this.aF;
    }
    
    public String c() {
        return this.al;
    }
    
    private void at() {
        final Thread thread = new Thread("Timer hack thread") {
            @Override
            public void run() {
                while (ave.this.B) {
                    try {
                        Thread.sleep(2147483647L);
                    }
                    catch (InterruptedException ex) {}
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }
    
    public void a(final b \u2603) {
        this.V = true;
        this.W = \u2603;
    }
    
    public void c(final b \u2603) {
        final File parent = new File(A().v, "crash-reports");
        final File \u26032 = new File(parent, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        kb.a(\u2603.e());
        if (\u2603.f() != null) {
            kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + \u2603.f());
            System.exit(-1);
        }
        else if (\u2603.a(\u26032)) {
            kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + \u26032.getAbsolutePath());
            System.exit(-1);
        }
        else {
            kb.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }
    
    public boolean d() {
        return this.aD.a() || this.t.aN;
    }
    
    public void e() {
        final List<bnk> arrayList = (List<bnk>)Lists.newArrayList((Iterable<?>)this.aA);
        for (final bnm.a a : this.aC.c()) {
            arrayList.add(a.c());
        }
        if (this.aC.e() != null) {
            arrayList.add(this.aC.e());
        }
        try {
            this.ay.a(arrayList);
        }
        catch (RuntimeException throwable) {
            ave.K.info("Caught error stitching, removing all assigned resourcepacks", throwable);
            arrayList.clear();
            arrayList.addAll(this.aA);
            this.aC.a(Collections.emptyList());
            this.ay.a(arrayList);
            this.t.k.clear();
            this.t.l.clear();
            this.t.b();
        }
        this.aD.a(arrayList);
        if (this.g != null) {
            this.g.a();
        }
    }
    
    private ByteBuffer a(final InputStream \u2603) throws IOException {
        final BufferedImage read = ImageIO.read(\u2603);
        final int[] rgb = read.getRGB(0, 0, read.getWidth(), read.getHeight(), null, 0, read.getWidth());
        final ByteBuffer allocate = ByteBuffer.allocate(4 * rgb.length);
        for (final int n : rgb) {
            allocate.putInt(n << 8 | (n >> 24 & 0xFF));
        }
        allocate.flip();
        return allocate;
    }
    
    private void au() throws LWJGLException {
        final Set<DisplayMode> hashSet = (Set<DisplayMode>)Sets.newHashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        DisplayMode desktopDisplayMode = Display.getDesktopDisplayMode();
        if (!hashSet.contains(desktopDisplayMode) && g.a() == g.a.d) {
            for (final DisplayMode displayMode : ave.M) {
                boolean b = true;
                for (final DisplayMode displayMode2 : hashSet) {
                    if (displayMode2.getBitsPerPixel() == 32 && displayMode2.getWidth() == displayMode.getWidth() && displayMode2.getHeight() == displayMode.getHeight()) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    continue;
                }
                for (final DisplayMode displayMode2 : hashSet) {
                    if (displayMode2.getBitsPerPixel() == 32 && displayMode2.getWidth() == displayMode.getWidth() / 2 && displayMode2.getHeight() == displayMode.getHeight() / 2) {
                        desktopDisplayMode = displayMode2;
                        break;
                    }
                }
            }
        }
        Display.setDisplayMode(desktopDisplayMode);
        this.d = desktopDisplayMode.getWidth();
        this.e = desktopDisplayMode.getHeight();
    }
    
    private void a(final bmj \u2603) throws LWJGLException {
        final avr avr = new avr(this);
        final int e = avr.e();
        final bfw bfw = new bfw(avr.a() * e, avr.b() * e, true);
        bfw.a(false);
        bfl.n(5889);
        bfl.D();
        bfl.a(0.0, avr.a(), avr.b(), 0.0, 1000.0, 3000.0);
        bfl.n(5888);
        bfl.D();
        bfl.b(0.0f, 0.0f, -2000.0f);
        bfl.f();
        bfl.n();
        bfl.i();
        bfl.w();
        InputStream a = null;
        try {
            a = this.aB.a(ave.L);
            \u2603.a(this.aJ = \u2603.a("logo", new blz(ImageIO.read(a))));
        }
        catch (IOException throwable) {
            ave.K.error("Unable to load logo: " + ave.L, throwable);
        }
        finally {
            IOUtils.closeQuietly(a);
        }
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        c.a(7, bms.i);
        c.b(0.0, this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        c.b(this.d, this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        c.b(this.d, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        c.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        a2.b();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final int \u26032 = 256;
        final int \u26033 = 256;
        this.a((avr.a() - \u26032) / 2, (avr.b() - \u26033) / 2, 0, 0, \u26032, \u26033, 255, 255, 255, 255);
        bfl.f();
        bfl.n();
        bfw.e();
        bfw.c(avr.a() * e, avr.b() * e);
        bfl.d();
        bfl.a(516, 0.1f);
        this.h();
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = 0.00390625f;
        final float n2 = 0.00390625f;
        final bfd c = bfx.a().c();
        c.a(7, bms.i);
        c.b(\u2603, \u2603 + \u2603, 0.0).a(\u2603 * n, (\u2603 + \u2603) * n2).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, 0.0).a((\u2603 + \u2603) * n, (\u2603 + \u2603) * n2).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603 + \u2603, \u2603, 0.0).a((\u2603 + \u2603) * n, \u2603 * n2).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603, \u2603, 0.0).a(\u2603 * n, \u2603 * n2).b(\u2603, \u2603, \u2603, \u2603).d();
        bfx.a().b();
    }
    
    public atr f() {
        return this.an;
    }
    
    public void a(axu \u2603) {
        if (this.m != null) {
            this.m.m();
        }
        if (\u2603 == null && this.f == null) {
            \u2603 = new aya();
        }
        else if (\u2603 == null && this.h.bn() <= 0.0f) {
            \u2603 = new axe();
        }
        if (\u2603 instanceof aya) {
            this.t.aB = false;
            this.q.d().a();
        }
        if ((this.m = \u2603) != null) {
            this.o();
            final avr avr = new avr(this);
            final int a = avr.a();
            final int b = avr.b();
            \u2603.a(this, a, b);
            this.r = false;
        }
        else {
            this.aH.e();
            this.n();
        }
    }
    
    private void b(final String \u2603) {
        if (!this.U) {
            return;
        }
        final int glGetError = GL11.glGetError();
        if (glGetError != 0) {
            final String gluErrorString = GLU.gluErrorString(glGetError);
            ave.K.error("########## GL ERROR ##########");
            ave.K.error("@ " + \u2603);
            ave.K.error(glGetError + ": " + gluErrorString);
        }
    }
    
    public void g() {
        try {
            this.aE.f();
            ave.K.info("Stopping!");
            try {
                this.a((bdb)null);
            }
            catch (Throwable t) {}
            this.aH.d();
        }
        finally {
            Display.destroy();
            if (!this.V) {
                System.exit(0);
            }
        }
        System.gc();
    }
    
    private void av() {
        final long nanoTime = System.nanoTime();
        this.A.a("root");
        if (Display.isCreated() && Display.isCloseRequested()) {
            this.m();
        }
        if (this.af && this.f != null) {
            final float c = this.Y.c;
            this.Y.a();
            this.Y.c = c;
        }
        else {
            this.Y.a();
        }
        this.A.a("scheduledExecutables");
        synchronized (this.aM) {
            while (!this.aM.isEmpty()) {
                g.a(this.aM.poll(), ave.K);
            }
        }
        this.A.b();
        final long nanoTime2 = System.nanoTime();
        this.A.a("tick");
        for (int i = 0; i < this.Y.b; ++i) {
            this.s();
        }
        this.A.c("preRenderErrors");
        final long \u2603 = System.nanoTime() - nanoTime2;
        this.b("Pre render");
        this.A.c("sound");
        this.aH.a(this.h, this.Y.c);
        this.A.b();
        this.A.a("render");
        bfl.E();
        bfl.m(16640);
        this.aF.a(true);
        this.A.a("display");
        bfl.w();
        if (this.h != null && this.h.aj()) {
            this.t.aA = 0;
        }
        this.A.b();
        if (!this.r) {
            this.A.c("gameRenderer");
            this.o.a(this.Y.c, nanoTime);
            this.A.b();
        }
        this.A.b();
        if (this.t.aB && this.t.aC && !this.t.az) {
            if (!this.A.a) {
                this.A.a();
            }
            this.A.a = true;
            this.a(\u2603);
        }
        else {
            this.A.a = false;
            this.J = System.nanoTime();
        }
        this.p.a();
        this.aF.e();
        bfl.F();
        bfl.E();
        this.aF.c(this.d, this.e);
        bfl.F();
        bfl.E();
        this.o.b(this.Y.c);
        bfl.F();
        this.A.a("root");
        this.h();
        Thread.yield();
        this.A.a("stream");
        this.A.a("update");
        this.aE.g();
        this.A.c("submit");
        this.aE.h();
        this.A.b();
        this.A.b();
        this.b("Post render");
        ++this.I;
        this.af = (this.F() && this.m != null && this.m.d() && !this.aj.b());
        final long nanoTime3 = System.nanoTime();
        this.y.a(nanoTime3 - this.z);
        this.z = nanoTime3;
        while (J() >= this.H + 1000L) {
            ave.ao = this.I;
            this.C = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", ave.ao, bht.a, (bht.a != 1) ? "s" : "", (this.t.g == avh.a.i.f()) ? "inf" : Integer.valueOf(this.t.g), this.t.t ? " vsync" : "", this.t.i ? "" : " fast", (this.t.h == 0) ? "" : ((this.t.h == 1) ? " fast-clouds" : " fancy-clouds"), bqs.f() ? " vbo" : "");
            bht.a = 0;
            this.H += 1000L;
            this.I = 0;
            this.Z.b();
            if (!this.Z.d()) {
                this.Z.a();
            }
        }
        if (this.k()) {
            this.A.a("fpslimit_wait");
            Display.sync(this.j());
            this.A.b();
        }
        this.A.b();
    }
    
    public void h() {
        this.A.a("display_update");
        Display.update();
        this.A.b();
        this.i();
    }
    
    protected void i() {
        if (!this.T && Display.wasResized()) {
            final int d = this.d;
            final int e = this.e;
            this.d = Display.getWidth();
            this.e = Display.getHeight();
            if (this.d != d || this.e != e) {
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
                this.a(this.d, this.e);
            }
        }
    }
    
    public int j() {
        if (this.f == null && this.m != null) {
            return 30;
        }
        return this.t.g;
    }
    
    public boolean k() {
        return this.j() < avh.a.i.f();
    }
    
    public void l() {
        try {
            ave.b = new byte[0];
            this.g.k();
        }
        catch (Throwable t) {}
        try {
            System.gc();
            this.a((bdb)null);
        }
        catch (Throwable t2) {}
        System.gc();
    }
    
    private void b(int \u2603) {
        final List<nt.a> b = this.A.b(this.aR);
        if (b == null || b.isEmpty()) {
            return;
        }
        final nt.a a = b.remove(0);
        if (\u2603 == 0) {
            if (a.c.length() > 0) {
                final int lastIndex = this.aR.lastIndexOf(".");
                if (lastIndex >= 0) {
                    this.aR = this.aR.substring(0, lastIndex);
                }
            }
        }
        else if (--\u2603 < b.size() && !b.get(\u2603).c.equals("unspecified")) {
            if (this.aR.length() > 0) {
                this.aR += ".";
            }
            this.aR += b.get(\u2603).c;
        }
    }
    
    private void a(final long \u2603) {
        if (!this.A.a) {
            return;
        }
        final List<nt.a> b = this.A.b(this.aR);
        final nt.a a = b.remove(0);
        bfl.m(256);
        bfl.n(5889);
        bfl.g();
        bfl.D();
        bfl.a(0.0, this.d, this.e, 0.0, 1000.0, 3000.0);
        bfl.n(5888);
        bfl.D();
        bfl.b(0.0f, 0.0f, -2000.0f);
        GL11.glLineWidth(1.0f);
        bfl.x();
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        final int n = 160;
        final int n2 = this.d - n - 10;
        final int n3 = this.e - n * 2;
        bfl.l();
        c.a(7, bms.f);
        c.b(n2 - n * 1.1f, n3 - n * 0.6f - 16.0f, 0.0).b(200, 0, 0, 0).d();
        c.b(n2 - n * 1.1f, n3 + n * 2, 0.0).b(200, 0, 0, 0).d();
        c.b(n2 + n * 1.1f, n3 + n * 2, 0.0).b(200, 0, 0, 0).d();
        c.b(n2 + n * 1.1f, n3 - n * 0.6f - 16.0f, 0.0).b(200, 0, 0, 0).d();
        a2.b();
        bfl.k();
        double n4 = 0.0;
        for (int i = 0; i < b.size(); ++i) {
            final nt.a a3 = b.get(i);
            final int n5 = ns.c(a3.a / 4.0) + 1;
            c.a(6, bms.f);
            final int a4 = a3.a();
            final int n6 = a4 >> 16 & 0xFF;
            final int n7 = a4 >> 8 & 0xFF;
            final int n8 = a4 & 0xFF;
            c.b(n2, n3, 0.0).b(n6, n7, n8, 255).d();
            for (int j = n5; j >= 0; --j) {
                final float n9 = (float)((n4 + a3.a * j / n5) * 3.1415927410125732 * 2.0 / 100.0);
                final float n10 = ns.a(n9) * n;
                final float n11 = ns.b(n9) * n * 0.5f;
                c.b(n2 + n10, n3 - n11, 0.0).b(n6, n7, n8, 255).d();
            }
            a2.b();
            c.a(5, bms.f);
            for (int j = n5; j >= 0; --j) {
                final float n9 = (float)((n4 + a3.a * j / n5) * 3.1415927410125732 * 2.0 / 100.0);
                final float n10 = ns.a(n9) * n;
                final float n11 = ns.b(n9) * n * 0.5f;
                c.b(n2 + n10, n3 - n11, 0.0).b(n6 >> 1, n7 >> 1, n8 >> 1, 255).d();
                c.b(n2 + n10, n3 - n11 + 10.0f, 0.0).b(n6 >> 1, n7 >> 1, n8 >> 1, 255).d();
            }
            a2.b();
            n4 += a3.a;
        }
        final DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        bfl.w();
        String \u26032 = "";
        if (!a.c.equals("unspecified")) {
            \u26032 += "[0] ";
        }
        if (a.c.length() == 0) {
            \u26032 += "ROOT ";
        }
        else {
            \u26032 = \u26032 + a.c + " ";
        }
        final int n5 = 16777215;
        this.k.a(\u26032, (float)(n2 - n), (float)(n3 - n / 2 - 16), n5);
        this.k.a(\u26032 = decimalFormat.format(a.b) + "%", (float)(n2 + n - this.k.a(\u26032)), (float)(n3 - n / 2 - 16), n5);
        for (int k = 0; k < b.size(); ++k) {
            final nt.a a5 = b.get(k);
            String s = "";
            if (a5.c.equals("unspecified")) {
                s += "[?] ";
            }
            else {
                s = s + "[" + (k + 1) + "] ";
            }
            s += a5.c;
            this.k.a(s, (float)(n2 - n), (float)(n3 + n / 2 + k * 8 + 20), a5.a());
            this.k.a(s = decimalFormat.format(a5.a) + "%", (float)(n2 + n - 50 - this.k.a(s)), (float)(n3 + n / 2 + k * 8 + 20), a5.a());
            this.k.a(s = decimalFormat.format(a5.b) + "%", (float)(n2 + n - this.k.a(s)), (float)(n3 + n / 2 + k * 8 + 20), a5.a());
        }
    }
    
    public void m() {
        this.B = false;
    }
    
    public void n() {
        if (!Display.isActive()) {
            return;
        }
        if (this.w) {
            return;
        }
        this.w = true;
        this.u.a();
        this.a((axu)null);
        this.ag = 10000;
    }
    
    public void o() {
        if (!this.w) {
            return;
        }
        avb.a();
        this.w = false;
        this.u.b();
    }
    
    public void p() {
        if (this.m != null) {
            return;
        }
        this.a(new axp());
        if (this.F() && !this.aj.b()) {
            this.aH.a();
        }
    }
    
    private void b(final boolean \u2603) {
        if (!\u2603) {
            this.ag = 0;
        }
        if (this.ag > 0 || this.h.bS()) {
            return;
        }
        if (\u2603 && this.s != null && this.s.a == auh.a.b) {
            final cj a = this.s.a();
            if (this.f.p(a).c().t() != arm.a && this.c.c(a, this.s.b)) {
                this.j.a(a, this.s.b);
                this.h.bw();
            }
            return;
        }
        this.c.c();
    }
    
    private void aw() {
        if (this.ag > 0) {
            return;
        }
        this.h.bw();
        if (this.s == null) {
            ave.K.error("Null returned as 'hitResult', this shouldn't happen!");
            if (this.c.g()) {
                this.ag = 10;
            }
            return;
        }
        switch (ave$10.a[this.s.a.ordinal()]) {
            case 1: {
                this.c.a(this.h, this.s.d);
                return;
            }
            case 2: {
                final cj a = this.s.a();
                if (this.f.p(a).c().t() != arm.a) {
                    this.c.b(a, this.s.b);
                    return;
                }
                break;
            }
        }
        if (this.c.g()) {
            this.ag = 10;
        }
    }
    
    private void ax() {
        if (this.c.m()) {
            return;
        }
        this.ap = 4;
        boolean b = true;
        final zx h = this.h.bi.h();
        if (this.s == null) {
            ave.K.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        else {
            switch (ave$10.a[this.s.a.ordinal()]) {
                case 1: {
                    if (this.c.a(this.h, this.s.d, this.s)) {
                        b = false;
                        break;
                    }
                    if (this.c.b(this.h, this.s.d)) {
                        b = false;
                        break;
                    }
                    break;
                }
                case 2: {
                    final cj a = this.s.a();
                    if (this.f.p(a).c().t() == arm.a) {
                        break;
                    }
                    final int n = (h != null) ? h.b : 0;
                    if (this.c.a(this.h, this.f, h, a, this.s.b, this.s.c)) {
                        b = false;
                        this.h.bw();
                    }
                    if (h == null) {
                        return;
                    }
                    if (h.b == 0) {
                        this.h.bi.a[this.h.bi.c] = null;
                        break;
                    }
                    if (h.b != n || this.c.h()) {
                        this.o.c.b();
                        break;
                    }
                    break;
                }
            }
        }
        if (b) {
            final zx h2 = this.h.bi.h();
            if (h2 != null && this.c.a(this.h, this.f, h2)) {
                this.o.c.c();
            }
        }
    }
    
    public void q() {
        try {
            this.T = !this.T;
            this.t.s = this.T;
            if (this.T) {
                this.au();
                this.d = Display.getDisplayMode().getWidth();
                this.e = Display.getDisplayMode().getHeight();
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            }
            else {
                Display.setDisplayMode(new DisplayMode(this.ah, this.ai));
                this.d = this.ah;
                this.e = this.ai;
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            }
            if (this.m != null) {
                this.a(this.d, this.e);
            }
            else {
                this.ay();
            }
            Display.setFullscreen(this.T);
            Display.setVSyncEnabled(this.t.t);
            this.h();
        }
        catch (Exception throwable) {
            ave.K.error("Couldn't toggle fullscreen", throwable);
        }
    }
    
    private void a(final int \u2603, final int \u2603) {
        this.d = Math.max(1, \u2603);
        this.e = Math.max(1, \u2603);
        if (this.m != null) {
            final avr avr = new avr(this);
            this.m.b(this, avr.a(), avr.b());
        }
        this.n = new avi(this);
        this.ay();
    }
    
    private void ay() {
        this.aF.a(this.d, this.e);
        if (this.o != null) {
            this.o.a(this.d, this.e);
        }
    }
    
    public bpv r() {
        return this.aI;
    }
    
    public void s() {
        if (this.ap > 0) {
            --this.ap;
        }
        this.A.a("gui");
        if (!this.af) {
            this.q.c();
        }
        this.A.b();
        this.o.a(1.0f);
        this.A.a("gameMode");
        if (!this.af && this.f != null) {
            this.c.e();
        }
        this.A.c("textures");
        if (!this.af) {
            this.R.e();
        }
        if (this.m == null && this.h != null) {
            if (this.h.bn() <= 0.0f) {
                this.a((axu)null);
            }
            else if (this.h.bJ() && this.f != null) {
                this.a(new axk());
            }
        }
        else if (this.m != null && this.m instanceof axk && !this.h.bJ()) {
            this.a((axu)null);
        }
        if (this.m != null) {
            this.ag = 10000;
        }
        if (this.m != null) {
            try {
                this.m.p();
            }
            catch (Throwable \u2603) {
                final b b = b.a(\u2603, "Updating screen events");
                final c c = b.a("Affected screen");
                c.a("Screen name", new Callable<String>() {
                    public String a() throws Exception {
                        return ave.this.m.getClass().getCanonicalName();
                    }
                });
                throw new e(b);
            }
            if (this.m != null) {
                try {
                    this.m.e();
                }
                catch (Throwable \u2603) {
                    final b b = b.a(\u2603, "Ticking screen");
                    final c c = b.a("Affected screen");
                    c.a("Screen name", new Callable<String>() {
                        public String a() throws Exception {
                            return ave.this.m.getClass().getCanonicalName();
                        }
                    });
                    throw new e(b);
                }
            }
        }
        if (this.m == null || this.m.p) {
            this.A.c("mouse");
            while (Mouse.next()) {
                final int i = Mouse.getEventButton();
                avb.a(i - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    if (this.h.v() && i == 2) {
                        this.q.g().b();
                    }
                    else {
                        avb.a(i - 100);
                    }
                }
                final long n = J() - this.x;
                if (n > 200L) {
                    continue;
                }
                int eventDWheel = Mouse.getEventDWheel();
                if (eventDWheel != 0) {
                    if (this.h.v()) {
                        eventDWheel = ((eventDWheel < 0) ? -1 : 1);
                        if (this.q.g().a()) {
                            this.q.g().b(-eventDWheel);
                        }
                        else {
                            final float a = ns.a(this.h.bA.a() + eventDWheel * 0.005f, 0.0f, 0.2f);
                            this.h.bA.a(a);
                        }
                    }
                    else {
                        this.h.bi.d(eventDWheel);
                    }
                }
                if (this.m == null) {
                    if (this.w || !Mouse.getEventButtonState()) {
                        continue;
                    }
                    this.n();
                }
                else {
                    if (this.m == null) {
                        continue;
                    }
                    this.m.k();
                }
            }
            if (this.ag > 0) {
                --this.ag;
            }
            this.A.c("keyboard");
            while (Keyboard.next()) {
                final int i = (Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + '\u0100') : Keyboard.getEventKey();
                avb.a(i, Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    avb.a(i);
                }
                if (this.ax > 0L) {
                    if (J() - this.ax >= 6000L) {
                        throw new e(new b("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                        this.ax = -1L;
                    }
                }
                else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
                    this.ax = J();
                }
                this.Z();
                if (Keyboard.getEventKeyState()) {
                    if (i == 62 && this.o != null) {
                        this.o.c();
                    }
                    if (this.m != null) {
                        this.m.l();
                    }
                    else {
                        if (i == 1) {
                            this.p();
                        }
                        if (i == 32 && Keyboard.isKeyDown(61) && this.q != null) {
                            this.q.d().a();
                        }
                        if (i == 31 && Keyboard.isKeyDown(61)) {
                            this.e();
                        }
                        if (i != 17 || Keyboard.isKeyDown(61)) {}
                        if (i != 18 || Keyboard.isKeyDown(61)) {}
                        if (i != 47 || Keyboard.isKeyDown(61)) {}
                        if (i != 38 || Keyboard.isKeyDown(61)) {}
                        if (i != 22 || Keyboard.isKeyDown(61)) {}
                        if (i == 20 && Keyboard.isKeyDown(61)) {
                            this.e();
                        }
                        if (i == 33 && Keyboard.isKeyDown(61)) {
                            this.t.a(avh.a.f, axu.r() ? -1 : 1);
                        }
                        if (i == 30 && Keyboard.isKeyDown(61)) {
                            this.g.a();
                        }
                        if (i == 35 && Keyboard.isKeyDown(61)) {
                            this.t.y = !this.t.y;
                            this.t.b();
                        }
                        if (i == 48 && Keyboard.isKeyDown(61)) {
                            this.aa.b(!this.aa.b());
                        }
                        if (i == 25 && Keyboard.isKeyDown(61)) {
                            this.t.z = !this.t.z;
                            this.t.b();
                        }
                        if (i == 59) {
                            this.t.az = !this.t.az;
                        }
                        if (i == 61) {
                            this.t.aB = !this.t.aB;
                            this.t.aC = axu.r();
                            this.t.aD = axu.s();
                        }
                        if (this.t.an.f()) {
                            final avh t = this.t;
                            ++t.aA;
                            if (this.t.aA > 2) {
                                this.t.aA = 0;
                            }
                            if (this.t.aA == 0) {
                                this.o.a(this.ac());
                            }
                            else if (this.t.aA == 1) {
                                this.o.a((pk)null);
                            }
                            this.g.m();
                        }
                        if (this.t.ao.f()) {
                            this.t.aF = !this.t.aF;
                        }
                    }
                    if (!this.t.aB || !this.t.aC) {
                        continue;
                    }
                    if (i == 11) {
                        this.b(0);
                    }
                    for (int j = 0; j < 9; ++j) {
                        if (i == 2 + j) {
                            this.b(j + 1);
                        }
                    }
                }
            }
            for (int i = 0; i < 9; ++i) {
                if (this.t.av[i].f()) {
                    if (this.h.v()) {
                        this.q.g().a(i);
                    }
                    else {
                        this.h.bi.c = i;
                    }
                }
            }
            final boolean b2 = this.t.m != wn.b.c;
            while (this.t.ae.f()) {
                if (this.c.j()) {
                    this.h.u();
                }
                else {
                    this.u().a(new ig(ig.a.c));
                    this.a(new azc(this.h));
                }
            }
            while (this.t.ag.f()) {
                if (!this.h.v()) {
                    this.h.a(axu.q());
                }
            }
            while (this.t.aj.f() && b2) {
                this.a(new awv());
            }
            if (this.m == null && this.t.al.f() && b2) {
                this.a(new awv("/"));
            }
            if (this.h.bS()) {
                if (!this.t.af.d()) {
                    this.c.c(this.h);
                }
                while (this.t.ah.f()) {}
                while (this.t.af.f()) {}
                while (this.t.ai.f()) {}
            }
            else {
                while (this.t.ah.f()) {
                    this.aw();
                }
                while (this.t.af.f()) {
                    this.ax();
                }
                while (this.t.ai.f()) {
                    this.az();
                }
            }
            if (this.t.af.d() && this.ap == 0 && !this.h.bS()) {
                this.ax();
            }
            this.b(this.m == null && this.t.ah.d() && this.w);
        }
        if (this.f != null) {
            if (this.h != null) {
                ++this.as;
                if (this.as == 30) {
                    this.as = 0;
                    this.f.h(this.h);
                }
            }
            this.A.c("gameRenderer");
            if (!this.af) {
                this.o.e();
            }
            this.A.c("levelRenderer");
            if (!this.af) {
                this.g.j();
            }
            this.A.c("level");
            if (!this.af) {
                if (this.f.ac() > 0) {
                    this.f.d(this.f.ac() - 1);
                }
                this.f.i();
            }
        }
        else if (this.o.a()) {
            this.o.b();
        }
        if (!this.af) {
            this.aI.c();
            this.aH.c();
        }
        if (this.f != null) {
            if (!this.af) {
                this.f.a(this.f.aa() != oj.a, true);
                try {
                    this.f.c();
                }
                catch (Throwable \u2603) {
                    final b b = b.a(\u2603, "Exception in world tick");
                    if (this.f == null) {
                        final c c = b.a("Affected level");
                        c.a("Problem", "Level is null!");
                    }
                    else {
                        this.f.a(b);
                    }
                    throw new e(b);
                }
            }
            this.A.c("animateTick");
            if (!this.af && this.f != null) {
                this.f.b(ns.c(this.h.s), ns.c(this.h.t), ns.c(this.h.u));
            }
            this.A.c("particles");
            if (!this.af) {
                this.j.a();
            }
        }
        else if (this.av != null) {
            this.A.c("pendingConnection");
            this.av.a();
        }
        this.A.b();
        this.x = J();
    }
    
    public void a(final String \u2603, final String \u2603, adp \u2603) {
        this.a((bdb)null);
        System.gc();
        final atp a = this.an.a(\u2603, false);
        ato d = a.d();
        if (d == null && \u2603 != null) {
            d = new ato(\u2603, \u2603);
            a.a(d);
        }
        if (\u2603 == null) {
            \u2603 = new adp(d);
        }
        try {
            (this.aj = new bpo(this, \u2603, \u2603, \u2603)).D();
            this.aw = true;
        }
        catch (Throwable \u26032) {
            final b a2 = b.a(\u26032, "Starting integrated server");
            final c a3 = a2.a("Starting integrated server");
            a3.a("Level ID", \u2603);
            a3.a("Level Name", \u2603);
            throw new e(a2);
        }
        this.n.a(bnq.a("menu.loadingLevel", new Object[0]));
        while (!this.aj.ar()) {
            final String j = this.aj.j();
            if (j != null) {
                this.n.c(bnq.a(j, new Object[0]));
            }
            else {
                this.n.c("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException ex) {}
        }
        this.a((axu)null);
        final SocketAddress a4 = this.aj.aq().a();
        final ek a5 = ek.a(a4);
        a5.a(new bcx(a5, this, null));
        a5.a(new jc(47, a4.toString(), 0, el.d));
        a5.a(new jl(this.L().e()));
        this.av = a5;
    }
    
    public void a(final bdb \u2603) {
        this.a(\u2603, "");
    }
    
    public void a(final bdb \u2603, final String \u2603) {
        if (\u2603 == null) {
            final bcy u = this.u();
            if (u != null) {
                u.b();
            }
            if (this.aj != null && this.aj.O()) {
                this.aj.w();
                this.aj.a();
            }
            this.aj = null;
            this.p.b();
            this.o.k().a();
        }
        this.ad = null;
        this.av = null;
        if (this.n != null) {
            this.n.b(\u2603);
            this.n.c("");
        }
        if (\u2603 == null && this.f != null) {
            this.aC.f();
            this.q.i();
            this.a((bde)null);
            this.aw = false;
        }
        this.aH.b();
        if ((this.f = \u2603) != null) {
            if (this.g != null) {
                this.g.a(\u2603);
            }
            if (this.j != null) {
                this.j.a(\u2603);
            }
            if (this.h == null) {
                this.h = this.c.a(\u2603, new nb());
                this.c.b(this.h);
            }
            this.h.I();
            \u2603.d(this.h);
            this.h.b = new bev(this.t);
            this.c.a(this.h);
            this.ad = this.h;
        }
        else {
            this.an.d();
            this.h = null;
        }
        System.gc();
        this.x = 0L;
    }
    
    public void a(final int \u2603) {
        this.f.g();
        this.f.a();
        int f = 0;
        String w = null;
        if (this.h != null) {
            f = this.h.F();
            this.f.e(this.h);
            w = this.h.w();
        }
        this.ad = null;
        final bew h = this.h;
        this.h = this.c.a(this.f, (this.h == null) ? new nb() : this.h.x());
        this.h.H().a(h.H().c());
        this.h.am = \u2603;
        this.ad = this.h;
        this.h.I();
        this.h.f(w);
        this.f.d(this.h);
        this.c.b(this.h);
        this.h.b = new bev(this.t);
        this.h.d(f);
        this.c.a(this.h);
        this.h.k(h.cq());
        if (this.m instanceof axe) {
            this.a((axu)null);
        }
    }
    
    public final boolean t() {
        return this.au;
    }
    
    public bcy u() {
        if (this.h != null) {
            return this.h.a;
        }
        return null;
    }
    
    public static boolean v() {
        return ave.S == null || !ave.S.t.az;
    }
    
    public static boolean w() {
        return ave.S != null && ave.S.t.i;
    }
    
    public static boolean x() {
        return ave.S != null && ave.S.t.j != 0;
    }
    
    private void az() {
        if (this.s == null) {
            return;
        }
        final boolean d = this.h.bA.d;
        int \u2603 = 0;
        boolean k = false;
        akw s = null;
        zw \u26032;
        if (this.s.a == auh.a.b) {
            final cj a = this.s.a();
            final afh c = this.f.p(a).c();
            if (c.t() == arm.a) {
                return;
            }
            \u26032 = c.c(this.f, a);
            if (\u26032 == null) {
                return;
            }
            if (d && axu.q()) {
                s = this.f.s(a);
            }
            final afh afh = (\u26032 instanceof yo && !c.M()) ? afh.a(\u26032) : c;
            \u2603 = afh.j(this.f, a);
            k = \u26032.k();
        }
        else {
            if (this.s.a != auh.a.c || this.s.d == null || !d) {
                return;
            }
            if (this.s.d instanceof uq) {
                \u26032 = zy.an;
            }
            else if (this.s.d instanceof up) {
                \u26032 = zy.cn;
            }
            else if (this.s.d instanceof uo) {
                final uo uo = (uo)this.s.d;
                final zx \u26033 = uo.o();
                if (\u26033 == null) {
                    \u26032 = zy.bP;
                }
                else {
                    \u26032 = \u26033.b();
                    \u2603 = \u26033.i();
                    k = true;
                }
            }
            else if (this.s.d instanceof va) {
                final va va = (va)this.s.d;
                switch (ave$10.b[va.s().ordinal()]) {
                    case 1: {
                        \u26032 = zy.aO;
                        break;
                    }
                    case 2: {
                        \u26032 = zy.aN;
                        break;
                    }
                    case 3: {
                        \u26032 = zy.ch;
                        break;
                    }
                    case 4: {
                        \u26032 = zy.ci;
                        break;
                    }
                    case 5: {
                        \u26032 = zy.cp;
                        break;
                    }
                    default: {
                        \u26032 = zy.az;
                        break;
                    }
                }
            }
            else if (this.s.d instanceof ux) {
                \u26032 = zy.aE;
            }
            else if (this.s.d instanceof um) {
                \u26032 = zy.cj;
            }
            else {
                \u26032 = zy.bJ;
                \u2603 = pm.a(this.s.d);
                k = true;
                if (!pm.a.containsKey(\u2603)) {
                    return;
                }
            }
        }
        final wm bi = this.h.bi;
        if (s == null) {
            bi.a(\u26032, \u2603, k, d);
        }
        else {
            final zx \u26033 = this.a(\u26032, \u2603, s);
            bi.a(bi.c, \u26033);
        }
        if (d) {
            final int \u26034 = this.h.bj.c.size() - 9 + bi.c;
            this.c.a(bi.a(bi.c), \u26034);
        }
    }
    
    private zx a(final zw \u2603, final int \u2603, final akw \u2603) {
        final zx zx = new zx(\u2603, 1, \u2603);
        final dn dn = new dn();
        \u2603.b(dn);
        if (\u2603 == zy.bX && dn.c("Owner")) {
            final dn m = dn.m("Owner");
            final dn \u26032 = new dn();
            \u26032.a("SkullOwner", m);
            zx.d(\u26032);
            return zx;
        }
        zx.a("BlockEntityTag", dn);
        final dn m = new dn();
        final du \u26033 = new du();
        \u26033.a(new ea("(+NBT)"));
        m.a("Lore", \u26033);
        zx.a("display", m);
        return zx;
    }
    
    public b b(final b \u2603) {
        \u2603.g().a("Launched Version", new Callable<String>() {
            public String a() {
                return ave.this.al;
            }
        });
        \u2603.g().a("LWJGL", new Callable<String>() {
            public String a() {
                return Sys.getVersion();
            }
        });
        \u2603.g().a("OpenGL", new Callable<String>() {
            public String a() {
                return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
            }
        });
        \u2603.g().a("GL Caps", new Callable<String>() {
            public String a() {
                return bqs.c();
            }
        });
        \u2603.g().a("Using VBOs", new Callable<String>() {
            public String a() {
                return ave.this.t.u ? "Yes" : "No";
            }
        });
        \u2603.g().a("Is Modded", new Callable<String>() {
            public String a() throws Exception {
                final String clientModName = ClientBrandRetriever.getClientModName();
                if (!clientModName.equals("vanilla")) {
                    return "Definitely; Client brand changed to '" + clientModName + "'";
                }
                if (ave.class.getSigners() == null) {
                    return "Very likely; Jar signature invalidated";
                }
                return "Probably not. Jar signature remains and client brand is untouched.";
            }
        });
        \u2603.g().a("Type", new Callable<String>() {
            public String a() throws Exception {
                return "Client (map_client.txt)";
            }
        });
        \u2603.g().a("Resource Packs", new Callable<String>() {
            public String a() throws Exception {
                final StringBuilder sb = new StringBuilder();
                for (final String str : ave.this.t.k) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    if (ave.this.t.l.contains(str)) {
                        sb.append(" (incompatible)");
                    }
                }
                return sb.toString();
            }
        });
        \u2603.g().a("Current Language", new Callable<String>() {
            public String a() throws Exception {
                return ave.this.aD.c().toString();
            }
        });
        \u2603.g().a("Profiler Position", new Callable<String>() {
            public String a() throws Exception {
                return ave.this.A.a ? ave.this.A.c() : "N/A (disabled)";
            }
        });
        \u2603.g().a("CPU", new Callable<String>() {
            public String a() {
                return bqs.j();
            }
        });
        if (this.f != null) {
            this.f.a(\u2603);
        }
        return \u2603;
    }
    
    public static ave A() {
        return ave.S;
    }
    
    public ListenableFuture<Object> B() {
        return this.a(new Runnable() {
            @Override
            public void run() {
                ave.this.e();
            }
        });
    }
    
    @Override
    public void a(final or \u2603) {
        \u2603.a("fps", ave.ao);
        \u2603.a("vsync_enabled", this.t.t);
        \u2603.a("display_frequency", Display.getDisplayMode().getFrequency());
        \u2603.a("display_type", this.T ? "fullscreen" : "windowed");
        \u2603.a("run_time", (MinecraftServer.az() - \u2603.g()) / 60L * 1000L);
        \u2603.a("current_action", this.aA());
        final String \u26032 = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big";
        \u2603.a("endianness", \u26032);
        \u2603.a("resource_packs", this.aC.c().size());
        int n = 0;
        for (final bnm.a a : this.aC.c()) {
            \u2603.a("resource_pack[" + n++ + "]", a.d());
        }
        if (this.aj != null && this.aj.av() != null) {
            \u2603.a("snooper_partner", this.aj.av().f());
        }
    }
    
    private String aA() {
        if (this.aj != null) {
            if (this.aj.b()) {
                return "hosting_lan";
            }
            return "singleplayer";
        }
        else {
            if (this.Q == null) {
                return "out_of_game";
            }
            if (this.Q.d()) {
                return "playing_lan";
            }
            return "multiplayer";
        }
    }
    
    @Override
    public void b(final or \u2603) {
        \u2603.b("opengl_version", GL11.glGetString(7938));
        \u2603.b("opengl_vendor", GL11.glGetString(7936));
        \u2603.b("client_brand", ClientBrandRetriever.getClientModName());
        \u2603.b("launched_version", this.al);
        final ContextCapabilities capabilities = GLContext.getCapabilities();
        \u2603.b("gl_caps[ARB_arrays_of_arrays]", capabilities.GL_ARB_arrays_of_arrays);
        \u2603.b("gl_caps[ARB_base_instance]", capabilities.GL_ARB_base_instance);
        \u2603.b("gl_caps[ARB_blend_func_extended]", capabilities.GL_ARB_blend_func_extended);
        \u2603.b("gl_caps[ARB_clear_buffer_object]", capabilities.GL_ARB_clear_buffer_object);
        \u2603.b("gl_caps[ARB_color_buffer_float]", capabilities.GL_ARB_color_buffer_float);
        \u2603.b("gl_caps[ARB_compatibility]", capabilities.GL_ARB_compatibility);
        \u2603.b("gl_caps[ARB_compressed_texture_pixel_storage]", capabilities.GL_ARB_compressed_texture_pixel_storage);
        \u2603.b("gl_caps[ARB_compute_shader]", capabilities.GL_ARB_compute_shader);
        \u2603.b("gl_caps[ARB_copy_buffer]", capabilities.GL_ARB_copy_buffer);
        \u2603.b("gl_caps[ARB_copy_image]", capabilities.GL_ARB_copy_image);
        \u2603.b("gl_caps[ARB_depth_buffer_float]", capabilities.GL_ARB_depth_buffer_float);
        \u2603.b("gl_caps[ARB_compute_shader]", capabilities.GL_ARB_compute_shader);
        \u2603.b("gl_caps[ARB_copy_buffer]", capabilities.GL_ARB_copy_buffer);
        \u2603.b("gl_caps[ARB_copy_image]", capabilities.GL_ARB_copy_image);
        \u2603.b("gl_caps[ARB_depth_buffer_float]", capabilities.GL_ARB_depth_buffer_float);
        \u2603.b("gl_caps[ARB_depth_clamp]", capabilities.GL_ARB_depth_clamp);
        \u2603.b("gl_caps[ARB_depth_texture]", capabilities.GL_ARB_depth_texture);
        \u2603.b("gl_caps[ARB_draw_buffers]", capabilities.GL_ARB_draw_buffers);
        \u2603.b("gl_caps[ARB_draw_buffers_blend]", capabilities.GL_ARB_draw_buffers_blend);
        \u2603.b("gl_caps[ARB_draw_elements_base_vertex]", capabilities.GL_ARB_draw_elements_base_vertex);
        \u2603.b("gl_caps[ARB_draw_indirect]", capabilities.GL_ARB_draw_indirect);
        \u2603.b("gl_caps[ARB_draw_instanced]", capabilities.GL_ARB_draw_instanced);
        \u2603.b("gl_caps[ARB_explicit_attrib_location]", capabilities.GL_ARB_explicit_attrib_location);
        \u2603.b("gl_caps[ARB_explicit_uniform_location]", capabilities.GL_ARB_explicit_uniform_location);
        \u2603.b("gl_caps[ARB_fragment_layer_viewport]", capabilities.GL_ARB_fragment_layer_viewport);
        \u2603.b("gl_caps[ARB_fragment_program]", capabilities.GL_ARB_fragment_program);
        \u2603.b("gl_caps[ARB_fragment_shader]", capabilities.GL_ARB_fragment_shader);
        \u2603.b("gl_caps[ARB_fragment_program_shadow]", capabilities.GL_ARB_fragment_program_shadow);
        \u2603.b("gl_caps[ARB_framebuffer_object]", capabilities.GL_ARB_framebuffer_object);
        \u2603.b("gl_caps[ARB_framebuffer_sRGB]", capabilities.GL_ARB_framebuffer_sRGB);
        \u2603.b("gl_caps[ARB_geometry_shader4]", capabilities.GL_ARB_geometry_shader4);
        \u2603.b("gl_caps[ARB_gpu_shader5]", capabilities.GL_ARB_gpu_shader5);
        \u2603.b("gl_caps[ARB_half_float_pixel]", capabilities.GL_ARB_half_float_pixel);
        \u2603.b("gl_caps[ARB_half_float_vertex]", capabilities.GL_ARB_half_float_vertex);
        \u2603.b("gl_caps[ARB_instanced_arrays]", capabilities.GL_ARB_instanced_arrays);
        \u2603.b("gl_caps[ARB_map_buffer_alignment]", capabilities.GL_ARB_map_buffer_alignment);
        \u2603.b("gl_caps[ARB_map_buffer_range]", capabilities.GL_ARB_map_buffer_range);
        \u2603.b("gl_caps[ARB_multisample]", capabilities.GL_ARB_multisample);
        \u2603.b("gl_caps[ARB_multitexture]", capabilities.GL_ARB_multitexture);
        \u2603.b("gl_caps[ARB_occlusion_query2]", capabilities.GL_ARB_occlusion_query2);
        \u2603.b("gl_caps[ARB_pixel_buffer_object]", capabilities.GL_ARB_pixel_buffer_object);
        \u2603.b("gl_caps[ARB_seamless_cube_map]", capabilities.GL_ARB_seamless_cube_map);
        \u2603.b("gl_caps[ARB_shader_objects]", capabilities.GL_ARB_shader_objects);
        \u2603.b("gl_caps[ARB_shader_stencil_export]", capabilities.GL_ARB_shader_stencil_export);
        \u2603.b("gl_caps[ARB_shader_texture_lod]", capabilities.GL_ARB_shader_texture_lod);
        \u2603.b("gl_caps[ARB_shadow]", capabilities.GL_ARB_shadow);
        \u2603.b("gl_caps[ARB_shadow_ambient]", capabilities.GL_ARB_shadow_ambient);
        \u2603.b("gl_caps[ARB_stencil_texturing]", capabilities.GL_ARB_stencil_texturing);
        \u2603.b("gl_caps[ARB_sync]", capabilities.GL_ARB_sync);
        \u2603.b("gl_caps[ARB_tessellation_shader]", capabilities.GL_ARB_tessellation_shader);
        \u2603.b("gl_caps[ARB_texture_border_clamp]", capabilities.GL_ARB_texture_border_clamp);
        \u2603.b("gl_caps[ARB_texture_buffer_object]", capabilities.GL_ARB_texture_buffer_object);
        \u2603.b("gl_caps[ARB_texture_cube_map]", capabilities.GL_ARB_texture_cube_map);
        \u2603.b("gl_caps[ARB_texture_cube_map_array]", capabilities.GL_ARB_texture_cube_map_array);
        \u2603.b("gl_caps[ARB_texture_non_power_of_two]", capabilities.GL_ARB_texture_non_power_of_two);
        \u2603.b("gl_caps[ARB_uniform_buffer_object]", capabilities.GL_ARB_uniform_buffer_object);
        \u2603.b("gl_caps[ARB_vertex_blend]", capabilities.GL_ARB_vertex_blend);
        \u2603.b("gl_caps[ARB_vertex_buffer_object]", capabilities.GL_ARB_vertex_buffer_object);
        \u2603.b("gl_caps[ARB_vertex_program]", capabilities.GL_ARB_vertex_program);
        \u2603.b("gl_caps[ARB_vertex_shader]", capabilities.GL_ARB_vertex_shader);
        \u2603.b("gl_caps[EXT_bindable_uniform]", capabilities.GL_EXT_bindable_uniform);
        \u2603.b("gl_caps[EXT_blend_equation_separate]", capabilities.GL_EXT_blend_equation_separate);
        \u2603.b("gl_caps[EXT_blend_func_separate]", capabilities.GL_EXT_blend_func_separate);
        \u2603.b("gl_caps[EXT_blend_minmax]", capabilities.GL_EXT_blend_minmax);
        \u2603.b("gl_caps[EXT_blend_subtract]", capabilities.GL_EXT_blend_subtract);
        \u2603.b("gl_caps[EXT_draw_instanced]", capabilities.GL_EXT_draw_instanced);
        \u2603.b("gl_caps[EXT_framebuffer_multisample]", capabilities.GL_EXT_framebuffer_multisample);
        \u2603.b("gl_caps[EXT_framebuffer_object]", capabilities.GL_EXT_framebuffer_object);
        \u2603.b("gl_caps[EXT_framebuffer_sRGB]", capabilities.GL_EXT_framebuffer_sRGB);
        \u2603.b("gl_caps[EXT_geometry_shader4]", capabilities.GL_EXT_geometry_shader4);
        \u2603.b("gl_caps[EXT_gpu_program_parameters]", capabilities.GL_EXT_gpu_program_parameters);
        \u2603.b("gl_caps[EXT_gpu_shader4]", capabilities.GL_EXT_gpu_shader4);
        \u2603.b("gl_caps[EXT_multi_draw_arrays]", capabilities.GL_EXT_multi_draw_arrays);
        \u2603.b("gl_caps[EXT_packed_depth_stencil]", capabilities.GL_EXT_packed_depth_stencil);
        \u2603.b("gl_caps[EXT_paletted_texture]", capabilities.GL_EXT_paletted_texture);
        \u2603.b("gl_caps[EXT_rescale_normal]", capabilities.GL_EXT_rescale_normal);
        \u2603.b("gl_caps[EXT_separate_shader_objects]", capabilities.GL_EXT_separate_shader_objects);
        \u2603.b("gl_caps[EXT_shader_image_load_store]", capabilities.GL_EXT_shader_image_load_store);
        \u2603.b("gl_caps[EXT_shadow_funcs]", capabilities.GL_EXT_shadow_funcs);
        \u2603.b("gl_caps[EXT_shared_texture_palette]", capabilities.GL_EXT_shared_texture_palette);
        \u2603.b("gl_caps[EXT_stencil_clear_tag]", capabilities.GL_EXT_stencil_clear_tag);
        \u2603.b("gl_caps[EXT_stencil_two_side]", capabilities.GL_EXT_stencil_two_side);
        \u2603.b("gl_caps[EXT_stencil_wrap]", capabilities.GL_EXT_stencil_wrap);
        \u2603.b("gl_caps[EXT_texture_3d]", capabilities.GL_EXT_texture_3d);
        \u2603.b("gl_caps[EXT_texture_array]", capabilities.GL_EXT_texture_array);
        \u2603.b("gl_caps[EXT_texture_buffer_object]", capabilities.GL_EXT_texture_buffer_object);
        \u2603.b("gl_caps[EXT_texture_integer]", capabilities.GL_EXT_texture_integer);
        \u2603.b("gl_caps[EXT_texture_lod_bias]", capabilities.GL_EXT_texture_lod_bias);
        \u2603.b("gl_caps[EXT_texture_sRGB]", capabilities.GL_EXT_texture_sRGB);
        \u2603.b("gl_caps[EXT_vertex_shader]", capabilities.GL_EXT_vertex_shader);
        \u2603.b("gl_caps[EXT_vertex_weighting]", capabilities.GL_EXT_vertex_weighting);
        \u2603.b("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger(35658));
        GL11.glGetError();
        \u2603.b("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger(35657));
        GL11.glGetError();
        \u2603.b("gl_caps[gl_max_vertex_attribs]", GL11.glGetInteger(34921));
        GL11.glGetError();
        \u2603.b("gl_caps[gl_max_vertex_texture_image_units]", GL11.glGetInteger(35660));
        GL11.glGetError();
        \u2603.b("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger(34930));
        GL11.glGetError();
        \u2603.b("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger(35071));
        GL11.glGetError();
        \u2603.b("gl_max_texture_size", C());
    }
    
    public static int C() {
        for (int i = 16384; i > 0; i >>= 1) {
            GL11.glTexImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (ByteBuffer)null);
            final int glGetTexLevelParameteri = GL11.glGetTexLevelParameteri(32868, 0, 4096);
            if (glGetTexLevelParameteri != 0) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean ad() {
        return this.t.r;
    }
    
    public void a(final bde \u2603) {
        this.Q = \u2603;
    }
    
    public bde D() {
        return this.Q;
    }
    
    public boolean E() {
        return this.aw;
    }
    
    public boolean F() {
        return this.aw && this.aj != null;
    }
    
    public bpo G() {
        return this.aj;
    }
    
    public static void H() {
        if (ave.S == null) {
            return;
        }
        final bpo g = ave.S.G();
        if (g != null) {
            g.t();
        }
    }
    
    public or I() {
        return this.Z;
    }
    
    public static long J() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }
    
    public boolean K() {
        return this.T;
    }
    
    public avm L() {
        return this.ae;
    }
    
    public PropertyMap M() {
        return this.O;
    }
    
    public PropertyMap N() {
        if (this.P.isEmpty()) {
            final GameProfile fillProfileProperties = this.aa().fillProfileProperties(this.ae.e(), false);
            this.P.putAll(fillProfileProperties.getProperties());
        }
        return this.P;
    }
    
    public Proxy O() {
        return this.am;
    }
    
    public bmj P() {
        return this.R;
    }
    
    public bni Q() {
        return this.ay;
    }
    
    public bnm R() {
        return this.aC;
    }
    
    public bns S() {
        return this.aD;
    }
    
    public bmh T() {
        return this.aG;
    }
    
    public boolean U() {
        return this.at;
    }
    
    public boolean V() {
        return this.af;
    }
    
    public bpz W() {
        return this.aH;
    }
    
    public bpv.a X() {
        if (this.h == null) {
            return bpv.a.a;
        }
        if (this.h.o.t instanceof ann) {
            return bpv.a.e;
        }
        if (this.h.o.t instanceof anp) {
            if (bfc.c != null && bfc.b > 0) {
                return bpv.a.f;
            }
            return bpv.a.g;
        }
        else {
            if (this.h.bA.d && this.h.bA.c) {
                return bpv.a.c;
            }
            return bpv.a.b;
        }
    }
    
    public bqm Y() {
        return this.aE;
    }
    
    public void Z() {
        final int n = (Keyboard.getEventKey() == 0) ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
        if (n == 0 || Keyboard.isRepeatEvent()) {
            return;
        }
        if (this.m instanceof ayj && ((ayj)this.m).g > J() - 20L) {
            return;
        }
        if (Keyboard.getEventKeyState()) {
            if (n == this.t.ar.i()) {
                if (this.Y().k()) {
                    this.Y().r();
                }
                else if (this.Y().j()) {
                    this.a(new awy(new awx() {
                        @Override
                        public void a(final boolean \u2603, final int \u2603) {
                            if (\u2603) {
                                ave.this.Y().q();
                            }
                            ave.this.a((axu)null);
                        }
                    }, bnq.a("stream.confirm_start", new Object[0]), "", 0));
                }
                else if (!this.Y().A() || !this.Y().i()) {
                    baa.a(this.m);
                }
                else if (this.f != null) {
                    this.q.d().a(new fa("Not ready to start streaming yet!"));
                }
            }
            else if (n == this.t.as.i()) {
                if (this.Y().k()) {
                    if (this.Y().l()) {
                        this.Y().o();
                    }
                    else {
                        this.Y().n();
                    }
                }
            }
            else if (n == this.t.at.i()) {
                if (this.Y().k()) {
                    this.Y().m();
                }
            }
            else if (n == this.t.au.i()) {
                this.aE.a(true);
            }
            else if (n == this.t.ap.i()) {
                this.q();
            }
            else if (n == this.t.am.i()) {
                this.q.d().a(avj.a(this.v, this.d, this.e, this.aF));
            }
        }
        else if (n == this.t.au.i()) {
            this.aE.a(false);
        }
    }
    
    public MinecraftSessionService aa() {
        return this.aK;
    }
    
    public bnp ab() {
        return this.aL;
    }
    
    public pk ac() {
        return this.ad;
    }
    
    public void a(final pk \u2603) {
        this.ad = \u2603;
        this.o.a(\u2603);
    }
    
    public <V> ListenableFuture<V> a(final Callable<V> \u2603) {
        Validate.notNull(\u2603);
        if (!this.aJ()) {
            final ListenableFutureTask<V> create = ListenableFutureTask.create(\u2603);
            synchronized (this.aM) {
                this.aM.add(create);
            }
            return create;
        }
        try {
            return Futures.immediateFuture(\u2603.call());
        }
        catch (Exception ex) {
            return (ListenableFuture<V>)Futures.immediateFailedCheckedFuture(ex);
        }
    }
    
    @Override
    public ListenableFuture<Object> a(final Runnable \u2603) {
        Validate.notNull(\u2603);
        return this.a(Executors.callable(\u2603));
    }
    
    @Override
    public boolean aJ() {
        return Thread.currentThread() == this.aO;
    }
    
    public bgd ae() {
        return this.aQ;
    }
    
    public biu af() {
        return this.aa;
    }
    
    public bjh ag() {
        return this.ab;
    }
    
    public bfn ah() {
        return this.ac;
    }
    
    public static int ai() {
        return ave.ao;
    }
    
    public nh aj() {
        return this.y;
    }
    
    public static Map<String, String> ak() {
        final Map<String, String> hashMap = (Map<String, String>)Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", A().L().c());
        hashMap.put("X-Minecraft-UUID", A().L().b());
        hashMap.put("X-Minecraft-Version", "1.8.8");
        return hashMap;
    }
    
    public boolean al() {
        return this.X;
    }
    
    public void a(final boolean \u2603) {
        this.X = \u2603;
    }
    
    static {
        K = LogManager.getLogger();
        L = new jy("textures/gui/title/mojang.png");
        a = (g.a() == g.a.d);
        ave.b = new byte[10485760];
        M = Lists.newArrayList(new DisplayMode(2560, 1600), new DisplayMode(2880, 1800));
    }
}
