import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fu implements ff<fj>
{
    private cj a;
    private int b;
    private int c;
    private afh d;
    
    public fu() {
    }
    
    public fu(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c();
        this.b = \u2603.readUnsignedByte();
        this.c = \u2603.readUnsignedByte();
        this.d = afh.c(\u2603.e() & 0xFFF);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte(this.b);
        \u2603.writeByte(this.c);
        \u2603.b(afh.a(this.d) & 0xFFF);
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
    
    public int c() {
        return this.c;
    }
    
    public afh d() {
        return this.d;
    }
}
