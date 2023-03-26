import io.netty.buffer.ByteBuf;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gg implements ff<fj>
{
    private String a;
    private em b;
    
    public gg() {
    }
    
    public gg(final String \u2603, final em \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        if (\u2603.writerIndex() > 1048576) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(20);
        final int readableBytes = \u2603.readableBytes();
        if (readableBytes < 0 || readableBytes > 1048576) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.b = new em(\u2603.readBytes(readableBytes));
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeBytes(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public em b() {
        return this.b;
    }
}
