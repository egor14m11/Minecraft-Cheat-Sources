import java.util.Random;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public class oa
{
    public static int a(final Collection<? extends a> \u2603) {
        int n = 0;
        for (final a a : \u2603) {
            n += a.a;
        }
        return n;
    }
    
    public static <T extends a> T a(final Random \u2603, final Collection<T> \u2603, final int \u2603) {
        if (\u2603 <= 0) {
            throw new IllegalArgumentException();
        }
        final int nextInt = \u2603.nextInt(\u2603);
        return a(\u2603, nextInt);
    }
    
    public static <T extends a> T a(final Collection<T> \u2603, int \u2603) {
        for (final T t : \u2603) {
            \u2603 -= t.a;
            if (\u2603 < 0) {
                return t;
            }
        }
        return null;
    }
    
    public static <T extends a> T a(final Random \u2603, final Collection<T> \u2603) {
        return a(\u2603, \u2603, a(\u2603));
    }
    
    public static class a
    {
        protected int a;
        
        public a(final int \u2603) {
            this.a = \u2603;
        }
    }
}
