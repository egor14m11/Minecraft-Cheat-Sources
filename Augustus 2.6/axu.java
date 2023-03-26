import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import tv.twitch.chat.ChatUserInfo;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import org.apache.commons.lang3.StringUtils;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;
import com.google.common.collect.Lists;
import java.net.URI;
import java.util.List;
import com.google.common.base.Splitter;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class axu extends avp implements awx
{
    private static final Logger a;
    private static final Set<String> f;
    private static final Splitter g;
    protected ave j;
    protected bjh k;
    public int l;
    public int m;
    protected List<avs> n;
    protected List<avy> o;
    public boolean p;
    protected avn q;
    private avs h;
    private int i;
    private long r;
    private int s;
    private URI t;
    
    public axu() {
        this.n = (List<avs>)Lists.newArrayList();
        this.o = (List<avy>)Lists.newArrayList();
    }
    
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        for (int i = 0; i < this.n.size(); ++i) {
            this.n.get(i).a(this.j, \u2603, \u2603);
        }
        for (int i = 0; i < this.o.size(); ++i) {
            this.o.get(i).a(this.j, \u2603, \u2603);
        }
    }
    
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.j.a((axu)null);
            if (this.j.m == null) {
                this.j.n();
            }
        }
    }
    
    public static String o() {
        try {
            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception ex) {}
        return "";
    }
    
    public static void e(final String \u2603) {
        if (StringUtils.isEmpty(\u2603)) {
            return;
        }
        try {
            final StringSelection contents = new StringSelection(\u2603);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(contents, null);
        }
        catch (Exception ex) {}
    }
    
    protected void a(final zx \u2603, final int \u2603, final int \u2603) {
        final List<String> a = \u2603.a(this.j.h, this.j.t.y);
        for (int i = 0; i < a.size(); ++i) {
            if (i == 0) {
                a.set(i, \u2603.u().e + a.get(i));
            }
            else {
                a.set(i, a.h + a.get(i));
            }
        }
        this.a(a, \u2603, \u2603);
    }
    
    protected void a(final String \u2603, final int \u2603, final int \u2603) {
        this.a(Arrays.asList(\u2603), \u2603, \u2603);
    }
    
    protected void a(final List<String> \u2603, final int \u2603, final int \u2603) {
        if (\u2603.isEmpty()) {
            return;
        }
        bfl.C();
        avc.a();
        bfl.f();
        bfl.i();
        int n = 0;
        for (final String \u26032 : \u2603) {
            final int a = this.q.a(\u26032);
            if (a > n) {
                n = a;
            }
        }
        int n2 = \u2603 + 12;
        int n3 = \u2603 - 12;
        final int a = n;
        int n4 = 8;
        if (\u2603.size() > 1) {
            n4 += 2 + (\u2603.size() - 1) * 10;
        }
        if (n2 + n > this.l) {
            n2 -= 28 + n;
        }
        if (n3 + n4 + 6 > this.m) {
            n3 = this.m - n4 - 6;
        }
        this.e = 300.0f;
        this.k.a = 300.0f;
        final int n5 = -267386864;
        this.a(n2 - 3, n3 - 4, n2 + a + 3, n3 - 3, n5, n5);
        this.a(n2 - 3, n3 + n4 + 3, n2 + a + 3, n3 + n4 + 4, n5, n5);
        this.a(n2 - 3, n3 - 3, n2 + a + 3, n3 + n4 + 3, n5, n5);
        this.a(n2 - 4, n3 - 3, n2 - 3, n3 + n4 + 3, n5, n5);
        this.a(n2 + a + 3, n3 - 3, n2 + a + 4, n3 + n4 + 3, n5, n5);
        final int n6 = 1347420415;
        final int n7 = (n6 & 0xFEFEFE) >> 1 | (n6 & 0xFF000000);
        this.a(n2 - 3, n3 - 3 + 1, n2 - 3 + 1, n3 + n4 + 3 - 1, n6, n7);
        this.a(n2 + a + 2, n3 - 3 + 1, n2 + a + 3, n3 + n4 + 3 - 1, n6, n7);
        this.a(n2 - 3, n3 - 3, n2 + a + 3, n3 - 3 + 1, n6, n6);
        this.a(n2 - 3, n3 + n4 + 2, n2 + a + 3, n3 + n4 + 3, n7, n7);
        for (int i = 0; i < \u2603.size(); ++i) {
            final String \u26033 = \u2603.get(i);
            this.q.a(\u26033, (float)n2, (float)n3, -1);
            if (i == 0) {
                n3 += 2;
            }
            n3 += 10;
        }
        this.e = 0.0f;
        this.k.a = 0.0f;
        bfl.e();
        bfl.j();
        avc.b();
        bfl.B();
    }
    
    protected void a(final eu \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null || \u2603.b().i() == null) {
            return;
        }
        final ew i = \u2603.b().i();
        if (i.a() == ew.a.c) {
            zx a = null;
            try {
                final eb a2 = ed.a(i.b().c());
                if (a2 instanceof dn) {
                    a = zx.a((dn)a2);
                }
            }
            catch (ec ec) {}
            if (a != null) {
                this.a(a, \u2603, \u2603);
            }
            else {
                this.a(a.m + "Invalid Item!", \u2603, \u2603);
            }
        }
        else if (i.a() == ew.a.d) {
            if (this.j.t.y) {
                try {
                    final eb a3 = ed.a(i.b().c());
                    if (a3 instanceof dn) {
                        final List<String> arrayList = (List<String>)Lists.newArrayList();
                        final dn dn = (dn)a3;
                        arrayList.add(dn.j("name"));
                        if (dn.b("type", 8)) {
                            final String j = dn.j("type");
                            arrayList.add("Type: " + j + " (" + pm.a(j) + ")");
                        }
                        arrayList.add(dn.j("id"));
                        this.a(arrayList, \u2603, \u2603);
                    }
                    else {
                        this.a(a.m + "Invalid Entity!", \u2603, \u2603);
                    }
                }
                catch (ec ec2) {
                    this.a(a.m + "Invalid Entity!", \u2603, \u2603);
                }
            }
        }
        else if (i.a() == ew.a.a) {
            this.a(axu.g.splitToList(i.b().d()), \u2603, \u2603);
        }
        else if (i.a() == ew.a.b) {
            final mw a4 = na.a(i.b().c());
            if (a4 != null) {
                final eu e = a4.e();
                final eu eu = new fb("stats.tooltip.type." + (a4.d() ? "achievement" : "statistic"), new Object[0]);
                eu.b().b(true);
                final String j = (a4 instanceof mq) ? ((mq)a4).f() : null;
                final List<String> arrayList2 = Lists.newArrayList(e.d(), eu.d());
                if (j != null) {
                    arrayList2.addAll(this.q.c(j, 150));
                }
                this.a(arrayList2, \u2603, \u2603);
            }
            else {
                this.a(a.m + "Invalid statistic/achievement!", \u2603, \u2603);
            }
        }
        bfl.f();
    }
    
    protected void a(final String \u2603, final boolean \u2603) {
    }
    
    protected boolean a(final eu \u2603) {
        if (\u2603 == null) {
            return false;
        }
        final et h = \u2603.b().h();
        if (r()) {
            if (\u2603.b().j() != null) {
                this.a(\u2603.b().j(), false);
            }
        }
        else if (h != null) {
            if (h.a() == et.a.a) {
                if (!this.j.t.o) {
                    return false;
                }
                try {
                    final URI uri = new URI(h.b());
                    final String scheme = uri.getScheme();
                    if (scheme == null) {
                        throw new URISyntaxException(h.b(), "Missing protocol");
                    }
                    if (!axu.f.contains(scheme.toLowerCase())) {
                        throw new URISyntaxException(h.b(), "Unsupported protocol: " + scheme.toLowerCase());
                    }
                    if (this.j.t.p) {
                        this.t = uri;
                        this.j.a(new aww(this, h.b(), 31102009, false));
                    }
                    else {
                        this.a(uri);
                    }
                }
                catch (URISyntaxException throwable) {
                    axu.a.error("Can't open url for " + h, throwable);
                }
            }
            else if (h.a() == et.a.b) {
                final URI uri = new File(h.b()).toURI();
                this.a(uri);
            }
            else if (h.a() == et.a.e) {
                this.a(h.b(), true);
            }
            else if (h.a() == et.a.c) {
                this.b(h.b(), false);
            }
            else if (h.a() == et.a.d) {
                final ChatUserInfo e = this.j.Y().e(h.b());
                if (e != null) {
                    this.j.a(new bab(this.j.Y(), e));
                }
                else {
                    axu.a.error("Tried to handle twitch user but couldn't find them!");
                }
            }
            else {
                axu.a.error("Don't know how to handle " + h);
            }
            return true;
        }
        return false;
    }
    
    public void f(final String \u2603) {
        this.b(\u2603, true);
    }
    
    public void b(final String \u2603, final boolean \u2603) {
        if (\u2603) {
            this.j.q.d().a(\u2603);
        }
        this.j.h.e(\u2603);
    }
    
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            for (int i = 0; i < this.n.size(); ++i) {
                final avs avs = this.n.get(i);
                if (avs.c(this.j, \u2603, \u2603)) {
                    (this.h = avs).a(this.j.W());
                    this.a(avs);
                }
            }
        }
    }
    
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        if (this.h != null && \u2603 == 0) {
            this.h.a(\u2603, \u2603);
            this.h = null;
        }
    }
    
    protected void a(final int \u2603, final int \u2603, final int \u2603, final long \u2603) {
    }
    
    protected void a(final avs \u2603) {
    }
    
    public void a(final ave \u2603, final int \u2603, final int \u2603) {
        this.j = \u2603;
        this.k = \u2603.ag();
        this.q = \u2603.k;
        this.l = \u2603;
        this.m = \u2603;
        this.n.clear();
        this.b();
    }
    
    public void b() {
    }
    
    public void p() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.k();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.l();
            }
        }
    }
    
    public void k() {
        final int \u2603 = Mouse.getEventX() * this.l / this.j.d;
        final int \u26032 = this.m - Mouse.getEventY() * this.m / this.j.e - 1;
        final int eventButton = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (this.j.t.A && this.s++ > 0) {
                return;
            }
            this.i = eventButton;
            this.r = ave.J();
            this.a(\u2603, \u26032, this.i);
        }
        else if (eventButton != -1) {
            if (this.j.t.A && --this.s > 0) {
                return;
            }
            this.i = -1;
            this.b(\u2603, \u26032, eventButton);
        }
        else if (this.i != -1 && this.r > 0L) {
            final long \u26033 = ave.J() - this.r;
            this.a(\u2603, \u26032, this.i, \u26033);
        }
    }
    
    public void l() {
        if (Keyboard.getEventKeyState()) {
            this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.j.Z();
    }
    
    public void e() {
    }
    
    public void m() {
    }
    
    public void c() {
        this.b_(0);
    }
    
    public void b_(final int \u2603) {
        if (this.j.f != null) {
            this.a(0, 0, this.l, this.m, -1072689136, -804253680);
        }
        else {
            this.c(\u2603);
        }
    }
    
    public void c(final int \u2603) {
        bfl.f();
        bfl.n();
        final bfx a = bfx.a();
        final bfd c = a.c();
        this.j.P().a(axu.b);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final float n = 32.0f;
        c.a(7, bms.i);
        c.b(0.0, this.m, 0.0).a(0.0, this.m / 32.0f + \u2603).b(64, 64, 64, 255).d();
        c.b(this.l, this.m, 0.0).a(this.l / 32.0f, this.m / 32.0f + \u2603).b(64, 64, 64, 255).d();
        c.b(this.l, 0.0, 0.0).a(this.l / 32.0f, \u2603).b(64, 64, 64, 255).d();
        c.b(0.0, 0.0, 0.0).a(0.0, \u2603).b(64, 64, 64, 255).d();
        a.b();
    }
    
    public boolean d() {
        return true;
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        if (\u2603 == 31102009) {
            if (\u2603) {
                this.a(this.t);
            }
            this.t = null;
            this.j.a(this);
        }
    }
    
    private void a(final URI \u2603) {
        try {
            final Class<?> forName = Class.forName("java.awt.Desktop");
            final Object invoke = forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            forName.getMethod("browse", URI.class).invoke(invoke, \u2603);
        }
        catch (Throwable throwable) {
            axu.a.error("Couldn't open link", throwable);
        }
    }
    
    public static boolean q() {
        if (ave.a) {
            return Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220);
        }
        return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
    }
    
    public static boolean r() {
        return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
    }
    
    public static boolean s() {
        return Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184);
    }
    
    public static boolean d(final int \u2603) {
        return \u2603 == 45 && q() && !r() && !s();
    }
    
    public static boolean e(final int \u2603) {
        return \u2603 == 47 && q() && !r() && !s();
    }
    
    public static boolean f(final int \u2603) {
        return \u2603 == 46 && q() && !r() && !s();
    }
    
    public static boolean g(final int \u2603) {
        return \u2603 == 30 && q() && !r() && !s();
    }
    
    public void b(final ave \u2603, final int \u2603, final int \u2603) {
        this.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = LogManager.getLogger();
        f = Sets.newHashSet("http", "https");
        g = Splitter.on('\n');
    }
}
