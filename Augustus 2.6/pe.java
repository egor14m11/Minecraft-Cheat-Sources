import java.util.Iterator;
import java.util.UUID;
import java.util.Set;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class pe
{
    public static final pe[] a;
    private static final Map<jy, pe> I;
    public static final pe b;
    public static final pe c;
    public static final pe d;
    public static final pe e;
    public static final pe f;
    public static final pe g;
    public static final pe h;
    public static final pe i;
    public static final pe j;
    public static final pe k;
    public static final pe l;
    public static final pe m;
    public static final pe n;
    public static final pe o;
    public static final pe p;
    public static final pe q;
    public static final pe r;
    public static final pe s;
    public static final pe t;
    public static final pe u;
    public static final pe v;
    public static final pe w;
    public static final pe x;
    public static final pe y;
    public static final pe z;
    public static final pe A;
    public static final pe B;
    public static final pe C;
    public static final pe D;
    public static final pe E;
    public static final pe F;
    public static final pe G;
    public final int H;
    private final Map<qb, qd> J;
    private final boolean K;
    private final int L;
    private String M;
    private int N;
    private double O;
    private boolean P;
    
    protected pe(final int \u2603, final jy \u2603, final boolean \u2603, final int \u2603) {
        this.J = (Map<qb, qd>)Maps.newHashMap();
        this.M = "";
        this.N = -1;
        this.H = \u2603;
        pe.a[\u2603] = this;
        pe.I.put(\u2603, this);
        this.K = \u2603;
        if (\u2603) {
            this.O = 0.5;
        }
        else {
            this.O = 1.0;
        }
        this.L = \u2603;
    }
    
    public static pe b(final String \u2603) {
        return pe.I.get(new jy(\u2603));
    }
    
    public static Set<jy> c() {
        return pe.I.keySet();
    }
    
    protected pe b(final int \u2603, final int \u2603) {
        this.N = \u2603 + \u2603 * 8;
        return this;
    }
    
    public int d() {
        return this.H;
    }
    
    public void a(final pr \u2603, final int \u2603) {
        if (this.H == pe.l.H) {
            if (\u2603.bn() < \u2603.bu()) {
                \u2603.h(1.0f);
            }
        }
        else if (this.H == pe.u.H) {
            if (\u2603.bn() > 1.0f) {
                \u2603.a(ow.l, 1.0f);
            }
        }
        else if (this.H == pe.v.H) {
            \u2603.a(ow.m, 1.0f);
        }
        else if (this.H == pe.s.H && \u2603 instanceof wn) {
            ((wn)\u2603).a(0.025f * (\u2603 + 1));
        }
        else if (this.H == pe.y.H && \u2603 instanceof wn) {
            if (!\u2603.o.D) {
                ((wn)\u2603).cl().a(\u2603 + 1, 1.0f);
            }
        }
        else if ((this.H == pe.h.H && !\u2603.bm()) || (this.H == pe.i.H && \u2603.bm())) {
            \u2603.h((float)Math.max(4 << \u2603, 0));
        }
        else if ((this.H == pe.i.H && !\u2603.bm()) || (this.H == pe.h.H && \u2603.bm())) {
            \u2603.a(ow.l, (float)(6 << \u2603));
        }
    }
    
    public void a(final pk \u2603, final pk \u2603, final pr \u2603, final int \u2603, final double \u2603) {
        if ((this.H == pe.h.H && !\u2603.bm()) || (this.H == pe.i.H && \u2603.bm())) {
            final int n = (int)(\u2603 * (4 << \u2603) + 0.5);
            \u2603.h((float)n);
        }
        else if ((this.H == pe.i.H && !\u2603.bm()) || (this.H == pe.h.H && \u2603.bm())) {
            final int n = (int)(\u2603 * (6 << \u2603) + 0.5);
            if (\u2603 == null) {
                \u2603.a(ow.l, (float)n);
            }
            else {
                \u2603.a(ow.b(\u2603, \u2603), (float)n);
            }
        }
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean a(final int \u2603, final int \u2603) {
        if (this.H == pe.l.H) {
            final int n = 50 >> \u2603;
            return n <= 0 || \u2603 % n == 0;
        }
        if (this.H == pe.u.H) {
            final int n = 25 >> \u2603;
            return n <= 0 || \u2603 % n == 0;
        }
        if (this.H == pe.v.H) {
            final int n = 40 >> \u2603;
            return n <= 0 || \u2603 % n == 0;
        }
        return this.H == pe.s.H;
    }
    
    public pe c(final String \u2603) {
        this.M = \u2603;
        return this;
    }
    
    public String a() {
        return this.M;
    }
    
    public boolean e() {
        return this.N >= 0;
    }
    
    public int f() {
        return this.N;
    }
    
    public boolean g() {
        return this.K;
    }
    
    public static String a(final pf \u2603) {
        if (\u2603.h()) {
            return "**:**";
        }
        final int b = \u2603.b();
        return nx.a(b);
    }
    
    protected pe a(final double \u2603) {
        this.O = \u2603;
        return this;
    }
    
    public double h() {
        return this.O;
    }
    
    public boolean j() {
        return this.P;
    }
    
    public int k() {
        return this.L;
    }
    
    public pe a(final qb \u2603, final String \u2603, final double \u2603, final int \u2603) {
        final qd qd = new qd(UUID.fromString(\u2603), this.a(), \u2603, \u2603);
        this.J.put(\u2603, qd);
        return this;
    }
    
    public Map<qb, qd> l() {
        return this.J;
    }
    
    public void a(final pr \u2603, final qf \u2603, final int \u2603) {
        for (final Map.Entry<qb, qd> entry : this.J.entrySet()) {
            final qc a = \u2603.a(entry.getKey());
            if (a != null) {
                a.c(entry.getValue());
            }
        }
    }
    
    public void b(final pr \u2603, final qf \u2603, final int \u2603) {
        for (final Map.Entry<qb, qd> entry : this.J.entrySet()) {
            final qc a = \u2603.a(entry.getKey());
            if (a != null) {
                final qd \u26032 = entry.getValue();
                a.c(\u26032);
                a.b(new qd(\u26032.a(), this.a() + " " + \u2603, this.a(\u2603, \u26032), \u26032.c()));
            }
        }
    }
    
    public double a(final int \u2603, final qd \u2603) {
        return \u2603.d() * (\u2603 + 1);
    }
    
    static {
        a = new pe[32];
        I = Maps.newHashMap();
        b = null;
        c = new pe(1, new jy("speed"), false, 8171462).c("potion.moveSpeed").b(0, 0).a(vy.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224, 2);
        d = new pe(2, new jy("slowness"), true, 5926017).c("potion.moveSlowdown").b(1, 0).a(vy.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448, 2);
        e = new pe(3, new jy("haste"), false, 14270531).c("potion.digSpeed").b(2, 0).a(1.5);
        f = new pe(4, new jy("mining_fatigue"), true, 4866583).c("potion.digSlowDown").b(3, 0);
        g = new pb(5, new jy("strength"), false, 9643043).c("potion.damageBoost").b(4, 0).a(vy.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 2.5, 2);
        h = new pd(6, new jy("instant_health"), false, 16262179).c("potion.heal");
        i = new pd(7, new jy("instant_damage"), true, 4393481).c("potion.harm");
        j = new pe(8, new jy("jump_boost"), false, 2293580).c("potion.jump").b(2, 1);
        k = new pe(9, new jy("nausea"), true, 5578058).c("potion.confusion").b(3, 1).a(0.25);
        l = new pe(10, new jy("regeneration"), false, 13458603).c("potion.regeneration").b(7, 0).a(0.25);
        m = new pe(11, new jy("resistance"), false, 10044730).c("potion.resistance").b(6, 1);
        n = new pe(12, new jy("fire_resistance"), false, 14981690).c("potion.fireResistance").b(7, 1);
        o = new pe(13, new jy("water_breathing"), false, 3035801).c("potion.waterBreathing").b(0, 2);
        p = new pe(14, new jy("invisibility"), false, 8356754).c("potion.invisibility").b(0, 1);
        q = new pe(15, new jy("blindness"), true, 2039587).c("potion.blindness").b(5, 1).a(0.25);
        r = new pe(16, new jy("night_vision"), false, 2039713).c("potion.nightVision").b(4, 1);
        s = new pe(17, new jy("hunger"), true, 5797459).c("potion.hunger").b(1, 1);
        t = new pb(18, new jy("weakness"), true, 4738376).c("potion.weakness").b(5, 0).a(vy.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0, 0);
        u = new pe(19, new jy("poison"), true, 5149489).c("potion.poison").b(6, 0).a(0.25);
        v = new pe(20, new jy("wither"), true, 3484199).c("potion.wither").b(1, 2).a(0.25);
        w = new pc(21, new jy("health_boost"), false, 16284963).c("potion.healthBoost").b(2, 2).a(vy.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0);
        x = new pa(22, new jy("absorption"), false, 2445989).c("potion.absorption").b(2, 2);
        y = new pd(23, new jy("saturation"), false, 16262179).c("potion.saturation");
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
    }
}
