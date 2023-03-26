import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aku extends akw
{
    private int a;
    private du f;
    private boolean g;
    private List<a> h;
    private List<zd> i;
    private String j;
    
    public void a(final zx \u2603) {
        this.f = null;
        if (\u2603.n() && \u2603.o().b("BlockEntityTag", 10)) {
            final dn m = \u2603.o().m("BlockEntityTag");
            if (m.c("Patterns")) {
                this.f = (du)m.c("Patterns", 10).b();
            }
            if (m.b("Base", 99)) {
                this.a = m.f("Base");
            }
            else {
                this.a = (\u2603.i() & 0xF);
            }
        }
        else {
            this.a = (\u2603.i() & 0xF);
        }
        this.h = null;
        this.i = null;
        this.j = "";
        this.g = true;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        a(\u2603, this.a, this.f);
    }
    
    public static void a(final dn \u2603, final int \u2603, final du \u2603) {
        \u2603.a("Base", \u2603);
        if (\u2603 != null) {
            \u2603.a("Patterns", \u2603);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.f("Base");
        this.f = \u2603.c("Patterns", 10);
        this.h = null;
        this.i = null;
        this.j = null;
        this.g = true;
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        return new ft(this.c, 6, dn);
    }
    
    public int b() {
        return this.a;
    }
    
    public static int b(final zx \u2603) {
        final dn a = \u2603.a("BlockEntityTag", false);
        if (a != null && a.c("Base")) {
            return a.f("Base");
        }
        return \u2603.i();
    }
    
    public static int c(final zx \u2603) {
        final dn a = \u2603.a("BlockEntityTag", false);
        if (a != null && a.c("Patterns")) {
            return a.c("Patterns", 10).c();
        }
        return 0;
    }
    
    public List<a> c() {
        this.h();
        return this.h;
    }
    
    public du d() {
        return this.f;
    }
    
    public List<zd> e() {
        this.h();
        return this.i;
    }
    
    public String g() {
        this.h();
        return this.j;
    }
    
    private void h() {
        if (this.h != null && this.i != null && this.j != null) {
            return;
        }
        if (!this.g) {
            this.j = "";
            return;
        }
        this.h = (List<a>)Lists.newArrayList();
        this.i = (List<zd>)Lists.newArrayList();
        this.h.add(aku.a.a);
        this.i.add(zd.a(this.a));
        this.j = "b" + this.a;
        if (this.f != null) {
            for (int i = 0; i < this.f.c(); ++i) {
                final dn b = this.f.b(i);
                final a a = aku.a.a(b.j("Pattern"));
                if (a != null) {
                    this.h.add(a);
                    final int f = b.f("Color");
                    this.i.add(zd.a(f));
                    this.j = this.j + a.b() + f;
                }
            }
        }
    }
    
    public static void e(final zx \u2603) {
        final dn a = \u2603.a("BlockEntityTag", false);
        if (a == null || !a.b("Patterns", 9)) {
            return;
        }
        final du c = a.c("Patterns", 10);
        if (c.c() <= 0) {
            return;
        }
        c.a(c.c() - 1);
        if (c.c_()) {
            \u2603.o().o("BlockEntityTag");
            if (\u2603.o().c_()) {
                \u2603.d((dn)null);
            }
        }
    }
    
    public enum a
    {
        a("base", "b"), 
        b("square_bottom_left", "bl", "   ", "   ", "#  "), 
        c("square_bottom_right", "br", "   ", "   ", "  #"), 
        d("square_top_left", "tl", "#  ", "   ", "   "), 
        e("square_top_right", "tr", "  #", "   ", "   "), 
        f("stripe_bottom", "bs", "   ", "   ", "###"), 
        g("stripe_top", "ts", "###", "   ", "   "), 
        h("stripe_left", "ls", "#  ", "#  ", "#  "), 
        i("stripe_right", "rs", "  #", "  #", "  #"), 
        j("stripe_center", "cs", " # ", " # ", " # "), 
        k("stripe_middle", "ms", "   ", "###", "   "), 
        l("stripe_downright", "drs", "#  ", " # ", "  #"), 
        m("stripe_downleft", "dls", "  #", " # ", "#  "), 
        n("small_stripes", "ss", "# #", "# #", "   "), 
        o("cross", "cr", "# #", " # ", "# #"), 
        p("straight_cross", "sc", " # ", "###", " # "), 
        q("triangle_bottom", "bt", "   ", " # ", "# #"), 
        r("triangle_top", "tt", "# #", " # ", "   "), 
        s("triangles_bottom", "bts", "   ", "# #", " # "), 
        t("triangles_top", "tts", " # ", "# #", "   "), 
        u("diagonal_left", "ld", "## ", "#  ", "   "), 
        v("diagonal_up_right", "rd", "   ", "  #", " ##"), 
        w("diagonal_up_left", "lud", "   ", "#  ", "## "), 
        x("diagonal_right", "rud", " ##", "  #", "   "), 
        y("circle", "mc", "   ", " # ", "   "), 
        z("rhombus", "mr", " # ", "# #", " # "), 
        A("half_vertical", "vh", "## ", "## ", "## "), 
        B("half_horizontal", "hh", "###", "###", "   "), 
        C("half_vertical_right", "vhr", " ##", " ##", " ##"), 
        D("half_horizontal_bottom", "hhb", "   ", "###", "###"), 
        E("border", "bo", "###", "# #", "###"), 
        F("curly_border", "cbo", new zx(afi.bn)), 
        G("creeper", "cre", new zx(zy.bX, 1, 4)), 
        H("gradient", "gra", "# #", " # ", " # "), 
        I("gradient_up", "gru", " # ", " # ", "# #"), 
        J("bricks", "bri", new zx(afi.V)), 
        K("skull", "sku", new zx(zy.bX, 1, 1)), 
        L("flower", "flo", new zx(afi.O, 1, agw.a.j.b())), 
        M("mojang", "moj", new zx(zy.ao, 1, 1));
        
        private String N;
        private String O;
        private String[] P;
        private zx Q;
        
        private a(final String \u2603, final String \u2603) {
            this.P = new String[3];
            this.N = \u2603;
            this.O = \u2603;
        }
        
        private a(final String \u2603, final String \u2603, final zx \u2603) {
            this(\u2603, \u2603);
            this.Q = \u2603;
        }
        
        private a(final String \u2603, final String \u2603, final String \u2603, final String \u2603, final String \u2603) {
            this(\u2603, \u2603);
            this.P[0] = \u2603;
            this.P[1] = \u2603;
            this.P[2] = \u2603;
        }
        
        public String a() {
            return this.N;
        }
        
        public String b() {
            return this.O;
        }
        
        public String[] c() {
            return this.P;
        }
        
        public boolean d() {
            return this.Q != null || this.P[0] != null;
        }
        
        public boolean e() {
            return this.Q != null;
        }
        
        public zx f() {
            return this.Q;
        }
        
        public static a a(final String \u2603) {
            for (final a a : values()) {
                if (a.O.equals(\u2603)) {
                    return a;
                }
            }
            return null;
        }
    }
}
