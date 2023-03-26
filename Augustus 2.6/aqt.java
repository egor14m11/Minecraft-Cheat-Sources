import java.util.Iterator;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aqt
{
    protected aqe l;
    protected cq m;
    protected int n;
    
    public aqt() {
    }
    
    protected aqt(final int \u2603) {
        this.n = \u2603;
    }
    
    public dn b() {
        final dn dn = new dn();
        dn.a("id", aqr.a(this));
        dn.a("BB", this.l.g());
        dn.a("O", (this.m == null) ? -1 : this.m.b());
        dn.a("GD", this.n);
        this.a(dn);
        return dn;
    }
    
    protected abstract void a(final dn p0);
    
    public void a(final adm \u2603, final dn \u2603) {
        if (\u2603.c("BB")) {
            this.l = new aqe(\u2603.l("BB"));
        }
        final int f = \u2603.f("O");
        this.m = ((f == -1) ? null : cq.b(f));
        this.n = \u2603.f("GD");
        this.b(\u2603);
    }
    
    protected abstract void b(final dn p0);
    
    public void a(final aqt \u2603, final List<aqt> \u2603, final Random \u2603) {
    }
    
    public abstract boolean a(final adm p0, final Random p1, final aqe p2);
    
    public aqe c() {
        return this.l;
    }
    
    public int d() {
        return this.n;
    }
    
    public static aqt a(final List<aqt> \u2603, final aqe \u2603) {
        for (final aqt aqt : \u2603) {
            if (aqt.c() != null && aqt.c().a(\u2603)) {
                return aqt;
            }
        }
        return null;
    }
    
    public cj a() {
        return new cj(this.l.f());
    }
    
    protected boolean a(final adm \u2603, final aqe \u2603) {
        final int max = Math.max(this.l.a - 1, \u2603.a);
        final int max2 = Math.max(this.l.b - 1, \u2603.b);
        final int max3 = Math.max(this.l.c - 1, \u2603.c);
        final int min = Math.min(this.l.d + 1, \u2603.d);
        final int min2 = Math.min(this.l.e + 1, \u2603.e);
        final int min3 = Math.min(this.l.f + 1, \u2603.f);
        final cj.a a = new cj.a();
        for (int i = max; i <= min; ++i) {
            for (int j = max3; j <= min3; ++j) {
                if (\u2603.p(a.c(i, max2, j)).c().t().d()) {
                    return true;
                }
                if (\u2603.p(a.c(i, min2, j)).c().t().d()) {
                    return true;
                }
            }
        }
        for (int i = max; i <= min; ++i) {
            for (int j = max2; j <= min2; ++j) {
                if (\u2603.p(a.c(i, j, max3)).c().t().d()) {
                    return true;
                }
                if (\u2603.p(a.c(i, j, min3)).c().t().d()) {
                    return true;
                }
            }
        }
        for (int i = max3; i <= min3; ++i) {
            for (int j = max2; j <= min2; ++j) {
                if (\u2603.p(a.c(max, j, i)).c().t().d()) {
                    return true;
                }
                if (\u2603.p(a.c(min, j, i)).c().t().d()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected int a(final int \u2603, final int \u2603) {
        if (this.m == null) {
            return \u2603;
        }
        switch (aqt$1.a[this.m.ordinal()]) {
            case 1:
            case 2: {
                return this.l.a + \u2603;
            }
            case 3: {
                return this.l.d - \u2603;
            }
            case 4: {
                return this.l.a + \u2603;
            }
            default: {
                return \u2603;
            }
        }
    }
    
    protected int d(final int \u2603) {
        if (this.m == null) {
            return \u2603;
        }
        return \u2603 + this.l.b;
    }
    
    protected int b(final int \u2603, final int \u2603) {
        if (this.m == null) {
            return \u2603;
        }
        switch (aqt$1.a[this.m.ordinal()]) {
            case 1: {
                return this.l.f - \u2603;
            }
            case 2: {
                return this.l.c + \u2603;
            }
            case 3:
            case 4: {
                return this.l.c + \u2603;
            }
            default: {
                return \u2603;
            }
        }
    }
    
    protected int a(final afh \u2603, final int \u2603) {
        if (\u2603 == afi.av) {
            if (this.m == cq.e || this.m == cq.f) {
                if (\u2603 == 1) {
                    return 0;
                }
                return 1;
            }
        }
        else if (\u2603 instanceof agh) {
            if (this.m == cq.d) {
                if (\u2603 == 0) {
                    return 2;
                }
                if (\u2603 == 2) {
                    return 0;
                }
            }
            else {
                if (this.m == cq.e) {
                    return \u2603 + 1 & 0x3;
                }
                if (this.m == cq.f) {
                    return \u2603 + 3 & 0x3;
                }
            }
        }
        else if (\u2603 == afi.aw || \u2603 == afi.ad || \u2603 == afi.bA || \u2603 == afi.bv || \u2603 == afi.bO) {
            if (this.m == cq.d) {
                if (\u2603 == 2) {
                    return 3;
                }
                if (\u2603 == 3) {
                    return 2;
                }
            }
            else if (this.m == cq.e) {
                if (\u2603 == 0) {
                    return 2;
                }
                if (\u2603 == 1) {
                    return 3;
                }
                if (\u2603 == 2) {
                    return 0;
                }
                if (\u2603 == 3) {
                    return 1;
                }
            }
            else if (this.m == cq.f) {
                if (\u2603 == 0) {
                    return 2;
                }
                if (\u2603 == 1) {
                    return 3;
                }
                if (\u2603 == 2) {
                    return 1;
                }
                if (\u2603 == 3) {
                    return 0;
                }
            }
        }
        else if (\u2603 == afi.au) {
            if (this.m == cq.d) {
                if (\u2603 == cq.c.a()) {
                    return cq.d.a();
                }
                if (\u2603 == cq.d.a()) {
                    return cq.c.a();
                }
            }
            else if (this.m == cq.e) {
                if (\u2603 == cq.c.a()) {
                    return cq.e.a();
                }
                if (\u2603 == cq.d.a()) {
                    return cq.f.a();
                }
                if (\u2603 == cq.e.a()) {
                    return cq.c.a();
                }
                if (\u2603 == cq.f.a()) {
                    return cq.d.a();
                }
            }
            else if (this.m == cq.f) {
                if (\u2603 == cq.c.a()) {
                    return cq.f.a();
                }
                if (\u2603 == cq.d.a()) {
                    return cq.e.a();
                }
                if (\u2603 == cq.e.a()) {
                    return cq.c.a();
                }
                if (\u2603 == cq.f.a()) {
                    return cq.d.a();
                }
            }
        }
        else if (\u2603 == afi.aG) {
            if (this.m == cq.d) {
                if (\u2603 == 3) {
                    return 4;
                }
                if (\u2603 == 4) {
                    return 3;
                }
            }
            else if (this.m == cq.e) {
                if (\u2603 == 3) {
                    return 1;
                }
                if (\u2603 == 4) {
                    return 2;
                }
                if (\u2603 == 2) {
                    return 3;
                }
                if (\u2603 == 1) {
                    return 4;
                }
            }
            else if (this.m == cq.f) {
                if (\u2603 == 3) {
                    return 2;
                }
                if (\u2603 == 4) {
                    return 1;
                }
                if (\u2603 == 2) {
                    return 3;
                }
                if (\u2603 == 1) {
                    return 4;
                }
            }
        }
        else if (\u2603 == afi.bR || \u2603 instanceof age) {
            final cq b = cq.b(\u2603);
            if (this.m == cq.d) {
                if (b == cq.d || b == cq.c) {
                    return b.d().b();
                }
            }
            else if (this.m == cq.e) {
                if (b == cq.c) {
                    return cq.e.b();
                }
                if (b == cq.d) {
                    return cq.f.b();
                }
                if (b == cq.e) {
                    return cq.c.b();
                }
                if (b == cq.f) {
                    return cq.d.b();
                }
            }
            else if (this.m == cq.f) {
                if (b == cq.c) {
                    return cq.f.b();
                }
                if (b == cq.d) {
                    return cq.e.b();
                }
                if (b == cq.e) {
                    return cq.c.b();
                }
                if (b == cq.f) {
                    return cq.d.b();
                }
            }
        }
        else if (\u2603 == afi.J || \u2603 == afi.F || \u2603 == afi.ay || \u2603 == afi.z) {
            if (this.m == cq.d) {
                if (\u2603 == cq.c.a() || \u2603 == cq.d.a()) {
                    return cq.a(\u2603).d().a();
                }
            }
            else if (this.m == cq.e) {
                if (\u2603 == cq.c.a()) {
                    return cq.e.a();
                }
                if (\u2603 == cq.d.a()) {
                    return cq.f.a();
                }
                if (\u2603 == cq.e.a()) {
                    return cq.c.a();
                }
                if (\u2603 == cq.f.a()) {
                    return cq.d.a();
                }
            }
            else if (this.m == cq.f) {
                if (\u2603 == cq.c.a()) {
                    return cq.f.a();
                }
                if (\u2603 == cq.d.a()) {
                    return cq.e.a();
                }
                if (\u2603 == cq.e.a()) {
                    return cq.c.a();
                }
                if (\u2603 == cq.f.a()) {
                    return cq.d.a();
                }
            }
        }
        return \u2603;
    }
    
    protected void a(final adm \u2603, final alz \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
        final cj cj = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
        if (!\u2603.b(cj)) {
            return;
        }
        \u2603.a(cj, \u2603, 2);
    }
    
    protected alz a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
        final int a = this.a(\u2603, \u2603);
        final int d = this.d(\u2603);
        final int b = this.b(\u2603, \u2603);
        final cj cj = new cj(a, d, b);
        if (!\u2603.b(cj)) {
            return afi.a.Q();
        }
        return \u2603.p(cj);
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int i = \u2603; i <= \u2603; ++i) {
            for (int j = \u2603; j <= \u2603; ++j) {
                for (int k = \u2603; k <= \u2603; ++k) {
                    this.a(\u2603, afi.a.Q(), j, i, k, \u2603);
                }
            }
        }
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603, final alz \u2603, final boolean \u2603) {
        for (int i = \u2603; i <= \u2603; ++i) {
            for (int j = \u2603; j <= \u2603; ++j) {
                for (int k = \u2603; k <= \u2603; ++k) {
                    if (!\u2603 || this.a(\u2603, j, i, k, \u2603).c().t() != arm.a) {
                        if (i == \u2603 || i == \u2603 || j == \u2603 || j == \u2603 || k == \u2603 || k == \u2603) {
                            this.a(\u2603, \u2603, j, i, k, \u2603);
                        }
                        else {
                            this.a(\u2603, \u2603, j, i, k, \u2603);
                        }
                    }
                }
            }
        }
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603, final Random \u2603, final a \u2603) {
        for (int i = \u2603; i <= \u2603; ++i) {
            for (int j = \u2603; j <= \u2603; ++j) {
                for (int k = \u2603; k <= \u2603; ++k) {
                    if (!\u2603 || this.a(\u2603, j, i, k, \u2603).c().t() != arm.a) {
                        \u2603.a(\u2603, j, i, k, i == \u2603 || i == \u2603 || j == \u2603 || j == \u2603 || k == \u2603 || k == \u2603);
                        this.a(\u2603, \u2603.a(), j, i, k, \u2603);
                    }
                }
            }
        }
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final Random \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603, final alz \u2603, final boolean \u2603) {
        for (int i = \u2603; i <= \u2603; ++i) {
            for (int j = \u2603; j <= \u2603; ++j) {
                for (int k = \u2603; k <= \u2603; ++k) {
                    if (\u2603.nextFloat() <= \u2603) {
                        if (!\u2603 || this.a(\u2603, j, i, k, \u2603).c().t() != arm.a) {
                            if (i == \u2603 || i == \u2603 || j == \u2603 || j == \u2603 || k == \u2603 || k == \u2603) {
                                this.a(\u2603, \u2603, j, i, k, \u2603);
                            }
                            else {
                                this.a(\u2603, \u2603, j, i, k, \u2603);
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final Random \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603) {
        if (\u2603.nextFloat() < \u2603) {
            this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603, final boolean \u2603) {
        final float n = (float)(\u2603 - \u2603 + 1);
        final float n2 = (float)(\u2603 - \u2603 + 1);
        final float n3 = (float)(\u2603 - \u2603 + 1);
        final float n4 = \u2603 + n / 2.0f;
        final float n5 = \u2603 + n3 / 2.0f;
        for (int i = \u2603; i <= \u2603; ++i) {
            final float n6 = (i - \u2603) / n2;
            for (int j = \u2603; j <= \u2603; ++j) {
                final float n7 = (j - n4) / (n * 0.5f);
                for (int k = \u2603; k <= \u2603; ++k) {
                    final float n8 = (k - n5) / (n3 * 0.5f);
                    if (!\u2603 || this.a(\u2603, j, i, k, \u2603).c().t() != arm.a) {
                        final float n9 = n7 * n7 + n6 * n6 + n8 * n8;
                        if (n9 <= 1.05f) {
                            this.a(\u2603, \u2603, j, i, k, \u2603);
                        }
                    }
                }
            }
        }
    }
    
    protected void b(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
        cj a = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
        if (!\u2603.b(a)) {
            return;
        }
        while (!\u2603.d(a) && a.o() < 255) {
            \u2603.a(a, afi.a.Q(), 2);
            a = a.a();
        }
    }
    
    protected void b(final adm \u2603, final alz \u2603, final int \u2603, final int \u2603, final int \u2603, final aqe \u2603) {
        final int a = this.a(\u2603, \u2603);
        int d = this.d(\u2603);
        final int b = this.b(\u2603, \u2603);
        if (!\u2603.b(new cj(a, d, b))) {
            return;
        }
        while ((\u2603.d(new cj(a, d, b)) || \u2603.p(new cj(a, d, b)).c().t().d()) && d > 1) {
            \u2603.a(new cj(a, d, b), \u2603, 2);
            --d;
        }
    }
    
    protected boolean a(final adm \u2603, final aqe \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final List<ob> \u2603, final int \u2603) {
        final cj \u26032 = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
        if (\u2603.b(\u26032) && \u2603.p(\u26032).c() != afi.ae) {
            final alz q = afi.ae.Q();
            \u2603.a(\u26032, afi.ae.f(\u2603, \u26032, q), 2);
            final akw s = \u2603.s(\u26032);
            if (s instanceof aky) {
                ob.a(\u2603, \u2603, (og)s, \u2603);
            }
            return true;
        }
        return false;
    }
    
    protected boolean a(final adm \u2603, final aqe \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final List<ob> \u2603, final int \u2603) {
        final cj cj = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
        if (\u2603.b(cj) && \u2603.p(cj).c() != afi.z) {
            \u2603.a(cj, afi.z.a(this.a(afi.z, \u2603)), 2);
            final akw s = \u2603.s(cj);
            if (s instanceof alc) {
                ob.a(\u2603, \u2603, (alc)s, \u2603);
            }
            return true;
        }
        return false;
    }
    
    protected void a(final adm \u2603, final aqe \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603, final cq \u2603) {
        final cj cj = new cj(this.a(\u2603, \u2603), this.d(\u2603), this.b(\u2603, \u2603));
        if (\u2603.b(cj)) {
            zb.a(\u2603, cj, \u2603.f(), afi.ao);
        }
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603) {
        this.l.a(\u2603, \u2603, \u2603);
    }
    
    public abstract static class a
    {
        protected alz a;
        
        protected a() {
            this.a = afi.a.Q();
        }
        
        public abstract void a(final Random p0, final int p1, final int p2, final int p3, final boolean p4);
        
        public alz a() {
            return this.a;
        }
    }
}
