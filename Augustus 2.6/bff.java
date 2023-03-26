import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class bff extends adv
{
    private static final alz f;
    private final cj g;
    private int[] h;
    private alz[] i;
    
    public bff(final adm \u2603, final cj \u2603, final cj \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.g = \u2603.b(new df(\u2603, \u2603, \u2603));
        final int n = 8000;
        Arrays.fill(this.h = new int[8000], -1);
        this.i = new alz[8000];
    }
    
    @Override
    public akw s(final cj \u2603) {
        final int n = (\u2603.n() >> 4) - this.a;
        final int n2 = (\u2603.p() >> 4) - this.b;
        return this.c[n][n2].a(\u2603, amy.a.b);
    }
    
    @Override
    public int b(final cj \u2603, final int \u2603) {
        final int e = this.e(\u2603);
        int b = this.h[e];
        if (b == -1) {
            b = super.b(\u2603, \u2603);
            this.h[e] = b;
        }
        return b;
    }
    
    @Override
    public alz p(final cj \u2603) {
        final int e = this.e(\u2603);
        alz c = this.i[e];
        if (c == null) {
            c = this.c(\u2603);
            this.i[e] = c;
        }
        return c;
    }
    
    private alz c(final cj \u2603) {
        if (\u2603.o() >= 0 && \u2603.o() < 256) {
            final int n = (\u2603.n() >> 4) - this.a;
            final int n2 = (\u2603.p() >> 4) - this.b;
            return this.c[n][n2].g(\u2603);
        }
        return bff.f;
    }
    
    private int e(final cj \u2603) {
        final int n = \u2603.n() - this.g.n();
        final int n2 = \u2603.o() - this.g.o();
        final int n3 = \u2603.p() - this.g.p();
        return n * 400 + n3 * 20 + n2;
    }
    
    static {
        f = afi.a.Q();
    }
}
