import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bon implements bnw
{
    private final boolean a;
    private final boolean b;
    private final List<Integer> c;
    
    public bon(final boolean \u2603, final boolean \u2603, final List<Integer> \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public List<Integer> c() {
        return Collections.unmodifiableList((List<? extends Integer>)this.c);
    }
}
