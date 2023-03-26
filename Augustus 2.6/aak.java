import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class aak extends zw
{
    private static final Map<String, aak> b;
    public final String a;
    
    protected aak(final String \u2603) {
        this.a = \u2603;
        this.h = 1;
        this.a(yz.f);
        aak.b.put("records." + \u2603, this);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != afi.aN || p.b((amo<Boolean>)ahq.a)) {
            return false;
        }
        if (\u2603.D) {
            return true;
        }
        ((ahq)afi.aN).a(\u2603, \u2603, p, \u2603);
        \u2603.a(null, 1005, \u2603, zw.b(this));
        --\u2603.b;
        \u2603.b(na.X);
        return true;
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        \u2603.add(this.g());
    }
    
    public String g() {
        return di.a("item.record." + this.a + ".desc");
    }
    
    @Override
    public aaj g(final zx \u2603) {
        return aaj.c;
    }
    
    public static aak b(final String \u2603) {
        return aak.b.get(\u2603);
    }
    
    static {
        b = Maps.newHashMap();
    }
}
