import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.MessageLevel;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StreamAPI;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.CoreAPI;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import com.google.common.collect.Lists;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.AuthToken;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.broadcast.FrameBuffer;
import java.util.List;
import tv.twitch.broadcast.Stream;
import tv.twitch.Core;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqj
{
    private static final Logger D;
    protected final int a = 30;
    protected final int b = 3;
    private static final np<String> E;
    private String F;
    protected b c;
    protected String d;
    protected String e;
    protected String f;
    protected boolean g;
    protected Core h;
    protected Stream i;
    protected List<FrameBuffer> j;
    protected List<FrameBuffer> k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected a o;
    protected String p;
    protected VideoParams q;
    protected AudioParams r;
    protected IngestList s;
    protected IngestServer t;
    protected AuthToken u;
    protected ChannelInfo v;
    protected UserInfo w;
    protected StreamInfo x;
    protected ArchivingState y;
    protected long z;
    protected bql A;
    private ErrorCode G;
    protected IStreamCallbacks B;
    protected IStatCallbacks C;
    
    public void a(final b \u2603) {
        this.c = \u2603;
    }
    
    public boolean b() {
        return this.l;
    }
    
    public void a(final String \u2603) {
        this.d = \u2603;
    }
    
    public StreamInfo j() {
        return this.x;
    }
    
    public ChannelInfo l() {
        return this.v;
    }
    
    public boolean m() {
        return this.o == bqj.a.k || this.o == bqj.a.m;
    }
    
    public boolean n() {
        return this.o == bqj.a.i;
    }
    
    public boolean o() {
        return this.o == bqj.a.n;
    }
    
    public boolean p() {
        return this.o == bqj.a.m;
    }
    
    public boolean q() {
        return this.m;
    }
    
    public IngestServer s() {
        return this.t;
    }
    
    public void a(final IngestServer \u2603) {
        this.t = \u2603;
    }
    
    public IngestList t() {
        return this.s;
    }
    
    public void a(final float \u2603) {
        this.i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, \u2603);
    }
    
    public void b(final float \u2603) {
        this.i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, \u2603);
    }
    
    public bql w() {
        return this.A;
    }
    
    public long x() {
        return this.i.getStreamTime();
    }
    
    protected boolean y() {
        return true;
    }
    
    public ErrorCode A() {
        return this.G;
    }
    
    public bqj() {
        this.F = null;
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = true;
        this.h = null;
        this.i = null;
        this.j = (List<FrameBuffer>)Lists.newArrayList();
        this.k = (List<FrameBuffer>)Lists.newArrayList();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = bqj.a.a;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new IngestList(new IngestServer[0]);
        this.t = null;
        this.u = new AuthToken();
        this.v = new ChannelInfo();
        this.w = new UserInfo();
        this.x = new StreamInfo();
        this.y = new ArchivingState();
        this.z = 0L;
        this.A = null;
        this.B = new IStreamCallbacks() {
            @Override
            public void requestAuthTokenCallback(final ErrorCode \u2603, final AuthToken \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqj.this.u = \u2603;
                    bqj.this.a(bqj.a.d);
                }
                else {
                    bqj.this.u.data = "";
                    bqj.this.a(bqj.a.b);
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("RequestAuthTokenDoneCallback got failure: %s", string));
                }
                try {
                    if (bqj.this.c != null) {
                        bqj.this.c.a(\u2603, \u2603);
                    }
                }
                catch (Exception ex) {
                    bqj.this.d(ex.toString());
                }
            }
            
            @Override
            public void loginCallback(final ErrorCode \u2603, final ChannelInfo \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqj.this.v = \u2603;
                    bqj.this.a(bqj.a.f);
                    bqj.this.m = true;
                }
                else {
                    bqj.this.a(bqj.a.b);
                    bqj.this.m = false;
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("LoginCallback got failure: %s", string));
                }
                try {
                    if (bqj.this.c != null) {
                        bqj.this.c.a(\u2603);
                    }
                }
                catch (Exception ex) {
                    bqj.this.d(ex.toString());
                }
            }
            
            @Override
            public void getIngestServersCallback(final ErrorCode \u2603, final IngestList \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqj.this.s = \u2603;
                    bqj.this.t = bqj.this.s.getDefaultServer();
                    bqj.this.a(bqj.a.h);
                    try {
                        if (bqj.this.c != null) {
                            bqj.this.c.a(\u2603);
                        }
                    }
                    catch (Exception ex) {
                        bqj.this.d(ex.toString());
                    }
                }
                else {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("IngestListCallback got failure: %s", string));
                    bqj.this.a(bqj.a.e);
                }
            }
            
            @Override
            public void getUserInfoCallback(final ErrorCode \u2603, final UserInfo \u2603) {
                bqj.this.w = \u2603;
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("UserInfoDoneCallback got failure: %s", string));
                }
            }
            
            @Override
            public void getStreamInfoCallback(final ErrorCode \u2603, final StreamInfo \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqj.this.x = \u2603;
                    try {
                        if (bqj.this.c != null) {
                            bqj.this.c.a(\u2603);
                        }
                    }
                    catch (Exception ex) {
                        bqj.this.d(ex.toString());
                    }
                }
                else {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.e(String.format("StreamInfoDoneCallback got failure: %s", string));
                }
            }
            
            @Override
            public void getArchivingStateCallback(final ErrorCode \u2603, final ArchivingState \u2603) {
                bqj.this.y = \u2603;
                if (ErrorCode.failed(\u2603)) {}
            }
            
            @Override
            public void runCommercialCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.e(String.format("RunCommercialCallback got failure: %s", string));
                }
            }
            
            @Override
            public void setStreamInfoCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.e(String.format("SetStreamInfoCallback got failure: %s", string));
                }
            }
            
            @Override
            public void getGameNameListCallback(final ErrorCode \u2603, final GameInfoList \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("GameNameListCallback got failure: %s", string));
                }
                try {
                    if (bqj.this.c != null) {
                        bqj.this.c.a(\u2603, (\u2603 == null) ? new GameInfo[0] : \u2603.list);
                    }
                }
                catch (Exception ex) {
                    bqj.this.d(ex.toString());
                }
            }
            
            @Override
            public void bufferUnlockCallback(final long \u2603) {
                final FrameBuffer lookupBuffer = FrameBuffer.lookupBuffer(\u2603);
                bqj.this.k.add(lookupBuffer);
            }
            
            @Override
            public void startCallback(final ErrorCode \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    try {
                        if (bqj.this.c != null) {
                            bqj.this.c.b();
                        }
                    }
                    catch (Exception ex) {
                        bqj.this.d(ex.toString());
                    }
                    bqj.this.a(bqj.a.k);
                }
                else {
                    bqj.this.q = null;
                    bqj.this.r = null;
                    bqj.this.a(bqj.a.i);
                    try {
                        if (bqj.this.c != null) {
                            bqj.this.c.c(\u2603);
                        }
                    }
                    catch (Exception ex) {
                        bqj.this.d(ex.toString());
                    }
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("startCallback got failure: %s", string));
                }
            }
            
            @Override
            public void stopCallback(final ErrorCode \u2603) {
                if (ErrorCode.succeeded(\u2603)) {
                    bqj.this.q = null;
                    bqj.this.r = null;
                    bqj.this.P();
                    try {
                        if (bqj.this.c != null) {
                            bqj.this.c.c();
                        }
                    }
                    catch (Exception ex) {
                        bqj.this.d(ex.toString());
                    }
                    if (bqj.this.m) {
                        bqj.this.a(bqj.a.i);
                    }
                    else {
                        bqj.this.a(bqj.a.b);
                    }
                }
                else {
                    bqj.this.a(bqj.a.i);
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("stopCallback got failure: %s", string));
                }
            }
            
            @Override
            public void sendActionMetaDataCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("sendActionMetaDataCallback got failure: %s", string));
                }
            }
            
            @Override
            public void sendStartSpanMetaDataCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("sendStartSpanMetaDataCallback got failure: %s", string));
                }
            }
            
            @Override
            public void sendEndSpanMetaDataCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    final String string = ErrorCode.getString(\u2603);
                    bqj.this.d(String.format("sendEndSpanMetaDataCallback got failure: %s", string));
                }
            }
        };
        this.C = new IStatCallbacks() {
            @Override
            public void statCallback(final StatType \u2603, final long \u2603) {
            }
        };
        this.h = Core.getInstance();
        if (Core.getInstance() == null) {
            this.h = new Core(new StandardCoreAPI());
        }
        this.i = new Stream(new DesktopStreamAPI());
    }
    
    protected PixelFormat B() {
        return PixelFormat.TTV_PF_RGBA;
    }
    
    public boolean C() {
        if (this.l) {
            return false;
        }
        this.i.setStreamCallbacks(this.B);
        ErrorCode g = this.h.initialize(this.d, System.getProperty("java.library.path"));
        if (!this.a(g)) {
            this.i.setStreamCallbacks(null);
            this.G = g;
            return false;
        }
        g = this.h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
        if (!this.a(g)) {
            this.i.setStreamCallbacks(null);
            this.h.shutdown();
            this.G = g;
            return false;
        }
        if (ErrorCode.succeeded(g)) {
            this.l = true;
            this.a(bqj.a.b);
            return true;
        }
        this.G = g;
        this.h.shutdown();
        return false;
    }
    
    public boolean D() {
        if (!this.l) {
            return true;
        }
        if (this.o()) {
            return false;
        }
        this.n = true;
        this.F();
        this.i.setStreamCallbacks(null);
        this.i.setStatCallbacks(null);
        final ErrorCode shutdown = this.h.shutdown();
        this.a(shutdown);
        this.l = false;
        this.n = false;
        this.a(bqj.a.a);
        return true;
    }
    
    public void E() {
        if (this.o != bqj.a.a) {
            if (this.A != null) {
                this.A.m();
            }
            while (this.A != null) {
                try {
                    Thread.sleep(200L);
                }
                catch (Exception ex) {
                    this.d(ex.toString());
                }
                this.K();
            }
            this.D();
        }
    }
    
    public boolean a(final String \u2603, final AuthToken \u2603) {
        if (this.o()) {
            return false;
        }
        this.F();
        if (\u2603 == null || \u2603.isEmpty()) {
            this.d("Username must be valid");
            return false;
        }
        if (\u2603 == null || \u2603.data == null || \u2603.data.isEmpty()) {
            this.d("Auth token must be valid");
            return false;
        }
        this.p = \u2603;
        this.u = \u2603;
        if (this.b()) {
            this.a(bqj.a.d);
        }
        return true;
    }
    
    public boolean F() {
        if (this.o()) {
            return false;
        }
        if (this.m()) {
            this.i.stop(false);
        }
        this.p = "";
        this.u = new AuthToken();
        if (!this.m) {
            return false;
        }
        this.m = false;
        if (!this.n) {
            try {
                if (this.c != null) {
                    this.c.a();
                }
            }
            catch (Exception ex) {
                this.d(ex.toString());
            }
        }
        this.a(bqj.a.b);
        return true;
    }
    
    public boolean a(String \u2603, String \u2603, String \u2603) {
        if (!this.m) {
            return false;
        }
        if (\u2603 == null || \u2603.equals("")) {
            \u2603 = this.p;
        }
        if (\u2603 == null) {
            \u2603 = "";
        }
        if (\u2603 == null) {
            \u2603 = "";
        }
        final StreamInfoForSetting streamInfoForSetting = new StreamInfoForSetting();
        streamInfoForSetting.streamTitle = \u2603;
        streamInfoForSetting.gameName = \u2603;
        final ErrorCode setStreamInfo = this.i.setStreamInfo(this.u, \u2603, streamInfoForSetting);
        this.a(setStreamInfo);
        return ErrorCode.succeeded(setStreamInfo);
    }
    
    public boolean G() {
        if (!this.m()) {
            return false;
        }
        final ErrorCode runCommercial = this.i.runCommercial(this.u);
        this.a(runCommercial);
        return ErrorCode.succeeded(runCommercial);
    }
    
    public VideoParams a(final int \u2603, final int \u2603, final float \u2603, final float \u2603) {
        final int[] maxResolution = this.i.getMaxResolution(\u2603, \u2603, \u2603, \u2603);
        final VideoParams videoParams = new VideoParams();
        videoParams.maxKbps = \u2603;
        videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        videoParams.pixelFormat = this.B();
        videoParams.targetFps = \u2603;
        videoParams.outputWidth = maxResolution[0];
        videoParams.outputHeight = maxResolution[1];
        videoParams.disableAdaptiveBitrate = false;
        videoParams.verticalFlip = false;
        return videoParams;
    }
    
    public boolean a(final VideoParams \u2603) {
        if (\u2603 == null || !this.n()) {
            return false;
        }
        this.q = \u2603.clone();
        this.r = new AudioParams();
        this.r.audioEnabled = (this.g && this.y());
        this.r.enableMicCapture = this.r.audioEnabled;
        this.r.enablePlaybackCapture = this.r.audioEnabled;
        this.r.enablePassthroughAudio = false;
        if (!this.O()) {
            this.q = null;
            this.r = null;
            return false;
        }
        final ErrorCode start = this.i.start(\u2603, this.r, this.t, StartFlags.None, true);
        if (ErrorCode.failed(start)) {
            this.P();
            final String string = ErrorCode.getString(start);
            this.d(String.format("Error while starting to broadcast: %s", string));
            this.q = null;
            this.r = null;
            return false;
        }
        this.a(bqj.a.j);
        return true;
    }
    
    public boolean H() {
        if (!this.m()) {
            return false;
        }
        final ErrorCode stop = this.i.stop(true);
        if (ErrorCode.failed(stop)) {
            final String string = ErrorCode.getString(stop);
            this.d(String.format("Error while stopping the broadcast: %s", string));
            return false;
        }
        this.a(bqj.a.l);
        return ErrorCode.succeeded(stop);
    }
    
    public boolean I() {
        if (!this.m()) {
            return false;
        }
        final ErrorCode pauseVideo = this.i.pauseVideo();
        if (ErrorCode.failed(pauseVideo)) {
            this.H();
            final String string = ErrorCode.getString(pauseVideo);
            this.d(String.format("Error pausing stream: %s\n", string));
        }
        else {
            this.a(bqj.a.m);
        }
        return ErrorCode.succeeded(pauseVideo);
    }
    
    public boolean J() {
        if (!this.p()) {
            return false;
        }
        this.a(bqj.a.k);
        return true;
    }
    
    public boolean a(final String \u2603, final long \u2603, final String \u2603, final String \u2603) {
        final ErrorCode sendActionMetaData = this.i.sendActionMetaData(this.u, \u2603, \u2603, \u2603, \u2603);
        if (ErrorCode.failed(sendActionMetaData)) {
            final String string = ErrorCode.getString(sendActionMetaData);
            this.d(String.format("Error while sending meta data: %s\n", string));
            return false;
        }
        return true;
    }
    
    public long b(final String \u2603, final long \u2603, final String \u2603, final String \u2603) {
        final long sendStartSpanMetaData = this.i.sendStartSpanMetaData(this.u, \u2603, \u2603, \u2603, \u2603);
        if (sendStartSpanMetaData == -1L) {
            this.d(String.format("Error in SendStartSpanMetaData\n", new Object[0]));
        }
        return sendStartSpanMetaData;
    }
    
    public boolean a(final String \u2603, final long \u2603, final long \u2603, final String \u2603, final String \u2603) {
        if (\u2603 == -1L) {
            this.d(String.format("Invalid sequence id: %d\n", \u2603));
            return false;
        }
        final ErrorCode sendEndSpanMetaData = this.i.sendEndSpanMetaData(this.u, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (ErrorCode.failed(sendEndSpanMetaData)) {
            final String string = ErrorCode.getString(sendEndSpanMetaData);
            this.d(String.format("Error in SendStopSpanMetaData: %s\n", string));
            return false;
        }
        return true;
    }
    
    protected void a(final a \u2603) {
        if (\u2603 == this.o) {
            return;
        }
        this.o = \u2603;
        try {
            if (this.c != null) {
                this.c.a(\u2603);
            }
        }
        catch (Exception ex) {
            this.d(ex.toString());
        }
    }
    
    public void K() {
        if (this.i == null || !this.l) {
            return;
        }
        ErrorCode \u2603 = this.i.pollTasks();
        this.a(\u2603);
        if (this.o()) {
            this.A.k();
            if (this.A.f()) {
                this.A = null;
                this.a(bqj.a.i);
            }
        }
        switch (bqj$3.a[this.o.ordinal()]) {
            case 1: {
                this.a(bqj.a.e);
                \u2603 = this.i.login(this.u);
                if (ErrorCode.failed(\u2603)) {
                    final String s = ErrorCode.getString(\u2603);
                    this.d(String.format("Error in TTV_Login: %s\n", s));
                    break;
                }
                break;
            }
            case 2: {
                this.a(bqj.a.g);
                \u2603 = this.i.getIngestServers(this.u);
                if (ErrorCode.failed(\u2603)) {
                    this.a(bqj.a.f);
                    final String s = ErrorCode.getString(\u2603);
                    this.d(String.format("Error in TTV_GetIngestServers: %s\n", s));
                    break;
                }
                break;
            }
            case 3: {
                this.a(bqj.a.i);
                \u2603 = this.i.getUserInfo(this.u);
                if (ErrorCode.failed(\u2603)) {
                    final String s = ErrorCode.getString(\u2603);
                    this.d(String.format("Error in TTV_GetUserInfo: %s\n", s));
                }
                this.L();
                \u2603 = this.i.getArchivingState(this.u);
                if (ErrorCode.failed(\u2603)) {
                    final String s = ErrorCode.getString(\u2603);
                    this.d(String.format("Error in TTV_GetArchivingState: %s\n", s));
                    break;
                }
                break;
            }
            case 4:
            case 5: {}
            case 11:
            case 12: {
                this.L();
                break;
            }
        }
    }
    
    protected void L() {
        final long nanoTime = System.nanoTime();
        final long n = (nanoTime - this.z) / 1000000000L;
        if (n < 30L) {
            return;
        }
        this.z = nanoTime;
        final ErrorCode streamInfo = this.i.getStreamInfo(this.u, this.p);
        if (ErrorCode.failed(streamInfo)) {
            final String string = ErrorCode.getString(streamInfo);
            this.d(String.format("Error in TTV_GetStreamInfo: %s", string));
        }
    }
    
    public bql M() {
        if (!this.n() || this.s == null) {
            return null;
        }
        if (this.o()) {
            return null;
        }
        (this.A = new bql(this.i, this.s)).j();
        this.a(bqj.a.n);
        return this.A;
    }
    
    protected boolean O() {
        for (int i = 0; i < 3; ++i) {
            final FrameBuffer allocateFrameBuffer = this.i.allocateFrameBuffer(this.q.outputWidth * this.q.outputHeight * 4);
            if (!allocateFrameBuffer.getIsValid()) {
                this.d(String.format("Error while allocating frame buffer", new Object[0]));
                return false;
            }
            this.j.add(allocateFrameBuffer);
            this.k.add(allocateFrameBuffer);
        }
        return true;
    }
    
    protected void P() {
        for (int i = 0; i < this.j.size(); ++i) {
            final FrameBuffer frameBuffer = this.j.get(i);
            frameBuffer.free();
        }
        this.k.clear();
        this.j.clear();
    }
    
    public FrameBuffer Q() {
        if (this.k.size() == 0) {
            this.d(String.format("Out of free buffers, this should never happen", new Object[0]));
            return null;
        }
        final FrameBuffer frameBuffer = this.k.get(this.k.size() - 1);
        this.k.remove(this.k.size() - 1);
        return frameBuffer;
    }
    
    public void a(final FrameBuffer \u2603) {
        try {
            this.i.captureFrameBuffer_ReadPixels(\u2603);
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Trying to submit a frame to Twitch");
            final c a2 = a.a("Broadcast State");
            a2.a("Last reported errors", Arrays.toString(bqj.E.c()));
            a2.a("Buffer", \u2603);
            a2.a("Free buffer count", this.k.size());
            a2.a("Capture buffer count", this.j.size());
            throw new e(a);
        }
    }
    
    public ErrorCode b(final FrameBuffer \u2603) {
        if (this.p()) {
            this.J();
        }
        else if (!this.m()) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        final ErrorCode submitVideoFrame = this.i.submitVideoFrame(\u2603);
        if (submitVideoFrame != ErrorCode.TTV_EC_SUCCESS) {
            final String string = ErrorCode.getString(submitVideoFrame);
            if (ErrorCode.succeeded(submitVideoFrame)) {
                this.e(String.format("Warning in SubmitTexturePointer: %s\n", string));
            }
            else {
                this.d(String.format("Error in SubmitTexturePointer: %s\n", string));
                this.H();
            }
            if (this.c != null) {
                this.c.b(submitVideoFrame);
            }
        }
        return submitVideoFrame;
    }
    
    protected boolean a(final ErrorCode \u2603) {
        if (ErrorCode.failed(\u2603)) {
            this.d(ErrorCode.getString(\u2603));
            return false;
        }
        return true;
    }
    
    protected void d(final String \u2603) {
        this.F = \u2603;
        bqj.E.a("<Error> " + \u2603);
        bqj.D.error(bqn.a, "[Broadcast controller] {}", new Object[] { \u2603 });
    }
    
    protected void e(final String \u2603) {
        bqj.E.a("<Warning> " + \u2603);
        bqj.D.warn(bqn.a, "[Broadcast controller] {}", new Object[] { \u2603 });
    }
    
    static {
        D = LogManager.getLogger();
        E = new np<String>(String.class, 50);
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f, 
        g, 
        h, 
        i, 
        j, 
        k, 
        l, 
        m, 
        n;
    }
    
    public interface b
    {
        void a(final ErrorCode p0, final AuthToken p1);
        
        void a(final ErrorCode p0);
        
        void a(final ErrorCode p0, final GameInfo[] p1);
        
        void a(final a p0);
        
        void a();
        
        void a(final StreamInfo p0);
        
        void a(final IngestList p0);
        
        void b(final ErrorCode p0);
        
        void b();
        
        void c();
        
        void c(final ErrorCode p0);
    }
}
