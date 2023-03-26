import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfl
{
    private static a a;
    private static c b;
    private static c[] c;
    private static h d;
    private static b e;
    private static j f;
    private static k g;
    private static i h;
    private static l i;
    private static f j;
    private static q k;
    private static d l;
    private static n m;
    private static c n;
    private static int o;
    private static r[] p;
    private static int q;
    private static c r;
    private static g s;
    private static e t;
    
    public static void a() {
        GL11.glPushAttrib(8256);
    }
    
    public static void b() {
        GL11.glPopAttrib();
    }
    
    public static void c() {
        bfl.a.a.a();
    }
    
    public static void d() {
        bfl.a.a.b();
    }
    
    public static void a(final int \u2603, final float \u2603) {
        if (\u2603 != bfl.a.b || \u2603 != bfl.a.c) {
            GL11.glAlphaFunc(bfl.a.b = \u2603, bfl.a.c = \u2603);
        }
    }
    
    public static void e() {
        bfl.b.b();
    }
    
    public static void f() {
        bfl.b.a();
    }
    
    public static void a(final int \u2603) {
        bfl.c[\u2603].b();
    }
    
    public static void b(final int \u2603) {
        bfl.c[\u2603].a();
    }
    
    public static void g() {
        bfl.d.a.b();
    }
    
    public static void h() {
        bfl.d.a.a();
    }
    
    public static void a(final int \u2603, final int \u2603) {
        if (\u2603 != bfl.d.b || \u2603 != bfl.d.c) {
            GL11.glColorMaterial(bfl.d.b = \u2603, bfl.d.c = \u2603);
        }
    }
    
    public static void i() {
        bfl.f.a.a();
    }
    
    public static void j() {
        bfl.f.a.b();
    }
    
    public static void c(final int \u2603) {
        if (\u2603 != bfl.f.c) {
            GL11.glDepthFunc(bfl.f.c = \u2603);
        }
    }
    
    public static void a(final boolean \u2603) {
        if (\u2603 != bfl.f.b) {
            GL11.glDepthMask(bfl.f.b = \u2603);
        }
    }
    
    public static void k() {
        bfl.e.a.a();
    }
    
    public static void l() {
        bfl.e.a.b();
    }
    
    public static void b(final int \u2603, final int \u2603) {
        if (\u2603 != bfl.e.b || \u2603 != bfl.e.c) {
            GL11.glBlendFunc(bfl.e.b = \u2603, bfl.e.c = \u2603);
        }
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 != bfl.e.b || \u2603 != bfl.e.c || \u2603 != bfl.e.d || \u2603 != bfl.e.e) {
            bqs.c(bfl.e.b = \u2603, bfl.e.c = \u2603, bfl.e.d = \u2603, bfl.e.e = \u2603);
        }
    }
    
    public static void m() {
        bfl.g.a.b();
    }
    
    public static void n() {
        bfl.g.a.a();
    }
    
    public static void d(final int \u2603) {
        if (\u2603 != bfl.g.b) {
            GL11.glFogi(2917, bfl.g.b = \u2603);
        }
    }
    
    public static void a(final float \u2603) {
        if (\u2603 != bfl.g.c) {
            GL11.glFogf(2914, bfl.g.c = \u2603);
        }
    }
    
    public static void b(final float \u2603) {
        if (\u2603 != bfl.g.d) {
            GL11.glFogf(2915, bfl.g.d = \u2603);
        }
    }
    
    public static void c(final float \u2603) {
        if (\u2603 != bfl.g.e) {
            GL11.glFogf(2916, bfl.g.e = \u2603);
        }
    }
    
    public static void o() {
        bfl.h.a.b();
    }
    
    public static void p() {
        bfl.h.a.a();
    }
    
    public static void e(final int \u2603) {
        if (\u2603 != bfl.h.b) {
            GL11.glCullFace(bfl.h.b = \u2603);
        }
    }
    
    public static void q() {
        bfl.i.a.b();
    }
    
    public static void r() {
        bfl.i.a.a();
    }
    
    public static void a(final float \u2603, final float \u2603) {
        if (\u2603 != bfl.i.c || \u2603 != bfl.i.d) {
            GL11.glPolygonOffset(bfl.i.c = \u2603, bfl.i.d = \u2603);
        }
    }
    
    public static void u() {
        bfl.j.a.b();
    }
    
    public static void v() {
        bfl.j.a.a();
    }
    
    public static void f(final int \u2603) {
        if (\u2603 != bfl.j.b) {
            GL11.glLogicOp(bfl.j.b = \u2603);
        }
    }
    
    public static void a(final o \u2603) {
        c(\u2603).a.b();
    }
    
    public static void b(final o \u2603) {
        c(\u2603).a.a();
    }
    
    public static void a(final o \u2603, final int \u2603) {
        final p c = c(\u2603);
        if (\u2603 != c.c) {
            c.c = \u2603;
            GL11.glTexGeni(c.b, 9472, \u2603);
        }
    }
    
    public static void a(final o \u2603, final int \u2603, final FloatBuffer \u2603) {
        GL11.glTexGen(c(\u2603).b, \u2603, \u2603);
    }
    
    private static p c(final o \u2603) {
        switch (bfl$1.a[\u2603.ordinal()]) {
            case 1: {
                return bfl.k.a;
            }
            case 2: {
                return bfl.k.b;
            }
            case 3: {
                return bfl.k.c;
            }
            case 4: {
                return bfl.k.d;
            }
            default: {
                return bfl.k.a;
            }
        }
    }
    
    public static void g(final int \u2603) {
        if (bfl.o != \u2603 - bqs.q) {
            bfl.o = \u2603 - bqs.q;
            bqs.k(\u2603);
        }
    }
    
    public static void w() {
        bfl.p[bfl.o].a.b();
    }
    
    public static void x() {
        bfl.p[bfl.o].a.a();
    }
    
    public static int y() {
        return GL11.glGenTextures();
    }
    
    public static void h(final int \u2603) {
        GL11.glDeleteTextures(\u2603);
        for (final r r : bfl.p) {
            if (r.b == \u2603) {
                r.b = -1;
            }
        }
    }
    
    public static void i(final int \u2603) {
        if (\u2603 != bfl.p[bfl.o].b) {
            GL11.glBindTexture(3553, bfl.p[bfl.o].b = \u2603);
        }
    }
    
    public static void z() {
        bfl.n.b();
    }
    
    public static void A() {
        bfl.n.a();
    }
    
    public static void j(final int \u2603) {
        if (\u2603 != bfl.q) {
            GL11.glShadeModel(bfl.q = \u2603);
        }
    }
    
    public static void B() {
        bfl.r.b();
    }
    
    public static void C() {
        bfl.r.a();
    }
    
    public static void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        GL11.glViewport(\u2603, \u2603, \u2603, \u2603);
    }
    
    public static void a(final boolean \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (\u2603 != bfl.s.a || \u2603 != bfl.s.b || \u2603 != bfl.s.c || \u2603 != bfl.s.d) {
            GL11.glColorMask(bfl.s.a = \u2603, bfl.s.b = \u2603, bfl.s.c = \u2603, bfl.s.d = \u2603);
        }
    }
    
    public static void a(final double \u2603) {
        if (\u2603 != bfl.l.a) {
            GL11.glClearDepth(bfl.l.a = \u2603);
        }
    }
    
    public static void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 != bfl.l.b.a || \u2603 != bfl.l.b.b || \u2603 != bfl.l.b.c || \u2603 != bfl.l.b.d) {
            GL11.glClearColor(bfl.l.b.a = \u2603, bfl.l.b.b = \u2603, bfl.l.b.c = \u2603, bfl.l.b.d = \u2603);
        }
    }
    
    public static void m(final int \u2603) {
        GL11.glClear(\u2603);
    }
    
    public static void n(final int \u2603) {
        GL11.glMatrixMode(\u2603);
    }
    
    public static void D() {
        GL11.glLoadIdentity();
    }
    
    public static void E() {
        GL11.glPushMatrix();
    }
    
    public static void F() {
        GL11.glPopMatrix();
    }
    
    public static void a(final int \u2603, final FloatBuffer \u2603) {
        GL11.glGetFloat(\u2603, \u2603);
    }
    
    public static void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        GL11.glOrtho(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public static void b(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        GL11.glRotatef(\u2603, \u2603, \u2603, \u2603);
    }
    
    public static void a(final float \u2603, final float \u2603, final float \u2603) {
        GL11.glScalef(\u2603, \u2603, \u2603);
    }
    
    public static void a(final double \u2603, final double \u2603, final double \u2603) {
        GL11.glScaled(\u2603, \u2603, \u2603);
    }
    
    public static void b(final float \u2603, final float \u2603, final float \u2603) {
        GL11.glTranslatef(\u2603, \u2603, \u2603);
    }
    
    public static void b(final double \u2603, final double \u2603, final double \u2603) {
        GL11.glTranslated(\u2603, \u2603, \u2603);
    }
    
    public static void a(final FloatBuffer \u2603) {
        GL11.glMultMatrix(\u2603);
    }
    
    public static void c(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 != bfl.t.a || \u2603 != bfl.t.b || \u2603 != bfl.t.c || \u2603 != bfl.t.d) {
            GL11.glColor4f(bfl.t.a = \u2603, bfl.t.b = \u2603, bfl.t.c = \u2603, bfl.t.d = \u2603);
        }
    }
    
    public static void c(final float \u2603, final float \u2603, final float \u2603) {
        c(\u2603, \u2603, \u2603, 1.0f);
    }
    
    public static void G() {
        final e t = bfl.t;
        final e t2 = bfl.t;
        final e t3 = bfl.t;
        final e t4 = bfl.t;
        final float n = -1.0f;
        t4.d = n;
        t3.c = n;
        t2.b = n;
        t.a = n;
    }
    
    public static void o(final int \u2603) {
        GL11.glCallList(\u2603);
    }
    
    static {
        bfl.a = new a();
        bfl.b = new c(2896);
        bfl.c = new c[8];
        bfl.d = new h();
        bfl.e = new b();
        bfl.f = new j();
        bfl.g = new k();
        bfl.h = new i();
        bfl.i = new l();
        bfl.j = new f();
        bfl.k = new q();
        bfl.l = new d();
        bfl.m = new n();
        bfl.n = new c(2977);
        bfl.o = 0;
        bfl.p = new r[8];
        bfl.q = 7425;
        bfl.r = new c(32826);
        bfl.s = new g();
        bfl.t = new e();
        for (int i = 0; i < 8; ++i) {
            bfl.c[i] = new c(16384 + i);
        }
        for (int i = 0; i < 8; ++i) {
            bfl.p[i] = new r();
        }
    }
    
    static class r
    {
        public c a;
        public int b;
        
        private r() {
            this.a = new c(3553);
            this.b = 0;
        }
    }
    
    static class a
    {
        public c a;
        public int b;
        public float c;
        
        private a() {
            this.a = new c(3008);
            this.b = 519;
            this.c = -1.0f;
        }
    }
    
    static class h
    {
        public c a;
        public int b;
        public int c;
        
        private h() {
            this.a = new c(2903);
            this.b = 1032;
            this.c = 5634;
        }
    }
    
    static class b
    {
        public c a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        private b() {
            this.a = new c(3042);
            this.b = 1;
            this.c = 0;
            this.d = 1;
            this.e = 0;
        }
    }
    
    static class j
    {
        public c a;
        public boolean b;
        public int c;
        
        private j() {
            this.a = new c(2929);
            this.b = true;
            this.c = 513;
        }
    }
    
    static class k
    {
        public c a;
        public int b;
        public float c;
        public float d;
        public float e;
        
        private k() {
            this.a = new c(2912);
            this.b = 2048;
            this.c = 1.0f;
            this.d = 0.0f;
            this.e = 1.0f;
        }
    }
    
    static class i
    {
        public c a;
        public int b;
        
        private i() {
            this.a = new c(2884);
            this.b = 1029;
        }
    }
    
    static class l
    {
        public c a;
        public c b;
        public float c;
        public float d;
        
        private l() {
            this.a = new c(32823);
            this.b = new c(10754);
            this.c = 0.0f;
            this.d = 0.0f;
        }
    }
    
    static class f
    {
        public c a;
        public int b;
        
        private f() {
            this.a = new c(3058);
            this.b = 5379;
        }
    }
    
    static class d
    {
        public double a;
        public e b;
        public int c;
        
        private d() {
            this.a = 1.0;
            this.b = new e(0.0f, 0.0f, 0.0f, 0.0f);
            this.c = 0;
        }
    }
    
    static class m
    {
        public int a;
        public int b;
        public int c;
        
        private m() {
            this.a = 519;
            this.b = 0;
            this.c = -1;
        }
    }
    
    static class n
    {
        public m a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        private n() {
            this.a = new m();
            this.b = -1;
            this.c = 7680;
            this.d = 7680;
            this.e = 7680;
        }
    }
    
    static class q
    {
        public p a;
        public p b;
        public p c;
        public p d;
        
        private q() {
            this.a = new p(8192, 3168);
            this.b = new p(8193, 3169);
            this.c = new p(8194, 3170);
            this.d = new p(8195, 3171);
        }
    }
    
    static class p
    {
        public c a;
        public int b;
        public int c;
        
        public p(final int \u2603, final int \u2603) {
            this.c = -1;
            this.b = \u2603;
            this.a = new c(\u2603);
        }
    }
    
    public enum o
    {
        a, 
        b, 
        c, 
        d;
    }
    
    static class g
    {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        
        private g() {
            this.a = true;
            this.b = true;
            this.c = true;
            this.d = true;
        }
    }
    
    static class e
    {
        public float a;
        public float b;
        public float c;
        public float d;
        
        public e() {
            this.a = 1.0f;
            this.b = 1.0f;
            this.c = 1.0f;
            this.d = 1.0f;
        }
        
        public e(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
            this.a = 1.0f;
            this.b = 1.0f;
            this.c = 1.0f;
            this.d = 1.0f;
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
    }
    
    static class c
    {
        private final int a;
        private boolean b;
        
        public c(final int \u2603) {
            this.b = false;
            this.a = \u2603;
        }
        
        public void a() {
            this.a(false);
        }
        
        public void b() {
            this.a(true);
        }
        
        public void a(final boolean \u2603) {
            if (\u2603 != this.b) {
                this.b = \u2603;
                if (\u2603) {
                    GL11.glEnable(this.a);
                }
                else {
                    GL11.glDisable(this.a);
                }
            }
        }
    }
}
