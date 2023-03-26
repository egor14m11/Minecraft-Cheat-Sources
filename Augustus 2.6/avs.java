// 
// Decompiled by Procyon v0.5.36
// 

public class avs extends avp
{
    protected static final jy a;
    protected int f;
    protected int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public boolean l;
    public boolean m;
    protected boolean n;
    
    public avs(final int \u2603, final int \u2603, final int \u2603, final String \u2603) {
        this(\u2603, \u2603, \u2603, 200, 20, \u2603);
    }
    
    public avs(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final String \u2603) {
        this.f = 200;
        this.g = 20;
        this.l = true;
        this.m = true;
        this.k = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.j = \u2603;
    }
    
    protected int a(final boolean \u2603) {
        int n = 1;
        if (!this.l) {
            n = 0;
        }
        else if (\u2603) {
            n = 2;
        }
        return n;
    }
    
    public void a(final ave \u2603, final int \u2603, final int \u2603) {
        if (!this.m) {
            return;
        }
        final avn k = \u2603.k;
        \u2603.P().a(avs.a);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n = (\u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g);
        final int a = this.a(this.n);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.b(770, 771);
        this.b(this.h, this.i, 0, 46 + a * 20, this.f / 2, this.g);
        this.b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + a * 20, this.f / 2, this.g);
        this.b(\u2603, \u2603, \u2603);
        int \u26032 = 14737632;
        if (!this.l) {
            \u26032 = 10526880;
        }
        else if (this.n) {
            \u26032 = 16777120;
        }
        this.a(k, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, \u26032);
    }
    
    protected void b(final ave \u2603, final int \u2603, final int \u2603) {
    }
    
    public void a(final int \u2603, final int \u2603) {
    }
    
    public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
        return this.l && this.m && \u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g;
    }
    
    public boolean a() {
        return this.n;
    }
    
    public void b(final int \u2603, final int \u2603) {
    }
    
    public void a(final bpz \u2603) {
        \u2603.a(bpf.a(new jy("gui.button.press"), 1.0f));
    }
    
    public int b() {
        return this.f;
    }
    
    public void a(final int \u2603) {
        this.f = \u2603;
    }
    
    static {
        a = new jy("textures/gui/widgets.png");
    }
}
