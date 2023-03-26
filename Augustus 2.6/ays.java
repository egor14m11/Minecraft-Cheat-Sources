// 
// Decompiled by Procyon v0.5.36
// 

public class ays extends ayl
{
    private static final jy u;
    
    public ays(final wm \u2603, final adm \u2603) {
        this(\u2603, \u2603, cj.a);
    }
    
    public ays(final wm \u2603, final adm \u2603, final cj \u2603) {
        super(new xq(\u2603, \u2603, \u2603));
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(bnq.a("container.crafting", new Object[0]), 28, 6, 4210752);
        this.q.a(bnq.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ays.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
    }
    
    static {
        u = new jy("textures/gui/container/crafting_table.png");
    }
}
