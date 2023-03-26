import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gm implements ff<fj>
{
    public static final String[] a;
    private int b;
    private float c;
    
    public gm() {
    }
    
    public gm(final int \u2603, final float \u2603) {
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.b = \u2603.readUnsignedByte();
        this.c = \u2603.readFloat();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.b);
        \u2603.writeFloat(this.c);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.b;
    }
    
    public float b() {
        return this.c;
    }
    
    static {
        a = new String[] { "tile.bed.notValid" };
    }
}
