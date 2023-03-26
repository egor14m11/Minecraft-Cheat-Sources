import org.lwjgl.input.Keyboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class axg extends axu
{
    private final axu a;
    private final bde f;
    private avw g;
    
    public axg(final axu \u2603, final bde \u2603) {
        this.a = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void e() {
        this.g.a();
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bnq.a("selectServer.select", new Object[0])));
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
        (this.g = new avw(2, this.q, this.l / 2 - 100, 116, 200, 20)).f(128);
        this.g.b(true);
        this.g.a(this.j.t.aE);
        this.n.get(0).l = (this.g.b().length() > 0 && this.g.b().split(":").length > 0);
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
        this.j.t.aE = this.g.b();
        this.j.t.b();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 1) {
            this.a.a(false, 0);
        }
        else if (\u2603.k == 0) {
            this.f.b = this.g.b();
            this.a.a(true, 0);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (this.g.a(\u2603, \u2603)) {
            this.n.get(0).l = (this.g.b().length() > 0 && this.g.b().split(":").length > 0);
        }
        else if (\u2603 == 28 || \u2603 == 156) {
            this.a(this.n.get(0));
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.g.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("selectServer.direct", new Object[0]), this.l / 2, 20, 16777215);
        this.c(this.q, bnq.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 10526880);
        this.g.g();
        super.a(\u2603, \u2603, \u2603);
    }
}
