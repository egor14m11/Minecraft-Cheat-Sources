// 
// Decompiled by Procyon v0.5.36
// 

public class axw extends axu
{
    private final axu a;
    private avs f;
    private avs g;
    private String h;
    private boolean i;
    
    public axw(final axu \u2603) {
        this.h = "survival";
        this.a = \u2603;
    }
    
    @Override
    public void b() {
        this.n.clear();
        this.n.add(new avs(101, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("lanServer.start", new Object[0])));
        this.n.add(new avs(102, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
        this.n.add(this.g = new avs(104, this.l / 2 - 155, 100, 150, 20, bnq.a("selectWorld.gameMode", new Object[0])));
        this.n.add(this.f = new avs(103, this.l / 2 + 5, 100, 150, 20, bnq.a("selectWorld.allowCommands", new Object[0])));
        this.a();
    }
    
    private void a() {
        this.g.j = bnq.a("selectWorld.gameMode", new Object[0]) + " " + bnq.a("selectWorld.gameMode." + this.h, new Object[0]);
        this.f.j = bnq.a("selectWorld.allowCommands", new Object[0]) + " ";
        if (this.i) {
            final StringBuilder sb = new StringBuilder();
            final avs f = this.f;
            f.j = sb.append(f.j).append(bnq.a("options.on", new Object[0])).toString();
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            final avs f2 = this.f;
            f2.j = sb2.append(f2.j).append(bnq.a("options.off", new Object[0])).toString();
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 102) {
            this.j.a(this.a);
        }
        else if (\u2603.k == 104) {
            if (this.h.equals("spectator")) {
                this.h = "creative";
            }
            else if (this.h.equals("creative")) {
                this.h = "adventure";
            }
            else if (this.h.equals("adventure")) {
                this.h = "survival";
            }
            else {
                this.h = "spectator";
            }
            this.a();
        }
        else if (\u2603.k == 103) {
            this.i = !this.i;
            this.a();
        }
        else if (\u2603.k == 101) {
            this.j.a((axu)null);
            final String a = this.j.G().a(adp.a.a(this.h), this.i);
            eu \u26032;
            if (a != null) {
                \u26032 = new fb("commands.publish.started", new Object[] { a });
            }
            else {
                \u26032 = new fa("commands.publish.failed");
            }
            this.j.q.d().a(\u26032);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("lanServer.title", new Object[0]), this.l / 2, 50, 16777215);
        this.a(this.q, bnq.a("lanServer.otherPlayers", new Object[0]), this.l / 2, 82, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
}
