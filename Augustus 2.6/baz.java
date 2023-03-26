// 
// Decompiled by Procyon v0.5.36
// 

public class baz extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    
    public baz() {
        (this.a = new bct(this, 0, 0).b(64, 64)).a(0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.a.c = 1.0f;
        this.a.d = 7.0f;
        this.a.e = 15.0f;
        (this.c = new bct(this, 0, 0).b(64, 64)).a(-1.0f, -2.0f, -15.0f, 2, 4, 1, 0.0f);
        this.c.c = 8.0f;
        this.c.d = 7.0f;
        this.c.e = 15.0f;
        (this.b = new bct(this, 0, 19).b(64, 64)).a(0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.b.c = 1.0f;
        this.b.d = 6.0f;
        this.b.e = 1.0f;
    }
    
    public void a() {
        this.c.f = this.a.f;
        this.a.a(0.0625f);
        this.c.a(0.0625f);
        this.b.a(0.0625f);
    }
}
