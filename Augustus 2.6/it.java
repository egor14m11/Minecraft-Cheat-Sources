import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class it implements ff<ic>
{
    private float a;
    private float b;
    private boolean c;
    private boolean d;
    
    public it() {
    }
    
    public it(final float \u2603, final float \u2603, final boolean \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readFloat();
        this.b = \u2603.readFloat();
        final byte byte1 = \u2603.readByte();
        this.c = ((byte1 & 0x1) > 0);
        this.d = ((byte1 & 0x2) > 0);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeFloat(this.a);
        \u2603.writeFloat(this.b);
        byte \u26032 = 0;
        if (this.c) {
            \u26032 |= 0x1;
        }
        if (this.d) {
            \u26032 |= 0x2;
        }
        \u2603.writeByte(\u26032);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public float a() {
        return this.a;
    }
    
    public float b() {
        return this.b;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public boolean d() {
        return this.d;
    }
}
