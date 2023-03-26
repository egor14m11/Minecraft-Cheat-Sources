import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hi implements ff<fj>
{
    private int a;
    
    public hi() {
    }
    
    public hi(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
}
