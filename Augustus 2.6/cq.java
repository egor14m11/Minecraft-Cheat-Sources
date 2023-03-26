import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Random;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public enum cq implements nw
{
    a(0, 1, -1, "down", b.b, a.b, new df(0, -1, 0)), 
    b(1, 0, -1, "up", b.a, a.b, new df(0, 1, 0)), 
    c(2, 3, 2, "north", b.b, a.c, new df(0, 0, -1)), 
    d(3, 2, 0, "south", b.a, a.c, new df(0, 0, 1)), 
    e(4, 5, 1, "west", b.b, a.a, new df(-1, 0, 0)), 
    f(5, 4, 3, "east", b.a, a.a, new df(1, 0, 0));
    
    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final a k;
    private final b l;
    private final df m;
    private static final cq[] n;
    private static final cq[] o;
    private static final Map<String, cq> p;
    
    private cq(final int \u2603, final int \u2603, final int \u2603, final String \u2603, final b \u2603, final a \u2603, final df \u2603) {
        this.g = \u2603;
        this.i = \u2603;
        this.h = \u2603;
        this.j = \u2603;
        this.k = \u2603;
        this.l = \u2603;
        this.m = \u2603;
    }
    
    public int a() {
        return this.g;
    }
    
    public int b() {
        return this.i;
    }
    
    public b c() {
        return this.l;
    }
    
    public cq d() {
        return a(this.h);
    }
    
    public cq a(final a \u2603) {
        switch (cq$1.a[\u2603.ordinal()]) {
            case 1: {
                if (this == cq.e || this == cq.f) {
                    return this;
                }
                return this.n();
            }
            case 2: {
                if (this == cq.b || this == cq.a) {
                    return this;
                }
                return this.e();
            }
            case 3: {
                if (this == cq.c || this == cq.d) {
                    return this;
                }
                return this.p();
            }
            default: {
                throw new IllegalStateException("Unable to get CW facing for axis " + \u2603);
            }
        }
    }
    
    public cq e() {
        switch (cq$1.b[this.ordinal()]) {
            case 1: {
                return cq.f;
            }
            case 2: {
                return cq.d;
            }
            case 3: {
                return cq.e;
            }
            case 4: {
                return cq.c;
            }
            default: {
                throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
            }
        }
    }
    
    private cq n() {
        switch (cq$1.b[this.ordinal()]) {
            case 5: {
                return cq.c;
            }
            case 1: {
                return cq.a;
            }
            case 6: {
                return cq.d;
            }
            case 3: {
                return cq.b;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + this);
            }
        }
    }
    
    private cq p() {
        switch (cq$1.b[this.ordinal()]) {
            case 5: {
                return cq.f;
            }
            case 2: {
                return cq.a;
            }
            case 6: {
                return cq.e;
            }
            case 4: {
                return cq.b;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
            }
        }
    }
    
    public cq f() {
        switch (cq$1.b[this.ordinal()]) {
            case 1: {
                return cq.e;
            }
            case 2: {
                return cq.c;
            }
            case 3: {
                return cq.f;
            }
            case 4: {
                return cq.d;
            }
            default: {
                throw new IllegalStateException("Unable to get CCW facing of " + this);
            }
        }
    }
    
    public int g() {
        if (this.k == a.a) {
            return this.l.a();
        }
        return 0;
    }
    
    public int h() {
        if (this.k == a.b) {
            return this.l.a();
        }
        return 0;
    }
    
    public int i() {
        if (this.k == a.c) {
            return this.l.a();
        }
        return 0;
    }
    
    public String j() {
        return this.j;
    }
    
    public a k() {
        return this.k;
    }
    
    public static cq a(final String \u2603) {
        if (\u2603 == null) {
            return null;
        }
        return cq.p.get(\u2603.toLowerCase());
    }
    
    public static cq a(final int \u2603) {
        return cq.n[ns.a(\u2603 % cq.n.length)];
    }
    
    public static cq b(final int \u2603) {
        return cq.o[ns.a(\u2603 % cq.o.length)];
    }
    
    public static cq a(final double \u2603) {
        return b(ns.c(\u2603 / 90.0 + 0.5) & 0x3);
    }
    
    public static cq a(final Random \u2603) {
        return values()[\u2603.nextInt(values().length)];
    }
    
    public static cq a(final float \u2603, final float \u2603, final float \u2603) {
        cq c = cq.c;
        float n = Float.MIN_VALUE;
        for (final cq cq : values()) {
            final float n2 = \u2603 * cq.m.n() + \u2603 * cq.m.o() + \u2603 * cq.m.p();
            if (n2 > n) {
                n = n2;
                c = cq;
            }
        }
        return c;
    }
    
    @Override
    public String toString() {
        return this.j;
    }
    
    @Override
    public String l() {
        return this.j;
    }
    
    public static cq a(final b \u2603, final a \u2603) {
        for (final cq cq : values()) {
            if (cq.c() == \u2603 && cq.k() == \u2603) {
                return cq;
            }
        }
        throw new IllegalArgumentException("No such direction: " + \u2603 + " " + \u2603);
    }
    
    public df m() {
        return this.m;
    }
    
    static {
        n = new cq[6];
        o = new cq[4];
        p = Maps.newHashMap();
        for (final cq cq : values()) {
            cq.n[cq.g] = cq;
            if (cq.k().c()) {
                cq.o[cq.i] = cq;
            }
            cq.p.put(cq.j().toLowerCase(), cq);
        }
    }
    
    public enum a implements Predicate<cq>, nw
    {
        a("x", cq.c.a), 
        b("y", cq.c.b), 
        c("z", cq.c.a);
        
        private static final Map<String, a> d;
        private final String e;
        private final c f;
        
        private a(final String \u2603, final c \u2603) {
            this.e = \u2603;
            this.f = \u2603;
        }
        
        public static a a(final String \u2603) {
            if (\u2603 == null) {
                return null;
            }
            return a.d.get(\u2603.toLowerCase());
        }
        
        public String a() {
            return this.e;
        }
        
        public boolean b() {
            return this.f == cq.c.b;
        }
        
        public boolean c() {
            return this.f == cq.c.a;
        }
        
        @Override
        public String toString() {
            return this.e;
        }
        
        public boolean a(final cq \u2603) {
            return \u2603 != null && \u2603.k() == this;
        }
        
        public c d() {
            return this.f;
        }
        
        @Override
        public String l() {
            return this.e;
        }
        
        static {
            d = Maps.newHashMap();
            for (final a a2 : values()) {
                a.d.put(a2.a().toLowerCase(), a2);
            }
        }
    }
    
    public enum b
    {
        a(1, "Towards positive"), 
        b(-1, "Towards negative");
        
        private final int c;
        private final String d;
        
        private b(final int \u2603, final String \u2603) {
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public int a() {
            return this.c;
        }
        
        @Override
        public String toString() {
            return this.d;
        }
    }
    
    public enum c implements Predicate<cq>, Iterable<cq>
    {
        a, 
        b;
        
        public cq[] a() {
            switch (cq$1.c[this.ordinal()]) {
                case 1: {
                    return new cq[] { cq.c, cq.f, cq.d, cq.e };
                }
                case 2: {
                    return new cq[] { cq.b, cq.a };
                }
                default: {
                    throw new Error("Someone's been tampering with the universe!");
                }
            }
        }
        
        public cq a(final Random \u2603) {
            final cq[] a = this.a();
            return a[\u2603.nextInt(a.length)];
        }
        
        public boolean a(final cq \u2603) {
            return \u2603 != null && \u2603.k().d() == this;
        }
        
        @Override
        public Iterator<cq> iterator() {
            return Iterators.forArray(this.a());
        }
    }
}
