// 
// Decompiled by Procyon v0.5.36
// 

public class aaz extends yo
{
    private final afh b;
    private String[] c;
    
    public aaz(final afh \u2603, final boolean \u2603) {
        super(\u2603);
        this.b = \u2603;
        if (\u2603) {
            this.d(0);
            this.a(true);
        }
    }
    
    @Override
    public int a(final zx \u2603, final int \u2603) {
        return this.b.h(this.b.a(\u2603.i()));
    }
    
    @Override
    public int a(final int \u2603) {
        return \u2603;
    }
    
    public aaz a(final String[] \u2603) {
        this.c = \u2603;
        return this;
    }
    
    @Override
    public String e_(final zx \u2603) {
        if (this.c == null) {
            return super.e_(\u2603);
        }
        final int i = \u2603.i();
        if (i >= 0 && i < this.c.length) {
            return super.e_(\u2603) + "." + this.c[i];
        }
        return super.e_(\u2603);
    }
}
