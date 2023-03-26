// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ro extends rd
{
    private final py c;
    private final double d;
    protected int a;
    private int e;
    private int f;
    protected cj b;
    private boolean g;
    private int h;
    
    public ro(final py \u2603, final double \u2603, final int \u2603) {
        this.b = cj.a;
        this.c = \u2603;
        this.d = \u2603;
        this.h = \u2603;
        this.a(5);
    }
    
    @Override
    public boolean a() {
        if (this.a > 0) {
            --this.a;
            return false;
        }
        this.a = 200 + this.c.bc().nextInt(200);
        return this.g();
    }
    
    @Override
    public boolean b() {
        return this.e >= -this.f && this.e <= 1200 && this.a(this.c.o, this.b);
    }
    
    @Override
    public void c() {
        this.c.s().a((float)this.b.n() + 0.5, this.b.o() + 1, (float)this.b.p() + 0.5, this.d);
        this.e = 0;
        this.f = this.c.bc().nextInt(this.c.bc().nextInt(1200) + 1200) + 1200;
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public void e() {
        if (this.c.c(this.b.a()) > 1.0) {
            this.g = false;
            ++this.e;
            if (this.e % 40 == 0) {
                this.c.s().a((float)this.b.n() + 0.5, this.b.o() + 1, (float)this.b.p() + 0.5, this.d);
            }
        }
        else {
            this.g = true;
            --this.e;
        }
    }
    
    protected boolean f() {
        return this.g;
    }
    
    private boolean g() {
        final int h = this.h;
        final int n = 1;
        final cj cj = new cj(this.c);
        for (int i = 0; i <= 1; i = ((i > 0) ? (-i) : (1 - i))) {
            for (int j = 0; j < h; ++j) {
                for (int k = 0; k <= j; k = ((k > 0) ? (-k) : (1 - k))) {
                    for (int l = (k < j && k > -j) ? j : 0; l <= j; l = ((l > 0) ? (-l) : (1 - l))) {
                        final cj a = cj.a(k, i - 1, l);
                        if (this.c.e(a) && this.a(this.c.o, a)) {
                            this.b = a;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    protected abstract boolean a(final adm p0, final cj p1);
}
