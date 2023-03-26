import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class jc implements ff<jd>
{
    private int a;
    private String b;
    private int c;
    private el d;
    
    public jc() {
    }
    
    public jc(final int \u2603, final String \u2603, final int \u2603, final el \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.c(255);
        this.c = \u2603.readUnsignedShort();
        this.d = el.a(\u2603.e());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
        \u2603.writeShort(this.c);
        \u2603.b(this.d.a());
    }
    
    @Override
    public void a(final jd \u2603) {
        \u2603.a(this);
    }
    
    public el a() {
        return this.d;
    }
    
    public int b() {
        return this.a;
    }
}
