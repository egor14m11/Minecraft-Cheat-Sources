// 
// Decompiled by Procyon v0.5.36
// 

public class bnr implements Comparable<bnr>
{
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    
    public bnr(final String \u2603, final String \u2603, final String \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public String a() {
        return this.a;
    }
    
    public boolean b() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", this.c, this.b);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return this == \u2603 || (\u2603 instanceof bnr && this.a.equals(((bnr)\u2603).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public int a(final bnr \u2603) {
        return this.a.compareTo(\u2603.a);
    }
}
