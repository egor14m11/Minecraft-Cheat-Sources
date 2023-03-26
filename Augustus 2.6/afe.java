import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class afe extends afh
{
    protected final boolean a;
    
    public static boolean e(final adm \u2603, final cj \u2603) {
        return d(\u2603.p(\u2603));
    }
    
    public static boolean d(final alz \u2603) {
        final afh c = \u2603.c();
        return c == afi.av || c == afi.D || c == afi.E || c == afi.cs;
    }
    
    protected afe(final boolean \u2603) {
        super(arm.q);
        this.a = \u2603;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(yz.e);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final b b = (p.c() == this) ? p.b(this.n()) : null;
        if (b != null && b.c()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b());
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, alz \u2603) {
        if (!\u2603.D) {
            \u2603 = this.a(\u2603, \u2603, \u2603, true);
            if (this.a) {
                this.a(\u2603, \u2603, \u2603, this);
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.D) {
            return;
        }
        final b b = \u2603.b(this.n());
        boolean b2 = false;
        if (!adm.a(\u2603, \u2603.b())) {
            b2 = true;
        }
        if (b == afe.b.c && !adm.a(\u2603, \u2603.f())) {
            b2 = true;
        }
        else if (b == afe.b.d && !adm.a(\u2603, \u2603.e())) {
            b2 = true;
        }
        else if (b == afe.b.e && !adm.a(\u2603, \u2603.c())) {
            b2 = true;
        }
        else if (b == afe.b.f && !adm.a(\u2603, \u2603.d())) {
            b2 = true;
        }
        if (b2) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
        else {
            this.b(\u2603, \u2603, \u2603, \u2603);
        }
    }
    
    protected void b(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
    }
    
    protected alz a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        if (\u2603.D) {
            return \u2603;
        }
        return new a(\u2603, \u2603, \u2603).a(\u2603.z(\u2603), \u2603).b();
    }
    
    @Override
    public int k() {
        return 0;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        if (\u2603.b(this.n()).c()) {
            \u2603.c(\u2603.a(), this);
        }
        if (this.a) {
            \u2603.c(\u2603, this);
            \u2603.c(\u2603.b(), this);
        }
    }
    
    public abstract amo<b> n();
    
    public class a
    {
        private final adm b;
        private final cj c;
        private final afe d;
        private alz e;
        private final boolean f;
        private final List<cj> g;
        
        public a(final adm \u2603, final cj \u2603, final alz \u2603) {
            this.g = (List<cj>)Lists.newArrayList();
            this.b = \u2603;
            this.c = \u2603;
            this.e = \u2603;
            this.d = (afe)\u2603.c();
            final b \u26032 = \u2603.b(afe.this.n());
            this.f = this.d.a;
            this.a(\u26032);
        }
        
        private void a(final b \u2603) {
            this.g.clear();
            switch (afe$1.a[\u2603.ordinal()]) {
                case 1: {
                    this.g.add(this.c.c());
                    this.g.add(this.c.d());
                    break;
                }
                case 2: {
                    this.g.add(this.c.e());
                    this.g.add(this.c.f());
                    break;
                }
                case 3: {
                    this.g.add(this.c.e());
                    this.g.add(this.c.f().a());
                    break;
                }
                case 4: {
                    this.g.add(this.c.e().a());
                    this.g.add(this.c.f());
                    break;
                }
                case 5: {
                    this.g.add(this.c.c().a());
                    this.g.add(this.c.d());
                    break;
                }
                case 6: {
                    this.g.add(this.c.c());
                    this.g.add(this.c.d().a());
                    break;
                }
                case 7: {
                    this.g.add(this.c.f());
                    this.g.add(this.c.d());
                    break;
                }
                case 8: {
                    this.g.add(this.c.e());
                    this.g.add(this.c.d());
                    break;
                }
                case 9: {
                    this.g.add(this.c.e());
                    this.g.add(this.c.c());
                    break;
                }
                case 10: {
                    this.g.add(this.c.f());
                    this.g.add(this.c.c());
                    break;
                }
            }
        }
        
        private void c() {
            for (int i = 0; i < this.g.size(); ++i) {
                final a b = this.b(this.g.get(i));
                if (b == null || !b.a(this)) {
                    this.g.remove(i--);
                }
                else {
                    this.g.set(i, b.c);
                }
            }
        }
        
        private boolean a(final cj \u2603) {
            return afe.e(this.b, \u2603) || afe.e(this.b, \u2603.a()) || afe.e(this.b, \u2603.b());
        }
        
        private a b(final cj \u2603) {
            cj cj = \u2603;
            alz alz = this.b.p(cj);
            if (afe.d(alz)) {
                return new a(this.b, cj, alz);
            }
            cj = \u2603.a();
            alz = this.b.p(cj);
            if (afe.d(alz)) {
                return new a(this.b, cj, alz);
            }
            cj = \u2603.b();
            alz = this.b.p(cj);
            if (afe.d(alz)) {
                return new a(this.b, cj, alz);
            }
            return null;
        }
        
        private boolean a(final a \u2603) {
            return this.c(\u2603.c);
        }
        
        private boolean c(final cj \u2603) {
            for (int i = 0; i < this.g.size(); ++i) {
                final cj cj = this.g.get(i);
                if (cj.n() == \u2603.n() && cj.p() == \u2603.p()) {
                    return true;
                }
            }
            return false;
        }
        
        protected int a() {
            int n = 0;
            for (final cq \u2603 : cq.c.a) {
                if (this.a(this.c.a(\u2603))) {
                    ++n;
                }
            }
            return n;
        }
        
        private boolean b(final a \u2603) {
            return this.a(\u2603) || this.g.size() != 2;
        }
        
        private void c(final a \u2603) {
            this.g.add(\u2603.c);
            final cj c = this.c.c();
            final cj d = this.c.d();
            final cj e = this.c.e();
            final cj f = this.c.f();
            final boolean c2 = this.c(c);
            final boolean c3 = this.c(d);
            final boolean c4 = this.c(e);
            final boolean c5 = this.c(f);
            b b = null;
            if (c2 || c3) {
                b = afe.b.a;
            }
            if (c4 || c5) {
                b = afe.b.b;
            }
            if (!this.f) {
                if (c3 && c5 && !c2 && !c4) {
                    b = afe.b.g;
                }
                if (c3 && c4 && !c2 && !c5) {
                    b = afe.b.h;
                }
                if (c2 && c4 && !c3 && !c5) {
                    b = afe.b.i;
                }
                if (c2 && c5 && !c3 && !c4) {
                    b = afe.b.j;
                }
            }
            if (b == afe.b.a) {
                if (afe.e(this.b, c.a())) {
                    b = afe.b.e;
                }
                if (afe.e(this.b, d.a())) {
                    b = afe.b.f;
                }
            }
            if (b == afe.b.b) {
                if (afe.e(this.b, f.a())) {
                    b = afe.b.c;
                }
                if (afe.e(this.b, e.a())) {
                    b = afe.b.d;
                }
            }
            if (b == null) {
                b = afe.b.a;
            }
            this.e = this.e.a(this.d.n(), b);
            this.b.a(this.c, this.e, 3);
        }
        
        private boolean d(final cj \u2603) {
            final a b = this.b(\u2603);
            if (b == null) {
                return false;
            }
            b.c();
            return b.b(this);
        }
        
        public a a(final boolean \u2603, final boolean \u2603) {
            final cj c = this.c.c();
            final cj d = this.c.d();
            final cj e = this.c.e();
            final cj f = this.c.f();
            final boolean d2 = this.d(c);
            final boolean d3 = this.d(d);
            final boolean d4 = this.d(e);
            final boolean d5 = this.d(f);
            b \u26032 = null;
            if ((d2 || d3) && !d4 && !d5) {
                \u26032 = afe.b.a;
            }
            if ((d4 || d5) && !d2 && !d3) {
                \u26032 = afe.b.b;
            }
            if (!this.f) {
                if (d3 && d5 && !d2 && !d4) {
                    \u26032 = afe.b.g;
                }
                if (d3 && d4 && !d2 && !d5) {
                    \u26032 = afe.b.h;
                }
                if (d2 && d4 && !d3 && !d5) {
                    \u26032 = afe.b.i;
                }
                if (d2 && d5 && !d3 && !d4) {
                    \u26032 = afe.b.j;
                }
            }
            if (\u26032 == null) {
                if (d2 || d3) {
                    \u26032 = afe.b.a;
                }
                if (d4 || d5) {
                    \u26032 = afe.b.b;
                }
                if (!this.f) {
                    if (\u2603) {
                        if (d3 && d5) {
                            \u26032 = afe.b.g;
                        }
                        if (d4 && d3) {
                            \u26032 = afe.b.h;
                        }
                        if (d5 && d2) {
                            \u26032 = afe.b.j;
                        }
                        if (d2 && d4) {
                            \u26032 = afe.b.i;
                        }
                    }
                    else {
                        if (d2 && d4) {
                            \u26032 = afe.b.i;
                        }
                        if (d5 && d2) {
                            \u26032 = afe.b.j;
                        }
                        if (d4 && d3) {
                            \u26032 = afe.b.h;
                        }
                        if (d3 && d5) {
                            \u26032 = afe.b.g;
                        }
                    }
                }
            }
            if (\u26032 == afe.b.a) {
                if (afe.e(this.b, c.a())) {
                    \u26032 = afe.b.e;
                }
                if (afe.e(this.b, d.a())) {
                    \u26032 = afe.b.f;
                }
            }
            if (\u26032 == afe.b.b) {
                if (afe.e(this.b, f.a())) {
                    \u26032 = afe.b.c;
                }
                if (afe.e(this.b, e.a())) {
                    \u26032 = afe.b.d;
                }
            }
            if (\u26032 == null) {
                \u26032 = afe.b.a;
            }
            this.a(\u26032);
            this.e = this.e.a(this.d.n(), \u26032);
            if (\u2603 || this.b.p(this.c) != this.e) {
                this.b.a(this.c, this.e, 3);
                for (int i = 0; i < this.g.size(); ++i) {
                    final a b = this.b(this.g.get(i));
                    if (b != null) {
                        b.c();
                        if (b.b(this)) {
                            b.c(this);
                        }
                    }
                }
            }
            return this;
        }
        
        public alz b() {
            return this.e;
        }
    }
    
    public enum b implements nw
    {
        a(0, "north_south"), 
        b(1, "east_west"), 
        c(2, "ascending_east"), 
        d(3, "ascending_west"), 
        e(4, "ascending_north"), 
        f(5, "ascending_south"), 
        g(6, "south_east"), 
        h(7, "south_west"), 
        i(8, "north_west"), 
        j(9, "north_east");
        
        private static final b[] k;
        private final int l;
        private final String m;
        
        private b(final int \u2603, final String \u2603) {
            this.l = \u2603;
            this.m = \u2603;
        }
        
        public int a() {
            return this.l;
        }
        
        @Override
        public String toString() {
            return this.m;
        }
        
        public boolean c() {
            return this == b.e || this == b.c || this == b.f || this == b.d;
        }
        
        public static b a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= b.k.length) {
                \u2603 = 0;
            }
            return b.k[\u2603];
        }
        
        @Override
        public String l() {
            return this.m;
        }
        
        static {
            k = new b[values().length];
            for (final b b2 : values()) {
                b.k[b2.a()] = b2;
            }
        }
    }
}
