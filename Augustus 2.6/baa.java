import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import tv.twitch.ErrorCode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.GL11;
import java.net.URI;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class baa extends axu
{
    private static final Logger a;
    private final eu f;
    private final axu g;
    private final a h;
    private final List<fb> i;
    private final List<String> r;
    
    public baa(final axu \u2603, final a \u2603) {
        this(\u2603, \u2603, null);
    }
    
    public baa(final axu \u2603, final a \u2603, final List<fb> \u2603) {
        this.f = new fb("stream.unavailable.title", new Object[0]);
        this.r = (List<String>)Lists.newArrayList();
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
    }
    
    @Override
    public void b() {
        if (this.r.isEmpty()) {
            this.r.addAll(this.q.c(this.h.a().d(), (int)(this.l * 0.75f)));
            if (this.i != null) {
                this.r.add("");
                for (final fb fb : this.i) {
                    this.r.add(fb.e());
                }
            }
        }
        if (this.h.b() != null) {
            this.n.add(new avs(0, this.l / 2 - 155, this.m - 50, 150, 20, bnq.a("gui.cancel", new Object[0])));
            this.n.add(new avs(1, this.l / 2 - 155 + 160, this.m - 50, 150, 20, bnq.a(this.h.b().d(), new Object[0])));
        }
        else {
            this.n.add(new avs(0, this.l / 2 - 75, this.m - 50, 150, 20, bnq.a("gui.cancel", new Object[0])));
        }
    }
    
    @Override
    public void m() {
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        int max = Math.max((int)(this.m * 0.85 / 2.0 - this.r.size() * this.q.a / 2.0f), 50);
        this.a(this.q, this.f.d(), this.l / 2, max - this.q.a * 2, 16777215);
        for (final String \u26032 : this.r) {
            this.a(this.q, \u26032, this.l / 2, max, 10526880);
            max += this.q.a;
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 1) {
            switch (baa$1.a[this.h.ordinal()]) {
                case 1:
                case 2: {
                    this.a("https://account.mojang.com/me/settings");
                    break;
                }
                case 3: {
                    this.a("https://account.mojang.com/migrate");
                    break;
                }
                case 4: {
                    this.a("http://www.apple.com/osx/");
                    break;
                }
                case 5:
                case 6:
                case 7: {
                    this.a("http://bugs.mojang.com/browse/MC");
                    break;
                }
            }
        }
        this.j.a(this.g);
    }
    
    private void a(final String \u2603) {
        try {
            final Class<?> forName = Class.forName("java.awt.Desktop");
            final Object invoke = forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            forName.getMethod("browse", URI.class).invoke(invoke, new URI(\u2603));
        }
        catch (Throwable throwable) {
            baa.a.error("Couldn't open link", throwable);
        }
    }
    
    public static void a(final axu \u2603) {
        final ave a = ave.A();
        final bqm y = a.Y();
        if (!bqs.l) {
            final List<fb> list = (List<fb>)Lists.newArrayList();
            list.add(new fb("stream.unavailable.no_fbo.version", new Object[] { GL11.glGetString(7938) }));
            list.add(new fb("stream.unavailable.no_fbo.blend", new Object[] { GLContext.getCapabilities().GL_EXT_blend_func_separate }));
            list.add(new fb("stream.unavailable.no_fbo.arb", new Object[] { GLContext.getCapabilities().GL_ARB_framebuffer_object }));
            list.add(new fb("stream.unavailable.no_fbo.ext", new Object[] { GLContext.getCapabilities().GL_EXT_framebuffer_object }));
            a.a(new baa(\u2603, baa.a.a, list));
        }
        else if (y instanceof bqo) {
            if (((bqo)y).a().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
                a.a(new baa(\u2603, baa.a.b));
            }
            else {
                a.a(new baa(\u2603, baa.a.c));
            }
        }
        else if (!y.A() && y.B() == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch (baa$1.b[g.a().ordinal()]) {
                case 1: {
                    a.a(new baa(\u2603, baa.a.d));
                    break;
                }
                case 2: {
                    a.a(new baa(\u2603, baa.a.e));
                    break;
                }
                default: {
                    a.a(new baa(\u2603, baa.a.f));
                    break;
                }
            }
        }
        else if (!a.M().containsKey("twitch_access_token")) {
            if (a.L().f() == avm.a.a) {
                a.a(new baa(\u2603, baa.a.g));
            }
            else {
                a.a(new baa(\u2603, baa.a.h));
            }
        }
        else if (!y.C()) {
            switch (baa$1.c[y.E().ordinal()]) {
                case 1: {
                    a.a(new baa(\u2603, baa.a.i));
                    break;
                }
                default: {
                    a.a(new baa(\u2603, baa.a.j));
                    break;
                }
            }
        }
        else if (y.B() != null) {
            final List<fb> list = Arrays.asList(new fb("stream.unavailable.initialization_failure.extra", new Object[] { ErrorCode.getString(y.B()) }));
            a.a(new baa(\u2603, baa.a.k, list));
        }
        else {
            a.a(new baa(\u2603, baa.a.l));
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
    
    public enum a
    {
        a((eu)new fb("stream.unavailable.no_fbo", new Object[0])), 
        b((eu)new fb("stream.unavailable.library_arch_mismatch", new Object[0])), 
        c((eu)new fb("stream.unavailable.library_failure", new Object[0]), (eu)new fb("stream.unavailable.report_to_mojang", new Object[0])), 
        d((eu)new fb("stream.unavailable.not_supported.windows", new Object[0])), 
        e((eu)new fb("stream.unavailable.not_supported.mac", new Object[0]), (eu)new fb("stream.unavailable.not_supported.mac.okay", new Object[0])), 
        f((eu)new fb("stream.unavailable.not_supported.other", new Object[0])), 
        g((eu)new fb("stream.unavailable.account_not_migrated", new Object[0]), (eu)new fb("stream.unavailable.account_not_migrated.okay", new Object[0])), 
        h((eu)new fb("stream.unavailable.account_not_bound", new Object[0]), (eu)new fb("stream.unavailable.account_not_bound.okay", new Object[0])), 
        i((eu)new fb("stream.unavailable.failed_auth", new Object[0]), (eu)new fb("stream.unavailable.failed_auth.okay", new Object[0])), 
        j((eu)new fb("stream.unavailable.failed_auth_error", new Object[0])), 
        k((eu)new fb("stream.unavailable.initialization_failure", new Object[0]), (eu)new fb("stream.unavailable.report_to_mojang", new Object[0])), 
        l((eu)new fb("stream.unavailable.unknown", new Object[0]), (eu)new fb("stream.unavailable.report_to_mojang", new Object[0]));
        
        private final eu m;
        private final eu n;
        
        private a(final eu \u2603) {
            this(\u2603, null);
        }
        
        private a(final eu \u2603, final eu \u2603) {
            this.m = \u2603;
            this.n = \u2603;
        }
        
        public eu a() {
            return this.m;
        }
        
        public eu b() {
            return this.n;
        }
    }
}
