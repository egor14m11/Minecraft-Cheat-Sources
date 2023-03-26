import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class alc extends alk implements og
{
    private static final Random f;
    private zx[] g;
    protected String a;
    
    public alc() {
        this.g = new zx[9];
    }
    
    @Override
    public int o_() {
        return 9;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.g[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.g[\u2603] == null) {
            return null;
        }
        if (this.g[\u2603].b <= \u2603) {
            final zx a = this.g[\u2603];
            this.g[\u2603] = null;
            this.p_();
            return a;
        }
        final zx a = this.g[\u2603].a(\u2603);
        if (this.g[\u2603].b == 0) {
            this.g[\u2603] = null;
        }
        this.p_();
        return a;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.g[\u2603] != null) {
            final zx zx = this.g[\u2603];
            this.g[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    public int m() {
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.g.length; ++i) {
            if (this.g[i] != null && alc.f.nextInt(n2++) == 0) {
                n = i;
            }
        }
        return n;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.g[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
        this.p_();
    }
    
    public int a(final zx \u2603) {
        for (int i = 0; i < this.g.length; ++i) {
            if (this.g[i] == null || this.g[i].b() == null) {
                this.a(i, \u2603);
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.a : "container.dispenser";
    }
    
    public void a(final String \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean l_() {
        return this.a != null;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.g = new zx[this.o_()];
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int n = b.d("Slot") & 0xFF;
            if (n >= 0 && n < this.g.length) {
                this.g[n] = zx.a(b);
            }
        }
        if (\u2603.b("CustomName", 8)) {
            this.a = \u2603.j("CustomName");
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final du \u26032 = new du();
        for (int i = 0; i < this.g.length; ++i) {
            if (this.g[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.g[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
        if (this.l_()) {
            \u2603.a("CustomName", this.a);
        }
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.b.s(this.c) == this && \u2603.e(this.c.n() + 0.5, this.c.o() + 0.5, this.c.p() + 0.5) <= 64.0;
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
    public String k() {
        return "minecraft:dispenser";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xr(\u2603, this);
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
    public void l() {
        for (int i = 0; i < this.g.length; ++i) {
            this.g[i] = null;
        }
    }
    
    static {
        f = new Random();
    }
}
