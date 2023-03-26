import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class azu extends awd
{
    protected final ave u;
    protected final List<azp> v;
    
    public azu(final ave \u2603, final int \u2603, final int \u2603, final List<azp> \u2603) {
        super(\u2603, \u2603, \u2603, 32, \u2603 - 55 + 4, 36);
        this.u = \u2603;
        this.v = \u2603;
        this.k = false;
        this.a(true, (int)(\u2603.k.a * 1.5f));
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final bfx \u2603) {
        final String string = a.t + "" + a.r + this.e();
        this.u.k.a(string, \u2603 + this.b / 2 - this.u.k.a(string) / 2, Math.min(this.d + 3, \u2603), 16777215);
    }
    
    protected abstract String e();
    
    public List<azp> f() {
        return this.v;
    }
    
    @Override
    protected int b() {
        return this.f().size();
    }
    
    public azp c(final int \u2603) {
        return this.f().get(\u2603);
    }
    
    @Override
    public int c() {
        return this.b;
    }
    
    @Override
    protected int d() {
        return this.f - 6;
    }
}
