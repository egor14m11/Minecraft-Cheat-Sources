import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hl implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    
    public hl() {
    }
    
    public hl(final int \u2603, final pk \u2603, final pk \u2603) {
        this.a = \u2603;
        this.b = \u2603.F();
        this.c = ((\u2603 != null) ? \u2603.F() : -1);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.b = \u2603.readInt();
        this.c = \u2603.readInt();
        this.a = \u2603.readUnsignedByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeByte(this.a);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
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
