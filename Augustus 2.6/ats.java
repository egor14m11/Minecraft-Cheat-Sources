// 
// Decompiled by Procyon v0.5.36
// 

public class ats implements Comparable<ats>
{
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final boolean e;
    private final adp.a f;
    private final boolean g;
    private final boolean h;
    
    public ats(final String \u2603, final String \u2603, final long \u2603, final long \u2603, final adp.a \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.f = \u2603;
        this.e = \u2603;
        this.g = \u2603;
        this.h = \u2603;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public long c() {
        return this.d;
    }
    
    public boolean d() {
        return this.e;
    }
    
    public long e() {
        return this.c;
    }
    
    public int a(final ats \u2603) {
        if (this.c < \u2603.c) {
            return 1;
        }
        if (this.c > \u2603.c) {
            return -1;
        }
        return this.a.compareTo(\u2603.a);
    }
    
    public adp.a f() {
        return this.f;
    }
    
    public boolean g() {
        return this.g;
    }
    
    public boolean h() {
        return this.h;
    }
}
