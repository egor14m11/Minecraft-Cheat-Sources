import org.apache.logging.log4j.LogManager;
import java.util.List;
import java.util.Iterator;
import java.io.DataOutputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInputStream;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class anj implements and, aud
{
    private static final Logger a;
    private Map<adg, dn> b;
    private Set<adg> c;
    private final File d;
    private boolean e;
    
    public anj(final File \u2603) {
        this.b = new ConcurrentHashMap<adg, dn>();
        this.c = Collections.newSetFromMap(new ConcurrentHashMap<adg, Boolean>());
        this.e = false;
        this.d = \u2603;
    }
    
    @Override
    public amy a(final adm \u2603, final int \u2603, final int \u2603) throws IOException {
        final adg adg = new adg(\u2603, \u2603);
        dn a = this.b.get(adg);
        if (a == null) {
            final DataInputStream c = ani.c(this.d, \u2603, \u2603);
            if (c == null) {
                return null;
            }
            a = dx.a(c);
        }
        return this.a(\u2603, \u2603, \u2603, a);
    }
    
    protected amy a(final adm \u2603, final int \u2603, final int \u2603, final dn \u2603) {
        if (!\u2603.b("Level", 10)) {
            anj.a.error("Chunk file at " + \u2603 + "," + \u2603 + " is missing level data, skipping");
            return null;
        }
        final dn m = \u2603.m("Level");
        if (!m.b("Sections", 9)) {
            anj.a.error("Chunk file at " + \u2603 + "," + \u2603 + " is missing block data, skipping");
            return null;
        }
        amy amy = this.a(\u2603, m);
        if (!amy.a(\u2603, \u2603)) {
            anj.a.error("Chunk file at " + \u2603 + "," + \u2603 + " is in the wrong location; relocating. (Expected " + \u2603 + ", " + \u2603 + ", got " + amy.a + ", " + amy.b + ")");
            m.a("xPos", \u2603);
            m.a("zPos", \u2603);
            amy = this.a(\u2603, m);
        }
        return amy;
    }
    
    @Override
    public void a(final adm \u2603, final amy \u2603) throws IOException, adn {
        \u2603.I();
        try {
            final dn \u26032 = new dn();
            final dn dn = new dn();
            \u26032.a("Level", dn);
            this.a(\u2603, \u2603, dn);
            this.a(\u2603.j(), \u26032);
        }
        catch (Exception throwable) {
            anj.a.error("Failed to save chunk", throwable);
        }
    }
    
    protected void a(final adg \u2603, final dn \u2603) {
        if (!this.c.contains(\u2603)) {
            this.b.put(\u2603, \u2603);
        }
        auc.a().a(this);
    }
    
    @Override
    public boolean c() {
        if (this.b.isEmpty()) {
            if (this.e) {
                anj.a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[] { this.d.getName() });
            }
            return false;
        }
        final adg \u2603 = this.b.keySet().iterator().next();
        try {
            this.c.add(\u2603);
            final dn \u26032 = this.b.remove(\u2603);
            if (\u26032 != null) {
                try {
                    this.b(\u2603, \u26032);
                }
                catch (Exception throwable) {
                    anj.a.error("Failed to save chunk", throwable);
                }
            }
            return true;
        }
        finally {
            this.c.remove(\u2603);
        }
    }
    
    private void b(final adg \u2603, final dn \u2603) throws IOException {
        final DataOutputStream d = ani.d(this.d, \u2603.a, \u2603.b);
        dx.a(\u2603, (DataOutput)d);
        d.close();
    }
    
    @Override
    public void b(final adm \u2603, final amy \u2603) throws IOException {
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void b() {
        try {
            this.e = true;
            while (this.c()) {}
        }
        finally {
            this.e = false;
        }
    }
    
    private void a(final amy \u2603, final adm \u2603, final dn \u2603) {
        \u2603.a("V", (byte)1);
        \u2603.a("xPos", \u2603.a);
        \u2603.a("zPos", \u2603.b);
        \u2603.a("LastUpdate", \u2603.K());
        \u2603.a("HeightMap", \u2603.q());
        \u2603.a("TerrainPopulated", \u2603.t());
        \u2603.a("LightPopulated", \u2603.u());
        \u2603.a("InhabitedTime", \u2603.w());
        final amz[] h = \u2603.h();
        final du \u26032 = new du();
        final boolean b = !\u2603.t.o();
        for (final amz amz : h) {
            if (amz != null) {
                final dn \u26033 = new dn();
                \u26033.a("Y", (byte)(amz.d() >> 4 & 0xFF));
                final byte[] \u26034 = new byte[amz.g().length];
                final amw amw = new amw();
                amw amw2 = null;
                for (int k = 0; k < amz.g().length; ++k) {
                    final char c = amz.g()[k];
                    final int n = k & 0xF;
                    final int n2 = k >> 8 & 0xF;
                    final int n3 = k >> 4 & 0xF;
                    if (c >> 12 != 0) {
                        if (amw2 == null) {
                            amw2 = new amw();
                        }
                        amw2.a(n, n2, n3, c >> 12);
                    }
                    \u26034[k] = (byte)(c >> 4 & 0xFF);
                    amw.a(n, n2, n3, c & '\u000f');
                }
                \u26033.a("Blocks", \u26034);
                \u26033.a("Data", amw.a());
                if (amw2 != null) {
                    \u26033.a("Add", amw2.a());
                }
                \u26033.a("BlockLight", amz.h().a());
                if (b) {
                    \u26033.a("SkyLight", amz.i().a());
                }
                else {
                    \u26033.a("SkyLight", new byte[amz.h().a().length]);
                }
                \u26032.a(\u26033);
            }
        }
        \u2603.a("Sections", \u26032);
        \u2603.a("Biomes", \u2603.k());
        \u2603.g(false);
        final du \u26035 = new du();
        for (int i = 0; i < \u2603.s().length; ++i) {
            for (final pk pk : \u2603.s()[i]) {
                final dn \u26033 = new dn();
                if (pk.d(\u26033)) {
                    \u2603.g(true);
                    \u26035.a(\u26033);
                }
            }
        }
        \u2603.a("Entities", \u26035);
        final du \u26036 = new du();
        for (final akw akw : \u2603.r().values()) {
            final dn \u26033 = new dn();
            akw.b(\u26033);
            \u26036.a(\u26033);
        }
        \u2603.a("TileEntities", \u26036);
        final List<adw> a = \u2603.a(\u2603, false);
        if (a != null) {
            final long l = \u2603.K();
            final du \u26037 = new du();
            for (final adw adw : a) {
                final dn \u26038 = new dn();
                final jy jy = afh.c.c(adw.a());
                \u26038.a("i", (jy == null) ? "" : jy.toString());
                \u26038.a("x", adw.a.n());
                \u26038.a("y", adw.a.o());
                \u26038.a("z", adw.a.p());
                \u26038.a("t", (int)(adw.b - l));
                \u26038.a("p", adw.c);
                \u26037.a(\u26038);
            }
            \u2603.a("TileTicks", \u26037);
        }
    }
    
    private amy a(final adm \u2603, final dn \u2603) {
        final int f = \u2603.f("xPos");
        final int f2 = \u2603.f("zPos");
        final amy amy = new amy(\u2603, f, f2);
        amy.a(\u2603.l("HeightMap"));
        amy.d(\u2603.n("TerrainPopulated"));
        amy.e(\u2603.n("LightPopulated"));
        amy.c(\u2603.g("InhabitedTime"));
        final du c = \u2603.c("Sections", 10);
        final int n = 16;
        final amz[] \u26032 = new amz[n];
        final boolean \u26033 = !\u2603.t.o();
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final int j = b.d("Y");
            final amz amz = new amz(j << 4, \u26033);
            final byte[] k = b.k("Blocks");
            final amw amw = new amw(b.k("Data"));
            final amw amw2 = b.b("Add", 7) ? new amw(b.k("Add")) : null;
            final char[] \u26034 = new char[k.length];
            for (int l = 0; l < \u26034.length; ++l) {
                final int n2 = l & 0xF;
                final int n3 = l >> 8 & 0xF;
                final int n4 = l >> 4 & 0xF;
                final int n5 = (amw2 != null) ? amw2.a(n2, n3, n4) : 0;
                \u26034[l] = (char)(n5 << 12 | (k[l] & 0xFF) << 4 | amw.a(n2, n3, n4));
            }
            amz.a(\u26034);
            amz.a(new amw(b.k("BlockLight")));
            if (\u26033) {
                amz.b(new amw(b.k("SkyLight")));
            }
            amz.e();
            \u26032[j] = amz;
        }
        amy.a(\u26032);
        if (\u2603.b("Biomes", 7)) {
            amy.a(\u2603.k("Biomes"));
        }
        final du c2 = \u2603.c("Entities", 10);
        if (c2 != null) {
            for (int \u26035 = 0; \u26035 < c2.c(); ++\u26035) {
                final dn b2 = c2.b(\u26035);
                final pk a = pm.a(b2, \u2603);
                amy.g(true);
                if (a != null) {
                    amy.a(a);
                    pk pk = a;
                    for (dn m = b2; m.b("Riding", 10); m = m.m("Riding")) {
                        final pk a2 = pm.a(m.m("Riding"), \u2603);
                        if (a2 != null) {
                            amy.a(a2);
                            pk.a(a2);
                        }
                        pk = a2;
                    }
                }
            }
        }
        final du c3 = \u2603.c("TileEntities", 10);
        if (c3 != null) {
            for (int j = 0; j < c3.c(); ++j) {
                final dn b3 = c3.b(j);
                final akw c4 = akw.c(b3);
                if (c4 != null) {
                    amy.a(c4);
                }
            }
        }
        if (\u2603.b("TileTicks", 9)) {
            final du c5 = \u2603.c("TileTicks", 10);
            if (c5 != null) {
                for (int \u26036 = 0; \u26036 < c5.c(); ++\u26036) {
                    final dn b4 = c5.b(\u26036);
                    afh \u26037;
                    if (b4.b("i", 8)) {
                        \u26037 = afh.b(b4.j("i"));
                    }
                    else {
                        \u26037 = afh.c(b4.f("i"));
                    }
                    \u2603.b(new cj(b4.f("x"), b4.f("y"), b4.f("z")), \u26037, b4.f("t"), b4.f("p"));
                }
            }
        }
        return amy;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
