import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gx implements ff<fj>
{
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;
    
    public gx() {
    }
    
    public gx(final wl \u2603) {
        this.a(\u2603.a);
        this.b(\u2603.b);
        this.c(\u2603.c);
        this.d(\u2603.d);
        this.a(\u2603.a());
        this.b(\u2603.b());
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        final byte byte1 = \u2603.readByte();
        this.a((byte1 & 0x1) > 0);
        this.b((byte1 & 0x2) > 0);
        this.c((byte1 & 0x4) > 0);
        this.d((byte1 & 0x8) > 0);
        this.a(\u2603.readFloat());
        this.b(\u2603.readFloat());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        byte \u26032 = 0;
        if (this.a()) {
            \u26032 |= 0x1;
        }
        if (this.b()) {
            \u26032 |= 0x2;
        }
        if (this.c()) {
            \u26032 |= 0x4;
        }
        if (this.d()) {
            \u26032 |= 0x8;
        }
        \u2603.writeByte(\u26032);
        \u2603.writeFloat(this.e);
        \u2603.writeFloat(this.f);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public boolean a() {
        return this.a;
    }
    
    public void a(final boolean \u2603) {
        this.a = \u2603;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public void b(final boolean \u2603) {
        this.b = \u2603;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public void c(final boolean \u2603) {
        this.c = \u2603;
    }
    
    public boolean d() {
        return this.d;
    }
    
    public void d(final boolean \u2603) {
        this.d = \u2603;
    }
    
    public float e() {
        return this.e;
    }
    
    public void a(final float \u2603) {
        this.e = \u2603;
    }
    
    public float f() {
        return this.f;
    }
    
    public void b(final float \u2603) {
        this.f = \u2603;
    }
}
