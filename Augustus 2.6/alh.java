// 
// Decompiled by Procyon v0.5.36
// 

public class alh extends alk implements km, ot
{
    private static final int[] a;
    private static final int[] f;
    private static final int[] g;
    private zx[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    
    public alh() {
        this.h = new zx[3];
    }
    
    @Override
    public int o_() {
        return this.h.length;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.h[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.h[\u2603] == null) {
            return null;
        }
        if (this.h[\u2603].b <= \u2603) {
            final zx a = this.h[\u2603];
            this.h[\u2603] = null;
            return a;
        }
        final zx a = this.h[\u2603].a(\u2603);
        if (this.h[\u2603].b == 0) {
            this.h[\u2603] = null;
        }
        return a;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.h[\u2603] != null) {
            final zx zx = this.h[\u2603];
            this.h[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        final boolean b = \u2603 != null && \u2603.a(this.h[\u2603]) && zx.a(\u2603, this.h[\u2603]);
        this.h[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
        if (\u2603 == 0 && !b) {
            this.l = this.a(\u2603);
            this.k = 0;
            this.p_();
        }
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.m : "container.furnace";
    }
    
    @Override
    public boolean l_() {
        return this.m != null && this.m.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.m = \u2603;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        final du c = \u2603.c("Items", 10);
        this.h = new zx[this.o_()];
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int d = b.d("Slot");
            if (d >= 0 && d < this.h.length) {
                this.h[d] = zx.a(b);
            }
        }
        this.i = \u2603.e("BurnTime");
        this.k = \u2603.e("CookTime");
        this.l = \u2603.e("CookTimeTotal");
        this.j = b(this.h[1]);
        if (\u2603.b("CustomName", 8)) {
            this.m = \u2603.j("CustomName");
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("BurnTime", (short)this.i);
        \u2603.a("CookTime", (short)this.k);
        \u2603.a("CookTimeTotal", (short)this.l);
        final du \u26032 = new du();
        for (int i = 0; i < this.h.length; ++i) {
            if (this.h[i] != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                this.h[i].b(dn);
                \u26032.a(dn);
            }
        }
        \u2603.a("Items", \u26032);
        if (this.l_()) {
            \u2603.a("CustomName", this.m);
        }
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    public boolean m() {
        return this.i > 0;
    }
    
    public static boolean a(final og \u2603) {
        return \u2603.a_(0) > 0;
    }
    
    @Override
    public void c() {
        final boolean m = this.m();
        boolean b = false;
        if (this.m()) {
            --this.i;
        }
        if (!this.b.D) {
            if (this.m() || (this.h[1] != null && this.h[0] != null)) {
                if (!this.m() && this.o()) {
                    final int b2 = b(this.h[1]);
                    this.i = b2;
                    this.j = b2;
                    if (this.m()) {
                        b = true;
                        if (this.h[1] != null) {
                            final zx zx = this.h[1];
                            --zx.b;
                            if (this.h[1].b == 0) {
                                final zw q = this.h[1].b().q();
                                this.h[1] = ((q != null) ? new zx(q) : null);
                            }
                        }
                    }
                }
                if (this.m() && this.o()) {
                    ++this.k;
                    if (this.k == this.l) {
                        this.k = 0;
                        this.l = this.a(this.h[0]);
                        this.n();
                        b = true;
                    }
                }
                else {
                    this.k = 0;
                }
            }
            else if (!this.m() && this.k > 0) {
                this.k = ns.a(this.k - 2, 0, this.l);
            }
            if (m != this.m()) {
                b = true;
                ahb.a(this.m(), this.b, this.c);
            }
        }
        if (b) {
            this.p_();
        }
    }
    
    public int a(final zx \u2603) {
        return 200;
    }
    
    private boolean o() {
        if (this.h[0] == null) {
            return false;
        }
        final zx a = abo.a().a(this.h[0]);
        return a != null && (this.h[2] == null || (this.h[2].a(a) && ((this.h[2].b < this.q_() && this.h[2].b < this.h[2].c()) || this.h[2].b < a.c())));
    }
    
    public void n() {
        if (!this.o()) {
            return;
        }
        final zx a = abo.a().a(this.h[0]);
        if (this.h[2] == null) {
            this.h[2] = a.k();
        }
        else if (this.h[2].b() == a.b()) {
            final zx zx = this.h[2];
            ++zx.b;
        }
        if (this.h[0].b() == zw.a(afi.v) && this.h[0].i() == 1 && this.h[1] != null && this.h[1].b() == zy.aw) {
            this.h[1] = new zx(zy.ax);
        }
        final zx zx2 = this.h[0];
        --zx2.b;
        if (this.h[0].b <= 0) {
            this.h[0] = null;
        }
    }
    
    public static int b(final zx \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        final zw b = \u2603.b();
        if (b instanceof yo && afh.a(b) != afi.a) {
            final afh a = afh.a(b);
            if (a == afi.bM) {
                return 150;
            }
            if (a.t() == arm.d) {
                return 300;
            }
            if (a == afi.cA) {
                return 16000;
            }
        }
        if (b instanceof za && ((za)b).h().equals("WOOD")) {
            return 200;
        }
        if (b instanceof aay && ((aay)b).h().equals("WOOD")) {
            return 200;
        }
        if (b instanceof zv && ((zv)b).g().equals("WOOD")) {
            return 200;
        }
        if (b == zy.y) {
            return 100;
        }
        if (b == zy.h) {
            return 1600;
        }
        if (b == zy.ay) {
            return 20000;
        }
        if (b == zw.a(afi.g)) {
            return 100;
        }
        if (b == zy.bv) {
            return 2400;
        }
        return 0;
    }
    
    public static boolean c(final zx \u2603) {
        return b(\u2603) > 0;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.b.s(this.c) == this && \u2603.e(this.c.n() + 0.5, this.c.o() + 0.5, this.c.p() + 0.5) <= 64.0;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return \u2603 != 2 && (\u2603 != 1 || c(\u2603) || xt.c_(\u2603));
    }
    
    @Override
    public int[] a(final cq \u2603) {
        if (\u2603 == cq.a) {
            return alh.f;
        }
        if (\u2603 == cq.b) {
            return alh.a;
        }
        return alh.g;
    }
    
    @Override
    public boolean a(final int \u2603, final zx \u2603, final cq \u2603) {
        return this.b(\u2603, \u2603);
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603, final cq \u2603) {
        if (\u2603 == cq.a && \u2603 == 1) {
            final zw b = \u2603.b();
            if (b != zy.ax && b != zy.aw) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String k() {
        return "minecraft:furnace";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xu(\u2603, this);
    }
    
    @Override
    public int a_(final int \u2603) {
        switch (\u2603) {
            case 0: {
                return this.i;
            }
            case 1: {
                return this.j;
            }
            case 2: {
                return this.k;
            }
            case 3: {
                return this.l;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        switch (\u2603) {
            case 0: {
                this.i = \u2603;
                break;
            }
            case 1: {
                this.j = \u2603;
                break;
            }
            case 2: {
                this.k = \u2603;
                break;
            }
            case 3: {
                this.l = \u2603;
                break;
            }
        }
    }
    
    @Override
    public int g() {
        return 4;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i] = null;
        }
    }
    
    static {
        a = new int[] { 0 };
        f = new int[] { 2, 1 };
        g = new int[] { 1 };
    }
}
