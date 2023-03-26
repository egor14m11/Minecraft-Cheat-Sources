// 
// Decompiled by Procyon v0.5.36
// 

public class alm extends akw
{
    public byte a;
    public boolean f;
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("note", this.a);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.d("note");
        this.a = (byte)ns.a(this.a, 0, 24);
    }
    
    public void b() {
        this.a = (byte)((this.a + 1) % 25);
        this.p_();
    }
    
    public void a(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603.a()).c().t() != arm.a) {
            return;
        }
        final arm t = \u2603.p(\u2603.b()).c().t();
        int \u26032 = 0;
        if (t == arm.e) {
            \u26032 = 1;
        }
        if (t == arm.p) {
            \u26032 = 2;
        }
        if (t == arm.s) {
            \u26032 = 3;
        }
        if (t == arm.d) {
            \u26032 = 4;
        }
        \u2603.c(\u2603, afi.B, \u26032, this.a);
    }
}
