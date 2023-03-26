import net.minecraft.realms.RealmsBridge;

// 
// Decompiled by Procyon v0.5.36
// 

public class axp extends axu
{
    private int a;
    private int f;
    
    @Override
    public void b() {
        this.a = 0;
        this.n.clear();
        final int n = -16;
        final int n2 = 98;
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + n, bnq.a("menu.returnToMenu", new Object[0])));
        if (!this.j.E()) {
            this.n.get(0).j = bnq.a("menu.disconnect", new Object[0]);
        }
        this.n.add(new avs(4, this.l / 2 - 100, this.m / 4 + 24 + n, bnq.a("menu.returnToGame", new Object[0])));
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + n, 98, 20, bnq.a("menu.options", new Object[0])));
        final avs avs;
        this.n.add(avs = new avs(7, this.l / 2 + 2, this.m / 4 + 96 + n, 98, 20, bnq.a("menu.shareToLan", new Object[0])));
        this.n.add(new avs(5, this.l / 2 - 100, this.m / 4 + 48 + n, 98, 20, bnq.a("gui.achievements", new Object[0])));
        this.n.add(new avs(6, this.l / 2 + 2, this.m / 4 + 48 + n, 98, 20, bnq.a("gui.stats", new Object[0])));
        avs.l = (this.j.F() && !this.j.G().b());
    }
    
    @Override
    protected void a(final avs \u2603) {
        switch (\u2603.k) {
            case 0: {
                this.j.a(new axn(this, this.j.t));
                break;
            }
            case 1: {
                final boolean e = this.j.E();
                final boolean al = this.j.al();
                \u2603.l = false;
                this.j.f.H();
                this.j.a((bdb)null);
                if (e) {
                    this.j.a(new aya());
                    break;
                }
                if (al) {
                    final RealmsBridge realmsBridge = new RealmsBridge();
                    realmsBridge.switchToRealms((axu)new aya());
                    break;
                }
                this.j.a(new azh(new aya()));
                break;
            }
            case 4: {
                this.j.a((axu)null);
                this.j.n();
                break;
            }
            case 5: {
                this.j.a(new aye(this, this.j.h.x()));
                break;
            }
            case 6: {
                this.j.a(new ayf(this, this.j.h.x()));
                break;
            }
            case 7: {
                this.j.a(new axw(this));
                break;
            }
        }
    }
    
    @Override
    public void e() {
        super.e();
        ++this.f;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("menu.game", new Object[0]), this.l / 2, 40, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
}
