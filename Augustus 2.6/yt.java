// 
// Decompiled by Procyon v0.5.36
// 

public class yt extends zw
{
    public static final String[] a;
    
    public yt() {
        this.h = 1;
        this.d(384);
        this.a(yz.j);
    }
    
    @Override
    public void a(final zx \u2603, final adm \u2603, final wn \u2603, final int \u2603) {
        final boolean b = \u2603.bA.d || ack.a(aci.y.B, \u2603) > 0;
        if (b || \u2603.bi.b(zy.g)) {
            final int n = this.d(\u2603) - \u2603;
            float n2 = n / 20.0f;
            n2 = (n2 * n2 + n2 * 2.0f) / 3.0f;
            if (n2 < 0.1) {
                return;
            }
            if (n2 > 1.0f) {
                n2 = 1.0f;
            }
            final wq \u26032 = new wq(\u2603, \u2603, n2 * 2.0f);
            if (n2 == 1.0f) {
                \u26032.a(true);
            }
            final int a = ack.a(aci.v.B, \u2603);
            if (a > 0) {
                \u26032.b(\u26032.j() + a * 0.5 + 0.5);
            }
            final int a2 = ack.a(aci.w.B, \u2603);
            if (a2 > 0) {
                \u26032.a(a2);
            }
            if (ack.a(aci.x.B, \u2603) > 0) {
                \u26032.e(100);
            }
            \u2603.a(1, \u2603);
            \u2603.a((pk)\u2603, "random.bow", 1.0f, 1.0f / (yt.g.nextFloat() * 0.4f + 1.2f) + n2 * 0.5f);
            if (b) {
                \u26032.a = 2;
            }
            else {
                \u2603.bi.a(zy.g);
            }
            \u2603.b(na.ad[zw.b(this)]);
            if (!\u2603.D) {
                \u2603.d(\u26032);
            }
        }
    }
    
    @Override
    public zx b(final zx \u2603, final adm \u2603, final wn \u2603) {
        return \u2603;
    }
    
    @Override
    public int d(final zx \u2603) {
        return 72000;
    }
    
    @Override
    public aba e(final zx \u2603) {
        return aba.e;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.bA.d || \u2603.bi.b(zy.g)) {
            \u2603.a(\u2603, this.d(\u2603));
        }
        return \u2603;
    }
    
    @Override
    public int b() {
        return 1;
    }
    
    static {
        a = new String[] { "pulling_0", "pulling_1", "pulling_2" };
    }
}
