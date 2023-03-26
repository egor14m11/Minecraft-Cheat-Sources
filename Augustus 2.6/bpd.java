// 
// Decompiled by Procyon v0.5.36
// 

public class bpd extends bpb
{
    private final va k;
    private float l;
    
    public bpd(final va \u2603) {
        super(new jy("minecraft:minecart.base"));
        this.l = 0.0f;
        this.k = \u2603;
        this.g = true;
        this.h = 0;
    }
    
    @Override
    public void c() {
        if (this.k.I) {
            this.j = true;
            return;
        }
        this.d = (float)this.k.s;
        this.e = (float)this.k.t;
        this.f = (float)this.k.u;
        final float a = ns.a(this.k.v * this.k.v + this.k.x * this.k.x);
        if (a >= 0.01) {
            this.l = ns.a(this.l + 0.0025f, 0.0f, 1.0f);
            this.b = 0.0f + ns.a(a, 0.0f, 0.5f) * 0.7f;
        }
        else {
            this.l = 0.0f;
            this.b = 0.0f;
        }
    }
}
