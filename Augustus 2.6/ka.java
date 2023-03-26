// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ka extends cn
{
    public zx b(final ck \u2603, final zx \u2603) {
        final adm i = \u2603.i();
        final cz a = agg.a(\u2603);
        final cq b = agg.b(\u2603.f());
        final wv a2 = this.a(i, a);
        a2.c(b.g(), b.h() + 0.1f, b.i(), this.b(), this.a());
        i.d((pk)a2);
        \u2603.a(1);
        return \u2603;
    }
    
    @Override
    protected void a(final ck \u2603) {
        \u2603.i().b(1002, \u2603.d(), 0);
    }
    
    protected abstract wv a(final adm p0, final cz p1);
    
    protected float a() {
        return 6.0f;
    }
    
    protected float b() {
        return 1.1f;
    }
}
