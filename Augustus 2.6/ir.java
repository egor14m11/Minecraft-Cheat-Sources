import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ir implements ff<ic>
{
    private cj a;
    private cq b;
    private a c;
    
    public ir() {
    }
    
    public ir(final a \u2603, final cj \u2603, final cq \u2603) {
        this.c = \u2603;
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.c = \u2603.a(a.class);
        this.a = \u2603.c();
        this.b = cq.a(\u2603.readUnsignedByte());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.c);
        \u2603.a(this.a);
        \u2603.writeByte(this.b.a());
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public cj a() {
        return this.a;
    }
    
    public cq b() {
        return this.b;
    }
    
    public a c() {
        return this.c;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f;
    }
}
