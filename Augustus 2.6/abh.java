import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class abh implements abs
{
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        zx zx = null;
        final List<zx> arrayList = (List<zx>)Lists.newArrayList();
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                if (a.b() instanceof yj) {
                    final yj yj = (yj)a.b();
                    if (yj.x_() != yj.a.a || zx != null) {
                        return false;
                    }
                    zx = a;
                }
                else {
                    if (a.b() != zy.aW) {
                        return false;
                    }
                    arrayList.add(a);
                }
            }
        }
        return zx != null && !arrayList.isEmpty();
    }
    
    @Override
    public zx a(final xp \u2603) {
        zx k = null;
        final int[] array = new int[3];
        int n = 0;
        int n2 = 0;
        yj yj = null;
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                if (a.b() instanceof yj) {
                    yj = (yj)a.b();
                    if (yj.x_() != yj.a.a || k != null) {
                        return null;
                    }
                    k = a.k();
                    k.b = 1;
                    if (yj.d_(a)) {
                        final int b = yj.b(k);
                        final float a2 = (b >> 16 & 0xFF) / 255.0f;
                        final float a3 = (b >> 8 & 0xFF) / 255.0f;
                        final float b2 = (b & 0xFF) / 255.0f;
                        n += (int)(Math.max(a2, Math.max(a3, b2)) * 255.0f);
                        final int[] array2 = array;
                        final int n3 = 0;
                        array2[n3] += (int)(a2 * 255.0f);
                        final int[] array3 = array;
                        final int n4 = 1;
                        array3[n4] += (int)(a3 * 255.0f);
                        final int[] array4 = array;
                        final int n5 = 2;
                        array4[n5] += (int)(b2 * 255.0f);
                        ++n2;
                    }
                }
                else {
                    if (a.b() != zy.aW) {
                        return null;
                    }
                    final float[] a4 = tv.a(zd.a(a.i()));
                    final int a5 = (int)(a4[0] * 255.0f);
                    final int a6 = (int)(a4[1] * 255.0f);
                    final int n6 = (int)(a4[2] * 255.0f);
                    n += Math.max(a5, Math.max(a6, n6));
                    final int[] array5 = array;
                    final int n7 = 0;
                    array5[n7] += a5;
                    final int[] array6 = array;
                    final int n8 = 1;
                    array6[n8] += a6;
                    final int[] array7 = array;
                    final int n9 = 2;
                    array7[n9] += n6;
                    ++n2;
                }
            }
        }
        if (yj == null) {
            return null;
        }
        int i = array[0] / n2;
        int a7 = array[1] / n2;
        int b = array[2] / n2;
        final float a2 = n / (float)n2;
        final float a3 = (float)Math.max(i, Math.max(a7, b));
        i = (int)(i * a2 / a3);
        a7 = (int)(a7 * a2 / a3);
        b = (int)(b * a2 / a3);
        int n6 = i;
        n6 = (n6 << 8) + a7;
        n6 = (n6 << 8) + b;
        yj.b(k, n6);
        return k;
    }
    
    @Override
    public int a() {
        return 10;
    }
    
    @Override
    public zx b() {
        return null;
    }
    
    @Override
    public zx[] b(final xp \u2603) {
        final zx[] array = new zx[\u2603.o_()];
        for (int i = 0; i < array.length; ++i) {
            final zx a = \u2603.a(i);
            if (a != null && a.b().r()) {
                array[i] = new zx(a.b().q());
            }
        }
        return array;
    }
}
