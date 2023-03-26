import com.google.common.base.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class baj
{
    private final bag a;
    private final List<bah> b;
    private final int c;
    
    public baj(final bag \u2603, final List<bah> \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public bah a(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.b.size()) {
            return baf.a;
        }
        return (bah)Objects.firstNonNull((Object)this.b.get(\u2603), (Object)baf.a);
    }
    
    public int b() {
        return this.c;
    }
}
