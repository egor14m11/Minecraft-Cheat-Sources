import org.apache.logging.log4j.LogManager;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class blv
{
    private static final Logger a;
    private int b;
    private final int c;
    private final int d;
    private final IntBuffer e;
    private final FloatBuffer f;
    private final String g;
    private boolean h;
    private final blq i;
    
    public blv(final String \u2603, final int \u2603, final int \u2603, final blq \u2603) {
        this.g = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.i = \u2603;
        if (\u2603 <= 3) {
            this.e = BufferUtils.createIntBuffer(\u2603);
            this.f = null;
        }
        else {
            this.e = null;
            this.f = BufferUtils.createFloatBuffer(\u2603);
        }
        this.b = -1;
        this.h();
    }
    
    private void h() {
        this.h = true;
        if (this.i != null) {
            this.i.d();
        }
    }
    
    public static int a(final String \u2603) {
        int n = -1;
        if (\u2603.equals("int")) {
            n = 0;
        }
        else if (\u2603.equals("float")) {
            n = 4;
        }
        else if (\u2603.startsWith("matrix")) {
            if (\u2603.endsWith("2x2")) {
                n = 8;
            }
            else if (\u2603.endsWith("3x3")) {
                n = 9;
            }
            else if (\u2603.endsWith("4x4")) {
                n = 10;
            }
        }
        return n;
    }
    
    public void b(final int \u2603) {
        this.b = \u2603;
    }
    
    public String a() {
        return this.g;
    }
    
    public void a(final float \u2603) {
        this.f.position(0);
        this.f.put(0, \u2603);
        this.h();
    }
    
    public void a(final float \u2603, final float \u2603) {
        this.f.position(0);
        this.f.put(0, \u2603);
        this.f.put(1, \u2603);
        this.h();
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603) {
        this.f.position(0);
        this.f.put(0, \u2603);
        this.f.put(1, \u2603);
        this.f.put(2, \u2603);
        this.h();
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.f.position(0);
        this.f.put(\u2603);
        this.f.put(\u2603);
        this.f.put(\u2603);
        this.f.put(\u2603);
        this.f.flip();
        this.h();
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.f.position(0);
        if (this.d >= 4) {
            this.f.put(0, \u2603);
        }
        if (this.d >= 5) {
            this.f.put(1, \u2603);
        }
        if (this.d >= 6) {
            this.f.put(2, \u2603);
        }
        if (this.d >= 7) {
            this.f.put(3, \u2603);
        }
        this.h();
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.e.position(0);
        if (this.d >= 0) {
            this.e.put(0, \u2603);
        }
        if (this.d >= 1) {
            this.e.put(1, \u2603);
        }
        if (this.d >= 2) {
            this.e.put(2, \u2603);
        }
        if (this.d >= 3) {
            this.e.put(3, \u2603);
        }
        this.h();
    }
    
    public void a(final float[] \u2603) {
        if (\u2603.length < this.c) {
            blv.a.warn("Uniform.set called with a too-small value array (expected " + this.c + ", got " + \u2603.length + "). Ignoring.");
            return;
        }
        this.f.position(0);
        this.f.put(\u2603);
        this.f.position(0);
        this.h();
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.f.position(0);
        this.f.put(0, \u2603);
        this.f.put(1, \u2603);
        this.f.put(2, \u2603);
        this.f.put(3, \u2603);
        this.f.put(4, \u2603);
        this.f.put(5, \u2603);
        this.f.put(6, \u2603);
        this.f.put(7, \u2603);
        this.f.put(8, \u2603);
        this.f.put(9, \u2603);
        this.f.put(10, \u2603);
        this.f.put(11, \u2603);
        this.f.put(12, \u2603);
        this.f.put(13, \u2603);
        this.f.put(14, \u2603);
        this.f.put(15, \u2603);
        this.h();
    }
    
    public void a(final Matrix4f \u2603) {
        this.a(\u2603.m00, \u2603.m01, \u2603.m02, \u2603.m03, \u2603.m10, \u2603.m11, \u2603.m12, \u2603.m13, \u2603.m20, \u2603.m21, \u2603.m22, \u2603.m23, \u2603.m30, \u2603.m31, \u2603.m32, \u2603.m33);
    }
    
    public void b() {
        if (!this.h) {}
        this.h = false;
        if (this.d <= 3) {
            this.i();
        }
        else if (this.d <= 7) {
            this.j();
        }
        else {
            if (this.d > 10) {
                blv.a.warn("Uniform.upload called, but type value (" + this.d + ") is not " + "a valid type. Ignoring.");
                return;
            }
            this.k();
        }
    }
    
    private void i() {
        switch (this.d) {
            case 0: {
                bqs.a(this.b, this.e);
                break;
            }
            case 1: {
                bqs.b(this.b, this.e);
                break;
            }
            case 2: {
                bqs.c(this.b, this.e);
                break;
            }
            case 3: {
                bqs.d(this.b, this.e);
                break;
            }
            default: {
                blv.a.warn("Uniform.upload called, but count value (" + this.c + ") is " + " not in the range of 1 to 4. Ignoring.");
                break;
            }
        }
    }
    
    private void j() {
        switch (this.d) {
            case 4: {
                bqs.a(this.b, this.f);
                break;
            }
            case 5: {
                bqs.b(this.b, this.f);
                break;
            }
            case 6: {
                bqs.c(this.b, this.f);
                break;
            }
            case 7: {
                bqs.d(this.b, this.f);
                break;
            }
            default: {
                blv.a.warn("Uniform.upload called, but count value (" + this.c + ") is " + "not in the range of 1 to 4. Ignoring.");
                break;
            }
        }
    }
    
    private void k() {
        switch (this.d) {
            case 8: {
                bqs.a(this.b, true, this.f);
                break;
            }
            case 9: {
                bqs.b(this.b, true, this.f);
                break;
            }
            case 10: {
                bqs.c(this.b, true, this.f);
                break;
            }
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
