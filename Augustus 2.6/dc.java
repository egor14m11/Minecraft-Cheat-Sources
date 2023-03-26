// 
// Decompiled by Procyon v0.5.36
// 

public class dc
{
    protected final float a;
    protected final float b;
    protected final float c;
    
    public dc(final float \u2603, final float \u2603, final float \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public dc(final du \u2603) {
        this.a = \u2603.e(0);
        this.b = \u2603.e(1);
        this.c = \u2603.e(2);
    }
    
    public du a() {
        final du du = new du();
        du.a(new dr(this.a));
        du.a(new dr(this.b));
        du.a(new dr(this.c));
        return du;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (!(\u2603 instanceof dc)) {
            return false;
        }
        final dc dc = (dc)\u2603;
        return this.a == dc.a && this.b == dc.b && this.c == dc.c;
    }
    
    public float b() {
        return this.a;
    }
    
    public float c() {
        return this.b;
    }
    
    public float d() {
        return this.c;
    }
}
