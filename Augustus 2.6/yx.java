import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class yx extends zw
{
    public yx() {
        this.a(true);
        this.d(0);
        this.a(yz.l);
    }
    
    @Override
    public String e_(final zx \u2603) {
        if (\u2603.i() == 1) {
            return "item.charcoal";
        }
        return "item.coal";
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
        \u2603.add(new zx(\u2603, 1, 1));
    }
}
