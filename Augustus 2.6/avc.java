import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class avc
{
    private static FloatBuffer a;
    private static final aui b;
    private static final aui c;
    
    public static void a() {
        bfl.f();
        bfl.b(0);
        bfl.b(1);
        bfl.h();
    }
    
    public static void b() {
        bfl.e();
        bfl.a(0);
        bfl.a(1);
        bfl.g();
        bfl.a(1032, 5634);
        final float n = 0.4f;
        final float n2 = 0.6f;
        final float n3 = 0.0f;
        GL11.glLight(16384, 4611, a(avc.b.a, avc.b.b, avc.b.c, 0.0));
        GL11.glLight(16384, 4609, a(n2, n2, n2, 1.0f));
        GL11.glLight(16384, 4608, a(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16384, 4610, a(n3, n3, n3, 1.0f));
        GL11.glLight(16385, 4611, a(avc.c.a, avc.c.b, avc.c.c, 0.0));
        GL11.glLight(16385, 4609, a(n2, n2, n2, 1.0f));
        GL11.glLight(16385, 4608, a(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16385, 4610, a(n3, n3, n3, 1.0f));
        bfl.j(7424);
        GL11.glLightModel(2899, a(n, n, n, 1.0f));
    }
    
    private static FloatBuffer a(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return a((float)\u2603, (float)\u2603, (float)\u2603, (float)\u2603);
    }
    
    private static FloatBuffer a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        avc.a.clear();
        avc.a.put(\u2603).put(\u2603).put(\u2603).put(\u2603);
        avc.a.flip();
        return avc.a;
    }
    
    public static void c() {
        bfl.E();
        bfl.b(-30.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(165.0f, 1.0f, 0.0f, 0.0f);
        b();
        bfl.F();
    }
    
    static {
        avc.a = avd.h(16);
        b = new aui(0.20000000298023224, 1.0, -0.699999988079071).a();
        c = new aui(-0.20000000298023224, 1.0, 0.699999988079071).a();
    }
}
