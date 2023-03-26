import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class us extends oa.a
{
    private final zx b;
    private float c;
    private boolean d;
    
    public us(final zx \u2603, final int \u2603) {
        super(\u2603);
        this.b = \u2603;
    }
    
    public zx a(final Random \u2603) {
        final zx k = this.b.k();
        if (this.c > 0.0f) {
            final int bound = (int)(this.c * this.b.j());
            int \u26032 = k.j() - \u2603.nextInt(\u2603.nextInt(bound) + 1);
            if (\u26032 > bound) {
                \u26032 = bound;
            }
            if (\u26032 < 1) {
                \u26032 = 1;
            }
            k.b(\u26032);
        }
        if (this.d) {
            ack.a(\u2603, k, 30);
        }
        return k;
    }
    
    public us a(final float \u2603) {
        this.c = \u2603;
        return this;
    }
    
    public us a() {
        this.d = true;
        return this;
    }
}
