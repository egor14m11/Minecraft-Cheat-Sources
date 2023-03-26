// 
// Decompiled by Procyon v0.5.36
// 

public class bmo extends bmi
{
    private double j;
    private double k;
    
    public bmo(final String \u2603) {
        super(\u2603);
    }
    
    @Override
    public void j() {
        if (this.a.isEmpty()) {
            return;
        }
        final ave a = ave.A();
        double random = 0.0;
        if (a.f != null && a.h != null) {
            random = a.f.c(1.0f);
            if (!a.f.t.d()) {
                random = Math.random();
            }
        }
        double a2;
        for (a2 = random - this.j; a2 < -0.5; ++a2) {}
        while (a2 >= 0.5) {
            --a2;
        }
        a2 = ns.a(a2, -1.0, 1.0);
        this.k += a2 * 0.1;
        this.k *= 0.8;
        this.j += this.k;
        int i;
        for (i = (int)((this.j + 1.0) * this.a.size()) % this.a.size(); i < 0; i = (i + this.a.size()) % this.a.size()) {}
        if (i != this.h) {
            this.h = i;
            bml.a(this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        }
    }
}
