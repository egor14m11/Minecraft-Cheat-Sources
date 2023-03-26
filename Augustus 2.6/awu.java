// 
// Decompiled by Procyon v0.5.36
// 

public class awu extends axu
{
    private static final avh.a[] a;
    private final axu f;
    private final avh g;
    private String h;
    
    public awu(final axu \u2603, final avh \u2603) {
        this.f = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void b() {
        int n = 0;
        this.h = bnq.a("options.chat.title", new Object[0]);
        for (final avh.a \u2603 : awu.a) {
            if (\u2603.a()) {
                this.n.add(new awj(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), \u2603));
            }
            else {
                this.n.add(new awe(\u2603.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), \u2603, this.g.c(\u2603)));
            }
            ++n;
        }
        this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 120, bnq.a("gui.done", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k < 100 && \u2603 instanceof awe) {
            this.g.a(((awe)\u2603).c(), 1);
            \u2603.j = this.g.c(avh.a.a(\u2603.k));
        }
        if (\u2603.k == 200) {
            this.j.t.b();
            this.j.a(this.f);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.h, this.l / 2, 20, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = new avh.a[] { avh.a.p, avh.a.q, avh.a.r, avh.a.s, avh.a.t, avh.a.z, avh.a.B, avh.a.C, avh.a.A, avh.a.Q };
    }
}
