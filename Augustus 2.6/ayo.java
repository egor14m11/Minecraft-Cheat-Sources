import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayo extends axu
{
    private static final Logger a;
    private static final jy f;
    private final wn g;
    private final zx h;
    private final boolean i;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private du y;
    private String z;
    private List<eu> A;
    private int B;
    private a C;
    private a D;
    private avs E;
    private avs F;
    private avs G;
    private avs H;
    
    public ayo(final wn \u2603, final zx \u2603, final boolean \u2603) {
        this.u = 192;
        this.v = 192;
        this.w = 1;
        this.z = "";
        this.B = -1;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        if (\u2603.n()) {
            final dn o = \u2603.o();
            this.y = o.c("pages", 8);
            if (this.y != null) {
                this.y = (du)this.y.b();
                this.w = this.y.c();
                if (this.w < 1) {
                    this.w = 1;
                }
            }
        }
        if (this.y == null && \u2603) {
            (this.y = new du()).a(new ea(""));
            this.w = 1;
        }
    }
    
    @Override
    public void e() {
        super.e();
        ++this.t;
    }
    
    @Override
    public void b() {
        this.n.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.i) {
            this.n.add(this.F = new avs(3, this.l / 2 - 100, 4 + this.v, 98, 20, bnq.a("book.signButton", new Object[0])));
            this.n.add(this.E = new avs(0, this.l / 2 + 2, 4 + this.v, 98, 20, bnq.a("gui.done", new Object[0])));
            this.n.add(this.G = new avs(5, this.l / 2 - 100, 4 + this.v, 98, 20, bnq.a("book.finalizeButton", new Object[0])));
            this.n.add(this.H = new avs(4, this.l / 2 + 2, 4 + this.v, 98, 20, bnq.a("gui.cancel", new Object[0])));
        }
        else {
            this.n.add(this.E = new avs(0, this.l / 2 - 100, 4 + this.v, 200, 20, bnq.a("gui.done", new Object[0])));
        }
        final int n = (this.l - this.u) / 2;
        final int n2 = 2;
        this.n.add(this.C = new a(1, n + 120, n2 + 154, true));
        this.n.add(this.D = new a(2, n + 38, n2 + 154, false));
        this.f();
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
    }
    
    private void f() {
        this.C.m = (!this.s && (this.x < this.w - 1 || this.i));
        this.D.m = (!this.s && this.x > 0);
        this.E.m = (!this.i || !this.s);
        if (this.i) {
            this.F.m = !this.s;
            this.H.m = this.s;
            this.G.m = this.s;
            this.G.l = (this.z.trim().length() > 0);
        }
    }
    
    private void a(final boolean \u2603) {
        if (!this.i || !this.r) {
            return;
        }
        if (this.y != null) {
            while (this.y.c() > 1) {
                final String f = this.y.f(this.y.c() - 1);
                if (f.length() != 0) {
                    break;
                }
                this.y.a(this.y.c() - 1);
            }
            if (this.h.n()) {
                final dn o = this.h.o();
                o.a("pages", this.y);
            }
            else {
                this.h.a("pages", this.y);
            }
            String f = "MC|BEdit";
            if (\u2603) {
                f = "MC|BSign";
                this.h.a("author", new ea(this.g.e_()));
                this.h.a("title", new ea(this.z.trim()));
                for (int i = 0; i < this.y.c(); ++i) {
                    String s = this.y.f(i);
                    final eu \u26032 = new fa(s);
                    s = eu.a.a(\u26032);
                    this.y.a(i, new ea(s));
                }
                this.h.a(zy.bN);
            }
            final em \u26033 = new em(Unpooled.buffer());
            \u26033.a(this.h);
            this.j.u().a(new im(f, \u26033));
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 0) {
            this.j.a((axu)null);
            this.a(false);
        }
        else if (\u2603.k == 3 && this.i) {
            this.s = true;
        }
        else if (\u2603.k == 1) {
            if (this.x < this.w - 1) {
                ++this.x;
            }
            else if (this.i) {
                this.g();
                if (this.x < this.w - 1) {
                    ++this.x;
                }
            }
        }
        else if (\u2603.k == 2) {
            if (this.x > 0) {
                --this.x;
            }
        }
        else if (\u2603.k == 5 && this.s) {
            this.a(true);
            this.j.a((axu)null);
        }
        else if (\u2603.k == 4 && this.s) {
            this.s = false;
        }
        this.f();
    }
    
    private void g() {
        if (this.y == null || this.y.c() >= 50) {
            return;
        }
        this.y.a(new ea(""));
        ++this.w;
        this.r = true;
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        super.a(\u2603, \u2603);
        if (!this.i) {
            return;
        }
        if (this.s) {
            this.c(\u2603, \u2603);
        }
        else {
            this.b(\u2603, \u2603);
        }
    }
    
    private void b(final char \u2603, final int \u2603) {
        if (axu.e(\u2603)) {
            this.b(axu.o());
            return;
        }
        switch (\u2603) {
            case 14: {
                final String h = this.h();
                if (h.length() > 0) {
                    this.a(h.substring(0, h.length() - 1));
                }
            }
            case 28:
            case 156: {
                this.b("\n");
            }
            default: {
                if (f.a(\u2603)) {
                    this.b(Character.toString(\u2603));
                }
            }
        }
    }
    
    private void c(final char \u2603, final int \u2603) {
        switch (\u2603) {
            case 14: {
                if (!this.z.isEmpty()) {
                    this.z = this.z.substring(0, this.z.length() - 1);
                    this.f();
                }
            }
            case 28:
            case 156: {
                if (!this.z.isEmpty()) {
                    this.a(true);
                    this.j.a((axu)null);
                }
            }
            default: {
                if (this.z.length() < 16 && f.a(\u2603)) {
                    this.z += Character.toString(\u2603);
                    this.f();
                    this.r = true;
                }
            }
        }
    }
    
    private String h() {
        if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
            return this.y.f(this.x);
        }
        return "";
    }
    
    private void a(final String \u2603) {
        if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
            this.y.a(this.x, new ea(\u2603));
            this.r = true;
        }
    }
    
    private void b(final String \u2603) {
        final String h = this.h();
        final String string = h + \u2603;
        final int b = this.q.b(string + "" + a.a + "_", 118);
        if (b <= 128 && string.length() < 256) {
            this.a(string);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayo.f);
        final int \u26032 = (this.l - this.u) / 2;
        final int \u26033 = 2;
        this.b(\u26032, \u26033, 0, 0, this.u, this.v);
        if (this.s) {
            String s = this.z;
            if (this.i) {
                if (this.t / 6 % 2 == 0) {
                    s = s + "" + a.a + "_";
                }
                else {
                    s = s + "" + a.h + "_";
                }
            }
            final String \u26034 = bnq.a("book.editTitle", new Object[0]);
            final int n = this.q.a(\u26034);
            this.q.a(\u26034, \u26032 + 36 + (116 - n) / 2, \u26033 + 16 + 16, 0);
            final int n2 = this.q.a(s);
            this.q.a(s, \u26032 + 36 + (116 - n2) / 2, \u26033 + 48, 0);
            final String a = bnq.a("book.byAuthor", this.g.e_());
            final int a2 = this.q.a(a);
            this.q.a(a.i + a, \u26032 + 36 + (116 - a2) / 2, \u26033 + 48 + 10, 0);
            final String a3 = bnq.a("book.finalizeWarning", new Object[0]);
            this.q.a(a3, \u26032 + 36, \u26033 + 80, 116, 0);
        }
        else {
            final String s = bnq.a("book.pageIndicator", this.x + 1, this.w);
            String \u26034 = "";
            if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
                \u26034 = this.y.f(this.x);
            }
            if (this.i) {
                if (this.q.b()) {
                    \u26034 += "_";
                }
                else if (this.t / 6 % 2 == 0) {
                    \u26034 = \u26034 + "" + a.a + "_";
                }
                else {
                    \u26034 = \u26034 + "" + a.h + "_";
                }
            }
            else if (this.B != this.x) {
                if (abd.b(this.h.o())) {
                    try {
                        final eu a4 = eu.a.a(\u26034);
                        this.A = ((a4 != null) ? avu.a(a4, 116, this.q, true, true) : null);
                    }
                    catch (JsonParseException ex) {
                        this.A = null;
                    }
                }
                else {
                    final fa elements = new fa(a.e.toString() + "* Invalid book tag *");
                    this.A = (List<eu>)Lists.newArrayList((Iterable<?>)elements);
                }
                this.B = this.x;
            }
            final int n = this.q.a(s);
            this.q.a(s, \u26032 - n + this.u - 44, \u26033 + 16, 0);
            if (this.A == null) {
                this.q.a(\u26034, \u26032 + 36, \u26033 + 16 + 16, 116, 0);
            }
            else {
                for (int n2 = Math.min(128 / this.q.a, this.A.size()), i = 0; i < n2; ++i) {
                    final eu eu = this.A.get(i);
                    this.q.a(eu.c(), \u26032 + 36, \u26033 + 16 + 16 + i * this.q.a, 0);
                }
                final eu b = this.b(\u2603, \u2603);
                if (b != null) {
                    this.a(b, \u2603, \u2603);
                }
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            final eu b = this.b(\u2603, \u2603);
            if (this.a(b)) {
                return;
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean a(final eu \u2603) {
        final et et = (\u2603 == null) ? null : \u2603.b().h();
        if (et == null) {
            return false;
        }
        if (et.a() == et.a.f) {
            final String b = et.b();
            try {
                final int x = Integer.parseInt(b) - 1;
                if (x >= 0 && x < this.w && x != this.x) {
                    this.x = x;
                    this.f();
                    return true;
                }
            }
            catch (Throwable t) {}
            return false;
        }
        final boolean a = super.a(\u2603);
        if (a && et.a() == et.a.c) {
            this.j.a((axu)null);
        }
        return a;
    }
    
    public eu b(final int \u2603, final int \u2603) {
        if (this.A == null) {
            return null;
        }
        final int n = \u2603 - (this.l - this.u) / 2 - 36;
        final int n2 = \u2603 - 2 - 16 - 16;
        if (n < 0 || n2 < 0) {
            return null;
        }
        final int min = Math.min(128 / this.q.a, this.A.size());
        if (n <= 116 && n2 < this.j.k.a * min + min) {
            final int n3 = n2 / this.j.k.a;
            if (n3 >= 0 && n3 < this.A.size()) {
                final eu eu = this.A.get(n3);
                int n4 = 0;
                for (final eu eu2 : eu) {
                    if (eu2 instanceof fa) {
                        n4 += this.j.k.a(((fa)eu2).g());
                        if (n4 > n) {
                            return eu2;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    static {
        a = LogManager.getLogger();
        f = new jy("textures/gui/book.png");
    }
    
    static class a extends avs
    {
        private final boolean o;
        
        public a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            super(\u2603, \u2603, \u2603, 23, 13, "");
            this.o = \u2603;
        }
        
        @Override
        public void a(final ave \u2603, final int \u2603, final int \u2603) {
            if (!this.m) {
                return;
            }
            final boolean b = \u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g;
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            \u2603.P().a(ayo.f);
            int \u26032 = 0;
            int \u26033 = 192;
            if (b) {
                \u26032 += 23;
            }
            if (!this.o) {
                \u26033 += 13;
            }
            this.b(this.h, this.i, \u26032, \u26033, 23, 13);
        }
    }
}
