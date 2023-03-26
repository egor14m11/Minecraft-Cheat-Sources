// 
// Decompiled by Procyon v0.5.36
// 

public class arw extends ase
{
    private ady[] c;
    private ady[] d;
    private ady[] e;
    private ady[] f;
    private final ant g;
    
    public arw(final long \u2603, final ase \u2603, final adr \u2603, final String \u2603) {
        super(\u2603);
        this.c = new ady[] { ady.r, ady.r, ady.r, ady.Y, ady.Y, ady.q };
        this.d = new ady[] { ady.t, ady.S, ady.s, ady.q, ady.Q, ady.v };
        this.e = new ady[] { ady.t, ady.s, ady.u, ady.q };
        this.f = new ady[] { ady.B, ady.B, ady.B, ady.T };
        this.a = \u2603;
        if (\u2603 == adr.h) {
            this.c = new ady[] { ady.r, ady.t, ady.s, ady.v, ady.q, ady.u };
            this.g = null;
        }
        else if (\u2603 == adr.f) {
            this.g = ant.a.a(\u2603).b();
        }
        else {
            this.g = null;
        }
    }
    
    @Override
    public int[] a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[] a = this.a.a(\u2603, \u2603, \u2603, \u2603);
        final int[] a2 = asc.a(\u2603 * \u2603);
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.a(j + \u2603, (long)(i + \u2603));
                int \u26032 = a[j + i * \u2603];
                final int n = (\u26032 & 0xF00) >> 8;
                \u26032 &= 0xFFFFF0FF;
                if (this.g != null && this.g.F >= 0) {
                    a2[j + i * \u2603] = this.g.F;
                }
                else if (ase.b(\u26032)) {
                    a2[j + i * \u2603] = \u26032;
                }
                else if (\u26032 == ady.D.az) {
                    a2[j + i * \u2603] = \u26032;
                }
                else if (\u26032 == 1) {
                    if (n > 0) {
                        if (this.a(3) == 0) {
                            a2[j + i * \u2603] = ady.ac.az;
                        }
                        else {
                            a2[j + i * \u2603] = ady.ab.az;
                        }
                    }
                    else {
                        a2[j + i * \u2603] = this.c[this.a(this.c.length)].az;
                    }
                }
                else if (\u26032 == 2) {
                    if (n > 0) {
                        a2[j + i * \u2603] = ady.K.az;
                    }
                    else {
                        a2[j + i * \u2603] = this.d[this.a(this.d.length)].az;
                    }
                }
                else if (\u26032 == 3) {
                    if (n > 0) {
                        a2[j + i * \u2603] = ady.V.az;
                    }
                    else {
                        a2[j + i * \u2603] = this.e[this.a(this.e.length)].az;
                    }
                }
                else if (\u26032 == 4) {
                    a2[j + i * \u2603] = this.f[this.a(this.f.length)].az;
                }
                else {
                    a2[j + i * \u2603] = ady.D.az;
                }
            }
        }
        return a2;
    }
}
