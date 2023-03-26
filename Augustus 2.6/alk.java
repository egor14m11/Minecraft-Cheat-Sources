// 
// Decompiled by Procyon v0.5.36
// 

public abstract class alk extends akw implements ol, oo
{
    private on a;
    
    public alk() {
        this.a = on.a;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = on.b(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.a != null) {
            this.a.a(\u2603);
        }
    }
    
    @Override
    public boolean r_() {
        return this.a != null && !this.a.a();
    }
    
    @Override
    public on i() {
        return this.a;
    }
    
    @Override
    public void a(final on \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }
}
