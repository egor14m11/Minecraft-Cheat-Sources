import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class anu implements amv
{
    private static final List<alz> a;
    private static final int b;
    private static final int c;
    private final adm d;
    
    public anu(final adm \u2603) {
        this.d = \u2603;
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        final ans \u26032 = new ans();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int \u26033 = \u2603 * 16 + i;
                final int k = \u2603 * 16 + j;
                \u26032.a(i, 60, j, afi.cv.Q());
                final alz b = b(\u26033, k);
                if (b != null) {
                    \u26032.a(i, 70, j, b);
                }
            }
        }
        final amy amy = new amy(this.d, \u26032, \u2603, \u2603);
        amy.b();
        final ady[] b2 = this.d.v().b(null, \u2603 * 16, \u2603 * 16, 16, 16);
        int k;
        byte[] l;
        for (l = amy.k(), k = 0; k < l.length; ++k) {
            l[k] = (byte)b2[k].az;
        }
        amy.b();
        return amy;
    }
    
    public static alz b(int \u2603, int \u2603) {
        alz alz = null;
        if (\u2603 > 0 && \u2603 > 0 && \u2603 % 2 != 0 && \u2603 % 2 != 0) {
            \u2603 /= 2;
            \u2603 /= 2;
            if (\u2603 <= anu.b && \u2603 <= anu.c) {
                final int a = ns.a(\u2603 * anu.b + \u2603);
                if (a < anu.a.size()) {
                    alz = anu.a.get(a);
                }
            }
        }
        return alz;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public boolean a(final boolean \u2603, final nu \u2603) {
        return true;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public String f() {
        return "DebugLevelSource";
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        final ady b = this.d.b(\u2603);
        return b.a(\u2603);
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
    
    static {
        a = Lists.newArrayList();
        for (final afh afh : afh.c) {
            anu.a.addAll(afh.P().a());
        }
        b = ns.f(ns.c((float)anu.a.size()));
        c = ns.f(anu.a.size() / (float)anu.b);
    }
}
