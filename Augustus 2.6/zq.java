// 
// Decompiled by Procyon v0.5.36
// 

public class zq extends zw
{
    public zq() {
        this.d(64);
        this.c(1);
        this.a(yz.i);
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
        if (\u2603.bG != null) {
            final int l = \u2603.bG.l();
            \u2603.a(l, \u2603);
            \u2603.bw();
        }
        else {
            \u2603.a((pk)\u2603, "random.bow", 0.5f, 0.4f / (zq.g.nextFloat() * 0.4f + 0.8f));
            if (!\u2603.D) {
                \u2603.d(new ur(\u2603, \u2603));
            }
            \u2603.bw();
            \u2603.b(na.ad[zw.b(this)]);
        }
        return \u2603;
    }
    
    @Override
    public boolean f_(final zx \u2603) {
        return super.f_(\u2603);
    }
    
    @Override
    public int b() {
        return 1;
    }
}
