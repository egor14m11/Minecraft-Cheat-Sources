// 
// Decompiled by Procyon v0.5.36
// 

public class cp<K, V> extends dd<K, V>
{
    private final V a;
    
    public cp(final V \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public V a(final K \u2603) {
        final V a = super.a(\u2603);
        return (a == null) ? this.a : a;
    }
}
