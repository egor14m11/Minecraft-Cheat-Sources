import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgn extends bgg
{
    private final bmi d;
    
    public bgn(final bgg \u2603, final bmi \u2603) {
        super(Arrays.copyOf(\u2603.a(), \u2603.a().length), \u2603.b, bgo.a(\u2603.a()));
        this.d = \u2603;
        this.e();
    }
    
    private void e() {
        for (int i = 0; i < 4; ++i) {
            this.a(i);
        }
    }
    
    private void a(final int \u2603) {
        final int n = 7 * \u2603;
        final float intBitsToFloat = Float.intBitsToFloat(this.a[n]);
        final float intBitsToFloat2 = Float.intBitsToFloat(this.a[n + 1]);
        final float intBitsToFloat3 = Float.intBitsToFloat(this.a[n + 2]);
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (bgn$1.a[this.c.ordinal()]) {
            case 1: {
                n2 = intBitsToFloat * 16.0f;
                n3 = (1.0f - intBitsToFloat3) * 16.0f;
                break;
            }
            case 2: {
                n2 = intBitsToFloat * 16.0f;
                n3 = intBitsToFloat3 * 16.0f;
                break;
            }
            case 3: {
                n2 = (1.0f - intBitsToFloat) * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 4: {
                n2 = intBitsToFloat * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 5: {
                n2 = intBitsToFloat3 * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 6: {
                n2 = (1.0f - intBitsToFloat3) * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
        }
        this.a[n + 4] = Float.floatToRawIntBits(this.d.a(n2));
        this.a[n + 4 + 1] = Float.floatToRawIntBits(this.d.b(n3));
    }
}
