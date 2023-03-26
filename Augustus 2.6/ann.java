// 
// Decompiled by Procyon v0.5.36
// 

public class ann extends anm
{
    public void b() {
        this.c = new aef(ady.x, 0.0f);
        this.d = true;
        this.e = true;
        this.g = -1;
    }
    
    @Override
    public aui b(final float \u2603, final float \u2603) {
        return new aui(0.20000000298023224, 0.029999999329447746, 0.029999999329447746);
    }
    
    @Override
    protected void a() {
        final float n = 0.1f;
        for (int i = 0; i <= 15; ++i) {
            final float n2 = 1.0f - i / 15.0f;
            this.f[i] = (1.0f - n2) / (n2 * 3.0f + 1.0f) * (1.0f - n) + n;
        }
    }
    
    @Override
    public amv c() {
        return new anw(this.b, this.b.P().s(), this.b.J());
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public float a(final long \u2603, final float \u2603) {
        return 0.5f;
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public boolean b(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public String k() {
        return "Nether";
    }
    
    @Override
    public String l() {
        return "_nether";
    }
    
    @Override
    public ams r() {
        return new ams() {
            @Override
            public double f() {
                return super.f() / 8.0;
            }
            
            @Override
            public double g() {
                return super.g() / 8.0;
            }
        };
    }
}
