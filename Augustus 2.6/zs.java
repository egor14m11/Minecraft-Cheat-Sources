// 
// Decompiled by Procyon v0.5.36
// 

public class zs extends zw
{
    public final int a = 32;
    private final int b;
    private final float c;
    private final boolean d;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private float o;
    
    public zs(final int \u2603, final float \u2603, final boolean \u2603) {
        this.b = \u2603;
        this.d = \u2603;
        this.c = \u2603;
        this.a(yz.h);
    }
    
    public zs(final int \u2603, final boolean \u2603) {
        this(\u2603, 0.6f, \u2603);
    }
    
    @Override
    public zx b(final zx \u2603, final adm \u2603, final wn \u2603) {
        --\u2603.b;
        \u2603.cl().a(this, \u2603);
        \u2603.a((pk)\u2603, "random.burp", 0.5f, \u2603.s.nextFloat() * 0.1f + 0.9f);
        this.c(\u2603, \u2603, \u2603);
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
    
    protected void c(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (!\u2603.D && this.l > 0 && \u2603.s.nextFloat() < this.o) {
            \u2603.c(new pf(this.l, this.m * 20, this.n));
        }
    }
    
    @Override
    public int d(final zx \u2603) {
        return 32;
    }
    
    @Override
    public aba e(final zx \u2603) {
        return aba.b;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.j(this.k)) {
            \u2603.a(\u2603, this.d(\u2603));
        }
        return \u2603;
    }
    
    public int h(final zx \u2603) {
        return this.b;
    }
    
    public float i(final zx \u2603) {
        return this.c;
    }
    
    public boolean g() {
        return this.d;
    }
    
    public zs a(final int \u2603, final int \u2603, final int \u2603, final float \u2603) {
        this.l = \u2603;
        this.m = \u2603;
        this.n = \u2603;
        this.o = \u2603;
        return this;
    }
    
    public zs h() {
        this.k = true;
        return this;
    }
}
