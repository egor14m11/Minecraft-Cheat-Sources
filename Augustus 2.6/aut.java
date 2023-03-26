import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aut extends aus
{
    public aut(final String \u2603) {
        super(\u2603);
    }
    
    @Override
    public int a(final List<wn> \u2603) {
        float \u26032 = 0.0f;
        for (final wn wn : \u2603) {
            \u26032 += wn.bn() + wn.bN();
        }
        if (\u2603.size() > 0) {
            \u26032 /= \u2603.size();
        }
        return ns.f(\u26032);
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    @Override
    public auu.a c() {
        return auu.a.b;
    }
}
