import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class anv implements amv
{
    private adm a;
    private Random b;
    private final alz[] c;
    private final apz d;
    private final List<aqq> e;
    private final boolean f;
    private final boolean g;
    private apc h;
    private apc i;
    
    public anv(final adm \u2603, final long \u2603, final boolean \u2603, final String \u2603) {
        this.c = new alz[256];
        this.e = (List<aqq>)Lists.newArrayList();
        this.a = \u2603;
        this.b = new Random(\u2603);
        this.d = apz.a(\u2603);
        if (\u2603) {
            final Map<String, Map<String, String>> b = this.d.b();
            if (b.containsKey("village")) {
                final Map<String, String> \u26032 = b.get("village");
                if (!\u26032.containsKey("size")) {
                    \u26032.put("size", "1");
                }
                this.e.add(new aqv(\u26032));
            }
            if (b.containsKey("biome_1")) {
                this.e.add(new aqm(b.get("biome_1")));
            }
            if (b.containsKey("mineshaft")) {
                this.e.add(new aqf(b.get("mineshaft")));
            }
            if (b.containsKey("stronghold")) {
                this.e.add(new aqo(b.get("stronghold")));
            }
            if (b.containsKey("oceanmonument")) {
                this.e.add(new aqk(b.get("oceanmonument")));
            }
        }
        if (this.d.b().containsKey("lake")) {
            this.h = new apc(afi.j);
        }
        if (this.d.b().containsKey("lava_lake")) {
            this.i = new apc(afi.l);
        }
        this.g = this.d.b().containsKey("dungeon");
        int \u26033 = 0;
        int n = 0;
        boolean b2 = true;
        for (final aqa aqa : this.d.c()) {
            for (int i = aqa.d(); i < aqa.d() + aqa.b(); ++i) {
                final alz c = aqa.c();
                if (c.c() != afi.a) {
                    b2 = false;
                    this.c[i] = c;
                }
            }
            if (aqa.c().c() == afi.a) {
                n += aqa.b();
            }
            else {
                \u26033 += aqa.b() + n;
                n = 0;
            }
        }
        \u2603.b(\u26033);
        this.f = (!b2 && this.d.b().containsKey("decoration"));
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        final ans ans = new ans();
        for (int i = 0; i < this.c.length; ++i) {
            final alz \u26032 = this.c[i];
            if (\u26032 != null) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        ans.a(j, i, k, \u26032);
                    }
                }
            }
        }
        for (final any any : this.e) {
            any.a(this, this.a, \u2603, \u2603, ans);
        }
        final amy amy = new amy(this.a, ans, \u2603, \u2603);
        final ady[] b = this.a.v().b(null, \u2603 * 16, \u2603 * 16, 16, 16);
        final byte[] l = amy.k();
        for (int k = 0; k < l.length; ++k) {
            l[k] = (byte)b[k].az;
        }
        amy.b();
        return amy;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
        final int \u26032 = \u2603 * 16;
        final int \u26033 = \u2603 * 16;
        final cj \u26034 = new cj(\u26032, 0, \u26033);
        final ady b = this.a.b(new cj(\u26032 + 16, 0, \u26033 + 16));
        boolean b2 = false;
        this.b.setSeed(this.a.J());
        final long n = this.b.nextLong() / 2L * 2L + 1L;
        final long n2 = this.b.nextLong() / 2L * 2L + 1L;
        this.b.setSeed(\u2603 * n + \u2603 * n2 ^ this.a.J());
        final adg \u26035 = new adg(\u2603, \u2603);
        for (final aqq aqq : this.e) {
            final boolean a = aqq.a(this.a, this.b, \u26035);
            if (aqq instanceof aqv) {
                b2 |= a;
            }
        }
        if (this.h != null && !b2 && this.b.nextInt(4) == 0) {
            this.h.b(this.a, this.b, \u26034.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
        }
        if (this.i != null && !b2 && this.b.nextInt(8) == 0) {
            final cj a2 = \u26034.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
            if (a2.o() < this.a.F() || this.b.nextInt(10) == 0) {
                this.i.b(this.a, this.b, a2);
            }
        }
        if (this.g) {
            for (int i = 0; i < 8; ++i) {
                new api().b(this.a, this.b, \u26034.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
            }
        }
        if (this.f) {
            b.a(this.a, this.b, \u26034);
        }
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public boolean a(final boolean \u2603, final nu \u2603) {
        return true;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public String f() {
        return "FlatLevelSource";
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        final ady b = this.a.b(\u2603);
        return b.a(\u2603);
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        if ("Stronghold".equals(\u2603)) {
            for (final aqq aqq : this.e) {
                if (aqq instanceof aqo) {
                    return aqq.b(\u2603, \u2603);
                }
            }
        }
        return null;
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
        for (final aqq aqq : this.e) {
            aqq.a(this, this.a, \u2603, \u2603, null);
        }
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
}
