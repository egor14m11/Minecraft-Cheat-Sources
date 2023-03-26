// 
// Decompiled by Procyon v0.5.36
// 

public class qj extends qe
{
    private final double a;
    private final double b;
    private String c;
    
    public qj(final qb \u2603, final String \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603);
        this.a = \u2603;
        this.b = \u2603;
        if (\u2603 > \u2603) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (\u2603 < \u2603) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (\u2603 > \u2603) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }
    
    public qj a(final String \u2603) {
        this.c = \u2603;
        return this;
    }
    
    public String g() {
        return this.c;
    }
    
    @Override
    public double a(double \u2603) {
        \u2603 = ns.a(\u2603, this.a, this.b);
        return \u2603;
    }
}
