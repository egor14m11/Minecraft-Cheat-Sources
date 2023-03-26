// 
// Decompiled by Procyon v0.5.36
// 

public final class adp
{
    private final long a;
    private final a b;
    private final boolean c;
    private final boolean d;
    private final adr e;
    private boolean f;
    private boolean g;
    private String h;
    
    public adp(final long \u2603, final a \u2603, final boolean \u2603, final boolean \u2603, final adr \u2603) {
        this.h = "";
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    public adp(final ato \u2603) {
        this(\u2603.b(), \u2603.r(), \u2603.s(), \u2603.t(), \u2603.u());
    }
    
    public adp a() {
        this.g = true;
        return this;
    }
    
    public adp b() {
        this.f = true;
        return this;
    }
    
    public adp a(final String \u2603) {
        this.h = \u2603;
        return this;
    }
    
    public boolean c() {
        return this.g;
    }
    
    public long d() {
        return this.a;
    }
    
    public a e() {
        return this.b;
    }
    
    public boolean f() {
        return this.d;
    }
    
    public boolean g() {
        return this.c;
    }
    
    public adr h() {
        return this.e;
    }
    
    public boolean i() {
        return this.f;
    }
    
    public static a a(final int \u2603) {
        return a.a(\u2603);
    }
    
    public String j() {
        return this.h;
    }
    
    public enum a
    {
        a(-1, ""), 
        b(0, "survival"), 
        c(1, "creative"), 
        d(2, "adventure"), 
        e(3, "spectator");
        
        int f;
        String g;
        
        private a(final int \u2603, final String \u2603) {
            this.f = \u2603;
            this.g = \u2603;
        }
        
        public int a() {
            return this.f;
        }
        
        public String b() {
            return this.g;
        }
        
        public void a(final wl \u2603) {
            if (this == a.c) {
                \u2603.c = true;
                \u2603.d = true;
                \u2603.a = true;
            }
            else if (this == a.e) {
                \u2603.c = true;
                \u2603.d = false;
                \u2603.a = true;
                \u2603.b = true;
            }
            else {
                \u2603.c = false;
                \u2603.d = false;
                \u2603.a = false;
                \u2603.b = false;
            }
            \u2603.e = !this.c();
        }
        
        public boolean c() {
            return this == a.d || this == a.e;
        }
        
        public boolean d() {
            return this == a.c;
        }
        
        public boolean e() {
            return this == a.b || this == a.d;
        }
        
        public static a a(final int \u2603) {
            for (final a a : values()) {
                if (a.f == \u2603) {
                    return a;
                }
            }
            return a.b;
        }
        
        public static a a(final String \u2603) {
            for (final a a : values()) {
                if (a.g.equals(\u2603)) {
                    return a;
                }
            }
            return a.b;
        }
    }
}
