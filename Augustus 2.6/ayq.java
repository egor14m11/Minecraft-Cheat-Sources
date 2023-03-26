import org.apache.logging.log4j.LogManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayq extends axu
{
    private static final Logger a;
    private avw f;
    private avw g;
    private final adc h;
    private avs i;
    private avs r;
    private avs s;
    private boolean t;
    
    public ayq(final adc \u2603) {
        this.h = \u2603;
    }
    
    @Override
    public void e() {
        this.f.a();
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        this.n.add(this.i = new avs(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, bnq.a("gui.done", new Object[0])));
        this.n.add(this.r = new avs(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, bnq.a("gui.cancel", new Object[0])));
        this.n.add(this.s = new avs(4, this.l / 2 + 150 - 20, 150, 20, 20, "O"));
        (this.f = new avw(2, this.q, this.l / 2 - 150, 50, 300, 20)).f(32767);
        this.f.b(true);
        this.f.a(this.h.l());
        (this.g = new avw(3, this.q, this.l / 2 - 150, 150, 276, 20)).f(32767);
        this.g.c(false);
        this.g.a("-");
        this.t = this.h.m();
        this.a();
        this.i.l = (this.f.b().trim().length() > 0);
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 1) {
            this.h.a(this.t);
            this.j.a((axu)null);
        }
        else if (\u2603.k == 0) {
            final em \u26032 = new em(Unpooled.buffer());
            \u26032.writeByte(this.h.i());
            this.h.a(\u26032);
            \u26032.a(this.f.b());
            \u26032.writeBoolean(this.h.m());
            this.j.u().a(new im("MC|AdvCdm", \u26032));
            if (!this.h.m()) {
                this.h.b((eu)null);
            }
            this.j.a((axu)null);
        }
        else if (\u2603.k == 4) {
            this.h.a(!this.h.m());
            this.a();
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        this.f.a(\u2603, \u2603);
        this.g.a(\u2603, \u2603);
        this.i.l = (this.f.b().trim().length() > 0);
        if (\u2603 == 28 || \u2603 == 156) {
            this.a(this.i);
        }
        else if (\u2603 == 1) {
            this.a(this.r);
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.f.a(\u2603, \u2603, \u2603);
        this.g.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("advMode.setCommand", new Object[0]), this.l / 2, 20, 16777215);
        this.c(this.q, bnq.a("advMode.command", new Object[0]), this.l / 2 - 150, 37, 10526880);
        this.f.g();
        int \u26032 = 75;
        int n = 0;
        this.c(this.q, bnq.a("advMode.nearestPlayer", new Object[0]), this.l / 2 - 150, \u26032 + n++ * this.q.a, 10526880);
        this.c(this.q, bnq.a("advMode.randomPlayer", new Object[0]), this.l / 2 - 150, \u26032 + n++ * this.q.a, 10526880);
        this.c(this.q, bnq.a("advMode.allPlayers", new Object[0]), this.l / 2 - 150, \u26032 + n++ * this.q.a, 10526880);
        this.c(this.q, bnq.a("advMode.allEntities", new Object[0]), this.l / 2 - 150, \u26032 + n++ * this.q.a, 10526880);
        this.c(this.q, "", this.l / 2 - 150, \u26032 + n++ * this.q.a, 10526880);
        if (this.g.b().length() > 0) {
            \u26032 += n * this.q.a + 16;
            this.c(this.q, bnq.a("advMode.previousOutput", new Object[0]), this.l / 2 - 150, \u26032, 10526880);
            this.g.g();
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    private void a() {
        if (this.h.m()) {
            this.s.j = "O";
            if (this.h.k() != null) {
                this.g.a(this.h.k().c());
            }
        }
        else {
            this.s.j = "X";
            this.g.a("-");
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
