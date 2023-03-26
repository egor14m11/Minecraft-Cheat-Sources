import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class ey extends es
{
    private final String b;
    
    public ey(final String \u2603) {
        this.b = \u2603;
    }
    
    public String g() {
        return this.b;
    }
    
    @Override
    public String e() {
        return this.b;
    }
    
    public ey h() {
        final ey ey = new ey(this.b);
        ey.a(this.b().m());
        for (final eu eu : this.a()) {
            ey.a(eu.f());
        }
        return ey;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof ey) {
            final ey ey = (ey)\u2603;
            return this.b.equals(ey.b) && super.equals(\u2603);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }
}
