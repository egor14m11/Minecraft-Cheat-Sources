// 
// Decompiled by Procyon v0.5.36
// 

public class yw extends zw
{
    public yw() {
        this.a(yz.e);
        this.c(1);
        this.d(25);
    }
    
    @Override
    public boolean w_() {
        return true;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.au() && \u2603.m instanceof tt) {
            final tt tt = (tt)\u2603.m;
            if (tt.cm().h() && \u2603.j() - \u2603.i() >= 7) {
                tt.cm().g();
                \u2603.a(7, \u2603);
                if (\u2603.b == 0) {
                    final zx zx = new zx(zy.aR);
                    zx.d(\u2603.o());
                    return zx;
                }
            }
        }
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
}
