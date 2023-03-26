import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class xk extends xi
{
    private static final Logger f;
    private og g;
    private og h;
    private adm i;
    private cj j;
    public int a;
    private int k;
    private String l;
    private final wn m;
    
    public xk(final wm \u2603, final adm \u2603, final wn \u2603) {
        this(\u2603, \u2603, cj.a, \u2603);
    }
    
    public xk(final wm \u2603, final adm \u2603, final cj \u2603, final wn \u2603) {
        this.g = new ye();
        this.h = new oq("Repair", true, 2) {
            @Override
            public void p_() {
                super.p_();
                xk.this.a(this);
            }
        };
        this.j = \u2603;
        this.i = \u2603;
        this.m = \u2603;
        this.a(new yg(this.h, 0, 27, 47));
        this.a(new yg(this.h, 1, 76, 47));
        this.a(new yg(this.g, 2, 134, 47) {
            @Override
            public boolean a(final zx \u2603) {
                return false;
            }
            
            @Override
            public boolean a(final wn \u2603) {
                return (\u2603.bA.d || \u2603.bB >= xk.this.a) && xk.this.a > 0 && this.e();
            }
            
            @Override
            public void a(final wn \u2603, final zx \u2603) {
                if (!\u2603.bA.d) {
                    \u2603.a(-xk.this.a);
                }
                xk.this.h.a(0, null);
                if (xk.this.k > 0) {
                    final zx a = xk.this.h.a(1);
                    if (a != null && a.b > xk.this.k) {
                        final zx zx = a;
                        zx.b -= xk.this.k;
                        xk.this.h.a(1, a);
                    }
                    else {
                        xk.this.h.a(1, null);
                    }
                }
                else {
                    xk.this.h.a(1, null);
                }
                xk.this.a = 0;
                final alz p = \u2603.p(\u2603);
                if (!\u2603.bA.d && !\u2603.D && p.c() == afi.cf && \u2603.bc().nextFloat() < 0.12f) {
                    int intValue = p.b((amo<Integer>)aez.b);
                    if (++intValue > 2) {
                        \u2603.g(\u2603);
                        \u2603.b(1020, \u2603, 0);
                    }
                    else {
                        \u2603.a(\u2603, p.a((amo<Comparable>)aez.b, intValue), 2);
                        \u2603.b(1021, \u2603, 0);
                    }
                }
                else if (!\u2603.D) {
                    \u2603.b(1021, \u2603, 0);
                }
            }
        });
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.a(new yg(\u2603, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.a(new yg(\u2603, i, 8 + i * 18, 142));
        }
    }
    
    @Override
    public void a(final og \u2603) {
        super.a(\u2603);
        if (\u2603 == this.h) {
            this.e();
        }
    }
    
    public void e() {
        final int n = 0;
        final int n2 = 1;
        final int n3 = 1;
        final int n4 = 1;
        final int n5 = 2;
        final int n6 = 1;
        final int n7 = 1;
        final zx a = this.h.a(0);
        this.a = 1;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (a == null) {
            this.g.a(0, null);
            this.a = 0;
            return;
        }
        zx k = a.k();
        final zx a2 = this.h.a(1);
        final Map<Integer, Integer> a3 = ack.a(k);
        boolean b = false;
        n9 += a.A() + ((a2 == null) ? 0 : a2.A());
        this.k = 0;
        if (a2 != null) {
            b = (a2.b() == zy.cd && zy.cd.h(a2).c() > 0);
            if (k.e() && k.b().a(a, a2)) {
                int \u2603 = Math.min(k.h(), k.j() / 4);
                if (\u2603 <= 0) {
                    this.g.a(0, null);
                    this.a = 0;
                    return;
                }
                int i;
                for (i = 0; \u2603 > 0 && i < a2.b; \u2603 = Math.min(k.h(), k.j() / 4), ++i) {
                    final int intValue = k.h() - \u2603;
                    k.b(intValue);
                    ++n8;
                }
                this.k = i;
            }
            else {
                if (!b && (k.b() != a2.b() || !k.e())) {
                    this.g.a(0, null);
                    this.a = 0;
                    return;
                }
                if (k.e() && !b) {
                    final int \u2603 = a.j() - a.h();
                    final int i = a2.j() - a2.h();
                    final int intValue = i + k.j() * 12 / 100;
                    final int n11 = \u2603 + intValue;
                    int n12 = k.j() - n11;
                    if (n12 < 0) {
                        n12 = 0;
                    }
                    if (n12 < k.i()) {
                        k.b(n12);
                        n8 += 2;
                    }
                }
                final Map<Integer, Integer> a4 = ack.a(a2);
                final Iterator iterator = a4.keySet().iterator();
                while (iterator.hasNext()) {
                    final int intValue = iterator.next();
                    final aci c = aci.c(intValue);
                    if (c == null) {
                        continue;
                    }
                    final int n12 = a3.containsKey(intValue) ? a3.get(intValue) : 0;
                    int n13 = a4.get(intValue);
                    n13 = ((n12 == n13) ? (++n13) : Math.max(n13, n12));
                    boolean a5 = c.a(a);
                    if (this.m.bA.d || a.b() == zy.cd) {
                        a5 = true;
                    }
                    for (final int intValue2 : a3.keySet()) {
                        if (intValue2 != intValue && !c.a(aci.c(intValue2))) {
                            a5 = false;
                            ++n8;
                        }
                    }
                    if (!a5) {
                        continue;
                    }
                    if (n13 > c.b()) {
                        n13 = c.b();
                    }
                    a3.put(intValue, n13);
                    int max = 0;
                    switch (c.d()) {
                        case 10: {
                            max = 1;
                            break;
                        }
                        case 5: {
                            max = 2;
                            break;
                        }
                        case 2: {
                            max = 4;
                            break;
                        }
                        case 1: {
                            max = 8;
                            break;
                        }
                    }
                    if (b) {
                        max = Math.max(1, max / 2);
                    }
                    n8 += max * n13;
                }
            }
        }
        if (StringUtils.isBlank(this.l)) {
            if (a.s()) {
                n10 = 1;
                n8 += n10;
                k.r();
            }
        }
        else if (!this.l.equals(a.q())) {
            n10 = 1;
            n8 += n10;
            k.c(this.l);
        }
        this.a = n9 + n8;
        if (n8 <= 0) {
            k = null;
        }
        if (n10 == n8 && n10 > 0 && this.a >= 40) {
            this.a = 39;
        }
        if (this.a >= 40 && !this.m.bA.d) {
            k = null;
        }
        if (k != null) {
            int \u2603 = k.A();
            if (a2 != null && \u2603 < a2.A()) {
                \u2603 = a2.A();
            }
            \u2603 = \u2603 * 2 + 1;
            k.c(\u2603);
            ack.a(a3, k);
        }
        this.g.a(0, k);
        this.b();
    }
    
    @Override
    public void a(final xn \u2603) {
        super.a(\u2603);
        \u2603.a(this, 0, this.a);
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            this.a = \u2603;
        }
    }
    
    @Override
    public void b(final wn \u2603) {
        super.b(\u2603);
        if (this.i.D) {
            return;
        }
        for (int i = 0; i < this.h.o_(); ++i) {
            final zx b = this.h.b(i);
            if (b != null) {
                \u2603.a(b, false);
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.i.p(this.j).c() == afi.cf && \u2603.e(this.j.n() + 0.5, this.j.o() + 0.5, this.j.p() + 0.5) <= 64.0;
    }
    
    @Override
    public zx b(final wn \u2603, final int \u2603) {
        zx k = null;
        final yg yg = this.c.get(\u2603);
        if (yg != null && yg.e()) {
            final zx d = yg.d();
            k = d.k();
            if (\u2603 == 2) {
                if (!this.a(d, 3, 39, true)) {
                    return null;
                }
                yg.a(d, k);
            }
            else if (\u2603 == 0 || \u2603 == 1) {
                if (!this.a(d, 3, 39, false)) {
                    return null;
                }
            }
            else if (\u2603 >= 3 && \u2603 < 39 && !this.a(d, 0, 2, false)) {
                return null;
            }
            if (d.b == 0) {
                yg.d(null);
            }
            else {
                yg.f();
            }
            if (d.b == k.b) {
                return null;
            }
            yg.a(\u2603, d);
        }
        return k;
    }
    
    public void a(final String \u2603) {
        this.l = \u2603;
        if (this.a(2).e()) {
            final zx d = this.a(2).d();
            if (StringUtils.isBlank(\u2603)) {
                d.r();
            }
            else {
                d.c(this.l);
            }
        }
        this.e();
    }
    
    static {
        f = LogManager.getLogger();
    }
}
