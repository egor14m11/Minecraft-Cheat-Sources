import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ge implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    
    public ge() {
    }
    
    public ge(final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readUnsignedByte();
        this.b = \u2603.readShort();
        this.c = \u2603.readShort();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeShort(this.b);
        \u2603.writeShort(this.c);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
}
