// 
// Decompiled by Procyon v0.5.36
// 

public abstract class qe implements qb
{
    private final qb a;
    private final String b;
    private final double c;
    private boolean d;
    
    protected qe(final qb \u2603, final String \u2603, final double \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        if (\u2603 == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }
    
    @Override
    public String a() {
        return this.b;
    }
    
    @Override
    public double b() {
        return this.c;
    }
    
    @Override
    public boolean c() {
        return this.d;
    }
    
    public qe a(final boolean \u2603) {
        this.d = \u2603;
        return this;
    }
    
    @Override
    public qb d() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return \u2603 instanceof qb && this.b.equals(((qb)\u2603).a());
    }
}
