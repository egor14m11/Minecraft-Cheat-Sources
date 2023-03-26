import java.security.PrivateKey;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import javax.crypto.SecretKey;

// 
// Decompiled by Procyon v0.5.36
// 

public class jm implements ff<jk>
{
    private byte[] a;
    private byte[] b;
    
    public jm() {
        this.a = new byte[0];
        this.b = new byte[0];
    }
    
    public jm(final SecretKey \u2603, final PublicKey \u2603, final byte[] \u2603) {
        this.a = new byte[0];
        this.b = new byte[0];
        this.a = ng.a(\u2603, \u2603.getEncoded());
        this.b = ng.a(\u2603, \u2603);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a();
        this.b = \u2603.a();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final jk \u2603) {
        \u2603.a(this);
    }
    
    public SecretKey a(final PrivateKey \u2603) {
        return ng.a(\u2603, this.a);
    }
    
    public byte[] b(final PrivateKey \u2603) {
        if (\u2603 == null) {
            return this.b;
        }
        return ng.b(\u2603, this.b);
    }
}
