// 
// Decompiled by Procyon v0.5.36
// 

public class mq extends mw
{
    public final int a;
    public final int b;
    public final mq c;
    private final String k;
    private ms l;
    public final zx d;
    private boolean m;
    
    public mq(final String \u2603, final String \u2603, final int \u2603, final int \u2603, final zw \u2603, final mq \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, new zx(\u2603), \u2603);
    }
    
    public mq(final String \u2603, final String \u2603, final int \u2603, final int \u2603, final afh \u2603, final mq \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, new zx(\u2603), \u2603);
    }
    
    public mq(final String \u2603, final String \u2603, final int \u2603, final int \u2603, final zx \u2603, final mq \u2603) {
        super(\u2603, new fb("achievement." + \u2603, new Object[0]));
        this.d = \u2603;
        this.k = "achievement." + \u2603 + ".desc";
        this.a = \u2603;
        this.b = \u2603;
        if (\u2603 < mr.a) {
            mr.a = \u2603;
        }
        if (\u2603 < mr.b) {
            mr.b = \u2603;
        }
        if (\u2603 > mr.c) {
            mr.c = \u2603;
        }
        if (\u2603 > mr.d) {
            mr.d = \u2603;
        }
        this.c = \u2603;
    }
    
    public mq a() {
        this.f = true;
        return this;
    }
    
    public mq b() {
        this.m = true;
        return this;
    }
    
    public mq c() {
        super.h();
        mr.e.add(this);
        return this;
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public eu e() {
        final eu e = super.e();
        e.b().a(this.g() ? a.f : a.k);
        return e;
    }
    
    public mq a(final Class<? extends mz> \u2603) {
        return (mq)super.b(\u2603);
    }
    
    public String f() {
        if (this.l != null) {
            return this.l.a(di.a(this.k));
        }
        return di.a(this.k);
    }
    
    public mq a(final ms \u2603) {
        this.l = \u2603;
        return this;
    }
    
    public boolean g() {
        return this.m;
    }
}
