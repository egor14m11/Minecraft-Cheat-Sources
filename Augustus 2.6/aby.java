// 
// Decompiled by Procyon v0.5.36
// 

public class aby
{
    private String[][] a;
    private Object[][] b;
    
    public aby() {
        this.a = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
        this.b = new Object[][] { { afi.f, afi.e, zy.j, zy.i, zy.k }, { zy.o, zy.s, zy.b, zy.w, zy.D }, { zy.n, zy.r, zy.a, zy.v, zy.C }, { zy.p, zy.t, zy.c, zy.x, zy.E }, { zy.I, zy.J, zy.K, zy.L, zy.M } };
    }
    
    public void a(final abt \u2603) {
        for (int i = 0; i < this.b[0].length; ++i) {
            final Object o = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                final zw \u26032 = (zw)this.b[j + 1][i];
                \u2603.a(new zx(\u26032), this.a[j], '#', zy.y, 'X', o);
            }
        }
        \u2603.a(new zx(zy.be), " #", "# ", '#', zy.j);
    }
}
