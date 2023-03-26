import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ale extends akw implements km, ol
{
    public int a;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    private static Random o;
    private String p;
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.l_()) {
            \u2603.a("CustomName", this.p);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("CustomName", 8)) {
            this.p = \u2603.j("CustomName");
        }
    }
    
    @Override
    public void c() {
        this.k = this.j;
        this.m = this.l;
        final wn a = this.b.a(this.c.n() + 0.5f, this.c.o() + 0.5f, this.c.p() + 0.5f, 3.0);
        if (a != null) {
            final double \u2603 = a.s - (this.c.n() + 0.5f);
            final double \u26032 = a.u - (this.c.p() + 0.5f);
            this.n = (float)ns.b(\u26032, \u2603);
            this.j += 0.1f;
            if (this.j < 0.5f || ale.o.nextInt(40) == 0) {
                final float h = this.h;
                do {
                    this.h += ale.o.nextInt(4) - ale.o.nextInt(4);
                } while (h == this.h);
            }
        }
        else {
            this.n += 0.02f;
            this.j -= 0.1f;
        }
        while (this.l >= 3.1415927f) {
            this.l -= 6.2831855f;
        }
        while (this.l < -3.1415927f) {
            this.l += 6.2831855f;
        }
        while (this.n >= 3.1415927f) {
            this.n -= 6.2831855f;
        }
        while (this.n < -3.1415927f) {
            this.n += 6.2831855f;
        }
        float n;
        for (n = this.n - this.l; n >= 3.1415927f; n -= 6.2831855f) {}
        while (n < -3.1415927f) {
            n += 6.2831855f;
        }
        this.l += n * 0.4f;
        this.j = ns.a(this.j, 0.0f, 1.0f);
        ++this.a;
        this.g = this.f;
        float a2 = (this.h - this.f) * 0.4f;
        final float \u26033 = 0.2f;
        a2 = ns.a(a2, -\u26033, \u26033);
        this.i += (a2 - this.i) * 0.9f;
        this.f += this.i;
    }
    
    @Override
    public String e_() {
        return this.l_() ? this.p : "container.enchant";
    }
    
    @Override
    public boolean l_() {
        return this.p != null && this.p.length() > 0;
    }
    
    public void a(final String \u2603) {
        this.p = \u2603;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xs(\u2603, this.b, this.c);
    }
    
    @Override
    public String k() {
        return "minecraft:enchanting_table";
    }
    
    static {
        ale.o = new Random();
    }
}
