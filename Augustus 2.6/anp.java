// 
// Decompiled by Procyon v0.5.36
// 

public class anp extends anm
{
    public void b() {
        this.c = new aef(ady.y, 0.0f);
        this.g = 1;
        this.e = true;
    }
    
    @Override
    public amv c() {
        return new aob(this.b, this.b.J());
    }
    
    @Override
    public float a(final long \u2603, final float \u2603) {
        return 0.0f;
    }
    
    @Override
    public float[] a(final float \u2603, final float \u2603) {
        return null;
    }
    
    @Override
    public aui b(final float \u2603, final float \u2603) {
        final int n = 10518688;
        float a = ns.b(\u2603 * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        a = ns.a(a, 0.0f, 1.0f);
        float n2 = (n >> 16 & 0xFF) / 255.0f;
        float n3 = (n >> 8 & 0xFF) / 255.0f;
        float n4 = (n & 0xFF) / 255.0f;
        n2 *= a * 0.0f + 0.15f;
        n3 *= a * 0.0f + 0.15f;
        n4 *= a * 0.0f + 0.15f;
        return new aui(n2, n3, n4);
    }
    
    @Override
    public boolean g() {
        return false;
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public float f() {
        return 8.0f;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return this.b.c(new cj(\u2603, 0, \u2603)).t().c();
    }
    
    @Override
    public cj h() {
        return new cj(100, 50, 0);
    }
    
    @Override
    public int i() {
        return 50;
    }
    
    @Override
    public boolean b(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public String k() {
        return "The End";
    }
    
    @Override
    public String l() {
        return "_end";
    }
}
