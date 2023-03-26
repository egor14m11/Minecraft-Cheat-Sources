// 
// Decompiled by Procyon v0.5.36
// 

public class acp extends aci
{
    protected acp(final int \u2603, final jy \u2603, final int \u2603, final acj \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        if (\u2603 == acj.h) {
            this.c("lootBonusDigger");
        }
        else if (\u2603 == acj.i) {
            this.c("lootBonusFishing");
        }
        else {
            this.c("lootBonus");
        }
    }
    
    @Override
    public int a(final int \u2603) {
        return 15 + (\u2603 - 1) * 9;
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
    public boolean a(final aci \u2603) {
        return super.a(\u2603) && \u2603.B != acp.s.B;
    }
}
