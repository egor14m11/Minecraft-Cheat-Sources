import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aec
{
    private ase b;
    private ase c;
    private adz d;
    private List<ady> e;
    private String f;
    
    protected aec() {
        this.d = new adz(this);
        this.f = "";
        (this.e = (List<ady>)Lists.newArrayList()).add(ady.t);
        this.e.add(ady.q);
        this.e.add(ady.u);
        this.e.add(ady.I);
        this.e.add(ady.H);
        this.e.add(ady.K);
        this.e.add(ady.L);
    }
    
    public aec(final long \u2603, final adr \u2603, final String \u2603) {
        this();
        this.f = \u2603;
        final ase[] a = ase.a(\u2603, \u2603, \u2603);
        this.b = a[0];
        this.c = a[1];
    }
    
    public aec(final adm \u2603) {
        this(\u2603.J(), \u2603.P().u(), \u2603.P().B());
    }
    
    public List<ady> a() {
        return this.e;
    }
    
    public ady a(final cj \u2603) {
        return this.a(\u2603, null);
    }
    
    public ady a(final cj \u2603, final ady \u2603) {
        return this.d.a(\u2603.n(), \u2603.p(), \u2603);
    }
    
    public float[] a(float[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        asc.a();
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new float[\u2603 * \u2603];
        }
        final int[] a = this.c.a(\u2603, \u2603, \u2603, \u2603);
        for (int i = 0; i < \u2603 * \u2603; ++i) {
            try {
                float n = ady.a(a[i], ady.ad).h() / 65536.0f;
                if (n > 1.0f) {
                    n = 1.0f;
                }
                \u2603[i] = n;
            }
            catch (Throwable \u26032) {
                final b a2 = b.a(\u26032, "Invalid Biome id");
                final c a3 = a2.a("DownfallBlock");
                a3.a("biome id", i);
                a3.a("downfalls[] size", \u2603.length);
                a3.a("x", \u2603);
                a3.a("z", \u2603);
                a3.a("w", \u2603);
                a3.a("h", \u2603);
                throw new e(a2);
            }
        }
        return \u2603;
    }
    
    public float a(final float \u2603, final int \u2603) {
        return \u2603;
    }
    
    public ady[] a(ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        asc.a();
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new ady[\u2603 * \u2603];
        }
        final int[] a = this.b.a(\u2603, \u2603, \u2603, \u2603);
        try {
            for (int i = 0; i < \u2603 * \u2603; ++i) {
                \u2603[i] = ady.a(a[i], ady.ad);
            }
        }
        catch (Throwable \u26032) {
            final b a2 = b.a(\u26032, "Invalid Biome id");
            final c a3 = a2.a("RawBiomeBlock");
            a3.a("biomes[] size", \u2603.length);
            a3.a("x", \u2603);
            a3.a("z", \u2603);
            a3.a("w", \u2603);
            a3.a("h", \u2603);
            throw new e(a2);
        }
        return \u2603;
    }
    
    public ady[] b(final ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603, \u2603, true);
    }
    
    public ady[] a(ady[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        asc.a();
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new ady[\u2603 * \u2603];
        }
        if (\u2603 && \u2603 == 16 && \u2603 == 16 && (\u2603 & 0xF) == 0x0 && (\u2603 & 0xF) == 0x0) {
            final ady[] c = this.d.c(\u2603, \u2603);
            System.arraycopy(c, 0, \u2603, 0, \u2603 * \u2603);
            return \u2603;
        }
        final int[] a = this.c.a(\u2603, \u2603, \u2603, \u2603);
        for (int i = 0; i < \u2603 * \u2603; ++i) {
            \u2603[i] = ady.a(a[i], ady.ad);
        }
        return \u2603;
    }
    
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final List<ady> \u2603) {
        asc.a();
        final int n = \u2603 - \u2603 >> 2;
        final int n2 = \u2603 - \u2603 >> 2;
        final int n3 = \u2603 + \u2603 >> 2;
        final int n4 = \u2603 + \u2603 >> 2;
        final int n5 = n3 - n + 1;
        final int n6 = n4 - n2 + 1;
        final int[] a = this.b.a(n, n2, n5, n6);
        try {
            for (int i = 0; i < n5 * n6; ++i) {
                final ady e = ady.e(a[i]);
                if (!\u2603.contains(e)) {
                    return false;
                }
            }
        }
        catch (Throwable \u26032) {
            final b a2 = b.a(\u26032, "Invalid Biome id");
            final c a3 = a2.a("Layer");
            a3.a("Layer", this.b.toString());
            a3.a("x", \u2603);
            a3.a("z", \u2603);
            a3.a("radius", \u2603);
            a3.a("allowed", \u2603);
            throw new e(a2);
        }
        return true;
    }
    
    public cj a(final int \u2603, final int \u2603, final int \u2603, final List<ady> \u2603, final Random \u2603) {
        asc.a();
        final int n = \u2603 - \u2603 >> 2;
        final int n2 = \u2603 - \u2603 >> 2;
        final int n3 = \u2603 + \u2603 >> 2;
        final int n4 = \u2603 + \u2603 >> 2;
        final int n5 = n3 - n + 1;
        final int n6 = n4 - n2 + 1;
        final int[] a = this.b.a(n, n2, n5, n6);
        cj cj = null;
        int n7 = 0;
        for (int i = 0; i < n5 * n6; ++i) {
            final int \u26032 = n + i % n5 << 2;
            final int \u26033 = n2 + i / n5 << 2;
            final ady e = ady.e(a[i]);
            if (\u2603.contains(e) && (cj == null || \u2603.nextInt(n7 + 1) == 0)) {
                cj = new cj(\u26032, 0, \u26033);
                ++n7;
            }
        }
        return cj;
    }
    
    public void b() {
        this.d.a();
    }
}
