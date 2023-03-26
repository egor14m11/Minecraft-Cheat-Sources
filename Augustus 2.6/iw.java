import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class iw implements ff<ic>
{
    private int a;
    private zx b;
    
    public iw() {
    }
    
    public iw(final int \u2603, final zx \u2603) {
        this.a = \u2603;
        this.b = ((\u2603 != null) ? \u2603.k() : null);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readShort();
        this.b = \u2603.i();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeShort(this.a);
        \u2603.a(this.b);
    }
    
    public int a() {
        return this.a;
    }
    
    public zx b() {
        return this.b;
    }
}
