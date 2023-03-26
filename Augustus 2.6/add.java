import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class add
{
    private int a;
    private String b;
    private final List<a> c;
    private a d;
    private double e;
    private double f;
    private int g;
    private int h;
    private int i;
    private pk j;
    private int k;
    private int l;
    private int m;
    
    public add() {
        this.a = 20;
        this.b = "Pig";
        this.c = (List<a>)Lists.newArrayList();
        this.g = 200;
        this.h = 800;
        this.i = 4;
        this.k = 6;
        this.l = 16;
        this.m = 4;
    }
    
    private String f() {
        if (this.i() == null) {
            if (this.b != null && this.b.equals("Minecart")) {
                this.b = "MinecartRideable";
            }
            return this.b;
        }
        return this.i().d;
    }
    
    public void a(final String \u2603) {
        this.b = \u2603;
    }
    
    private boolean g() {
        final cj b = this.b();
        return this.a().b(b.n() + 0.5, b.o() + 0.5, b.p() + 0.5, this.l);
    }
    
    public void c() {
        if (!this.g()) {
            return;
        }
        final cj b = this.b();
        if (this.a().D) {
            final double n = b.n() + this.a().s.nextFloat();
            final double n2 = b.o() + this.a().s.nextFloat();
            final double \u2603 = b.p() + this.a().s.nextFloat();
            this.a().a(cy.l, n, n2, \u2603, 0.0, 0.0, 0.0, new int[0]);
            this.a().a(cy.A, n, n2, \u2603, 0.0, 0.0, 0.0, new int[0]);
            if (this.a > 0) {
                --this.a;
            }
            this.f = this.e;
            this.e = (this.e + 1000.0f / (this.a + 200.0f)) % 360.0;
        }
        else {
            if (this.a == -1) {
                this.h();
            }
            if (this.a > 0) {
                --this.a;
                return;
            }
            boolean b2 = false;
            for (int i = 0; i < this.i; ++i) {
                final pk a = pm.a(this.f(), this.a());
                if (a == null) {
                    return;
                }
                final int size = this.a().a(a.getClass(), new aug(b.n(), b.o(), b.p(), b.n() + 1, b.o() + 1, b.p() + 1).b(this.m, this.m, this.m)).size();
                if (size >= this.k) {
                    this.h();
                    return;
                }
                final double \u2603 = b.n() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * this.m + 0.5;
                final double \u26032 = b.o() + this.a().s.nextInt(3) - 1;
                final double \u26033 = b.p() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * this.m + 0.5;
                final ps ps = (a instanceof ps) ? ((ps)a) : null;
                a.b(\u2603, \u26032, \u26033, this.a().s.nextFloat() * 360.0f, 0.0f);
                if (ps == null || (ps.bR() && ps.bS())) {
                    this.a(a, true);
                    this.a().b(2004, b, 0);
                    if (ps != null) {
                        ps.y();
                    }
                    b2 = true;
                }
            }
            if (b2) {
                this.h();
            }
        }
    }
    
    private pk a(final pk \u2603, final boolean \u2603) {
        if (this.i() != null) {
            dn dn = new dn();
            \u2603.d(dn);
            for (final String s : this.i().c.c()) {
                final eb a = this.i().c.a(s);
                dn.a(s, a.b());
            }
            \u2603.f(dn);
            if (\u2603.o != null && \u2603) {
                \u2603.o.d(\u2603);
            }
            pk pk = \u2603;
            while (dn.b("Riding", 10)) {
                final dn m = dn.m("Riding");
                final pk a2 = pm.a(m.j("id"), \u2603.o);
                if (a2 != null) {
                    final dn dn2 = new dn();
                    a2.d(dn2);
                    for (final String s2 : m.c()) {
                        final eb a3 = m.a(s2);
                        dn2.a(s2, a3.b());
                    }
                    a2.f(dn2);
                    a2.b(pk.s, pk.t, pk.u, pk.y, pk.z);
                    if (\u2603.o != null && \u2603) {
                        \u2603.o.d(a2);
                    }
                    pk.a(a2);
                }
                pk = a2;
                dn = m;
            }
        }
        else if (\u2603 instanceof pr && \u2603.o != null && \u2603) {
            if (\u2603 instanceof ps) {
                ((ps)\u2603).a(\u2603.o.E(new cj(\u2603)), null);
            }
            \u2603.o.d(\u2603);
        }
        return \u2603;
    }
    
    private void h() {
        if (this.h <= this.g) {
            this.a = this.g;
        }
        else {
            this.a = this.g + this.a().s.nextInt(this.h - this.g);
        }
        if (this.c.size() > 0) {
            this.a(oa.a(this.a().s, this.c));
        }
        this.a(1);
    }
    
    public void a(final dn \u2603) {
        this.b = \u2603.j("EntityId");
        this.a = \u2603.e("Delay");
        this.c.clear();
        if (\u2603.b("SpawnPotentials", 9)) {
            final du c = \u2603.c("SpawnPotentials", 10);
            for (int i = 0; i < c.c(); ++i) {
                this.c.add(new a(c.b(i)));
            }
        }
        if (\u2603.b("SpawnData", 10)) {
            this.a(new a(\u2603.m("SpawnData"), this.b));
        }
        else {
            this.a((a)null);
        }
        if (\u2603.b("MinSpawnDelay", 99)) {
            this.g = \u2603.e("MinSpawnDelay");
            this.h = \u2603.e("MaxSpawnDelay");
            this.i = \u2603.e("SpawnCount");
        }
        if (\u2603.b("MaxNearbyEntities", 99)) {
            this.k = \u2603.e("MaxNearbyEntities");
            this.l = \u2603.e("RequiredPlayerRange");
        }
        if (\u2603.b("SpawnRange", 99)) {
            this.m = \u2603.e("SpawnRange");
        }
        if (this.a() != null) {
            this.j = null;
        }
    }
    
    public void b(final dn \u2603) {
        final String f = this.f();
        if (nx.b(f)) {
            return;
        }
        \u2603.a("EntityId", f);
        \u2603.a("Delay", (short)this.a);
        \u2603.a("MinSpawnDelay", (short)this.g);
        \u2603.a("MaxSpawnDelay", (short)this.h);
        \u2603.a("SpawnCount", (short)this.i);
        \u2603.a("MaxNearbyEntities", (short)this.k);
        \u2603.a("RequiredPlayerRange", (short)this.l);
        \u2603.a("SpawnRange", (short)this.m);
        if (this.i() != null) {
            \u2603.a("SpawnData", this.i().c.b());
        }
        if (this.i() != null || this.c.size() > 0) {
            final du \u26032 = new du();
            if (this.c.size() > 0) {
                for (final a a : this.c) {
                    \u26032.a(a.a());
                }
            }
            else {
                \u26032.a(this.i().a());
            }
            \u2603.a("SpawnPotentials", \u26032);
        }
    }
    
    public pk a(final adm \u2603) {
        if (this.j == null) {
            pk pk = pm.a(this.f(), \u2603);
            if (pk != null) {
                pk = this.a(pk, false);
                this.j = pk;
            }
        }
        return this.j;
    }
    
    public boolean b(final int \u2603) {
        if (\u2603 == 1 && this.a().D) {
            this.a = this.g;
            return true;
        }
        return false;
    }
    
    private a i() {
        return this.d;
    }
    
    public void a(final a \u2603) {
        this.d = \u2603;
    }
    
    public abstract void a(final int p0);
    
    public abstract adm a();
    
    public abstract cj b();
    
    public double d() {
        return this.e;
    }
    
    public double e() {
        return this.f;
    }
    
    public class a extends oa.a
    {
        private final dn c;
        private final String d;
        
        public a(final add add, final dn \u2603) {
            this(add, \u2603.m("Properties"), \u2603.j("Type"), \u2603.f("Weight"));
        }
        
        public a(final add add, final dn \u2603, final String \u2603) {
            this(add, \u2603, \u2603, 1);
        }
        
        private a(final dn \u2603, String \u2603, final int \u2603) {
            super(\u2603);
            if (\u2603.equals("Minecart")) {
                if (\u2603 != null) {
                    \u2603 = va.a.a(\u2603.f("Type")).b();
                }
                else {
                    \u2603 = "MinecartRideable";
                }
            }
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public dn a() {
            final dn dn = new dn();
            dn.a("Properties", this.c);
            dn.a("Type", this.d);
            dn.a("Weight", this.a);
            return dn;
        }
    }
}
