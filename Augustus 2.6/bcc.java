// 
// Decompiled by Procyon v0.5.36
// 

public class bcc extends bbo
{
    bct a;
    bct b;
    bct c;
    bct d;
    
    public bcc(final int \u2603) {
        (this.a = new bct(this, 0, \u2603)).a(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        if (\u2603 > 0) {
            (this.a = new bct(this, 0, \u2603)).a(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            (this.b = new bct(this, 32, 0)).a(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.c = new bct(this, 32, 4)).a(1.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.d = new bct(this, 32, 8)).a(0.0f, 21.0f, -3.5f, 1, 1, 1);
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        if (this.b != null) {
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
        }
    }
}
