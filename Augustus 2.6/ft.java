import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ft implements ff<fj>
{
    private cj a;
    private int b;
    private dn c;
    
    public ft() {
    }
    
    public ft(final cj \u2603, final int \u2603, final dn \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c();
        this.b = \u2603.readUnsignedByte();
        this.c = \u2603.h();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte((byte)this.b);
        \u2603.a(this.c);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public cj a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public dn c() {
        return this.c;
    }
}
