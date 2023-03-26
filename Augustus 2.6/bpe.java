// 
// Decompiled by Procyon v0.5.36
// 

public class bpe extends bpb
{
    private final wn k;
    private final va l;
    
    public bpe(final wn \u2603, final va \u2603) {
        super(new jy("minecraft:minecart.inside"));
        this.k = \u2603;
        this.l = \u2603;
        this.i = bpj.a.a;
        this.g = true;
        this.h = 0;
    }
    
    @Override
    public void c() {
        if (this.l.I || !this.k.au() || this.k.m != this.l) {
            this.j = true;
            return;
        }
        final float a = ns.a(this.l.v * this.l.v + this.l.x * this.l.x);
        if (a >= 0.01) {
            this.b = 0.0f + ns.a(a, 0.0f, 1.0f) * 0.75f;
        }
        else {
            this.b = 0.0f;
        }
    }
}
