import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ib implements ff<fj>
{
    private int a;
    private byte b;
    private byte c;
    private int d;
    private byte e;
    
    public ib() {
    }
    
    public ib(final int \u2603, final pf \u2603) {
        this.a = \u2603;
        this.b = (byte)(\u2603.a() & 0xFF);
        this.c = (byte)(\u2603.c() & 0xFF);
        if (\u2603.b() > 32767) {
            this.d = 32767;
        }
        else {
            this.d = \u2603.b();
        }
        this.e = (byte)(\u2603.f() ? 1 : 0);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readByte();
        this.c = \u2603.readByte();
        this.d = \u2603.e();
        this.e = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.b);
        \u2603.writeByte(this.c);
        \u2603.b(this.d);
        \u2603.writeByte(this.e);
    }
    
    public boolean a() {
        return this.d == 32767;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int b() {
        return this.a;
    }
    
    public byte c() {
        return this.b;
    }
    
    public byte d() {
        return this.c;
    }
    
    public int e() {
        return this.d;
    }
    
    public boolean f() {
        return this.e != 0;
    }
}
