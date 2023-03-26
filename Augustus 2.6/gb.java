import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gb implements ff<fj>
{
    private int a;
    
    public gb() {
    }
    
    public gb(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readUnsignedByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
    }
}
