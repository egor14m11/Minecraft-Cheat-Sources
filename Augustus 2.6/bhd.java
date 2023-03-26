// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bhd<T extends akw>
{
    protected static final jy[] a;
    protected bhc b;
    
    public abstract void a(final T p0, final double p1, final double p2, final double p3, final float p4, final int p5);
    
    protected void a(final jy \u2603) {
        final bmj e = this.b.e;
        if (e != null) {
            e.a(\u2603);
        }
    }
    
    protected adm b() {
        return this.b.f;
    }
    
    public void a(final bhc \u2603) {
        this.b = \u2603;
    }
    
    public avn c() {
        return this.b.a();
    }
    
    public boolean a() {
        return false;
    }
    
    static {
        a = new jy[] { new jy("textures/blocks/destroy_stage_0.png"), new jy("textures/blocks/destroy_stage_1.png"), new jy("textures/blocks/destroy_stage_2.png"), new jy("textures/blocks/destroy_stage_3.png"), new jy("textures/blocks/destroy_stage_4.png"), new jy("textures/blocks/destroy_stage_5.png"), new jy("textures/blocks/destroy_stage_6.png"), new jy("textures/blocks/destroy_stage_7.png"), new jy("textures/blocks/destroy_stage_8.png"), new jy("textures/blocks/destroy_stage_9.png") };
    }
}
