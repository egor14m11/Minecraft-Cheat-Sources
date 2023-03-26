import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zn extends zw
{
    @Override
    public int a(final zx \u2603, final int \u2603) {
        if (\u2603 != 1) {
            return super.a(\u2603, \u2603);
        }
        final eb a = a(\u2603, "Colors");
        if (!(a instanceof ds)) {
            return 9079434;
        }
        final ds ds = (ds)a;
        final int[] c = ds.c();
        if (c.length == 1) {
            return c[0];
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (final int n4 : c) {
            n += (n4 & 0xFF0000) >> 16;
            n2 += (n4 & 0xFF00) >> 8;
            n3 += (n4 & 0xFF) >> 0;
        }
        n /= c.length;
        n2 /= c.length;
        n3 /= c.length;
        return n << 16 | n2 << 8 | n3;
    }
    
    public static eb a(final zx \u2603, final String \u2603) {
        if (\u2603.n()) {
            final dn m = \u2603.o().m("Explosion");
            if (m != null) {
                return m.a(\u2603);
            }
        }
        return null;
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        if (\u2603.n()) {
            final dn m = \u2603.o().m("Explosion");
            if (m != null) {
                a(m, \u2603);
            }
        }
    }
    
    public static void a(final dn \u2603, final List<String> \u2603) {
        final byte d = \u2603.d("Type");
        if (d >= 0 && d <= 4) {
            \u2603.add(di.a("item.fireworksCharge.type." + d).trim());
        }
        else {
            \u2603.add(di.a("item.fireworksCharge.type").trim());
        }
        final int[] l = \u2603.l("Colors");
        if (l.length > 0) {
            boolean b = true;
            String str = "";
            for (final int j : l) {
                if (!b) {
                    str += ", ";
                }
                b = false;
                boolean b2 = false;
                for (int k = 0; k < ze.a.length; ++k) {
                    if (j == ze.a[k]) {
                        b2 = true;
                        str += di.a("item.fireworksCharge." + zd.a(k).d());
                        break;
                    }
                }
                if (!b2) {
                    str += di.a("item.fireworksCharge.customColor");
                }
            }
            \u2603.add(str);
        }
        final int[] m = \u2603.l("FadeColors");
        if (m.length > 0) {
            boolean n = true;
            String str2 = di.a("item.fireworksCharge.fadeTo") + " ";
            for (final int n2 : m) {
                if (!n) {
                    str2 += ", ";
                }
                n = false;
                boolean b3 = false;
                for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                    if (n2 == ze.a[\u26032]) {
                        b3 = true;
                        str2 += di.a("item.fireworksCharge." + zd.a(\u26032).d());
                        break;
                    }
                }
                if (!b3) {
                    str2 += di.a("item.fireworksCharge.customColor");
                }
            }
            \u2603.add(str2);
        }
        boolean n = \u2603.n("Trail");
        if (n) {
            \u2603.add(di.a("item.fireworksCharge.trail"));
        }
        final boolean n3 = \u2603.n("Flicker");
        if (n3) {
            \u2603.add(di.a("item.fireworksCharge.flicker"));
        }
    }
}
