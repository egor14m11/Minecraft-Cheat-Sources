import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ob extends oa.a
{
    private zx b;
    private int c;
    private int d;
    
    public ob(final zw \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603);
        this.b = new zx(\u2603, 1, \u2603);
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public ob(final zx \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603);
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public static void a(final Random \u2603, final List<ob> \u2603, final og \u2603, final int \u2603) {
        for (int i = 0; i < \u2603; ++i) {
            final ob ob = oa.a(\u2603, \u2603);
            final int b = ob.c + \u2603.nextInt(ob.d - ob.c + 1);
            if (ob.b.c() >= b) {
                final zx k = ob.b.k();
                k.b = b;
                \u2603.a(\u2603.nextInt(\u2603.o_()), k);
            }
            else {
                for (int j = 0; j < b; ++j) {
                    final zx l = ob.b.k();
                    l.b = 1;
                    \u2603.a(\u2603.nextInt(\u2603.o_()), l);
                }
            }
        }
    }
    
    public static void a(final Random \u2603, final List<ob> \u2603, final alc \u2603, final int \u2603) {
        for (int i = 0; i < \u2603; ++i) {
            final ob ob = oa.a(\u2603, \u2603);
            final int b = ob.c + \u2603.nextInt(ob.d - ob.c + 1);
            if (ob.b.c() >= b) {
                final zx k = ob.b.k();
                k.b = b;
                \u2603.a(\u2603.nextInt(\u2603.o_()), k);
            }
            else {
                for (int j = 0; j < b; ++j) {
                    final zx l = ob.b.k();
                    l.b = 1;
                    \u2603.a(\u2603.nextInt(\u2603.o_()), l);
                }
            }
        }
    }
    
    public static List<ob> a(final List<ob> \u2603, final ob... \u2603) {
        final List<ob> arrayList = (List<ob>)Lists.newArrayList((Iterable<?>)\u2603);
        Collections.addAll(arrayList, \u2603);
        return arrayList;
    }
}
