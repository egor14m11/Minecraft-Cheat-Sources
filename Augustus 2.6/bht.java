import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.nio.FloatBuffer;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.5.36
// 

public class bht
{
    private adm d;
    private final bfr e;
    public static int a;
    private cj f;
    public bhq b;
    private final ReentrantLock g;
    private final ReentrantLock h;
    private bhn i;
    private final Set<akw> j;
    private final int k;
    private final FloatBuffer l;
    private final bmt[] m;
    public aug c;
    private int n;
    private boolean o;
    private EnumMap<cq, cj> p;
    
    public bht(final adm \u2603, final bfr \u2603, final cj \u2603, final int \u2603) {
        this.b = bhq.a;
        this.g = new ReentrantLock();
        this.h = new ReentrantLock();
        this.i = null;
        this.j = (Set<akw>)Sets.newHashSet();
        this.l = avd.h(16);
        this.m = new bmt[adf.values().length];
        this.n = -1;
        this.o = true;
        this.p = Maps.newEnumMap(cq.class);
        this.d = \u2603;
        this.e = \u2603;
        this.k = \u2603;
        if (!\u2603.equals(this.j())) {
            this.a(\u2603);
        }
        if (bqs.f()) {
            for (int i = 0; i < adf.values().length; ++i) {
                this.m[i] = new bmt(bms.a);
            }
        }
    }
    
    public boolean a(final int \u2603) {
        if (this.n == \u2603) {
            return false;
        }
        this.n = \u2603;
        return true;
    }
    
    public bmt b(final int \u2603) {
        return this.m[\u2603];
    }
    
    public void a(final cj \u2603) {
        this.h();
        this.f = \u2603;
        this.c = new aug(\u2603, \u2603.a(16, 16, 16));
        for (final cq cq : cq.values()) {
            this.p.put(cq, \u2603.a(cq, 16));
        }
        this.m();
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final bhn \u2603) {
        final bhq c = \u2603.c();
        if (c.c() == null || c.b(adf.d)) {
            return;
        }
        this.a(\u2603.d().a(adf.d), this.f);
        \u2603.d().a(adf.d).a(c.c());
        this.a(adf.d, \u2603, \u2603, \u2603, \u2603.d().a(adf.d), c);
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603, final bhn \u2603) {
        final bhq bhq = new bhq();
        final int n = 1;
        final cj f = this.f;
        final cj a = f.a(15, 15, 15);
        \u2603.f().lock();
        adq \u26032;
        try {
            if (\u2603.a() != bhn.a.b) {
                return;
            }
            \u26032 = new bff(this.d, f.a(-1, -1, -1), a.a(1, 1, 1), 1);
            \u2603.a(bhq);
        }
        finally {
            \u2603.f().unlock();
        }
        final bhw bhw = new bhw();
        final Set<akw> hashSet = (Set<akw>)Sets.newHashSet();
        if (!\u26032.W()) {
            ++bht.a;
            final boolean[] array = new boolean[adf.values().length];
            final bgd ae = ave.A().ae();
            for (final cj.a \u26033 : cj.b(f, a)) {
                final alz p = \u26032.p(\u26033);
                final afh c = p.c();
                if (c.c()) {
                    bhw.a(\u26033);
                }
                if (c.z()) {
                    final akw s = \u26032.s(new cj(\u26033));
                    final bhd<akw> b = bhc.a.b(s);
                    if (s != null && b != null) {
                        bhq.a(s);
                        if (b.a()) {
                            hashSet.add(s);
                        }
                    }
                }
                final adf m = c.m();
                final int ordinal = m.ordinal();
                if (c.b() != -1) {
                    final bfd a2 = \u2603.d().a(ordinal);
                    if (!bhq.d(m)) {
                        bhq.c(m);
                        this.a(a2, f);
                    }
                    final boolean[] array2 = array;
                    final int n2 = ordinal;
                    array2[n2] |= ae.a(p, \u26033, \u26032, a2);
                }
            }
            for (final adf adf : adf.values()) {
                if (array[adf.ordinal()]) {
                    bhq.a(adf);
                }
                if (bhq.d(adf)) {
                    this.a(adf, \u2603, \u2603, \u2603, \u2603.d().a(adf), bhq);
                }
            }
        }
        bhq.a(bhw.a());
        this.g.lock();
        try {
            final Set<akw> hashSet2 = (Set<akw>)Sets.newHashSet((Iterable<?>)hashSet);
            final Set<akw> hashSet3 = (Set<akw>)Sets.newHashSet((Iterable<?>)this.j);
            hashSet2.removeAll(this.j);
            hashSet3.removeAll(hashSet);
            this.j.clear();
            this.j.addAll(hashSet);
            this.e.a(hashSet3, hashSet2);
        }
        finally {
            this.g.unlock();
        }
    }
    
    protected void b() {
        this.g.lock();
        try {
            if (this.i != null && this.i.a() != bhn.a.d) {
                this.i.e();
                this.i = null;
            }
        }
        finally {
            this.g.unlock();
        }
    }
    
    public ReentrantLock c() {
        return this.g;
    }
    
    public bhn d() {
        this.g.lock();
        try {
            this.b();
            return this.i = new bhn(this, bhn.b.a);
        }
        finally {
            this.g.unlock();
        }
    }
    
    public bhn e() {
        this.g.lock();
        try {
            if (this.i != null && this.i.a() == bhn.a.a) {
                return null;
            }
            if (this.i != null && this.i.a() != bhn.a.d) {
                this.i.e();
                this.i = null;
            }
            (this.i = new bhn(this, bhn.b.b)).a(this.b);
            return this.i;
        }
        finally {
            this.g.unlock();
        }
    }
    
    private void a(final bfd \u2603, final cj \u2603) {
        \u2603.a(7, bms.a);
        \u2603.c(-\u2603.n(), -\u2603.o(), (double)(-\u2603.p()));
    }
    
    private void a(final adf \u2603, final float \u2603, final float \u2603, final float \u2603, final bfd \u2603, final bhq \u2603) {
        if (\u2603 == adf.d && !\u2603.b(\u2603)) {
            \u2603.a(\u2603, \u2603, \u2603);
            \u2603.a(\u2603.a());
        }
        \u2603.e();
    }
    
    private void m() {
        bfl.E();
        bfl.D();
        final float n = 1.000001f;
        bfl.b(-8.0f, -8.0f, -8.0f);
        bfl.a(n, n, n);
        bfl.b(8.0f, 8.0f, 8.0f);
        bfl.a(2982, this.l);
        bfl.F();
    }
    
    public void f() {
        bfl.a(this.l);
    }
    
    public bhq g() {
        return this.b;
    }
    
    public void a(final bhq \u2603) {
        this.h.lock();
        try {
            this.b = \u2603;
        }
        finally {
            this.h.unlock();
        }
    }
    
    public void h() {
        this.b();
        this.b = bhq.a;
    }
    
    public void a() {
        this.h();
        this.d = null;
        for (int i = 0; i < adf.values().length; ++i) {
            if (this.m[i] != null) {
                this.m[i].c();
            }
        }
    }
    
    public cj j() {
        return this.f;
    }
    
    public void a(final boolean \u2603) {
        this.o = \u2603;
    }
    
    public boolean l() {
        return this.o;
    }
    
    public cj a(final cq \u2603) {
        return this.p.get(\u2603);
    }
}
