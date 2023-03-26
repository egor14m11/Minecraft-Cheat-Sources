import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.TreeMap;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class tf
{
    private adm a;
    private final List<te> b;
    private cj c;
    private cj d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private TreeMap<String, Integer> j;
    private List<a> k;
    private int l;
    
    public tf() {
        this.b = (List<te>)Lists.newArrayList();
        this.c = cj.a;
        this.d = cj.a;
        this.j = new TreeMap<String, Integer>();
        this.k = (List<a>)Lists.newArrayList();
    }
    
    public tf(final adm \u2603) {
        this.b = (List<te>)Lists.newArrayList();
        this.c = cj.a;
        this.d = cj.a;
        this.j = new TreeMap<String, Integer>();
        this.k = (List<a>)Lists.newArrayList();
        this.a = \u2603;
    }
    
    public void a(final adm \u2603) {
        this.a = \u2603;
    }
    
    public void a(final int \u2603) {
        this.g = \u2603;
        this.m();
        this.l();
        if (\u2603 % 20 == 0) {
            this.k();
        }
        if (\u2603 % 30 == 0) {
            this.j();
        }
        final int n = this.h / 10;
        if (this.l < n && this.b.size() > 20 && this.a.s.nextInt(7000) == 0) {
            final aui a = this.a(this.d, 2, 4, 2);
            if (a != null) {
                final ty \u26032 = new ty(this.a);
                \u26032.b(a.a, a.b, a.c);
                this.a.d(\u26032);
                ++this.l;
            }
        }
    }
    
    private aui a(final cj \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int i = 0; i < 10; ++i) {
            final cj a = \u2603.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
            if (this.a(a)) {
                if (this.a(new cj(\u2603, \u2603, \u2603), a)) {
                    return new aui(a.n(), a.o(), a.p());
                }
            }
        }
        return null;
    }
    
    private boolean a(final cj \u2603, final cj \u2603) {
        if (!adm.a(this.a, \u2603.b())) {
            return false;
        }
        final int n = \u2603.n() - \u2603.n() / 2;
        final int n2 = \u2603.p() - \u2603.p() / 2;
        for (int i = n; i < n + \u2603.n(); ++i) {
            for (int j = \u2603.o(); j < \u2603.o() + \u2603.o(); ++j) {
                for (int k = n2; k < n2 + \u2603.p(); ++k) {
                    if (this.a.p(new cj(i, j, k)).c().v()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void j() {
        final List<ty> a = this.a.a((Class<? extends ty>)ty.class, new aug(this.d.n() - this.e, this.d.o() - 4, this.d.p() - this.e, this.d.n() + this.e, this.d.o() + 4, this.d.p() + this.e));
        this.l = a.size();
    }
    
    private void k() {
        final List<wi> a = this.a.a((Class<? extends wi>)wi.class, new aug(this.d.n() - this.e, this.d.o() - 4, this.d.p() - this.e, this.d.n() + this.e, this.d.o() + 4, this.d.p() + this.e));
        this.h = a.size();
        if (this.h == 0) {
            this.j.clear();
        }
    }
    
    public cj a() {
        return this.d;
    }
    
    public int b() {
        return this.e;
    }
    
    public int c() {
        return this.b.size();
    }
    
    public int d() {
        return this.g - this.f;
    }
    
    public int e() {
        return this.h;
    }
    
    public boolean a(final cj \u2603) {
        return this.d.i(\u2603) < this.e * this.e;
    }
    
    public List<te> f() {
        return this.b;
    }
    
    public te b(final cj \u2603) {
        te te = null;
        int n = Integer.MAX_VALUE;
        for (final te te2 : this.b) {
            final int a = te2.a(\u2603);
            if (a < n) {
                te = te2;
                n = a;
            }
        }
        return te;
    }
    
    public te c(final cj \u2603) {
        te te = null;
        int n = Integer.MAX_VALUE;
        for (final te te2 : this.b) {
            int n2 = te2.a(\u2603);
            if (n2 > 256) {
                n2 *= 1000;
            }
            else {
                n2 = te2.c();
            }
            if (n2 < n) {
                te = te2;
                n = n2;
            }
        }
        return te;
    }
    
    public te e(final cj \u2603) {
        if (this.d.i(\u2603) > this.e * this.e) {
            return null;
        }
        for (final te te : this.b) {
            if (te.d().n() == \u2603.n() && te.d().p() == \u2603.p() && Math.abs(te.d().o() - \u2603.o()) <= 1) {
                return te;
            }
        }
        return null;
    }
    
    public void a(final te \u2603) {
        this.b.add(\u2603);
        this.c = this.c.a(\u2603.d());
        this.n();
        this.f = \u2603.h();
    }
    
    public boolean g() {
        return this.b.isEmpty();
    }
    
    public void a(final pr \u2603) {
        for (final a a : this.k) {
            if (a.a == \u2603) {
                a.b = this.g;
                return;
            }
        }
        this.k.add(new a(\u2603, this.g));
    }
    
    public pr b(final pr \u2603) {
        double n = Double.MAX_VALUE;
        a a = null;
        for (int i = 0; i < this.k.size(); ++i) {
            final a a2 = this.k.get(i);
            final double h = a2.a.h(\u2603);
            if (h <= n) {
                a = a2;
                n = h;
            }
        }
        return (a != null) ? a.a : null;
    }
    
    public wn c(final pr \u2603) {
        double n = Double.MAX_VALUE;
        wn wn = null;
        for (final String s : this.j.keySet()) {
            if (this.d(s)) {
                final wn a = this.a.a(s);
                if (a == null) {
                    continue;
                }
                final double h = a.h(\u2603);
                if (h > n) {
                    continue;
                }
                wn = a;
                n = h;
            }
        }
        return wn;
    }
    
    private void l() {
        final Iterator<a> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            final a a = iterator.next();
            if (!a.a.ai() || Math.abs(this.g - a.b) > 300) {
                iterator.remove();
            }
        }
    }
    
    private void m() {
        boolean b = false;
        final boolean b2 = this.a.s.nextInt(50) == 0;
        final Iterator<te> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            final te te = iterator.next();
            if (b2) {
                te.a();
            }
            if (!this.f(te.d()) || Math.abs(this.g - te.h()) > 1200) {
                this.c = this.c.b(te.d());
                b = true;
                te.a(true);
                iterator.remove();
            }
        }
        if (b) {
            this.n();
        }
    }
    
    private boolean f(final cj \u2603) {
        final afh c = this.a.p(\u2603).c();
        return c instanceof agh && c.t() == arm.d;
    }
    
    private void n() {
        final int size = this.b.size();
        if (size == 0) {
            this.d = new cj(0, 0, 0);
            this.e = 0;
            return;
        }
        this.d = new cj(this.c.n() / size, this.c.o() / size, this.c.p() / size);
        int max = 0;
        for (final te te : this.b) {
            max = Math.max(te.a(this.d), max);
        }
        this.e = Math.max(32, (int)Math.sqrt(max) + 1);
    }
    
    public int a(final String \u2603) {
        final Integer n = this.j.get(\u2603);
        if (n != null) {
            return n;
        }
        return 0;
    }
    
    public int a(final String \u2603, final int \u2603) {
        final int a = this.a(\u2603);
        final int a2 = ns.a(a + \u2603, -30, 10);
        this.j.put(\u2603, a2);
        return a2;
    }
    
    public boolean d(final String \u2603) {
        return this.a(\u2603) <= -15;
    }
    
    public void a(final dn \u2603) {
        this.h = \u2603.f("PopSize");
        this.e = \u2603.f("Radius");
        this.l = \u2603.f("Golems");
        this.f = \u2603.f("Stable");
        this.g = \u2603.f("Tick");
        this.i = \u2603.f("MTick");
        this.d = new cj(\u2603.f("CX"), \u2603.f("CY"), \u2603.f("CZ"));
        this.c = new cj(\u2603.f("ACX"), \u2603.f("ACY"), \u2603.f("ACZ"));
        final du c = \u2603.c("Doors", 10);
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final te te = new te(new cj(b.f("X"), b.f("Y"), b.f("Z")), b.f("IDX"), b.f("IDZ"), b.f("TS"));
            this.b.add(te);
        }
        final du c2 = \u2603.c("Players", 10);
        for (int j = 0; j < c2.c(); ++j) {
            final dn b2 = c2.b(j);
            if (b2.c("UUID")) {
                final lt af = MinecraftServer.N().aF();
                final GameProfile a = af.a(UUID.fromString(b2.j("UUID")));
                if (a != null) {
                    this.j.put(a.getName(), b2.f("S"));
                }
            }
            else {
                this.j.put(b2.j("Name"), b2.f("S"));
            }
        }
    }
    
    public void b(final dn \u2603) {
        \u2603.a("PopSize", this.h);
        \u2603.a("Radius", this.e);
        \u2603.a("Golems", this.l);
        \u2603.a("Stable", this.f);
        \u2603.a("Tick", this.g);
        \u2603.a("MTick", this.i);
        \u2603.a("CX", this.d.n());
        \u2603.a("CY", this.d.o());
        \u2603.a("CZ", this.d.p());
        \u2603.a("ACX", this.c.n());
        \u2603.a("ACY", this.c.o());
        \u2603.a("ACZ", this.c.p());
        final du \u26032 = new du();
        for (final te te : this.b) {
            final dn \u26033 = new dn();
            \u26033.a("X", te.d().n());
            \u26033.a("Y", te.d().o());
            \u26033.a("Z", te.d().p());
            \u26033.a("IDX", te.f());
            \u26033.a("IDZ", te.g());
            \u26033.a("TS", te.h());
            \u26032.a(\u26033);
        }
        \u2603.a("Doors", \u26032);
        final du \u26034 = new du();
        for (final String s : this.j.keySet()) {
            final dn \u26035 = new dn();
            final lt af = MinecraftServer.N().aF();
            final GameProfile a = af.a(s);
            if (a != null) {
                \u26035.a("UUID", a.getId().toString());
                \u26035.a("S", this.j.get(s));
                \u26034.a(\u26035);
            }
        }
        \u2603.a("Players", \u26034);
    }
    
    public void h() {
        this.i = this.g;
    }
    
    public boolean i() {
        return this.i == 0 || this.g - this.i >= 3600;
    }
    
    public void b(final int \u2603) {
        for (final String \u26032 : this.j.keySet()) {
            this.a(\u26032, \u2603);
        }
    }
    
    class a
    {
        public pr a;
        public int b;
        
        a(final pr \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
