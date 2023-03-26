// 
// Decompiled by Procyon v0.5.36
// 

public class abr
{
    private Object[][] a;
    
    public abr() {
        this.a = new Object[][] { { afi.R, new zx(zy.k, 9) }, { afi.S, new zx(zy.j, 9) }, { afi.ah, new zx(zy.i, 9) }, { afi.bT, new zx(zy.bO, 9) }, { afi.y, new zx(zy.aW, 9, zd.l.b()) }, { afi.cn, new zx(zy.aC, 9) }, { afi.cA, new zx(zy.h, 9, 0) }, { afi.cx, new zx(zy.O, 9) }, { afi.cE, new zx(zy.aM, 9) } };
    }
    
    public void a(final abt \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            final afh \u26032 = (afh)this.a[i][0];
            final zx \u26033 = (zx)this.a[i][1];
            \u2603.a(new zx(\u26032), "###", "###", "###", '#', \u26033);
            \u2603.a(\u26033, "#", '#', \u26032);
        }
        \u2603.a(new zx(zy.k), "###", "###", "###", '#', zy.bx);
        \u2603.a(new zx(zy.bx, 9), "#", '#', zy.k);
    }
}
