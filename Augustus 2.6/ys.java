// 
// Decompiled by Procyon v0.5.36
// 

public class ys extends zw
{
    public ys() {
        this.a(yz.k);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final auh a = this.a(\u2603, \u2603, true);
        if (a == null) {
            return \u2603;
        }
        if (a.a == auh.a.b) {
            final cj a2 = a.a();
            if (!\u2603.a(\u2603, a2)) {
                return \u2603;
            }
            if (!\u2603.a(a2.a(a.b), a.b, \u2603)) {
                return \u2603;
            }
            if (\u2603.p(a2).c().t() == arm.h) {
                --\u2603.b;
                \u2603.b(na.ad[zw.b(this)]);
                if (\u2603.b <= 0) {
                    return new zx(zy.bz);
                }
                if (!\u2603.bi.a(new zx(zy.bz))) {
                    \u2603.a(new zx(zy.bz, 1, 0), false);
                }
            }
        }
        return \u2603;
    }
}
