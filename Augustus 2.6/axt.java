import org.lwjgl.input.Keyboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class axt extends axu
{
    private axu a;
    private avw f;
    private final String g;
    
    public axt(final axu \u2603, final String \u2603) {
        this.a = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void e() {
        this.f.a();
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bnq.a("selectWorld.renameButton", new Object[0])));
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
        final atr f = this.j.f();
        final ato c = f.c(this.g);
        final String k = c.k();
        (this.f = new avw(2, this.q, this.l / 2 - 100, 60, 200, 20)).b(true);
        this.f.a(k);
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
            this.j.a(this.a);
        }
        else if (\u2603.k == 0) {
            final atr f = this.j.f();
            f.a(this.g, this.f.b().trim());
            this.j.a(this.a);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        this.f.a(\u2603, \u2603);
        this.n.get(0).l = (this.f.b().trim().length() > 0);
        if (\u2603 == 28 || \u2603 == 156) {
            this.a(this.n.get(0));
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.f.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("selectWorld.renameTitle", new Object[0]), this.l / 2, 20, 16777215);
        this.c(this.q, bnq.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, 10526880);
        this.f.g();
        super.a(\u2603, \u2603, \u2603);
    }
}
