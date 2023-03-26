import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class uq extends un
{
    public a c;
    
    public uq(final adm \u2603) {
        super(\u2603);
    }
    
    public uq(final adm \u2603, final cj \u2603, final cq \u2603) {
        super(\u2603, \u2603);
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        for (final a c : a.values()) {
            this.c = c;
            this.a(\u2603);
            if (this.j()) {
                arrayList.add(c);
            }
        }
        if (!arrayList.isEmpty()) {
            this.c = arrayList.get(this.V.nextInt(arrayList.size()));
        }
        this.a(\u2603);
    }
    
    public uq(final adm \u2603, final cj \u2603, final cq \u2603, final String \u2603) {
        this(\u2603, \u2603, \u2603);
        for (final a c : a.values()) {
            if (c.B.equals(\u2603)) {
                this.c = c;
                break;
            }
        }
        this.a(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        \u2603.a("Motive", this.c.B);
        super.b(\u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        final String j = \u2603.j("Motive");
        for (final a c : a.values()) {
            if (c.B.equals(j)) {
                this.c = c;
            }
        }
        if (this.c == null) {
            this.c = a.a;
        }
        super.a(\u2603);
    }
    
    @Override
    public int l() {
        return this.c.C;
    }
    
    @Override
    public int m() {
        return this.c.D;
    }
    
    @Override
    public void b(final pk \u2603) {
        if (!this.o.Q().b("doEntityDrops")) {
            return;
        }
        if (\u2603 instanceof wn) {
            final wn wn = (wn)\u2603;
            if (wn.bA.d) {
                return;
            }
        }
        this.a(new zx(zy.an), 0.0f);
    }
    
    @Override
    public void b(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        final cj a = this.a.a(\u2603 - this.s, \u2603 - this.t, \u2603 - this.u);
        this.b(a.n(), a.o(), a.p());
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        final cj a = this.a.a(\u2603 - this.s, \u2603 - this.t, \u2603 - this.u);
        this.b(a.n(), a.o(), a.p());
    }
    
    public enum a
    {
        a("Kebab", 16, 16, 0, 0), 
        b("Aztec", 16, 16, 16, 0), 
        c("Alban", 16, 16, 32, 0), 
        d("Aztec2", 16, 16, 48, 0), 
        e("Bomb", 16, 16, 64, 0), 
        f("Plant", 16, 16, 80, 0), 
        g("Wasteland", 16, 16, 96, 0), 
        h("Pool", 32, 16, 0, 32), 
        i("Courbet", 32, 16, 32, 32), 
        j("Sea", 32, 16, 64, 32), 
        k("Sunset", 32, 16, 96, 32), 
        l("Creebet", 32, 16, 128, 32), 
        m("Wanderer", 16, 32, 0, 64), 
        n("Graham", 16, 32, 16, 64), 
        o("Match", 32, 32, 0, 128), 
        p("Bust", 32, 32, 32, 128), 
        q("Stage", 32, 32, 64, 128), 
        r("Void", 32, 32, 96, 128), 
        s("SkullAndRoses", 32, 32, 128, 128), 
        t("Wither", 32, 32, 160, 128), 
        u("Fighters", 64, 32, 0, 96), 
        v("Pointer", 64, 64, 0, 192), 
        w("Pigscene", 64, 64, 64, 192), 
        x("BurningSkull", 64, 64, 128, 192), 
        y("Skeleton", 64, 48, 192, 64), 
        z("DonkeyKong", 64, 48, 192, 112);
        
        public static final int A;
        public final String B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        
        private a(final String \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.B = \u2603;
            this.C = \u2603;
            this.D = \u2603;
            this.E = \u2603;
            this.F = \u2603;
        }
        
        static {
            A = "SkullAndRoses".length();
        }
    }
}
