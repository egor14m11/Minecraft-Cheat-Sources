// 
// Decompiled by Procyon v0.5.36
// 

public class zv extends zw
{
    protected a a;
    
    public zv(final a \u2603) {
        this.a = \u2603;
        this.h = 1;
        this.d(\u2603.a());
        this.a(yz.i);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (\u2603 != cq.a && \u2603.p(\u2603.a()).c().t() == arm.a) {
            if (c == afi.c) {
                return this.a(\u2603, \u2603, \u2603, \u2603, afi.ak.Q());
            }
            if (c == afi.d) {
                switch (zv$1.a[p.b(agf.a).ordinal()]) {
                    case 1: {
                        return this.a(\u2603, \u2603, \u2603, \u2603, afi.ak.Q());
                    }
                    case 2: {
                        return this.a(\u2603, \u2603, \u2603, \u2603, afi.d.Q().a(agf.a, agf.a.a));
                    }
                }
            }
        }
        return false;
    }
    
    protected boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, \u2603.c().H.c(), (\u2603.c().H.d() + 1.0f) / 2.0f, \u2603.c().H.e() * 0.8f);
        if (\u2603.D) {
            return true;
        }
        \u2603.a(\u2603, \u2603);
        \u2603.a(1, \u2603);
        return true;
    }
    
    @Override
    public boolean w_() {
        return true;
    }
    
    public String g() {
        return this.a.toString();
    }
}
