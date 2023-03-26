import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bd extends j implements h
{
    public bd() {
        this.a(new br());
        this.a(new ah());
        this.a(new ag());
        this.a(new y());
        this.a(new am());
        this.a(new bt());
        this.a(new bv());
        this.a(new ae());
        this.a(new bn());
        this.a(new aj());
        this.a(new ax());
        this.a(new bk());
        this.a(new z());
        this.a(new ab());
        this.a(new au());
        this.a(new aa());
        this.a(new bi());
        this.a(new ak());
        this.a(new x());
        this.a(new ap());
        this.a(new bb());
        this.a(new bh());
        this.a(new bf());
        this.a(new ai());
        this.a(new t());
        this.a(new bq());
        this.a(new bj());
        this.a(new av());
        this.a(new bc());
        this.a(new ad());
        this.a(new bu());
        this.a(new p());
        this.a(new bm());
        this.a(new be());
        this.a(new af());
        this.a(new u());
        this.a(new v());
        this.a(new s());
        this.a(new bp());
        this.a(new aq());
        this.a(new bx());
        this.a(new bs());
        this.a(new ac());
        if (MinecraftServer.N().ae()) {
            this.a(new ar());
            this.a(new w());
            this.a(new bl());
            this.a(new ay());
            this.a(new az());
            this.a(new ba());
            this.a(new q());
            this.a(new as());
            this.a(new r());
            this.a(new an());
            this.a(new at());
            this.a(new al());
            this.a(new ao());
            this.a(new bw());
            this.a(new bg());
        }
        else {
            this.a(new aw());
        }
        i.a(this);
    }
    
    @Override
    public void a(final m \u2603, final k \u2603, final int \u2603, final String \u2603, final Object... \u2603) {
        boolean b = true;
        final MinecraftServer n = MinecraftServer.N();
        if (!\u2603.u_()) {
            b = false;
        }
        final eu \u26032 = new fb("chat.type.admin", new Object[] { \u2603.e_(), new fb(\u2603, \u2603) });
        \u26032.b().a(a.h);
        \u26032.b().b(true);
        if (b) {
            for (final wn wn : n.ap().v()) {
                if (wn != \u2603 && n.ap().h(wn.cd()) && \u2603.a(\u2603)) {
                    final boolean b2 = \u2603 instanceof MinecraftServer && MinecraftServer.N().r();
                    final boolean b3 = \u2603 instanceof mj && MinecraftServer.N().q();
                    if (!b2 && !b3 && (\u2603 instanceof mj || \u2603 instanceof MinecraftServer)) {
                        continue;
                    }
                    wn.a(\u26032);
                }
            }
        }
        if (\u2603 != n && n.d[0].Q().b("logAdminCommands")) {
            n.a(\u26032);
        }
        boolean b4 = n.d[0].Q().b("sendCommandFeedback");
        if (\u2603 instanceof adc) {
            b4 = ((adc)\u2603).m();
        }
        if (((\u2603 & 0x1) != 0x1 && b4) || \u2603 instanceof MinecraftServer) {
            \u2603.a(new fb(\u2603, \u2603));
        }
    }
}
