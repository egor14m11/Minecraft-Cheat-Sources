// 
// Decompiled by Procyon v0.5.36
// 

public class acz
{
    private zx a;
    private zx b;
    private zx c;
    private int d;
    private int e;
    private boolean f;
    
    public acz(final dn \u2603) {
        this.a(\u2603);
    }
    
    public acz(final zx \u2603, final zx \u2603, final zx \u2603) {
        this(\u2603, \u2603, \u2603, 0, 7);
    }
    
    public acz(final zx \u2603, final zx \u2603, final zx \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = true;
    }
    
    public acz(final zx \u2603, final zx \u2603) {
        this(\u2603, null, \u2603);
    }
    
    public acz(final zx \u2603, final zw \u2603) {
        this(\u2603, new zx(\u2603));
    }
    
    public zx a() {
        return this.a;
    }
    
    public zx b() {
        return this.b;
    }
    
    public boolean c() {
        return this.b != null;
    }
    
    public zx d() {
        return this.c;
    }
    
    public int e() {
        return this.d;
    }
    
    public int f() {
        return this.e;
    }
    
    public void g() {
        ++this.d;
    }
    
    public void a(final int \u2603) {
        this.e += \u2603;
    }
    
    public boolean h() {
        return this.d >= this.e;
    }
    
    public void i() {
        this.d = this.e;
    }
    
    public boolean j() {
        return this.f;
    }
    
    public void a(final dn \u2603) {
        final dn m = \u2603.m("buy");
        this.a = zx.a(m);
        final dn i = \u2603.m("sell");
        this.c = zx.a(i);
        if (\u2603.b("buyB", 10)) {
            this.b = zx.a(\u2603.m("buyB"));
        }
        if (\u2603.b("uses", 99)) {
            this.d = \u2603.f("uses");
        }
        if (\u2603.b("maxUses", 99)) {
            this.e = \u2603.f("maxUses");
        }
        else {
            this.e = 7;
        }
        if (\u2603.b("rewardExp", 1)) {
            this.f = \u2603.n("rewardExp");
        }
        else {
            this.f = true;
        }
    }
    
    public dn k() {
        final dn dn = new dn();
        dn.a("buy", this.a.b(new dn()));
        dn.a("sell", this.c.b(new dn()));
        if (this.b != null) {
            dn.a("buyB", this.b.b(new dn()));
        }
        dn.a("uses", this.d);
        dn.a("maxUses", this.e);
        dn.a("rewardExp", this.f);
        return dn;
    }
}
