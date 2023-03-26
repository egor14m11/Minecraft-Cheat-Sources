import com.google.common.collect.Maps;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Matrix4f;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public enum bor
{
    a(0, 0), 
    b(0, 90), 
    c(0, 180), 
    d(0, 270), 
    e(90, 0), 
    f(90, 90), 
    g(90, 180), 
    h(90, 270), 
    i(180, 0), 
    j(180, 90), 
    k(180, 180), 
    l(180, 270), 
    m(270, 0), 
    n(270, 90), 
    o(270, 180), 
    p(270, 270);
    
    private static final Map<Integer, bor> q;
    private final int r;
    private final Matrix4f s;
    private final int t;
    private final int u;
    
    private static int b(final int \u2603, final int \u2603) {
        return \u2603 * 360 + \u2603;
    }
    
    private bor(final int \u2603, final int \u2603) {
        this.r = b(\u2603, \u2603);
        this.s = new Matrix4f();
        final Matrix4f right = new Matrix4f();
        right.setIdentity();
        Matrix4f.rotate(-\u2603 * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), right, right);
        this.t = ns.a(\u2603 / 90);
        final Matrix4f left = new Matrix4f();
        left.setIdentity();
        Matrix4f.rotate(-\u2603 * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), left, left);
        this.u = ns.a(\u2603 / 90);
        Matrix4f.mul(left, right, this.s);
    }
    
    public Matrix4f a() {
        return this.s;
    }
    
    public cq a(final cq \u2603) {
        cq cq = \u2603;
        for (int i = 0; i < this.t; ++i) {
            cq = cq.a(cq.a.a);
        }
        if (cq.k() != cq.a.b) {
            for (int i = 0; i < this.u; ++i) {
                cq = cq.a(cq.a.b);
            }
        }
        return cq;
    }
    
    public int a(final cq \u2603, final int \u2603) {
        int n = \u2603;
        if (\u2603.k() == cq.a.a) {
            n = (n + this.t) % 4;
        }
        cq a = \u2603;
        for (int i = 0; i < this.t; ++i) {
            a = a.a(cq.a.a);
        }
        if (a.k() == cq.a.b) {
            n = (n + this.u) % 4;
        }
        return n;
    }
    
    public static bor a(final int \u2603, final int \u2603) {
        return bor.q.get(b(ns.b(\u2603, 360), ns.b(\u2603, 360)));
    }
    
    static {
        q = Maps.newHashMap();
        for (final bor bor : values()) {
            bor.q.put(bor.r, bor);
        }
    }
}
