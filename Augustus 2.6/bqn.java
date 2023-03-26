import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import tv.twitch.chat.ChatTokenizedMessage;
import java.util.Iterator;
import tv.twitch.chat.ChatUserSubscription;
import tv.twitch.chat.ChatUserMode;
import java.util.Set;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import org.lwjgl.opengl.GL11;
import com.google.gson.JsonObject;
import java.io.IOException;
import tv.twitch.AuthToken;
import com.google.gson.JsonParser;
import java.net.URL;
import java.net.URLEncoder;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.mojang.authlib.properties.Property;
import tv.twitch.chat.ChatUserInfo;
import java.util.Map;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqn implements bqj.b, bqk.e, bql.a, bqm
{
    private static final Logger b;
    public static final Marker a;
    private final bqj c;
    private final bqk d;
    private String e;
    private final ave f;
    private final eu g;
    private final Map<String, ChatUserInfo> h;
    private bfw i;
    private boolean j;
    private int k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private bqm.a q;
    private static boolean r;
    
    public bqn(final ave \u2603, final Property \u2603) {
        this.g = new fa("Twitch");
        this.h = (Map<String, ChatUserInfo>)Maps.newHashMap();
        this.k = 30;
        this.l = 0L;
        this.m = false;
        this.q = bqm.a.a;
        this.f = \u2603;
        this.c = new bqj();
        this.d = new bqk();
        this.c.a(this);
        this.d.a(this);
        this.c.a("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.d.a("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.g.b().a(a.f);
        if (\u2603 != null && !Strings.isNullOrEmpty(\u2603.getValue()) && bqs.l) {
            final Thread thread = new Thread("Twitch authenticator") {
                @Override
                public void run() {
                    try {
                        final URL \u2603 = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(\u2603.getValue(), "UTF-8"));
                        final String a = nj.a(\u2603);
                        final JsonObject l = ni.l(new JsonParser().parse(a), "Response");
                        final JsonObject s = ni.s(l, "token");
                        if (ni.i(s, "valid")) {
                            final String h = ni.h(s, "user_name");
                            bqn.b.debug(bqn.a, "Authenticated with twitch; username is {}", new Object[] { h });
                            final AuthToken authToken = new AuthToken();
                            authToken.data = \u2603.getValue();
                            bqn.this.c.a(h, authToken);
                            bqn.this.d.c(h);
                            bqn.this.d.a(authToken);
                            Runtime.getRuntime().addShutdownHook(new Thread("Twitch shutdown hook") {
                                @Override
                                public void run() {
                                    bqn.this.f();
                                }
                            });
                            bqn.this.c.C();
                            bqn.this.d.n();
                        }
                        else {
                            bqn.this.q = bqm.a.b;
                            bqn.b.error(bqn.a, "Given twitch access token is invalid");
                        }
                    }
                    catch (IOException throwable) {
                        bqn.this.q = bqm.a.a;
                        bqn.b.error(bqn.a, "Could not authenticate with twitch", throwable);
                    }
                }
            };
            thread.setDaemon(true);
            thread.start();
        }
    }
    
    @Override
    public void f() {
        bqn.b.debug(bqn.a, "Shutdown streaming");
        this.c.E();
        this.d.p();
    }
    
    @Override
    public void g() {
        final int s = this.f.t.S;
        final boolean b = this.e != null && this.d.d(this.e);
        final boolean b2 = this.d.h() == bqk.c.c && (this.e == null || this.d.e(this.e) == bqk.a.e);
        if (s == 2) {
            if (b) {
                bqn.b.debug(bqn.a, "Disconnecting from twitch chat per user options");
                this.d.l(this.e);
            }
        }
        else if (s == 1) {
            if (b2 && this.c.q()) {
                bqn.b.debug(bqn.a, "Connecting to twitch chat per user options");
                this.F();
            }
        }
        else if (s == 0) {
            if (b && !this.k()) {
                bqn.b.debug(bqn.a, "Disconnecting from twitch chat as user is no longer streaming");
                this.d.l(this.e);
            }
            else if (b2 && this.k()) {
                bqn.b.debug(bqn.a, "Connecting to twitch chat as user is streaming");
                this.F();
            }
        }
        this.c.K();
        this.d.q();
    }
    
    protected void F() {
        final bqk.c h = this.d.h();
        final String name = this.c.l().name;
        this.e = name;
        if (h != bqk.c.c) {
            bqn.b.warn("Invalid twitch chat state {}", new Object[] { h });
        }
        else if (this.d.e(this.e) == bqk.a.e) {
            this.d.j(name);
        }
        else {
            bqn.b.warn("Invalid twitch chat state {}", new Object[] { h });
        }
    }
    
    @Override
    public void h() {
        if (!this.c.m() || this.c.p()) {
            return;
        }
        final long nanoTime = System.nanoTime();
        final long n = 1000000000 / this.k;
        final long n2 = nanoTime - this.l;
        final boolean b = n2 >= n;
        if (b) {
            final FrameBuffer q = this.c.Q();
            final bfw b2 = this.f.b();
            this.i.a(true);
            bfl.n(5889);
            bfl.E();
            bfl.D();
            bfl.a(0.0, this.i.c, this.i.d, 0.0, 1000.0, 3000.0);
            bfl.n(5888);
            bfl.E();
            bfl.D();
            bfl.b(0.0f, 0.0f, -2000.0f);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            bfl.b(0, 0, this.i.c, this.i.d);
            bfl.w();
            bfl.c();
            bfl.k();
            final float n3 = (float)this.i.c;
            final float n4 = (float)this.i.d;
            final float n5 = b2.c / (float)b2.a;
            final float n6 = b2.d / (float)b2.b;
            b2.c();
            GL11.glTexParameterf(3553, 10241, 9729.0f);
            GL11.glTexParameterf(3553, 10240, 9729.0f);
            final bfx a = bfx.a();
            final bfd c = a.c();
            c.a(7, bms.g);
            c.b(0.0, n4, 0.0).a(0.0, n6).d();
            c.b(n3, n4, 0.0).a(n5, n6).d();
            c.b(n3, 0.0, 0.0).a(n5, 0.0).d();
            c.b(0.0, 0.0, 0.0).a(0.0, 0.0).d();
            a.b();
            b2.d();
            bfl.F();
            bfl.n(5889);
            bfl.F();
            bfl.n(5888);
            this.c.a(q);
            this.i.e();
            this.c.b(q);
            this.l = nanoTime;
        }
    }
    
    @Override
    public boolean i() {
        return this.c.q();
    }
    
    @Override
    public boolean j() {
        return this.c.n();
    }
    
    @Override
    public boolean k() {
        return this.c.m();
    }
    
    @Override
    public void a(final bqh \u2603, final long \u2603) {
        if (!this.k() || !this.j) {
            return;
        }
        final long x = this.c.x();
        if (!this.c.a(\u2603.c(), x + \u2603, \u2603.a(), \u2603.b())) {
            bqn.b.warn(bqn.a, "Couldn't send stream metadata action at {}: {}", new Object[] { x + \u2603, \u2603 });
        }
        else {
            bqn.b.debug(bqn.a, "Sent stream metadata action at {}: {}", new Object[] { x + \u2603, \u2603 });
        }
    }
    
    @Override
    public void a(final bqh \u2603, final long \u2603, final long \u2603) {
        if (!this.k() || !this.j) {
            return;
        }
        final long x = this.c.x();
        final String a = \u2603.a();
        final String b = \u2603.b();
        final long b2 = this.c.b(\u2603.c(), x + \u2603, a, b);
        if (b2 < 0L) {
            bqn.b.warn(bqn.a, "Could not send stream metadata sequence from {} to {}: {}", new Object[] { x + \u2603, x + \u2603, \u2603 });
        }
        else if (this.c.a(\u2603.c(), x + \u2603, b2, a, b)) {
            bqn.b.debug(bqn.a, "Sent stream metadata sequence from {} to {}: {}", new Object[] { x + \u2603, x + \u2603, \u2603 });
        }
        else {
            bqn.b.warn(bqn.a, "Half-sent stream metadata sequence from {} to {}: {}", new Object[] { x + \u2603, x + \u2603, \u2603 });
        }
    }
    
    @Override
    public boolean l() {
        return this.c.p();
    }
    
    @Override
    public void m() {
        if (this.c.G()) {
            bqn.b.debug(bqn.a, "Requested commercial from Twitch");
        }
        else {
            bqn.b.warn(bqn.a, "Could not request commercial from Twitch");
        }
    }
    
    @Override
    public void n() {
        this.c.I();
        this.o = true;
        this.p();
    }
    
    @Override
    public void o() {
        this.c.J();
        this.o = false;
        this.p();
    }
    
    @Override
    public void p() {
        if (this.k()) {
            final float m = this.f.t.M;
            final boolean b = this.o || m <= 0.0f;
            this.c.b(b ? 0.0f : m);
            this.c.a(this.D() ? 0.0f : this.f.t.L);
        }
    }
    
    @Override
    public void q() {
        final avh t = this.f.t;
        final VideoParams a = this.c.a(b(t.N), a(t.O), c(t.K), this.f.d / (float)this.f.e);
        switch (t.P) {
            case 2: {
                a.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
                break;
            }
            case 1: {
                a.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                break;
            }
            case 0: {
                a.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                break;
            }
        }
        if (this.i == null) {
            this.i = new bfw(a.outputWidth, a.outputHeight, false);
        }
        else {
            this.i.a(a.outputWidth, a.outputHeight);
        }
        if (t.R != null && t.R.length() > 0) {
            for (final IngestServer \u2603 : this.s()) {
                if (\u2603.serverUrl.equals(t.R)) {
                    this.c.a(\u2603);
                    break;
                }
            }
        }
        this.k = a.targetFps;
        this.j = t.Q;
        this.c.a(a);
        bqn.b.info(bqn.a, "Streaming at {}/{} at {} kbps to {}", new Object[] { a.outputWidth, a.outputHeight, a.maxKbps, this.c.s().serverUrl });
        this.c.a(null, "Minecraft", null);
    }
    
    @Override
    public void r() {
        if (this.c.H()) {
            bqn.b.info(bqn.a, "Stopped streaming to Twitch");
        }
        else {
            bqn.b.warn(bqn.a, "Could not stop streaming to Twitch");
        }
    }
    
    @Override
    public void a(final ErrorCode \u2603, final AuthToken \u2603) {
    }
    
    @Override
    public void a(final ErrorCode \u2603) {
        if (ErrorCode.succeeded(\u2603)) {
            bqn.b.debug(bqn.a, "Login attempt successful");
            this.n = true;
        }
        else {
            bqn.b.warn(bqn.a, "Login attempt unsuccessful: {} (error code {})", new Object[] { ErrorCode.getString(\u2603), \u2603.getValue() });
            this.n = false;
        }
    }
    
    @Override
    public void a(final ErrorCode \u2603, final GameInfo[] \u2603) {
    }
    
    @Override
    public void a(final bqj.a \u2603) {
        bqn.b.debug(bqn.a, "Broadcast state changed to {}", new Object[] { \u2603 });
        if (\u2603 == bqj.a.b) {
            this.c.a(bqj.a.d);
        }
    }
    
    @Override
    public void a() {
        bqn.b.info(bqn.a, "Logged out of twitch");
    }
    
    @Override
    public void a(final StreamInfo \u2603) {
        bqn.b.debug(bqn.a, "Stream info updated; {} viewers on stream ID {}", new Object[] { \u2603.viewers, \u2603.streamId });
    }
    
    @Override
    public void a(final IngestList \u2603) {
    }
    
    @Override
    public void b(final ErrorCode \u2603) {
        bqn.b.warn(bqn.a, "Issue submitting frame: {} (Error code {})", new Object[] { ErrorCode.getString(\u2603), \u2603.getValue() });
        this.f.q.d().a(new fa("Issue streaming frame: " + \u2603 + " (" + ErrorCode.getString(\u2603) + ")"), 2);
    }
    
    @Override
    public void b() {
        this.p();
        bqn.b.info(bqn.a, "Broadcast to Twitch has started");
    }
    
    @Override
    public void c() {
        bqn.b.info(bqn.a, "Broadcast to Twitch has stopped");
    }
    
    @Override
    public void c(final ErrorCode \u2603) {
        if (\u2603 == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
            final eu \u26032 = new fb("stream.unavailable.soundflower.chat.link", new Object[0]);
            \u26032.b().a(new et(et.a.a, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
            \u26032.b().d(true);
            final eu \u26033 = new fb("stream.unavailable.soundflower.chat", new Object[] { \u26032 });
            \u26033.b().a(a.e);
            this.f.q.d().a(\u26033);
        }
        else {
            final eu \u26032 = new fb("stream.unavailable.unknown.chat", new Object[] { ErrorCode.getString(\u2603) });
            \u26032.b().a(a.e);
            this.f.q.d().a(\u26032);
        }
    }
    
    @Override
    public void a(final bql \u2603, final bql.b \u2603) {
        bqn.b.debug(bqn.a, "Ingest test state changed to {}", new Object[] { \u2603 });
        if (\u2603 == bql.b.f) {
            this.m = true;
        }
    }
    
    public static int a(final float \u2603) {
        return ns.d(10.0f + \u2603 * 50.0f);
    }
    
    public static int b(final float \u2603) {
        return ns.d(230.0f + \u2603 * 3270.0f);
    }
    
    public static float c(final float \u2603) {
        return 0.1f + \u2603 * 0.1f;
    }
    
    @Override
    public IngestServer[] s() {
        return this.c.t().getServers();
    }
    
    @Override
    public void u() {
        final bql m = this.c.M();
        if (m != null) {
            m.a(this);
        }
    }
    
    @Override
    public bql v() {
        return this.c.w();
    }
    
    @Override
    public boolean w() {
        return this.c.o();
    }
    
    @Override
    public int x() {
        return this.k() ? this.c.j().viewers : 0;
    }
    
    @Override
    public void d(final ErrorCode \u2603) {
        if (ErrorCode.failed(\u2603)) {
            bqn.b.error(bqn.a, "Chat failed to initialize");
        }
    }
    
    @Override
    public void e(final ErrorCode \u2603) {
        if (ErrorCode.failed(\u2603)) {
            bqn.b.error(bqn.a, "Chat failed to shutdown");
        }
    }
    
    @Override
    public void a(final bqk.c \u2603) {
    }
    
    @Override
    public void a(final String \u2603, final ChatRawMessage[] \u2603) {
        for (final ChatRawMessage \u26032 : \u2603) {
            this.a(\u26032.userName, \u26032);
            if (this.a(\u26032.modes, \u26032.subscriptions, this.f.t.T)) {
                final eu eu = new fa(\u26032.userName);
                final eu \u26033 = new fb("chat.stream." + (\u26032.action ? "emote" : "text"), new Object[] { this.g, eu, a.a(\u26032.message) });
                if (\u26032.action) {
                    \u26033.b().b(true);
                }
                final eu \u26034 = new fa("");
                \u26034.a(new fb("stream.userinfo.chatTooltip", new Object[0]));
                for (final eu eu2 : bab.a(\u26032.modes, \u26032.subscriptions, null)) {
                    \u26034.a("\n");
                    \u26034.a(eu2);
                }
                eu.b().a(new ew(ew.a.a, \u26034));
                eu.b().a(new et(et.a.d, \u26032.userName));
                this.f.q.d().a(\u26033);
            }
        }
    }
    
    @Override
    public void a(final String \u2603, final ChatTokenizedMessage[] \u2603) {
    }
    
    private void a(final String \u2603, final ChatRawMessage \u2603) {
        ChatUserInfo chatUserInfo = this.h.get(\u2603);
        if (chatUserInfo == null) {
            chatUserInfo = new ChatUserInfo();
            chatUserInfo.displayName = \u2603;
            this.h.put(\u2603, chatUserInfo);
        }
        chatUserInfo.subscriptions = \u2603.subscriptions;
        chatUserInfo.modes = \u2603.modes;
        chatUserInfo.nameColorARGB = \u2603.nameColorARGB;
    }
    
    private boolean a(final Set<ChatUserMode> \u2603, final Set<ChatUserSubscription> \u2603, final int \u2603) {
        return !\u2603.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED) && (\u2603.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) || \u2603.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) || \u2603.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF) || \u2603 == 0 || (\u2603 == 1 && \u2603.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER)));
    }
    
    @Override
    public void a(final String \u2603, final ChatUserInfo[] \u2603, final ChatUserInfo[] \u2603, final ChatUserInfo[] \u2603) {
        for (final ChatUserInfo chatUserInfo : \u2603) {
            this.h.remove(chatUserInfo.displayName);
        }
        for (final ChatUserInfo chatUserInfo : \u2603) {
            this.h.put(chatUserInfo.displayName, chatUserInfo);
        }
        for (final ChatUserInfo chatUserInfo : \u2603) {
            this.h.put(chatUserInfo.displayName, chatUserInfo);
        }
    }
    
    @Override
    public void a(final String \u2603) {
        bqn.b.debug(bqn.a, "Chat connected");
    }
    
    @Override
    public void b(final String \u2603) {
        bqn.b.debug(bqn.a, "Chat disconnected");
        this.h.clear();
    }
    
    @Override
    public void a(final String \u2603, final String \u2603) {
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public void e() {
    }
    
    @Override
    public void c(final String \u2603) {
    }
    
    @Override
    public void d(final String \u2603) {
    }
    
    @Override
    public boolean y() {
        return this.e != null && this.e.equals(this.c.l().name);
    }
    
    @Override
    public String z() {
        return this.e;
    }
    
    @Override
    public ChatUserInfo e(final String \u2603) {
        return this.h.get(\u2603);
    }
    
    @Override
    public void f(final String \u2603) {
        this.d.a(this.e, \u2603);
    }
    
    @Override
    public boolean A() {
        return bqn.r && this.c.b();
    }
    
    @Override
    public ErrorCode B() {
        if (!bqn.r) {
            return ErrorCode.TTV_EC_OS_TOO_OLD;
        }
        return this.c.A();
    }
    
    @Override
    public boolean C() {
        return this.n;
    }
    
    @Override
    public void a(final boolean \u2603) {
        this.p = \u2603;
        this.p();
    }
    
    @Override
    public boolean D() {
        final boolean b = this.f.t.U == 1;
        return this.o || this.f.t.L <= 0.0f || b != this.p;
    }
    
    @Override
    public bqm.a E() {
        return this.q;
    }
    
    static {
        b = LogManager.getLogger();
        a = MarkerManager.getMarker("STREAM");
        try {
            if (g.a() == g.a.c) {
                System.loadLibrary("avutil-ttv-51");
                System.loadLibrary("swresample-ttv-0");
                System.loadLibrary("libmp3lame-ttv");
                if (System.getProperty("os.arch").contains("64")) {
                    System.loadLibrary("libmfxsw64");
                }
                else {
                    System.loadLibrary("libmfxsw32");
                }
            }
            bqn.r = true;
        }
        catch (Throwable t) {
            bqn.r = false;
        }
    }
}
