import net.minecraft.realms.RealmsButton;

// 
// Decompiled by Procyon v0.5.36
// 

public class awp extends avs
{
    private RealmsButton o;
    
    public awp(final RealmsButton \u2603, final int \u2603, final int \u2603, final int \u2603, final String \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.o = \u2603;
    }
    
    public awp(final RealmsButton \u2603, final int \u2603, final int \u2603, final int \u2603, final String \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.o = \u2603;
    }
    
    public int c() {
        return super.k;
    }
    
    public boolean d() {
        return super.l;
    }
    
    public void b(final boolean \u2603) {
        super.l = \u2603;
    }
    
    public void a(final String \u2603) {
        super.j = \u2603;
    }
    
    @Override
    public int b() {
        return super.b();
    }
    
    public int e() {
        return super.i;
    }
    
    @Override
    public boolean c(final ave \u2603, final int \u2603, final int \u2603) {
        if (super.c(\u2603, \u2603, \u2603)) {
            this.o.clicked(\u2603, \u2603);
        }
        return super.c(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603) {
        this.o.released(\u2603, \u2603);
    }
    
    public void b(final ave \u2603, final int \u2603, final int \u2603) {
        this.o.renderBg(\u2603, \u2603);
    }
    
    public RealmsButton f() {
        return this.o;
    }
    
    public int a(final boolean \u2603) {
        return this.o.getYImage(\u2603);
    }
    
    public int c(final boolean \u2603) {
        return super.a(\u2603);
    }
    
    public int g() {
        return this.g;
    }
}
