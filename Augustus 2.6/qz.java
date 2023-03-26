import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class qz extends rd
{
    private py a;
    private double b;
    private double c;
    private double d;
    private double e;
    private adm f;
    
    public qz(final py \u2603, final double \u2603) {
        this.a = \u2603;
        this.e = \u2603;
        this.f = \u2603.o;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (!this.f.w()) {
            return false;
        }
        if (!this.a.at()) {
            return false;
        }
        if (!this.f.i(new cj(this.a.s, this.a.aR().b, this.a.u))) {
            return false;
        }
        final aui f = this.f();
        if (f == null) {
            return false;
        }
        this.b = f.a;
        this.c = f.b;
        this.d = f.c;
        return true;
    }
    
    @Override
    public boolean b() {
        return !this.a.s().m();
    }
    
    @Override
    public void c() {
        this.a.s().a(this.b, this.c, this.d, this.e);
    }
    
    private aui f() {
        final Random bc = this.a.bc();
        final cj cj = new cj(this.a.s, this.a.aR().b, this.a.u);
        for (int i = 0; i < 10; ++i) {
            final cj a = cj.a(bc.nextInt(20) - 10, bc.nextInt(6) - 3, bc.nextInt(20) - 10);
            if (!this.f.i(a) && this.a.a(a) < 0.0f) {
                return new aui(a.n(), a.o(), a.p());
            }
        }
        return null;
    }
}
