import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gt implements ff<fj>
{
    private int a;
    private boolean b;
    private adp.a c;
    private int d;
    private oj e;
    private int f;
    private adr g;
    private boolean h;
    
    public gt() {
    }
    
    public gt(final int \u2603, final adp.a \u2603, final boolean \u2603, final int \u2603, final oj \u2603, final int \u2603, final adr \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.c = \u2603;
        this.f = \u2603;
        this.b = \u2603;
        this.g = \u2603;
        this.h = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readInt();
        int unsignedByte = \u2603.readUnsignedByte();
        this.b = ((unsignedByte & 0x8) == 0x8);
        unsignedByte &= 0xFFFFFFF7;
        this.c = adp.a.a(unsignedByte);
        this.d = \u2603.readByte();
        this.e = oj.a(\u2603.readUnsignedByte());
        this.f = \u2603.readUnsignedByte();
        this.g = adr.a(\u2603.c(16));
        if (this.g == null) {
            this.g = adr.b;
        }
        this.h = \u2603.readBoolean();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a);
        int a = this.c.a();
        if (this.b) {
            a |= 0x8;
        }
        \u2603.writeByte(a);
        \u2603.writeByte(this.d);
        \u2603.writeByte(this.e.a());
        \u2603.writeByte(this.f);
        \u2603.a(this.g.a());
        \u2603.writeBoolean(this.h);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public adp.a c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public oj e() {
        return this.e;
    }
    
    public int f() {
        return this.f;
    }
    
    public adr g() {
        return this.g;
    }
    
    public boolean h() {
        return this.h;
    }
}
