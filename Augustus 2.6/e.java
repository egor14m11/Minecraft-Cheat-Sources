// 
// Decompiled by Procyon v0.5.36
// 

public class e extends RuntimeException
{
    private final b a;
    
    public e(final b \u2603) {
        this.a = \u2603;
    }
    
    public b a() {
        return this.a;
    }
    
    @Override
    public Throwable getCause() {
        return this.a.b();
    }
    
    @Override
    public String getMessage() {
        return this.a.a();
    }
}
