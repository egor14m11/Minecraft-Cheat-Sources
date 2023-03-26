// 
// Decompiled by Procyon v0.5.36
// 

public class aqa
{
    private final int a;
    private alz b;
    private int c;
    private int d;
    
    public aqa(final int \u2603, final afh \u2603) {
        this(3, \u2603, \u2603);
    }
    
    public aqa(final int \u2603, final int \u2603, final afh \u2603) {
        this.c = 1;
        this.a = \u2603;
        this.c = \u2603;
        this.b = \u2603.Q();
    }
    
    public aqa(final int \u2603, final int \u2603, final afh \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603);
        this.b = \u2603.a(\u2603);
    }
    
    public int b() {
        return this.c;
    }
    
    public alz c() {
        return this.b;
    }
    
    private afh e() {
        return this.b.c();
    }
    
    private int f() {
        return this.b.c().c(this.b);
    }
    
    public int d() {
        return this.d;
    }
    
    public void b(final int \u2603) {
        this.d = \u2603;
    }
    
    @Override
    public String toString() {
        String str;
        if (this.a >= 3) {
            final jy jy = afh.c.c(this.e());
            str = ((jy == null) ? "null" : jy.toString());
            if (this.c > 1) {
                str = this.c + "*" + str;
            }
        }
        else {
            str = Integer.toString(afh.a(this.e()));
            if (this.c > 1) {
                str = this.c + "x" + str;
            }
        }
        final int f = this.f();
        if (f > 0) {
            str = str + ":" + f;
        }
        return str;
    }
}
