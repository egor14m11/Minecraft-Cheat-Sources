import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class axb extends axu
{
    private axu f;
    private avw g;
    private avw h;
    private String i;
    private String r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private avs A;
    private avs B;
    private avs C;
    private avs D;
    private avs E;
    private avs F;
    private avs G;
    private String H;
    private String I;
    private String J;
    private String K;
    private int L;
    public String a;
    private static final String[] M;
    
    public axb(final axu \u2603) {
        this.r = "survival";
        this.t = true;
        this.a = "";
        this.f = \u2603;
        this.J = "";
        this.K = bnq.a("selectWorld.newWorld", new Object[0]);
    }
    
    @Override
    public void e() {
        this.g.a();
        this.h.a();
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("selectWorld.create", new Object[0])));
        this.n.add(new avs(1, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
        this.n.add(this.A = new avs(2, this.l / 2 - 75, 115, 150, 20, bnq.a("selectWorld.gameMode", new Object[0])));
        this.n.add(this.B = new avs(3, this.l / 2 - 75, 187, 150, 20, bnq.a("selectWorld.moreWorldOptions", new Object[0])));
        this.n.add(this.C = new avs(4, this.l / 2 - 155, 100, 150, 20, bnq.a("selectWorld.mapFeatures", new Object[0])));
        this.C.m = false;
        this.n.add(this.D = new avs(7, this.l / 2 + 5, 151, 150, 20, bnq.a("selectWorld.bonusItems", new Object[0])));
        this.D.m = false;
        this.n.add(this.E = new avs(5, this.l / 2 + 5, 100, 150, 20, bnq.a("selectWorld.mapType", new Object[0])));
        this.E.m = false;
        this.n.add(this.F = new avs(6, this.l / 2 - 155, 151, 150, 20, bnq.a("selectWorld.allowCommands", new Object[0])));
        this.F.m = false;
        this.n.add(this.G = new avs(8, this.l / 2 + 5, 120, 150, 20, bnq.a("selectWorld.customizeType", new Object[0])));
        this.G.m = false;
        (this.g = new avw(9, this.q, this.l / 2 - 100, 60, 200, 20)).b(true);
        this.g.a(this.K);
        (this.h = new avw(10, this.q, this.l / 2 - 100, 60, 200, 20)).a(this.J);
        this.a(this.z);
        this.a();
        this.f();
    }
    
    private void a() {
        this.i = this.g.b().trim();
        for (final char oldChar : f.a) {
            this.i = this.i.replace(oldChar, '_');
        }
        if (StringUtils.isEmpty(this.i)) {
            this.i = "World";
        }
        this.i = a(this.j.f(), this.i);
    }
    
    private void f() {
        this.A.j = bnq.a("selectWorld.gameMode", new Object[0]) + ": " + bnq.a("selectWorld.gameMode." + this.r, new Object[0]);
        this.H = bnq.a("selectWorld.gameMode." + this.r + ".line1", new Object[0]);
        this.I = bnq.a("selectWorld.gameMode." + this.r + ".line2", new Object[0]);
        this.C.j = bnq.a("selectWorld.mapFeatures", new Object[0]) + " ";
        if (this.t) {
            final StringBuilder sb = new StringBuilder();
            final avs c = this.C;
            c.j = sb.append(c.j).append(bnq.a("options.on", new Object[0])).toString();
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            final avs c2 = this.C;
            c2.j = sb2.append(c2.j).append(bnq.a("options.off", new Object[0])).toString();
        }
        this.D.j = bnq.a("selectWorld.bonusItems", new Object[0]) + " ";
        if (this.w && !this.x) {
            final StringBuilder sb3 = new StringBuilder();
            final avs d = this.D;
            d.j = sb3.append(d.j).append(bnq.a("options.on", new Object[0])).toString();
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            final avs d2 = this.D;
            d2.j = sb4.append(d2.j).append(bnq.a("options.off", new Object[0])).toString();
        }
        this.E.j = bnq.a("selectWorld.mapType", new Object[0]) + " " + bnq.a(adr.a[this.L].b(), new Object[0]);
        this.F.j = bnq.a("selectWorld.allowCommands", new Object[0]) + " ";
        if (this.u && !this.x) {
            final StringBuilder sb5 = new StringBuilder();
            final avs f = this.F;
            f.j = sb5.append(f.j).append(bnq.a("options.on", new Object[0])).toString();
        }
        else {
            final StringBuilder sb6 = new StringBuilder();
            final avs f2 = this.F;
            f2.j = sb6.append(f2.j).append(bnq.a("options.off", new Object[0])).toString();
        }
    }
    
    public static String a(final atr \u2603, String \u2603) {
        \u2603 = \u2603.replaceAll("[\\./\"]", "_");
        for (final String anotherString : axb.M) {
            if (\u2603.equalsIgnoreCase(anotherString)) {
                \u2603 = "_" + \u2603 + "_";
            }
        }
        while (\u2603.c(\u2603) != null) {
            \u2603 += "-";
        }
        return \u2603;
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 1) {
            this.j.a(this.f);
        }
        else if (\u2603.k == 0) {
            this.j.a((axu)null);
            if (this.y) {
                return;
            }
            this.y = true;
            long nextLong = new Random().nextLong();
            final String b = this.h.b();
            if (!StringUtils.isEmpty(b)) {
                try {
                    final long long1 = Long.parseLong(b);
                    if (long1 != 0L) {
                        nextLong = long1;
                    }
                }
                catch (NumberFormatException ex) {
                    nextLong = b.hashCode();
                }
            }
            final adp.a a = adp.a.a(this.r);
            final adp \u26032 = new adp(nextLong, a, this.t, this.x, adr.a[this.L]);
            \u26032.a(this.a);
            if (this.w && !this.x) {
                \u26032.a();
            }
            if (this.u && !this.x) {
                \u26032.b();
            }
            this.j.a(this.i, this.g.b().trim(), \u26032);
        }
        else if (\u2603.k == 3) {
            this.h();
        }
        else if (\u2603.k == 2) {
            if (this.r.equals("survival")) {
                if (!this.v) {
                    this.u = false;
                }
                this.x = false;
                this.r = "hardcore";
                this.x = true;
                this.F.l = false;
                this.D.l = false;
                this.f();
            }
            else if (this.r.equals("hardcore")) {
                if (!this.v) {
                    this.u = true;
                }
                this.x = false;
                this.r = "creative";
                this.f();
                this.x = false;
                this.F.l = true;
                this.D.l = true;
            }
            else {
                if (!this.v) {
                    this.u = false;
                }
                this.r = "survival";
                this.f();
                this.F.l = true;
                this.D.l = true;
                this.x = false;
            }
            this.f();
        }
        else if (\u2603.k == 4) {
            this.t = !this.t;
            this.f();
        }
        else if (\u2603.k == 7) {
            this.w = !this.w;
            this.f();
        }
        else if (\u2603.k == 5) {
            ++this.L;
            if (this.L >= adr.a.length) {
                this.L = 0;
            }
            while (!this.g()) {
                ++this.L;
                if (this.L >= adr.a.length) {
                    this.L = 0;
                }
            }
            this.a = "";
            this.f();
            this.a(this.z);
        }
        else if (\u2603.k == 6) {
            this.v = true;
            this.u = !this.u;
            this.f();
        }
        else if (\u2603.k == 8) {
            if (adr.a[this.L] == adr.c) {
                this.j.a(new axa(this, this.a));
            }
            else {
                this.j.a(new axd(this, this.a));
            }
        }
    }
    
    private boolean g() {
        final adr adr = adr.a[this.L];
        return adr != null && adr.e() && (adr != adr.g || axu.r());
    }
    
    private void h() {
        this.a(!this.z);
    }
    
    private void a(final boolean \u2603) {
        this.z = \u2603;
        if (adr.a[this.L] == adr.g) {
            this.A.m = !this.z;
            this.A.l = false;
            if (this.s == null) {
                this.s = this.r;
            }
            this.r = "spectator";
            this.C.m = false;
            this.D.m = false;
            this.E.m = this.z;
            this.F.m = false;
            this.G.m = false;
        }
        else {
            this.A.m = !this.z;
            this.A.l = true;
            if (this.s != null) {
                this.r = this.s;
                this.s = null;
            }
            this.C.m = (this.z && adr.a[this.L] != adr.f);
            this.D.m = this.z;
            this.E.m = this.z;
            this.F.m = this.z;
            this.G.m = (this.z && (adr.a[this.L] == adr.c || adr.a[this.L] == adr.f));
        }
        this.f();
        if (this.z) {
            this.B.j = bnq.a("gui.done", new Object[0]);
        }
        else {
            this.B.j = bnq.a("selectWorld.moreWorldOptions", new Object[0]);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (this.g.m() && !this.z) {
            this.g.a(\u2603, \u2603);
            this.K = this.g.b();
        }
        else if (this.h.m() && this.z) {
            this.h.a(\u2603, \u2603);
            this.J = this.h.b();
        }
        if (\u2603 == 28 || \u2603 == 156) {
            this.a(this.n.get(0));
        }
        this.n.get(0).l = (this.g.b().length() > 0);
        this.a();
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (this.z) {
            this.h.a(\u2603, \u2603, \u2603);
        }
        else {
            this.g.a(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("selectWorld.create", new Object[0]), this.l / 2, 20, -1);
        if (this.z) {
            this.c(this.q, bnq.a("selectWorld.enterSeed", new Object[0]), this.l / 2 - 100, 47, -6250336);
            this.c(this.q, bnq.a("selectWorld.seedInfo", new Object[0]), this.l / 2 - 100, 85, -6250336);
            if (this.C.m) {
                this.c(this.q, bnq.a("selectWorld.mapFeatures.info", new Object[0]), this.l / 2 - 150, 122, -6250336);
            }
            if (this.F.m) {
                this.c(this.q, bnq.a("selectWorld.allowCommands.info", new Object[0]), this.l / 2 - 150, 172, -6250336);
            }
            this.h.g();
            if (adr.a[this.L].h()) {
                this.q.a(bnq.a(adr.a[this.L].c(), new Object[0]), this.E.h + 2, this.E.i + 22, this.E.b(), 10526880);
            }
        }
        else {
            this.c(this.q, bnq.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, -6250336);
            this.c(this.q, bnq.a("selectWorld.resultFolder", new Object[0]) + " " + this.i, this.l / 2 - 100, 85, -6250336);
            this.g.g();
            this.c(this.q, this.H, this.l / 2 - 100, 137, -6250336);
            this.c(this.q, this.I, this.l / 2 - 100, 149, -6250336);
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void a(final ato \u2603) {
        this.K = bnq.a("selectWorld.newWorld.copyOf", \u2603.k());
        this.J = \u2603.b() + "";
        this.L = \u2603.u().g();
        this.a = \u2603.B();
        this.t = \u2603.s();
        this.u = \u2603.v();
        if (\u2603.t()) {
            this.r = "hardcore";
        }
        else if (\u2603.r().e()) {
            this.r = "survival";
        }
        else if (\u2603.r().d()) {
            this.r = "creative";
        }
    }
    
    static {
        M = new String[] { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
    }
}
