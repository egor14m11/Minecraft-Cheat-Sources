import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import org.lwjgl.opengl.Display;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class avh
{
    private static final Logger aO;
    private static final Gson aP;
    private static final ParameterizedType aQ;
    private static final String[] aR;
    private static final String[] aS;
    private static final String[] aT;
    private static final String[] aU;
    private static final String[] aV;
    private static final String[] aW;
    private static final String[] aX;
    private static final String[] aY;
    public float a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public List<String> k;
    public List<String> l;
    public wn.b m;
    public boolean n;
    public boolean o;
    public boolean p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    private final Set<wo> aZ;
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public int J;
    private Map<bpg, Float> ba;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public String R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public avb X;
    public avb Y;
    public avb Z;
    public avb aa;
    public avb ab;
    public avb ac;
    public avb ad;
    public avb ae;
    public avb af;
    public avb ag;
    public avb ah;
    public avb ai;
    public avb aj;
    public avb ak;
    public avb al;
    public avb am;
    public avb an;
    public avb ao;
    public avb ap;
    public avb aq;
    public avb ar;
    public avb as;
    public avb at;
    public avb au;
    public avb[] av;
    public avb[] aw;
    protected ave ax;
    private File bb;
    public oj ay;
    public boolean az;
    public int aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public String aE;
    public boolean aF;
    public boolean aG;
    public float aH;
    public float aI;
    public float aJ;
    public int aK;
    public int aL;
    public String aM;
    public boolean aN;
    
    public avh(final ave \u2603, final File \u2603) {
        this.a = 0.5f;
        this.c = -1;
        this.d = true;
        this.f = true;
        this.g = 120;
        this.h = 2;
        this.i = true;
        this.j = 2;
        this.k = (List<String>)Lists.newArrayList();
        this.l = (List<String>)Lists.newArrayList();
        this.m = wn.b.a;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = 1.0f;
        this.r = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.w = false;
        this.z = true;
        this.aZ = Sets.newHashSet(wo.values());
        this.D = true;
        this.E = 1.0f;
        this.F = 1.0f;
        this.G = 0.44366196f;
        this.H = 1.0f;
        this.I = true;
        this.J = 4;
        this.ba = (Map<bpg, Float>)Maps.newEnumMap(bpg.class);
        this.K = 0.5f;
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 0.5412844f;
        this.O = 0.31690142f;
        this.P = 1;
        this.Q = true;
        this.R = "";
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = true;
        this.W = true;
        this.X = new avb("key.forward", 17, "key.categories.movement");
        this.Y = new avb("key.left", 30, "key.categories.movement");
        this.Z = new avb("key.back", 31, "key.categories.movement");
        this.aa = new avb("key.right", 32, "key.categories.movement");
        this.ab = new avb("key.jump", 57, "key.categories.movement");
        this.ac = new avb("key.sneak", 42, "key.categories.movement");
        this.ad = new avb("key.sprint", 29, "key.categories.movement");
        this.ae = new avb("key.inventory", 18, "key.categories.inventory");
        this.af = new avb("key.use", -99, "key.categories.gameplay");
        this.ag = new avb("key.drop", 16, "key.categories.gameplay");
        this.ah = new avb("key.attack", -100, "key.categories.gameplay");
        this.ai = new avb("key.pickItem", -98, "key.categories.gameplay");
        this.aj = new avb("key.chat", 20, "key.categories.multiplayer");
        this.ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
        this.al = new avb("key.command", 53, "key.categories.multiplayer");
        this.am = new avb("key.screenshot", 60, "key.categories.misc");
        this.an = new avb("key.togglePerspective", 63, "key.categories.misc");
        this.ao = new avb("key.smoothCamera", 0, "key.categories.misc");
        this.ap = new avb("key.fullscreen", 87, "key.categories.misc");
        this.aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
        this.ar = new avb("key.streamStartStop", 64, "key.categories.stream");
        this.as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
        this.at = new avb("key.streamCommercial", 0, "key.categories.stream");
        this.au = new avb("key.streamToggleMic", 0, "key.categories.stream");
        this.av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
        this.aw = ArrayUtils.addAll(new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, this.av);
        this.ay = oj.c;
        this.aE = "";
        this.aH = 70.0f;
        this.aM = "en_US";
        this.aN = false;
        this.ax = \u2603;
        this.bb = new File(\u2603, "options.txt");
        if (\u2603.U() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            avh.a.f.a(32.0f);
        }
        else {
            avh.a.f.a(16.0f);
        }
        this.c = (\u2603.U() ? 12 : 8);
        this.a();
    }
    
    public avh() {
        this.a = 0.5f;
        this.c = -1;
        this.d = true;
        this.f = true;
        this.g = 120;
        this.h = 2;
        this.i = true;
        this.j = 2;
        this.k = (List<String>)Lists.newArrayList();
        this.l = (List<String>)Lists.newArrayList();
        this.m = wn.b.a;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = 1.0f;
        this.r = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.w = false;
        this.z = true;
        this.aZ = Sets.newHashSet(wo.values());
        this.D = true;
        this.E = 1.0f;
        this.F = 1.0f;
        this.G = 0.44366196f;
        this.H = 1.0f;
        this.I = true;
        this.J = 4;
        this.ba = (Map<bpg, Float>)Maps.newEnumMap(bpg.class);
        this.K = 0.5f;
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 0.5412844f;
        this.O = 0.31690142f;
        this.P = 1;
        this.Q = true;
        this.R = "";
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = true;
        this.W = true;
        this.X = new avb("key.forward", 17, "key.categories.movement");
        this.Y = new avb("key.left", 30, "key.categories.movement");
        this.Z = new avb("key.back", 31, "key.categories.movement");
        this.aa = new avb("key.right", 32, "key.categories.movement");
        this.ab = new avb("key.jump", 57, "key.categories.movement");
        this.ac = new avb("key.sneak", 42, "key.categories.movement");
        this.ad = new avb("key.sprint", 29, "key.categories.movement");
        this.ae = new avb("key.inventory", 18, "key.categories.inventory");
        this.af = new avb("key.use", -99, "key.categories.gameplay");
        this.ag = new avb("key.drop", 16, "key.categories.gameplay");
        this.ah = new avb("key.attack", -100, "key.categories.gameplay");
        this.ai = new avb("key.pickItem", -98, "key.categories.gameplay");
        this.aj = new avb("key.chat", 20, "key.categories.multiplayer");
        this.ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
        this.al = new avb("key.command", 53, "key.categories.multiplayer");
        this.am = new avb("key.screenshot", 60, "key.categories.misc");
        this.an = new avb("key.togglePerspective", 63, "key.categories.misc");
        this.ao = new avb("key.smoothCamera", 0, "key.categories.misc");
        this.ap = new avb("key.fullscreen", 87, "key.categories.misc");
        this.aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
        this.ar = new avb("key.streamStartStop", 64, "key.categories.stream");
        this.as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
        this.at = new avb("key.streamCommercial", 0, "key.categories.stream");
        this.au = new avb("key.streamToggleMic", 0, "key.categories.stream");
        this.av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
        this.aw = ArrayUtils.addAll(new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, this.av);
        this.ay = oj.c;
        this.aE = "";
        this.aH = 70.0f;
        this.aM = "en_US";
        this.aN = false;
    }
    
    public static String c(final int \u2603) {
        if (\u2603 < 0) {
            return bnq.a("key.mouseButton", \u2603 + 101);
        }
        if (\u2603 < 256) {
            return Keyboard.getKeyName(\u2603);
        }
        return String.format("%c", (char)(\u2603 - 256)).toUpperCase();
    }
    
    public static boolean a(final avb \u2603) {
        if (\u2603.i() == 0) {
            return false;
        }
        if (\u2603.i() < 0) {
            return Mouse.isButtonDown(\u2603.i() + 100);
        }
        return Keyboard.isKeyDown(\u2603.i());
    }
    
    public void a(final avb \u2603, final int \u2603) {
        \u2603.b(\u2603);
        this.b();
    }
    
    public void a(final a \u2603, final float \u2603) {
        if (\u2603 == avh.a.b) {
            this.a = \u2603;
        }
        if (\u2603 == avh.a.c) {
            this.aH = \u2603;
        }
        if (\u2603 == avh.a.d) {
            this.aI = \u2603;
        }
        if (\u2603 == avh.a.i) {
            this.g = (int)\u2603;
        }
        if (\u2603 == avh.a.s) {
            this.q = \u2603;
            this.ax.q.d().b();
        }
        if (\u2603 == avh.a.B) {
            this.H = \u2603;
            this.ax.q.d().b();
        }
        if (\u2603 == avh.a.C) {
            this.G = \u2603;
            this.ax.q.d().b();
        }
        if (\u2603 == avh.a.A) {
            this.F = \u2603;
            this.ax.q.d().b();
        }
        if (\u2603 == avh.a.z) {
            this.E = \u2603;
            this.ax.q.d().b();
        }
        if (\u2603 == avh.a.D) {
            final int j = this.J;
            this.J = (int)\u2603;
            if (j != \u2603) {
                this.ax.T().a(this.J);
                this.ax.P().a(bmh.g);
                this.ax.T().a(false, this.J > 0);
                this.ax.B();
            }
        }
        if (\u2603 == avh.a.P) {
            this.v = !this.v;
            this.ax.g.a();
        }
        if (\u2603 == avh.a.f) {
            this.c = (int)\u2603;
            this.ax.g.m();
        }
        if (\u2603 == avh.a.F) {
            this.K = \u2603;
        }
        if (\u2603 == avh.a.G) {
            this.L = \u2603;
            this.ax.Y().p();
        }
        if (\u2603 == avh.a.H) {
            this.M = \u2603;
            this.ax.Y().p();
        }
        if (\u2603 == avh.a.I) {
            this.N = \u2603;
        }
        if (\u2603 == avh.a.J) {
            this.O = \u2603;
        }
    }
    
    public void a(final a \u2603, final int \u2603) {
        if (\u2603 == avh.a.a) {
            this.b = !this.b;
        }
        if (\u2603 == avh.a.n) {
            this.aK = (this.aK + \u2603 & 0x3);
        }
        if (\u2603 == avh.a.o) {
            this.aL = (this.aL + \u2603) % 3;
        }
        if (\u2603 == avh.a.g) {
            this.d = !this.d;
        }
        if (\u2603 == avh.a.k) {
            this.h = (this.h + \u2603) % 3;
        }
        if (\u2603 == avh.a.E) {
            this.aN = !this.aN;
            this.ax.k.a(this.ax.S().a() || this.aN);
        }
        if (\u2603 == avh.a.j) {
            this.f = !this.f;
        }
        if (\u2603 == avh.a.h) {
            this.e = !this.e;
            this.ax.e();
        }
        if (\u2603 == avh.a.l) {
            this.i = !this.i;
            this.ax.g.a();
        }
        if (\u2603 == avh.a.m) {
            this.j = (this.j + \u2603) % 3;
            this.ax.g.a();
        }
        if (\u2603 == avh.a.p) {
            this.m = wn.b.a((this.m.a() + \u2603) % 3);
        }
        if (\u2603 == avh.a.K) {
            this.P = (this.P + \u2603) % 3;
        }
        if (\u2603 == avh.a.L) {
            this.Q = !this.Q;
        }
        if (\u2603 == avh.a.M) {
            this.S = (this.S + \u2603) % 3;
        }
        if (\u2603 == avh.a.N) {
            this.T = (this.T + \u2603) % 3;
        }
        if (\u2603 == avh.a.O) {
            this.U = (this.U + \u2603) % 2;
        }
        if (\u2603 == avh.a.q) {
            this.n = !this.n;
        }
        if (\u2603 == avh.a.r) {
            this.o = !this.o;
        }
        if (\u2603 == avh.a.t) {
            this.p = !this.p;
        }
        if (\u2603 == avh.a.u) {
            this.r = !this.r;
        }
        if (\u2603 == avh.a.y) {
            this.A = !this.A;
        }
        if (\u2603 == avh.a.v) {
            this.s = !this.s;
            if (this.ax.K() != this.s) {
                this.ax.q();
            }
        }
        if (\u2603 == avh.a.w) {
            Display.setVSyncEnabled(this.t = !this.t);
        }
        if (\u2603 == avh.a.x) {
            this.u = !this.u;
            this.ax.g.a();
        }
        if (\u2603 == avh.a.P) {
            this.v = !this.v;
            this.ax.g.a();
        }
        if (\u2603 == avh.a.Q) {
            this.w = !this.w;
        }
        if (\u2603 == avh.a.R) {
            this.W = !this.W;
        }
        this.b();
    }
    
    public float a(final a \u2603) {
        if (\u2603 == avh.a.c) {
            return this.aH;
        }
        if (\u2603 == avh.a.d) {
            return this.aI;
        }
        if (\u2603 == avh.a.e) {
            return this.aJ;
        }
        if (\u2603 == avh.a.b) {
            return this.a;
        }
        if (\u2603 == avh.a.s) {
            return this.q;
        }
        if (\u2603 == avh.a.B) {
            return this.H;
        }
        if (\u2603 == avh.a.C) {
            return this.G;
        }
        if (\u2603 == avh.a.z) {
            return this.E;
        }
        if (\u2603 == avh.a.A) {
            return this.F;
        }
        if (\u2603 == avh.a.i) {
            return (float)this.g;
        }
        if (\u2603 == avh.a.D) {
            return (float)this.J;
        }
        if (\u2603 == avh.a.f) {
            return (float)this.c;
        }
        if (\u2603 == avh.a.F) {
            return this.K;
        }
        if (\u2603 == avh.a.G) {
            return this.L;
        }
        if (\u2603 == avh.a.H) {
            return this.M;
        }
        if (\u2603 == avh.a.I) {
            return this.N;
        }
        if (\u2603 == avh.a.J) {
            return this.O;
        }
        return 0.0f;
    }
    
    public boolean b(final a \u2603) {
        switch (avh$2.a[\u2603.ordinal()]) {
            case 1: {
                return this.b;
            }
            case 2: {
                return this.d;
            }
            case 3: {
                return this.e;
            }
            case 4: {
                return this.f;
            }
            case 5: {
                return this.n;
            }
            case 6: {
                return this.o;
            }
            case 7: {
                return this.p;
            }
            case 8: {
                return this.r;
            }
            case 9: {
                return this.s;
            }
            case 10: {
                return this.t;
            }
            case 11: {
                return this.u;
            }
            case 12: {
                return this.A;
            }
            case 13: {
                return this.Q;
            }
            case 14: {
                return this.aN;
            }
            case 15: {
                return this.v;
            }
            case 16: {
                return this.w;
            }
            case 17: {
                return this.W;
            }
            default: {
                return false;
            }
        }
    }
    
    private static String a(final String[] \u2603, int \u2603) {
        if (\u2603 < 0 || \u2603 >= \u2603.length) {
            \u2603 = 0;
        }
        return bnq.a(\u2603[\u2603], new Object[0]);
    }
    
    public String c(final a \u2603) {
        final String string = bnq.a(\u2603.d(), new Object[0]) + ": ";
        if (\u2603.a()) {
            final float a = this.a(\u2603);
            final float c = \u2603.c(a);
            if (\u2603 == avh.a.b) {
                if (c == 0.0f) {
                    return string + bnq.a("options.sensitivity.min", new Object[0]);
                }
                if (c == 1.0f) {
                    return string + bnq.a("options.sensitivity.max", new Object[0]);
                }
                return string + (int)(c * 200.0f) + "%";
            }
            else if (\u2603 == avh.a.c) {
                if (a == 70.0f) {
                    return string + bnq.a("options.fov.min", new Object[0]);
                }
                if (a == 110.0f) {
                    return string + bnq.a("options.fov.max", new Object[0]);
                }
                return string + (int)a;
            }
            else if (\u2603 == avh.a.i) {
                if (a == \u2603.X) {
                    return string + bnq.a("options.framerateLimit.max", new Object[0]);
                }
                return string + (int)a + " fps";
            }
            else if (\u2603 == avh.a.k) {
                if (a == \u2603.W) {
                    return string + bnq.a("options.cloudHeight.min", new Object[0]);
                }
                return string + ((int)a + 128);
            }
            else if (\u2603 == avh.a.d) {
                if (c == 0.0f) {
                    return string + bnq.a("options.gamma.min", new Object[0]);
                }
                if (c == 1.0f) {
                    return string + bnq.a("options.gamma.max", new Object[0]);
                }
                return string + "+" + (int)(c * 100.0f) + "%";
            }
            else {
                if (\u2603 == avh.a.e) {
                    return string + (int)(c * 400.0f) + "%";
                }
                if (\u2603 == avh.a.s) {
                    return string + (int)(c * 90.0f + 10.0f) + "%";
                }
                if (\u2603 == avh.a.C) {
                    return string + avt.b(c) + "px";
                }
                if (\u2603 == avh.a.B) {
                    return string + avt.b(c) + "px";
                }
                if (\u2603 == avh.a.A) {
                    return string + avt.a(c) + "px";
                }
                if (\u2603 == avh.a.f) {
                    return string + (int)a + " chunks";
                }
                if (\u2603 == avh.a.D) {
                    if (a == 0.0f) {
                        return string + bnq.a("options.off", new Object[0]);
                    }
                    return string + (int)a;
                }
                else {
                    if (\u2603 == avh.a.J) {
                        return string + bqn.a(c) + " fps";
                    }
                    if (\u2603 == avh.a.I) {
                        return string + bqn.b(c) + " Kbps";
                    }
                    if (\u2603 == avh.a.F) {
                        return string + String.format("%.3f bpp", bqn.c(c));
                    }
                    if (c == 0.0f) {
                        return string + bnq.a("options.off", new Object[0]);
                    }
                    return string + (int)(c * 100.0f) + "%";
                }
            }
        }
        else if (\u2603.b()) {
            final boolean b = this.b(\u2603);
            if (b) {
                return string + bnq.a("options.on", new Object[0]);
            }
            return string + bnq.a("options.off", new Object[0]);
        }
        else {
            if (\u2603 == avh.a.n) {
                return string + a(avh.aR, this.aK);
            }
            if (\u2603 == avh.a.p) {
                return string + bnq.a(this.m.b(), new Object[0]);
            }
            if (\u2603 == avh.a.o) {
                return string + a(avh.aS, this.aL);
            }
            if (\u2603 == avh.a.m) {
                return string + a(avh.aT, this.j);
            }
            if (\u2603 == avh.a.K) {
                return string + a(avh.aU, this.P);
            }
            if (\u2603 == avh.a.M) {
                return string + a(avh.aV, this.S);
            }
            if (\u2603 == avh.a.N) {
                return string + a(avh.aW, this.T);
            }
            if (\u2603 == avh.a.O) {
                return string + a(avh.aX, this.U);
            }
            if (\u2603 == avh.a.k) {
                return string + a(avh.aY, this.h);
            }
            if (\u2603 != avh.a.l) {
                return string;
            }
            if (this.i) {
                return string + bnq.a("options.graphics.fancy", new Object[0]);
            }
            final String s = "options.graphics.fast";
            return string + bnq.a("options.graphics.fast", new Object[0]);
        }
    }
    
    public void a() {
        try {
            if (!this.bb.exists()) {
                return;
            }
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.bb));
            String line = "";
            this.ba.clear();
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    final String[] split = line.split(":");
                    if (split[0].equals("mouseSensitivity")) {
                        this.a = this.a(split[1]);
                    }
                    if (split[0].equals("fov")) {
                        this.aH = this.a(split[1]) * 40.0f + 70.0f;
                    }
                    if (split[0].equals("gamma")) {
                        this.aI = this.a(split[1]);
                    }
                    if (split[0].equals("saturation")) {
                        this.aJ = this.a(split[1]);
                    }
                    if (split[0].equals("invertYMouse")) {
                        this.b = split[1].equals("true");
                    }
                    if (split[0].equals("renderDistance")) {
                        this.c = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("guiScale")) {
                        this.aK = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("particles")) {
                        this.aL = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("bobView")) {
                        this.d = split[1].equals("true");
                    }
                    if (split[0].equals("anaglyph3d")) {
                        this.e = split[1].equals("true");
                    }
                    if (split[0].equals("maxFps")) {
                        this.g = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("fboEnable")) {
                        this.f = split[1].equals("true");
                    }
                    if (split[0].equals("difficulty")) {
                        this.ay = oj.a(Integer.parseInt(split[1]));
                    }
                    if (split[0].equals("fancyGraphics")) {
                        this.i = split[1].equals("true");
                    }
                    if (split[0].equals("ao")) {
                        if (split[1].equals("true")) {
                            this.j = 2;
                        }
                        else if (split[1].equals("false")) {
                            this.j = 0;
                        }
                        else {
                            this.j = Integer.parseInt(split[1]);
                        }
                    }
                    if (split[0].equals("renderClouds")) {
                        if (split[1].equals("true")) {
                            this.h = 2;
                        }
                        else if (split[1].equals("false")) {
                            this.h = 0;
                        }
                        else if (split[1].equals("fast")) {
                            this.h = 1;
                        }
                    }
                    if (split[0].equals("resourcePacks")) {
                        this.k = avh.aP.fromJson(line.substring(line.indexOf(58) + 1), avh.aQ);
                        if (this.k == null) {
                            this.k = (List<String>)Lists.newArrayList();
                        }
                    }
                    if (split[0].equals("incompatibleResourcePacks")) {
                        this.l = avh.aP.fromJson(line.substring(line.indexOf(58) + 1), avh.aQ);
                        if (this.l == null) {
                            this.l = (List<String>)Lists.newArrayList();
                        }
                    }
                    if (split[0].equals("lastServer") && split.length >= 2) {
                        this.aE = line.substring(line.indexOf(58) + 1);
                    }
                    if (split[0].equals("lang") && split.length >= 2) {
                        this.aM = split[1];
                    }
                    if (split[0].equals("chatVisibility")) {
                        this.m = wn.b.a(Integer.parseInt(split[1]));
                    }
                    if (split[0].equals("chatColors")) {
                        this.n = split[1].equals("true");
                    }
                    if (split[0].equals("chatLinks")) {
                        this.o = split[1].equals("true");
                    }
                    if (split[0].equals("chatLinksPrompt")) {
                        this.p = split[1].equals("true");
                    }
                    if (split[0].equals("chatOpacity")) {
                        this.q = this.a(split[1]);
                    }
                    if (split[0].equals("snooperEnabled")) {
                        this.r = split[1].equals("true");
                    }
                    if (split[0].equals("fullscreen")) {
                        this.s = split[1].equals("true");
                    }
                    if (split[0].equals("enableVsync")) {
                        this.t = split[1].equals("true");
                    }
                    if (split[0].equals("useVbo")) {
                        this.u = split[1].equals("true");
                    }
                    if (split[0].equals("hideServerAddress")) {
                        this.x = split[1].equals("true");
                    }
                    if (split[0].equals("advancedItemTooltips")) {
                        this.y = split[1].equals("true");
                    }
                    if (split[0].equals("pauseOnLostFocus")) {
                        this.z = split[1].equals("true");
                    }
                    if (split[0].equals("touchscreen")) {
                        this.A = split[1].equals("true");
                    }
                    if (split[0].equals("overrideHeight")) {
                        this.C = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("overrideWidth")) {
                        this.B = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("heldItemTooltips")) {
                        this.D = split[1].equals("true");
                    }
                    if (split[0].equals("chatHeightFocused")) {
                        this.H = this.a(split[1]);
                    }
                    if (split[0].equals("chatHeightUnfocused")) {
                        this.G = this.a(split[1]);
                    }
                    if (split[0].equals("chatScale")) {
                        this.E = this.a(split[1]);
                    }
                    if (split[0].equals("chatWidth")) {
                        this.F = this.a(split[1]);
                    }
                    if (split[0].equals("showInventoryAchievementHint")) {
                        this.I = split[1].equals("true");
                    }
                    if (split[0].equals("mipmapLevels")) {
                        this.J = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("streamBytesPerPixel")) {
                        this.K = this.a(split[1]);
                    }
                    if (split[0].equals("streamMicVolume")) {
                        this.L = this.a(split[1]);
                    }
                    if (split[0].equals("streamSystemVolume")) {
                        this.M = this.a(split[1]);
                    }
                    if (split[0].equals("streamKbps")) {
                        this.N = this.a(split[1]);
                    }
                    if (split[0].equals("streamFps")) {
                        this.O = this.a(split[1]);
                    }
                    if (split[0].equals("streamCompression")) {
                        this.P = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("streamSendMetadata")) {
                        this.Q = split[1].equals("true");
                    }
                    if (split[0].equals("streamPreferredServer") && split.length >= 2) {
                        this.R = line.substring(line.indexOf(58) + 1);
                    }
                    if (split[0].equals("streamChatEnabled")) {
                        this.S = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("streamChatUserFilter")) {
                        this.T = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("streamMicToggleBehavior")) {
                        this.U = Integer.parseInt(split[1]);
                    }
                    if (split[0].equals("forceUnicodeFont")) {
                        this.aN = split[1].equals("true");
                    }
                    if (split[0].equals("allowBlockAlternatives")) {
                        this.v = split[1].equals("true");
                    }
                    if (split[0].equals("reducedDebugInfo")) {
                        this.w = split[1].equals("true");
                    }
                    if (split[0].equals("useNativeTransport")) {
                        this.V = split[1].equals("true");
                    }
                    if (split[0].equals("entityShadows")) {
                        this.W = split[1].equals("true");
                    }
                    for (final avb avb : this.aw) {
                        if (split[0].equals("key_" + avb.g())) {
                            avb.b(Integer.parseInt(split[1]));
                        }
                    }
                    for (final bpg bpg : bpg.values()) {
                        if (split[0].equals("soundCategory_" + bpg.a())) {
                            this.ba.put(bpg, this.a(split[1]));
                        }
                    }
                    for (final wo \u2603 : wo.values()) {
                        if (split[0].equals("modelPart_" + \u2603.c())) {
                            this.a(\u2603, split[1].equals("true"));
                        }
                    }
                }
                catch (Exception ex) {
                    avh.aO.warn("Skipping bad option: " + line);
                }
            }
            avb.b();
            bufferedReader.close();
        }
        catch (Exception throwable) {
            avh.aO.error("Failed to load options", throwable);
        }
    }
    
    private float a(final String \u2603) {
        if (\u2603.equals("true")) {
            return 1.0f;
        }
        if (\u2603.equals("false")) {
            return 0.0f;
        }
        return Float.parseFloat(\u2603);
    }
    
    public void b() {
        try {
            final PrintWriter printWriter = new PrintWriter(new FileWriter(this.bb));
            printWriter.println("invertYMouse:" + this.b);
            printWriter.println("mouseSensitivity:" + this.a);
            printWriter.println("fov:" + (this.aH - 70.0f) / 40.0f);
            printWriter.println("gamma:" + this.aI);
            printWriter.println("saturation:" + this.aJ);
            printWriter.println("renderDistance:" + this.c);
            printWriter.println("guiScale:" + this.aK);
            printWriter.println("particles:" + this.aL);
            printWriter.println("bobView:" + this.d);
            printWriter.println("anaglyph3d:" + this.e);
            printWriter.println("maxFps:" + this.g);
            printWriter.println("fboEnable:" + this.f);
            printWriter.println("difficulty:" + this.ay.a());
            printWriter.println("fancyGraphics:" + this.i);
            printWriter.println("ao:" + this.j);
            switch (this.h) {
                case 2: {
                    printWriter.println("renderClouds:true");
                    break;
                }
                case 1: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 0: {
                    printWriter.println("renderClouds:false");
                    break;
                }
            }
            printWriter.println("resourcePacks:" + avh.aP.toJson(this.k));
            printWriter.println("incompatibleResourcePacks:" + avh.aP.toJson(this.l));
            printWriter.println("lastServer:" + this.aE);
            printWriter.println("lang:" + this.aM);
            printWriter.println("chatVisibility:" + this.m.a());
            printWriter.println("chatColors:" + this.n);
            printWriter.println("chatLinks:" + this.o);
            printWriter.println("chatLinksPrompt:" + this.p);
            printWriter.println("chatOpacity:" + this.q);
            printWriter.println("snooperEnabled:" + this.r);
            printWriter.println("fullscreen:" + this.s);
            printWriter.println("enableVsync:" + this.t);
            printWriter.println("useVbo:" + this.u);
            printWriter.println("hideServerAddress:" + this.x);
            printWriter.println("advancedItemTooltips:" + this.y);
            printWriter.println("pauseOnLostFocus:" + this.z);
            printWriter.println("touchscreen:" + this.A);
            printWriter.println("overrideWidth:" + this.B);
            printWriter.println("overrideHeight:" + this.C);
            printWriter.println("heldItemTooltips:" + this.D);
            printWriter.println("chatHeightFocused:" + this.H);
            printWriter.println("chatHeightUnfocused:" + this.G);
            printWriter.println("chatScale:" + this.E);
            printWriter.println("chatWidth:" + this.F);
            printWriter.println("showInventoryAchievementHint:" + this.I);
            printWriter.println("mipmapLevels:" + this.J);
            printWriter.println("streamBytesPerPixel:" + this.K);
            printWriter.println("streamMicVolume:" + this.L);
            printWriter.println("streamSystemVolume:" + this.M);
            printWriter.println("streamKbps:" + this.N);
            printWriter.println("streamFps:" + this.O);
            printWriter.println("streamCompression:" + this.P);
            printWriter.println("streamSendMetadata:" + this.Q);
            printWriter.println("streamPreferredServer:" + this.R);
            printWriter.println("streamChatEnabled:" + this.S);
            printWriter.println("streamChatUserFilter:" + this.T);
            printWriter.println("streamMicToggleBehavior:" + this.U);
            printWriter.println("forceUnicodeFont:" + this.aN);
            printWriter.println("allowBlockAlternatives:" + this.v);
            printWriter.println("reducedDebugInfo:" + this.w);
            printWriter.println("useNativeTransport:" + this.V);
            printWriter.println("entityShadows:" + this.W);
            for (final avb avb : this.aw) {
                printWriter.println("key_" + avb.g() + ":" + avb.i());
            }
            for (final bpg \u2603 : bpg.values()) {
                printWriter.println("soundCategory_" + \u2603.a() + ":" + this.a(\u2603));
            }
            for (final wo wo : wo.values()) {
                printWriter.println("modelPart_" + wo.c() + ":" + this.aZ.contains(wo));
            }
            printWriter.close();
        }
        catch (Exception throwable) {
            avh.aO.error("Failed to save options", throwable);
        }
        this.c();
    }
    
    public float a(final bpg \u2603) {
        if (this.ba.containsKey(\u2603)) {
            return this.ba.get(\u2603);
        }
        return 1.0f;
    }
    
    public void a(final bpg \u2603, final float \u2603) {
        this.ax.W().a(\u2603, \u2603);
        this.ba.put(\u2603, \u2603);
    }
    
    public void c() {
        if (this.ax.h != null) {
            int \u2603 = 0;
            for (final wo wo : this.aZ) {
                \u2603 |= wo.a();
            }
            this.ax.h.a.a(new ih(this.aM, this.c, this.m, this.n, \u2603));
        }
    }
    
    public Set<wo> d() {
        return (Set<wo>)ImmutableSet.copyOf((Collection<?>)this.aZ);
    }
    
    public void a(final wo \u2603, final boolean \u2603) {
        if (\u2603) {
            this.aZ.add(\u2603);
        }
        else {
            this.aZ.remove(\u2603);
        }
        this.c();
    }
    
    public void a(final wo \u2603) {
        if (!this.d().contains(\u2603)) {
            this.aZ.add(\u2603);
        }
        else {
            this.aZ.remove(\u2603);
        }
        this.c();
    }
    
    public int e() {
        if (this.c >= 4) {
            return this.h;
        }
        return 0;
    }
    
    public boolean f() {
        return this.V;
    }
    
    static {
        aO = LogManager.getLogger();
        aP = new Gson();
        aQ = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[] { String.class };
            }
            
            @Override
            public Type getRawType() {
                return List.class;
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
        };
        aR = new String[] { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
        aS = new String[] { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
        aT = new String[] { "options.ao.off", "options.ao.min", "options.ao.max" };
        aU = new String[] { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
        aV = new String[] { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
        aW = new String[] { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
        aX = new String[] { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
        aY = new String[] { "options.off", "options.graphics.fast", "options.graphics.fancy" };
    }
    
    public enum a
    {
        a("options.invertMouse", false, true), 
        b("options.sensitivity", true, false), 
        c("options.fov", true, false, 30.0f, 110.0f, 1.0f), 
        d("options.gamma", true, false), 
        e("options.saturation", true, false), 
        f("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f), 
        g("options.viewBobbing", false, true), 
        h("options.anaglyph", false, true), 
        i("options.framerateLimit", true, false, 10.0f, 260.0f, 10.0f), 
        j("options.fboEnable", false, true), 
        k("options.renderClouds", false, false), 
        l("options.graphics", false, false), 
        m("options.ao", false, false), 
        n("options.guiScale", false, false), 
        o("options.particles", false, false), 
        p("options.chat.visibility", false, false), 
        q("options.chat.color", false, true), 
        r("options.chat.links", false, true), 
        s("options.chat.opacity", true, false), 
        t("options.chat.links.prompt", false, true), 
        u("options.snooper", false, true), 
        v("options.fullscreen", false, true), 
        w("options.vsync", false, true), 
        x("options.vbo", false, true), 
        y("options.touchscreen", false, true), 
        z("options.chat.scale", true, false), 
        A("options.chat.width", true, false), 
        B("options.chat.height.focused", true, false), 
        C("options.chat.height.unfocused", true, false), 
        D("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f), 
        E("options.forceUnicodeFont", false, true), 
        F("options.stream.bytesPerPixel", true, false), 
        G("options.stream.micVolumne", true, false), 
        H("options.stream.systemVolume", true, false), 
        I("options.stream.kbps", true, false), 
        J("options.stream.fps", true, false), 
        K("options.stream.compression", false, false), 
        L("options.stream.sendMetadata", false, true), 
        M("options.stream.chat.enabled", false, false), 
        N("options.stream.chat.userFilter", false, false), 
        O("options.stream.micToggleBehavior", false, false), 
        P("options.blockAlternatives", false, true), 
        Q("options.reducedDebugInfo", false, true), 
        R("options.entityShadows", false, true);
        
        private final boolean S;
        private final boolean T;
        private final String U;
        private final float V;
        private float W;
        private float X;
        
        public static a a(final int \u2603) {
            for (final a a : values()) {
                if (a.c() == \u2603) {
                    return a;
                }
            }
            return null;
        }
        
        private a(final String \u2603, final boolean \u2603, final boolean \u2603) {
            this(\u2603, \u2603, \u2603, 0.0f, 1.0f, 0.0f);
        }
        
        private a(final String \u2603, final boolean \u2603, final boolean \u2603, final float \u2603, final float \u2603, final float \u2603) {
            this.U = \u2603;
            this.S = \u2603;
            this.T = \u2603;
            this.W = \u2603;
            this.X = \u2603;
            this.V = \u2603;
        }
        
        public boolean a() {
            return this.S;
        }
        
        public boolean b() {
            return this.T;
        }
        
        public int c() {
            return this.ordinal();
        }
        
        public String d() {
            return this.U;
        }
        
        public float f() {
            return this.X;
        }
        
        public void a(final float \u2603) {
            this.X = \u2603;
        }
        
        public float c(final float \u2603) {
            return ns.a((this.e(\u2603) - this.W) / (this.X - this.W), 0.0f, 1.0f);
        }
        
        public float d(final float \u2603) {
            return this.e(this.W + (this.X - this.W) * ns.a(\u2603, 0.0f, 1.0f));
        }
        
        public float e(float \u2603) {
            \u2603 = this.f(\u2603);
            return ns.a(\u2603, this.W, this.X);
        }
        
        protected float f(float \u2603) {
            if (this.V > 0.0f) {
                \u2603 = this.V * Math.round(\u2603 / this.V);
            }
            return \u2603;
        }
    }
}
