// 
// Decompiled by Procyon v0.5.36
// 

public class bid
{
    public float[][] a;
    public float[] b;
    public float[] c;
    public float[] d;
    
    public bid() {
        this.a = new float[6][4];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
    }
    
    private double a(final float[] \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return \u2603[0] * \u2603 + \u2603[1] * \u2603 + \u2603[2] * \u2603 + \u2603[3];
    }
    
    public boolean b(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        for (int i = 0; i < 6; ++i) {
            final float[] array = this.a[i];
            if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                    if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                        if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                            if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                                if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                                    if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                                        if (this.a(array, \u2603, \u2603, \u2603) <= 0.0) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
