import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class fa extends es
{
    private final String b;
    
    public fa(final String \u2603) {
        this.b = \u2603;
    }
    
    public String g() {
        return this.b;
    }
    
    @Override
    public String e() {
        return this.b;
    }
    
    public fa h() {
        final fa fa = new fa(this.b);
        fa.a(this.b().m());
        for (final eu eu : this.a()) {
            fa.a(eu.f());
        }
        return fa;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof fa) {
            final fa fa = (fa)\u2603;
            return this.b.equals(fa.g()) && super.equals(\u2603);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }
}
