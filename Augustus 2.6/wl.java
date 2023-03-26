// 
// Decompiled by Procyon v0.5.36
// 

public class wl
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private float f;
    private float g;
    
    public wl() {
        this.e = true;
        this.f = 0.05f;
        this.g = 0.1f;
    }
    
    public void a(final dn \u2603) {
        final dn \u26032 = new dn();
        \u26032.a("invulnerable", this.a);
        \u26032.a("flying", this.b);
        \u26032.a("mayfly", this.c);
        \u26032.a("instabuild", this.d);
        \u26032.a("mayBuild", this.e);
        \u26032.a("flySpeed", this.f);
        \u26032.a("walkSpeed", this.g);
        \u2603.a("abilities", \u26032);
    }
    
    public void b(final dn \u2603) {
        if (\u2603.b("abilities", 10)) {
            final dn m = \u2603.m("abilities");
            this.a = m.n("invulnerable");
            this.b = m.n("flying");
            this.c = m.n("mayfly");
            this.d = m.n("instabuild");
            if (m.b("flySpeed", 99)) {
                this.f = m.h("flySpeed");
                this.g = m.h("walkSpeed");
            }
            if (m.b("mayBuild", 1)) {
                this.e = m.n("mayBuild");
            }
        }
    }
    
    public float a() {
        return this.f;
    }
    
    public void a(final float \u2603) {
        this.f = \u2603;
    }
    
    public float b() {
        return this.g;
    }
    
    public void b(final float \u2603) {
        this.g = \u2603;
    }
}
