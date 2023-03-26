import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class fr implements ff<fj>
{
    private Map<mw, Integer> a;
    
    public fr() {
    }
    
    public fr(final Map<mw, Integer> \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        final int e = \u2603.e();
        this.a = (Map<mw, Integer>)Maps.newHashMap();
        for (int i = 0; i < e; ++i) {
            final mw a = na.a(\u2603.c(32767));
            final int e2 = \u2603.e();
            if (a != null) {
                this.a.put(a, e2);
            }
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a.size());
        for (final Map.Entry<mw, Integer> entry : this.a.entrySet()) {
            \u2603.a(entry.getKey().e);
            \u2603.b(entry.getValue());
        }
    }
    
    public Map<mw, Integer> a() {
        return this.a;
    }
}
