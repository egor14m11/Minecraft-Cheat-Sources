import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class pf
{
    private static final Logger a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    
    public pf(final int \u2603, final int \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    public pf(final int \u2603, final int \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603, false, true);
    }
    
    public pf(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.f = \u2603;
        this.h = \u2603;
    }
    
    public pf(final pf \u2603) {
        this.b = \u2603.b;
        this.c = \u2603.c;
        this.d = \u2603.d;
        this.f = \u2603.f;
        this.h = \u2603.h;
    }
    
    public void a(final pf \u2603) {
        if (this.b != \u2603.b) {
            pf.a.warn("This method should only be called for matching effects!");
        }
        if (\u2603.d > this.d) {
            this.d = \u2603.d;
            this.c = \u2603.c;
        }
        else if (\u2603.d == this.d && this.c < \u2603.c) {
            this.c = \u2603.c;
        }
        else if (!\u2603.f && this.f) {
            this.f = \u2603.f;
        }
        this.h = \u2603.h;
    }
    
    public int a() {
        return this.b;
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    public void a(final boolean \u2603) {
        this.e = \u2603;
    }
    
    public boolean e() {
        return this.f;
    }
    
    public boolean f() {
        return this.h;
    }
    
    public boolean a(final pr \u2603) {
        if (this.c > 0) {
            if (pe.a[this.b].a(this.c, this.d)) {
                this.b(\u2603);
            }
            this.i();
        }
        return this.c > 0;
    }
    
    private int i() {
        return --this.c;
    }
    
    public void b(final pr \u2603) {
        if (this.c > 0) {
            pe.a[this.b].a(\u2603, this.d);
        }
    }
    
    public String g() {
        return pe.a[this.b].a();
    }
    
    @Override
    public int hashCode() {
        return this.b;
    }
    
    @Override
    public String toString() {
        String str = "";
        if (this.c() > 0) {
            str = this.g() + " x " + (this.c() + 1) + ", Duration: " + this.b();
        }
        else {
            str = this.g() + ", Duration: " + this.b();
        }
        if (this.e) {
            str += ", Splash: true";
        }
        if (!this.h) {
            str += ", Particles: false";
        }
        if (pe.a[this.b].j()) {
            return "(" + str + ")";
        }
        return str;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (!(\u2603 instanceof pf)) {
            return false;
        }
        final pf pf = (pf)\u2603;
        return this.b == pf.b && this.d == pf.d && this.c == pf.c && this.e == pf.e && this.f == pf.f;
    }
    
    public dn a(final dn \u2603) {
        \u2603.a("Id", (byte)this.a());
        \u2603.a("Amplifier", (byte)this.c());
        \u2603.a("Duration", this.b());
        \u2603.a("Ambient", this.e());
        \u2603.a("ShowParticles", this.f());
        return \u2603;
    }
    
    public static pf b(final dn \u2603) {
        final int d = \u2603.d("Id");
        if (d < 0 || d >= pe.a.length || pe.a[d] == null) {
            return null;
        }
        final int d2 = \u2603.d("Amplifier");
        final int f = \u2603.f("Duration");
        final boolean n = \u2603.n("Ambient");
        boolean n2 = true;
        if (\u2603.b("ShowParticles", 1)) {
            n2 = \u2603.n("ShowParticles");
        }
        return new pf(d, f, d2, n, n2);
    }
    
    public void b(final boolean \u2603) {
        this.g = \u2603;
    }
    
    public boolean h() {
        return this.g;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
