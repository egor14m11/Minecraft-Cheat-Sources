// 
// Decompiled by Procyon v0.5.36
// 

public class asu
{
    private asv[] a;
    private int b;
    
    public asu() {
        this.a = new asv[1024];
    }
    
    public asv a(final asv \u2603) {
        if (\u2603.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            final asv[] a = new asv[this.b << 1];
            System.arraycopy(this.a, 0, a, 0, this.b);
            this.a = a;
        }
        this.a[this.b] = \u2603;
        \u2603.d = this.b;
        this.a(this.b++);
        return \u2603;
    }
    
    public void a() {
        this.b = 0;
    }
    
    public asv c() {
        final asv asv = this.a[0];
        final asv[] a = this.a;
        final int n = 0;
        final asv[] a2 = this.a;
        final int b = this.b - 1;
        this.b = b;
        a[n] = a2[b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        asv.d = -1;
        return asv;
    }
    
    public void a(final asv \u2603, final float \u2603) {
        final float g = \u2603.g;
        \u2603.g = \u2603;
        if (\u2603 < g) {
            this.a(\u2603.d);
        }
        else {
            this.b(\u2603.d);
        }
    }
    
    private void a(int \u2603) {
        final asv asv = this.a[\u2603];
        final float g = asv.g;
        while (\u2603 > 0) {
            final int n = \u2603 - 1 >> 1;
            final asv asv2 = this.a[n];
            if (g >= asv2.g) {
                break;
            }
            this.a[\u2603] = asv2;
            asv2.d = \u2603;
            \u2603 = n;
        }
        this.a[\u2603] = asv;
        asv.d = \u2603;
    }
    
    private void b(int \u2603) {
        final asv asv = this.a[\u2603];
        final float g = asv.g;
        while (true) {
            final int n = 1 + (\u2603 << 1);
            final int n2 = n + 1;
            if (n >= this.b) {
                break;
            }
            final asv asv2 = this.a[n];
            final float g2 = asv2.g;
            asv asv3;
            float g3;
            if (n2 >= this.b) {
                asv3 = null;
                g3 = Float.POSITIVE_INFINITY;
            }
            else {
                asv3 = this.a[n2];
                g3 = asv3.g;
            }
            if (g2 < g3) {
                if (g2 >= g) {
                    break;
                }
                this.a[\u2603] = asv2;
                asv2.d = \u2603;
                \u2603 = n;
            }
            else {
                if (g3 >= g) {
                    break;
                }
                this.a[\u2603] = asv3;
                asv3.d = \u2603;
                \u2603 = n2;
            }
        }
        this.a[\u2603] = asv;
        asv.d = \u2603;
    }
    
    public boolean e() {
        return this.b == 0;
    }
}
