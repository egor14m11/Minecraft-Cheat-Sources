import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class gd implements ff<fj>
{
    private int a;
    private zx[] b;
    
    public gd() {
    }
    
    public gd(final int \u2603, final List<zx> \u2603) {
        this.a = \u2603;
        this.b = new zx[\u2603.size()];
        for (int i = 0; i < this.b.length; ++i) {
            final zx zx = \u2603.get(i);
            this.b[i] = ((zx == null) ? null : zx.k());
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readUnsignedByte();
        final int short1 = \u2603.readShort();
        this.b = new zx[short1];
        for (int i = 0; i < short1; ++i) {
            this.b[i] = \u2603.i();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeShort(this.b.length);
        for (final zx \u26032 : this.b) {
            \u2603.a(\u26032);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public zx[] b() {
        return this.b;
    }
}
