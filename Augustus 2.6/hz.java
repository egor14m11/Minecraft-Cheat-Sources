import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hz implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    private int d;
    private byte e;
    private byte f;
    private boolean g;
    
    public hz() {
    }
    
    public hz(final pk \u2603) {
        this.a = \u2603.F();
        this.b = ns.c(\u2603.s * 32.0);
        this.c = ns.c(\u2603.t * 32.0);
        this.d = ns.c(\u2603.u * 32.0);
        this.e = (byte)(\u2603.y * 256.0f / 360.0f);
        this.f = (byte)(\u2603.z * 256.0f / 360.0f);
        this.g = \u2603.C;
    }
    
    public hz(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final byte \u2603, final byte \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readInt();
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
        this.e = \u2603.readByte();
        this.f = \u2603.readByte();
        this.g = \u2603.readBoolean();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeInt(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
        \u2603.writeByte(this.e);
        \u2603.writeByte(this.f);
        \u2603.writeBoolean(this.g);
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
    
    public int d() {
        return this.d;
    }
    
    public byte e() {
        return this.e;
    }
    
    public byte f() {
        return this.f;
    }
    
    public boolean g() {
        return this.g;
    }
}
