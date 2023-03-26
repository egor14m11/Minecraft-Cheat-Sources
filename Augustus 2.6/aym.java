import java.util.List;
import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class aym extends ayl implements xn
{
    private static final jy u;
    private xk v;
    private avw w;
    private wm x;
    
    public aym(final wm \u2603, final adm \u2603) {
        super(new xk(\u2603, \u2603, ave.A().h));
        this.x = \u2603;
        this.v = (xk)this.h;
    }
    
    @Override
    public void b() {
        super.b();
        Keyboard.enableRepeatEvents(true);
        final int n = (this.l - this.f) / 2;
        final int n2 = (this.m - this.g) / 2;
        (this.w = new avw(0, this.q, n + 62, n2 + 24, 103, 12)).g(-1);
        this.w.h(-1);
        this.w.a(false);
        this.w.f(30);
        this.h.b(this);
        this.h.a(this);
    }
    
    @Override
    public void m() {
        super.m();
        Keyboard.enableRepeatEvents(false);
        this.h.b(this);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        bfl.f();
        bfl.k();
        this.q.a(bnq.a("container.repair", new Object[0]), 60, 6, 4210752);
        if (this.v.a > 0) {
            int \u26032 = 8453920;
            boolean b = true;
            String \u26033 = bnq.a("container.repair.cost", this.v.a);
            if (this.v.a >= 40 && !this.j.h.bA.d) {
                \u26033 = bnq.a("container.repair.expensive", new Object[0]);
                \u26032 = 16736352;
            }
            else if (!this.v.a(2).e()) {
                b = false;
            }
            else if (!this.v.a(2).a(this.x.d)) {
                \u26032 = 16736352;
            }
            if (b) {
                final int \u26034 = 0xFF000000 | (\u26032 & 0xFCFCFC) >> 2 | (\u26032 & 0xFF000000);
                final int n = this.f - 8 - this.q.a(\u26033);
                final int n2 = 67;
                if (this.q.a()) {
                    avp.a(n - 3, n2 - 2, this.f - 7, n2 + 10, -16777216);
                    avp.a(n - 2, n2 - 1, this.f - 8, n2 + 9, -12895429);
                }
                else {
                    this.q.a(\u26033, n, n2 + 1, \u26034);
                    this.q.a(\u26033, n + 1, n2, \u26034);
                    this.q.a(\u26033, n + 1, n2 + 1, \u26034);
                }
                this.q.a(\u26033, n, n2, \u26032);
            }
        }
        bfl.e();
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (this.w.a(\u2603, \u2603)) {
            this.a();
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    private void a() {
        String b = this.w.b();
        final yg a = this.v.a(0);
        if (a != null && a.e() && !a.d().s() && b.equals(a.d().q())) {
            b = "";
        }
        this.v.a(b);
        this.j.h.a.a(new im("MC|ItemName", new em(Unpooled.buffer()).a(b)));
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.w.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        bfl.f();
        bfl.k();
        this.w.g();
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(aym.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        this.b(\u26032 + 59, \u26033 + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
        if ((this.v.a(0).e() || this.v.a(1).e()) && !this.v.a(2).e()) {
            this.b(\u26032 + 99, \u26033 + 45, this.f, 0, 28, 21);
        }
    }
    
    @Override
    public void a(final xi \u2603, final List<zx> \u2603) {
        this.a(\u2603, 0, \u2603.a(0).d());
    }
    
    @Override
    public void a(final xi \u2603, final int \u2603, final zx \u2603) {
        if (\u2603 == 0) {
            this.w.a((\u2603 == null) ? "" : \u2603.q());
            this.w.c(\u2603 != null);
            if (\u2603 != null) {
                this.a();
            }
        }
    }
    
    @Override
    public void a(final xi \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public void a(final xi \u2603, final og \u2603) {
    }
    
    static {
        u = new jy("textures/gui/container/anvil.png");
    }
}
