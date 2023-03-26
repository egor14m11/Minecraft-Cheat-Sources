import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahf extends agr
{
    @Override
    public zw a(final alz \u2603, final Random \u2603, int \u2603) {
        if (\u2603 > 3) {
            \u2603 = 3;
        }
        if (\u2603.nextInt(10 - \u2603 * 3) == 0) {
            return zy.ak;
        }
        return zw.a(this);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.m;
    }
}
