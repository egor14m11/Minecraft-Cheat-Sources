// 
// Decompiled by Procyon v0.5.36
// 

public enum acj
{
    a, 
    b, 
    c, 
    d, 
    e, 
    f, 
    g, 
    h, 
    i, 
    j, 
    k;
    
    public boolean a(final zw \u2603) {
        if (this == acj.a) {
            return true;
        }
        if (this == acj.j && \u2603.m()) {
            return true;
        }
        if (\u2603 instanceof yj) {
            if (this == acj.b) {
                return true;
            }
            final yj yj = (yj)\u2603;
            if (yj.b == 0) {
                return this == acj.f;
            }
            if (yj.b == 2) {
                return this == acj.d;
            }
            if (yj.b == 1) {
                return this == acj.e;
            }
            return yj.b == 3 && this == acj.c;
        }
        else {
            if (\u2603 instanceof aay) {
                return this == acj.g;
            }
            if (\u2603 instanceof za) {
                return this == acj.h;
            }
            if (\u2603 instanceof yt) {
                return this == acj.k;
            }
            return \u2603 instanceof zq && this == acj.i;
        }
    }
}
