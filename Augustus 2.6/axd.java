import com.google.common.primitives.Floats;
import java.util.Random;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class axd extends axu implements avx.a, awg.b
{
    private axb i;
    protected String a;
    protected String f;
    protected String g;
    protected String[] h;
    private awg r;
    private avs s;
    private avs t;
    private avs u;
    private avs v;
    private avs w;
    private avs x;
    private avs y;
    private avs z;
    private boolean A;
    private int B;
    private boolean C;
    private Predicate<String> D;
    private ant.a E;
    private ant.a F;
    private Random G;
    
    public axd(final axu \u2603, final String \u2603) {
        this.a = "Customize World Settings";
        this.f = "Page 1 of 3";
        this.g = "Basic Settings";
        this.h = new String[4];
        this.A = false;
        this.B = 0;
        this.C = false;
        this.D = new Predicate<String>() {
            public boolean a(final String \u2603) {
                final Float tryParse = Floats.tryParse(\u2603);
                return \u2603.length() == 0 || (tryParse != null && Floats.isFinite(tryParse) && tryParse >= 0.0f);
            }
        };
        this.E = new ant.a();
        this.G = new Random();
        this.i = (axb)\u2603;
        this.a(\u2603);
    }
    
    @Override
    public void b() {
        int e = 0;
        int n = 0;
        if (this.r != null) {
            e = this.r.e();
            n = this.r.n();
        }
        this.a = bnq.a("options.customizeTitle", new Object[0]);
        this.n.clear();
        this.n.add(this.v = new avs(302, 20, 5, 80, 20, bnq.a("createWorld.customize.custom.prev", new Object[0])));
        this.n.add(this.w = new avs(303, this.l - 100, 5, 80, 20, bnq.a("createWorld.customize.custom.next", new Object[0])));
        this.n.add(this.u = new avs(304, this.l / 2 - 187, this.m - 27, 90, 20, bnq.a("createWorld.customize.custom.defaults", new Object[0])));
        this.n.add(this.t = new avs(301, this.l / 2 - 92, this.m - 27, 90, 20, bnq.a("createWorld.customize.custom.randomize", new Object[0])));
        this.n.add(this.z = new avs(305, this.l / 2 + 3, this.m - 27, 90, 20, bnq.a("createWorld.customize.custom.presets", new Object[0])));
        this.n.add(this.s = new avs(300, this.l / 2 + 98, this.m - 27, 90, 20, bnq.a("gui.done", new Object[0])));
        this.u.l = this.A;
        this.x = new avs(306, this.l / 2 - 55, 160, 50, 20, bnq.a("gui.yes", new Object[0]));
        this.x.m = false;
        this.n.add(this.x);
        this.y = new avs(307, this.l / 2 + 5, 160, 50, 20, bnq.a("gui.no", new Object[0]));
        this.y.m = false;
        this.n.add(this.y);
        if (this.B != 0) {
            this.x.m = true;
            this.y.m = true;
        }
        this.f();
        if (e != 0) {
            this.r.c(e);
            this.r.h(n);
            this.i();
        }
    }
    
    @Override
    public void k() {
        super.k();
        this.r.p();
    }
    
    private void f() {
        final awg.f[] array = { new awg.g(160, bnq.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, (float)this.F.r), new awg.a(148, bnq.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.F.s), new awg.a(150, bnq.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.F.v), new awg.a(151, bnq.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.F.w), new awg.a(152, bnq.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.F.x), new awg.a(153, bnq.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.F.y), new awg.a(210, bnq.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.F.z), new awg.a(154, bnq.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.F.A), new awg.a(149, bnq.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.F.t), new awg.g(157, bnq.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, (float)this.F.u), new awg.a(155, bnq.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.F.B), new awg.g(158, bnq.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, (float)this.F.C), new awg.a(156, bnq.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.F.D), new awg.g(159, bnq.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, (float)this.F.E), new awg.a(161, bnq.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.F.F), new awg.g(162, bnq.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, (float)this.F.G), new awg.g(163, bnq.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, (float)this.F.H), new awg.g(164, bnq.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, (float)this.F.I) };
        final awg.f[] array2 = { new awg.e(416, bnq.a("tile.dirt.name", new Object[0]), false), null, new awg.g(165, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.J), new awg.g(166, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.K), new awg.g(167, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.L), new awg.g(168, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.M), new awg.e(417, bnq.a("tile.gravel.name", new Object[0]), false), null, new awg.g(169, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.N), new awg.g(170, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.O), new awg.g(171, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.P), new awg.g(172, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.Q), new awg.e(418, bnq.a("tile.stone.granite.name", new Object[0]), false), null, new awg.g(173, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.R), new awg.g(174, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.S), new awg.g(175, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.T), new awg.g(176, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.U), new awg.e(419, bnq.a("tile.stone.diorite.name", new Object[0]), false), null, new awg.g(177, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.V), new awg.g(178, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.W), new awg.g(179, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.X), new awg.g(180, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.Y), new awg.e(420, bnq.a("tile.stone.andesite.name", new Object[0]), false), null, new awg.g(181, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.Z), new awg.g(182, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.aa), new awg.g(183, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ab), new awg.g(184, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ac), new awg.e(421, bnq.a("tile.oreCoal.name", new Object[0]), false), null, new awg.g(185, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.ad), new awg.g(186, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.ae), new awg.g(187, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.af), new awg.g(189, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ag), new awg.e(422, bnq.a("tile.oreIron.name", new Object[0]), false), null, new awg.g(190, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.ah), new awg.g(191, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.ai), new awg.g(192, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.aj), new awg.g(193, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ak), new awg.e(423, bnq.a("tile.oreGold.name", new Object[0]), false), null, new awg.g(194, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.al), new awg.g(195, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.am), new awg.g(196, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.an), new awg.g(197, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ao), new awg.e(424, bnq.a("tile.oreRedstone.name", new Object[0]), false), null, new awg.g(198, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.ap), new awg.g(199, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.aq), new awg.g(200, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.ar), new awg.g(201, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.as), new awg.e(425, bnq.a("tile.oreDiamond.name", new Object[0]), false), null, new awg.g(202, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.at), new awg.g(203, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.au), new awg.g(204, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.av), new awg.g(205, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.aw), new awg.e(426, bnq.a("tile.oreLapis.name", new Object[0]), false), null, new awg.g(206, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.F.ax), new awg.g(207, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.F.ay), new awg.g(208, bnq.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.az), new awg.g(209, bnq.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, (float)this.F.aA) };
        final awg.f[] array3 = { new awg.g(100, bnq.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.F.i), new awg.g(101, bnq.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.F.j), new awg.g(102, bnq.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.F.k), new awg.g(103, bnq.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.F.f), new awg.g(104, bnq.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.F.g), new awg.g(105, bnq.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.F.h), new awg.g(106, bnq.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.F.l), new awg.g(107, bnq.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.b), new awg.g(108, bnq.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.c), new awg.g(109, bnq.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.F.m), new awg.g(110, bnq.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.d), new awg.g(111, bnq.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.e), new awg.g(112, bnq.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.n), new awg.g(113, bnq.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.o), new awg.g(114, bnq.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.p), new awg.g(115, bnq.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.q) };
        final awg.f[] array4 = { new awg.e(400, bnq.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new awg.c(132, String.format("%5.3f", this.F.i), false, this.D), new awg.e(401, bnq.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new awg.c(133, String.format("%5.3f", this.F.j), false, this.D), new awg.e(402, bnq.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new awg.c(134, String.format("%5.3f", this.F.k), false, this.D), new awg.e(403, bnq.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new awg.c(135, String.format("%5.3f", this.F.f), false, this.D), new awg.e(404, bnq.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new awg.c(136, String.format("%5.3f", this.F.g), false, this.D), new awg.e(405, bnq.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new awg.c(137, String.format("%2.3f", this.F.h), false, this.D), new awg.e(406, bnq.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new awg.c(138, String.format("%2.3f", this.F.l), false, this.D), new awg.e(407, bnq.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new awg.c(139, String.format("%5.3f", this.F.b), false, this.D), new awg.e(408, bnq.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new awg.c(140, String.format("%5.3f", this.F.c), false, this.D), new awg.e(409, bnq.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new awg.c(141, String.format("%2.3f", this.F.m), false, this.D), new awg.e(410, bnq.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new awg.c(142, String.format("%5.3f", this.F.d), false, this.D), new awg.e(411, bnq.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new awg.c(143, String.format("%5.3f", this.F.e), false, this.D), new awg.e(412, bnq.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new awg.c(144, String.format("%2.3f", this.F.n), false, this.D), new awg.e(413, bnq.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new awg.c(145, String.format("%2.3f", this.F.o), false, this.D), new awg.e(414, bnq.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new awg.c(146, String.format("%2.3f", this.F.p), false, this.D), new awg.e(415, bnq.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new awg.c(147, String.format("%2.3f", this.F.q), false, this.D) };
        this.r = new awg(this.j, this.l, this.m, 32, this.m - 32, 25, this, new awg.f[][] { array, array2, array3, array4 });
        for (int i = 0; i < 4; ++i) {
            this.h[i] = bnq.a("createWorld.customize.custom.page" + i, new Object[0]);
        }
        this.i();
    }
    
    public String a() {
        return this.F.toString().replace("\n", "");
    }
    
    public void a(final String \u2603) {
        if (\u2603 != null && \u2603.length() != 0) {
            this.F = ant.a.a(\u2603);
        }
        else {
            this.F = new ant.a();
        }
    }
    
    @Override
    public void a(final int \u2603, final String \u2603) {
        float float1 = 0.0f;
        try {
            float1 = Float.parseFloat(\u2603);
        }
        catch (NumberFormatException ex) {}
        float n = 0.0f;
        switch (\u2603) {
            case 139: {
                final ant.a f = this.F;
                final float a = ns.a(float1, 1.0f, 6000.0f);
                f.b = a;
                n = a;
                break;
            }
            case 140: {
                final ant.a f2 = this.F;
                final float a2 = ns.a(float1, 1.0f, 6000.0f);
                f2.c = a2;
                n = a2;
                break;
            }
            case 142: {
                final ant.a f3 = this.F;
                final float a3 = ns.a(float1, 1.0f, 5000.0f);
                f3.d = a3;
                n = a3;
                break;
            }
            case 143: {
                final ant.a f4 = this.F;
                final float a4 = ns.a(float1, 1.0f, 5000.0f);
                f4.e = a4;
                n = a4;
                break;
            }
            case 135: {
                final ant.a f5 = this.F;
                final float a5 = ns.a(float1, 1.0f, 2000.0f);
                f5.f = a5;
                n = a5;
                break;
            }
            case 136: {
                final ant.a f6 = this.F;
                final float a6 = ns.a(float1, 1.0f, 2000.0f);
                f6.g = a6;
                n = a6;
                break;
            }
            case 137: {
                final ant.a f7 = this.F;
                final float a7 = ns.a(float1, 0.01f, 20.0f);
                f7.h = a7;
                n = a7;
                break;
            }
            case 132: {
                final ant.a f8 = this.F;
                final float a8 = ns.a(float1, 1.0f, 5000.0f);
                f8.i = a8;
                n = a8;
                break;
            }
            case 133: {
                final ant.a f9 = this.F;
                final float a9 = ns.a(float1, 1.0f, 5000.0f);
                f9.j = a9;
                n = a9;
                break;
            }
            case 134: {
                final ant.a f10 = this.F;
                final float a10 = ns.a(float1, 1.0f, 5000.0f);
                f10.k = a10;
                n = a10;
                break;
            }
            case 138: {
                final ant.a f11 = this.F;
                final float a11 = ns.a(float1, 1.0f, 25.0f);
                f11.l = a11;
                n = a11;
                break;
            }
            case 141: {
                final ant.a f12 = this.F;
                final float a12 = ns.a(float1, 0.01f, 50.0f);
                f12.m = a12;
                n = a12;
                break;
            }
            case 144: {
                final ant.a f13 = this.F;
                final float a13 = ns.a(float1, 1.0f, 20.0f);
                f13.n = a13;
                n = a13;
                break;
            }
            case 145: {
                final ant.a f14 = this.F;
                final float a14 = ns.a(float1, 0.0f, 20.0f);
                f14.o = a14;
                n = a14;
                break;
            }
            case 146: {
                final ant.a f15 = this.F;
                final float a15 = ns.a(float1, 1.0f, 20.0f);
                f15.p = a15;
                n = a15;
                break;
            }
            case 147: {
                final ant.a f16 = this.F;
                final float a16 = ns.a(float1, 0.0f, 20.0f);
                f16.q = a16;
                n = a16;
                break;
            }
        }
        if (n != float1 && float1 != 0.0f) {
            ((avw)this.r.d(\u2603)).a(this.b(\u2603, n));
        }
        ((avx)this.r.d(\u2603 - 132 + 100)).a(n, false);
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }
    
    private void a(final boolean \u2603) {
        this.A = \u2603;
        this.u.l = \u2603;
    }
    
    @Override
    public String a(final int \u2603, final String \u2603, final float \u2603) {
        return \u2603 + ": " + this.b(\u2603, \u2603);
    }
    
    private String b(final int \u2603, final float \u2603) {
        switch (\u2603) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 107:
            case 108:
            case 110:
            case 111:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 139:
            case 140:
            case 142:
            case 143: {
                return String.format("%5.3f", \u2603);
            }
            case 105:
            case 106:
            case 109:
            case 112:
            case 113:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 145:
            case 146:
            case 147: {
                return String.format("%2.3f", \u2603);
            }
            case 162: {
                if (\u2603 < 0.0f) {
                    return bnq.a("gui.all", new Object[0]);
                }
                if ((int)\u2603 >= ady.x.az) {
                    final ady ady = ady.n()[(int)\u2603 + 2];
                    return (ady != null) ? ady.ah : "?";
                }
                final ady ady = ady.n()[(int)\u2603];
                return (ady != null) ? ady.ah : "?";
            }
            default: {
                return String.format("%d", (int)\u2603);
            }
        }
    }
    
    @Override
    public void a(final int \u2603, final boolean \u2603) {
        switch (\u2603) {
            case 148: {
                this.F.s = \u2603;
                break;
            }
            case 149: {
                this.F.t = \u2603;
                break;
            }
            case 150: {
                this.F.v = \u2603;
                break;
            }
            case 151: {
                this.F.w = \u2603;
                break;
            }
            case 152: {
                this.F.x = \u2603;
                break;
            }
            case 153: {
                this.F.y = \u2603;
                break;
            }
            case 154: {
                this.F.A = \u2603;
                break;
            }
            case 210: {
                this.F.z = \u2603;
                break;
            }
            case 155: {
                this.F.B = \u2603;
                break;
            }
            case 156: {
                this.F.D = \u2603;
                break;
            }
            case 161: {
                this.F.F = \u2603;
                break;
            }
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }
    
    @Override
    public void a(final int \u2603, final float \u2603) {
        switch (\u2603) {
            case 107: {
                this.F.b = \u2603;
                break;
            }
            case 108: {
                this.F.c = \u2603;
                break;
            }
            case 110: {
                this.F.d = \u2603;
                break;
            }
            case 111: {
                this.F.e = \u2603;
                break;
            }
            case 103: {
                this.F.f = \u2603;
                break;
            }
            case 104: {
                this.F.g = \u2603;
                break;
            }
            case 105: {
                this.F.h = \u2603;
                break;
            }
            case 100: {
                this.F.i = \u2603;
                break;
            }
            case 101: {
                this.F.j = \u2603;
                break;
            }
            case 102: {
                this.F.k = \u2603;
                break;
            }
            case 106: {
                this.F.l = \u2603;
                break;
            }
            case 109: {
                this.F.m = \u2603;
                break;
            }
            case 112: {
                this.F.n = \u2603;
                break;
            }
            case 113: {
                this.F.o = \u2603;
                break;
            }
            case 114: {
                this.F.p = \u2603;
                break;
            }
            case 115: {
                this.F.q = \u2603;
                break;
            }
            case 157: {
                this.F.u = (int)\u2603;
                break;
            }
            case 158: {
                this.F.C = (int)\u2603;
                break;
            }
            case 159: {
                this.F.E = (int)\u2603;
                break;
            }
            case 160: {
                this.F.r = (int)\u2603;
                break;
            }
            case 162: {
                this.F.G = (int)\u2603;
                break;
            }
            case 163: {
                this.F.H = (int)\u2603;
                break;
            }
            case 164: {
                this.F.I = (int)\u2603;
                break;
            }
            case 166: {
                this.F.K = (int)\u2603;
                break;
            }
            case 165: {
                this.F.J = (int)\u2603;
                break;
            }
            case 167: {
                this.F.L = (int)\u2603;
                break;
            }
            case 168: {
                this.F.M = (int)\u2603;
                break;
            }
            case 170: {
                this.F.O = (int)\u2603;
                break;
            }
            case 169: {
                this.F.N = (int)\u2603;
                break;
            }
            case 171: {
                this.F.P = (int)\u2603;
                break;
            }
            case 172: {
                this.F.Q = (int)\u2603;
                break;
            }
            case 174: {
                this.F.S = (int)\u2603;
                break;
            }
            case 173: {
                this.F.R = (int)\u2603;
                break;
            }
            case 175: {
                this.F.T = (int)\u2603;
                break;
            }
            case 176: {
                this.F.U = (int)\u2603;
                break;
            }
            case 178: {
                this.F.W = (int)\u2603;
                break;
            }
            case 177: {
                this.F.V = (int)\u2603;
                break;
            }
            case 179: {
                this.F.X = (int)\u2603;
                break;
            }
            case 180: {
                this.F.Y = (int)\u2603;
                break;
            }
            case 182: {
                this.F.aa = (int)\u2603;
                break;
            }
            case 181: {
                this.F.Z = (int)\u2603;
                break;
            }
            case 183: {
                this.F.ab = (int)\u2603;
                break;
            }
            case 184: {
                this.F.ac = (int)\u2603;
                break;
            }
            case 186: {
                this.F.ae = (int)\u2603;
                break;
            }
            case 185: {
                this.F.ad = (int)\u2603;
                break;
            }
            case 187: {
                this.F.af = (int)\u2603;
                break;
            }
            case 189: {
                this.F.ag = (int)\u2603;
                break;
            }
            case 191: {
                this.F.ai = (int)\u2603;
                break;
            }
            case 190: {
                this.F.ah = (int)\u2603;
                break;
            }
            case 192: {
                this.F.aj = (int)\u2603;
                break;
            }
            case 193: {
                this.F.ak = (int)\u2603;
                break;
            }
            case 195: {
                this.F.am = (int)\u2603;
                break;
            }
            case 194: {
                this.F.al = (int)\u2603;
                break;
            }
            case 196: {
                this.F.an = (int)\u2603;
                break;
            }
            case 197: {
                this.F.ao = (int)\u2603;
                break;
            }
            case 199: {
                this.F.aq = (int)\u2603;
                break;
            }
            case 198: {
                this.F.ap = (int)\u2603;
                break;
            }
            case 200: {
                this.F.ar = (int)\u2603;
                break;
            }
            case 201: {
                this.F.as = (int)\u2603;
                break;
            }
            case 203: {
                this.F.au = (int)\u2603;
                break;
            }
            case 202: {
                this.F.at = (int)\u2603;
                break;
            }
            case 204: {
                this.F.av = (int)\u2603;
                break;
            }
            case 205: {
                this.F.aw = (int)\u2603;
                break;
            }
            case 207: {
                this.F.ay = (int)\u2603;
                break;
            }
            case 206: {
                this.F.ax = (int)\u2603;
                break;
            }
            case 208: {
                this.F.az = (int)\u2603;
                break;
            }
            case 209: {
                this.F.aA = (int)\u2603;
                break;
            }
        }
        if (\u2603 >= 100 && \u2603 < 116) {
            final avp d = this.r.d(\u2603 - 100 + 132);
            if (d != null) {
                ((avw)d).a(this.b(\u2603, \u2603));
            }
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        switch (\u2603.k) {
            case 300: {
                this.i.a = this.F.toString();
                this.j.a(this.i);
                break;
            }
            case 305: {
                this.j.a(new axc(this));
                break;
            }
            case 301: {
                for (int i = 0; i < this.r.b(); ++i) {
                    final awg.d e = this.r.e(i);
                    final avp a = e.a();
                    if (a instanceof avs) {
                        final avs avs = (avs)a;
                        if (avs instanceof avx) {
                            final float \u26032 = ((avx)avs).d() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                            ((avx)avs).a(ns.a(\u26032, 0.0f, 1.0f));
                        }
                        else if (avs instanceof awb) {
                            ((awb)avs).b(this.G.nextBoolean());
                        }
                    }
                    final avp b = e.b();
                    if (b instanceof avs) {
                        final avs avs2 = (avs)b;
                        if (avs2 instanceof avx) {
                            final float \u26033 = ((avx)avs2).d() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                            ((avx)avs2).a(ns.a(\u26033, 0.0f, 1.0f));
                        }
                        else if (avs2 instanceof awb) {
                            ((awb)avs2).b(this.G.nextBoolean());
                        }
                    }
                }
                break;
            }
            case 302: {
                this.r.h();
                this.i();
                break;
            }
            case 303: {
                this.r.i();
                this.i();
                break;
            }
            case 304: {
                if (!this.A) {
                    break;
                }
                this.b(304);
                break;
            }
            case 307: {
                this.B = 0;
                this.h();
                break;
            }
            case 306: {
                this.h();
                break;
            }
        }
    }
    
    private void g() {
        this.F.a();
        this.f();
        this.a(false);
    }
    
    private void b(final int \u2603) {
        this.B = \u2603;
        this.b(true);
    }
    
    private void h() {
        switch (this.B) {
            case 300: {
                this.a((avs)this.r.d(300));
                break;
            }
            case 304: {
                this.g();
                break;
            }
        }
        this.B = 0;
        this.C = true;
        this.b(false);
    }
    
    private void b(final boolean \u2603) {
        this.x.m = \u2603;
        this.y.m = \u2603;
        this.t.l = !\u2603;
        this.s.l = !\u2603;
        this.v.l = !\u2603;
        this.w.l = !\u2603;
        this.u.l = (this.A && !\u2603);
        this.z.l = !\u2603;
        this.r.a(!\u2603);
    }
    
    private void i() {
        this.v.l = (this.r.e() != 0);
        this.w.l = (this.r.e() != this.r.f() - 1);
        this.f = bnq.a("book.pageIndicator", this.r.e() + 1, this.r.f());
        this.g = this.h[this.r.e()];
        this.t.l = (this.r.e() != this.r.f() - 1);
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        super.a(\u2603, \u2603);
        if (this.B != 0) {
            return;
        }
        switch (\u2603) {
            case 208: {
                this.a(-1.0f);
                break;
            }
            case 200: {
                this.a(1.0f);
                break;
            }
            default: {
                this.r.a(\u2603, \u2603);
                break;
            }
        }
    }
    
    private void a(final float \u2603) {
        final avp g = this.r.g();
        if (!(g instanceof avw)) {
            return;
        }
        float n = \u2603;
        if (axu.r()) {
            n *= 0.1f;
            if (axu.q()) {
                n *= 0.1f;
            }
        }
        else if (axu.q()) {
            n *= 10.0f;
            if (axu.s()) {
                n *= 10.0f;
            }
        }
        final avw avw = (avw)g;
        Float n2 = Floats.tryParse(avw.b());
        if (n2 == null) {
            return;
        }
        n2 += n;
        final int d = avw.d();
        final String b = this.b(avw.d(), n2);
        avw.a(b);
        this.a(d, b);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (this.B != 0 || this.C) {
            return;
        }
        this.r.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        super.b(\u2603, \u2603, \u2603);
        if (this.C) {
            this.C = false;
            return;
        }
        if (this.B != 0) {
            return;
        }
        this.r.c(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.r.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.a, this.l / 2, 2, 16777215);
        this.a(this.q, this.f, this.l / 2, 12, 16777215);
        this.a(this.q, this.g, this.l / 2, 22, 16777215);
        super.a(\u2603, \u2603, \u2603);
        if (this.B != 0) {
            avp.a(0, 0, this.l, this.m, Integer.MIN_VALUE);
            this.a(this.l / 2 - 91, this.l / 2 + 90, 99, -2039584);
            this.a(this.l / 2 - 91, this.l / 2 + 90, 185, -6250336);
            this.b(this.l / 2 - 91, 99, 185, -2039584);
            this.b(this.l / 2 + 90, 99, 185, -6250336);
            final float n = 85.0f;
            final float n2 = 180.0f;
            bfl.f();
            bfl.n();
            final bfx a = bfx.a();
            final bfd c = a.c();
            this.j.P().a(axd.b);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            final float n3 = 32.0f;
            c.a(7, bms.i);
            c.b(this.l / 2 - 90, 185.0, 0.0).a(0.0, 2.65625).b(64, 64, 64, 64).d();
            c.b(this.l / 2 + 90, 185.0, 0.0).a(5.625, 2.65625).b(64, 64, 64, 64).d();
            c.b(this.l / 2 + 90, 100.0, 0.0).a(5.625, 0.0).b(64, 64, 64, 64).d();
            c.b(this.l / 2 - 90, 100.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 64).d();
            a.b();
            this.a(this.q, bnq.a("createWorld.customize.custom.confirmTitle", new Object[0]), this.l / 2, 105, 16777215);
            this.a(this.q, bnq.a("createWorld.customize.custom.confirm1", new Object[0]), this.l / 2, 125, 16777215);
            this.a(this.q, bnq.a("createWorld.customize.custom.confirm2", new Object[0]), this.l / 2, 135, 16777215);
            this.x.a(this.j, \u2603, \u2603);
            this.y.a(this.j, \u2603, \u2603);
        }
    }
}
