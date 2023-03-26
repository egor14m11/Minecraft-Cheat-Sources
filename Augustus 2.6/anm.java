// 
// Decompiled by Procyon v0.5.36
// 

public abstract class anm
{
    public static final float[] a;
    protected adm b;
    private adr h;
    private String i;
    protected aec c;
    protected boolean d;
    protected boolean e;
    protected final float[] f;
    protected int g;
    private final float[] j;
    
    public anm() {
        this.f = new float[16];
        this.j = new float[4];
    }
    
    public final void a(final adm \u2603) {
        this.b = \u2603;
        this.h = \u2603.P().u();
        this.i = \u2603.P().B();
        this.b();
        this.a();
    }
    
    protected void a() {
        final float n = 0.0f;
        for (int i = 0; i <= 15; ++i) {
            final float n2 = 1.0f - i / 15.0f;
            this.f[i] = (1.0f - n2) / (n2 * 3.0f + 1.0f) * (1.0f - n) + n;
        }
    }
    
    protected void b() {
        final adr u = this.b.P().u();
        if (u == adr.c) {
            final apz a = apz.a(this.b.P().B());
            this.c = new aef(ady.a(a.a(), ady.ad), 0.5f);
        }
        else if (u == adr.g) {
            this.c = new aef(ady.q, 0.0f);
        }
        else {
            this.c = new aec(this.b);
        }
    }
    
    public amv c() {
        if (this.h == adr.c) {
            return new anv(this.b, this.b.J(), this.b.P().s(), this.i);
        }
        if (this.h == adr.g) {
            return new anu(this.b);
        }
        if (this.h == adr.f) {
            return new aoa(this.b, this.b.J(), this.b.P().s(), this.i);
        }
        return new aoa(this.b, this.b.J(), this.b.P().s(), this.i);
    }
    
    public boolean a(final int \u2603, final int \u2603) {
        return this.b.c(new cj(\u2603, 0, \u2603)) == afi.c;
    }
    
    public float a(final long \u2603, final float \u2603) {
        final int n = (int)(\u2603 % 24000L);
        float n2 = (n + \u2603) / 24000.0f - 0.25f;
        if (n2 < 0.0f) {
            ++n2;
        }
        if (n2 > 1.0f) {
            --n2;
        }
        final float n3 = n2;
        n2 = 1.0f - (float)((Math.cos(n2 * 3.141592653589793) + 1.0) / 2.0);
        n2 = n3 + (n2 - n3) / 3.0f;
        return n2;
    }
    
    public int a(final long \u2603) {
        return (int)(\u2603 / 24000L % 8L + 8L) % 8;
    }
    
    public boolean d() {
        return true;
    }
    
    public float[] a(final float \u2603, final float \u2603) {
        final float n = 0.4f;
        final float n2 = ns.b(\u2603 * 3.1415927f * 2.0f) - 0.0f;
        final float n3 = -0.0f;
        if (n2 >= n3 - n && n2 <= n3 + n) {
            final float n4 = (n2 - n3) / n * 0.5f + 0.5f;
            float n5 = 1.0f - (1.0f - ns.a(n4 * 3.1415927f)) * 0.99f;
            n5 *= n5;
            this.j[0] = n4 * 0.3f + 0.7f;
            this.j[1] = n4 * n4 * 0.7f + 0.2f;
            this.j[2] = n4 * n4 * 0.0f + 0.2f;
            this.j[3] = n5;
            return this.j;
        }
        return null;
    }
    
    public aui b(final float \u2603, final float \u2603) {
        float a = ns.b(\u2603 * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        a = ns.a(a, 0.0f, 1.0f);
        float n = 0.7529412f;
        float n2 = 0.84705883f;
        float n3 = 1.0f;
        n *= a * 0.94f + 0.06f;
        n2 *= a * 0.94f + 0.06f;
        n3 *= a * 0.91f + 0.09f;
        return new aui(n, n2, n3);
    }
    
    public boolean e() {
        return true;
    }
    
    public static anm a(final int \u2603) {
        if (\u2603 == -1) {
            return new ann();
        }
        if (\u2603 == 0) {
            return new ano();
        }
        if (\u2603 == 1) {
            return new anp();
        }
        return null;
    }
    
    public float f() {
        return 128.0f;
    }
    
    public boolean g() {
        return true;
    }
    
    public cj h() {
        return null;
    }
    
    public int i() {
        if (this.h == adr.c) {
            return 4;
        }
        return this.b.F() + 1;
    }
    
    public double j() {
        if (this.h == adr.c) {
            return 1.0;
        }
        return 0.03125;
    }
    
    public boolean b(final int \u2603, final int \u2603) {
        return false;
    }
    
    public abstract String k();
    
    public abstract String l();
    
    public aec m() {
        return this.c;
    }
    
    public boolean n() {
        return this.d;
    }
    
    public boolean o() {
        return this.e;
    }
    
    public float[] p() {
        return this.f;
    }
    
    public int q() {
        return this.g;
    }
    
    public ams r() {
        return new ams();
    }
    
    static {
        a = new float[] { 1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f };
    }
}
