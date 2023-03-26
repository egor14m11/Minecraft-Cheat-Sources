import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class akd extends afh
{
    public static final amk b;
    public static final amk N;
    public static final amk O;
    public static final amk P;
    private final boolean a;
    
    protected akd(final arm \u2603, final boolean \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)akd.b, false).a((amo<Comparable>)akd.N, false).a((amo<Comparable>)akd.O, false).a((amo<Comparable>)akd.P, false));
        this.a = \u2603;
        this.a(yz.c);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)akd.b, this.c(\u2603.p(\u2603.c()).c())).a((amo<Comparable>)akd.O, this.c(\u2603.p(\u2603.d()).c())).a((amo<Comparable>)akd.P, this.c(\u2603.p(\u2603.e()).c())).a((amo<Comparable>)akd.N, this.c(\u2603.p(\u2603.f()).c()));
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (!this.a) {
            return null;
        }
        return super.a(\u2603, \u2603, \u2603);
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
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.p(\u2603).c() != this && super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        final boolean c = this.c(\u2603.p(\u2603.c()).c());
        final boolean c2 = this.c(\u2603.p(\u2603.d()).c());
        final boolean c3 = this.c(\u2603.p(\u2603.e()).c());
        final boolean c4 = this.c(\u2603.p(\u2603.f()).c());
        if ((c3 && c4) || (!c3 && !c4 && !c && !c2)) {
            this.a(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (c3) {
            this.a(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (c4) {
            this.a(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        if ((c && c2) || (!c3 && !c4 && !c && !c2)) {
            this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (c) {
            this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        else if (c2) {
            this.a(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        float \u26032 = 0.4375f;
        float \u26033 = 0.5625f;
        float \u26034 = 0.4375f;
        float \u26035 = 0.5625f;
        final boolean c = this.c(\u2603.p(\u2603.c()).c());
        final boolean c2 = this.c(\u2603.p(\u2603.d()).c());
        final boolean c3 = this.c(\u2603.p(\u2603.e()).c());
        final boolean c4 = this.c(\u2603.p(\u2603.f()).c());
        if ((c3 && c4) || (!c3 && !c4 && !c && !c2)) {
            \u26032 = 0.0f;
            \u26033 = 1.0f;
        }
        else if (c3) {
            \u26032 = 0.0f;
        }
        else if (c4) {
            \u26033 = 1.0f;
        }
        if ((c && c2) || (!c3 && !c4 && !c && !c2)) {
            \u26034 = 0.0f;
            \u26035 = 1.0f;
        }
        else if (c) {
            \u26034 = 0.0f;
        }
        else if (c2) {
            \u26035 = 1.0f;
        }
        this.a(\u26032, 0.0f, \u26034, \u26033, 1.0f, \u26035);
    }
    
    public final boolean c(final afh \u2603) {
        return \u2603.o() || \u2603 == this || \u2603 == afi.w || \u2603 == afi.cG || \u2603 == afi.cH || \u2603 instanceof akd;
    }
    
    @Override
    protected boolean I() {
        return true;
    }
    
    @Override
    public adf m() {
        return adf.b;
    }
    
    @Override
    public int c(final alz \u2603) {
        return 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akd.b, akd.N, akd.P, akd.O });
    }
    
    static {
        b = amk.a("north");
        N = amk.a("east");
        O = amk.a("south");
        P = amk.a("west");
    }
}
