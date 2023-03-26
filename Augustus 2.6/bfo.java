import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfo
{
    private final Map<Integer, bov> a;
    private final Map<Integer, boq> b;
    private final Map<zw, bfp> c;
    private final bou d;
    
    public bfo(final bou \u2603) {
        this.a = (Map<Integer, bov>)Maps.newHashMap();
        this.b = (Map<Integer, boq>)Maps.newHashMap();
        this.c = (Map<zw, bfp>)Maps.newHashMap();
        this.d = \u2603;
    }
    
    public bmi a(final zw \u2603) {
        return this.a(\u2603, 0);
    }
    
    public bmi a(final zw \u2603, final int \u2603) {
        return this.a(new zx(\u2603, 1, \u2603)).e();
    }
    
    public boq a(final zx \u2603) {
        final zw b = \u2603.b();
        boq boq = this.b(b, this.b(\u2603));
        if (boq == null) {
            final bfp bfp = this.c.get(b);
            if (bfp != null) {
                boq = this.d.a(bfp.a(\u2603));
            }
        }
        if (boq == null) {
            boq = this.d.a();
        }
        return boq;
    }
    
    protected int b(final zx \u2603) {
        return \u2603.e() ? 0 : \u2603.i();
    }
    
    protected boq b(final zw \u2603, final int \u2603) {
        return this.b.get(this.c(\u2603, \u2603));
    }
    
    private int c(final zw \u2603, final int \u2603) {
        return zw.b(\u2603) << 16 | \u2603;
    }
    
    public void a(final zw \u2603, final int \u2603, final bov \u2603) {
        this.a.put(this.c(\u2603, \u2603), \u2603);
        this.b.put(this.c(\u2603, \u2603), this.d.a(\u2603));
    }
    
    public void a(final zw \u2603, final bfp \u2603) {
        this.c.put(\u2603, \u2603);
    }
    
    public bou a() {
        return this.d;
    }
    
    public void b() {
        this.b.clear();
        for (final Map.Entry<Integer, bov> entry : this.a.entrySet()) {
            this.b.put(entry.getKey(), this.d.a(entry.getValue()));
        }
    }
}
