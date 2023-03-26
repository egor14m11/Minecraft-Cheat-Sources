import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ii implements ff<ic>
{
    private int a;
    private short b;
    private boolean c;
    
    public ii() {
    }
    
    public ii(final int \u2603, final short \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
        this.b = \u2603.readShort();
        this.c = (\u2603.readByte() != 0);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeShort(this.b);
        \u2603.writeByte(this.c ? 1 : 0);
    }
    
    public int a() {
        return this.a;
    }
    
    public short b() {
        return this.b;
    }
}
