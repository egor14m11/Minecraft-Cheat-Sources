import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class asc
{
    private static int a;
    private static List<int[]> b;
    private static List<int[]> c;
    private static List<int[]> d;
    private static List<int[]> e;
    
    public static synchronized int[] a(final int \u2603) {
        if (\u2603 <= 256) {
            if (asc.b.isEmpty()) {
                final int[] array = new int[256];
                asc.c.add(array);
                return array;
            }
            final int[] array = asc.b.remove(asc.b.size() - 1);
            asc.c.add(array);
            return array;
        }
        else {
            if (\u2603 > asc.a) {
                asc.a = \u2603;
                asc.d.clear();
                asc.e.clear();
                final int[] array = new int[asc.a];
                asc.e.add(array);
                return array;
            }
            if (asc.d.isEmpty()) {
                final int[] array = new int[asc.a];
                asc.e.add(array);
                return array;
            }
            final int[] array = asc.d.remove(asc.d.size() - 1);
            asc.e.add(array);
            return array;
        }
    }
    
    public static synchronized void a() {
        if (!asc.d.isEmpty()) {
            asc.d.remove(asc.d.size() - 1);
        }
        if (!asc.b.isEmpty()) {
            asc.b.remove(asc.b.size() - 1);
        }
        asc.d.addAll(asc.e);
        asc.b.addAll(asc.c);
        asc.e.clear();
        asc.c.clear();
    }
    
    public static synchronized String b() {
        return "cache: " + asc.d.size() + ", tcache: " + asc.b.size() + ", allocated: " + asc.e.size() + ", tallocated: " + asc.c.size();
    }
    
    static {
        asc.a = 256;
        asc.b = (List<int[]>)Lists.newArrayList();
        asc.c = (List<int[]>)Lists.newArrayList();
        asc.d = (List<int[]>)Lists.newArrayList();
        asc.e = (List<int[]>)Lists.newArrayList();
    }
}
