// 
// Decompiled by Procyon v0.5.36
// 

public class ake extends afh
{
    public static final amk a;
    
    public ake() {
        super(arm.u);
        this.j(this.M.b().a((amo<Comparable>)ake.a, false));
        this.a(yz.d);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.c(\u2603, \u2603, \u2603);
        if (\u2603.z(\u2603)) {
            this.d(\u2603, \u2603, \u2603.a((amo<Comparable>)ake.a, true));
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.z(\u2603)) {
            this.d(\u2603, \u2603, \u2603.a((amo<Comparable>)ake.a, true));
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final adi \u2603) {
        if (\u2603.D) {
            return;
        }
        final vj \u26032 = new vj(\u2603, \u2603.n() + 0.5f, \u2603.o(), \u2603.p() + 0.5f, \u2603.c());
        \u26032.a = \u2603.s.nextInt(\u26032.a / 4) + \u26032.a / 8;
        \u2603.d(\u26032);
    }
    
    @Override
    public void d(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a(\u2603, \u2603, \u2603, (pr)null);
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.b((amo<Boolean>)ake.a)) {
            final vj vj = new vj(\u2603, \u2603.n() + 0.5f, \u2603.o(), \u2603.p() + 0.5f, \u2603);
            \u2603.d(vj);
            \u2603.a(vj, "game.tnt.primed", 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.bZ() != null) {
            final zw b = \u2603.bZ().b();
            if (b == zy.d || b == zy.bL) {
                this.a(\u2603, \u2603, \u2603.a((amo<Comparable>)ake.a, true), (pr)\u2603);
                \u2603.g(\u2603);
                if (b == zy.d) {
                    \u2603.bZ().a(1, \u2603);
                }
                else if (!\u2603.bA.d) {
                    final zx bz = \u2603.bZ();
                    --bz.b;
                }
                return true;
            }
        }
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (!\u2603.D && \u2603 instanceof wq) {
            final wq wq = (wq)\u2603;
            if (wq.at()) {
                this.a(\u2603, \u2603, \u2603.p(\u2603).a((amo<Comparable>)ake.a, true), (wq.c instanceof pr) ? ((pr)wq.c) : null);
                \u2603.g(\u2603);
            }
        }
    }
    
    @Override
    public boolean a(final adi \u2603) {
        return false;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ake.a, (\u2603 & 0x1) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        return ((boolean)\u2603.b((amo<Boolean>)ake.a)) ? 1 : 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ake.a });
    }
    
    static {
        a = amk.a("explode");
    }
}
