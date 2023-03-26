import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hd implements ff<fj>
{
    private String a;
    private String b;
    
    public hd() {
    }
    
    public hd(final String \u2603, final String \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        if (\u2603.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + \u2603.length() + ")");
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(32767);
        this.b = \u2603.c(40);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
}
