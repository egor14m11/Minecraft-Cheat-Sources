import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class amc
{
    private final adm a;
    private final cj b;
    private final boolean c;
    private alz d;
    private akw e;
    private boolean f;
    
    public amc(final adm \u2603, final cj \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public alz a() {
        if (this.d == null && (this.c || this.a.e(this.b))) {
            this.d = this.a.p(this.b);
        }
        return this.d;
    }
    
    public akw b() {
        if (this.e == null && !this.f) {
            this.e = this.a.s(this.b);
            this.f = true;
        }
        return this.e;
    }
    
    public cj d() {
        return this.b;
    }
    
    public static Predicate<amc> a(final Predicate<alz> \u2603) {
        return new Predicate<amc>() {
            public boolean a(final amc \u2603) {
                return \u2603 != null && \u2603.apply(\u2603.a());
            }
        };
    }
}
