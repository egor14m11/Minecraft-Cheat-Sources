// 
// Decompiled by Procyon v0.5.36
// 

public class ry extends rd
{
    private ps a;
    private double b;
    private double c;
    private int d;
    
    public ry(final ps \u2603) {
        this.a = \u2603;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        return this.a.bc().nextFloat() < 0.02f;
    }
    
    @Override
    public boolean b() {
        return this.d >= 0;
    }
    
    @Override
    public void c() {
        final double n = 6.283185307179586 * this.a.bc().nextDouble();
        this.b = Math.cos(n);
        this.c = Math.sin(n);
        this.d = 20 + this.a.bc().nextInt(20);
    }
    
    @Override
    public void e() {
        --this.d;
        this.a.p().a(this.a.s + this.b, this.a.t + this.a.aS(), this.a.u + this.c, 10.0f, (float)this.a.bQ());
    }
}
