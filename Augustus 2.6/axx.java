// 
// Decompiled by Procyon v0.5.36
// 

public class axx extends axu
{
    private final axu a;
    private String f;
    
    public axx(final axu \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void b() {
        int n = 0;
        this.f = bnq.a("options.skinCustomisation.title", new Object[0]);
        for (final wo \u2603 : wo.values()) {
            this.n.add(new a(\u2603.b(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), 150, 20, \u2603));
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 24 * (n >> 1), bnq.a("gui.done", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 200) {
            this.j.t.b();
            this.j.a(this.a);
        }
        else if (\u2603 instanceof a) {
            final wo a = ((a)\u2603).p;
            this.j.t.a(a);
            \u2603.j = this.a(a);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.f, this.l / 2, 20, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    private String a(final wo \u2603) {
        String str;
        if (this.j.t.d().contains(\u2603)) {
            str = bnq.a("options.on", new Object[0]);
        }
        else {
            str = bnq.a("options.off", new Object[0]);
        }
        return \u2603.d().d() + ": " + str;
    }
    
    class a extends avs
    {
        private final wo p;
        
        private a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final wo \u2603) {
            super(\u2603, \u2603, \u2603, \u2603, \u2603, axx.this.a(\u2603));
            this.p = \u2603;
        }
    }
}
