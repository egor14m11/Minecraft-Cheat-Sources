import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ig implements ff<ic>
{
    private a a;
    
    public ig() {
    }
    
    public ig(final a \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a(a.class);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public a a() {
        return this.a;
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
