import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class jj implements ff<jf>
{
    private eu a;
    
    public jj() {
    }
    
    public jj(final eu \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.d();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
    }
    
    @Override
    public void a(final jf \u2603) {
        \u2603.a(this);
    }
    
    public eu a() {
        return this.a;
    }
}
