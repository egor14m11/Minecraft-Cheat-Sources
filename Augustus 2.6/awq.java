import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Mouse;
import net.minecraft.realms.RealmsClickableScrolledSelectionList;

// 
// Decompiled by Procyon v0.5.36
// 

public class awq extends awi
{
    private final RealmsClickableScrolledSelectionList u;
    
    public awq(final RealmsClickableScrolledSelectionList \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
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
        if (this.m > 0.0f && Mouse.getEventButtonState()) {
            this.u.customMouseEvent(this.d, this.e, this.t, this.n, this.h);
        }
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final Tezzelator \u2603) {
        this.u.renderSelected(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int b = this.b(), i = 0; i < b; ++i) {
            final int \u26032 = \u2603 + i * this.h + this.t;
            final int n = this.h - 4;
            if (\u26032 > this.e || \u26032 + n < this.d) {
                this.a(i, \u2603, \u26032);
            }
            if (this.r && this.a(i)) {
                this.a(this.b, \u26032, n, Tezzelator.instance);
            }
            this.a(i, \u2603, \u26032, n, \u2603, \u2603);
        }
    }
}
