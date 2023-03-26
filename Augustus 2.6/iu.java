import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class iu implements ff<ic>
{
    private String a;
    private a b;
    
    public iu() {
    }
    
    public iu(String \u2603, final a \u2603) {
        if (\u2603.length() > 40) {
            \u2603 = \u2603.substring(0, 40);
        }
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(40);
        this.b = \u2603.a(a.class);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d;
    }
}
