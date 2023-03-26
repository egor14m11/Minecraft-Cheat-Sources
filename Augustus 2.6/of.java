// 
// Decompiled by Procyon v0.5.36
// 

public class of implements oo
{
    private String a;
    private oo b;
    private oo c;
    
    public of(final String \u2603, oo \u2603, oo \u2603) {
        this.a = \u2603;
        if (\u2603 == null) {
            \u2603 = \u2603;
        }
        if (\u2603 == null) {
            \u2603 = \u2603;
        }
        this.b = \u2603;
        this.c = \u2603;
        if (\u2603.r_()) {
            \u2603.a(\u2603.i());
        }
        else if (\u2603.r_()) {
            \u2603.a(\u2603.i());
        }
    }
    
    @Override
    public int o_() {
        return this.b.o_() + this.c.o_();
    }
    
    public boolean a(final og \u2603) {
        return this.b == \u2603 || this.c == \u2603;
    }
    
    @Override
    public String e_() {
        if (this.b.l_()) {
            return this.b.e_();
        }
        if (this.c.l_()) {
            return this.c.e_();
        }
        return this.a;
    }
    
    @Override
    public boolean l_() {
        return this.b.l_() || this.c.l_();
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }
    
    @Override
    public zx a(final int \u2603) {
        if (\u2603 >= this.b.o_()) {
            return this.c.a(\u2603 - this.b.o_());
        }
        return this.b.a(\u2603);
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (\u2603 >= this.b.o_()) {
            return this.c.a(\u2603 - this.b.o_(), \u2603);
        }
        return this.b.a(\u2603, \u2603);
    }
    
    @Override
    public zx b(final int \u2603) {
        if (\u2603 >= this.b.o_()) {
            return this.c.b(\u2603 - this.b.o_());
        }
        return this.b.b(\u2603);
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        if (\u2603 >= this.b.o_()) {
            this.c.a(\u2603 - this.b.o_(), \u2603);
        }
        else {
            this.b.a(\u2603, \u2603);
        }
    }
    
    @Override
    public int q_() {
        return this.b.q_();
    }
    
    @Override
    public void p_() {
        this.b.p_();
        this.c.p_();
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.b.a(\u2603) && this.c.a(\u2603);
    }
    
    @Override
    public void b(final wn \u2603) {
        this.b.b(\u2603);
        this.c.b(\u2603);
    }
    
    @Override
    public void c(final wn \u2603) {
        this.b.c(\u2603);
        this.c.c(\u2603);
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
    public boolean r_() {
        return this.b.r_() || this.c.r_();
    }
    
    @Override
    public void a(final on \u2603) {
        this.b.a(\u2603);
        this.c.a(\u2603);
    }
    
    @Override
    public on i() {
        return this.b.i();
    }
    
    @Override
    public String k() {
        return this.b.k();
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xo(\u2603, this, \u2603);
    }
    
    @Override
    public void l() {
        this.b.l();
        this.c.l();
    }
}
