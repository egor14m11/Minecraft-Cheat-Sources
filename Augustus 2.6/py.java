import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class py extends ps
{
    public static final UUID bk;
    public static final qd bl;
    private cj a;
    private float b;
    private rd c;
    private boolean bm;
    
    public py(final adm \u2603) {
        super(\u2603);
        this.a = cj.a;
        this.b = -1.0f;
        this.c = new rp(this, 1.0);
    }
    
    public float a(final cj \u2603) {
        return 0.0f;
    }
    
    @Override
    public boolean bR() {
        return super.bR() && this.a(new cj(this.s, this.aR().b, this.u)) >= 0.0f;
    }
    
    public boolean cf() {
        return !this.h.m();
    }
    
    public boolean cg() {
        return this.e(new cj(this));
    }
    
    public boolean e(final cj \u2603) {
        return this.b == -1.0f || this.a.i(\u2603) < this.b * this.b;
    }
    
    public void a(final cj \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = (float)\u2603;
    }
    
    public cj ch() {
        return this.a;
    }
    
    public float ci() {
        return this.b;
    }
    
    public void cj() {
        this.b = -1.0f;
    }
    
    public boolean ck() {
        return this.b != -1.0f;
    }
    
    @Override
    protected void ca() {
        super.ca();
        if (this.cc() && this.cd() != null && this.cd().o == this.o) {
            final pk cd = this.cd();
            this.a(new cj((int)cd.s, (int)cd.t, (int)cd.u), 5);
            final float g = this.g(cd);
            if (this instanceof qa && ((qa)this).cn()) {
                if (g > 10.0f) {
                    this.a(true, true);
                }
                return;
            }
            if (!this.bm) {
                this.i.a(2, this.c);
                if (this.s() instanceof sv) {
                    ((sv)this.s()).a(false);
                }
                this.bm = true;
            }
            this.o(g);
            if (g > 4.0f) {
                this.s().a(cd, 1.0);
            }
            if (g > 6.0f) {
                final double a = (cd.s - this.s) / g;
                final double a2 = (cd.t - this.t) / g;
                final double a3 = (cd.u - this.u) / g;
                this.v += a * Math.abs(a) * 0.4;
                this.w += a2 * Math.abs(a2) * 0.4;
                this.x += a3 * Math.abs(a3) * 0.4;
            }
            if (g > 10.0f) {
                this.a(true, true);
            }
        }
        else if (!this.cc() && this.bm) {
            this.bm = false;
            this.i.a(this.c);
            if (this.s() instanceof sv) {
                ((sv)this.s()).a(true);
            }
            this.cj();
        }
    }
    
    protected void o(final float \u2603) {
    }
    
    static {
        bk = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
        bl = new qd(py.bk, "Fleeing speed bonus", 2.0, 2).a(false);
    }
}
