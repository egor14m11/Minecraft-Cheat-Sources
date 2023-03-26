import org.lwjgl.util.glu.GLU;
import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class auz
{
    private static final IntBuffer a;
    private static final FloatBuffer b;
    private static final FloatBuffer c;
    private static final FloatBuffer d;
    private static aui e;
    private static float f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;
    
    public static void a(final wn \u2603, final boolean \u2603) {
        bfl.a(2982, auz.b);
        bfl.a(2983, auz.c);
        GL11.glGetInteger(2978, auz.a);
        final float winx = (float)((auz.a.get(0) + auz.a.get(2)) / 2);
        final float winy = (float)((auz.a.get(1) + auz.a.get(3)) / 2);
        GLU.gluUnProject(winx, winy, 0.0f, auz.b, auz.c, auz.a, auz.d);
        auz.e = new aui(auz.d.get(0), auz.d.get(1), auz.d.get(2));
        final int n = \u2603 ? 1 : 0;
        final float z = \u2603.z;
        final float y = \u2603.y;
        auz.f = ns.b(y * 3.1415927f / 180.0f) * (1 - n * 2);
        auz.h = ns.a(y * 3.1415927f / 180.0f) * (1 - n * 2);
        auz.i = -auz.h * ns.a(z * 3.1415927f / 180.0f) * (1 - n * 2);
        auz.j = auz.f * ns.a(z * 3.1415927f / 180.0f) * (1 - n * 2);
        auz.g = ns.b(z * 3.1415927f / 180.0f);
    }
    
    public static aui a(final pk \u2603, final double \u2603) {
        final double n = \u2603.p + (\u2603.s - \u2603.p) * \u2603;
        final double n2 = \u2603.q + (\u2603.t - \u2603.q) * \u2603;
        final double n3 = \u2603.r + (\u2603.u - \u2603.r) * \u2603;
        final double \u26032 = n + auz.e.a;
        final double \u26033 = n2 + auz.e.b;
        final double \u26034 = n3 + auz.e.c;
        return new aui(\u26032, \u26033, \u26034);
    }
    
    public static afh a(final adm \u2603, final pk \u2603, final float \u2603) {
        final aui a = a(\u2603, \u2603);
        final cj \u26032 = new cj(a);
        final alz p = \u2603.p(\u26032);
        afh afh = p.c();
        if (afh.t().d()) {
            float n = 0.0f;
            if (p.c() instanceof ahv) {
                n = ahv.b(p.b((amo<Integer>)ahv.b)) - 0.11111111f;
            }
            final float n2 = \u26032.o() + 1 - n;
            if (a.b >= n2) {
                afh = \u2603.p(\u26032.a()).c();
            }
        }
        return afh;
    }
    
    public static aui a() {
        return auz.e;
    }
    
    public static float b() {
        return auz.f;
    }
    
    public static float c() {
        return auz.g;
    }
    
    public static float d() {
        return auz.h;
    }
    
    public static float e() {
        return auz.i;
    }
    
    public static float f() {
        return auz.j;
    }
    
    static {
        a = avd.f(16);
        b = avd.h(16);
        c = avd.h(16);
        d = avd.h(3);
        auz.e = new aui(0.0, 0.0, 0.0);
    }
}
