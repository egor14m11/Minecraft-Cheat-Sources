import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bib extends bid
{
    private static bib e;
    private FloatBuffer f;
    private FloatBuffer g;
    private FloatBuffer h;
    
    public bib() {
        this.f = avd.h(16);
        this.g = avd.h(16);
        this.h = avd.h(16);
    }
    
    public static bid a() {
        bib.e.b();
        return bib.e;
    }
    
    private void a(final float[] \u2603) {
        final float c = ns.c(\u2603[0] * \u2603[0] + \u2603[1] * \u2603[1] + \u2603[2] * \u2603[2]);
        final int n = 0;
        \u2603[n] /= c;
        final int n2 = 1;
        \u2603[n2] /= c;
        final int n3 = 2;
        \u2603[n3] /= c;
        final int n4 = 3;
        \u2603[n4] /= c;
    }
    
    public void b() {
        this.f.clear();
        this.g.clear();
        this.h.clear();
        bfl.a(2983, this.f);
        bfl.a(2982, this.g);
        final float[] b = this.b;
        final float[] c = this.c;
        this.f.flip().limit(16);
        this.f.get(b);
        this.g.flip().limit(16);
        this.g.get(c);
        this.d[0] = c[0] * b[0] + c[1] * b[4] + c[2] * b[8] + c[3] * b[12];
        this.d[1] = c[0] * b[1] + c[1] * b[5] + c[2] * b[9] + c[3] * b[13];
        this.d[2] = c[0] * b[2] + c[1] * b[6] + c[2] * b[10] + c[3] * b[14];
        this.d[3] = c[0] * b[3] + c[1] * b[7] + c[2] * b[11] + c[3] * b[15];
        this.d[4] = c[4] * b[0] + c[5] * b[4] + c[6] * b[8] + c[7] * b[12];
        this.d[5] = c[4] * b[1] + c[5] * b[5] + c[6] * b[9] + c[7] * b[13];
        this.d[6] = c[4] * b[2] + c[5] * b[6] + c[6] * b[10] + c[7] * b[14];
        this.d[7] = c[4] * b[3] + c[5] * b[7] + c[6] * b[11] + c[7] * b[15];
        this.d[8] = c[8] * b[0] + c[9] * b[4] + c[10] * b[8] + c[11] * b[12];
        this.d[9] = c[8] * b[1] + c[9] * b[5] + c[10] * b[9] + c[11] * b[13];
        this.d[10] = c[8] * b[2] + c[9] * b[6] + c[10] * b[10] + c[11] * b[14];
        this.d[11] = c[8] * b[3] + c[9] * b[7] + c[10] * b[11] + c[11] * b[15];
        this.d[12] = c[12] * b[0] + c[13] * b[4] + c[14] * b[8] + c[15] * b[12];
        this.d[13] = c[12] * b[1] + c[13] * b[5] + c[14] * b[9] + c[15] * b[13];
        this.d[14] = c[12] * b[2] + c[13] * b[6] + c[14] * b[10] + c[15] * b[14];
        this.d[15] = c[12] * b[3] + c[13] * b[7] + c[14] * b[11] + c[15] * b[15];
        final float[] \u2603 = this.a[0];
        \u2603[0] = this.d[3] - this.d[0];
        \u2603[1] = this.d[7] - this.d[4];
        \u2603[2] = this.d[11] - this.d[8];
        \u2603[3] = this.d[15] - this.d[12];
        this.a(\u2603);
        final float[] \u26032 = this.a[1];
        \u26032[0] = this.d[3] + this.d[0];
        \u26032[1] = this.d[7] + this.d[4];
        \u26032[2] = this.d[11] + this.d[8];
        \u26032[3] = this.d[15] + this.d[12];
        this.a(\u26032);
        final float[] \u26033 = this.a[2];
        \u26033[0] = this.d[3] + this.d[1];
        \u26033[1] = this.d[7] + this.d[5];
        \u26033[2] = this.d[11] + this.d[9];
        \u26033[3] = this.d[15] + this.d[13];
        this.a(\u26033);
        final float[] \u26034 = this.a[3];
        \u26034[0] = this.d[3] - this.d[1];
        \u26034[1] = this.d[7] - this.d[5];
        \u26034[2] = this.d[11] - this.d[9];
        \u26034[3] = this.d[15] - this.d[13];
        this.a(\u26034);
        final float[] \u26035 = this.a[4];
        \u26035[0] = this.d[3] - this.d[2];
        \u26035[1] = this.d[7] - this.d[6];
        \u26035[2] = this.d[11] - this.d[10];
        \u26035[3] = this.d[15] - this.d[14];
        this.a(\u26035);
        final float[] \u26036 = this.a[5];
        \u26036[0] = this.d[3] + this.d[2];
        \u26036[1] = this.d[7] + this.d[6];
        \u26036[2] = this.d[11] + this.d[10];
        \u26036[3] = this.d[15] + this.d[14];
        this.a(\u26036);
    }
    
    static {
        bib.e = new bib();
    }
}
