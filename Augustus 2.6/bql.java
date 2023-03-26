import tv.twitch.broadcast.StartFlags;
import com.google.common.collect.Lists;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.FrameBuffer;
import java.util.List;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.Stream;

// 
// Decompiled by Procyon v0.5.36
// 

public class bql
{
    protected a a;
    protected Stream b;
    protected IngestList c;
    protected b d;
    protected long e;
    protected long f;
    protected long g;
    protected RTMPState h;
    protected VideoParams i;
    protected AudioParams j;
    protected long k;
    protected List<FrameBuffer> l;
    protected boolean m;
    protected IStreamCallbacks n;
    protected IStatCallbacks o;
    protected IngestServer p;
    protected boolean q;
    protected boolean r;
    protected int s;
    protected int t;
    protected long u;
    protected float v;
    protected float w;
    protected boolean x;
    protected boolean y;
    protected boolean z;
    protected IStreamCallbacks A;
    protected IStatCallbacks B;
    
    public void a(final a \u2603) {
        this.a = \u2603;
    }
    
    public IngestServer c() {
        return this.p;
    }
    
    public int d() {
        return this.s;
    }
    
    public boolean f() {
        return this.d == bql.b.f || this.d == bql.b.h || this.d == bql.b.i;
    }
    
    public float i() {
        return this.w;
    }
    
    public bql(final Stream \u2603, final IngestList \u2603) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = bql.b.a;
        this.e = 8000L;
        this.f = 2000L;
        this.g = 0L;
        this.h = RTMPState.Invalid;
        this.i = null;
        this.j = null;
        this.k = 0L;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = false;
        this.r = false;
        this.s = -1;
        this.t = 0;
        this.u = 0L;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = new IStreamCallbacks() {
            @Override
            public void requestAuthTokenCallback(final ErrorCode \u2603, final AuthToken \u2603) {
            }
            
            @Override
            public void loginCallback(final ErrorCode \u2603, final ChannelInfo \u2603) {
            }
            
            @Override
            public void getIngestServersCallback(final ErrorCode \u2603, final IngestList \u2603) {
            }
            
            @Override
            public void getUserInfoCallback(final ErrorCode \u2603, final UserInfo \u2603) {
            }
            
            @Override
            public void getStreamInfoCallback(final ErrorCode \u2603, final StreamInfo \u2603) {
            }
            
            @Override
            public void getArchivingStateCallback(final ErrorCode \u2603, final ArchivingState \u2603) {
            }
            
            @Override
            public void runCommercialCallback(final ErrorCode \u2603) {
            }
            
            @Override
            public void setStreamInfoCallback(final ErrorCode \u2603) {
            }
            
            @Override
            public void getGameNameListCallback(final ErrorCode \u2603, final GameInfoList \u2603) {
            }
            
            @Override
            public void bufferUnlockCallback(final long \u2603) {
            }
            
            @Override
            public void startCallback(final ErrorCode \u2603) {
                bql.this.y = false;
                if (ErrorCode.succeeded(\u2603)) {
                    bql.this.x = true;
                    bql.this.k = System.currentTimeMillis();
                    bql.this.a(bql.b.c);
                }
                else {
                    bql.this.m = false;
                    bql.this.a(bql.b.e);
                }
            }
            
            @Override
            public void stopCallback(final ErrorCode \u2603) {
                if (ErrorCode.failed(\u2603)) {
                    System.out.println("IngestTester.stopCallback failed to stop - " + bql.this.p.serverName + ": " + \u2603.toString());
                }
                bql.this.z = false;
                bql.this.x = false;
                bql.this.a(bql.b.e);
                bql.this.p = null;
                if (bql.this.q) {
                    bql.this.a(bql.b.g);
                }
            }
            
            @Override
            public void sendActionMetaDataCallback(final ErrorCode \u2603) {
            }
            
            @Override
            public void sendStartSpanMetaDataCallback(final ErrorCode \u2603) {
            }
            
            @Override
            public void sendEndSpanMetaDataCallback(final ErrorCode \u2603) {
            }
        };
        this.B = new IStatCallbacks() {
            @Override
            public void statCallback(final StatType \u2603, final long \u2603) {
                switch (bql$3.a[\u2603.ordinal()]) {
                    case 1: {
                        bql.this.h = RTMPState.lookupValue((int)\u2603);
                        break;
                    }
                    case 2: {
                        bql.this.g = \u2603;
                        break;
                    }
                }
            }
        };
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public void j() {
        if (this.d != bql.b.a) {
            return;
        }
        this.s = 0;
        this.q = false;
        this.r = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.o = this.b.getStatCallbacks();
        this.b.setStatCallbacks(this.B);
        this.n = this.b.getStreamCallbacks();
        this.b.setStreamCallbacks(this.A);
        this.i = new VideoParams();
        this.i.targetFps = 60;
        this.i.maxKbps = 3500;
        this.i.outputWidth = 1280;
        this.i.outputHeight = 720;
        this.i.pixelFormat = PixelFormat.TTV_PF_BGRA;
        this.i.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        this.i.disableAdaptiveBitrate = true;
        this.i.verticalFlip = false;
        this.b.getDefaultParams(this.i);
        this.j = new AudioParams();
        this.j.audioEnabled = false;
        this.j.enableMicCapture = false;
        this.j.enablePlaybackCapture = false;
        this.j.enablePassthroughAudio = false;
        this.l = (List<FrameBuffer>)Lists.newArrayList();
        for (int n = 3, i = 0; i < n; ++i) {
            final FrameBuffer allocateFrameBuffer = this.b.allocateFrameBuffer(this.i.outputWidth * this.i.outputHeight * 4);
            if (!allocateFrameBuffer.getIsValid()) {
                this.p();
                this.a(bql.b.i);
                return;
            }
            this.l.add(allocateFrameBuffer);
            this.b.randomizeFrameBuffer(allocateFrameBuffer);
        }
        this.a(bql.b.b);
        this.k = System.currentTimeMillis();
    }
    
    public void k() {
        if (this.f() || this.d == bql.b.a) {
            return;
        }
        if (this.y || this.z) {
            return;
        }
        switch (bql$3.b[this.d.ordinal()]) {
            case 1:
            case 2: {
                if (this.p != null) {
                    if (this.r || !this.m) {
                        this.p.bitrateKbps = 0.0f;
                    }
                    this.b(this.p);
                    break;
                }
                this.k = 0L;
                this.r = false;
                this.m = true;
                if (this.d != bql.b.b) {
                    ++this.s;
                }
                if (this.s < this.c.getServers().length) {
                    this.a(this.p = this.c.getServers()[this.s]);
                    break;
                }
                this.a(bql.b.f);
                break;
            }
            case 3:
            case 4: {
                this.c(this.p);
                break;
            }
            case 5: {
                this.a(bql.b.h);
                break;
            }
        }
        this.o();
        if (this.d == bql.b.h || this.d == bql.b.f) {
            this.p();
        }
    }
    
    public void m() {
        if (this.f() || this.q) {
            return;
        }
        this.q = true;
        if (this.p != null) {
            this.p.bitrateKbps = 0.0f;
        }
    }
    
    protected boolean a(final IngestServer \u2603) {
        this.m = true;
        this.g = 0L;
        this.h = RTMPState.Idle;
        this.p = \u2603;
        this.y = true;
        this.a(bql.b.c);
        final ErrorCode start = this.b.start(this.i, this.j, \u2603, StartFlags.TTV_Start_BandwidthTest, true);
        if (ErrorCode.failed(start)) {
            this.y = false;
            this.m = false;
            this.a(bql.b.e);
            return false;
        }
        this.u = this.g;
        \u2603.bitrateKbps = 0.0f;
        this.t = 0;
        return true;
    }
    
    protected void b(final IngestServer \u2603) {
        if (this.y) {
            this.r = true;
        }
        else if (this.x) {
            this.z = true;
            final ErrorCode stop = this.b.stop(true);
            if (ErrorCode.failed(stop)) {
                this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
                System.out.println("Stop failed: " + stop.toString());
            }
            this.b.pollStats();
        }
        else {
            this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        }
    }
    
    protected long n() {
        return System.currentTimeMillis() - this.k;
    }
    
    protected void o() {
        final float n = (float)this.n();
        switch (bql$3.b[this.d.ordinal()]) {
            case 1:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9: {
                this.w = 0.0f;
                break;
            }
            case 2: {
                this.w = 1.0f;
                break;
            }
            default: {
                this.w = n / this.e;
                break;
            }
        }
        switch (bql$3.b[this.d.ordinal()]) {
            case 7:
            case 8:
            case 9: {
                this.v = 1.0f;
                break;
            }
            default: {
                this.v = this.s / (float)this.c.getServers().length;
                this.v += this.w / this.c.getServers().length;
                break;
            }
        }
    }
    
    protected boolean c(final IngestServer \u2603) {
        if (this.r || this.q || this.n() >= this.e) {
            this.a(bql.b.e);
            return true;
        }
        if (this.y || this.z) {
            return true;
        }
        final ErrorCode submitVideoFrame = this.b.submitVideoFrame(this.l.get(this.t));
        if (ErrorCode.failed(submitVideoFrame)) {
            this.m = false;
            this.a(bql.b.e);
            return false;
        }
        this.t = (this.t + 1) % this.l.size();
        this.b.pollStats();
        if (this.h == RTMPState.SendVideo) {
            this.a(bql.b.d);
            final long n = this.n();
            if (n > 0L && this.g > this.u) {
                \u2603.bitrateKbps = this.g * 8L / (float)this.n();
                this.u = this.g;
            }
        }
        return true;
    }
    
    protected void p() {
        this.p = null;
        if (this.l != null) {
            for (int i = 0; i < this.l.size(); ++i) {
                this.l.get(i).free();
            }
            this.l = null;
        }
        if (this.b.getStatCallbacks() == this.B) {
            this.b.setStatCallbacks(this.o);
            this.o = null;
        }
        if (this.b.getStreamCallbacks() == this.A) {
            this.b.setStreamCallbacks(this.n);
            this.n = null;
        }
    }
    
    protected void a(final b \u2603) {
        if (\u2603 == this.d) {
            return;
        }
        this.d = \u2603;
        if (this.a != null) {
            this.a.a(this, \u2603);
        }
    }
    
    public enum b
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f, 
        g, 
        h, 
        i;
    }
    
    public interface a
    {
        void a(final bql p0, final b p1);
    }
}
