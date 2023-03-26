import java.util.Iterator;
import java.util.Collection;
import tv.twitch.chat.ChatUserSubscription;
import tv.twitch.chat.ChatUserMode;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;
import tv.twitch.chat.ChatUserInfo;

// 
// Decompiled by Procyon v0.5.36
// 

public class bab extends axu
{
    private static final a a;
    private static final a f;
    private static final a g;
    private final ChatUserInfo h;
    private final eu i;
    private final List<eu> r;
    private final bqm s;
    private int t;
    
    public bab(final bqm \u2603, final ChatUserInfo \u2603) {
        this.r = (List<eu>)Lists.newArrayList();
        this.s = \u2603;
        this.h = \u2603;
        this.i = new fa(\u2603.displayName);
        this.r.addAll(a(\u2603.modes, \u2603.subscriptions, \u2603));
    }
    
    public static List<eu> a(final Set<ChatUserMode> \u2603, final Set<ChatUserSubscription> \u2603, final bqm \u2603) {
        final String s = (\u2603 == null) ? null : \u2603.z();
        final boolean b = \u2603 != null && \u2603.y();
        final List<eu> arrayList = (List<eu>)Lists.newArrayList();
        for (final ChatUserMode \u26032 : \u2603) {
            final eu eu = a(\u26032, s, b);
            if (eu != null) {
                final eu eu2 = new fa("- ");
                eu2.a(eu);
                arrayList.add(eu2);
            }
        }
        for (final ChatUserSubscription \u26033 : \u2603) {
            final eu eu = a(\u26033, s, b);
            if (eu != null) {
                final eu eu2 = new fa("- ");
                eu2.a(eu);
                arrayList.add(eu2);
            }
        }
        return arrayList;
    }
    
    public static eu a(final ChatUserSubscription \u2603, final String \u2603, final boolean \u2603) {
        eu eu = null;
        if (\u2603 == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            if (\u2603 == null) {
                eu = new fb("stream.user.subscription.subscriber", new Object[0]);
            }
            else if (\u2603) {
                eu = new fb("stream.user.subscription.subscriber.self", new Object[0]);
            }
            else {
                eu = new fb("stream.user.subscription.subscriber.other", new Object[] { \u2603 });
            }
            eu.b().a(bab.a);
        }
        else if (\u2603 == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            eu = new fb("stream.user.subscription.turbo", new Object[0]);
            eu.b().a(bab.g);
        }
        return eu;
    }
    
    public static eu a(final ChatUserMode \u2603, final String \u2603, final boolean \u2603) {
        eu eu = null;
        if (\u2603 == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            eu = new fb("stream.user.mode.administrator", new Object[0]);
            eu.b().a(bab.g);
        }
        else if (\u2603 == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            if (\u2603 == null) {
                eu = new fb("stream.user.mode.banned", new Object[0]);
            }
            else if (\u2603) {
                eu = new fb("stream.user.mode.banned.self", new Object[0]);
            }
            else {
                eu = new fb("stream.user.mode.banned.other", new Object[] { \u2603 });
            }
            eu.b().a(bab.f);
        }
        else if (\u2603 == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            if (\u2603 == null) {
                eu = new fb("stream.user.mode.broadcaster", new Object[0]);
            }
            else if (\u2603) {
                eu = new fb("stream.user.mode.broadcaster.self", new Object[0]);
            }
            else {
                eu = new fb("stream.user.mode.broadcaster.other", new Object[0]);
            }
            eu.b().a(bab.a);
        }
        else if (\u2603 == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            if (\u2603 == null) {
                eu = new fb("stream.user.mode.moderator", new Object[0]);
            }
            else if (\u2603) {
                eu = new fb("stream.user.mode.moderator.self", new Object[0]);
            }
            else {
                eu = new fb("stream.user.mode.moderator.other", new Object[] { \u2603 });
            }
            eu.b().a(bab.a);
        }
        else if (\u2603 == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            eu = new fb("stream.user.mode.staff", new Object[0]);
            eu.b().a(bab.g);
        }
        return eu;
    }
    
    @Override
    public void b() {
        final int n = this.l / 3;
        final int n2 = n - 130;
        this.n.add(new avs(1, n * 0 + n2 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.timeout", new Object[0])));
        this.n.add(new avs(0, n * 1 + n2 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.ban", new Object[0])));
        this.n.add(new avs(2, n * 2 + n2 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.mod", new Object[0])));
        this.n.add(new avs(5, n * 0 + n2 / 2, this.m - 45, 130, 20, bnq.a("gui.cancel", new Object[0])));
        this.n.add(new avs(3, n * 1 + n2 / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unban", new Object[0])));
        this.n.add(new avs(4, n * 2 + n2 / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unmod", new Object[0])));
        int max = 0;
        for (final eu eu : this.r) {
            max = Math.max(max, this.q.a(eu.d()));
        }
        this.t = this.l / 2 - max / 2;
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 0) {
            this.s.f("/ban " + this.h.displayName);
        }
        else if (\u2603.k == 3) {
            this.s.f("/unban " + this.h.displayName);
        }
        else if (\u2603.k == 2) {
            this.s.f("/mod " + this.h.displayName);
        }
        else if (\u2603.k == 4) {
            this.s.f("/unmod " + this.h.displayName);
        }
        else if (\u2603.k == 1) {
            this.s.f("/timeout " + this.h.displayName);
        }
        this.j.a((axu)null);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.i.c(), this.l / 2, 70, 16777215);
        int \u26032 = 80;
        for (final eu eu : this.r) {
            this.c(this.q, eu.d(), this.t, \u26032, 16777215);
            \u26032 += this.q.a;
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = a.c;
        f = a.m;
        g = a.f;
    }
}
