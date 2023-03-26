import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aot
{
    private final boolean a;
    
    public aot() {
        this(false);
    }
    
    public aot(final boolean \u2603) {
        this.a = \u2603;
    }
    
    public abstract boolean b(final adm p0, final Random p1, final cj p2);
    
    public void e() {
    }
    
    protected void a(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.a) {
            \u2603.a(\u2603, \u2603, 3);
        }
        else {
            \u2603.a(\u2603, \u2603, 2);
        }
    }
}
