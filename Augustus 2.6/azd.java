import org.apache.logging.log4j.LogManager;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class azd extends ayl
{
    private static final Logger u;
    private static final jy v;
    private acy w;
    private a x;
    private a y;
    private int z;
    private eu A;
    
    public azd(final wm \u2603, final acy \u2603, final adm \u2603) {
        super(new yb(\u2603, \u2603, \u2603));
        this.w = \u2603;
        this.A = \u2603.f_();
    }
    
    @Override
    public void b() {
        super.b();
        final int n = (this.l - this.f) / 2;
        final int n2 = (this.m - this.g) / 2;
        this.n.add(this.x = new a(1, n + 120 + 27, n2 + 24 - 1, true));
        this.n.add(this.y = new a(2, n + 36 - 19, n2 + 24 - 1, false));
        this.x.l = false;
        this.y.l = false;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        final String c = this.A.c();
        this.q.a(c, this.f / 2 - this.q.a(c) / 2, 6, 4210752);
        this.q.a(bnq.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    public void e() {
        super.e();
        final ada b_ = this.w.b_(this.j.h);
        if (b_ != null) {
            this.x.l = (this.z < b_.size() - 1);
            this.y.l = (this.z > 0);
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        boolean b = false;
        if (\u2603 == this.x) {
            ++this.z;
            final ada b_ = this.w.b_(this.j.h);
            if (b_ != null && this.z >= b_.size()) {
                this.z = b_.size() - 1;
            }
            b = true;
        }
        else if (\u2603 == this.y) {
            --this.z;
            if (this.z < 0) {
                this.z = 0;
            }
            b = true;
        }
        if (b) {
            ((yb)this.h).d(this.z);
            final em \u26032 = new em(Unpooled.buffer());
            \u26032.writeInt(this.z);
            this.j.u().a(new im("MC|TrSel", \u26032));
        }
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(azd.v);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        final ada b_ = this.w.b_(this.j.h);
        if (b_ != null && !b_.isEmpty()) {
            final int z = this.z;
            if (z < 0 || z >= b_.size()) {
                return;
            }
            final acz acz = b_.get(z);
            if (acz.h()) {
                this.j.P().a(azd.v);
                bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
                bfl.f();
                this.b(this.i + 83, this.r + 21, 212, 0, 28, 21);
                this.b(this.i + 83, this.r + 51, 212, 0, 28, 21);
            }
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        final ada b_ = this.w.b_(this.j.h);
        if (b_ != null && !b_.isEmpty()) {
            final int n = (this.l - this.f) / 2;
            final int n2 = (this.m - this.g) / 2;
            final int z = this.z;
            final acz acz = b_.get(z);
            final zx a = acz.a();
            final zx b = acz.b();
            final zx d = acz.d();
            bfl.E();
            avc.c();
            bfl.f();
            bfl.B();
            bfl.g();
            bfl.e();
            this.k.a = 100.0f;
            this.k.b(a, n + 36, n2 + 24);
            this.k.a(this.q, a, n + 36, n2 + 24);
            if (b != null) {
                this.k.b(b, n + 62, n2 + 24);
                this.k.a(this.q, b, n + 62, n2 + 24);
            }
            this.k.b(d, n + 120, n2 + 24);
            this.k.a(this.q, d, n + 120, n2 + 24);
            this.k.a = 0.0f;
            bfl.f();
            if (this.c(36, 24, 16, 16, \u2603, \u2603) && a != null) {
                this.a(a, \u2603, \u2603);
            }
            else if (b != null && this.c(62, 24, 16, 16, \u2603, \u2603) && b != null) {
                this.a(b, \u2603, \u2603);
            }
            else if (d != null && this.c(120, 24, 16, 16, \u2603, \u2603) && d != null) {
                this.a(d, \u2603, \u2603);
            }
            else if (acz.h() && (this.c(83, 21, 28, 21, \u2603, \u2603) || this.c(83, 51, 28, 21, \u2603, \u2603))) {
                this.a(bnq.a("merchant.deprecated", new Object[0]), \u2603, \u2603);
            }
            bfl.F();
            bfl.e();
            bfl.j();
            avc.b();
        }
    }
    
    public acy a() {
        return this.w;
    }
    
    static {
        u = LogManager.getLogger();
        v = new jy("textures/gui/container/villager.png");
    }
    
    static class a extends avs
    {
        private final boolean o;
        
        public a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            super(\u2603, \u2603, \u2603, 12, 19, "");
            this.o = \u2603;
        }
        
        @Override
        public void a(final ave \u2603, final int \u2603, final int \u2603) {
            if (!this.m) {
                return;
            }
            \u2603.P().a(azd.v);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            final boolean b = \u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g;
            int \u26032 = 0;
            int \u26033 = 176;
            if (!this.l) {
                \u26033 += this.f * 2;
            }
            else if (b) {
                \u26033 += this.f;
            }
            if (!this.o) {
                \u26032 += this.g;
            }
            this.b(this.h, this.i, \u26033, \u26032, this.f, this.g);
        }
    }
}
