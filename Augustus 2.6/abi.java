// 
// Decompiled by Procyon v0.5.36
// 

public class abi
{
    private String[][] a;
    private zw[][] b;
    
    public abi() {
        this.a = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
        this.b = new zw[][] { { zy.aF, zy.j, zy.i, zy.k }, { zy.Q, zy.Y, zy.ac, zy.ag }, { zy.R, zy.Z, zy.ad, zy.ah }, { zy.S, zy.aa, zy.ae, zy.ai }, { zy.T, zy.ab, zy.af, zy.aj } };
    }
    
    public void a(final abt \u2603) {
        for (int i = 0; i < this.b[0].length; ++i) {
            final zw zw = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                final zw \u26032 = this.b[j + 1][i];
                \u2603.a(new zx(\u26032), this.a[j], 'X', zw);
            }
        }
    }
}
