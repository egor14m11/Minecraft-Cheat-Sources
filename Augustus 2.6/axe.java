import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class axe extends axu implements awx
{
    private int a;
    private boolean f;
    
    public axe() {
        this.f = false;
    }
    
    @Override
    public void b() {
        this.n.clear();
        if (this.j.f.P().t()) {
            if (this.j.E()) {
                this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.deleteWorld", new Object[0])));
            }
            else {
                this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.leaveServer", new Object[0])));
            }
        }
        else {
            this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 72, bnq.a("deathScreen.respawn", new Object[0])));
            this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.titleScreen", new Object[0])));
            if (this.j.L() == null) {
                this.n.get(1).l = false;
            }
        }
        for (final avs avs : this.n) {
            avs.l = false;
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    protected void a(final avs \u2603) {
        switch (\u2603.k) {
            case 0: {
                this.j.h.cb();
                this.j.a((axu)null);
                break;
            }
            case 1: {
                if (this.j.f.P().t()) {
                    this.j.a(new aya());
                    break;
                }
                final awy \u26032 = new awy(this, bnq.a("deathScreen.quit.confirm", new Object[0]), "", bnq.a("deathScreen.titleScreen", new Object[0]), bnq.a("deathScreen.respawn", new Object[0]), 0);
                this.j.a(\u26032);
                \u26032.b(20);
                break;
            }
        }
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        if (\u2603) {
            this.j.f.H();
            this.j.a((bdb)null);
            this.j.a(new aya());
        }
        else {
            this.j.h.cb();
            this.j.a((axu)null);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.a(0, 0, this.l, this.m, 1615855616, -1602211792);
        bfl.E();
        bfl.a(2.0f, 2.0f, 2.0f);
        final boolean t = this.j.f.P().t();
        final String \u26032 = t ? bnq.a("deathScreen.title.hardcore", new Object[0]) : bnq.a("deathScreen.title", new Object[0]);
        this.a(this.q, \u26032, this.l / 2 / 2, 30, 16777215);
        bfl.F();
        if (t) {
            this.a(this.q, bnq.a("deathScreen.hardcoreInfo", new Object[0]), this.l / 2, 144, 16777215);
        }
        this.a(this.q, bnq.a("deathScreen.score", new Object[0]) + ": " + a.o + this.j.h.bX(), this.l / 2, 100, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void e() {
        super.e();
        ++this.a;
        if (this.a == 20) {
            for (final avs avs : this.n) {
                avs.l = true;
            }
        }
    }
}
