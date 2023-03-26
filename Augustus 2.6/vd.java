// 
// Decompiled by Procyon v0.5.36
// 

public abstract class vd extends va implements oo
{
    private zx[] a;
    private boolean b;
    
    public vd(final adm \u2603) {
        super(\u2603);
        this.a = new zx[36];
        this.b = true;
    }
    
    public vd(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.a = new zx[36];
        this.b = true;
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (this.o.Q().b("doEntityDrops")) {
            oi.a(this.o, this, this);
        }
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.a[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.a[\u2603] == null) {
            return null;
        }
        if (this.a[\u2603].b <= \u2603) {
            final zx a = this.a[\u2603];
            this.a[\u2603] = null;
            return a;
        }
        final zx a = this.a[\u2603].a(\u2603);
        if (this.a[\u2603].b == 0) {
            this.a[\u2603] = null;
        }
        return a;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.a[\u2603] != null) {
            final zx zx = this.a[\u2603];
            this.a[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.a[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
    }
    
    @Override
    public void p_() {
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return !this.I && \u2603.h(this) <= 64.0;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return true;
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.aM() : "container.minecart";
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public void c(final int \u2603) {
        this.b = false;
        super.c(\u2603);
    }
    
    @Override
    public void J() {
        if (this.b) {
            oi.a(this.o, this, this);
        }
        super.J();
    }
    
    @Override
    protected void b(final dn \u2603) {
        super.b(\u2603);
        final du \u26032 = new du();
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.a[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
    }
    
    @Override
    protected void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.a = new zx[this.o_()];
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int n = b.d("Slot") & 0xFF;
            if (n >= 0 && n < this.a.length) {
                this.a[n] = zx.a(b);
            }
        }
    }
    
    @Override
    public boolean e(final wn \u2603) {
        if (!this.o.D) {
            \u2603.a((og)this);
        }
        return true;
    }
    
    @Override
    protected void o() {
        final int n = 15 - xi.b(this);
        final float n2 = 0.98f + n * 0.001f;
        this.v *= n2;
        this.w *= 0.0;
        this.x *= n2;
    }
    
    @Override
    public int a_(final int \u2603) {
        return 0;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public boolean r_() {
        return false;
    }
    
    @Override
    public void a(final on \u2603) {
    }
    
    @Override
    public on i() {
        return on.a;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
    }
}
