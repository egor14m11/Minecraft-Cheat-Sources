import com.google.common.base.Function;

// 
// Decompiled by Procyon v0.5.36
// 

public class aae extends yo
{
    protected final afh b;
    protected final Function<zx, String> c;
    
    public aae(final afh \u2603, final afh \u2603, final Function<zx, String> \u2603) {
        super(\u2603);
        this.b = \u2603;
        this.c = \u2603;
        this.d(0);
        this.a(true);
    }
    
    public aae(final afh \u2603, final afh \u2603, final String[] \u2603) {
        this(\u2603, \u2603, new Function<zx, String>() {
            public String a(final zx \u2603) {
                int i = \u2603.i();
                if (i < 0 || i >= \u2603.length) {
                    i = 0;
                }
                return \u2603[i];
            }
        });
    }
    
    @Override
    public int a(final int \u2603) {
        return \u2603;
    }
    
    @Override
    public String e_(final zx \u2603) {
        return super.a() + "." + this.c.apply(\u2603);
    }
}
