import java.util.Map;
import org.lwjgl.input.Mouse;
import com.google.common.collect.Lists;
import java.util.Iterator;
import org.lwjgl.input.Keyboard;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayu extends ayw
{
    private static final jy u;
    private static oq v;
    private static int w;
    private float x;
    private boolean y;
    private boolean z;
    private avw A;
    private List<yg> B;
    private yg C;
    private boolean D;
    private ayt E;
    
    public ayu(final wn \u2603) {
        super(new a(\u2603));
        \u2603.bk = this.h;
        this.p = true;
        this.g = 136;
        this.f = 195;
    }
    
    @Override
    public void e() {
        if (!this.j.c.h()) {
            this.j.a(new azc(this.j.h));
        }
        this.a();
    }
    
    @Override
    protected void a(final yg \u2603, final int \u2603, final int \u2603, int \u2603) {
        this.D = true;
        final boolean b = \u2603 == 1;
        \u2603 = ((\u2603 == -999 && \u2603 == 0) ? 4 : \u2603);
        if (\u2603 != null || ayu.w == yz.m.a() || \u2603 == 5) {
            if (\u2603 == this.C && b) {
                for (int i = 0; i < this.j.h.bj.a().size(); ++i) {
                    this.j.c.a(null, i);
                }
            }
            else if (ayu.w == yz.m.a()) {
                if (\u2603 == this.C) {
                    this.j.h.bi.b((zx)null);
                }
                else if (\u2603 == 4 && \u2603 != null && \u2603.e()) {
                    final zx \u26032 = \u2603.a((\u2603 == 0) ? 1 : \u2603.d().c());
                    this.j.h.a(\u26032, true);
                    this.j.c.a(\u26032);
                }
                else if (\u2603 == 4 && this.j.h.bi.p() != null) {
                    this.j.h.a(this.j.h.bi.p(), true);
                    this.j.c.a(this.j.h.bi.p());
                    this.j.h.bi.b((zx)null);
                }
                else {
                    this.j.h.bj.a((\u2603 == null) ? \u2603 : ((b)\u2603).b.e, \u2603, \u2603, this.j.h);
                    this.j.h.bj.b();
                }
            }
            else if (\u2603 != 5 && \u2603.d == ayu.v) {
                final wm wm = this.j.h.bi;
                zx zx = wm.p();
                final zx d = \u2603.d();
                if (\u2603 == 2) {
                    if (d != null && \u2603 >= 0 && \u2603 < 9) {
                        final zx zx2 = d.k();
                        zx2.b = zx2.c();
                        this.j.h.bi.a(\u2603, zx2);
                        this.j.h.bj.b();
                    }
                    return;
                }
                if (\u2603 == 3) {
                    if (wm.p() == null && \u2603.e()) {
                        final zx zx2 = \u2603.d().k();
                        zx2.b = zx2.c();
                        wm.b(zx2);
                    }
                    return;
                }
                if (\u2603 == 4) {
                    if (d != null) {
                        final zx zx2 = d.k();
                        zx2.b = ((\u2603 == 0) ? 1 : zx2.c());
                        this.j.h.a(zx2, true);
                        this.j.c.a(zx2);
                    }
                    return;
                }
                if (zx != null && d != null && zx.a(d)) {
                    if (\u2603 == 0) {
                        if (b) {
                            zx.b = zx.c();
                        }
                        else if (zx.b < zx.c()) {
                            final zx zx3 = zx;
                            ++zx3.b;
                        }
                    }
                    else if (zx.b <= 1) {
                        wm.b((zx)null);
                    }
                    else {
                        final zx zx4 = zx;
                        --zx4.b;
                    }
                }
                else if (d == null || zx != null) {
                    wm.b((zx)null);
                }
                else {
                    wm.b(zx.b(d));
                    zx = wm.p();
                    if (b) {
                        zx.b = zx.c();
                    }
                }
            }
            else {
                this.h.a((\u2603 == null) ? \u2603 : \u2603.e, \u2603, \u2603, this.j.h);
                if (xi.c(\u2603) == 2) {
                    for (int i = 0; i < 9; ++i) {
                        this.j.c.a(this.h.a(45 + i).d(), 36 + i);
                    }
                }
                else if (\u2603 != null) {
                    final zx \u26032 = this.h.a(\u2603.e).d();
                    this.j.c.a(\u26032, \u2603.e - this.h.c.size() + 9 + 36);
                }
            }
        }
        else {
            final wm wm = this.j.h.bi;
            if (wm.p() != null) {
                if (\u2603 == 0) {
                    this.j.h.a(wm.p(), true);
                    this.j.c.a(wm.p());
                    wm.b((zx)null);
                }
                if (\u2603 == 1) {
                    final zx zx = wm.p().a(1);
                    this.j.h.a(zx, true);
                    this.j.c.a(zx);
                    if (wm.p().b == 0) {
                        wm.b((zx)null);
                    }
                }
            }
        }
    }
    
    @Override
    protected void a() {
        final int i = this.i;
        super.a();
        if (this.A != null && this.i != i) {
            this.A.a = this.i + 82;
        }
    }
    
    @Override
    public void b() {
        if (this.j.c.h()) {
            super.b();
            this.n.clear();
            Keyboard.enableRepeatEvents(true);
            (this.A = new avw(0, this.q, this.i + 82, this.r + 6, 89, this.q.a)).f(15);
            this.A.a(false);
            this.A.e(false);
            this.A.g(16777215);
            final int w = ayu.w;
            ayu.w = -1;
            this.b(yz.a[w]);
            this.E = new ayt(this.j);
            this.j.h.bj.a(this.E);
        }
        else {
            this.j.a(new azc(this.j.h));
        }
    }
    
    @Override
    public void m() {
        super.m();
        if (this.j.h != null && this.j.h.bi != null) {
            this.j.h.bj.b(this.E);
        }
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (ayu.w != yz.g.a()) {
            if (avh.a(this.j.t.aj)) {
                this.b(yz.g);
            }
            else {
                super.a(\u2603, \u2603);
            }
            return;
        }
        if (this.D) {
            this.D = false;
            this.A.a("");
        }
        if (this.b(\u2603)) {
            return;
        }
        if (this.A.a(\u2603, \u2603)) {
            this.h();
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    private void h() {
        final a a = (a)this.h;
        a.a.clear();
        for (final zw \u2603 : zw.e) {
            if (\u2603 == null) {
                continue;
            }
            if (\u2603.c() == null) {
                continue;
            }
            \u2603.a(\u2603, null, a.a);
        }
        for (final aci \u26032 : aci.b) {
            if (\u26032 != null) {
                if (\u26032.C != null) {
                    zy.cd.a(\u26032, a.a);
                }
            }
        }
        final Iterator<zx> iterator2 = a.a.iterator();
        final String lowerCase = this.A.b().toLowerCase();
        while (iterator2.hasNext()) {
            final zx zx = iterator2.next();
            boolean b2 = false;
            for (final String \u26033 : zx.a(this.j.h, this.j.t.y)) {
                if (a.a(\u26033).toLowerCase().contains(lowerCase)) {
                    b2 = true;
                    break;
                }
            }
            if (!b2) {
                iterator2.remove();
            }
        }
        a.a(this.x = 0.0f);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        final yz yz = yz.a[ayu.w];
        if (yz.h()) {
            bfl.k();
            this.q.a(bnq.a(yz.c(), new Object[0]), 8, 6, 4210752);
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            final int \u26032 = \u2603 - this.i;
            final int \u26033 = \u2603 - this.r;
            for (final yz \u26034 : yz.a) {
                if (this.a(\u26034, \u26032, \u26033)) {
                    return;
                }
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            final int \u26032 = \u2603 - this.i;
            final int \u26033 = \u2603 - this.r;
            for (final yz yz : yz.a) {
                if (this.a(yz, \u26032, \u26033)) {
                    this.b(yz);
                    return;
                }
            }
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    private boolean i() {
        return ayu.w != yz.m.a() && yz.a[ayu.w].j() && ((a)this.h).e();
    }
    
    private void b(final yz \u2603) {
        final int w = ayu.w;
        ayu.w = \u2603.a();
        final a a = (a)this.h;
        this.s.clear();
        a.a.clear();
        \u2603.a(a.a);
        if (\u2603 == yz.m) {
            final xi bj = this.j.h.bj;
            if (this.B == null) {
                this.B = a.c;
            }
            a.c = (List<yg>)Lists.newArrayList();
            for (int i = 0; i < bj.c.size(); ++i) {
                final yg yg = new b(bj.c.get(i), i);
                a.c.add(yg);
                if (i >= 5 && i < 9) {
                    final int n = i - 5;
                    final int n2 = n / 2;
                    final int n3 = n % 2;
                    yg.f = 9 + n2 * 54;
                    yg.g = 6 + n3 * 27;
                }
                else if (i >= 0 && i < 5) {
                    yg.g = -2000;
                    yg.f = -2000;
                }
                else if (i < bj.c.size()) {
                    final int n = i - 9;
                    final int n2 = n % 9;
                    final int n3 = n / 9;
                    yg.f = 9 + n2 * 18;
                    if (i >= 36) {
                        yg.g = 112;
                    }
                    else {
                        yg.g = 54 + n3 * 18;
                    }
                }
            }
            this.C = new yg(ayu.v, 0, 173, 112);
            a.c.add(this.C);
        }
        else if (w == yz.m.a()) {
            a.c = this.B;
            this.B = null;
        }
        if (this.A != null) {
            if (\u2603 == yz.g) {
                this.A.e(true);
                this.A.d(false);
                this.A.b(true);
                this.A.a("");
                this.h();
            }
            else {
                this.A.e(false);
                this.A.d(true);
                this.A.b(false);
            }
        }
        a.a(this.x = 0.0f);
    }
    
    @Override
    public void k() {
        super.k();
        int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel != 0 && this.i()) {
            final int n = ((a)this.h).a.size() / 9 - 5;
            if (eventDWheel > 0) {
                eventDWheel = 1;
            }
            if (eventDWheel < 0) {
                eventDWheel = -1;
            }
            this.x -= (float)(eventDWheel / (double)n);
            this.x = ns.a(this.x, 0.0f, 1.0f);
            ((a)this.h).a(this.x);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        final boolean buttonDown = Mouse.isButtonDown(0);
        final int i = this.i;
        final int r = this.r;
        final int n = i + 175;
        final int n2 = r + 18;
        final int n3 = n + 14;
        final int n4 = n2 + 112;
        if (!this.z && buttonDown && \u2603 >= n && \u2603 >= n2 && \u2603 < n3 && \u2603 < n4) {
            this.y = this.i();
        }
        if (!buttonDown) {
            this.y = false;
        }
        this.z = buttonDown;
        if (this.y) {
            this.x = (\u2603 - n2 - 7.5f) / (n4 - n2 - 15.0f);
            this.x = ns.a(this.x, 0.0f, 1.0f);
            ((a)this.h).a(this.x);
        }
        super.a(\u2603, \u2603, \u2603);
        for (final yz \u26032 : yz.a) {
            if (this.b(\u26032, \u2603, \u2603)) {
                break;
            }
        }
        if (this.C != null && ayu.w == yz.m.a() && this.c(this.C.f, this.C.g, 16, 16, \u2603, \u2603)) {
            this.a(bnq.a("inventory.binSlot", new Object[0]), \u2603, \u2603);
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.f();
    }
    
    @Override
    protected void a(final zx \u2603, final int \u2603, final int \u2603) {
        if (ayu.w == yz.g.a()) {
            final List<String> a = \u2603.a(this.j.h, this.j.t.y);
            yz c = \u2603.b().c();
            if (c == null && \u2603.b() == zy.cd) {
                final Map<Integer, Integer> a2 = ack.a(\u2603);
                if (a2.size() == 1) {
                    final aci c2 = aci.c(a2.keySet().iterator().next());
                    for (final yz yz : yz.a) {
                        if (yz.a(c2.C)) {
                            c = yz;
                            break;
                        }
                    }
                }
            }
            if (c != null) {
                a.add(1, "" + a.r + a.j + bnq.a(c.c(), new Object[0]));
            }
            for (int j = 0; j < a.size(); ++j) {
                if (j == 0) {
                    a.set(j, \u2603.u().e + a.get(j));
                }
                else {
                    a.set(j, a.h + a.get(j));
                }
            }
            this.a(a, \u2603, \u2603);
        }
        else {
            super.a(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        avc.c();
        final yz \u26032 = yz.a[ayu.w];
        for (final yz \u26033 : yz.a) {
            this.j.P().a(ayu.u);
            if (\u26033.a() != ayu.w) {
                this.a(\u26033);
            }
        }
        this.j.P().a(new jy("textures/gui/container/creative_inventory/tab_" + \u26032.g()));
        this.b(this.i, this.r, 0, 0, this.f, this.g);
        this.A.g();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final int \u26034 = this.i + 175;
        final int length = this.r + 18;
        final int i = length + 112;
        this.j.P().a(ayu.u);
        if (\u26032.j()) {
            this.b(\u26034, length + (int)((i - length - 17) * this.x), 232 + (this.i() ? 0 : 12), 0, 12, 15);
        }
        this.a(\u26032);
        if (\u26032 == yz.m) {
            azc.a(this.i + 43, this.r + 45, 20, (float)(this.i + 43 - \u2603), (float)(this.r + 45 - 30 - \u2603), this.j.h);
        }
    }
    
    protected boolean a(final yz \u2603, final int \u2603, final int \u2603) {
        final int l = \u2603.l();
        int n = 28 * l;
        int n2 = 0;
        if (l == 5) {
            n = this.f - 28 + 2;
        }
        else if (l > 0) {
            n += l;
        }
        if (\u2603.m()) {
            n2 -= 32;
        }
        else {
            n2 += this.g;
        }
        return \u2603 >= n && \u2603 <= n + 28 && \u2603 >= n2 && \u2603 <= n2 + 32;
    }
    
    protected boolean b(final yz \u2603, final int \u2603, final int \u2603) {
        final int l = \u2603.l();
        int n = 28 * l;
        int n2 = 0;
        if (l == 5) {
            n = this.f - 28 + 2;
        }
        else if (l > 0) {
            n += l;
        }
        if (\u2603.m()) {
            n2 -= 32;
        }
        else {
            n2 += this.g;
        }
        if (this.c(n + 3, n2 + 3, 23, 27, \u2603, \u2603)) {
            this.a(bnq.a(\u2603.c(), new Object[0]), \u2603, \u2603);
            return true;
        }
        return false;
    }
    
    protected void a(final yz \u2603) {
        final boolean b = \u2603.a() == ayu.w;
        final boolean m = \u2603.m();
        final int l = \u2603.l();
        final int \u26032 = l * 28;
        int \u26033 = 0;
        int \u26034 = this.i + 28 * l;
        int r = this.r;
        final int \u26035 = 32;
        if (b) {
            \u26033 += 32;
        }
        if (l == 5) {
            \u26034 = this.i + this.f - 28;
        }
        else if (l > 0) {
            \u26034 += l;
        }
        if (m) {
            r -= 28;
        }
        else {
            \u26033 += 64;
            r += this.g - 4;
        }
        bfl.f();
        this.b(\u26034, r, \u26032, \u26033, 28, \u26035);
        this.e = 100.0f;
        this.k.a = 100.0f;
        \u26034 += 6;
        r += 8 + (m ? 1 : -1);
        bfl.e();
        bfl.B();
        final zx d = \u2603.d();
        this.k.b(d, \u26034, r);
        this.k.a(this.q, d, \u26034, r);
        bfl.f();
        this.k.a = 0.0f;
        this.e = 0.0f;
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.j.a(new aye(this, this.j.h.x()));
        }
        if (\u2603.k == 1) {
            this.j.a(new ayf(this, this.j.h.x()));
        }
    }
    
    public int f() {
        return ayu.w;
    }
    
    static {
        u = new jy("textures/gui/container/creative_inventory/tabs.png");
        ayu.v = new oq("tmp", true, 45);
        ayu.w = yz.b.a();
    }
    
    static class a extends xi
    {
        public List<zx> a;
        
        public a(final wn \u2603) {
            this.a = (List<zx>)Lists.newArrayList();
            final wm bi = \u2603.bi;
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 9; ++j) {
                    this.a(new yg(ayu.v, i * 9 + j, 9 + j * 18, 18 + i * 18));
                }
            }
            for (int i = 0; i < 9; ++i) {
                this.a(new yg(bi, i, 9 + i * 18, 112));
            }
            this.a(0.0f);
        }
        
        @Override
        public boolean a(final wn \u2603) {
            return true;
        }
        
        public void a(final float \u2603) {
            final int n = (this.a.size() + 9 - 1) / 9 - 5;
            int n2 = (int)(\u2603 * n + 0.5);
            if (n2 < 0) {
                n2 = 0;
            }
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 9; ++j) {
                    final int n3 = j + (i + n2) * 9;
                    if (n3 >= 0 && n3 < this.a.size()) {
                        ayu.v.a(j + i * 9, this.a.get(n3));
                    }
                    else {
                        ayu.v.a(j + i * 9, null);
                    }
                }
            }
        }
        
        public boolean e() {
            return this.a.size() > 45;
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final boolean \u2603, final wn \u2603) {
        }
        
        @Override
        public zx b(final wn \u2603, final int \u2603) {
            if (\u2603 >= this.c.size() - 9 && \u2603 < this.c.size()) {
                final yg yg = this.c.get(\u2603);
                if (yg != null && yg.e()) {
                    yg.d(null);
                }
            }
            return null;
        }
        
        @Override
        public boolean a(final zx \u2603, final yg \u2603) {
            return \u2603.g > 90;
        }
        
        @Override
        public boolean b(final yg \u2603) {
            return \u2603.d instanceof wm || (\u2603.g > 90 && \u2603.f <= 162);
        }
    }
    
    class b extends yg
    {
        private final yg b;
        
        public b(final yg \u2603, final int \u2603) {
            super(\u2603.d, \u2603, 0, 0);
            this.b = \u2603;
        }
        
        @Override
        public void a(final wn \u2603, final zx \u2603) {
            this.b.a(\u2603, \u2603);
        }
        
        @Override
        public boolean a(final zx \u2603) {
            return this.b.a(\u2603);
        }
        
        @Override
        public zx d() {
            return this.b.d();
        }
        
        @Override
        public boolean e() {
            return this.b.e();
        }
        
        @Override
        public void d(final zx \u2603) {
            this.b.d(\u2603);
        }
        
        @Override
        public void f() {
            this.b.f();
        }
        
        @Override
        public int a() {
            return this.b.a();
        }
        
        @Override
        public int b(final zx \u2603) {
            return this.b.b(\u2603);
        }
        
        @Override
        public String c() {
            return this.b.c();
        }
        
        @Override
        public zx a(final int \u2603) {
            return this.b.a(\u2603);
        }
        
        @Override
        public boolean a(final og \u2603, final int \u2603) {
            return this.b.a(\u2603, \u2603);
        }
    }
}
