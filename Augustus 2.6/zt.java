import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zt extends zs
{
    public zt(final int \u2603, final float \u2603, final boolean \u2603) {
        super(\u2603, \u2603, \u2603);
        this.a(true);
    }
    
    @Override
    public boolean f(final zx \u2603) {
        return \u2603.i() > 0;
    }
    
    @Override
    public aaj g(final zx \u2603) {
        if (\u2603.i() == 0) {
            return aaj.c;
        }
        return aaj.d;
    }
    
    @Override
    protected void c(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (!\u2603.D) {
            \u2603.c(new pf(pe.x.H, 2400, 0));
        }
        if (\u2603.i() > 0) {
            if (!\u2603.D) {
                \u2603.c(new pf(pe.l.H, 600, 4));
                \u2603.c(new pf(pe.m.H, 6000, 0));
                \u2603.c(new pf(pe.n.H, 6000, 0));
            }
        }
        else {
            super.c(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
        \u2603.add(new zx(\u2603, 1, 1));
    }
}
