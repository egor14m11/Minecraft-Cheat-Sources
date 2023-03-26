// 
// Decompiled by Procyon v0.5.36
// 

public class zk extends zw
{
    public zk() {
        this.h = 16;
        this.a(yz.f);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.bA.d) {
            return \u2603;
        }
        --\u2603.b;
        \u2603.a((pk)\u2603, "random.bow", 0.5f, 0.4f / (zk.g.nextFloat() * 0.4f + 0.8f));
        if (!\u2603.D) {
            \u2603.d(new xa(\u2603, \u2603));
        }
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
}
