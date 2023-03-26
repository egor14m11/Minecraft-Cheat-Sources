import java.util.List;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

// 
// Decompiled by Procyon v0.5.36
// 

public class yj extends zw
{
    private static final int[] k;
    public static final String[] a;
    private static final cr l;
    public final int b;
    public final int c;
    public final int d;
    private final a m;
    
    public yj(final a \u2603, final int \u2603, final int \u2603) {
        this.m = \u2603;
        this.b = \u2603;
        this.d = \u2603;
        this.c = \u2603.b(\u2603);
        this.d(\u2603.a(\u2603));
        this.h = 1;
        this.a(yz.j);
        agg.N.a(this, yj.l);
    }
    
    @Override
    public int a(final zx \u2603, final int \u2603) {
        if (\u2603 > 0) {
            return 16777215;
        }
        int b = this.b(\u2603);
        if (b < 0) {
            b = 16777215;
        }
        return b;
    }
    
    @Override
    public int b() {
        return this.m.a();
    }
    
    public a x_() {
        return this.m;
    }
    
    public boolean d_(final zx \u2603) {
        return this.m == yj.a.a && \u2603.n() && \u2603.o().b("display", 10) && \u2603.o().m("display").b("color", 3);
    }
    
    public int b(final zx \u2603) {
        if (this.m != yj.a.a) {
            return -1;
        }
        final dn o = \u2603.o();
        if (o != null) {
            final dn m = o.m("display");
            if (m != null && m.b("color", 3)) {
                return m.f("color");
            }
        }
        return 10511680;
    }
    
    public void c(final zx \u2603) {
        if (this.m != yj.a.a) {
            return;
        }
        final dn o = \u2603.o();
        if (o == null) {
            return;
        }
        final dn m = o.m("display");
        if (m.c("color")) {
            m.o("color");
        }
    }
    
    public void b(final zx \u2603, final int \u2603) {
        if (this.m != yj.a.a) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        dn o = \u2603.o();
        if (o == null) {
            o = new dn();
            \u2603.d(o);
        }
        final dn m = o.m("display");
        if (!o.b("display", 10)) {
            o.a("display", m);
        }
        m.a("color", \u2603);
    }
    
    @Override
    public boolean a(final zx \u2603, final zx \u2603) {
        return this.m.b() == \u2603.b() || super.a(\u2603, \u2603);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final int n = ps.c(\u2603) - 1;
        final zx q = \u2603.q(n);
        if (q == null) {
            \u2603.c(n, \u2603.k());
            \u2603.b = 0;
        }
        return \u2603;
    }
    
    static {
        k = new int[] { 11, 16, 15, 13 };
        a = new String[] { "minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots" };
        l = new cn() {
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                final int n = a.n();
                final int o = a.o();
                final int p = a.p();
                final aug \u26032 = new aug(n, o, p, n + 1, o + 1, p + 1);
                final List<pr> a2 = \u2603.i().a((Class<? extends pr>)pr.class, \u26032, Predicates.and((Predicate<? super pr>)po.d, (Predicate<? super pr>)new po.a(\u2603)));
                if (a2.size() > 0) {
                    final pr pr = a2.get(0);
                    final int n2 = (pr instanceof wn) ? 1 : 0;
                    final int c = ps.c(\u2603);
                    final zx k = \u2603.k();
                    k.b = 1;
                    pr.c(c - n2, k);
                    if (pr instanceof ps) {
                        ((ps)pr).a(c, 2.0f);
                    }
                    --\u2603.b;
                    return \u2603;
                }
                return super.b(\u2603, \u2603);
            }
        };
    }
    
    public enum a
    {
        a("leather", 5, new int[] { 1, 3, 2, 1 }, 15), 
        b("chainmail", 15, new int[] { 2, 5, 4, 1 }, 12), 
        c("iron", 15, new int[] { 2, 6, 5, 2 }, 9), 
        d("gold", 7, new int[] { 2, 5, 3, 1 }, 25), 
        e("diamond", 33, new int[] { 3, 8, 6, 3 }, 10);
        
        private final String f;
        private final int g;
        private final int[] h;
        private final int i;
        
        private a(final String \u2603, final int \u2603, final int[] \u2603, final int \u2603) {
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
        }
        
        public int a(final int \u2603) {
            return yj.k[\u2603] * this.g;
        }
        
        public int b(final int \u2603) {
            return this.h[\u2603];
        }
        
        public int a() {
            return this.i;
        }
        
        public zw b() {
            if (this == a.a) {
                return zy.aF;
            }
            if (this == a.b) {
                return zy.j;
            }
            if (this == a.d) {
                return zy.k;
            }
            if (this == a.c) {
                return zy.j;
            }
            if (this == a.e) {
                return zy.i;
            }
            return null;
        }
        
        public String c() {
            return this.f;
        }
    }
}
