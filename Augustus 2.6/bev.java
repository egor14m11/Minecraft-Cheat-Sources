// 
// Decompiled by Procyon v0.5.36
// 

public class bev extends beu
{
    private final avh e;
    
    public bev(final avh \u2603) {
        this.e = \u2603;
    }
    
    @Override
    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        if (this.e.X.d()) {
            ++this.b;
        }
        if (this.e.Z.d()) {
            --this.b;
        }
        if (this.e.Y.d()) {
            ++this.a;
        }
        if (this.e.aa.d()) {
            --this.a;
        }
        this.c = this.e.ab.d();
        this.d = this.e.ac.d();
        if (this.d) {
            this.a *= (float)0.3;
            this.b *= (float)0.3;
        }
    }
}
