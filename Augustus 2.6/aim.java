import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aim extends afh
{
    public aim() {
        this(arm.e.r());
    }
    
    public aim(final arn \u2603) {
        super(arm.e, \u2603);
        this.a(yz.b);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (this == afi.q) {
            return zy.h;
        }
        if (this == afi.ag) {
            return zy.i;
        }
        if (this == afi.x) {
            return zy.aW;
        }
        if (this == afi.bP) {
            return zy.bO;
        }
        if (this == afi.co) {
            return zy.cg;
        }
        return zw.a(this);
    }
    
    @Override
    public int a(final Random \u2603) {
        if (this == afi.x) {
            return 4 + \u2603.nextInt(5);
        }
        return 1;
    }
    
    @Override
    public int a(final int \u2603, final Random \u2603) {
        if (\u2603 > 0 && zw.a(this) != this.a(this.P().a().iterator().next(), \u2603, \u2603)) {
            int n = \u2603.nextInt(\u2603 + 2) - 1;
            if (n < 0) {
                n = 0;
            }
            return this.a(\u2603) * (n + 1);
        }
        return this.a(\u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.a(\u2603, \u2603.s, \u2603) != zw.a(this)) {
            int \u26032 = 0;
            if (this == afi.q) {
                \u26032 = ns.a(\u2603.s, 0, 2);
            }
            else if (this == afi.ag) {
                \u26032 = ns.a(\u2603.s, 3, 7);
            }
            else if (this == afi.bP) {
                \u26032 = ns.a(\u2603.s, 3, 7);
            }
            else if (this == afi.x) {
                \u26032 = ns.a(\u2603.s, 2, 5);
            }
            else if (this == afi.co) {
                \u26032 = ns.a(\u2603.s, 2, 5);
            }
            this.b(\u2603, \u2603, \u26032);
        }
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        return 0;
    }
    
    @Override
    public int a(final alz \u2603) {
        if (this == afi.x) {
            return zd.l.b();
        }
        return 0;
    }
}
