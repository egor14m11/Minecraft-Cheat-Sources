import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bej extends beb
{
    private static final Random a;
    private int az;
    
    protected bej(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.5 - bej.a.nextDouble(), \u2603, 0.5 - bej.a.nextDouble());
        this.az = 128;
        this.w *= 0.20000000298023224;
        if (\u2603 == 0.0 && \u2603 == 0.0) {
            this.v *= 0.10000000149011612;
            this.x *= 0.10000000149011612;
        }
        this.h *= 0.75f;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.T = false;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float a = (this.f + \u2603) / this.g * 32.0f;
        a = ns.a(a, 0.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        this.k(this.az + (7 - this.f * 8 / this.g));
        this.w += 0.004;
        this.d(this.v, this.w, this.x);
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= 0.9599999785423279;
        this.w *= 0.9599999785423279;
        this.x *= 0.9599999785423279;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public void a(final int \u2603) {
        this.az = \u2603;
    }
    
    static {
        a = new Random();
    }
    
    public static class d implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bej(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public static class c implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bej(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            beb.b((float)\u2603, (float)\u2603, (float)\u2603);
            return beb;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bej(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            beb.i(0.15f);
            beb.b((float)\u2603, (float)\u2603, (float)\u2603);
            return beb;
        }
    }
    
    public static class e implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bej(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            ((bej)beb).a(144);
            final float n = \u2603.s.nextFloat() * 0.5f + 0.35f;
            beb.b(1.0f * n, 0.0f * n, 1.0f * n);
            return beb;
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bej(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            ((bej)beb).a(144);
            return beb;
        }
    }
}
