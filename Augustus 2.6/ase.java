import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ase
{
    private long c;
    protected ase a;
    private long d;
    protected long b;
    
    public static ase[] a(final long \u2603, final adr \u2603, final String \u2603) {
        ase b = new asd(1L);
        b = new asa(2000L, b);
        b = new ars(1L, b);
        b = new asr(2001L, b);
        b = new ars(2L, b);
        b = new ars(50L, b);
        b = new ars(70L, b);
        b = new ash(2L, b);
        b = new aru(2L, b);
        b = new ars(3L, b);
        b = new arr(2L, b, arr.a.a);
        b = new arr(2L, b, arr.a.b);
        b = new arr(3L, b, arr.a.c);
        b = new asr(2002L, b);
        b = new asr(2003L, b);
        b = new ars(4L, b);
        b = new art(5L, b);
        b = new arq(4L, b);
        b = asr.b(1000L, b, 0);
        ant b2 = null;
        int h;
        int g = h = 4;
        if (\u2603 == adr.f && \u2603.length() > 0) {
            b2 = ant.a.a(\u2603).b();
            g = b2.G;
            h = b2.H;
        }
        if (\u2603 == adr.d) {
            g = 6;
        }
        ase \u26032 = b;
        \u26032 = asr.b(1000L, \u26032, 0);
        \u26032 = new asi(100L, \u26032);
        ase b3 = b;
        b3 = new arw(200L, b3, \u2603, \u2603);
        b3 = asr.b(1000L, b3, 2);
        b3 = new arv(1000L, b3);
        ase b4 = \u26032;
        b4 = asr.b(1000L, b4, 2);
        b3 = new asg(1000L, b3, b4);
        \u26032 = asr.b(1000L, \u26032, 2);
        \u26032 = asr.b(1000L, \u26032, h);
        \u26032 = new asj(1L, \u26032);
        \u26032 = new asm(1000L, \u26032);
        b3 = new asf(1001L, b3);
        for (int i = 0; i < g; ++i) {
            b3 = new asr(1000 + i, b3);
            if (i == 0) {
                b3 = new ars(3L, b3);
            }
            if (i == 1 || g == 1) {
                b3 = new asl(1000L, b3);
            }
        }
        b3 = new asm(1000L, b3);
        final ase ase;
        b3 = (ase = new ask(100L, b3, \u26032));
        final ase ase2 = new asq(10L, b3);
        b3.a(\u2603);
        ase2.a(\u2603);
        return new ase[] { b3, ase2, ase };
    }
    
    public ase(final long \u2603) {
        this.b = \u2603;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += \u2603;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += \u2603;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += \u2603;
    }
    
    public void a(final long \u2603) {
        this.c = \u2603;
        if (this.a != null) {
            this.a.a(\u2603);
        }
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
    }
    
    public void a(final long \u2603, final long \u2603) {
        this.d = this.c;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += \u2603;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += \u2603;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += \u2603;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += \u2603;
    }
    
    protected int a(final int \u2603) {
        int n = (int)((this.d >> 24) % \u2603);
        if (n < 0) {
            n += \u2603;
        }
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += this.c;
        return n;
    }
    
    public abstract int[] a(final int p0, final int p1, final int p2, final int p3);
    
    protected static boolean a(final int \u2603, final int \u2603) {
        if (\u2603 == \u2603) {
            return true;
        }
        if (\u2603 == ady.ab.az || \u2603 == ady.ac.az) {
            return \u2603 == ady.ab.az || \u2603 == ady.ac.az;
        }
        final ady e = ady.e(\u2603);
        final ady e2 = ady.e(\u2603);
        try {
            if (e != null && e2 != null) {
                return e.a(e2);
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Comparing biomes");
            final c a2 = a.a("Biomes being compared");
            a2.a("Biome A ID", \u2603);
            a2.a("Biome B ID", \u2603);
            a2.a("Biome A", new Callable<String>() {
                public String a() throws Exception {
                    return String.valueOf(e);
                }
            });
            a2.a("Biome B", new Callable<String>() {
                public String a() throws Exception {
                    return String.valueOf(e2);
                }
            });
            throw new e(a);
        }
        return false;
    }
    
    protected static boolean b(final int \u2603) {
        return \u2603 == ady.p.az || \u2603 == ady.N.az || \u2603 == ady.z.az;
    }
    
    protected int a(final int... \u2603) {
        return \u2603[this.a(\u2603.length)];
    }
    
    protected int b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == \u2603 && \u2603 == \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 == \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 == \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 == \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        if (\u2603 == \u2603 && \u2603 != \u2603) {
            return \u2603;
        }
        return this.a(new int[] { \u2603, \u2603, \u2603, \u2603 });
    }
}
