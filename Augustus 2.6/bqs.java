import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.ARBBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.ARBShaderObjects;
import oshi.hardware.Processor;
import org.lwjgl.opengl.ContextCapabilities;
import oshi.SystemInfo;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqs
{
    public static boolean a;
    public static boolean b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static int T;
    public static boolean l;
    private static boolean U;
    private static boolean V;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static boolean W;
    public static int q;
    public static int r;
    public static int s;
    private static boolean X;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    private static boolean Y;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    private static String Z;
    private static String aa;
    public static boolean P;
    public static boolean Q;
    private static boolean ab;
    public static int R;
    public static int S;
    
    public static void a() {
        final ContextCapabilities capabilities = GLContext.getCapabilities();
        bqs.W = (capabilities.GL_ARB_multitexture && !capabilities.OpenGL13);
        bqs.X = (capabilities.GL_ARB_texture_env_combine && !capabilities.OpenGL13);
        if (bqs.W) {
            bqs.Z += "Using ARB_multitexture.\n";
            bqs.q = 33984;
            bqs.r = 33985;
            bqs.s = 33986;
        }
        else {
            bqs.Z += "Using GL 1.3 multitexturing.\n";
            bqs.q = 33984;
            bqs.r = 33985;
            bqs.s = 33986;
        }
        if (bqs.X) {
            bqs.Z += "Using ARB_texture_env_combine.\n";
            bqs.t = 34160;
            bqs.u = 34165;
            bqs.v = 34167;
            bqs.w = 34166;
            bqs.x = 34168;
            bqs.y = 34161;
            bqs.z = 34176;
            bqs.A = 34177;
            bqs.B = 34178;
            bqs.C = 34192;
            bqs.D = 34193;
            bqs.E = 34194;
            bqs.F = 34162;
            bqs.G = 34184;
            bqs.H = 34185;
            bqs.I = 34186;
            bqs.J = 34200;
            bqs.K = 34201;
            bqs.L = 34202;
        }
        else {
            bqs.Z += "Using GL 1.3 texture combiners.\n";
            bqs.t = 34160;
            bqs.u = 34165;
            bqs.v = 34167;
            bqs.w = 34166;
            bqs.x = 34168;
            bqs.y = 34161;
            bqs.z = 34176;
            bqs.A = 34177;
            bqs.B = 34178;
            bqs.C = 34192;
            bqs.D = 34193;
            bqs.E = 34194;
            bqs.F = 34162;
            bqs.G = 34184;
            bqs.H = 34185;
            bqs.I = 34186;
            bqs.J = 34200;
            bqs.K = 34201;
            bqs.L = 34202;
        }
        bqs.M = (capabilities.GL_EXT_blend_func_separate && !capabilities.OpenGL14);
        bqs.Y = (capabilities.OpenGL14 || capabilities.GL_EXT_blend_func_separate);
        bqs.l = (bqs.Y && (capabilities.GL_ARB_framebuffer_object || capabilities.GL_EXT_framebuffer_object || capabilities.OpenGL30));
        if (bqs.l) {
            bqs.Z += "Using framebuffer objects because ";
            if (capabilities.OpenGL30) {
                bqs.Z += "OpenGL 3.0 is supported and separate blending is supported.\n";
                bqs.T = 0;
                bqs.c = 36160;
                bqs.d = 36161;
                bqs.e = 36064;
                bqs.f = 36096;
                bqs.g = 36053;
                bqs.h = 36054;
                bqs.i = 36055;
                bqs.j = 36059;
                bqs.k = 36060;
            }
            else if (capabilities.GL_ARB_framebuffer_object) {
                bqs.Z += "ARB_framebuffer_object is supported and separate blending is supported.\n";
                bqs.T = 1;
                bqs.c = 36160;
                bqs.d = 36161;
                bqs.e = 36064;
                bqs.f = 36096;
                bqs.g = 36053;
                bqs.i = 36055;
                bqs.h = 36054;
                bqs.j = 36059;
                bqs.k = 36060;
            }
            else if (capabilities.GL_EXT_framebuffer_object) {
                bqs.Z += "EXT_framebuffer_object is supported.\n";
                bqs.T = 2;
                bqs.c = 36160;
                bqs.d = 36161;
                bqs.e = 36064;
                bqs.f = 36096;
                bqs.g = 36053;
                bqs.i = 36055;
                bqs.h = 36054;
                bqs.j = 36059;
                bqs.k = 36060;
            }
        }
        else {
            bqs.Z += "Not using framebuffer objects because ";
            bqs.Z = bqs.Z + "OpenGL 1.4 is " + (capabilities.OpenGL14 ? "" : "not ") + "supported, ";
            bqs.Z = bqs.Z + "EXT_blend_func_separate is " + (capabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            bqs.Z = bqs.Z + "OpenGL 3.0 is " + (capabilities.OpenGL30 ? "" : "not ") + "supported, ";
            bqs.Z = bqs.Z + "ARB_framebuffer_object is " + (capabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            bqs.Z = bqs.Z + "EXT_framebuffer_object is " + (capabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        bqs.N = capabilities.OpenGL21;
        bqs.U = (bqs.N || (capabilities.GL_ARB_vertex_shader && capabilities.GL_ARB_fragment_shader && capabilities.GL_ARB_shader_objects));
        bqs.Z = bqs.Z + "Shaders are " + (bqs.U ? "" : "not ") + "available because ";
        if (bqs.U) {
            if (capabilities.OpenGL21) {
                bqs.Z += "OpenGL 2.1 is supported.\n";
                bqs.V = false;
                bqs.m = 35714;
                bqs.n = 35713;
                bqs.o = 35633;
                bqs.p = 35632;
            }
            else {
                bqs.Z += "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                bqs.V = true;
                bqs.m = 35714;
                bqs.n = 35713;
                bqs.o = 35633;
                bqs.p = 35632;
            }
        }
        else {
            bqs.Z = bqs.Z + "OpenGL 2.1 is " + (capabilities.OpenGL21 ? "" : "not ") + "supported, ";
            bqs.Z = bqs.Z + "ARB_shader_objects is " + (capabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            bqs.Z = bqs.Z + "ARB_vertex_shader is " + (capabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            bqs.Z = bqs.Z + "ARB_fragment_shader is " + (capabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        bqs.O = (bqs.l && bqs.U);
        final String lowerCase = GL11.glGetString(7936).toLowerCase();
        bqs.a = lowerCase.contains("nvidia");
        bqs.ab = (!capabilities.OpenGL15 && capabilities.GL_ARB_vertex_buffer_object);
        bqs.P = (capabilities.OpenGL15 || bqs.ab);
        bqs.Z = bqs.Z + "VBOs are " + (bqs.P ? "" : "not ") + "available because ";
        if (bqs.P) {
            if (bqs.ab) {
                bqs.Z += "ARB_vertex_buffer_object is supported.\n";
                bqs.S = 35044;
                bqs.R = 34962;
            }
            else {
                bqs.Z += "OpenGL 1.5 is supported.\n";
                bqs.S = 35044;
                bqs.R = 34962;
            }
        }
        bqs.b = lowerCase.contains("ati");
        if (bqs.b) {
            if (bqs.P) {
                bqs.Q = true;
            }
            else {
                avh.a.f.a(16.0f);
            }
        }
        try {
            final Processor[] processors = new SystemInfo().getHardware().getProcessors();
            bqs.aa = String.format("%dx %s", processors.length, processors[0]).replaceAll("\\s+", " ");
        }
        catch (Throwable t) {}
    }
    
    public static boolean b() {
        return bqs.O;
    }
    
    public static String c() {
        return bqs.Z;
    }
    
    public static int a(final int \u2603, final int \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glGetObjectParameteriARB(\u2603, \u2603);
        }
        return GL20.glGetProgrami(\u2603, \u2603);
    }
    
    public static void b(final int \u2603, final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glAttachObjectARB(\u2603, \u2603);
        }
        else {
            GL20.glAttachShader(\u2603, \u2603);
        }
    }
    
    public static void a(final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glDeleteObjectARB(\u2603);
        }
        else {
            GL20.glDeleteShader(\u2603);
        }
    }
    
    public static int b(final int \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glCreateShaderObjectARB(\u2603);
        }
        return GL20.glCreateShader(\u2603);
    }
    
    public static void a(final int \u2603, final ByteBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glShaderSourceARB(\u2603, \u2603);
        }
        else {
            GL20.glShaderSource(\u2603, \u2603);
        }
    }
    
    public static void c(final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glCompileShaderARB(\u2603);
        }
        else {
            GL20.glCompileShader(\u2603);
        }
    }
    
    public static int c(final int \u2603, final int \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glGetObjectParameteriARB(\u2603, \u2603);
        }
        return GL20.glGetShaderi(\u2603, \u2603);
    }
    
    public static String d(final int \u2603, final int \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glGetInfoLogARB(\u2603, \u2603);
        }
        return GL20.glGetShaderInfoLog(\u2603, \u2603);
    }
    
    public static String e(final int \u2603, final int \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glGetInfoLogARB(\u2603, \u2603);
        }
        return GL20.glGetProgramInfoLog(\u2603, \u2603);
    }
    
    public static void d(final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUseProgramObjectARB(\u2603);
        }
        else {
            GL20.glUseProgram(\u2603);
        }
    }
    
    public static int d() {
        if (bqs.V) {
            return ARBShaderObjects.glCreateProgramObjectARB();
        }
        return GL20.glCreateProgram();
    }
    
    public static void e(final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glDeleteObjectARB(\u2603);
        }
        else {
            GL20.glDeleteProgram(\u2603);
        }
    }
    
    public static void f(final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glLinkProgramARB(\u2603);
        }
        else {
            GL20.glLinkProgram(\u2603);
        }
    }
    
    public static int a(final int \u2603, final CharSequence \u2603) {
        if (bqs.V) {
            return ARBShaderObjects.glGetUniformLocationARB(\u2603, \u2603);
        }
        return GL20.glGetUniformLocation(\u2603, \u2603);
    }
    
    public static void a(final int \u2603, final IntBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform1ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform1(\u2603, \u2603);
        }
    }
    
    public static void f(final int \u2603, final int \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform1iARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform1i(\u2603, \u2603);
        }
    }
    
    public static void a(final int \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform1ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform1(\u2603, \u2603);
        }
    }
    
    public static void b(final int \u2603, final IntBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform2ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform2(\u2603, \u2603);
        }
    }
    
    public static void b(final int \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform2ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform2(\u2603, \u2603);
        }
    }
    
    public static void c(final int \u2603, final IntBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform3ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform3(\u2603, \u2603);
        }
    }
    
    public static void c(final int \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform3ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform3(\u2603, \u2603);
        }
    }
    
    public static void d(final int \u2603, final IntBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform4ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform4(\u2603, \u2603);
        }
    }
    
    public static void d(final int \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniform4ARB(\u2603, \u2603);
        }
        else {
            GL20.glUniform4(\u2603, \u2603);
        }
    }
    
    public static void a(final int \u2603, final boolean \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniformMatrix2ARB(\u2603, \u2603, \u2603);
        }
        else {
            GL20.glUniformMatrix2(\u2603, \u2603, \u2603);
        }
    }
    
    public static void b(final int \u2603, final boolean \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniformMatrix3ARB(\u2603, \u2603, \u2603);
        }
        else {
            GL20.glUniformMatrix3(\u2603, \u2603, \u2603);
        }
    }
    
    public static void c(final int \u2603, final boolean \u2603, final FloatBuffer \u2603) {
        if (bqs.V) {
            ARBShaderObjects.glUniformMatrix4ARB(\u2603, \u2603, \u2603);
        }
        else {
            GL20.glUniformMatrix4(\u2603, \u2603, \u2603);
        }
    }
    
    public static int b(final int \u2603, final CharSequence \u2603) {
        if (bqs.V) {
            return ARBVertexShader.glGetAttribLocationARB(\u2603, \u2603);
        }
        return GL20.glGetAttribLocation(\u2603, \u2603);
    }
    
    public static int e() {
        if (bqs.ab) {
            return ARBBufferObject.glGenBuffersARB();
        }
        return GL15.glGenBuffers();
    }
    
    public static void g(final int \u2603, final int \u2603) {
        if (bqs.ab) {
            ARBBufferObject.glBindBufferARB(\u2603, \u2603);
        }
        else {
            GL15.glBindBuffer(\u2603, \u2603);
        }
    }
    
    public static void a(final int \u2603, final ByteBuffer \u2603, final int \u2603) {
        if (bqs.ab) {
            ARBBufferObject.glBufferDataARB(\u2603, \u2603, \u2603);
        }
        else {
            GL15.glBufferData(\u2603, \u2603, \u2603);
        }
    }
    
    public static void g(final int \u2603) {
        if (bqs.ab) {
            ARBBufferObject.glDeleteBuffersARB(\u2603);
        }
        else {
            GL15.glDeleteBuffers(\u2603);
        }
    }
    
    public static boolean f() {
        return bqs.P && ave.A().t.u;
    }
    
    public static void h(final int \u2603, final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glBindFramebuffer(\u2603, \u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindFramebuffer(\u2603, \u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindFramebufferEXT(\u2603, \u2603);
                break;
            }
        }
    }
    
    public static void i(final int \u2603, final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glBindRenderbuffer(\u2603, \u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindRenderbuffer(\u2603, \u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindRenderbufferEXT(\u2603, \u2603);
                break;
            }
        }
    }
    
    public static void h(final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glDeleteRenderbuffers(\u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteRenderbuffers(\u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT(\u2603);
                break;
            }
        }
    }
    
    public static void i(final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glDeleteFramebuffers(\u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteFramebuffers(\u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteFramebuffersEXT(\u2603);
                break;
            }
        }
    }
    
    public static int g() {
        if (!bqs.l) {
            return -1;
        }
        switch (bqs.T) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static int h() {
        if (!bqs.l) {
            return -1;
        }
        switch (bqs.T) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glRenderbufferStorage(\u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glRenderbufferStorage(\u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glRenderbufferStorageEXT(\u2603, \u2603, \u2603, \u2603);
                break;
            }
        }
    }
    
    public static void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glFramebufferRenderbuffer(\u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferRenderbuffer(\u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferRenderbufferEXT(\u2603, \u2603, \u2603, \u2603);
                break;
            }
        }
    }
    
    public static int j(final int \u2603) {
        if (!bqs.l) {
            return -1;
        }
        switch (bqs.T) {
            case 0: {
                return GL30.glCheckFramebufferStatus(\u2603);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus(\u2603);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT(\u2603);
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (!bqs.l) {
            return;
        }
        switch (bqs.T) {
            case 0: {
                GL30.glFramebufferTexture2D(\u2603, \u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferTexture2D(\u2603, \u2603, \u2603, \u2603, \u2603);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferTexture2DEXT(\u2603, \u2603, \u2603, \u2603, \u2603);
                break;
            }
        }
    }
    
    public static void k(final int \u2603) {
        if (bqs.W) {
            ARBMultitexture.glActiveTextureARB(\u2603);
        }
        else {
            GL13.glActiveTexture(\u2603);
        }
    }
    
    public static void l(final int \u2603) {
        if (bqs.W) {
            ARBMultitexture.glClientActiveTextureARB(\u2603);
        }
        else {
            GL13.glClientActiveTexture(\u2603);
        }
    }
    
    public static void a(final int \u2603, final float \u2603, final float \u2603) {
        if (bqs.W) {
            ARBMultitexture.glMultiTexCoord2fARB(\u2603, \u2603, \u2603);
        }
        else {
            GL13.glMultiTexCoord2f(\u2603, \u2603, \u2603);
        }
    }
    
    public static void c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (bqs.Y) {
            if (bqs.M) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT(\u2603, \u2603, \u2603, \u2603);
            }
            else {
                GL14.glBlendFuncSeparate(\u2603, \u2603, \u2603, \u2603);
            }
        }
        else {
            GL11.glBlendFunc(\u2603, \u2603);
        }
    }
    
    public static boolean i() {
        return bqs.l && ave.A().t.f;
    }
    
    public static String j() {
        return (bqs.aa == null) ? "<unknown>" : bqs.aa;
    }
    
    static {
        bqs.Z = "";
    }
}
