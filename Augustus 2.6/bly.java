import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bly implements bmk
{
    protected int a;
    protected boolean b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    
    public bly() {
        this.a = -1;
    }
    
    public void a(final boolean \u2603, final boolean \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        int param = -1;
        int param2 = -1;
        if (\u2603) {
            param = (\u2603 ? 9987 : 9729);
            param2 = 9729;
        }
        else {
            param = (\u2603 ? 9986 : 9728);
            param2 = 9728;
        }
        GL11.glTexParameteri(3553, 10241, param);
        GL11.glTexParameteri(3553, 10240, param2);
    }
    
    @Override
    public void b(final boolean \u2603, final boolean \u2603) {
        this.d = this.b;
        this.e = this.c;
        this.a(\u2603, \u2603);
    }
    
    @Override
    public void a() {
        this.a(this.d, this.e);
    }
    
    @Override
    public int b() {
        if (this.a == -1) {
            this.a = bml.a();
        }
        return this.a;
    }
    
    public void c() {
        if (this.a != -1) {
            bml.a(this.a);
            this.a = -1;
        }
    }
}
