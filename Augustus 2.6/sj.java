// 
// Decompiled by Procyon v0.5.36
// 

public class sj extends rg
{
    private int e;
    private wi f;
    
    public sj(final wi \u2603) {
        super(\u2603, wi.class, 3.0f, 0.02f);
        this.f = \u2603;
    }
    
    @Override
    public void c() {
        super.c();
        if (this.f.cs() && this.b instanceof wi && ((wi)this.b).ct()) {
            this.e = 10;
        }
        else {
            this.e = 0;
        }
    }
    
    @Override
    public void e() {
        super.e();
        if (this.e > 0) {
            --this.e;
            if (this.e == 0) {
                final oq cq = this.f.cq();
                for (int i = 0; i < cq.o_(); ++i) {
                    final zx a = cq.a(i);
                    zx \u2603 = null;
                    if (a != null) {
                        final zw b = a.b();
                        if ((b == zy.P || b == zy.bS || b == zy.bR) && a.b > 3) {
                            final int \u26032 = a.b / 2;
                            final zx zx = a;
                            zx.b -= \u26032;
                            \u2603 = new zx(b, \u26032, a.i());
                        }
                        else if (b == zy.O && a.b > 5) {
                            final int \u26032 = a.b / 2 / 3 * 3;
                            final int \u26033 = \u26032 / 3;
                            final zx zx2 = a;
                            zx2.b -= \u26032;
                            \u2603 = new zx(zy.P, \u26033, 0);
                        }
                        if (a.b <= 0) {
                            cq.a(i, null);
                        }
                    }
                    if (\u2603 != null) {
                        final double \u26034 = this.f.t - 0.30000001192092896 + this.f.aS();
                        final uz \u26035 = new uz(this.f.o, this.f.s, \u26034, this.f.u, \u2603);
                        final float n = 0.3f;
                        final float ak = this.f.aK;
                        final float z = this.f.z;
                        \u26035.v = -ns.a(ak / 180.0f * 3.1415927f) * ns.b(z / 180.0f * 3.1415927f) * n;
                        \u26035.x = ns.b(ak / 180.0f * 3.1415927f) * ns.b(z / 180.0f * 3.1415927f) * n;
                        \u26035.w = -ns.a(z / 180.0f * 3.1415927f) * n + 0.1f;
                        \u26035.p();
                        this.f.o.d(\u26035);
                        break;
                    }
                }
            }
        }
    }
}
