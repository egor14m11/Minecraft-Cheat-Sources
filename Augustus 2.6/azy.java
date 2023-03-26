import tv.twitch.broadcast.IngestServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class azy extends axu
{
    private final axu a;
    private String f;
    private a g;
    
    public azy(final axu \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void b() {
        this.f = bnq.a("options.stream.ingest.title", new Object[0]);
        this.g = new a(this.j);
        if (!this.j.Y().w()) {
            this.j.Y().u();
        }
        this.n.add(new avs(1, this.l / 2 - 155, this.m - 24 - 6, 150, 20, bnq.a("gui.done", new Object[0])));
        this.n.add(new avs(2, this.l / 2 + 5, this.m - 24 - 6, 150, 20, bnq.a("options.stream.ingest.reset", new Object[0])));
    }
    
    @Override
    public void k() {
        super.k();
        this.g.p();
    }
    
    @Override
    public void m() {
        if (this.j.Y().w()) {
            this.j.Y().v().m();
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 1) {
            this.j.a(this.a);
        }
        else {
            this.j.t.R = "";
            this.j.t.b();
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.g.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.f, this.l / 2, 20, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    class a extends awi
    {
        public a(final ave \u2603) {
            super(\u2603, azy.this.l, azy.this.m, 32, azy.this.m - 35, (int)(\u2603.k.a * 3.5));
            this.b(false);
        }
        
        @Override
        protected int b() {
            return this.a.Y().s().length;
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
            this.a.t.R = this.a.Y().s()[\u2603].serverUrl;
            this.a.t.b();
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return this.a.Y().s()[\u2603].serverUrl.equals(this.a.t.R);
        }
        
        @Override
        protected void a() {
        }
        
        @Override
        protected void a(final int \u2603, int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final IngestServer ingestServer = this.a.Y().s()[\u2603];
            String s = ingestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
            String s2 = (int)ingestServer.bitrateKbps + " kbps";
            String s3 = null;
            final bql v = this.a.Y().v();
            if (v != null) {
                if (ingestServer == v.c()) {
                    s = a.k + s;
                    s2 = (int)(v.i() * 100.0f) + "%";
                }
                else if (\u2603 < v.d()) {
                    if (ingestServer.bitrateKbps == 0.0f) {
                        s2 = a.m + "Down!";
                    }
                }
                else {
                    s2 = a.q + "1234" + a.v + " kbps";
                }
            }
            else if (ingestServer.bitrateKbps == 0.0f) {
                s2 = a.m + "Down!";
            }
            \u2603 -= 15;
            if (this.a(\u2603)) {
                s3 = a.j + "(Preferred)";
            }
            else if (ingestServer.defaultServer) {
                s3 = a.k + "(Default)";
            }
            azy.this.c(azy.this.q, ingestServer.serverName, \u2603 + 2, \u2603 + 5, 16777215);
            azy.this.c(azy.this.q, s, \u2603 + 2, \u2603 + azy.this.q.a + 5 + 3, 3158064);
            azy.this.c(azy.this.q, s2, this.d() - 5 - azy.this.q.a(s2), \u2603 + 5, 8421504);
            if (s3 != null) {
                azy.this.c(azy.this.q, s3, this.d() - 5 - azy.this.q.a(s3), \u2603 + 5 + 3 + azy.this.q.a, 8421504);
            }
        }
        
        @Override
        protected int d() {
            return super.d() + 15;
        }
    }
}
