// 
// Decompiled by Procyon v0.5.36
// 

public class abz
{
    private String[][] a;
    private Object[][] b;
    
    public abz() {
        this.a = new String[][] { { "X", "X", "#" } };
        this.b = new Object[][] { { afi.f, afi.e, zy.j, zy.i, zy.k }, { zy.m, zy.q, zy.l, zy.u, zy.B } };
    }
    
    public void a(final abt \u2603) {
        for (int i = 0; i < this.b[0].length; ++i) {
            final Object o = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                final zw \u26032 = (zw)this.b[j + 1][i];
                \u2603.a(new zx(\u26032), this.a[j], '#', zy.y, 'X', o);
            }
        }
        \u2603.a(new zx(zy.f, 1), " #X", "# X", " #X", 'X', zy.F, '#', zy.y);
        \u2603.a(new zx(zy.g, 4), "X", "#", "Y", 'Y', zy.G, 'X', zy.ak, '#', zy.y);
    }
}
