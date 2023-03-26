import com.google.common.base.Predicates;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class qy extends rd
{
    private static final Predicate<alz> b;
    private ps c;
    private adm d;
    int a;
    
    public qy(final ps \u2603) {
        this.c = \u2603;
        this.d = \u2603.o;
        this.a(7);
    }
    
    @Override
    public boolean a() {
        if (this.c.bc().nextInt(this.c.j_() ? 50 : 1000) != 0) {
            return false;
        }
        final cj \u2603 = new cj(this.c.s, this.c.t, this.c.u);
        return qy.b.apply(this.d.p(\u2603)) || this.d.p(\u2603.b()).c() == afi.c;
    }
    
    @Override
    public void c() {
        this.a = 40;
        this.d.a(this.c, (byte)10);
        this.c.s().n();
    }
    
    @Override
    public void d() {
        this.a = 0;
    }
    
    @Override
    public boolean b() {
        return this.a > 0;
    }
    
    public int f() {
        return this.a;
    }
    
    @Override
    public void e() {
        this.a = Math.max(0, this.a - 1);
        if (this.a != 4) {
            return;
        }
        final cj cj = new cj(this.c.s, this.c.t, this.c.u);
        if (qy.b.apply(this.d.p(cj))) {
            if (this.d.Q().b("mobGriefing")) {
                this.d.b(cj, false);
            }
            this.c.v();
        }
        else {
            final cj b = cj.b();
            if (this.d.p(b).c() == afi.c) {
                if (this.d.Q().b("mobGriefing")) {
                    this.d.b(2001, b, afh.a(afi.c));
                    this.d.a(b, afi.d.Q(), 2);
                }
                this.c.v();
            }
        }
    }
    
    static {
        b = amh.a(afi.H).a(akc.a, (Predicate<? extends akc.a>)Predicates.equalTo((V)akc.a.b));
    }
}
