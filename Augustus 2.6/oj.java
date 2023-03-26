// 
// Decompiled by Procyon v0.5.36
// 

public enum oj
{
    a(0, "options.difficulty.peaceful"), 
    b(1, "options.difficulty.easy"), 
    c(2, "options.difficulty.normal"), 
    d(3, "options.difficulty.hard");
    
    private static final oj[] e;
    private final int f;
    private final String g;
    
    private oj(final int \u2603, final String \u2603) {
        this.f = \u2603;
        this.g = \u2603;
    }
    
    public int a() {
        return this.f;
    }
    
    public static oj a(final int \u2603) {
        return oj.e[\u2603 % oj.e.length];
    }
    
    public String b() {
        return this.g;
    }
    
    static {
        e = new oj[values().length];
        for (final oj oj : values()) {
            oj.e[oj.f] = oj;
        }
    }
}
