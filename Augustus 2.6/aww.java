// 
// Decompiled by Procyon v0.5.36
// 

public class aww extends awy
{
    private final String r;
    private final String s;
    private final String t;
    private boolean u;
    
    public aww(final awx \u2603, final String \u2603, final int \u2603, final boolean \u2603) {
        super(\u2603, bnq.a(\u2603 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), \u2603, \u2603);
        this.u = true;
        this.g = bnq.a(\u2603 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.h = bnq.a(\u2603 ? "gui.cancel" : "gui.no", new Object[0]);
        this.s = bnq.a("chat.copy", new Object[0]);
        this.r = bnq.a("chat.link.warning", new Object[0]);
        this.t = \u2603;
    }
    
    @Override
    public void b() {
        super.b();
        this.n.clear();
        this.n.add(new avs(0, this.l / 2 - 50 - 105, this.m / 6 + 96, 100, 20, this.g));
        this.n.add(new avs(2, this.l / 2 - 50, this.m / 6 + 96, 100, 20, this.s));
        this.n.add(new avs(1, this.l / 2 - 50 + 105, this.m / 6 + 96, 100, 20, this.h));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 2) {
            this.a();
        }
        this.a.a(\u2603.k == 0, this.i);
    }
    
    public void a() {
        axu.e(this.t);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (this.u) {
            this.a(this.q, this.r, this.l / 2, 110, 16764108);
        }
    }
    
    public void f() {
        this.u = false;
    }
}
