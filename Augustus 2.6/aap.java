// 
// Decompiled by Procyon v0.5.36
// 

public class aap extends zw
{
    public aap() {
        this.c(1);
        this.d(238);
        this.a(yz.i);
    }
    
    @Override
    public boolean a(final zx \u2603, final adm \u2603, final afh \u2603, final cj \u2603, final pr \u2603) {
        if (\u2603.t() == arm.j || \u2603 == afi.G || \u2603 == afi.H || \u2603 == afi.bn || \u2603 == afi.bS || \u2603 == afi.L) {
            \u2603.a(1, \u2603);
            return true;
        }
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean b(final afh \u2603) {
        return \u2603 == afi.G || \u2603 == afi.af || \u2603 == afi.bS;
    }
    
    @Override
    public float a(final zx \u2603, final afh \u2603) {
        if (\u2603 == afi.G || \u2603.t() == arm.j) {
            return 15.0f;
        }
        if (\u2603 == afi.L) {
            return 5.0f;
        }
        return super.a(\u2603, \u2603);
    }
}
