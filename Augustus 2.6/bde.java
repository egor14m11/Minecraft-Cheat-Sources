// 
// Decompiled by Procyon v0.5.36
// 

public class bde
{
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public int f;
    public String g;
    public boolean h;
    public String i;
    private a j;
    private String k;
    private boolean l;
    
    public bde(final String \u2603, final String \u2603, final boolean \u2603) {
        this.f = 47;
        this.g = "1.8.8";
        this.j = bde.a.c;
        this.a = \u2603;
        this.b = \u2603;
        this.l = \u2603;
    }
    
    public dn a() {
        final dn dn = new dn();
        dn.a("name", this.a);
        dn.a("ip", this.b);
        if (this.k != null) {
            dn.a("icon", this.k);
        }
        if (this.j == bde.a.a) {
            dn.a("acceptTextures", true);
        }
        else if (this.j == bde.a.b) {
            dn.a("acceptTextures", false);
        }
        return dn;
    }
    
    public a b() {
        return this.j;
    }
    
    public void a(final a \u2603) {
        this.j = \u2603;
    }
    
    public static bde a(final dn \u2603) {
        final bde bde = new bde(\u2603.j("name"), \u2603.j("ip"), false);
        if (\u2603.b("icon", 8)) {
            bde.a(\u2603.j("icon"));
        }
        if (\u2603.b("acceptTextures", 1)) {
            if (\u2603.n("acceptTextures")) {
                bde.a(a.a);
            }
            else {
                bde.a(a.b);
            }
        }
        else {
            bde.a(a.c);
        }
        return bde;
    }
    
    public String c() {
        return this.k;
    }
    
    public void a(final String \u2603) {
        this.k = \u2603;
    }
    
    public boolean d() {
        return this.l;
    }
    
    public void a(final bde \u2603) {
        this.b = \u2603.b;
        this.a = \u2603.a;
        this.a(\u2603.b());
        this.k = \u2603.k;
        this.l = \u2603.l;
    }
    
    public enum a
    {
        a("enabled"), 
        b("disabled"), 
        c("prompt");
        
        private final eu d;
        
        private a(final String \u2603) {
            this.d = new fb("addServer.resourcePack." + \u2603, new Object[0]);
        }
        
        public eu a() {
            return this.d;
        }
    }
}
