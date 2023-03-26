import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import java.util.ListIterator;
import com.google.common.collect.Lists;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatRawMessage;
import java.util.LinkedList;
import tv.twitch.chat.ChatUserInfo;
import java.util.List;
import tv.twitch.chat.IChatChannelListener;
import org.apache.logging.log4j.LogManager;
import tv.twitch.chat.ChatTokenizationOption;
import java.util.HashSet;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.StandardChatAPI;
import tv.twitch.CoreAPI;
import tv.twitch.StandardCoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.ChatEmoticonData;
import java.util.HashMap;
import tv.twitch.AuthToken;
import tv.twitch.chat.Chat;
import tv.twitch.Core;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqk
{
    private static final Logger q;
    protected e a;
    protected String b;
    protected String c;
    protected String d;
    protected Core e;
    protected Chat f;
    protected c g;
    protected AuthToken h;
    protected HashMap<String, b> i;
    protected int j;
    protected d k;
    protected d l;
    protected ChatEmoticonData m;
    protected int n;
    protected int o;
    protected IChatAPIListener p;
    
    public void a(final e \u2603) {
        this.a = \u2603;
    }
    
    public void a(final AuthToken \u2603) {
        this.h = \u2603;
    }
    
    public void a(final String \u2603) {
        this.c = \u2603;
    }
    
    public void c(final String \u2603) {
        this.b = \u2603;
    }
    
    public c h() {
        return this.g;
    }
    
    public boolean d(final String \u2603) {
        if (!this.i.containsKey(\u2603)) {
            return false;
        }
        final b b = this.i.get(\u2603);
        return b.a() == bqk.a.c;
    }
    
    public a e(final String \u2603) {
        if (!this.i.containsKey(\u2603)) {
            return bqk.a.e;
        }
        final b b = this.i.get(\u2603);
        return b.a();
    }
    
    public bqk() {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = bqk.c.a;
        this.h = new AuthToken();
        this.i = new HashMap<String, b>();
        this.j = 128;
        this.k = bqk.d.a;
        this.l = bqk.d.a;
        this.m = null;
        this.n = 500;
        this.o = 2000;
        this.p = new IChatAPIListener() {
            @Override
            public void chatInitializationCallback(final ErrorCode \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqk.this.f.setMessageFlushInterval(bqk.this.n);
                    bqk.this.f.setUserChangeEventInterval(bqk.this.o);
                    bqk.this.r();
                    bqk.this.a(bqk.c.c);
                }
                else {
                    bqk.this.a(bqk.c.a);
                }
                try {
                    if (bqk.this.a != null) {
                        bqk.this.a.d(\u2603);
                    }
                }
                catch (Exception ex) {
                    bqk.this.n(ex.toString());
                }
            }
            
            @Override
            public void chatShutdownCallback(final ErrorCode \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    final ErrorCode shutdown = bqk.this.e.shutdown();
                    if (ErrorCode.failed(shutdown)) {
                        final String string = ErrorCode.getString(shutdown);
                        bqk.this.n(String.format("Error shutting down the Twitch sdk: %s", string));
                    }
                    bqk.this.a(bqk.c.a);
                }
                else {
                    bqk.this.a(bqk.c.c);
                    bqk.this.n(String.format("Error shutting down Twith chat: %s", \u2603));
                }
                try {
                    if (bqk.this.a != null) {
                        bqk.this.a.e(\u2603);
                    }
                }
                catch (Exception ex) {
                    bqk.this.n(ex.toString());
                }
            }
            
            @Override
            public void chatEmoticonDataDownloadCallback(final ErrorCode \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqk.this.s();
                }
            }
        };
        this.e = Core.getInstance();
        if (this.e == null) {
            this.e = new Core(new StandardCoreAPI());
        }
        this.f = new Chat(new StandardChatAPI());
    }
    
    public boolean n() {
        if (this.g != bqk.c.a) {
            return false;
        }
        this.a(bqk.c.b);
        ErrorCode errorCode = this.e.initialize(this.c, null);
        if (ErrorCode.failed(errorCode)) {
            this.a(bqk.c.a);
            final String string = ErrorCode.getString(errorCode);
            this.n(String.format("Error initializing Twitch sdk: %s", string));
            return false;
        }
        this.l = this.k;
        final HashSet<ChatTokenizationOption> set = new HashSet<ChatTokenizationOption>();
        switch (bqk$2.c[this.k.ordinal()]) {
            case 1: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
                break;
            }
            case 2: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
                break;
            }
            case 3: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
                break;
            }
        }
        errorCode = this.f.initialize(set, this.p);
        if (ErrorCode.failed(errorCode)) {
            this.e.shutdown();
            this.a(bqk.c.a);
            final String string2 = ErrorCode.getString(errorCode);
            this.n(String.format("Error initializing Twitch chat: %s", string2));
            return false;
        }
        this.a(bqk.c.c);
        return true;
    }
    
    public boolean j(final String \u2603) {
        return this.a(\u2603, false);
    }
    
    protected boolean a(final String \u2603, final boolean \u2603) {
        if (this.g != bqk.c.c) {
            return false;
        }
        if (this.i.containsKey(\u2603)) {
            this.n("Already in channel: " + \u2603);
            return false;
        }
        if (\u2603 == null || \u2603.equals("")) {
            return false;
        }
        final b value = new b(\u2603);
        this.i.put(\u2603, value);
        final boolean a = value.a(\u2603);
        if (!a) {
            this.i.remove(\u2603);
        }
        return a;
    }
    
    public boolean l(final String \u2603) {
        if (this.g != bqk.c.c) {
            return false;
        }
        if (!this.i.containsKey(\u2603)) {
            this.n("Not in channel: " + \u2603);
            return false;
        }
        final b b = this.i.get(\u2603);
        return b.g();
    }
    
    public boolean o() {
        if (this.g != bqk.c.c) {
            return false;
        }
        final ErrorCode shutdown = this.f.shutdown();
        if (ErrorCode.failed(shutdown)) {
            final String string = ErrorCode.getString(shutdown);
            this.n(String.format("Error shutting down chat: %s", string));
            return false;
        }
        this.t();
        this.a(bqk.c.d);
        return true;
    }
    
    public void p() {
        if (this.h() != bqk.c.a) {
            this.o();
            if (this.h() == bqk.c.d) {
                while (this.h() != bqk.c.a) {
                    try {
                        Thread.sleep(200L);
                        this.q();
                    }
                    catch (InterruptedException ex) {}
                }
            }
        }
    }
    
    public void q() {
        if (this.g == bqk.c.a) {
            return;
        }
        final ErrorCode flushEvents = this.f.flushEvents();
        if (ErrorCode.failed(flushEvents)) {
            final String string = ErrorCode.getString(flushEvents);
            this.n(String.format("Error flushing chat events: %s", string));
        }
    }
    
    public boolean a(final String \u2603, final String \u2603) {
        if (this.g != bqk.c.c) {
            return false;
        }
        if (!this.i.containsKey(\u2603)) {
            this.n("Not in channel: " + \u2603);
            return false;
        }
        final b b = this.i.get(\u2603);
        return b.b(\u2603);
    }
    
    protected void a(final c \u2603) {
        if (\u2603 == this.g) {
            return;
        }
        this.g = \u2603;
        try {
            if (this.a != null) {
                this.a.a(\u2603);
            }
        }
        catch (Exception ex) {
            this.n(ex.toString());
        }
    }
    
    protected void r() {
        if (this.l == bqk.d.a) {
            return;
        }
        if (this.m == null) {
            final ErrorCode downloadEmoticonData = this.f.downloadEmoticonData();
            if (ErrorCode.failed(downloadEmoticonData)) {
                final String string = ErrorCode.getString(downloadEmoticonData);
                this.n(String.format("Error trying to download emoticon data: %s", string));
            }
        }
    }
    
    protected void s() {
        if (this.m != null) {
            return;
        }
        this.m = new ChatEmoticonData();
        final ErrorCode emoticonData = this.f.getEmoticonData(this.m);
        if (ErrorCode.succeeded(emoticonData)) {
            try {
                if (this.a != null) {
                    this.a.d();
                }
            }
            catch (Exception ex) {
                this.n(ex.toString());
            }
        }
        else {
            this.n("Error preparing emoticon data: " + ErrorCode.getString(emoticonData));
        }
    }
    
    protected void t() {
        if (this.m == null) {
            return;
        }
        final ErrorCode clearEmoticonData = this.f.clearEmoticonData();
        if (ErrorCode.succeeded(clearEmoticonData)) {
            this.m = null;
            try {
                if (this.a != null) {
                    this.a.e();
                }
            }
            catch (Exception ex) {
                this.n(ex.toString());
            }
        }
        else {
            this.n("Error clearing emoticon data: " + ErrorCode.getString(clearEmoticonData));
        }
    }
    
    protected void n(final String \u2603) {
        bqk.q.error(bqn.a, "[Chat controller] {}", new Object[] { \u2603 });
    }
    
    static {
        q = LogManager.getLogger();
    }
    
    public enum c
    {
        a, 
        b, 
        c, 
        d;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e;
    }
    
    public enum d
    {
        a, 
        b, 
        c;
    }
    
    public class b implements IChatChannelListener
    {
        protected String a;
        protected boolean b;
        protected a c;
        protected List<ChatUserInfo> d;
        protected LinkedList<ChatRawMessage> e;
        protected LinkedList<ChatTokenizedMessage> f;
        protected ChatBadgeData g;
        
        public b(final String \u2603) {
            this.a = null;
            this.b = false;
            this.c = bqk.a.a;
            this.d = (List<ChatUserInfo>)Lists.newArrayList();
            this.e = new LinkedList<ChatRawMessage>();
            this.f = new LinkedList<ChatTokenizedMessage>();
            this.g = null;
            this.a = \u2603;
        }
        
        public a a() {
            return this.c;
        }
        
        public boolean a(final boolean \u2603) {
            this.b = \u2603;
            ErrorCode errorCode = ErrorCode.TTV_EC_SUCCESS;
            if (\u2603) {
                errorCode = bqk.this.f.connectAnonymous(this.a, this);
            }
            else {
                errorCode = bqk.this.f.connect(this.a, bqk.this.b, bqk.this.h.data, this);
            }
            if (ErrorCode.failed(errorCode)) {
                final String string = ErrorCode.getString(errorCode);
                bqk.this.n(String.format("Error connecting: %s", string));
                this.d(this.a);
                return false;
            }
            this.a(bqk.a.b);
            this.h();
            return true;
        }
        
        public boolean g() {
            switch (bqk$2.a[this.c.ordinal()]) {
                case 1:
                case 2: {
                    final ErrorCode disconnect = bqk.this.f.disconnect(this.a);
                    if (ErrorCode.failed(disconnect)) {
                        final String string = ErrorCode.getString(disconnect);
                        bqk.this.n(String.format("Error disconnecting: %s", string));
                        return false;
                    }
                    this.a(bqk.a.d);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        
        protected void a(final a \u2603) {
            if (\u2603 == this.c) {
                return;
            }
            this.c = \u2603;
        }
        
        public void a(final String \u2603) {
            if (bqk.this.l == bqk.d.a) {
                this.e.clear();
                this.f.clear();
            }
            else {
                if (this.e.size() > 0) {
                    final ListIterator<ChatRawMessage> listIterator = this.e.listIterator();
                    while (listIterator.hasNext()) {
                        final ChatRawMessage chatRawMessage = listIterator.next();
                        if (chatRawMessage.userName.equals(\u2603)) {
                            listIterator.remove();
                        }
                    }
                }
                if (this.f.size() > 0) {
                    final ListIterator<ChatTokenizedMessage> listIterator2 = this.f.listIterator();
                    while (listIterator2.hasNext()) {
                        final ChatTokenizedMessage chatTokenizedMessage = listIterator2.next();
                        if (chatTokenizedMessage.displayName.equals(\u2603)) {
                            listIterator2.remove();
                        }
                    }
                }
            }
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.a(this.a, \u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
        }
        
        public boolean b(final String \u2603) {
            if (this.c != bqk.a.c) {
                return false;
            }
            final ErrorCode sendMessage = bqk.this.f.sendMessage(this.a, \u2603);
            if (ErrorCode.failed(sendMessage)) {
                final String string = ErrorCode.getString(sendMessage);
                bqk.this.n(String.format("Error sending chat message: %s", string));
                return false;
            }
            return true;
        }
        
        protected void h() {
            if (bqk.this.l == bqk.d.a) {
                return;
            }
            if (this.g == null) {
                final ErrorCode downloadBadgeData = bqk.this.f.downloadBadgeData(this.a);
                if (ErrorCode.failed(downloadBadgeData)) {
                    final String string = ErrorCode.getString(downloadBadgeData);
                    bqk.this.n(String.format("Error trying to download badge data: %s", string));
                }
            }
        }
        
        protected void i() {
            if (this.g != null) {
                return;
            }
            this.g = new ChatBadgeData();
            final ErrorCode badgeData = bqk.this.f.getBadgeData(this.a, this.g);
            if (ErrorCode.succeeded(badgeData)) {
                try {
                    if (bqk.this.a != null) {
                        bqk.this.a.c(this.a);
                    }
                }
                catch (Exception ex) {
                    bqk.this.n(ex.toString());
                }
            }
            else {
                bqk.this.n("Error preparing badge data: " + ErrorCode.getString(badgeData));
            }
        }
        
        protected void j() {
            if (this.g == null) {
                return;
            }
            final ErrorCode clearBadgeData = bqk.this.f.clearBadgeData(this.a);
            if (ErrorCode.succeeded(clearBadgeData)) {
                this.g = null;
                try {
                    if (bqk.this.a != null) {
                        bqk.this.a.d(this.a);
                    }
                }
                catch (Exception ex) {
                    bqk.this.n(ex.toString());
                }
            }
            else {
                bqk.this.n("Error releasing badge data: " + ErrorCode.getString(clearBadgeData));
            }
        }
        
        protected void c(final String \u2603) {
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.a(\u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
        }
        
        protected void d(final String \u2603) {
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.b(\u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
        }
        
        private void k() {
            if (this.c != bqk.a.e) {
                this.a(bqk.a.e);
                this.d(this.a);
                this.j();
            }
        }
        
        @Override
        public void chatStatusCallback(final String \u2603, final ErrorCode \u2603) {
            if (ErrorCode.succeeded(\u2603)) {
                return;
            }
            bqk.this.i.remove(\u2603);
            this.k();
        }
        
        @Override
        public void chatChannelMembershipCallback(final String \u2603, final ChatEvent \u2603, final ChatChannelInfo \u2603) {
            switch (bqk$2.b[\u2603.ordinal()]) {
                case 1: {
                    this.a(bqk.a.c);
                    this.c(\u2603);
                    break;
                }
                case 2: {
                    this.k();
                    break;
                }
            }
        }
        
        @Override
        public void chatChannelUserChangeCallback(final String \u2603, final ChatUserInfo[] \u2603, final ChatUserInfo[] \u2603, final ChatUserInfo[] \u2603) {
            for (int i = 0; i < \u2603.length; ++i) {
                final int n = this.d.indexOf(\u2603[i]);
                if (n >= 0) {
                    this.d.remove(n);
                }
            }
            for (int i = 0; i < \u2603.length; ++i) {
                final int n = this.d.indexOf(\u2603[i]);
                if (n >= 0) {
                    this.d.remove(n);
                }
                this.d.add(\u2603[i]);
            }
            for (int i = 0; i < \u2603.length; ++i) {
                this.d.add(\u2603[i]);
            }
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.a(this.a, \u2603, \u2603, \u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
        }
        
        @Override
        public void chatChannelRawMessageCallback(final String \u2603, final ChatRawMessage[] \u2603) {
            for (int i = 0; i < \u2603.length; ++i) {
                this.e.addLast(\u2603[i]);
            }
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.a(this.a, \u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
            while (this.e.size() > bqk.this.j) {
                this.e.removeFirst();
            }
        }
        
        @Override
        public void chatChannelTokenizedMessageCallback(final String \u2603, final ChatTokenizedMessage[] \u2603) {
            for (int i = 0; i < \u2603.length; ++i) {
                this.f.addLast(\u2603[i]);
            }
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.a(this.a, \u2603);
                }
            }
            catch (Exception ex) {
                bqk.this.n(ex.toString());
            }
            while (this.f.size() > bqk.this.j) {
                this.f.removeFirst();
            }
        }
        
        @Override
        public void chatClearCallback(final String \u2603, final String \u2603) {
            this.a(\u2603);
        }
        
        @Override
        public void chatBadgeDataDownloadCallback(final String \u2603, final ErrorCode \u2603) {
            if (ErrorCode.succeeded(\u2603)) {
                this.i();
            }
        }
    }
    
    public interface e
    {
        void d(final ErrorCode p0);
        
        void e(final ErrorCode p0);
        
        void d();
        
        void e();
        
        void a(final c p0);
        
        void a(final String p0, final ChatTokenizedMessage[] p1);
        
        void a(final String p0, final ChatRawMessage[] p1);
        
        void a(final String p0, final ChatUserInfo[] p1, final ChatUserInfo[] p2, final ChatUserInfo[] p3);
        
        void a(final String p0);
        
        void b(final String p0);
        
        void a(final String p0, final String p1);
        
        void c(final String p0);
        
        void d(final String p0);
    }
}
