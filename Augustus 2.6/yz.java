import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class yz
{
    public static final yz[] a;
    public static final yz b;
    public static final yz c;
    public static final yz d;
    public static final yz e;
    public static final yz f;
    public static final yz g;
    public static final yz h;
    public static final yz i;
    public static final yz j;
    public static final yz k;
    public static final yz l;
    public static final yz m;
    private final int n;
    private final String o;
    private String p;
    private boolean q;
    private boolean r;
    private acj[] s;
    private zx t;
    
    public yz(final int \u2603, final String \u2603) {
        this.p = "items.png";
        this.q = true;
        this.r = true;
        this.n = \u2603;
        this.o = \u2603;
        yz.a[\u2603] = this;
    }
    
    public int a() {
        return this.n;
    }
    
    public String b() {
        return this.o;
    }
    
    public String c() {
        return "itemGroup." + this.b();
    }
    
    public zx d() {
        if (this.t == null) {
            this.t = new zx(this.e(), 1, this.f());
        }
        return this.t;
    }
    
    public abstract zw e();
    
    public int f() {
        return 0;
    }
    
    public String g() {
        return this.p;
    }
    
    public yz a(final String \u2603) {
        this.p = \u2603;
        return this;
    }
    
    public boolean h() {
        return this.r;
    }
    
    public yz i() {
        this.r = false;
        return this;
    }
    
    public boolean j() {
        return this.q;
    }
    
    public yz k() {
        this.q = false;
        return this;
    }
    
    public int l() {
        return this.n % 6;
    }
    
    public boolean m() {
        return this.n < 6;
    }
    
    public acj[] n() {
        return this.s;
    }
    
    public yz a(final acj... \u2603) {
        this.s = \u2603;
        return this;
    }
    
    public boolean a(final acj \u2603) {
        if (this.s == null) {
            return false;
        }
        for (final acj acj : this.s) {
            if (acj == \u2603) {
                return true;
            }
        }
        return false;
    }
    
    public void a(final List<zx> \u2603) {
        for (final zw \u26032 : zw.e) {
            if (\u26032 != null && \u26032.c() == this) {
                \u26032.a(\u26032, this, \u2603);
            }
        }
        if (this.n() != null) {
            this.a(\u2603, this.n());
        }
    }
    
    public void a(final List<zx> \u2603, final acj... \u2603) {
        for (final aci \u26032 : aci.b) {
            if (\u26032 != null) {
                if (\u26032.C != null) {
                    boolean b2 = false;
                    for (int n = 0; n < \u2603.length && !b2; ++n) {
                        if (\u26032.C == \u2603[n]) {
                            b2 = true;
                        }
                    }
                    if (b2) {
                        \u2603.add(zy.cd.a(new acl(\u26032, \u26032.b())));
                    }
                }
            }
        }
    }
    
    static {
        a = new yz[12];
        b = new yz(0, "buildingBlocks") {
            @Override
            public zw e() {
                return zw.a(afi.V);
            }
        };
        c = new yz(1, "decorations") {
            @Override
            public zw e() {
                return zw.a(afi.cF);
            }
            
            @Override
            public int f() {
                return agi.b.f.a();
            }
        };
        d = new yz(2, "redstone") {
            @Override
            public zw e() {
                return zy.aC;
            }
        };
        e = new yz(3, "transportation") {
            @Override
            public zw e() {
                return zw.a(afi.D);
            }
        };
        f = new yz(4, "misc") {
            @Override
            public zw e() {
                return zy.ay;
            }
        }.a(new acj[] { acj.a });
        g = new yz(5, "search") {
            @Override
            public zw e() {
                return zy.aQ;
            }
        }.a("item_search.png");
        h = new yz(6, "food") {
            @Override
            public zw e() {
                return zy.e;
            }
        };
        i = new yz(7, "tools") {
            @Override
            public zw e() {
                return zy.c;
            }
        }.a(acj.h, acj.i, acj.j);
        j = new yz(8, "combat") {
            @Override
            public zw e() {
                return zy.B;
            }
        }.a(acj.b, acj.c, acj.f, acj.d, acj.e, acj.k, acj.g);
        k = new yz(9, "brewing") {
            @Override
            public zw e() {
                return zy.bz;
            }
        };
        l = new yz(10, "materials") {
            @Override
            public zw e() {
                return zy.y;
            }
        };
        m = new yz(11, "inventory") {
            @Override
            public zw e() {
                return zw.a(afi.ae);
            }
        }.a("inventory.png").k().i();
    }
}
