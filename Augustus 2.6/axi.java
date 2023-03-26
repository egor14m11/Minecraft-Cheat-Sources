import org.lwjgl.input.Keyboard;
import java.net.IDN;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class axi extends axu
{
    private final axu a;
    private final bde f;
    private avw g;
    private avw h;
    private avs i;
    private Predicate<String> r;
    
    public axi(final axu \u2603, final bde \u2603) {
        this.r = new Predicate<String>() {
            public boolean a(final String \u2603) {
                if (\u2603.length() == 0) {
                    return true;
                }
                final String[] split = \u2603.split(":");
                if (split.length == 0) {
                    return true;
                }
                try {
                    final String ascii = IDN.toASCII(split[0]);
                    return true;
                }
                catch (IllegalArgumentException ex) {
                    return false;
                }
            }
        };
        this.a = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void e() {
        this.h.a();
        this.g.a();
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 18, bnq.a("addServer.add", new Object[0])));
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 18, bnq.a("gui.cancel", new Object[0])));
        this.n.add(this.i = new avs(2, this.l / 2 - 100, this.m / 4 + 72, bnq.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d()));
        (this.h = new avw(0, this.q, this.l / 2 - 100, 66, 200, 20)).b(true);
        this.h.a(this.f.a);
        (this.g = new avw(1, this.q, this.l / 2 - 100, 106, 200, 20)).f(128);
        this.g.a(this.f.b);
        this.g.a(this.r);
        this.n.get(0).l = (this.g.b().length() > 0 && this.g.b().split(":").length > 0 && this.h.b().length() > 0);
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
        if (\u2603.k == 2) {
            this.f.a(bde.a.values()[(this.f.b().ordinal() + 1) % bde.a.values().length]);
            this.i.j = bnq.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d();
        }
        else if (\u2603.k == 1) {
            this.a.a(false, 0);
        }
        else if (\u2603.k == 0) {
            this.f.a = this.h.b();
            this.f.b = this.g.b();
            this.a.a(true, 0);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        this.h.a(\u2603, \u2603);
        this.g.a(\u2603, \u2603);
        if (\u2603 == 15) {
            this.h.b(!this.h.m());
            this.g.b(!this.g.m());
        }
        if (\u2603 == 28 || \u2603 == 156) {
            this.a(this.n.get(0));
        }
        this.n.get(0).l = (this.g.b().length() > 0 && this.g.b().split(":").length > 0 && this.h.b().length() > 0);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.g.a(\u2603, \u2603, \u2603);
        this.h.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("addServer.title", new Object[0]), this.l / 2, 17, 16777215);
        this.c(this.q, bnq.a("addServer.enterName", new Object[0]), this.l / 2 - 100, 53, 10526880);
        this.c(this.q, bnq.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 94, 10526880);
        this.h.g();
        this.g.g();
        super.a(\u2603, \u2603, \u2603);
    }
}
