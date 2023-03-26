import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zo extends zw
{
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.D) {
            final wt \u26032 = new wt(\u2603, \u2603.n() + \u2603, \u2603.o() + \u2603, \u2603.p() + \u2603, \u2603);
            \u2603.d(\u26032);
            if (!\u2603.bA.d) {
                --\u2603.b;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        if (!\u2603.n()) {
            return;
        }
        final dn m = \u2603.o().m("Fireworks");
        if (m == null) {
            return;
        }
        if (m.b("Flight", 99)) {
            \u2603.add(di.a("item.fireworks.flight") + " " + m.d("Flight"));
        }
        final du c = m.c("Explosions", 10);
        if (c != null && c.c() > 0) {
            for (int i = 0; i < c.c(); ++i) {
                final dn b = c.b(i);
                final List<String> arrayList = (List<String>)Lists.newArrayList();
                zn.a(b, arrayList);
                if (arrayList.size() > 0) {
                    for (int j = 1; j < arrayList.size(); ++j) {
                        arrayList.set(j, "  " + arrayList.get(j));
                    }
                    \u2603.addAll(arrayList);
                }
            }
        }
    }
}
