// 
// Decompiled by Procyon v0.5.36
// 

public class zh extends yy
{
    protected zh() {
        this.a(yz.f);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final zx \u26032 = new zx(zy.bd, 1, \u2603.b("map"));
        final String string = "map_" + \u26032.i();
        final atg \u26033 = new atg(string);
        \u2603.a(string, \u26033);
        \u26033.e = 0;
        \u26033.a(\u2603.s, \u2603.u, \u26033.e);
        \u26033.d = (byte)\u2603.t.q();
        \u26033.c();
        --\u2603.b;
        if (\u2603.b <= 0) {
            return \u26032;
        }
        if (!\u2603.bi.a(\u26032.k())) {
            \u2603.a(\u26032, false);
        }
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
}
