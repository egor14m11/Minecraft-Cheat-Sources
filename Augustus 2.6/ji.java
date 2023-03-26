import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ji implements ff<jf>
{
    private int a;
    
    public ji() {
    }
    
    public ji(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
    }
    
    @Override
    public void a(final jf \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
}
