import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class alt extends afh
{
    public static final aml a;
    public static final amm<a> b;
    public static final amk N;
    
    public alt() {
        super(arm.H);
        this.j(this.M.b().a((amo<Comparable>)alt.a, cq.c).a(alt.b, alt.a.a).a((amo<Comparable>)alt.N, false));
        this.a(alt.i);
        this.c(0.5f);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        if (\u2603.bA.d) {
            final cq cq = \u2603.b((amo<cq>)alt.a);
            if (cq != null) {
                final cj a = \u2603.a(cq.d());
                final afh c = \u2603.p(a).c();
                if (c == afi.J || c == afi.F) {
                    \u2603.g(a);
                }
            }
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        final cq d = \u2603.b((amo<cq>)alt.a).d();
        \u2603 = \u2603.a(d);
        final alz p = \u2603.p(\u2603);
        if ((p.c() == afi.J || p.c() == afi.F) && p.b((amo<Boolean>)als.b)) {
            p.c().b(\u2603, \u2603, p, 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return false;
    }
    
    @Override
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return false;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.d(\u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.e(\u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void e(final alz \u2603) {
        final float n = 0.25f;
        final float n2 = 0.375f;
        final float n3 = 0.625f;
        final float n4 = 0.25f;
        final float n5 = 0.75f;
        switch (alt$1.a[\u2603.b((amo<cq>)alt.a).ordinal()]) {
            case 1: {
                this.a(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                break;
            }
            case 2: {
                this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                break;
            }
            case 3: {
                this.a(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                break;
            }
            case 4: {
                this.a(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                break;
            }
            case 5: {
                this.a(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                break;
            }
            case 6: {
                this.a(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
                break;
            }
        }
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.d(\u2603.p(\u2603));
    }
    
    public void d(final alz \u2603) {
        final float n = 0.25f;
        final cq cq = \u2603.b((amo<cq>)alt.a);
        if (cq == null) {
            return;
        }
        switch (alt$1.a[cq.ordinal()]) {
            case 1: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                break;
            }
            case 2: {
                this.a(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 3: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                break;
            }
            case 4: {
                this.a(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 5: {
                this.a(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                break;
            }
            case 6: {
                this.a(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final cq cq = \u2603.b((amo<cq>)alt.a);
        final cj a = \u2603.a(cq.d());
        final alz p = \u2603.p(a);
        if (p.c() != afi.J && p.c() != afi.F) {
            \u2603.g(\u2603);
        }
        else {
            p.c().a(\u2603, a, p, \u2603);
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    public static cq b(final int \u2603) {
        final int \u26032 = \u2603 & 0x7;
        if (\u26032 > 5) {
            return null;
        }
        return cq.a(\u26032);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).b(alt.b) == alt.a.b) {
            return zw.a(afi.F);
        }
        return zw.a(afi.J);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)alt.a, b(\u2603)).a(alt.b, ((\u2603 & 0x8) > 0) ? alt.a.b : alt.a.a);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)alt.a).a();
        if (\u2603.b(alt.b) == alt.a.b) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { alt.a, alt.b, alt.N });
    }
    
    static {
        a = aml.a("facing");
        b = amm.a("type", a.class);
        N = amk.a("short");
    }
    
    public enum a implements nw
    {
        a("normal"), 
        b("sticky");
        
        private final String c;
        
        private a(final String \u2603) {
            this.c = \u2603;
        }
        
        @Override
        public String toString() {
            return this.c;
        }
        
        @Override
        public String l() {
            return this.c;
        }
    }
}
