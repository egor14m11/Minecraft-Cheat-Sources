// 
// Decompiled by Procyon v0.5.36
// 

public class azj implements awd.a
{
    private final azh c;
    protected final ave a;
    protected final bpq.a b;
    private long d;
    
    protected azj(final azh \u2603, final bpq.a \u2603) {
        this.d = 0L;
        this.c = \u2603;
        this.b = \u2603;
        this.a = ave.A();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        this.a.k.a(bnq.a("lanServer.title", new Object[0]), \u2603 + 32 + 3, \u2603 + 1, 16777215);
        this.a.k.a(this.b.a(), \u2603 + 32 + 3, \u2603 + 12, 8421504);
        if (this.a.t.x) {
            this.a.k.a(bnq.a("selectServer.hiddenAddress", new Object[0]), \u2603 + 32 + 3, \u2603 + 12 + 11, 3158064);
        }
        else {
            this.a.k.a(this.b.b(), \u2603 + 32 + 3, \u2603 + 12 + 11, 3158064);
        }
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.c.b(\u2603);
        if (ave.J() - this.d < 250L) {
            this.c.f();
        }
        this.d = ave.J();
        return false;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
    
    public bpq.a a() {
        return this.b;
    }
}
