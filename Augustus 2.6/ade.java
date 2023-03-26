// 
// Decompiled by Procyon v0.5.36
// 

public class ade
{
    private cj a;
    private afh b;
    private int c;
    private int d;
    
    public ade(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.b = \u2603;
    }
    
    public cj a() {
        return this.a;
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    public afh d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (\u2603 instanceof ade) {
            final ade ade = (ade)\u2603;
            return this.a.equals(ade.a) && this.c == ade.c && this.d == ade.d && this.b == ade.b;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
    }
}
