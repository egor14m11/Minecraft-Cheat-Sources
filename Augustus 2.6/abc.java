// 
// Decompiled by Procyon v0.5.36
// 

public class abc extends zw
{
    public abc() {
        this.c(1);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        \u2603.a(\u2603);
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
    
    public static boolean b(final dn \u2603) {
        if (\u2603 == null) {
            return false;
        }
        if (!\u2603.b("pages", 9)) {
            return false;
        }
        final du c = \u2603.c("pages", 8);
        for (int i = 0; i < c.c(); ++i) {
            final String f = c.f(i);
            if (f == null) {
                return false;
            }
            if (f.length() > 32767) {
                return false;
            }
        }
        return true;
    }
}
