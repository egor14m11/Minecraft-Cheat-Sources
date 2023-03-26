import net.minecraft.realms.RealmsScrolledSelectionList;

// 
// Decompiled by Procyon v0.5.36
// 

public class aws extends awi
{
    private final RealmsScrolledSelectionList u;
    
    public aws(final RealmsScrolledSelectionList \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(ave.A(), \u2603, \u2603, \u2603, \u2603, \u2603);
        this.u = \u2603;
    }
    
    @Override
    protected int b() {
        return this.u.getItemCount();
    }
    
    @Override
    protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        this.u.selectItem(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean a(final int \u2603) {
        return this.u.isSelectedItem(\u2603);
    }
    
    @Override
    protected void a() {
        this.u.renderBackground();
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.u.renderItem(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public int e() {
        return super.b;
    }
    
    public int f() {
        return super.j;
    }
    
    public int g() {
        return super.i;
    }
    
    @Override
    protected int k() {
        return this.u.getMaxPosition();
    }
    
    @Override
    protected int d() {
        return this.u.getScrollbarPosition();
    }
    
    @Override
    public void p() {
        super.p();
    }
}
