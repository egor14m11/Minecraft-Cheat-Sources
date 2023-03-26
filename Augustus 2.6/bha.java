import com.google.common.collect.Maps;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bha extends bhd<aku>
{
    private static final Map<String, a> c;
    private static final jy d;
    private bau e;
    
    public bha() {
        this.e = new bau();
    }
    
    @Override
    public void a(final aku \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final boolean b = \u2603.z() != null;
        final boolean b2 = !b || \u2603.w() == afi.cK;
        final int n = b ? \u2603.u() : 0;
        final long n2 = b ? \u2603.z().K() : 0L;
        bfl.E();
        final float \u26032 = 0.6666667f;
        if (b2) {
            bfl.b((float)\u2603 + 0.5f, (float)\u2603 + 0.75f * \u26032, (float)\u2603 + 0.5f);
            final float n3 = n * 360 / 16.0f;
            bfl.b(-n3, 0.0f, 1.0f, 0.0f);
            this.e.b.j = true;
        }
        else {
            final int n4 = n;
            float n5 = 0.0f;
            if (n4 == 2) {
                n5 = 180.0f;
            }
            if (n4 == 4) {
                n5 = 90.0f;
            }
            if (n4 == 5) {
                n5 = -90.0f;
            }
            bfl.b((float)\u2603 + 0.5f, (float)\u2603 - 0.25f * \u26032, (float)\u2603 + 0.5f);
            bfl.b(-n5, 0.0f, 1.0f, 0.0f);
            bfl.b(0.0f, -0.3125f, -0.4375f);
            this.e.b.j = false;
        }
        final cj v = \u2603.v();
        float n5 = v.n() * 7 + v.o() * 9 + v.p() * 13 + (float)n2 + \u2603;
        this.e.a.f = (-0.0125f + 0.01f * ns.b(n5 * 3.1415927f * 0.02f)) * 3.1415927f;
        bfl.B();
        final jy a = this.a(\u2603);
        if (a != null) {
            this.a(a);
            bfl.E();
            bfl.a(\u26032, -\u26032, -\u26032);
            this.e.a();
            bfl.F();
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.F();
    }
    
    private jy a(final aku \u2603) {
        final String g = \u2603.g();
        if (g.isEmpty()) {
            return null;
        }
        a a = bha.c.get(g);
        if (a == null) {
            if (bha.c.size() >= 256) {
                final long currentTimeMillis = System.currentTimeMillis();
                final Iterator<String> iterator = bha.c.keySet().iterator();
                while (iterator.hasNext()) {
                    final String s = iterator.next();
                    final a a2 = bha.c.get(s);
                    if (currentTimeMillis - a2.a > 60000L) {
                        ave.A().P().c(a2.b);
                        iterator.remove();
                    }
                }
                if (bha.c.size() >= 256) {
                    return null;
                }
            }
            final List<aku.a> c = \u2603.c();
            final List<zd> e = \u2603.e();
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            for (final aku.a a3 : c) {
                arrayList.add("textures/entity/banner/" + a3.a() + ".png");
            }
            a = new a();
            a.b = new jy(g);
            ave.A().P().a(a.b, new bmc(bha.d, arrayList, e));
            bha.c.put(g, a);
        }
        a.a = System.currentTimeMillis();
        return a.b;
    }
    
    static {
        c = Maps.newHashMap();
        d = new jy("textures/entity/banner_base.png");
    }
    
    static class a
    {
        public long a;
        public jy b;
        
        private a() {
        }
    }
}
