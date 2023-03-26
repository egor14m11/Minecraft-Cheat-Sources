import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aii extends afc
{
    private static final List<String> a;
    
    public aii() {
        super(arm.d);
        this.a(yz.d);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final boolean z = \u2603.z(\u2603);
        final akw s = \u2603.s(\u2603);
        if (s instanceof alm) {
            final alm alm = (alm)s;
            if (alm.f != z) {
                if (z) {
                    alm.a(\u2603, \u2603);
                }
                alm.f = z;
            }
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof alm) {
            final alm alm = (alm)s;
            alm.b();
            alm.a(\u2603, \u2603);
            \u2603.b(na.S);
        }
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
        if (\u2603.D) {
            return;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof alm) {
            ((alm)s).a(\u2603, \u2603);
            \u2603.b(na.R);
        }
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alm();
    }
    
    private String b(int \u2603) {
        if (\u2603 < 0 || \u2603 >= aii.a.size()) {
            \u2603 = 0;
        }
        return aii.a.get(\u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603, final int \u2603) {
        final float \u26032 = (float)Math.pow(2.0, (\u2603 - 12) / 12.0);
        \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "note." + this.b(\u2603), 3.0f, \u26032);
        \u2603.a(cy.x, \u2603.n() + 0.5, \u2603.o() + 1.2, \u2603.p() + 0.5, \u2603 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    static {
        a = Lists.newArrayList("harp", "bd", "snare", "hat", "bassattack");
    }
}
