import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ie implements ff<ic>
{
    private String a;
    
    public ie() {
    }
    
    public ie(String \u2603) {
        if (\u2603.length() > 100) {
            \u2603 = \u2603.substring(0, 100);
        }
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(100);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
}
