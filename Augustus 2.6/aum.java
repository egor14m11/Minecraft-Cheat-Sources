import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class aum
{
    public static final Comparator<aum> a;
    private final auo b;
    private final auk c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;
    
    public aum(final auo \u2603, final auk \u2603, final String \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.g = true;
    }
    
    public void a(final int \u2603) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() + \u2603);
    }
    
    public void b(final int \u2603) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() - \u2603);
    }
    
    public void a() {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.a(1);
    }
    
    public int c() {
        return this.e;
    }
    
    public void c(final int \u2603) {
        final int e = this.e;
        this.e = \u2603;
        if (e != \u2603 || this.g) {
            this.g = false;
            this.f().a(this);
        }
    }
    
    public auk d() {
        return this.c;
    }
    
    public String e() {
        return this.d;
    }
    
    public auo f() {
        return this.b;
    }
    
    public boolean g() {
        return this.f;
    }
    
    public void a(final boolean \u2603) {
        this.f = \u2603;
    }
    
    public void a(final List<wn> \u2603) {
        this.c(this.c.c().a(\u2603));
    }
    
    static {
        a = new Comparator<aum>() {
            public int a(final aum \u2603, final aum \u2603) {
                if (\u2603.c() > \u2603.c()) {
                    return 1;
                }
                if (\u2603.c() < \u2603.c()) {
                    return -1;
                }
                return \u2603.e().compareToIgnoreCase(\u2603.e());
            }
        };
    }
}
