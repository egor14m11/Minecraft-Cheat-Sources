import java.io.IOException;
import java.security.PublicKey;

// 
// Decompiled by Procyon v0.5.36
// 

public class jh implements ff<jf>
{
    private String a;
    private PublicKey b;
    private byte[] c;
    
    public jh() {
    }
    
    public jh(final String \u2603, final PublicKey \u2603, final byte[] \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(20);
        this.b = ng.a(\u2603.a());
        this.c = \u2603.a();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.b.getEncoded());
        \u2603.a(this.c);
    }
    
    @Override
    public void a(final jf \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public PublicKey b() {
        return this.b;
    }
    
    public byte[] c() {
        return this.c;
    }
}
