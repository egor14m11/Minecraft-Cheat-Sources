import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agb extends afm
{
    protected agb() {
        super(arm.l);
        final float n = 0.4f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.8f, 0.5f + n);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.o;
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.m || \u2603 == afi.cz || \u2603 == afi.cu || \u2603 == afi.d;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (\u2603.D || \u2603.bZ() == null || \u2603.bZ().b() != zy.be) {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else {
            \u2603.b(na.ab[afh.a(this)]);
            afh.a(\u2603, \u2603, new zx(afi.I, 1, 0));
        }
    }
}
