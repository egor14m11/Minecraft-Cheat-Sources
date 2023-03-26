import org.lwjgl.util.vector.Vector4f;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgo
{
    private static final float a;
    private static final float b;
    
    public bgg a(final Vector3f \u2603, final Vector3f \u2603, final bgi \u2603, final bmi \u2603, final cq \u2603, final bor \u2603, final bgj \u2603, final boolean \u2603, final boolean \u2603) {
        final int[] a = this.a(\u2603, \u2603, \u2603, this.a(\u2603, \u2603), \u2603, \u2603, \u2603, \u2603);
        final cq a2 = a(a);
        if (\u2603) {
            this.a(a, a2, \u2603.e, \u2603);
        }
        if (\u2603 == null) {
            this.a(a, a2);
        }
        return new bgg(a, \u2603.c, a2);
    }
    
    private int[] a(final bgi \u2603, final bmi \u2603, final cq \u2603, final float[] \u2603, final bor \u2603, final bgj \u2603, final boolean \u2603, final boolean \u2603) {
        final int[] \u26032 = new int[28];
        for (int i = 0; i < 4; ++i) {
            this.a(\u26032, i, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        return \u26032;
    }
    
    private int a(final cq \u2603) {
        final float b = this.b(\u2603);
        final int a = ns.a((int)(b * 255.0f), 0, 255);
        return 0xFF000000 | a << 16 | a << 8 | a;
    }
    
    private float b(final cq \u2603) {
        switch (bgo$1.a[\u2603.ordinal()]) {
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3:
            case 4: {
                return 0.8f;
            }
            case 5:
            case 6: {
                return 0.6f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    private float[] a(final Vector3f \u2603, final Vector3f \u2603) {
        final float[] array = new float[cq.values().length];
        array[bfj.a.f] = \u2603.x / 16.0f;
        array[bfj.a.e] = \u2603.y / 16.0f;
        array[bfj.a.d] = \u2603.z / 16.0f;
        array[bfj.a.c] = \u2603.x / 16.0f;
        array[bfj.a.b] = \u2603.y / 16.0f;
        array[bfj.a.a] = \u2603.z / 16.0f;
        return array;
    }
    
    private void a(final int[] \u2603, final int \u2603, final cq \u2603, final bgi \u2603, final float[] \u2603, final bmi \u2603, final bor \u2603, final bgj \u2603, final boolean \u2603, final boolean \u2603) {
        final cq a = \u2603.a(\u2603);
        final int \u26032 = \u2603 ? this.a(a) : -1;
        final bfj.b a2 = bfj.a(\u2603).a(\u2603);
        final Vector3f \u26033 = new Vector3f(\u2603[a2.a], \u2603[a2.b], \u2603[a2.c]);
        this.a(\u26033, \u2603);
        final int a3 = this.a(\u26033, \u2603, \u2603, \u2603, \u2603);
        this.a(\u2603, a3, \u2603, \u26033, \u26032, \u2603, \u2603.e);
    }
    
    private void a(final int[] \u2603, final int \u2603, final int \u2603, final Vector3f \u2603, final int \u2603, final bmi \u2603, final bgk \u2603) {
        final int n = \u2603 * 7;
        \u2603[n] = Float.floatToRawIntBits(\u2603.x);
        \u2603[n + 1] = Float.floatToRawIntBits(\u2603.y);
        \u2603[n + 2] = Float.floatToRawIntBits(\u2603.z);
        \u2603[n + 3] = \u2603;
        \u2603[n + 4] = Float.floatToRawIntBits(\u2603.a(\u2603.a(\u2603)));
        \u2603[n + 4 + 1] = Float.floatToRawIntBits(\u2603.b(\u2603.b(\u2603)));
    }
    
    private void a(final Vector3f \u2603, final bgj \u2603) {
        if (\u2603 == null) {
            return;
        }
        final Matrix4f a = this.a();
        final Vector3f \u26032 = new Vector3f(0.0f, 0.0f, 0.0f);
        switch (bgo$1.b[\u2603.b.ordinal()]) {
            case 1: {
                Matrix4f.rotate(\u2603.c * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), a, a);
                \u26032.set(0.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                Matrix4f.rotate(\u2603.c * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), a, a);
                \u26032.set(1.0f, 0.0f, 1.0f);
                break;
            }
            case 3: {
                Matrix4f.rotate(\u2603.c * 0.017453292f, new Vector3f(0.0f, 0.0f, 1.0f), a, a);
                \u26032.set(1.0f, 1.0f, 0.0f);
                break;
            }
        }
        if (\u2603.d) {
            if (Math.abs(\u2603.c) == 22.5f) {
                \u26032.scale(bgo.a);
            }
            else {
                \u26032.scale(bgo.b);
            }
            Vector3f.add(\u26032, new Vector3f(1.0f, 1.0f, 1.0f), \u26032);
        }
        else {
            \u26032.set(1.0f, 1.0f, 1.0f);
        }
        this.a(\u2603, new Vector3f(\u2603.a), a, \u26032);
    }
    
    public int a(final Vector3f \u2603, final cq \u2603, final int \u2603, final bor \u2603, final boolean \u2603) {
        if (\u2603 == bor.a) {
            return \u2603;
        }
        this.a(\u2603, new Vector3f(0.5f, 0.5f, 0.5f), \u2603.a(), new Vector3f(1.0f, 1.0f, 1.0f));
        return \u2603.a(\u2603, \u2603);
    }
    
    private void a(final Vector3f \u2603, final Vector3f \u2603, final Matrix4f \u2603, final Vector3f \u2603) {
        final Vector4f vector4f = new Vector4f(\u2603.x - \u2603.x, \u2603.y - \u2603.y, \u2603.z - \u2603.z, 1.0f);
        Matrix4f.transform(\u2603, vector4f, vector4f);
        final Vector4f vector4f2 = vector4f;
        vector4f2.x *= \u2603.x;
        final Vector4f vector4f3 = vector4f;
        vector4f3.y *= \u2603.y;
        final Vector4f vector4f4 = vector4f;
        vector4f4.z *= \u2603.z;
        \u2603.set(vector4f.x + \u2603.x, vector4f.y + \u2603.y, vector4f.z + \u2603.z);
    }
    
    private Matrix4f a() {
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }
    
    public static cq a(final int[] \u2603) {
        final Vector3f left = new Vector3f(Float.intBitsToFloat(\u2603[0]), Float.intBitsToFloat(\u2603[1]), Float.intBitsToFloat(\u2603[2]));
        final Vector3f vector3f = new Vector3f(Float.intBitsToFloat(\u2603[7]), Float.intBitsToFloat(\u2603[8]), Float.intBitsToFloat(\u2603[9]));
        final Vector3f left2 = new Vector3f(Float.intBitsToFloat(\u2603[14]), Float.intBitsToFloat(\u2603[15]), Float.intBitsToFloat(\u2603[16]));
        final Vector3f vector3f2 = new Vector3f();
        final Vector3f vector3f3 = new Vector3f();
        final Vector3f vector3f4 = new Vector3f();
        Vector3f.sub(left, vector3f, vector3f2);
        Vector3f.sub(left2, vector3f, vector3f3);
        Vector3f.cross(vector3f3, vector3f2, vector3f4);
        final float n = (float)Math.sqrt(vector3f4.x * vector3f4.x + vector3f4.y * vector3f4.y + vector3f4.z * vector3f4.z);
        final Vector3f vector3f5 = vector3f4;
        vector3f5.x /= n;
        final Vector3f vector3f6 = vector3f4;
        vector3f6.y /= n;
        final Vector3f vector3f7 = vector3f4;
        vector3f7.z /= n;
        cq cq = null;
        float n2 = 0.0f;
        for (final cq cq2 : cq.values()) {
            final df m = cq2.m();
            final Vector3f right = new Vector3f((float)m.n(), (float)m.o(), (float)m.p());
            final float dot = Vector3f.dot(vector3f4, right);
            if (dot >= 0.0f && dot > n2) {
                n2 = dot;
                cq = cq2;
            }
        }
        if (cq == null) {
            return cq.b;
        }
        return cq;
    }
    
    public void a(final int[] \u2603, final cq \u2603, final bgk \u2603, final bmi \u2603) {
        for (int i = 0; i < 4; ++i) {
            this.a(i, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    private void a(final int[] \u2603, final cq \u2603) {
        final int[] array = new int[\u2603.length];
        System.arraycopy(\u2603, 0, array, 0, \u2603.length);
        final float[] array2 = new float[cq.values().length];
        array2[bfj.a.f] = 999.0f;
        array2[bfj.a.e] = 999.0f;
        array2[bfj.a.d] = 999.0f;
        array2[bfj.a.c] = -999.0f;
        array2[bfj.a.b] = -999.0f;
        array2[bfj.a.a] = -999.0f;
        for (int i = 0; i < 4; ++i) {
            final int j = 7 * i;
            final float intBitsToFloat = Float.intBitsToFloat(array[j]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[j + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array[j + 2]);
            if (intBitsToFloat < array2[bfj.a.f]) {
                array2[bfj.a.f] = intBitsToFloat;
            }
            if (intBitsToFloat2 < array2[bfj.a.e]) {
                array2[bfj.a.e] = intBitsToFloat2;
            }
            if (intBitsToFloat3 < array2[bfj.a.d]) {
                array2[bfj.a.d] = intBitsToFloat3;
            }
            if (intBitsToFloat > array2[bfj.a.c]) {
                array2[bfj.a.c] = intBitsToFloat;
            }
            if (intBitsToFloat2 > array2[bfj.a.b]) {
                array2[bfj.a.b] = intBitsToFloat2;
            }
            if (intBitsToFloat3 > array2[bfj.a.a]) {
                array2[bfj.a.a] = intBitsToFloat3;
            }
        }
        final bfj a = bfj.a(\u2603);
        for (int j = 0; j < 4; ++j) {
            final int n = 7 * j;
            final bfj.b a2 = a.a(j);
            final float intBitsToFloat3 = array2[a2.a];
            final float \u26032 = array2[a2.b];
            final float \u26033 = array2[a2.c];
            \u2603[n] = Float.floatToRawIntBits(intBitsToFloat3);
            \u2603[n + 1] = Float.floatToRawIntBits(\u26032);
            \u2603[n + 2] = Float.floatToRawIntBits(\u26033);
            for (int k = 0; k < 4; ++k) {
                final int n2 = 7 * k;
                final float intBitsToFloat4 = Float.intBitsToFloat(array[n2]);
                final float intBitsToFloat5 = Float.intBitsToFloat(array[n2 + 1]);
                final float intBitsToFloat6 = Float.intBitsToFloat(array[n2 + 2]);
                if (ns.a(intBitsToFloat3, intBitsToFloat4) && ns.a(\u26032, intBitsToFloat5) && ns.a(\u26033, intBitsToFloat6)) {
                    \u2603[n + 4] = array[n2 + 4];
                    \u2603[n + 4 + 1] = array[n2 + 4 + 1];
                }
            }
        }
    }
    
    private void a(final int \u2603, final int[] \u2603, final cq \u2603, final bgk \u2603, final bmi \u2603) {
        final int n = 7 * \u2603;
        float intBitsToFloat = Float.intBitsToFloat(\u2603[n]);
        float intBitsToFloat2 = Float.intBitsToFloat(\u2603[n + 1]);
        float intBitsToFloat3 = Float.intBitsToFloat(\u2603[n + 2]);
        if (intBitsToFloat < -0.1f || intBitsToFloat >= 1.1f) {
            intBitsToFloat -= ns.d(intBitsToFloat);
        }
        if (intBitsToFloat2 < -0.1f || intBitsToFloat2 >= 1.1f) {
            intBitsToFloat2 -= ns.d(intBitsToFloat2);
        }
        if (intBitsToFloat3 < -0.1f || intBitsToFloat3 >= 1.1f) {
            intBitsToFloat3 -= ns.d(intBitsToFloat3);
        }
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (bgo$1.a[\u2603.ordinal()]) {
            case 1: {
                n2 = intBitsToFloat * 16.0f;
                n3 = (1.0f - intBitsToFloat3) * 16.0f;
                break;
            }
            case 2: {
                n2 = intBitsToFloat * 16.0f;
                n3 = intBitsToFloat3 * 16.0f;
                break;
            }
            case 3: {
                n2 = (1.0f - intBitsToFloat) * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 4: {
                n2 = intBitsToFloat * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 5: {
                n2 = intBitsToFloat3 * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 6: {
                n2 = (1.0f - intBitsToFloat3) * 16.0f;
                n3 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
        }
        final int n4 = \u2603.c(\u2603) * 7;
        \u2603[n4 + 4] = Float.floatToRawIntBits(\u2603.a(n2));
        \u2603[n4 + 4 + 1] = Float.floatToRawIntBits(\u2603.b(n3));
    }
    
    static {
        a = 1.0f / (float)Math.cos(0.39269909262657166) - 1.0f;
        b = 1.0f / (float)Math.cos(0.7853981852531433) - 1.0f;
    }
}
