import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpy implements bqb<bpw>
{
    private final List<bqb<bpw>> a;
    private final Random b;
    private final jy c;
    private final bpg d;
    private double e;
    private double f;
    
    public bpy(final jy \u2603, final double \u2603, final double \u2603, final bpg \u2603) {
        this.a = (List<bqb<bpw>>)Lists.newArrayList();
        this.b = new Random();
        this.c = \u2603;
        this.f = \u2603;
        this.e = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public int a() {
        int n = 0;
        for (final bqb<bpw> bqb : this.a) {
            n += bqb.a();
        }
        return n;
    }
    
    public bpw b() {
        final int a = this.a();
        if (this.a.isEmpty() || a == 0) {
            return bpz.a;
        }
        int nextInt = this.b.nextInt(a);
        for (final bqb<bpw> bqb : this.a) {
            nextInt -= bqb.a();
            if (nextInt < 0) {
                final bpw bpw = bqb.g();
                bpw.a(bpw.b() * this.e);
                bpw.b(bpw.c() * this.f);
                return bpw;
            }
        }
        return bpz.a;
    }
    
    public void a(final bqb<bpw> \u2603) {
        this.a.add(\u2603);
    }
    
    public jy c() {
        return this.c;
    }
    
    public bpg d() {
        return this.d;
    }
}
