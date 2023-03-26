import java.util.Arrays;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Maps;
import org.lwjgl.input.Keyboard;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class axq extends axu
{
    private static final List<a> a;
    private final axa f;
    private String g;
    private String h;
    private String i;
    private b r;
    private avs s;
    private avw t;
    
    public axq(final axa \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public void b() {
        this.n.clear();
        Keyboard.enableRepeatEvents(true);
        this.g = bnq.a("createWorld.customize.presets.title", new Object[0]);
        this.h = bnq.a("createWorld.customize.presets.share", new Object[0]);
        this.i = bnq.a("createWorld.customize.presets.list", new Object[0]);
        this.t = new avw(2, this.q, 50, 40, this.l - 100, 20);
        this.r = new b();
        this.t.f(1230);
        this.t.a(this.f.a());
        this.n.add(this.s = new avs(0, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("createWorld.customize.presets.select", new Object[0])));
        this.n.add(new avs(1, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
        this.a();
    }
    
    @Override
    public void k() {
        super.k();
        this.r.p();
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        this.t.a(\u2603, \u2603, \u2603);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (!this.t.a(\u2603, \u2603)) {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0 && this.g()) {
            this.f.a(this.t.b());
            this.j.a(this.f);
        }
        else if (\u2603.k == 1) {
            this.j.a(this.f);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.r.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.g, this.l / 2, 8, 16777215);
        this.c(this.q, this.h, 50, 30, 10526880);
        this.c(this.q, this.i, 50, 70, 10526880);
        this.t.g();
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void e() {
        this.t.a();
        super.e();
    }
    
    public void a() {
        final boolean g = this.g();
        this.s.l = g;
    }
    
    private boolean g() {
        return (this.r.u > -1 && this.r.u < axq.a.size()) || this.t.b().length() > 1;
    }
    
    private static void a(final String \u2603, final zw \u2603, final ady \u2603, final aqa... \u2603) {
        a(\u2603, \u2603, 0, \u2603, null, \u2603);
    }
    
    private static void a(final String \u2603, final zw \u2603, final ady \u2603, final List<String> \u2603, final aqa... \u2603) {
        a(\u2603, \u2603, 0, \u2603, \u2603, \u2603);
    }
    
    private static void a(final String \u2603, final zw \u2603, final int \u2603, final ady \u2603, final List<String> \u2603, final aqa... \u2603) {
        final apz apz = new apz();
        for (int i = \u2603.length - 1; i >= 0; --i) {
            apz.c().add(\u2603[i]);
        }
        apz.a(\u2603.az);
        apz.d();
        if (\u2603 != null) {
            for (final String s : \u2603) {
                apz.b().put(s, (Map<String, String>)Maps.newHashMap());
            }
        }
        axq.a.add(new a(\u2603, \u2603, \u2603, apz.toString()));
    }
    
    static {
        a = Lists.newArrayList();
        a("Classic Flat", zw.a(afi.c), ady.q, Arrays.asList("village"), new aqa(1, afi.c), new aqa(2, afi.d), new aqa(1, afi.h));
        a("Tunnelers' Dream", zw.a(afi.b), ady.s, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new aqa(1, afi.c), new aqa(5, afi.d), new aqa(230, afi.b), new aqa(1, afi.h));
        a("Water World", zy.ax, ady.N, Arrays.asList("biome_1", "oceanmonument"), new aqa(90, afi.j), new aqa(5, afi.m), new aqa(5, afi.d), new aqa(5, afi.b), new aqa(1, afi.h));
        a("Overworld", zw.a(afi.H), akc.a.b.a(), ady.q, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new aqa(1, afi.c), new aqa(3, afi.d), new aqa(59, afi.b), new aqa(1, afi.h));
        a("Snowy Kingdom", zw.a(afi.aH), ady.B, Arrays.asList("village", "biome_1"), new aqa(1, afi.aH), new aqa(1, afi.c), new aqa(3, afi.d), new aqa(59, afi.b), new aqa(1, afi.h));
        a("Bottomless Pit", zy.G, ady.q, Arrays.asList("village", "biome_1"), new aqa(1, afi.c), new aqa(3, afi.d), new aqa(2, afi.e));
        a("Desert", zw.a(afi.m), ady.r, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new aqa(8, afi.m), new aqa(52, afi.A), new aqa(3, afi.b), new aqa(1, afi.h));
        a("Redstone Ready", zy.aC, ady.r, new aqa(52, afi.A), new aqa(3, afi.b), new aqa(1, afi.h));
    }
    
    class b extends awi
    {
        public int u;
        
        public b() {
            super(axq.this.j, axq.this.l, axq.this.m, 80, axq.this.m - 37, 24);
            this.u = -1;
        }
        
        private void a(final int \u2603, final int \u2603, final zw \u2603, final int \u2603) {
            this.e(\u2603 + 1, \u2603 + 1);
            bfl.B();
            avc.c();
            axq.this.k.a(new zx(\u2603, 1, \u2603), \u2603 + 2, \u2603 + 2);
            avc.a();
            bfl.C();
        }
        
        private void e(final int \u2603, final int \u2603) {
            this.d(\u2603, \u2603, 0, 0);
        }
        
        private void d(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.P().a(avp.c);
            final float n = 0.0078125f;
            final float n2 = 0.0078125f;
            final int n3 = 18;
            final int n4 = 18;
            final bfx a = bfx.a();
            final bfd c = a.c();
            c.a(7, bms.g);
            c.b(\u2603 + 0, \u2603 + 18, (double)axq.this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
            c.b(\u2603 + 18, \u2603 + 18, (double)axq.this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
            c.b(\u2603 + 18, \u2603 + 0, (double)axq.this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
            c.b(\u2603 + 0, \u2603 + 0, (double)axq.this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
            a.b();
        }
        
        @Override
        protected int b() {
            return axq.a.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
            this.u = \u2603;
            axq.this.a();
            axq.this.t.a(axq.a.get(axq.this.r.u).d);
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return \u2603 == this.u;
        }
        
        @Override
        protected void a() {
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final a a = axq.a.get(\u2603);
            this.a(\u2603, \u2603, a.a, a.b);
            axq.this.q.a(a.c, \u2603 + 18 + 5, \u2603 + 6, 16777215);
        }
    }
    
    static class a
    {
        public zw a;
        public int b;
        public String c;
        public String d;
        
        public a(final zw \u2603, final int \u2603, final String \u2603, final String \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
    }
}
