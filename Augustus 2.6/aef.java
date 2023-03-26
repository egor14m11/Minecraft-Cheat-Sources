import java.util.Random;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class aef extends aec
{
    private ady b;
    private float c;
    
    public aef(final ady \u2603, final float \u2603) {
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public ady a(final cj \u2603) {
        return this.b;
    }
    
    @Override
    public ady[] a(ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new ady[\u2603 * \u2603];
        }
        Arrays.fill(\u2603, 0, \u2603 * \u2603, this.b);
        return \u2603;
    }
    
    @Override
    public float[] a(float[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new float[\u2603 * \u2603];
        }
        Arrays.fill(\u2603, 0, \u2603 * \u2603, this.c);
        return \u2603;
    }
    
    @Override
    public ady[] b(ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new ady[\u2603 * \u2603];
        }
        Arrays.fill(\u2603, 0, \u2603 * \u2603, this.b);
        return \u2603;
    }
    
    @Override
    public ady[] a(final ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        return this.b(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public cj a(final int \u2603, final int \u2603, final int \u2603, final List<ady> \u2603, final Random \u2603) {
        if (\u2603.contains(this.b)) {
            return new cj(\u2603 - \u2603 + \u2603.nextInt(\u2603 * 2 + 1), 0, \u2603 - \u2603 + \u2603.nextInt(\u2603 * 2 + 1));
        }
        return null;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final List<ady> \u2603) {
        return \u2603.contains(this.b);
    }
}
