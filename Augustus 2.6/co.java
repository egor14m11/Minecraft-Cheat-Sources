import org.apache.commons.lang3.Validate;

// 
// Decompiled by Procyon v0.5.36
// 

public class co<K, V> extends cx<K, V>
{
    private final K d;
    private V e;
    
    public co(final K \u2603) {
        this.d = \u2603;
    }
    
    @Override
    public void a(final int \u2603, final K \u2603, final V \u2603) {
        if (this.d.equals(\u2603)) {
            this.e = \u2603;
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void a() {
        Validate.notNull(this.d);
    }
    
    @Override
    public V a(final K \u2603) {
        final V a = super.a(\u2603);
        return (a == null) ? this.e : a;
    }
    
    @Override
    public V a(final int \u2603) {
        final V a = super.a(\u2603);
        return (a == null) ? this.e : a;
    }
}
