import com.google.common.collect.HashMultimap;
import java.util.Iterator;
import com.google.common.collect.Multimap;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.text.DecimalFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public final class zx
{
    public static final DecimalFormat a;
    public int b;
    public int c;
    private zw d;
    private dn e;
    private int f;
    private uo g;
    private afh h;
    private boolean i;
    private afh j;
    private boolean k;
    
    public zx(final afh \u2603) {
        this(\u2603, 1);
    }
    
    public zx(final afh \u2603, final int \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    public zx(final afh \u2603, final int \u2603, final int \u2603) {
        this(zw.a(\u2603), \u2603, \u2603);
    }
    
    public zx(final zw \u2603) {
        this(\u2603, 1);
    }
    
    public zx(final zw \u2603, final int \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    public zx(final zw \u2603, final int \u2603, final int \u2603) {
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = false;
        this.d = \u2603;
        this.b = \u2603;
        this.f = \u2603;
        if (this.f < 0) {
            this.f = 0;
        }
    }
    
    public static zx a(final dn \u2603) {
        final zx zx = new zx();
        zx.c(\u2603);
        return (zx.b() != null) ? zx : null;
    }
    
    private zx() {
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = false;
    }
    
    public zx a(final int \u2603) {
        final zx zx = new zx(this.d, \u2603, this.f);
        if (this.e != null) {
            zx.e = (dn)this.e.b();
        }
        this.b -= \u2603;
        return zx;
    }
    
    public zw b() {
        return this.d;
    }
    
    public boolean a(final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final boolean a = this.b().a(this, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (a) {
            \u2603.b(na.ad[zw.b(this.d)]);
        }
        return a;
    }
    
    public float a(final afh \u2603) {
        return this.b().a(this, \u2603);
    }
    
    public zx a(final adm \u2603, final wn \u2603) {
        return this.b().a(this, \u2603, \u2603);
    }
    
    public zx b(final adm \u2603, final wn \u2603) {
        return this.b().b(this, \u2603, \u2603);
    }
    
    public dn b(final dn \u2603) {
        final jy jy = zw.e.c(this.d);
        \u2603.a("id", (jy == null) ? "minecraft:air" : jy.toString());
        \u2603.a("Count", (byte)this.b);
        \u2603.a("Damage", (short)this.f);
        if (this.e != null) {
            \u2603.a("tag", this.e);
        }
        return \u2603;
    }
    
    public void c(final dn \u2603) {
        if (\u2603.b("id", 8)) {
            this.d = zw.d(\u2603.j("id"));
        }
        else {
            this.d = zw.b(\u2603.e("id"));
        }
        this.b = \u2603.d("Count");
        this.f = \u2603.e("Damage");
        if (this.f < 0) {
            this.f = 0;
        }
        if (\u2603.b("tag", 10)) {
            this.e = \u2603.m("tag");
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }
    
    public int c() {
        return this.b().j();
    }
    
    public boolean d() {
        return this.c() > 1 && (!this.e() || !this.g());
    }
    
    public boolean e() {
        return this.d != null && this.d.l() > 0 && (!this.n() || !this.o().n("Unbreakable"));
    }
    
    public boolean f() {
        return this.d.k();
    }
    
    public boolean g() {
        return this.e() && this.f > 0;
    }
    
    public int h() {
        return this.f;
    }
    
    public int i() {
        return this.f;
    }
    
    public void b(final int \u2603) {
        this.f = \u2603;
        if (this.f < 0) {
            this.f = 0;
        }
    }
    
    public int j() {
        return this.d.l();
    }
    
    public boolean a(int \u2603, final Random \u2603) {
        if (!this.e()) {
            return false;
        }
        if (\u2603 > 0) {
            final int a = ack.a(aci.t.B, this);
            int n = 0;
            for (int n2 = 0; a > 0 && n2 < \u2603; ++n2) {
                if (acg.a(this, a, \u2603)) {
                    ++n;
                }
            }
            \u2603 -= n;
            if (\u2603 <= 0) {
                return false;
            }
        }
        this.f += \u2603;
        return this.f > this.j();
    }
    
    public void a(final int \u2603, final pr \u2603) {
        if (\u2603 instanceof wn && ((wn)\u2603).bA.d) {
            return;
        }
        if (!this.e()) {
            return;
        }
        if (this.a(\u2603, \u2603.bc())) {
            \u2603.b(this);
            --this.b;
            if (\u2603 instanceof wn) {
                final wn wn = (wn)\u2603;
                wn.b(na.ae[zw.b(this.d)]);
                if (this.b == 0 && this.b() instanceof yt) {
                    wn.ca();
                }
            }
            if (this.b < 0) {
                this.b = 0;
            }
            this.f = 0;
        }
    }
    
    public void a(final pr \u2603, final wn \u2603) {
        final boolean a = this.d.a(this, \u2603, \u2603);
        if (a) {
            \u2603.b(na.ad[zw.b(this.d)]);
        }
    }
    
    public void a(final adm \u2603, final afh \u2603, final cj \u2603, final wn \u2603) {
        final boolean a = this.d.a(this, \u2603, \u2603, \u2603, \u2603);
        if (a) {
            \u2603.b(na.ad[zw.b(this.d)]);
        }
    }
    
    public boolean b(final afh \u2603) {
        return this.d.b(\u2603);
    }
    
    public boolean a(final wn \u2603, final pr \u2603) {
        return this.d.a(this, \u2603, \u2603);
    }
    
    public zx k() {
        final zx zx = new zx(this.d, this.b, this.f);
        if (this.e != null) {
            zx.e = (dn)this.e.b();
        }
        return zx;
    }
    
    public static boolean a(final zx \u2603, final zx \u2603) {
        return (\u2603 == null && \u2603 == null) || (\u2603 != null && \u2603 != null && (\u2603.e != null || \u2603.e == null) && (\u2603.e == null || \u2603.e.equals(\u2603.e)));
    }
    
    public static boolean b(final zx \u2603, final zx \u2603) {
        return (\u2603 == null && \u2603 == null) || (\u2603 != null && \u2603 != null && \u2603.d(\u2603));
    }
    
    private boolean d(final zx \u2603) {
        return this.b == \u2603.b && this.d == \u2603.d && this.f == \u2603.f && (this.e != null || \u2603.e == null) && (this.e == null || this.e.equals(\u2603.e));
    }
    
    public static boolean c(final zx \u2603, final zx \u2603) {
        return (\u2603 == null && \u2603 == null) || (\u2603 != null && \u2603 != null && \u2603.a(\u2603));
    }
    
    public boolean a(final zx \u2603) {
        return \u2603 != null && this.d == \u2603.d && this.f == \u2603.f;
    }
    
    public String a() {
        return this.d.e_(this);
    }
    
    public static zx b(final zx \u2603) {
        return (\u2603 == null) ? null : \u2603.k();
    }
    
    @Override
    public String toString() {
        return this.b + "x" + this.d.a() + "@" + this.f;
    }
    
    public void a(final adm \u2603, final pk \u2603, final int \u2603, final boolean \u2603) {
        if (this.c > 0) {
            --this.c;
        }
        this.d.a(this, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final adm \u2603, final wn \u2603, final int \u2603) {
        \u2603.a(na.ac[zw.b(this.d)], \u2603);
        this.d.d(this, \u2603, \u2603);
    }
    
    public boolean c(final zx \u2603) {
        return this.d(\u2603);
    }
    
    public int l() {
        return this.b().d(this);
    }
    
    public aba m() {
        return this.b().e(this);
    }
    
    public void b(final adm \u2603, final wn \u2603, final int \u2603) {
        this.b().a(this, \u2603, \u2603, \u2603);
    }
    
    public boolean n() {
        return this.e != null;
    }
    
    public dn o() {
        return this.e;
    }
    
    public dn a(final String \u2603, final boolean \u2603) {
        if (this.e != null && this.e.b(\u2603, 10)) {
            return this.e.m(\u2603);
        }
        if (\u2603) {
            final dn \u26032 = new dn();
            this.a(\u2603, \u26032);
            return \u26032;
        }
        return null;
    }
    
    public du p() {
        if (this.e == null) {
            return null;
        }
        return this.e.c("ench", 10);
    }
    
    public void d(final dn \u2603) {
        this.e = \u2603;
    }
    
    public String q() {
        String s = this.b().a(this);
        if (this.e != null && this.e.b("display", 10)) {
            final dn m = this.e.m("display");
            if (m.b("Name", 8)) {
                s = m.j("Name");
            }
        }
        return s;
    }
    
    public zx c(final String \u2603) {
        if (this.e == null) {
            this.e = new dn();
        }
        if (!this.e.b("display", 10)) {
            this.e.a("display", new dn());
        }
        this.e.m("display").a("Name", \u2603);
        return this;
    }
    
    public void r() {
        if (this.e == null) {
            return;
        }
        if (!this.e.b("display", 10)) {
            return;
        }
        final dn m = this.e.m("display");
        m.o("Name");
        if (m.c_()) {
            this.e.o("display");
            if (this.e.c_()) {
                this.d((dn)null);
            }
        }
    }
    
    public boolean s() {
        return this.e != null && this.e.b("display", 10) && this.e.m("display").b("Name", 8);
    }
    
    public List<String> a(final wn \u2603, final boolean \u2603) {
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        String s = this.q();
        if (this.s()) {
            s = a.u + s;
        }
        s += a.v;
        if (\u2603) {
            String s2 = "";
            if (s.length() > 0) {
                s += " (";
                s2 = ")";
            }
            final int b = zw.b(this.d);
            if (this.f()) {
                s += String.format("#%04d/%d%s", b, this.f, s2);
            }
            else {
                s += String.format("#%04d%s", b, s2);
            }
        }
        else if (!this.s() && this.d == zy.bd) {
            s = s + " #" + this.f;
        }
        arrayList.add(s);
        int f = 0;
        if (this.n() && this.e.b("HideFlags", 99)) {
            f = this.e.f("HideFlags");
        }
        if ((f & 0x20) == 0x0) {
            this.d.a(this, \u2603, arrayList, \u2603);
        }
        if (this.n()) {
            if ((f & 0x1) == 0x0) {
                final du p = this.p();
                if (p != null) {
                    for (int i = 0; i < p.c(); ++i) {
                        final int j = p.b(i).e("id");
                        final int e = p.b(i).e("lvl");
                        if (aci.c(j) != null) {
                            arrayList.add(aci.c(j).d(e));
                        }
                    }
                }
            }
            if (this.e.b("display", 10)) {
                final dn m = this.e.m("display");
                if (m.b("color", 3)) {
                    if (\u2603) {
                        arrayList.add("Color: #" + Integer.toHexString(m.f("color")).toUpperCase());
                    }
                    else {
                        arrayList.add(a.u + di.a("item.dyed"));
                    }
                }
                if (m.b("Lore") == 9) {
                    final du du = m.c("Lore", 8);
                    if (du.c() > 0) {
                        for (int j = 0; j < du.c(); ++j) {
                            arrayList.add(a.f + "" + a.u + du.f(j));
                        }
                    }
                }
            }
        }
        final Multimap<String, qd> b2 = this.B();
        if (!b2.isEmpty() && (f & 0x2) == 0x0) {
            arrayList.add("");
            for (final Map.Entry<String, qd> entry : b2.entries()) {
                final qd qd = entry.getValue();
                double d = qd.d();
                if (qd.a() == zw.f) {
                    d += ack.a(this, pw.a);
                }
                double n;
                if (qd.c() == 1 || qd.c() == 2) {
                    n = d * 100.0;
                }
                else {
                    n = d;
                }
                if (d > 0.0) {
                    arrayList.add(a.j + di.a("attribute.modifier.plus." + qd.c(), zx.a.format(n), di.a("attribute.name." + entry.getKey())));
                }
                else {
                    if (d >= 0.0) {
                        continue;
                    }
                    n *= -1.0;
                    arrayList.add(a.m + di.a("attribute.modifier.take." + qd.c(), zx.a.format(n), di.a("attribute.name." + entry.getKey())));
                }
            }
        }
        if (this.n() && this.o().n("Unbreakable") && (f & 0x4) == 0x0) {
            arrayList.add(a.j + di.a("item.unbreakable"));
        }
        if (this.n() && this.e.b("CanDestroy", 9) && (f & 0x8) == 0x0) {
            final du du = this.e.c("CanDestroy", 8);
            if (du.c() > 0) {
                arrayList.add("");
                arrayList.add(a.h + di.a("item.canBreak"));
                for (int j = 0; j < du.c(); ++j) {
                    final afh afh = afh.b(du.f(j));
                    if (afh != null) {
                        arrayList.add(a.i + afh.f());
                    }
                    else {
                        arrayList.add(a.i + "missingno");
                    }
                }
            }
        }
        if (this.n() && this.e.b("CanPlaceOn", 9) && (f & 0x10) == 0x0) {
            final du du = this.e.c("CanPlaceOn", 8);
            if (du.c() > 0) {
                arrayList.add("");
                arrayList.add(a.h + di.a("item.canPlace"));
                for (int j = 0; j < du.c(); ++j) {
                    final afh afh = afh.b(du.f(j));
                    if (afh != null) {
                        arrayList.add(a.i + afh.f());
                    }
                    else {
                        arrayList.add(a.i + "missingno");
                    }
                }
            }
        }
        if (\u2603) {
            if (this.g()) {
                arrayList.add("Durability: " + (this.j() - this.h()) + " / " + this.j());
            }
            arrayList.add(a.i + zw.e.c(this.d).toString());
            if (this.n()) {
                arrayList.add(a.i + "NBT: " + this.o().c().size() + " tag(s)");
            }
        }
        return arrayList;
    }
    
    public boolean t() {
        return this.b().f(this);
    }
    
    public aaj u() {
        return this.b().g(this);
    }
    
    public boolean v() {
        return this.b().f_(this) && !this.w();
    }
    
    public void a(final aci \u2603, final int \u2603) {
        if (this.e == null) {
            this.d(new dn());
        }
        if (!this.e.b("ench", 9)) {
            this.e.a("ench", new du());
        }
        final du c = this.e.c("ench", 10);
        final dn \u26032 = new dn();
        \u26032.a("id", (short)\u2603.B);
        \u26032.a("lvl", (short)(byte)\u2603);
        c.a(\u26032);
    }
    
    public boolean w() {
        return this.e != null && this.e.b("ench", 9);
    }
    
    public void a(final String \u2603, final eb \u2603) {
        if (this.e == null) {
            this.d(new dn());
        }
        this.e.a(\u2603, \u2603);
    }
    
    public boolean x() {
        return this.b().s();
    }
    
    public boolean y() {
        return this.g != null;
    }
    
    public void a(final uo \u2603) {
        this.g = \u2603;
    }
    
    public uo z() {
        return this.g;
    }
    
    public int A() {
        if (this.n() && this.e.b("RepairCost", 3)) {
            return this.e.f("RepairCost");
        }
        return 0;
    }
    
    public void c(final int \u2603) {
        if (!this.n()) {
            this.e = new dn();
        }
        this.e.a("RepairCost", \u2603);
    }
    
    public Multimap<String, qd> B() {
        Multimap<String, qd> multimap;
        if (this.n() && this.e.b("AttributeModifiers", 9)) {
            multimap = (Multimap<String, qd>)HashMultimap.create();
            final du c = this.e.c("AttributeModifiers", 10);
            for (int i = 0; i < c.c(); ++i) {
                final dn b = c.b(i);
                final qd a = vy.a(b);
                if (a != null) {
                    if (a.a().getLeastSignificantBits() != 0L && a.a().getMostSignificantBits() != 0L) {
                        multimap.put(b.j("AttributeName"), a);
                    }
                }
            }
        }
        else {
            multimap = this.b().i();
        }
        return multimap;
    }
    
    public void a(final zw \u2603) {
        this.d = \u2603;
    }
    
    public eu C() {
        final fa \u2603 = new fa(this.q());
        if (this.s()) {
            \u2603.b().b(true);
        }
        final eu a = new fa("[").a(\u2603).a("]");
        if (this.d != null) {
            final dn \u26032 = new dn();
            this.b(\u26032);
            a.b().a(new ew(ew.a.c, new fa(\u26032.toString())));
            a.b().a(this.u().e);
        }
        return a;
    }
    
    public boolean c(final afh \u2603) {
        if (\u2603 == this.h) {
            return this.i;
        }
        this.h = \u2603;
        if (this.n() && this.e.b("CanDestroy", 9)) {
            final du c = this.e.c("CanDestroy", 8);
            for (int i = 0; i < c.c(); ++i) {
                final afh b = afh.b(c.f(i));
                if (b == \u2603) {
                    return this.i = true;
                }
            }
        }
        return this.i = false;
    }
    
    public boolean d(final afh \u2603) {
        if (\u2603 == this.j) {
            return this.k;
        }
        this.j = \u2603;
        if (this.n() && this.e.b("CanPlaceOn", 9)) {
            final du c = this.e.c("CanPlaceOn", 8);
            for (int i = 0; i < c.c(); ++i) {
                final afh b = afh.b(c.f(i));
                if (b == \u2603) {
                    return this.k = true;
                }
            }
        }
        return this.k = false;
    }
    
    static {
        a = new DecimalFormat("#.###");
    }
}
