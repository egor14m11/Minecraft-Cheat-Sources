// 
// Decompiled by Procyon v0.5.36
// 

public class xp implements og
{
    private final zx[] a;
    private final int b;
    private final int c;
    private final xi d;
    
    public xp(final xi \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 * \u2603;
        this.a = new zx[n];
        this.d = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public int o_() {
        return this.a.length;
    }
    
    @Override
    public zx a(final int \u2603) {
        if (\u2603 >= this.o_()) {
            return null;
        }
        return this.a[\u2603];
    }
    
    public zx c(final int \u2603, final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.b || \u2603 < 0 || \u2603 > this.c) {
            return null;
        }
        return this.a(\u2603 + \u2603 * this.b);
    }
    
    @Override
    public String e_() {
        return "container.crafting";
    }
    
    @Override
    public boolean l_() {
        return false;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
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
    public zx a(final int \u2603, final int \u2603) {
        if (this.a[\u2603] == null) {
            return null;
        }
        if (this.a[\u2603].b <= \u2603) {
            final zx a = this.a[\u2603];
            this.a[\u2603] = null;
            this.d.a(this);
            return a;
        }
        final zx a = this.a[\u2603].a(\u2603);
        if (this.a[\u2603].b == 0) {
            this.a[\u2603] = null;
        }
        this.d.a(this);
        return a;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.a[\u2603] = \u2603;
        this.d.a(this);
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public void p_() {
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return true;
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
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
    }
    
    public int h() {
        return this.c;
    }
    
    public int i() {
        return this.b;
    }
}
