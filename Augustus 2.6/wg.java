// 
// Decompiled by Procyon v0.5.36
// 

public class wg implements acy
{
    private ya a;
    private wn b;
    private ada c;
    private eu d;
    
    public wg(final wn \u2603, final eu \u2603) {
        this.b = \u2603;
        this.d = \u2603;
        this.a = new ya(\u2603, this);
    }
    
    @Override
    public wn v_() {
        return this.b;
    }
    
    @Override
    public void a_(final wn \u2603) {
    }
    
    @Override
    public ada b_(final wn \u2603) {
        return this.c;
    }
    
    @Override
    public void a(final ada \u2603) {
        this.c = \u2603;
    }
    
    @Override
    public void a(final acz \u2603) {
        \u2603.g();
    }
    
    @Override
    public void a_(final zx \u2603) {
    }
    
    @Override
    public eu f_() {
        if (this.d != null) {
            return this.d;
        }
        return new fb("entity.Villager.name", new Object[0]);
    }
}
