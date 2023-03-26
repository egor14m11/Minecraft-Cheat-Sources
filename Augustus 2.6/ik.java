import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ik implements ff<ic>
{
    private int a;
    private int b;
    private int c;
    private short d;
    private zx e;
    private int f;
    
    public ik() {
    }
    
    public ik(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final zx \u2603, final short \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.e = ((\u2603 != null) ? \u2603.k() : null);
        this.d = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
        this.b = \u2603.readShort();
        this.c = \u2603.readByte();
        this.d = \u2603.readShort();
        this.f = \u2603.readByte();
        this.e = \u2603.i();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeShort(this.b);
        \u2603.writeByte(this.c);
        \u2603.writeShort(this.d);
        \u2603.writeByte(this.f);
        \u2603.a(this.e);
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
    
    public short d() {
        return this.d;
    }
    
    public zx e() {
        return this.e;
    }
    
    public int f() {
        return this.f;
    }
}
