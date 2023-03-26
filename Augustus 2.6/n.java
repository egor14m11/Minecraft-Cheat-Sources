// 
// Decompiled by Procyon v0.5.36
// 

public class n
{
    private static final int a;
    private static final String[] b;
    private String[] c;
    private String[] d;
    
    public n() {
        this.c = n.b;
        this.d = n.b;
    }
    
    public void a(final m \u2603, final a \u2603, final int \u2603) {
        final String \u26032 = this.c[\u2603.a()];
        if (\u26032 == null) {
            return;
        }
        final m \u26033 = new m() {
            @Override
            public String e_() {
                return \u2603.e_();
            }
            
            @Override
            public eu f_() {
                return \u2603.f_();
            }
            
            @Override
            public void a(final eu \u2603) {
                \u2603.a(\u2603);
            }
            
            @Override
            public boolean a(final int \u2603, final String \u2603) {
                return true;
            }
            
            @Override
            public cj c() {
                return \u2603.c();
            }
            
            @Override
            public aui d() {
                return \u2603.d();
            }
            
            @Override
            public adm e() {
                return \u2603.e();
            }
            
            @Override
            public pk f() {
                return \u2603.f();
            }
            
            @Override
            public boolean u_() {
                return \u2603.u_();
            }
            
            @Override
            public void a(final a \u2603, final int \u2603) {
                \u2603.a(\u2603, \u2603);
            }
        };
        String e;
        try {
            e = i.e(\u26033, \u26032);
        }
        catch (ca ca) {
            return;
        }
        final String \u26034 = this.d[\u2603.a()];
        if (\u26034 == null) {
            return;
        }
        final auo z = \u2603.e().Z();
        final auk b = z.b(\u26034);
        if (b == null) {
            return;
        }
        if (!z.b(e, b)) {
            return;
        }
        final aum c = z.c(e, b);
        c.c(\u2603);
    }
    
    public void a(final dn \u2603) {
        if (!\u2603.b("CommandStats", 10)) {
            return;
        }
        final dn m = \u2603.m("CommandStats");
        for (final a \u26032 : n.a.values()) {
            final String string = \u26032.b() + "Name";
            final String string2 = \u26032.b() + "Objective";
            if (m.b(string, 8)) {
                if (m.b(string2, 8)) {
                    final String j = m.j(string);
                    final String k = m.j(string2);
                    a(this, \u26032, j, k);
                }
            }
        }
    }
    
    public void b(final dn \u2603) {
        final dn \u26032 = new dn();
        for (final a a : n.a.values()) {
            final String \u26033 = this.c[a.a()];
            final String \u26034 = this.d[a.a()];
            if (\u26033 != null) {
                if (\u26034 != null) {
                    \u26032.a(a.b() + "Name", \u26033);
                    \u26032.a(a.b() + "Objective", \u26034);
                }
            }
        }
        if (!\u26032.c_()) {
            \u2603.a("CommandStats", \u26032);
        }
    }
    
    public static void a(final n \u2603, final a \u2603, final String \u2603, final String \u2603) {
        if (\u2603 == null || \u2603.length() == 0 || \u2603 == null || \u2603.length() == 0) {
            a(\u2603, \u2603);
            return;
        }
        if (\u2603.c == n.b || \u2603.d == n.b) {
            \u2603.c = new String[n.a];
            \u2603.d = new String[n.a];
        }
        \u2603.c[\u2603.a()] = \u2603;
        \u2603.d[\u2603.a()] = \u2603;
    }
    
    private static void a(final n \u2603, final a \u2603) {
        if (\u2603.c == n.b || \u2603.d == n.b) {
            return;
        }
        \u2603.c[\u2603.a()] = null;
        \u2603.d[\u2603.a()] = null;
        boolean b = true;
        for (final a a : n.a.values()) {
            if (\u2603.c[a.a()] != null && \u2603.d[a.a()] != null) {
                b = false;
                break;
            }
        }
        if (b) {
            \u2603.c = n.b;
            \u2603.d = n.b;
        }
    }
    
    public void a(final n \u2603) {
        for (final a \u26032 : n.a.values()) {
            a(this, \u26032, \u2603.c[\u26032.a()], \u2603.d[\u26032.a()]);
        }
    }
    
    static {
        a = n.a.values().length;
        b = new String[n.a];
    }
    
    public enum a
    {
        a(0, "SuccessCount"), 
        b(1, "AffectedBlocks"), 
        c(2, "AffectedEntities"), 
        d(3, "AffectedItems"), 
        e(4, "QueryResult");
        
        final int f;
        final String g;
        
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
        
        public static String[] c() {
            final String[] array = new String[values().length];
            int n = 0;
            for (final a a : values()) {
                array[n++] = a.b();
            }
            return array;
        }
        
        public static a a(final String \u2603) {
            for (final a a : values()) {
                if (a.b().equals(\u2603)) {
                    return a;
                }
            }
            return null;
        }
    }
}
