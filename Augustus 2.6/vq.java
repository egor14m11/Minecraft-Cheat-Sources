import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public interface vq extends pi
{
    public static final Predicate<pk> d = new Predicate<pk>() {
        public boolean a(final pk \u2603) {
            return \u2603 instanceof vq;
        }
    };
    public static final Predicate<pk> e = new Predicate<pk>() {
        public boolean a(final pk \u2603) {
            return \u2603 instanceof vq && !\u2603.ax();
        }
    };
}
