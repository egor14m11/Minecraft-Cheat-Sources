import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fs implements ff<fj>
{
    private int a;
    private cj b;
    private int c;
    
    public fs() {
    }
    
    public fs(final int \u2603, final cj \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.c();
        this.c = \u2603.readUnsignedByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
        \u2603.writeByte(this.c);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public cj b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
}
