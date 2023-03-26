import org.apache.logging.log4j.LogManager;
import java.io.File;
import java.util.Collections;
import org.lwjgl.Sys;
import java.net.URI;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class azo extends axu
{
    private static final Logger a;
    private final axu f;
    private List<azp> g;
    private List<azp> h;
    private azt i;
    private azv r;
    private boolean s;
    
    public azo(final axu \u2603) {
        this.s = false;
        this.f = \u2603;
    }
    
    @Override
    public void b() {
        this.n.add(new awe(2, this.l / 2 - 154, this.m - 48, bnq.a("resourcePack.openFolder", new Object[0])));
        this.n.add(new awe(1, this.l / 2 + 4, this.m - 48, bnq.a("gui.done", new Object[0])));
        if (!this.s) {
            this.g = (List<azp>)Lists.newArrayList();
            this.h = (List<azp>)Lists.newArrayList();
            final bnm r = this.j.R();
            r.a();
            final List<bnm.a> arrayList = (List<bnm.a>)Lists.newArrayList((Iterable<?>)r.b());
            arrayList.removeAll(r.c());
            for (final bnm.a a : arrayList) {
                this.g.add(new azr(this, a));
            }
            for (final bnm.a a : Lists.reverse(r.c())) {
                this.h.add(new azr(this, a));
            }
            this.h.add(new azq(this));
        }
        (this.i = new azt(this.j, 200, this.m, this.g)).i(this.l / 2 - 4 - 200);
        this.i.d(7, 8);
        (this.r = new azv(this.j, 200, this.m, this.h)).i(this.l / 2 + 4);
        this.r.d(7, 8);
    }
    
    @Override
    public void k() {
        super.k();
        this.r.p();
        this.i.p();
    }
    
    public boolean a(final azp \u2603) {
        return this.h.contains(\u2603);
    }
    
    public List<azp> b(final azp \u2603) {
        if (this.a(\u2603)) {
            return this.h;
        }
        return this.g;
    }
    
    public List<azp> a() {
        return this.g;
    }
    
    public List<azp> f() {
        return this.h;
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 2) {
            final File d = this.j.R().d();
            final String absolutePath = d.getAbsolutePath();
            Label_0136: {
                if (g.a() == g.a.d) {
                    try {
                        azo.a.info(absolutePath);
                        Runtime.getRuntime().exec(new String[] { "/usr/bin/open", absolutePath });
                        return;
                    }
                    catch (IOException throwable) {
                        azo.a.error("Couldn't open file", throwable);
                        break Label_0136;
                    }
                }
                if (g.a() == g.a.c) {
                    final String format = String.format("cmd.exe /C start \"Open file\" \"%s\"", absolutePath);
                    try {
                        Runtime.getRuntime().exec(format);
                        return;
                    }
                    catch (IOException throwable2) {
                        azo.a.error("Couldn't open file", throwable2);
                    }
                }
            }
            boolean b = false;
            try {
                final Class<?> forName = Class.forName("java.awt.Desktop");
                final Object invoke = forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                forName.getMethod("browse", URI.class).invoke(invoke, d.toURI());
            }
            catch (Throwable throwable3) {
                azo.a.error("Couldn't open link", throwable3);
                b = true;
            }
            if (b) {
                azo.a.info("Opening via system class!");
                Sys.openURL("file://" + absolutePath);
            }
        }
        else if (\u2603.k == 1) {
            if (this.s) {
                final List<bnm.a> arrayList = (List<bnm.a>)Lists.newArrayList();
                for (final azp azp : this.h) {
                    if (azp instanceof azr) {
                        arrayList.add(((azr)azp).j());
                    }
                }
                Collections.reverse(arrayList);
                this.j.R().a(arrayList);
                this.j.t.k.clear();
                this.j.t.l.clear();
                for (final bnm.a a : arrayList) {
                    this.j.t.k.add(a.d());
                    if (a.f() != 1) {
                        this.j.t.l.add(a.d());
                    }
                }
                this.j.t.b();
                this.j.e();
            }
            this.j.a(this.f);
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.i.b(\u2603, \u2603, \u2603);
        this.r.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c(0);
        this.i.a(\u2603, \u2603, \u2603);
        this.r.a(\u2603, \u2603, \u2603);
        this.a(this.q, bnq.a("resourcePack.title", new Object[0]), this.l / 2, 16, 16777215);
        this.a(this.q, bnq.a("resourcePack.folderInfo", new Object[0]), this.l / 2 - 77, this.m - 26, 8421504);
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void g() {
        this.s = true;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
