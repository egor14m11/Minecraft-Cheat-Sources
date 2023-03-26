import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class acg extends aci
{
    protected acg(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.j);
        this.c("durability");
    }
    
    @Override
    public int a(final int \u2603) {
        return 5 + (\u2603 - 1) * 8;
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
        return \u2603.e() || super.a(\u2603);
    }
    
    public static boolean a(final zx \u2603, final int \u2603, final Random \u2603) {
        return (!(\u2603.b() instanceof yj) || \u2603.nextFloat() >= 0.6f) && \u2603.nextInt(\u2603 + 1) > 0;
    }
}
