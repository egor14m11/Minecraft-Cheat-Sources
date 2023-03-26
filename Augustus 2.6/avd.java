import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class avd
{
    public static synchronized int a(final int \u2603) {
        final int glGenLists = GL11.glGenLists(\u2603);
        if (glGenLists == 0) {
            final int glGetError = GL11.glGetError();
            String gluErrorString = "No error code reported";
            if (glGetError != 0) {
                gluErrorString = GLU.gluErrorString(glGetError);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + \u2603 + ", GL error (" + glGetError + "): " + gluErrorString);
        }
        return glGenLists;
    }
    
    public static synchronized void a(final int \u2603, final int \u2603) {
        GL11.glDeleteLists(\u2603, \u2603);
    }
    
    public static synchronized void b(final int \u2603) {
        GL11.glDeleteLists(\u2603, 1);
    }
    
    public static synchronized ByteBuffer c(final int \u2603) {
        return ByteBuffer.allocateDirect(\u2603).order(ByteOrder.nativeOrder());
    }
    
    public static IntBuffer f(final int \u2603) {
        return c(\u2603 << 2).asIntBuffer();
    }
    
    public static FloatBuffer h(final int \u2603) {
        return c(\u2603 << 2).asFloatBuffer();
    }
}
