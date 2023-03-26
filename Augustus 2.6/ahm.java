// 
// Decompiled by Procyon v0.5.36
// 

public class ahm extends ajg
{
    public ahm() {
        super(arm.b, arn.t);
        this.j(this.M.b().a(ahm.N, cq.a.b));
        this.a(yz.b);
    }
    
    @Override
    public alz a(final int \u2603) {
        cq.a a = cq.a.b;
        final int n = \u2603 & 0xC;
        if (n == 4) {
            a = cq.a.a;
        }
        else if (n == 8) {
            a = cq.a.c;
        }
        return this.Q().a(ahm.N, a);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        final cq.a a = \u2603.b(ahm.N);
        if (a == cq.a.a) {
            n |= 0x4;
        }
        else if (a == cq.a.c) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahm.N });
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(zw.a(this), 1, 0);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603).a(ahm.N, \u2603.k());
    }
}
