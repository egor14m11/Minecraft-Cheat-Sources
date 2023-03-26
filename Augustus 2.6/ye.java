// 
// Decompiled by Procyon v0.5.36
// 

public class ye implements og
{
    private zx[] a;
    
    public ye() {
        this.a = new zx[1];
    }
    
    @Override
    public int o_() {
        return 1;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.a[0];
    }
    
    @Override
    public String e_() {
        return "Result";
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
    public zx a(final int \u2603, final int \u2603) {
        if (this.a[0] != null) {
            final zx zx = this.a[0];
            this.a[0] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.a[0] != null) {
            final zx zx = this.a[0];
            this.a[0] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.a[0] = \u2603;
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
}
