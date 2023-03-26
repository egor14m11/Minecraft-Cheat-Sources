// 
// Decompiled by Procyon v0.5.36
// 

public class ang
{
    public static a a(final dn \u2603) {
        final int f = \u2603.f("xPos");
        final int f2 = \u2603.f("zPos");
        final a a = new a(f, f2);
        a.g = \u2603.k("Blocks");
        a.f = new ana(\u2603.k("Data"), 7);
        a.e = new ana(\u2603.k("SkyLight"), 7);
        a.d = new ana(\u2603.k("BlockLight"), 7);
        a.c = \u2603.k("HeightMap");
        a.b = \u2603.n("TerrainPopulated");
        a.h = \u2603.c("Entities", 10);
        a.i = \u2603.c("TileEntities", 10);
        a.j = \u2603.c("TileTicks", 10);
        try {
            a.a = \u2603.g("LastUpdate");
        }
        catch (ClassCastException ex) {
            a.a = \u2603.f("LastUpdate");
        }
        return a;
    }
    
    public static void a(final a \u2603, final dn \u2603, final aec \u2603) {
        \u2603.a("xPos", \u2603.k);
        \u2603.a("zPos", \u2603.l);
        \u2603.a("LastUpdate", \u2603.a);
        final int[] \u26032 = new int[\u2603.c.length];
        for (int i = 0; i < \u2603.c.length; ++i) {
            \u26032[i] = \u2603.c[i];
        }
        \u2603.a("HeightMap", \u26032);
        \u2603.a("TerrainPopulated", \u2603.b);
        final du \u26033 = new du();
        for (int j = 0; j < 8; ++j) {
            boolean b = true;
            for (int k = 0; k < 16 && b; ++k) {
                for (int l = 0; l < 16 && b; ++l) {
                    for (int n = 0; n < 16; ++n) {
                        final int n2 = k << 11 | n << 7 | l + (j << 4);
                        final int n3 = \u2603.g[n2];
                        if (n3 != 0) {
                            b = false;
                            break;
                        }
                    }
                }
            }
            if (!b) {
                final byte[] \u26034 = new byte[4096];
                final amw amw = new amw();
                final amw amw2 = new amw();
                final amw amw3 = new amw();
                for (int n3 = 0; n3 < 16; ++n3) {
                    for (int \u26035 = 0; \u26035 < 16; ++\u26035) {
                        for (int n4 = 0; n4 < 16; ++n4) {
                            final int n5 = n3 << 11 | n4 << 7 | \u26035 + (j << 4);
                            final int n6 = \u2603.g[n5];
                            \u26034[\u26035 << 8 | n4 << 4 | n3] = (byte)(n6 & 0xFF);
                            amw.a(n3, \u26035, n4, \u2603.f.a(n3, \u26035 + (j << 4), n4));
                            amw2.a(n3, \u26035, n4, \u2603.e.a(n3, \u26035 + (j << 4), n4));
                            amw3.a(n3, \u26035, n4, \u2603.d.a(n3, \u26035 + (j << 4), n4));
                        }
                    }
                }
                final dn \u26036 = new dn();
                \u26036.a("Y", (byte)(j & 0xFF));
                \u26036.a("Blocks", \u26034);
                \u26036.a("Data", amw.a());
                \u26036.a("SkyLight", amw2.a());
                \u26036.a("BlockLight", amw3.a());
                \u26033.a(\u26036);
            }
        }
        \u2603.a("Sections", \u26033);
        final byte[] \u26037 = new byte[256];
        final cj.a \u26038 = new cj.a();
        for (int k = 0; k < 16; ++k) {
            for (int l = 0; l < 16; ++l) {
                \u26038.c(\u2603.k << 4 | k, 0, \u2603.l << 4 | l);
                \u26037[l << 4 | k] = (byte)(\u2603.a(\u26038, ady.ad).az & 0xFF);
            }
        }
        \u2603.a("Biomes", \u26037);
        \u2603.a("Entities", \u2603.h);
        \u2603.a("TileEntities", \u2603.i);
        if (\u2603.j != null) {
            \u2603.a("TileTicks", \u2603.j);
        }
    }
    
    public static class a
    {
        public long a;
        public boolean b;
        public byte[] c;
        public ana d;
        public ana e;
        public ana f;
        public byte[] g;
        public du h;
        public du i;
        public du j;
        public final int k;
        public final int l;
        
        public a(final int \u2603, final int \u2603) {
            this.k = \u2603;
            this.l = \u2603;
        }
    }
}
