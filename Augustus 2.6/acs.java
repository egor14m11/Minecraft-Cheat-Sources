import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class acs extends aci
{
    public acs(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.e);
        this.c("thorns");
    }
    
    @Override
    public int a(final int \u2603) {
        return 10 + 20 * (\u2603 - 1);
    }
    
    @Override
    public int b(final int \u2603) {
        return super.a(\u2603) + 50;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return \u2603.b() instanceof yj || super.a(\u2603);
    }
    
    @Override
    public void b(final pr \u2603, final pk \u2603, final int \u2603) {
        final Random bc = \u2603.bc();
        final zx a = ack.a(aci.j, \u2603);
        if (a(\u2603, bc)) {
            if (\u2603 != null) {
                \u2603.a(ow.a((pk)\u2603), (float)b(\u2603, bc));
                \u2603.a("damage.thorns", 0.5f, 1.0f);
            }
            if (a != null) {
                a.a(3, \u2603);
            }
        }
        else if (a != null) {
            a.a(1, \u2603);
        }
    }
    
    public static boolean a(final int \u2603, final Random \u2603) {
        return \u2603 > 0 && \u2603.nextFloat() < 0.15f * \u2603;
    }
    
    public static int b(final int \u2603, final Random \u2603) {
        if (\u2603 > 10) {
            return \u2603 - 10;
        }
        return 1 + \u2603.nextInt(4);
    }
}
