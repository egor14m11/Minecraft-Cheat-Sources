import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ahh extends afh
{
    public static final amm<a> a;
    
    public ahh(final arm \u2603) {
        super(\u2603);
        if (this.l()) {
            this.r = true;
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.e(255);
    }
    
    @Override
    protected boolean I() {
        return false;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        if (this.l()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            return;
        }
        final alz p = \u2603.p(\u2603);
        if (p.c() == this) {
            if (p.b(ahh.a) == ahh.a.a) {
                this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
            else {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
        }
    }
    
    @Override
    public void j() {
        if (this.l()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a((adq)\u2603, \u2603);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean c() {
        return this.l();
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        final alz a = super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603).a(ahh.a, ahh.a.b);
        if (this.l()) {
            return a;
        }
        if (\u2603 == cq.a || (\u2603 != cq.b && \u2603 > 0.5)) {
            return a.a(ahh.a, ahh.a.a);
        }
        return a;
    }
    
    @Override
    public int a(final Random \u2603) {
        if (this.l()) {
            return 2;
        }
        return 1;
    }
    
    @Override
    public boolean d() {
        return this.l();
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        if (this.l()) {
            return super.a(\u2603, \u2603, \u2603);
        }
        if (\u2603 != cq.b && \u2603 != cq.a && !super.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        final cj a = \u2603.a(\u2603.d());
        final alz p = \u2603.p(\u2603);
        final alz p2 = \u2603.p(a);
        final boolean b = c(p.c()) && p.b(ahh.a) == ahh.a.a;
        final boolean b2 = c(p2.c()) && p2.b(ahh.a) == ahh.a.a;
        if (b2) {
            return \u2603 == cq.a || (\u2603 == cq.b && super.a(\u2603, \u2603, \u2603)) || !c(p.c()) || !b;
        }
        return \u2603 == cq.b || (\u2603 == cq.a && super.a(\u2603, \u2603, \u2603)) || !c(p.c()) || b;
    }
    
    protected static boolean c(final afh \u2603) {
        return \u2603 == afi.U || \u2603 == afi.bM || \u2603 == afi.cP;
    }
    
    public abstract String b(final int p0);
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        return super.j(\u2603, \u2603) & 0x7;
    }
    
    public abstract boolean l();
    
    public abstract amo<?> n();
    
    public abstract Object a(final zx p0);
    
    static {
        a = amm.a("half", a.class);
    }
    
    public enum a implements nw
    {
        a("top"), 
        b("bottom");
        
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
