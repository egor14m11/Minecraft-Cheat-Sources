import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Collections;
import org.lwjgl.input.Mouse;
import java.util.Comparator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayf extends axu implements ayg
{
    protected axu a;
    protected String f;
    private b g;
    private c h;
    private a i;
    private d r;
    private nb s;
    private awi t;
    private boolean u;
    
    public ayf(final axu \u2603, final nb \u2603) {
        this.f = "Select world";
        this.u = true;
        this.a = \u2603;
        this.s = \u2603;
    }
    
    @Override
    public void b() {
        this.f = bnq.a("gui.stats", new Object[0]);
        this.u = true;
        this.j.u().a(new ig(ig.a.b));
    }
    
    @Override
    public void k() {
        super.k();
        if (this.t != null) {
            this.t.p();
        }
    }
    
    public void f() {
        (this.g = new b(this.j)).d(1, 1);
        (this.h = new c(this.j)).d(1, 1);
        (this.i = new a(this.j)).d(1, 1);
        (this.r = new d(this.j)).d(1, 1);
    }
    
    public void g() {
        this.n.add(new avs(0, this.l / 2 + 4, this.m - 28, 150, 20, bnq.a("gui.done", new Object[0])));
        this.n.add(new avs(1, this.l / 2 - 160, this.m - 52, 80, 20, bnq.a("stat.generalButton", new Object[0])));
        final avs avs;
        this.n.add(avs = new avs(2, this.l / 2 - 80, this.m - 52, 80, 20, bnq.a("stat.blocksButton", new Object[0])));
        final avs avs2;
        this.n.add(avs2 = new avs(3, this.l / 2, this.m - 52, 80, 20, bnq.a("stat.itemsButton", new Object[0])));
        final avs avs3;
        this.n.add(avs3 = new avs(4, this.l / 2 + 80, this.m - 52, 80, 20, bnq.a("stat.mobsButton", new Object[0])));
        if (this.i.b() == 0) {
            avs.l = false;
        }
        if (this.h.b() == 0) {
            avs2.l = false;
        }
        if (this.r.b() == 0) {
            avs3.l = false;
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 0) {
            this.j.a(this.a);
        }
        else if (\u2603.k == 1) {
            this.t = this.g;
        }
        else if (\u2603.k == 3) {
            this.t = this.h;
        }
        else if (\u2603.k == 2) {
            this.t = this.i;
        }
        else if (\u2603.k == 4) {
            this.t = this.r;
        }
        else {
            this.t.a(\u2603);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        if (this.u) {
            this.c();
            this.a(this.q, bnq.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
            this.a(this.q, ayf.c_[(int)(ave.J() / 150L % ayf.c_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
        }
        else {
            this.t.a(\u2603, \u2603, \u2603);
            this.a(this.q, this.f, this.l / 2, 20, 16777215);
            super.a(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void a() {
        if (this.u) {
            this.f();
            this.g();
            this.t = this.g;
            this.u = false;
        }
    }
    
    @Override
    public boolean d() {
        return !this.u;
    }
    
    private void a(final int \u2603, final int \u2603, final zw \u2603) {
        this.b(\u2603 + 1, \u2603 + 1);
        bfl.B();
        avc.c();
        this.k.a(new zx(\u2603, 1, 0), \u2603 + 2, \u2603 + 2);
        avc.a();
        bfl.C();
    }
    
    private void b(final int \u2603, final int \u2603) {
        this.c(\u2603, \u2603, 0, 0);
    }
    
    private void c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayf.c);
        final float n = 0.0078125f;
        final float n2 = 0.0078125f;
        final int n3 = 18;
        final int n4 = 18;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603 + 0, \u2603 + 18, (double)this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
        c.b(\u2603 + 18, \u2603 + 18, (double)this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
        c.b(\u2603 + 18, \u2603 + 0, (double)this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
        c.b(\u2603 + 0, \u2603 + 0, (double)this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
        a.b();
    }
    
    class b extends awi
    {
        public b(final ave \u2603) {
            super(\u2603, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, 10);
            this.b(false);
        }
        
        @Override
        protected int b() {
            return na.c.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return false;
        }
        
        @Override
        protected int k() {
            return this.b() * 10;
        }
        
        @Override
        protected void a() {
            ayf.this.c();
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final mw \u26032 = na.c.get(\u2603);
            ayf.this.c(ayf.this.q, \u26032.e().c(), \u2603 + 2, \u2603 + 1, (\u2603 % 2 == 0) ? 16777215 : 9474192);
            final String a = \u26032.a(ayf.this.s.a(\u26032));
            ayf.this.c(ayf.this.q, a, \u2603 + 2 + 213 - ayf.this.q.a(a), \u2603 + 1, (\u2603 % 2 == 0) ? 16777215 : 9474192);
        }
    }
    
    abstract class e extends awi
    {
        protected int v;
        protected List<mu> w;
        protected Comparator<mu> x;
        protected int y;
        protected int z;
        
        protected e(final ave \u2603) {
            super(\u2603, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, 20);
            this.v = -1;
            this.y = -1;
            this.b(false);
            this.a(true, 20);
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return false;
        }
        
        @Override
        protected void a() {
            ayf.this.c();
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final bfx \u2603) {
            if (!Mouse.isButtonDown(0)) {
                this.v = -1;
            }
            if (this.v == 0) {
                ayf.this.c(\u2603 + 115 - 18, \u2603 + 1, 0, 0);
            }
            else {
                ayf.this.c(\u2603 + 115 - 18, \u2603 + 1, 0, 18);
            }
            if (this.v == 1) {
                ayf.this.c(\u2603 + 165 - 18, \u2603 + 1, 0, 0);
            }
            else {
                ayf.this.c(\u2603 + 165 - 18, \u2603 + 1, 0, 18);
            }
            if (this.v == 2) {
                ayf.this.c(\u2603 + 215 - 18, \u2603 + 1, 0, 0);
            }
            else {
                ayf.this.c(\u2603 + 215 - 18, \u2603 + 1, 0, 18);
            }
            if (this.y != -1) {
                int n = 79;
                int \u26032 = 18;
                if (this.y == 1) {
                    n = 129;
                }
                else if (this.y == 2) {
                    n = 179;
                }
                if (this.z == 1) {
                    \u26032 = 36;
                }
                ayf.this.c(\u2603 + n, \u2603 + 1, \u26032, 0);
            }
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603) {
            this.v = -1;
            if (\u2603 >= 79 && \u2603 < 115) {
                this.v = 0;
            }
            else if (\u2603 >= 129 && \u2603 < 165) {
                this.v = 1;
            }
            else if (\u2603 >= 179 && \u2603 < 215) {
                this.v = 2;
            }
            if (this.v >= 0) {
                this.d(this.v);
                this.a.W().a(bpf.a(new jy("gui.button.press"), 1.0f));
            }
        }
        
        @Override
        protected final int b() {
            return this.w.size();
        }
        
        protected final mu c(final int \u2603) {
            return this.w.get(\u2603);
        }
        
        protected abstract String b(final int p0);
        
        protected void a(final mw \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (\u2603 != null) {
                final String a = \u2603.a(ayf.this.s.a(\u2603));
                ayf.this.c(ayf.this.q, a, \u2603 - ayf.this.q.a(a), \u2603 + 5, \u2603 ? 16777215 : 9474192);
            }
            else {
                final String a = "-";
                ayf.this.c(ayf.this.q, a, \u2603 - ayf.this.q.a(a), \u2603 + 5, \u2603 ? 16777215 : 9474192);
            }
        }
        
        @Override
        protected void b(final int \u2603, final int \u2603) {
            if (\u2603 < this.d || \u2603 > this.e) {
                return;
            }
            final int c = this.c(\u2603, \u2603);
            final int n = this.b / 2 - 92 - 16;
            if (c >= 0) {
                if (\u2603 < n + 40 || \u2603 > n + 40 + 20) {
                    return;
                }
                final mu c2 = this.c(c);
                this.a(c2, \u2603, \u2603);
            }
            else {
                String \u26032 = "";
                if (\u2603 >= n + 115 - 18 && \u2603 <= n + 115) {
                    \u26032 = this.b(0);
                }
                else if (\u2603 >= n + 165 - 18 && \u2603 <= n + 165) {
                    \u26032 = this.b(1);
                }
                else {
                    if (\u2603 < n + 215 - 18 || \u2603 > n + 215) {
                        return;
                    }
                    \u26032 = this.b(2);
                }
                \u26032 = ("" + bnq.a(\u26032, new Object[0])).trim();
                if (\u26032.length() > 0) {
                    final int n2 = \u2603 + 12;
                    final int n3 = \u2603 - 12;
                    final int a = ayf.this.q.a(\u26032);
                    avp.this.a(n2 - 3, n3 - 3, n2 + a + 3, n3 + 8 + 3, -1073741824, -1073741824);
                    ayf.this.q.a(\u26032, (float)n2, (float)n3, -1);
                }
            }
        }
        
        protected void a(final mu \u2603, final int \u2603, final int \u2603) {
            if (\u2603 == null) {
                return;
            }
            final zw a = \u2603.a();
            final zx zx = new zx(a);
            final String a2 = zx.a();
            final String trim = ("" + bnq.a(a2 + ".name", new Object[0])).trim();
            if (trim.length() > 0) {
                final int n = \u2603 + 12;
                final int n2 = \u2603 - 12;
                final int a3 = ayf.this.q.a(trim);
                avp.this.a(n - 3, n2 - 3, n + a3 + 3, n2 + 8 + 3, -1073741824, -1073741824);
                ayf.this.q.a(trim, (float)n, (float)n2, -1);
            }
        }
        
        protected void d(final int \u2603) {
            if (\u2603 != this.y) {
                this.y = \u2603;
                this.z = -1;
            }
            else if (this.z == -1) {
                this.z = 1;
            }
            else {
                this.y = -1;
                this.z = 0;
            }
            Collections.sort(this.w, this.x);
        }
    }
    
    class c extends e
    {
        public c(final ave \u2603) {
            super(\u2603);
            this.w = (List<mu>)Lists.newArrayList();
            for (final mu \u26032 : na.d) {
                boolean b = false;
                final int b2 = zw.b(\u26032.a());
                if (ayf.this.s.a(\u26032) > 0) {
                    b = true;
                }
                else if (na.ae[b2] != null && ayf.this.s.a(na.ae[b2]) > 0) {
                    b = true;
                }
                else if (na.ac[b2] != null && ayf.this.s.a(na.ac[b2]) > 0) {
                    b = true;
                }
                if (b) {
                    this.w.add(\u26032);
                }
            }
            this.x = new Comparator<mu>() {
                public int a(final mu \u2603, final mu \u2603) {
                    final int b = zw.b(\u2603.a());
                    final int b2 = zw.b(\u2603.a());
                    mw \u26032 = null;
                    mw \u26033 = null;
                    if (c.this.y == 0) {
                        \u26032 = na.ae[b];
                        \u26033 = na.ae[b2];
                    }
                    else if (c.this.y == 1) {
                        \u26032 = na.ac[b];
                        \u26033 = na.ac[b2];
                    }
                    else if (c.this.y == 2) {
                        \u26032 = na.ad[b];
                        \u26033 = na.ad[b2];
                    }
                    if (\u26032 != null || \u26033 != null) {
                        if (\u26032 == null) {
                            return 1;
                        }
                        if (\u26033 == null) {
                            return -1;
                        }
                        final int a = ayf.this.s.a(\u26032);
                        final int a2 = ayf.this.s.a(\u26033);
                        if (a != a2) {
                            return (a - a2) * c.this.z;
                        }
                    }
                    return b - b2;
                }
            };
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final bfx \u2603) {
            super.a(\u2603, \u2603, \u2603);
            if (this.v == 0) {
                ayf.this.c(\u2603 + 115 - 18 + 1, \u2603 + 1 + 1, 72, 18);
            }
            else {
                ayf.this.c(\u2603 + 115 - 18, \u2603 + 1, 72, 18);
            }
            if (this.v == 1) {
                ayf.this.c(\u2603 + 165 - 18 + 1, \u2603 + 1 + 1, 18, 18);
            }
            else {
                ayf.this.c(\u2603 + 165 - 18, \u2603 + 1, 18, 18);
            }
            if (this.v == 2) {
                ayf.this.c(\u2603 + 215 - 18 + 1, \u2603 + 1 + 1, 36, 18);
            }
            else {
                ayf.this.c(\u2603 + 215 - 18, \u2603 + 1, 36, 18);
            }
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final mu c = this.c(\u2603);
            final zw a = c.a();
            ayf.this.a(\u2603 + 40, \u2603, a);
            final int b = zw.b(a);
            this.a(na.ae[b], \u2603 + 115, \u2603, \u2603 % 2 == 0);
            this.a(na.ac[b], \u2603 + 165, \u2603, \u2603 % 2 == 0);
            this.a(c, \u2603 + 215, \u2603, \u2603 % 2 == 0);
        }
        
        @Override
        protected String b(final int \u2603) {
            if (\u2603 == 1) {
                return "stat.crafted";
            }
            if (\u2603 == 2) {
                return "stat.used";
            }
            return "stat.depleted";
        }
    }
    
    class a extends e
    {
        public a(final ave \u2603) {
            super(\u2603);
            this.w = (List<mu>)Lists.newArrayList();
            for (final mu \u26032 : na.e) {
                boolean b = false;
                final int b2 = zw.b(\u26032.a());
                if (ayf.this.s.a(\u26032) > 0) {
                    b = true;
                }
                else if (na.ad[b2] != null && ayf.this.s.a(na.ad[b2]) > 0) {
                    b = true;
                }
                else if (na.ac[b2] != null && ayf.this.s.a(na.ac[b2]) > 0) {
                    b = true;
                }
                if (b) {
                    this.w.add(\u26032);
                }
            }
            this.x = new Comparator<mu>() {
                public int a(final mu \u2603, final mu \u2603) {
                    final int b = zw.b(\u2603.a());
                    final int b2 = zw.b(\u2603.a());
                    mw \u26032 = null;
                    mw \u26033 = null;
                    if (ayf.a.this.y == 2) {
                        \u26032 = na.ab[b];
                        \u26033 = na.ab[b2];
                    }
                    else if (ayf.a.this.y == 0) {
                        \u26032 = na.ac[b];
                        \u26033 = na.ac[b2];
                    }
                    else if (ayf.a.this.y == 1) {
                        \u26032 = na.ad[b];
                        \u26033 = na.ad[b2];
                    }
                    if (\u26032 != null || \u26033 != null) {
                        if (\u26032 == null) {
                            return 1;
                        }
                        if (\u26033 == null) {
                            return -1;
                        }
                        final int a = ayf.this.s.a(\u26032);
                        final int a2 = ayf.this.s.a(\u26033);
                        if (a != a2) {
                            return (a - a2) * ayf.a.this.z;
                        }
                    }
                    return b - b2;
                }
            };
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final bfx \u2603) {
            super.a(\u2603, \u2603, \u2603);
            if (this.v == 0) {
                ayf.this.c(\u2603 + 115 - 18 + 1, \u2603 + 1 + 1, 18, 18);
            }
            else {
                ayf.this.c(\u2603 + 115 - 18, \u2603 + 1, 18, 18);
            }
            if (this.v == 1) {
                ayf.this.c(\u2603 + 165 - 18 + 1, \u2603 + 1 + 1, 36, 18);
            }
            else {
                ayf.this.c(\u2603 + 165 - 18, \u2603 + 1, 36, 18);
            }
            if (this.v == 2) {
                ayf.this.c(\u2603 + 215 - 18 + 1, \u2603 + 1 + 1, 54, 18);
            }
            else {
                ayf.this.c(\u2603 + 215 - 18, \u2603 + 1, 54, 18);
            }
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final mu c = this.c(\u2603);
            final zw a = c.a();
            ayf.this.a(\u2603 + 40, \u2603, a);
            final int b = zw.b(a);
            this.a(na.ac[b], \u2603 + 115, \u2603, \u2603 % 2 == 0);
            this.a(na.ad[b], \u2603 + 165, \u2603, \u2603 % 2 == 0);
            this.a(c, \u2603 + 215, \u2603, \u2603 % 2 == 0);
        }
        
        @Override
        protected String b(final int \u2603) {
            if (\u2603 == 0) {
                return "stat.crafted";
            }
            if (\u2603 == 1) {
                return "stat.used";
            }
            return "stat.mined";
        }
    }
    
    class d extends awi
    {
        private final List<pm.a> v;
        
        public d(final ave \u2603) {
            super(\u2603, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, ayf.this.q.a * 4);
            this.v = (List<pm.a>)Lists.newArrayList();
            this.b(false);
            for (final pm.a a : pm.a.values()) {
                if (ayf.this.s.a(a.d) > 0 || ayf.this.s.a(a.e) > 0) {
                    this.v.add(a);
                }
            }
        }
        
        @Override
        protected int b() {
            return this.v.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return false;
        }
        
        @Override
        protected int k() {
            return this.b() * ayf.this.q.a * 4;
        }
        
        @Override
        protected void a() {
            ayf.this.c();
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final pm.a a = this.v.get(\u2603);
            final String a2 = bnq.a("entity." + pm.b(a.a) + ".name", new Object[0]);
            final int a3 = ayf.this.s.a(a.d);
            final int a4 = ayf.this.s.a(a.e);
            String \u26032 = bnq.a("stat.entityKills", a3, a2);
            String \u26033 = bnq.a("stat.entityKilledBy", a2, a4);
            if (a3 == 0) {
                \u26032 = bnq.a("stat.entityKills.none", a2);
            }
            if (a4 == 0) {
                \u26033 = bnq.a("stat.entityKilledBy.none", a2);
            }
            ayf.this.c(ayf.this.q, a2, \u2603 + 2 - 10, \u2603 + 1, 16777215);
            ayf.this.c(ayf.this.q, \u26032, \u2603 + 2, \u2603 + 1 + ayf.this.q.a, (a3 == 0) ? 6316128 : 9474192);
            ayf.this.c(ayf.this.q, \u26033, \u2603 + 2, \u2603 + 1 + ayf.this.q.a * 2, (a4 == 0) ? 6316128 : 9474192);
        }
    }
}
