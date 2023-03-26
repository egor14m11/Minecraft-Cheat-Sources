import org.lwjgl.util.vector.Matrix4f;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqq extends Matrix4f
{
    public bqq(final float[] \u2603) {
        this.m00 = \u2603[0];
        this.m01 = \u2603[1];
        this.m02 = \u2603[2];
        this.m03 = \u2603[3];
        this.m10 = \u2603[4];
        this.m11 = \u2603[5];
        this.m12 = \u2603[6];
        this.m13 = \u2603[7];
        this.m20 = \u2603[8];
        this.m21 = \u2603[9];
        this.m22 = \u2603[10];
        this.m23 = \u2603[11];
        this.m30 = \u2603[12];
        this.m31 = \u2603[13];
        this.m32 = \u2603[14];
        this.m33 = \u2603[15];
    }
    
    public bqq() {
        final float n = 0.0f;
        this.m33 = n;
        this.m32 = n;
        this.m31 = n;
        this.m30 = n;
        this.m23 = n;
        this.m22 = n;
        this.m21 = n;
        this.m20 = n;
        this.m13 = n;
        this.m12 = n;
        this.m11 = n;
        this.m10 = n;
        this.m03 = n;
        this.m02 = n;
        this.m01 = n;
        this.m00 = n;
    }
}
