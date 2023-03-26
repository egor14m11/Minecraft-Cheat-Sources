import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bbf extends bbo
{
    bct a;
    bct[] b;
    
    public bbf() {
        this.b = new bct[9];
        final int n = -16;
        (this.a = new bct(this, 0, 0)).a(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        final bct a = this.a;
        a.d += 24 + n;
        final Random random = new Random(1660L);
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new bct(this, 0, 0);
            final float c = ((i % 3 - i / 3 % 2 * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            final float e = (i / 3 / 2.0f * 2.0f - 1.0f) * 5.0f;
            final int \u2603 = random.nextInt(7) + 8;
            this.b[i].a(-1.0f, 0.0f, -1.0f, 2, \u2603, 2);
            this.b[i].c = c;
            this.b[i].e = e;
            this.b[i].d = (float)(31 + n);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i].f = 0.2f * ns.a(\u2603 * 0.3f + i) + 0.4f;
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.E();
        bfl.b(0.0f, 0.6f, 0.0f);
        this.a.a(\u2603);
        for (final bct bct : this.b) {
            bct.a(\u2603);
        }
        bfl.F();
    }
}
