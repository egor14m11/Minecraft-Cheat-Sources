import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class nb
{
    protected final Map<mw, my> a;
    
    public nb() {
        this.a = (Map<mw, my>)Maps.newConcurrentMap();
    }
    
    public boolean a(final mq \u2603) {
        return this.a((mw)\u2603) > 0;
    }
    
    public boolean b(final mq \u2603) {
        return \u2603.c == null || this.a(\u2603.c);
    }
    
    public int c(final mq \u2603) {
        if (this.a(\u2603)) {
            return 0;
        }
        int n = 0;
        for (mq \u26032 = \u2603.c; \u26032 != null && !this.a(\u26032); \u26032 = \u26032.c, ++n) {}
        return n;
    }
    
    public void b(final wn \u2603, final mw \u2603, final int \u2603) {
        if (\u2603.d() && !this.b((mq)\u2603)) {
            return;
        }
        this.a(\u2603, \u2603, this.a(\u2603) + \u2603);
    }
    
    public void a(final wn \u2603, final mw \u2603, final int \u2603) {
        my my = this.a.get(\u2603);
        if (my == null) {
            my = new my();
            this.a.put(\u2603, my);
        }
        my.a(\u2603);
    }
    
    public int a(final mw \u2603) {
        final my my = this.a.get(\u2603);
        return (my == null) ? 0 : my.a();
    }
    
    public <T extends mz> T b(final mw \u2603) {
        final my my = this.a.get(\u2603);
        if (my != null) {
            return my.b();
        }
        return null;
    }
    
    public <T extends mz> T a(final mw \u2603, final T \u2603) {
        my my = this.a.get(\u2603);
        if (my == null) {
            my = new my();
            this.a.put(\u2603, my);
        }
        my.a(\u2603);
        return \u2603;
    }
}
