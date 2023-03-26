import org.apache.logging.log4j.LogManager;
import java.net.URI;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class axf extends axu
{
    private static final Logger a;
    private static final jy f;
    
    @Override
    public void b() {
        this.n.clear();
        final int n = -16;
        this.n.add(new avs(1, this.l / 2 - 116, this.m / 2 + 62 + n, 114, 20, bnq.a("demo.help.buy", new Object[0])));
        this.n.add(new avs(2, this.l / 2 + 2, this.m / 2 + 62 + n, 114, 20, bnq.a("demo.help.later", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        switch (\u2603.k) {
            case 2: {
                this.j.a((axu)null);
                this.j.n();
                break;
            }
            case 1: {
                \u2603.l = false;
                try {
                    final Class<?> forName = Class.forName("java.awt.Desktop");
                    final Object invoke = forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                    forName.getMethod("browse", URI.class).invoke(invoke, new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable throwable) {
                    axf.a.error("Couldn't open link", throwable);
                }
                break;
            }
        }
    }
    
    @Override
    public void e() {
        super.e();
    }
    
    @Override
    public void c() {
        super.c();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(axf.f);
        final int \u2603 = (this.l - 248) / 2;
        final int \u26032 = (this.m - 166) / 2;
        this.b(\u2603, \u26032, 0, 0, 248, 166);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        final int n = (this.l - 248) / 2 + 10;
        int n2 = (this.m - 166) / 2 + 8;
        this.q.a(bnq.a("demo.help.title", new Object[0]), n, n2, 2039583);
        n2 += 12;
        final avh t = this.j.t;
        this.q.a(bnq.a("demo.help.movementShort", avh.c(t.X.i()), avh.c(t.Y.i()), avh.c(t.Z.i()), avh.c(t.aa.i())), n, n2, 5197647);
        this.q.a(bnq.a("demo.help.movementMouse", new Object[0]), n, n2 + 12, 5197647);
        this.q.a(bnq.a("demo.help.jump", avh.c(t.ab.i())), n, n2 + 24, 5197647);
        this.q.a(bnq.a("demo.help.inventory", avh.c(t.ae.i())), n, n2 + 36, 5197647);
        this.q.a(bnq.a("demo.help.fullWrapped", new Object[0]), n, n2 + 68, 218, 2039583);
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = LogManager.getLogger();
        f = new jy("textures/gui/demo_background.png");
    }
}
